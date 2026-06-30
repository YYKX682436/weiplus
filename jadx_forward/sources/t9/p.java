package t9;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f498073a;

    /* renamed from: b, reason: collision with root package name */
    public int f498074b;

    /* renamed from: c, reason: collision with root package name */
    public int f498075c;

    public p(int i17) {
        this.f498073a = new byte[i17];
        this.f498075c = i17;
    }

    public int a() {
        byte[] bArr = this.f498073a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public void b(byte[] bArr, int i17, int i18) {
        java.lang.System.arraycopy(this.f498073a, this.f498074b, bArr, i17, i18);
        this.f498074b += i18;
    }

    public int c() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        int i18 = i17 + 1;
        int i19 = i18 + 1;
        int i27 = ((bArr[i17] & 255) << 24) | ((bArr[i18] & 255) << 16);
        int i28 = i19 + 1;
        int i29 = i27 | ((bArr[i19] & 255) << 8);
        this.f498074b = i28 + 1;
        return (bArr[i28] & 255) | i29;
    }

    public java.lang.String d() {
        int i17 = this.f498075c;
        int i18 = this.f498074b;
        if (i17 - i18 == 0) {
            return null;
        }
        while (i18 < this.f498075c) {
            byte b17 = this.f498073a[i18];
            int i19 = t9.d0.f498031a;
            if (b17 == 10 || b17 == 13) {
                break;
            }
            i18++;
        }
        int i27 = this.f498074b;
        if (i18 - i27 >= 3) {
            byte[] bArr = this.f498073a;
            if (bArr[i27] == -17 && bArr[i27 + 1] == -69 && bArr[i27 + 2] == -65) {
                this.f498074b = i27 + 3;
            }
        }
        byte[] bArr2 = this.f498073a;
        int i28 = this.f498074b;
        java.lang.String str = new java.lang.String(bArr2, i28, i18 - i28);
        this.f498074b = i18;
        int i29 = this.f498075c;
        if (i18 == i29) {
            return str;
        }
        byte[] bArr3 = this.f498073a;
        if (bArr3[i18] == 13) {
            int i37 = i18 + 1;
            this.f498074b = i37;
            if (i37 == i29) {
                return str;
            }
        }
        int i38 = this.f498074b;
        if (bArr3[i38] == 10) {
            this.f498074b = i38 + 1;
        }
        return str;
    }

    public int e() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        int i18 = i17 + 1;
        int i19 = i18 + 1;
        int i27 = (bArr[i17] & 255) | ((bArr[i18] & 255) << 8);
        int i28 = i19 + 1;
        int i29 = i27 | ((bArr[i19] & 255) << 16);
        this.f498074b = i28 + 1;
        return ((bArr[i28] & 255) << 24) | i29;
    }

    public long f() {
        byte[] bArr = this.f498073a;
        long j17 = bArr[r1] & 255;
        int i17 = this.f498074b + 1 + 1 + 1;
        long j18 = j17 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f498074b = i17 + 1;
        return j18 | ((bArr[i17] & 255) << 24);
    }

    public int g() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        int i18 = i17 + 1;
        int i19 = bArr[i17] & 255;
        this.f498074b = i18 + 1;
        return ((bArr[i18] & 255) << 8) | i19;
    }

    public long h() {
        byte[] bArr = this.f498073a;
        long j17 = (bArr[r1] & 255) << 56;
        int i17 = this.f498074b + 1 + 1 + 1;
        long j18 = j17 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j19 = j18 | ((bArr[i17] & 255) << 32);
        long j27 = j19 | ((bArr[r3] & 255) << 24);
        long j28 = j27 | ((bArr[r4] & 255) << 16);
        long j29 = j28 | ((bArr[r3] & 255) << 8);
        this.f498074b = i17 + 1 + 1 + 1 + 1 + 1;
        return j29 | (bArr[r4] & 255);
    }

    public java.lang.String i() {
        int i17 = this.f498075c;
        int i18 = this.f498074b;
        if (i17 - i18 == 0) {
            return null;
        }
        while (i18 < this.f498075c && this.f498073a[i18] != 0) {
            i18++;
        }
        byte[] bArr = this.f498073a;
        int i19 = this.f498074b;
        java.lang.String str = new java.lang.String(bArr, i19, i18 - i19);
        this.f498074b = i18;
        if (i18 < this.f498075c) {
            this.f498074b = i18 + 1;
        }
        return str;
    }

    public java.lang.String j(int i17) {
        if (i17 == 0) {
            return "";
        }
        int i18 = this.f498074b;
        int i19 = (i18 + i17) - 1;
        java.lang.String str = new java.lang.String(this.f498073a, i18, (i19 >= this.f498075c || this.f498073a[i19] != 0) ? i17 : i17 - 1);
        this.f498074b += i17;
        return str;
    }

    public java.lang.String k(int i17) {
        java.lang.String str = new java.lang.String(this.f498073a, this.f498074b, i17, java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        this.f498074b += i17;
        return str;
    }

    public int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public int m() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        this.f498074b = i17 + 1;
        return bArr[i17] & 255;
    }

    public long n() {
        byte[] bArr = this.f498073a;
        long j17 = (bArr[r1] & 255) << 24;
        int i17 = this.f498074b + 1 + 1 + 1;
        long j18 = j17 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f498074b = i17 + 1;
        return j18 | (bArr[i17] & 255);
    }

    public int o() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        int i18 = i17 + 1;
        int i19 = i18 + 1;
        int i27 = ((bArr[i17] & 255) << 16) | ((bArr[i18] & 255) << 8);
        this.f498074b = i19 + 1;
        return (bArr[i19] & 255) | i27;
    }

    public int p() {
        int c17 = c();
        if (c17 >= 0) {
            return c17;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + c17);
    }

    public long q() {
        long h17 = h();
        if (h17 >= 0) {
            return h17;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + h17);
    }

    public int r() {
        byte[] bArr = this.f498073a;
        int i17 = this.f498074b;
        int i18 = i17 + 1;
        int i19 = (bArr[i17] & 255) << 8;
        this.f498074b = i18 + 1;
        return (bArr[i18] & 255) | i19;
    }

    public void s() {
        this.f498074b = 0;
        this.f498075c = 0;
    }

    public void t(int i17) {
        u(a() < i17 ? new byte[i17] : this.f498073a, i17);
    }

    public void u(byte[] bArr, int i17) {
        this.f498073a = bArr;
        this.f498075c = i17;
        this.f498074b = 0;
    }

    public void v(int i17) {
        t9.a.a(i17 >= 0 && i17 <= this.f498073a.length);
        this.f498075c = i17;
    }

    public void w(int i17) {
        if (i17 >= 0) {
            int i18 = this.f498075c;
        }
        t9.a.a(i17 >= 0 && i17 <= this.f498075c);
        this.f498074b = i17;
    }

    public void x(int i17) {
        w(this.f498074b + i17);
    }

    public p(byte[] bArr) {
        this.f498073a = bArr;
        this.f498075c = bArr.length;
    }

    public p(byte[] bArr, int i17) {
        this.f498073a = bArr;
        this.f498075c = i17;
    }
}
