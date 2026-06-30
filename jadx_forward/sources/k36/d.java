package k36;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f385488e = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final long[] f385489a = new long[4];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f385490b = new long[2];

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f385491c = new byte[64];

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f385492d = new byte[16];

    public d() {
        g();
    }

    public static byte[] k(byte[] bArr) {
        return new k36.d().f(bArr);
    }

    public final void a(byte[] bArr, long[] jArr, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19 += 4) {
            long j17 = jArr[i18];
            bArr[i19] = (byte) (j17 & 255);
            bArr[i19 + 1] = (byte) ((j17 >>> 8) & 255);
            bArr[i19 + 2] = (byte) ((j17 >>> 16) & 255);
            bArr[i19 + 3] = (byte) ((j17 >>> 24) & 255);
            i18++;
        }
    }

    public final long b(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int i17 = (int) (((j19 & j18) | ((~j18) & j27)) + j28 + j37 + j17);
        return ((i17 >>> ((int) (32 - j29))) | (i17 << ((int) j29))) + j18;
    }

    public final long c(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int i17 = (int) ((((~j27) & j19) | (j18 & j27)) + j28 + j37 + j17);
        return ((i17 >>> ((int) (32 - j29))) | (i17 << ((int) j29))) + j18;
    }

    public final long d(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int i17 = (int) (((j19 ^ j18) ^ j27) + j28 + j37 + j17);
        return ((i17 >>> ((int) (32 - j29))) | (i17 << ((int) j29))) + j18;
    }

    public final long e(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        int i17 = (int) ((j19 ^ ((~j27) | j18)) + j28 + j37 + j17);
        return ((i17 >>> ((int) (32 - j29))) | (i17 << ((int) j29))) + j18;
    }

    public byte[] f(byte[] bArr) {
        g();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        long length = bArr.length;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.f385490b;
        long j17 = jArr[0];
        int i17 = ((int) (j17 >>> 3)) & 63;
        long j18 = length << 3;
        long j19 = j17 + j18;
        jArr[0] = j19;
        if (j19 < j18) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (length >>> 29);
        int i18 = 64 - i17;
        if (length >= i18) {
            byte[] bArr3 = new byte[i18];
            try {
                byteArrayInputStream.read(bArr3, 0, i18);
                h(this.f385491c, bArr3, i17, 0, i18);
                i(this.f385491c);
                while (i18 + 63 < length) {
                    byteArrayInputStream.read(bArr2);
                    i(bArr2);
                    i18 += 64;
                }
                i17 = 0;
            } catch (java.lang.Exception unused) {
            }
        } else {
            i18 = 0;
        }
        int i19 = (int) (length - i18);
        byte[] bArr4 = new byte[i19];
        byteArrayInputStream.read(bArr4);
        h(this.f385491c, bArr4, i17, 0, i19);
        byte[] bArr5 = new byte[8];
        a(bArr5, jArr, 8);
        int i27 = ((int) (jArr[0] >>> 3)) & 63;
        j(f385488e, i27 < 56 ? 56 - i27 : 120 - i27);
        j(bArr5, 8);
        long[] jArr2 = this.f385489a;
        byte[] bArr6 = this.f385492d;
        a(bArr6, jArr2, 16);
        return bArr6;
    }

    public final void g() {
        long[] jArr = this.f385490b;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f385489a;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    public final void h(byte[] bArr, byte[] bArr2, int i17, int i18, int i19) {
        for (int i27 = 0; i27 < i19; i27++) {
            bArr[i17 + i27] = bArr2[i18 + i27];
        }
    }

    public final void i(byte[] bArr) {
        long[] jArr = this.f385489a;
        long j17 = jArr[0];
        long j18 = jArr[1];
        long j19 = jArr[2];
        long j27 = jArr[3];
        long[] jArr2 = new long[16];
        int i17 = 0;
        for (int i18 = 0; i18 < 64; i18 += 4) {
            int i19 = bArr[i18];
            if (i19 < 0) {
                i19 &= 255;
            }
            long j28 = i19;
            int i27 = bArr[i18 + 1];
            if (i27 < 0) {
                i27 &= 255;
            }
            long j29 = j28 | (i27 << 8);
            int i28 = bArr[i18 + 2];
            if (i28 < 0) {
                i28 &= 255;
            }
            long j37 = j29 | (i28 << 16);
            int i29 = bArr[i18 + 3];
            if (i29 < 0) {
                i29 &= 255;
            }
            jArr2[i17] = j37 | (i29 << 24);
            i17++;
        }
        long b17 = b(j17, j18, j19, j27, jArr2[0], 7L, 3614090360L);
        long b18 = b(j27, b17, j18, j19, jArr2[1], 12L, 3905402710L);
        long b19 = b(j19, b18, b17, j18, jArr2[2], 17L, 606105819L);
        long b27 = b(j18, b19, b18, b17, jArr2[3], 22L, 3250441966L);
        long b28 = b(b17, b27, b19, b18, jArr2[4], 7L, 4118548399L);
        long b29 = b(b18, b28, b27, b19, jArr2[5], 12L, 1200080426L);
        long b37 = b(b19, b29, b28, b27, jArr2[6], 17L, 2821735955L);
        long b38 = b(b27, b37, b29, b28, jArr2[7], 22L, 4249261313L);
        long b39 = b(b28, b38, b37, b29, jArr2[8], 7L, 1770035416L);
        long b47 = b(b29, b39, b38, b37, jArr2[9], 12L, 2336552879L);
        long b48 = b(b37, b47, b39, b38, jArr2[10], 17L, 4294925233L);
        long b49 = b(b38, b48, b47, b39, jArr2[11], 22L, 2304563134L);
        long b57 = b(b39, b49, b48, b47, jArr2[12], 7L, 1804603682L);
        long b58 = b(b47, b57, b49, b48, jArr2[13], 12L, 4254626195L);
        long b59 = b(b48, b58, b57, b49, jArr2[14], 17L, 2792965006L);
        long b67 = b(b49, b59, b58, b57, jArr2[15], 22L, 1236535329L);
        long c17 = c(b57, b67, b59, b58, jArr2[1], 5L, 4129170786L);
        long c18 = c(b58, c17, b67, b59, jArr2[6], 9L, 3225465664L);
        long c19 = c(b59, c18, c17, b67, jArr2[11], 14L, 643717713L);
        long c27 = c(b67, c19, c18, c17, jArr2[0], 20L, 3921069994L);
        long c28 = c(c17, c27, c19, c18, jArr2[5], 5L, 3593408605L);
        long c29 = c(c18, c28, c27, c19, jArr2[10], 9L, 38016083L);
        long c37 = c(c19, c29, c28, c27, jArr2[15], 14L, 3634488961L);
        long c38 = c(c27, c37, c29, c28, jArr2[4], 20L, 3889429448L);
        long c39 = c(c28, c38, c37, c29, jArr2[9], 5L, 568446438L);
        long c47 = c(c29, c39, c38, c37, jArr2[14], 9L, 3275163606L);
        long c48 = c(c37, c47, c39, c38, jArr2[3], 14L, 4107603335L);
        long c49 = c(c38, c48, c47, c39, jArr2[8], 20L, 1163531501L);
        long c57 = c(c39, c49, c48, c47, jArr2[13], 5L, 2850285829L);
        long c58 = c(c47, c57, c49, c48, jArr2[2], 9L, 4243563512L);
        long c59 = c(c48, c58, c57, c49, jArr2[7], 14L, 1735328473L);
        long c67 = c(c49, c59, c58, c57, jArr2[12], 20L, 2368359562L);
        long d17 = d(c57, c67, c59, c58, jArr2[5], 4L, 4294588738L);
        long d18 = d(c58, d17, c67, c59, jArr2[8], 11L, 2272392833L);
        long d19 = d(c59, d18, d17, c67, jArr2[11], 16L, 1839030562L);
        long d27 = d(c67, d19, d18, d17, jArr2[14], 23L, 4259657740L);
        long d28 = d(d17, d27, d19, d18, jArr2[1], 4L, 2763975236L);
        long d29 = d(d18, d28, d27, d19, jArr2[4], 11L, 1272893353L);
        long d37 = d(d19, d29, d28, d27, jArr2[7], 16L, 4139469664L);
        long d38 = d(d27, d37, d29, d28, jArr2[10], 23L, 3200236656L);
        long d39 = d(d28, d38, d37, d29, jArr2[13], 4L, 681279174L);
        long d47 = d(d29, d39, d38, d37, jArr2[0], 11L, 3936430074L);
        long d48 = d(d37, d47, d39, d38, jArr2[3], 16L, 3572445317L);
        long d49 = d(d38, d48, d47, d39, jArr2[6], 23L, 76029189L);
        long d57 = d(d39, d49, d48, d47, jArr2[9], 4L, 3654602809L);
        long d58 = d(d47, d57, d49, d48, jArr2[12], 11L, 3873151461L);
        long d59 = d(d48, d58, d57, d49, jArr2[15], 16L, 530742520L);
        long d66 = d(d49, d59, d58, d57, jArr2[2], 23L, 3299628645L);
        long e17 = e(d57, d66, d59, d58, jArr2[0], 6L, 4096336452L);
        long e18 = e(d58, e17, d66, d59, jArr2[7], 10L, 1126891415L);
        long e19 = e(d59, e18, e17, d66, jArr2[14], 15L, 2878612391L);
        long e27 = e(d66, e19, e18, e17, jArr2[5], 21L, 4237533241L);
        long e28 = e(e17, e27, e19, e18, jArr2[12], 6L, 1700485571L);
        long e29 = e(e18, e28, e27, e19, jArr2[3], 10L, 2399980690L);
        long e37 = e(e19, e29, e28, e27, jArr2[10], 15L, 4293915773L);
        long e38 = e(e27, e37, e29, e28, jArr2[1], 21L, 2240044497L);
        long e39 = e(e28, e38, e37, e29, jArr2[8], 6L, 1873313359L);
        long e47 = e(e29, e39, e38, e37, jArr2[15], 10L, 4264355552L);
        long e48 = e(e37, e47, e39, e38, jArr2[6], 15L, 2734768916L);
        long e49 = e(e38, e48, e47, e39, jArr2[13], 21L, 1309151649L);
        long e57 = e(e39, e49, e48, e47, jArr2[4], 6L, 4149444226L);
        long e58 = e(e47, e57, e49, e48, jArr2[11], 10L, 3174756917L);
        long e59 = e(e48, e58, e57, e49, jArr2[2], 15L, 718787259L);
        long e66 = e(e49, e59, e58, e57, jArr2[9], 21L, 3951481745L);
        jArr[0] = jArr[0] + e57;
        jArr[1] = jArr[1] + e66;
        jArr[2] = jArr[2] + e59;
        jArr[3] = jArr[3] + e58;
    }

    public final void j(byte[] bArr, int i17) {
        int i18;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.f385490b;
        long j17 = jArr[0];
        int i19 = ((int) (j17 >>> 3)) & 63;
        long j18 = i17 << 3;
        long j19 = j17 + j18;
        jArr[0] = j19;
        if (j19 < j18) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (i17 >>> 29);
        int i27 = 64 - i19;
        if (i17 >= i27) {
            h(this.f385491c, bArr, i19, 0, i27);
            i(this.f385491c);
            while (i27 + 63 < i17) {
                h(bArr2, bArr, 0, i27, 64);
                i(bArr2);
                i27 += 64;
            }
            i19 = 0;
            i18 = i27;
        } else {
            i18 = 0;
        }
        h(this.f385491c, bArr, i19, i18, i17 - i18);
    }
}
