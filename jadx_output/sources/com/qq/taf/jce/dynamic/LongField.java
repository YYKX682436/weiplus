package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class LongField extends com.qq.taf.jce.dynamic.NumberField {
    private long data;

    public LongField(long j17, int i17) {
        super(i17);
        this.data = j17;
    }

    public long get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Long.valueOf(this.data);
    }

    public void set(long j17) {
        this.data = j17;
    }
}
