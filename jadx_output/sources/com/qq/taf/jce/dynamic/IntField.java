package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class IntField extends com.qq.taf.jce.dynamic.NumberField {
    private int data;

    public IntField(int i17, int i18) {
        super(i18);
        this.data = i17;
    }

    public int get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Integer.valueOf(this.data);
    }

    public void set(int i17) {
        this.data = i17;
    }
}
