package f36;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f340906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340907b;

    /* renamed from: c, reason: collision with root package name */
    public int f340908c;

    public a(byte[] bArr, int i17, int i18) {
        this.f340906a = bArr;
        this.f340908c = i17;
        this.f340907b = i17 + i18;
    }

    public static int a(int i17) {
        if ((i17 & (-128)) == 0) {
            return 1;
        }
        if ((i17 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i17) == 0) {
            return 3;
        }
        return (i17 & com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55823x6f7d4830) == 0 ? 4 : 5;
    }

    public static int b(long j17) {
        if (((-128) & j17) == 0) {
            return 1;
        }
        if (((-16384) & j17) == 0) {
            return 2;
        }
        if (((-2097152) & j17) == 0) {
            return 3;
        }
        if (((-268435456) & j17) == 0) {
            return 4;
        }
        if (((-34359738368L) & j17) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j17) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j17) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j17) == 0) {
            return 8;
        }
        return (j17 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int c(int i17) {
        return a((i17 << 3) | 0);
    }

    public final void d(int i17) {
        int i18 = this.f340908c;
        this.f340908c = i18 + 1;
        this.f340906a[i18] = (byte) i17;
    }

    public final void e(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        int i17 = this.f340908c;
        int i18 = this.f340907b;
        int i19 = i18 - i17;
        byte[] bArr2 = this.f340906a;
        if (i19 >= length) {
            java.lang.System.arraycopy(bArr, 0, bArr2, i17, length);
            this.f340908c += length;
            return;
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, i17, i19);
        int i27 = 0 + i19;
        int i28 = length - i19;
        this.f340908c = i18;
        if (i28 <= i18) {
            java.lang.System.arraycopy(bArr, i27, bArr2, 0, i28);
            this.f340908c = i28;
        }
    }

    public void f(long j17) {
        d(((int) j17) & 255);
        d(((int) (j17 >> 8)) & 255);
        d(((int) (j17 >> 16)) & 255);
        d(((int) (j17 >> 24)) & 255);
        d(((int) (j17 >> 32)) & 255);
        d(((int) (j17 >> 40)) & 255);
        d(((int) (j17 >> 48)) & 255);
        d(((int) (j17 >> 56)) & 255);
    }

    public void g(int i17) {
        while ((i17 & (-128)) != 0) {
            d((i17 & 127) | 128);
            i17 >>>= 7;
        }
        d(i17);
    }

    public void h(long j17) {
        while (((-128) & j17) != 0) {
            d((((int) j17) & 127) | 128);
            j17 >>>= 7;
        }
        d((int) j17);
    }

    public void i(int i17, int i18) {
        g((i17 << 3) | i18);
    }
}
