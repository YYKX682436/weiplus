package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public final class DynamicInputStream {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f45820bs;
    private java.lang.String sServerEncoding = "GBK";

    public DynamicInputStream(java.nio.ByteBuffer byteBuffer) {
        this.f45820bs = byteBuffer;
    }

    private com.qq.taf.jce.dynamic.JceField readString(com.qq.taf.jce.JceInputStream.HeadData headData, int i17) {
        java.lang.String str;
        byte[] bArr = new byte[i17];
        this.f45820bs.get(bArr);
        try {
            str = new java.lang.String(bArr, this.sServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(bArr);
        }
        return com.qq.taf.jce.dynamic.JceField.create(str, headData.tag);
    }

    public com.qq.taf.jce.dynamic.JceField read() {
        try {
            com.qq.taf.jce.JceInputStream.HeadData headData = new com.qq.taf.jce.JceInputStream.HeadData();
            com.qq.taf.jce.JceInputStream.readHead(headData, this.f45820bs);
            int i17 = 0;
            switch (headData.type) {
                case 0:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.get(), headData.tag);
                case 1:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.getShort(), headData.tag);
                case 2:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.getInt(), headData.tag);
                case 3:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.getLong(), headData.tag);
                case 4:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.getFloat(), headData.tag);
                case 5:
                    return com.qq.taf.jce.dynamic.JceField.create(this.f45820bs.getDouble(), headData.tag);
                case 6:
                    int i18 = this.f45820bs.get();
                    if (i18 < 0) {
                        i18 += 256;
                    }
                    return readString(headData, i18);
                case 7:
                    return readString(headData, this.f45820bs.getInt());
                case 8:
                    int intValue = ((com.qq.taf.jce.dynamic.NumberField) read()).intValue();
                    com.qq.taf.jce.dynamic.JceField[] jceFieldArr = new com.qq.taf.jce.dynamic.JceField[intValue];
                    com.qq.taf.jce.dynamic.JceField[] jceFieldArr2 = new com.qq.taf.jce.dynamic.JceField[intValue];
                    while (i17 < intValue) {
                        jceFieldArr[i17] = read();
                        jceFieldArr2[i17] = read();
                        i17++;
                    }
                    return com.qq.taf.jce.dynamic.JceField.createMap(jceFieldArr, jceFieldArr2, headData.tag);
                case 9:
                    int intValue2 = ((com.qq.taf.jce.dynamic.NumberField) read()).intValue();
                    com.qq.taf.jce.dynamic.JceField[] jceFieldArr3 = new com.qq.taf.jce.dynamic.JceField[intValue2];
                    while (i17 < intValue2) {
                        jceFieldArr3[i17] = read();
                        i17++;
                    }
                    return com.qq.taf.jce.dynamic.JceField.createList(jceFieldArr3, headData.tag);
                case 10:
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (true) {
                        com.qq.taf.jce.dynamic.JceField read = read();
                        if (read == null) {
                            return com.qq.taf.jce.dynamic.JceField.createStruct((com.qq.taf.jce.dynamic.JceField[]) arrayList.toArray(new com.qq.taf.jce.dynamic.JceField[0]), headData.tag);
                        }
                        arrayList.add(read);
                    }
                case 11:
                default:
                    return null;
                case 12:
                    return com.qq.taf.jce.dynamic.JceField.createZero(headData.tag);
                case 13:
                    int i19 = headData.tag;
                    com.qq.taf.jce.JceInputStream.readHead(headData, this.f45820bs);
                    if (headData.type == 0) {
                        byte[] bArr = new byte[((com.qq.taf.jce.dynamic.NumberField) read()).intValue()];
                        this.f45820bs.get(bArr);
                        return com.qq.taf.jce.dynamic.JceField.create(bArr, i19);
                    }
                    throw new com.qq.taf.jce.JceDecodeException("type mismatch, simple_list only support byte, tag: " + i19 + ", type: " + ((int) headData.type));
            }
        } catch (java.nio.BufferUnderflowException unused) {
            return null;
        }
    }

    public int setServerEncoding(java.lang.String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public DynamicInputStream(byte[] bArr) {
        this.f45820bs = java.nio.ByteBuffer.wrap(bArr);
    }
}
