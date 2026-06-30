package k36;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f385477a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f385478b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f385479c;

    /* renamed from: d, reason: collision with root package name */
    public int f385480d;

    /* renamed from: e, reason: collision with root package name */
    public int f385481e;

    /* renamed from: f, reason: collision with root package name */
    public int f385482f;

    /* renamed from: g, reason: collision with root package name */
    public int f385483g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f385484h;

    /* renamed from: j, reason: collision with root package name */
    public int f385486j;

    /* renamed from: i, reason: collision with root package name */
    public boolean f385485i = true;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Random f385487k = new java.util.Random();

    public static long d(byte[] bArr, int i17, int i18) {
        long j17 = 0;
        int i19 = i18 > 8 ? i17 + 8 : i18 + i17;
        while (i17 < i19) {
            j17 = (j17 << 8) | (bArr[i17] & 255);
            i17++;
        }
        return (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j17) | (j17 >>> 32);
    }

    public final byte[] a(byte[] bArr, int i17) {
        try {
            long d17 = d(bArr, i17, 4);
            long d18 = d(bArr, i17 + 4, 4);
            long d19 = d(this.f385484h, 0, 4);
            long d27 = d(this.f385484h, 4, 4);
            long d28 = d(this.f385484h, 8, 4);
            long d29 = d(this.f385484h, 12, 4);
            int i18 = 16;
            long j17 = 3816266640L;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) d17);
                    dataOutputStream.writeInt((int) d18);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                d18 = (d18 - ((((d17 << 4) + d28) ^ (d17 + j17)) ^ ((d17 >>> 5) + d29))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                d17 = (d17 - ((((d18 << 4) + d19) ^ (d18 + j17)) ^ ((d18 >>> 5) + d27))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                j17 = (j17 - 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i18 = i19;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public final boolean b(byte[] bArr, int i17, int i18) {
        this.f385482f = 0;
        while (true) {
            int i19 = this.f385482f;
            if (i19 >= 8) {
                byte[] a17 = a(this.f385478b, 0);
                this.f385478b = a17;
                if (a17 == null) {
                    return false;
                }
                this.f385486j += 8;
                this.f385480d += 8;
                this.f385482f = 0;
                return true;
            }
            if (this.f385486j + i19 >= i18) {
                return true;
            }
            byte[] bArr2 = this.f385478b;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[(this.f385480d + i17) + i19]);
            this.f385482f = i19 + 1;
        }
    }

    public final void c() {
        byte[] bArr;
        this.f385482f = 0;
        while (true) {
            int i17 = this.f385482f;
            if (i17 >= 8) {
                break;
            }
            if (this.f385485i) {
                byte[] bArr2 = this.f385477a;
                bArr2[i17] = (byte) (bArr2[i17] ^ this.f385478b[i17]);
            } else {
                byte[] bArr3 = this.f385477a;
                bArr3[i17] = (byte) (bArr3[i17] ^ this.f385479c[this.f385481e + i17]);
            }
            this.f385482f = i17 + 1;
        }
        byte[] bArr4 = this.f385477a;
        try {
            long d17 = d(bArr4, 0, 4);
            long d18 = d(bArr4, 4, 4);
            long d19 = d(this.f385484h, 0, 4);
            long d27 = d(this.f385484h, 4, 4);
            long d28 = d(this.f385484h, 8, 4);
            long d29 = d(this.f385484h, 12, 4);
            int i18 = 16;
            long j17 = 0;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    break;
                }
                j17 = (j17 + 2654435769L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                d17 = (d17 + ((((d18 << 4) + d19) ^ (d18 + j17)) ^ ((d18 >>> 5) + d27))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                d18 = (d18 + ((((d17 << 4) + d28) ^ (d17 + j17)) ^ ((d17 >>> 5) + d29))) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                i18 = i19;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt((int) d17);
            dataOutputStream.writeInt((int) d18);
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            bArr = null;
        }
        java.lang.System.arraycopy(bArr, 0, this.f385479c, this.f385480d, 8);
        this.f385482f = 0;
        while (true) {
            int i27 = this.f385482f;
            if (i27 >= 8) {
                java.lang.System.arraycopy(this.f385477a, 0, this.f385478b, 0, 8);
                int i28 = this.f385480d;
                this.f385481e = i28;
                this.f385480d = i28 + 8;
                this.f385482f = 0;
                this.f385485i = false;
                return;
            }
            byte[] bArr5 = this.f385479c;
            int i29 = this.f385480d + i27;
            bArr5[i29] = (byte) (bArr5[i29] ^ this.f385478b[i27]);
            this.f385482f = i27 + 1;
        }
    }
}
