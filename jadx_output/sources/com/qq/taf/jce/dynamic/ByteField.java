package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class ByteField extends com.qq.taf.jce.dynamic.NumberField {
    private byte data;

    public ByteField(byte b17, int i17) {
        super(i17);
        this.data = b17;
    }

    public byte get() {
        return this.data;
    }

    @Override // com.qq.taf.jce.dynamic.NumberField
    public java.lang.Number getNumber() {
        return java.lang.Byte.valueOf(this.data);
    }

    public void set(byte b17) {
        this.data = b17;
    }
}
