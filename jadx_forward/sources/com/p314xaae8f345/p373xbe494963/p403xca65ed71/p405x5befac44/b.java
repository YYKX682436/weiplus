package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    int f128463b;

    /* renamed from: c, reason: collision with root package name */
    private java.io.InputStream f128464c;

    /* renamed from: d, reason: collision with root package name */
    private int f128465d;

    /* renamed from: e, reason: collision with root package name */
    private int f128466e;

    /* renamed from: f, reason: collision with root package name */
    private final java.io.OutputStream f128467f;

    /* renamed from: h, reason: collision with root package name */
    private int f128469h;

    /* renamed from: a, reason: collision with root package name */
    protected com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.a f128462a = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.a();

    /* renamed from: g, reason: collision with root package name */
    private int[] f128468g = new int[8];

    public b(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        this.f128464c = inputStream;
        this.f128467f = outputStream;
        this.f128465d = inputStream.read();
        this.f128466e = inputStream.read();
    }

    private int c(boolean z17) {
        if (this.f128463b == 8) {
            f();
            if (this.f128465d == -1) {
                return -1;
            }
        }
        int i17 = this.f128465d;
        int i18 = this.f128463b;
        int i19 = (i17 >> (7 - i18)) & 1;
        this.f128463b = i18 + 1;
        if (z17 && this.f128467f != null) {
            f(i19);
        }
        return i19;
    }

    private long e(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = (j17 << 1) | c(true);
        }
        return j17;
    }

    private void f() {
        this.f128465d = this.f128466e;
        this.f128466e = this.f128464c.read();
        this.f128463b = 0;
    }

    private int g() {
        int i17 = 0;
        while (c(true) == 0) {
            i17++;
        }
        if (i17 <= 0) {
            return 0;
        }
        return (int) (((1 << i17) - 1) + e(i17));
    }

    private void h() {
        int[] iArr = this.f128468g;
        this.f128467f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public final boolean a(boolean z17) {
        return c(z17) == 1;
    }

    public final void b(int i17) {
        a(i17);
    }

    public final void d() {
        int i17 = 0;
        while (c(true) == 0) {
            i17++;
        }
        if (i17 > 0) {
            a(i17);
        }
    }

    public final long a() {
        long e17 = e(8);
        java.lang.String.valueOf(e17);
        return e17;
    }

    public final int b() {
        int i17 = 0;
        while (c(false) == 0) {
            i17++;
        }
        if (i17 <= 0) {
            return 0;
        }
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = (j17 << 1) | c(false);
        }
        return (int) (((1 << i17) - 1) + j17);
    }

    public final void d(int i17) {
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= 15) {
                break;
            }
            int i28 = (1 << i19) + i27;
            if (i17 < i28) {
                i18 = i19;
                break;
            } else {
                i19++;
                i27 = i28;
            }
        }
        a(0L, i18);
        f(1);
        a(i17 - i27, i18);
    }

    public final void e() {
        f(1);
        a(0L, 8 - this.f128469h);
        for (int i17 = this.f128469h; i17 < 8; i17++) {
            this.f128468g[i17] = 0;
        }
        this.f128469h = 0;
        h();
    }

    private void f(int i17) {
        if (this.f128469h == 8) {
            this.f128469h = 0;
            h();
        }
        int[] iArr = this.f128468g;
        int i18 = this.f128469h;
        this.f128469h = i18 + 1;
        iArr[i18] = i17;
    }

    public final void a(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            c(true);
        }
    }

    public final void b(boolean z17) {
        f(z17 ? 1 : 0);
    }

    private void a(long j17, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            f(((int) (j17 >> ((i17 - i18) - 1))) & 1);
        }
    }

    public final int c() {
        int g17 = g();
        java.lang.String.valueOf(g17);
        return g17;
    }

    public final void c(int i17) {
        int[] iArr = new int[i17];
        int i18 = 8;
        int i19 = 8;
        for (int i27 = 0; i27 < i17; i27++) {
            if (i18 != 0) {
                int g17 = g();
                int i28 = ((g17 >> 1) + (g17 & 1)) * ((r4 << 1) - 1);
                java.lang.String.valueOf(i28);
                i18 = ((i28 + i19) + 256) % 256;
            }
            if (i18 != 0) {
                i19 = i18;
            }
            iArr[i27] = i19;
        }
    }
}
