package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.Cryptor */
/* loaded from: classes13.dex */
public class C26776xa1a7bfb1 {

    /* renamed from: contextStart */
    protected int f56818x41e9d3f3;

    /* renamed from: crypt */
    protected int f56819x5a8bd6e;
    protected byte[] key;
    protected byte[] out;

    /* renamed from: padding */
    protected int f56821xcff03c11;

    /* renamed from: plain */
    protected byte[] f56822x65cd9ca;
    protected int pos;

    /* renamed from: preCrypt */
    protected int f56823xb149488b;

    /* renamed from: prePlain */
    protected byte[] f56824xb1fd64e7;

    /* renamed from: header */
    protected boolean f56820xb734e28d = true;

    /* renamed from: random */
    protected java.util.Random f56825xc812e4c3 = new java.util.Random();

    /* renamed from: decipher */
    private byte[] m105469x21b6cdcc(byte[] bArr, int i17) {
        try {
            long m105473x1e189f84 = m105473x1e189f84(bArr, i17, 4);
            long m105473x1e189f842 = m105473x1e189f84(bArr, i17 + 4, 4);
            long m105473x1e189f843 = m105473x1e189f84(this.key, 0, 4);
            long m105473x1e189f844 = m105473x1e189f84(this.key, 4, 4);
            long m105473x1e189f845 = m105473x1e189f84(this.key, 8, 4);
            long m105473x1e189f846 = m105473x1e189f84(this.key, 12, 4);
            int i18 = 16;
            long j17 = 3816266640L;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) m105473x1e189f84);
                    dataOutputStream.writeInt((int) m105473x1e189f842);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                m105473x1e189f842 = (m105473x1e189f842 - ((((m105473x1e189f84 << 4) + m105473x1e189f845) ^ (m105473x1e189f84 + j17)) ^ ((m105473x1e189f84 >>> 5) + m105473x1e189f846))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                m105473x1e189f84 = (m105473x1e189f84 - ((((m105473x1e189f842 << 4) + m105473x1e189f843) ^ (m105473x1e189f842 + j17)) ^ ((m105473x1e189f842 >>> 5) + m105473x1e189f844))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                j17 = (j17 - 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i18 = i19;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: decrypt8Bytes */
    private boolean m105470x74036ee0(byte[] bArr, int i17, int i18) {
        this.pos = 0;
        while (true) {
            int i19 = this.pos;
            if (i19 >= 8) {
                byte[] m105468x21b6cdcc = m105468x21b6cdcc(this.f56824xb1fd64e7);
                this.f56824xb1fd64e7 = m105468x21b6cdcc;
                if (m105468x21b6cdcc == null) {
                    return false;
                }
                this.f56818x41e9d3f3 += 8;
                this.f56819x5a8bd6e += 8;
                this.pos = 0;
                return true;
            }
            if (this.f56818x41e9d3f3 + i19 >= i18) {
                return true;
            }
            byte[] bArr2 = this.f56824xb1fd64e7;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[(this.f56819x5a8bd6e + i17) + i19]);
            this.pos = i19 + 1;
        }
    }

    /* renamed from: encipher */
    private byte[] m105471x65b00ff4(byte[] bArr) {
        try {
            long m105473x1e189f84 = m105473x1e189f84(bArr, 0, 4);
            long m105473x1e189f842 = m105473x1e189f84(bArr, 4, 4);
            long m105473x1e189f843 = m105473x1e189f84(this.key, 0, 4);
            long m105473x1e189f844 = m105473x1e189f84(this.key, 4, 4);
            long m105473x1e189f845 = m105473x1e189f84(this.key, 8, 4);
            long m105473x1e189f846 = m105473x1e189f84(this.key, 12, 4);
            int i17 = 16;
            long j17 = 0;
            while (true) {
                int i18 = i17 - 1;
                if (i17 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) m105473x1e189f84);
                    dataOutputStream.writeInt((int) m105473x1e189f842);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                j17 = (j17 + 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                m105473x1e189f84 = (m105473x1e189f84 + ((((m105473x1e189f842 << 4) + m105473x1e189f843) ^ (m105473x1e189f842 + j17)) ^ ((m105473x1e189f842 >>> 5) + m105473x1e189f844))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                m105473x1e189f842 = (m105473x1e189f842 + ((((m105473x1e189f84 << 4) + m105473x1e189f845) ^ (m105473x1e189f84 + j17)) ^ ((m105473x1e189f84 >>> 5) + m105473x1e189f846))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i17 = i18;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: encrypt8Bytes */
    private void m105472xa7c545b8() {
        this.pos = 0;
        while (true) {
            int i17 = this.pos;
            if (i17 >= 8) {
                break;
            }
            if (this.f56820xb734e28d) {
                byte[] bArr = this.f56822x65cd9ca;
                bArr[i17] = (byte) (bArr[i17] ^ this.f56824xb1fd64e7[i17]);
            } else {
                byte[] bArr2 = this.f56822x65cd9ca;
                bArr2[i17] = (byte) (bArr2[i17] ^ this.out[this.f56823xb149488b + i17]);
            }
            this.pos = i17 + 1;
        }
        java.lang.System.arraycopy(m105471x65b00ff4(this.f56822x65cd9ca), 0, this.out, this.f56819x5a8bd6e, 8);
        this.pos = 0;
        while (true) {
            int i18 = this.pos;
            if (i18 >= 8) {
                java.lang.System.arraycopy(this.f56822x65cd9ca, 0, this.f56824xb1fd64e7, 0, 8);
                int i19 = this.f56819x5a8bd6e;
                this.f56823xb149488b = i19;
                this.f56819x5a8bd6e = i19 + 8;
                this.pos = 0;
                this.f56820xb734e28d = false;
                return;
            }
            byte[] bArr3 = this.out;
            int i27 = this.f56819x5a8bd6e + i18;
            bArr3[i27] = (byte) (bArr3[i27] ^ this.f56824xb1fd64e7[i18]);
            this.pos = i18 + 1;
        }
    }

    /* renamed from: getUnsignedInt */
    private static long m105473x1e189f84(byte[] bArr, int i17, int i18) {
        int i19 = i18 > 8 ? i17 + 8 : i18 + i17;
        long j17 = 0;
        while (i17 < i19) {
            j17 = (j17 << 8) | (bArr[i17] & 255);
            i17++;
        }
        return (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j17) | (j17 >>> 32);
    }

    /* renamed from: rand */
    private int m105474x354c25() {
        return this.f56825xc812e4c3.nextInt();
    }

    /* renamed from: decrypt */
    public byte[] m105476x5bf1598d(byte[] bArr, byte[] bArr2) {
        return m105475x5bf1598d(bArr, 0, bArr.length, bArr2);
    }

    /* renamed from: encrypt */
    public byte[] m105478xa0333265(byte[] bArr, byte[] bArr2) {
        return m105477xa0333265(bArr, 0, bArr.length, bArr2);
    }

    /* renamed from: decrypt */
    public byte[] m105475x5bf1598d(byte[] bArr, int i17, int i18, byte[] bArr2) {
        int i19 = 0;
        this.f56823xb149488b = 0;
        this.f56819x5a8bd6e = 0;
        this.key = bArr2;
        int i27 = i17 + 8;
        byte[] bArr3 = new byte[i27];
        if (i18 % 8 != 0 || i18 < 16) {
            return null;
        }
        byte[] m105469x21b6cdcc = m105469x21b6cdcc(bArr, i17);
        this.f56824xb1fd64e7 = m105469x21b6cdcc;
        int i28 = m105469x21b6cdcc[0] & 7;
        this.pos = i28;
        int i29 = (i18 - i28) - 10;
        if (i29 < 0) {
            return null;
        }
        for (int i37 = i17; i37 < i27; i37++) {
            bArr3[i37] = 0;
        }
        this.out = new byte[i29];
        this.f56823xb149488b = 0;
        this.f56819x5a8bd6e = 8;
        this.f56818x41e9d3f3 = 8;
        this.pos++;
        this.f56821xcff03c11 = 1;
        while (true) {
            int i38 = this.f56821xcff03c11;
            if (i38 <= 2) {
                int i39 = this.pos;
                if (i39 < 8) {
                    this.pos = i39 + 1;
                    this.f56821xcff03c11 = i38 + 1;
                }
                if (this.pos == 8) {
                    if (!m105470x74036ee0(bArr, i17, i18)) {
                        return null;
                    }
                    bArr3 = bArr;
                }
            } else {
                while (i29 != 0) {
                    int i47 = this.pos;
                    if (i47 < 8) {
                        this.out[i19] = (byte) (bArr3[(this.f56823xb149488b + i17) + i47] ^ this.f56824xb1fd64e7[i47]);
                        i19++;
                        i29--;
                        this.pos = i47 + 1;
                    }
                    if (this.pos == 8) {
                        this.f56823xb149488b = this.f56819x5a8bd6e - 8;
                        if (!m105470x74036ee0(bArr, i17, i18)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.f56821xcff03c11 = 1;
                while (this.f56821xcff03c11 < 8) {
                    int i48 = this.pos;
                    if (i48 < 8) {
                        if ((bArr3[(this.f56823xb149488b + i17) + i48] ^ this.f56824xb1fd64e7[i48]) != 0) {
                            return null;
                        }
                        this.pos = i48 + 1;
                    }
                    if (this.pos == 8) {
                        this.f56823xb149488b = this.f56819x5a8bd6e;
                        if (!m105470x74036ee0(bArr, i17, i18)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.f56821xcff03c11++;
                }
                return this.out;
            }
        }
    }

    /* renamed from: encrypt */
    public byte[] m105477xa0333265(byte[] bArr, int i17, int i18, byte[] bArr2) {
        int i19;
        byte[] bArr3 = new byte[8];
        this.f56822x65cd9ca = bArr3;
        this.f56824xb1fd64e7 = new byte[8];
        this.pos = 1;
        this.f56821xcff03c11 = 0;
        this.f56823xb149488b = 0;
        this.f56819x5a8bd6e = 0;
        this.key = bArr2;
        this.f56820xb734e28d = true;
        int i27 = (i18 + 10) % 8;
        this.pos = i27;
        if (i27 != 0) {
            this.pos = 8 - i27;
        }
        this.out = new byte[this.pos + i18 + 10];
        bArr3[0] = (byte) ((m105474x354c25() & 248) | this.pos);
        int i28 = 1;
        while (true) {
            i19 = this.pos;
            if (i28 > i19) {
                break;
            }
            this.f56822x65cd9ca[i28] = (byte) (m105474x354c25() & 255);
            i28++;
        }
        this.pos = i19 + 1;
        for (int i29 = 0; i29 < 8; i29++) {
            this.f56824xb1fd64e7[i29] = 0;
        }
        this.f56821xcff03c11 = 1;
        while (this.f56821xcff03c11 <= 2) {
            int i37 = this.pos;
            if (i37 < 8) {
                byte[] bArr4 = this.f56822x65cd9ca;
                this.pos = i37 + 1;
                bArr4[i37] = (byte) (m105474x354c25() & 255);
                this.f56821xcff03c11++;
            }
            if (this.pos == 8) {
                m105472xa7c545b8();
            }
        }
        while (i18 > 0) {
            int i38 = this.pos;
            if (i38 < 8) {
                byte[] bArr5 = this.f56822x65cd9ca;
                this.pos = i38 + 1;
                bArr5[i38] = bArr[i17];
                i18--;
                i17++;
            }
            if (this.pos == 8) {
                m105472xa7c545b8();
            }
        }
        this.f56821xcff03c11 = 1;
        while (true) {
            int i39 = this.f56821xcff03c11;
            if (i39 <= 7) {
                int i47 = this.pos;
                if (i47 < 8) {
                    byte[] bArr6 = this.f56822x65cd9ca;
                    this.pos = i47 + 1;
                    bArr6[i47] = 0;
                    this.f56821xcff03c11 = i39 + 1;
                }
                if (this.pos == 8) {
                    m105472xa7c545b8();
                }
            } else {
                return this.out;
            }
        }
    }

    /* renamed from: decipher */
    private byte[] m105468x21b6cdcc(byte[] bArr) {
        return m105469x21b6cdcc(bArr, 0);
    }
}
