package com.qq.taf.jce.p308x7ea5603f;

/* renamed from: com.qq.taf.jce.dynamic.DynamicInputStream */
/* loaded from: classes13.dex */
public final class C2867x99e6ca4b {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f127353bs;

    /* renamed from: sServerEncoding */
    private java.lang.String f9773x91fd5509 = "GBK";

    public C2867x99e6ca4b(java.nio.ByteBuffer byteBuffer) {
        this.f127353bs = byteBuffer;
    }

    /* renamed from: readString */
    private com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21425xe22f9d47(com.qq.taf.jce.C2859xe10ac61e.HeadData headData, int i17) {
        java.lang.String str;
        byte[] bArr = new byte[i17];
        this.f127353bs.get(bArr);
        try {
            str = new java.lang.String(bArr, this.f9773x91fd5509);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(bArr);
        }
        return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21435xaf65a0fc(str, headData.tag);
    }

    /* renamed from: read */
    public com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21426x355996() {
        try {
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            com.qq.taf.jce.C2859xe10ac61e.m21289xcc44e096(headData, this.f127353bs);
            int i17 = 0;
            switch (headData.f9751x368f3a) {
                case 0:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21430xaf65a0fc(this.f127353bs.get(), headData.tag);
                case 1:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21436xaf65a0fc(this.f127353bs.getShort(), headData.tag);
                case 2:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21433xaf65a0fc(this.f127353bs.getInt(), headData.tag);
                case 3:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21434xaf65a0fc(this.f127353bs.getLong(), headData.tag);
                case 4:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21432xaf65a0fc(this.f127353bs.getFloat(), headData.tag);
                case 5:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21431xaf65a0fc(this.f127353bs.getDouble(), headData.tag);
                case 6:
                    int i18 = this.f127353bs.get();
                    if (i18 < 0) {
                        i18 += 256;
                    }
                    return m21425xe22f9d47(headData, i18);
                case 7:
                    return m21425xe22f9d47(headData, this.f127353bs.getInt());
                case 8:
                    int mo21454x2124a6c2 = ((com.qq.taf.jce.p308x7ea5603f.AbstractC2875x8dff2311) m21426x355996()).mo21454x2124a6c2();
                    com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr = new com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[mo21454x2124a6c2];
                    com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr2 = new com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[mo21454x2124a6c2];
                    while (i17 < mo21454x2124a6c2) {
                        c2871x2c850a2eArr[i17] = m21426x355996();
                        c2871x2c850a2eArr2[i17] = m21426x355996();
                        i17++;
                    }
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21439x23aa1ac0(c2871x2c850a2eArr, c2871x2c850a2eArr2, headData.tag);
                case 9:
                    int mo21454x2124a6c22 = ((com.qq.taf.jce.p308x7ea5603f.AbstractC2875x8dff2311) m21426x355996()).mo21454x2124a6c2();
                    com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr3 = new com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[mo21454x2124a6c22];
                    while (i17 < mo21454x2124a6c22) {
                        c2871x2c850a2eArr3[i17] = m21426x355996();
                        i17++;
                    }
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21438x5198e7ba(c2871x2c850a2eArr3, headData.tag);
                case 10:
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (true) {
                        com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21426x355996 = m21426x355996();
                        if (m21426x355996 == null) {
                            return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21440x5b8a6bf1((com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[]) arrayList.toArray(new com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[0]), headData.tag);
                        }
                        arrayList.add(m21426x355996);
                    }
                case 11:
                default:
                    return null;
                case 12:
                    return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21441x519f35c4(headData.tag);
                case 13:
                    int i19 = headData.tag;
                    com.qq.taf.jce.C2859xe10ac61e.m21289xcc44e096(headData, this.f127353bs);
                    if (headData.f9751x368f3a == 0) {
                        byte[] bArr = new byte[((com.qq.taf.jce.p308x7ea5603f.AbstractC2875x8dff2311) m21426x355996()).mo21454x2124a6c2()];
                        this.f127353bs.get(bArr);
                        return com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21437xaf65a0fc(bArr, i19);
                    }
                    throw new com.qq.taf.jce.C2856xe9f52235("type mismatch, simple_list only support byte, tag: " + i19 + ", type: " + ((int) headData.f9751x368f3a));
            }
        } catch (java.nio.BufferUnderflowException unused) {
            return null;
        }
    }

    /* renamed from: setServerEncoding */
    public int m21427x26b402b8(java.lang.String str) {
        this.f9773x91fd5509 = str;
        return 0;
    }

    public C2867x99e6ca4b(byte[] bArr) {
        this.f127353bs = java.nio.ByteBuffer.wrap(bArr);
    }
}
