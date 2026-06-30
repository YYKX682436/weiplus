package h46;

/* loaded from: classes13.dex */
public abstract class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final int f360502e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f360503f;

    /* renamed from: g, reason: collision with root package name */
    public int f360504g;

    /* renamed from: h, reason: collision with root package name */
    public int f360505h;

    /* renamed from: i, reason: collision with root package name */
    public final r46.g f360506i;

    /* renamed from: m, reason: collision with root package name */
    public long f360507m;

    /* renamed from: n, reason: collision with root package name */
    public int f360508n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f360509o = new byte[1];

    /* renamed from: p, reason: collision with root package name */
    public final r46.c f360510p = new r46.c() { // from class: h46.a$$a
        @Override // r46.c
        public final int a() {
            return h46.a.this.i();
        }
    };

    public a(java.io.InputStream inputStream, int i17) {
        this.f360506i = new r46.g(inputStream);
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("windowSize must be bigger than 0");
        }
        this.f360502e = i17;
        this.f360503f = new byte[i17 * 3];
        this.f360505h = 0;
        this.f360504g = 0;
        this.f360507m = 0L;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f360504g - this.f360505h;
    }

    public final int b(byte[] bArr, int i17, int i18) {
        if (i18 > this.f360504g - this.f360505h) {
            int min = (int) java.lang.Math.min(i18 - r0, this.f360507m);
            byte[] bArr2 = this.f360503f;
            int min2 = java.lang.Math.min(min, bArr2.length - this.f360504g);
            if (min2 != 0) {
                int i19 = this.f360508n;
                if (i19 == 1) {
                    int i27 = this.f360504g;
                    java.util.Arrays.fill(bArr2, i27, i27 + min2, bArr2[i27 - 1]);
                    this.f360504g += min2;
                } else if (min2 < i19) {
                    int i28 = this.f360504g;
                    java.lang.System.arraycopy(bArr2, i28 - i19, bArr2, i28, min2);
                    this.f360504g += min2;
                } else {
                    int i29 = min2 / i19;
                    for (int i37 = 0; i37 < i29; i37++) {
                        int i38 = this.f360504g;
                        int i39 = this.f360508n;
                        java.lang.System.arraycopy(bArr2, i38 - i39, bArr2, i38, i39);
                        this.f360504g += this.f360508n;
                    }
                    int i47 = this.f360508n;
                    int i48 = min2 - (i29 * i47);
                    if (i48 > 0) {
                        int i49 = this.f360504g;
                        java.lang.System.arraycopy(bArr2, i49 - i47, bArr2, i49, i48);
                        this.f360504g += i48;
                    }
                }
            }
            this.f360507m -= min2;
        }
        return c(bArr, i17, i18);
    }

    public final int c(byte[] bArr, int i17, int i18) {
        int min = java.lang.Math.min(i18, this.f360504g - this.f360505h);
        if (min > 0) {
            int i19 = this.f360505h;
            byte[] bArr2 = this.f360503f;
            java.lang.System.arraycopy(bArr2, i19, bArr, i17, min);
            int i27 = this.f360505h + min;
            this.f360505h = i27;
            int i28 = this.f360502e;
            int i29 = i28 * 2;
            if (i27 > i29) {
                java.lang.System.arraycopy(bArr2, i28, bArr2, 0, i29);
                this.f360504g -= i28;
                this.f360505h -= i28;
            }
        }
        return min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f360506i.close();
    }

    public final int f(byte[] bArr, int i17, int i18) {
        if (i18 > this.f360504g - this.f360505h) {
            int min = (int) java.lang.Math.min(i18 - r0, this.f360507m);
            byte[] bArr2 = this.f360503f;
            int min2 = java.lang.Math.min(min, bArr2.length - this.f360504g);
            int a17 = min2 > 0 ? r46.h.a(this.f360506i, bArr2, this.f360504g, min2) : 0;
            a(a17);
            if (min2 != a17) {
                throw new java.io.IOException("Premature end of stream reading literal");
            }
            this.f360504g += min2;
            this.f360507m -= min2;
        }
        return c(bArr, i17, i18);
    }

    public final int i() {
        int read = this.f360506i.read();
        if (read == -1) {
            return -1;
        }
        a(1);
        return read & 255;
    }

    public final void j(int i17, long j17) {
        if (i17 <= 0 || i17 > this.f360504g) {
            throw new java.lang.IllegalArgumentException("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        }
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("length must not be negative");
        }
        this.f360508n = i17;
        this.f360507m = j17;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f360509o;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
