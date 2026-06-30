package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f171958a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f171959b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f171960c;

    /* renamed from: d, reason: collision with root package name */
    public int f171961d;

    /* renamed from: e, reason: collision with root package name */
    public int f171962e;

    /* renamed from: f, reason: collision with root package name */
    public int f171963f;

    /* renamed from: g, reason: collision with root package name */
    public int f171964g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f171965h;

    /* renamed from: j, reason: collision with root package name */
    public int f171967j;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171966i = true;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Random f171968k = new java.util.Random();

    public static long f(byte[] bArr, int i17, int i18) {
        int i19 = i18 > 4 ? i17 + 4 : i18 + i17;
        long j17 = 0;
        while (i17 < i19) {
            j17 = (j17 << 8) | (bArr[i17] & 255);
            i17++;
        }
        return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j17;
    }

    public final byte[] a(byte[] bArr, int i17) {
        try {
            long f17 = f(bArr, i17, 4);
            long f18 = f(bArr, i17 + 4, 4);
            long f19 = f(this.f171965h, 0, 4);
            long f27 = f(this.f171965h, 4, 4);
            long f28 = f(this.f171965h, 8, 4);
            long f29 = f(this.f171965h, 12, 4);
            int i18 = 16;
            long j17 = 3816266640L;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) f17);
                    dataOutputStream.writeInt((int) f18);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                f18 = (f18 - ((((f17 << 4) + f28) ^ (f17 + j17)) ^ ((f17 >>> 5) + f29))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                f17 = (f17 - ((((f18 << 4) + f19) ^ (f18 + j17)) ^ ((f18 >>> 5) + f27))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                j17 = (j17 - 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i18 = i19;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f171962e = 0;
        this.f171961d = 0;
        this.f171965h = bArr2;
        byte[] bArr3 = new byte[8];
        if (length % 8 != 0 || length < 16) {
            return null;
        }
        byte[] a17 = a(bArr, 0);
        this.f171959b = a17;
        if (a17 == null) {
            return null;
        }
        int i17 = a17[0] & 7;
        this.f171963f = i17;
        int i18 = (length - i17) - 10;
        if (i18 < 0) {
            return null;
        }
        for (int i19 = 0; i19 < 8; i19++) {
            bArr3[i19] = 0;
        }
        this.f171960c = new byte[i18];
        this.f171962e = 0;
        this.f171961d = 8;
        this.f171967j = 8;
        this.f171963f++;
        this.f171964g = 1;
        while (true) {
            int i27 = this.f171964g;
            if (i27 > 2) {
                int i28 = 0;
                while (i18 != 0) {
                    int i29 = this.f171963f;
                    if (i29 < 8) {
                        this.f171960c[i28] = (byte) (bArr3[(this.f171962e + 0) + i29] ^ this.f171959b[i29]);
                        i28++;
                        i18--;
                        this.f171963f = i29 + 1;
                    }
                    if (this.f171963f == 8) {
                        this.f171962e = this.f171961d - 8;
                        if (!c(bArr, 0, length)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.f171964g = 1;
                while (this.f171964g < 8) {
                    int i37 = this.f171963f;
                    if (i37 < 8) {
                        if ((bArr3[(this.f171962e + 0) + i37] ^ this.f171959b[i37]) != 0) {
                            return null;
                        }
                        this.f171963f = i37 + 1;
                    }
                    if (this.f171963f == 8) {
                        this.f171962e = this.f171961d;
                        if (!c(bArr, 0, length)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.f171964g++;
                }
                return this.f171960c;
            }
            int i38 = this.f171963f;
            if (i38 < 8) {
                this.f171963f = i38 + 1;
                this.f171964g = i27 + 1;
            }
            if (this.f171963f == 8) {
                if (!c(bArr, 0, length)) {
                    return null;
                }
                bArr3 = bArr;
            }
        }
    }

    public final boolean c(byte[] bArr, int i17, int i18) {
        this.f171963f = 0;
        while (true) {
            int i19 = this.f171963f;
            if (i19 >= 8) {
                byte[] a17 = a(this.f171959b, 0);
                this.f171959b = a17;
                if (a17 == null) {
                    return false;
                }
                this.f171967j += 8;
                this.f171961d += 8;
                this.f171963f = 0;
                return true;
            }
            if (this.f171967j + i19 >= i18) {
                return true;
            }
            byte[] bArr2 = this.f171959b;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[(this.f171961d + i17) + i19]);
            this.f171963f = i19 + 1;
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2) {
        int i17;
        int length = bArr.length;
        byte[] bArr3 = new byte[8];
        this.f171958a = bArr3;
        this.f171959b = new byte[8];
        this.f171963f = 1;
        this.f171964g = 0;
        this.f171962e = 0;
        this.f171961d = 0;
        this.f171965h = bArr2;
        this.f171966i = true;
        int i18 = (length + 10) % 8;
        this.f171963f = i18;
        if (i18 != 0) {
            this.f171963f = 8 - i18;
        }
        this.f171960c = new byte[this.f171963f + length + 10];
        java.util.Random random = this.f171968k;
        bArr3[0] = (byte) ((random.nextInt() & 248) | this.f171963f);
        int i19 = 1;
        while (true) {
            i17 = this.f171963f;
            if (i19 > i17) {
                break;
            }
            this.f171958a[i19] = (byte) (random.nextInt() & 255);
            i19++;
        }
        this.f171963f = i17 + 1;
        for (int i27 = 0; i27 < 8; i27++) {
            this.f171959b[i27] = 0;
        }
        this.f171964g = 1;
        while (this.f171964g <= 2) {
            int i28 = this.f171963f;
            if (i28 < 8) {
                byte[] bArr4 = this.f171958a;
                this.f171963f = i28 + 1;
                bArr4[i28] = (byte) (random.nextInt() & 255);
                this.f171964g++;
            }
            if (this.f171963f == 8) {
                e();
            }
        }
        int i29 = 0;
        while (length > 0) {
            int i37 = this.f171963f;
            if (i37 < 8) {
                byte[] bArr5 = this.f171958a;
                this.f171963f = i37 + 1;
                bArr5[i37] = bArr[i29];
                length--;
                i29++;
            }
            if (this.f171963f == 8) {
                e();
            }
        }
        this.f171964g = 1;
        while (true) {
            int i38 = this.f171964g;
            if (i38 > 7) {
                return this.f171960c;
            }
            int i39 = this.f171963f;
            if (i39 < 8) {
                byte[] bArr6 = this.f171958a;
                this.f171963f = i39 + 1;
                bArr6[i39] = 0;
                this.f171964g = i38 + 1;
            }
            if (this.f171963f == 8) {
                e();
            }
        }
    }

    public final void e() {
        byte[] bArr;
        this.f171963f = 0;
        while (true) {
            int i17 = this.f171963f;
            if (i17 >= 8) {
                break;
            }
            if (this.f171966i) {
                byte[] bArr2 = this.f171958a;
                bArr2[i17] = (byte) (bArr2[i17] ^ this.f171959b[i17]);
            } else {
                byte[] bArr3 = this.f171958a;
                bArr3[i17] = (byte) (bArr3[i17] ^ this.f171960c[this.f171962e + i17]);
            }
            this.f171963f = i17 + 1;
        }
        byte[] bArr4 = this.f171958a;
        try {
            long f17 = f(bArr4, 0, 4);
            long f18 = f(bArr4, 4, 4);
            long f19 = f(this.f171965h, 0, 4);
            long f27 = f(this.f171965h, 4, 4);
            long f28 = f(this.f171965h, 8, 4);
            long f29 = f(this.f171965h, 12, 4);
            int i18 = 16;
            long j17 = 0;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    break;
                }
                j17 = (j17 + 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                f17 = (f17 + ((((f18 << 4) + f19) ^ (f18 + j17)) ^ ((f18 >>> 5) + f27))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                f18 = (f18 + ((((f17 << 4) + f28) ^ (f17 + j17)) ^ ((f17 >>> 5) + f29))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i18 = i19;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt((int) f17);
            dataOutputStream.writeInt((int) f18);
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            bArr = null;
        }
        java.lang.System.arraycopy(bArr, 0, this.f171960c, this.f171961d, 8);
        this.f171963f = 0;
        while (true) {
            int i27 = this.f171963f;
            if (i27 >= 8) {
                java.lang.System.arraycopy(this.f171958a, 0, this.f171959b, 0, 8);
                int i28 = this.f171961d;
                this.f171962e = i28;
                this.f171961d = i28 + 8;
                this.f171963f = 0;
                this.f171966i = false;
                return;
            }
            byte[] bArr5 = this.f171960c;
            int i29 = this.f171961d + i27;
            bArr5[i29] = (byte) (bArr5[i29] ^ this.f171959b[i27]);
            this.f171963f = i27 + 1;
        }
    }
}
