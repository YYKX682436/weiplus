package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class ByteArrayField extends com.qq.taf.jce.dynamic.JceField {
    private byte[] data;

    public ByteArrayField(byte[] bArr, int i17) {
        super(i17);
        this.data = bArr;
    }

    public byte[] get() {
        return this.data;
    }

    public void set(byte[] bArr) {
        this.data = bArr;
    }
}
