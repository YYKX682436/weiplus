package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes4.dex */
public final class ms implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mu {

    /* renamed from: g, reason: collision with root package name */
    private int f131980g = 0;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f131981h;

    private ms(byte[] bArr) {
        this.f131981h = bArr;
    }

    private void a(byte[] bArr) {
        this.f131981h = bArr;
        this.f131980g = 0;
    }

    private int b() {
        return this.f131980g;
    }

    private byte c() {
        int i17;
        byte[] bArr = this.f131981h;
        if (bArr == null || (i17 = this.f131980g) >= bArr.length) {
            return (byte) 0;
        }
        this.f131980g = i17 + 1;
        return bArr[i17];
    }

    private boolean d() {
        return c() != 0;
    }

    private int e() {
        return (int) e(2);
    }

    private char f() {
        long j17 = 0;
        for (int i17 = 0; i17 < 2; i17++) {
            j17 |= (c() & 255) << (i17 * 8);
        }
        return (char) j17;
    }

    private int g() {
        return (int) e(4);
    }

    private long h() {
        return e(8);
    }

    private java.lang.String i() {
        int e17 = (int) e(2);
        if (e17 == 0) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < e17; i17++) {
            stringBuffer.append(f());
        }
        return stringBuffer.toString();
    }

    private java.lang.String j() {
        int e17 = (int) e(2);
        if (e17 == 0) {
            return "";
        }
        byte[] bArr = new byte[e17];
        for (int i17 = 0; i17 < e17; i17++) {
            bArr[i17] = c();
        }
        try {
            return new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException unused) {
            return "";
        }
    }

    private boolean k() {
        return this.f131980g == this.f131981h.length - 1;
    }

    private void b(int i17) {
        this.f131980g -= i17;
    }

    private java.lang.String d(int i17) {
        int i18 = i17 >> 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < i18; i19++) {
            stringBuffer.append(f());
        }
        return stringBuffer.toString();
    }

    private long e(int i17) {
        long j17 = 0;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            j17 |= (c() & 255) << (i18 * 8);
        }
        return j17;
    }

    private byte[] a() {
        byte[] bArr = this.f131981h;
        int length = bArr.length;
        int i17 = this.f131980g;
        int i18 = length - i17;
        byte[] bArr2 = new byte[i18];
        java.lang.System.arraycopy(bArr, i17, bArr2, 0, i18);
        return bArr2;
    }

    private byte[] c(int i17) {
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            bArr[i18] = c();
        }
        return bArr;
    }

    private void a(int i17) {
        this.f131980g += i17;
    }
}
