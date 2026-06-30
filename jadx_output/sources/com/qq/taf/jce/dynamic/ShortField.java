package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class ShortField extends com.qq.taf.jce.dynamic.NumberField {
    private short data;

    public ShortField(short s17, int i17) {
        super(i17);
        this.data = s17;
    }

    public short get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Short.valueOf(this.data);
    }

    public void set(short s17) {
        this.data = s17;
    }
}
