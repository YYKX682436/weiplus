package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class TestMeasure {
    public static final java.lang.String TAG = "TestMeasure";
    public long valMeasure = 0;
    public long valLayout = 0;

    public void reset() {
        this.valMeasure = 0L;
        this.valLayout = 0L;
    }

    public java.lang.String result() {
        return java.lang.String.format("result valMeasure:%s valLayout:%s total:%s", java.lang.Long.valueOf(this.valMeasure), java.lang.Long.valueOf(this.valLayout), java.lang.Long.valueOf(this.valLayout + this.valMeasure));
    }
}
