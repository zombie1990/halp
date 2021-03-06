package com.osten.halp.impl.statistics;

import com.osten.halp.api.model.statistics.DataPoint;

public class LongDataPoint implements DataPoint<Long> {
    private Long data;

    public LongDataPoint(Long l) {
        this.data = l;

    }

    public LongDataPoint(String s) throws NumberFormatException{
        try{
            this.data = Long.valueOf( s );
        }catch(NumberFormatException e){
            if( s.contains(".") ){
                this.data = Math.round( Double.valueOf( s ) );
            }else{
                throw e;
            }
        }

    }

    @Override
    public Long getValue() {
        return data;
    }

    @Override
    public void setData(Long data) {
        this.data = data;
    }
}