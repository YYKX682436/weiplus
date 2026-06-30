package l46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f398018s = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};

    /* renamed from: e, reason: collision with root package name */
    public final java.io.PushbackInputStream f398019e;

    /* renamed from: f, reason: collision with root package name */
    public final l46.b f398020f;

    /* renamed from: g, reason: collision with root package name */
    public l46.e f398021g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f398022h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398023i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f398024m;

    /* renamed from: n, reason: collision with root package name */
    public int f398025n;

    /* renamed from: o, reason: collision with root package name */
    public long f398026o;

    /* renamed from: p, reason: collision with root package name */
    public final int f398027p;

    /* renamed from: q, reason: collision with root package name */
    public final l46.c f398028q;

    /* renamed from: r, reason: collision with root package name */
    public final r46.c f398029r;

    public a(java.io.InputStream inputStream) {
        l46.b bVar = l46.b.STANDARD;
        this.f398022h = new byte[1];
        this.f398026o = -1L;
        this.f398028q = new l46.c();
        this.f398029r = new r46.c() { // from class: l46.a$$a
            @Override // r46.c
            public final int a() {
                l46.a aVar = l46.a.this;
                int read = aVar.f398019e.read();
                if (read == -1) {
                    return -1;
                }
                aVar.a(1);
                return read & 255;
            }
        };
        this.f398019e = new java.io.PushbackInputStream(new r46.g(inputStream), 1);
        this.f398027p = 32768;
        this.f398020f = bVar;
        i();
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f398024m) {
            return java.lang.Math.min(this.f398025n, this.f398019e.available());
        }
        l46.e eVar = this.f398021g;
        if (eVar != null) {
            return eVar.f360504g - eVar.f360505h;
        }
        return 0;
    }

    public final long b() {
        byte[] bArr = new byte[4];
        int a17 = r46.h.a(this.f398019e, bArr, 0, 4);
        a(a17);
        if (a17 == 4) {
            return r46.d.c(bArr, 0, 4);
        }
        throw new java.io.IOException("Premature end of stream");
    }

    public final void c() {
        int i17;
        long j17 = this.f398026o;
        l46.c cVar = this.f398028q;
        if (j17 >= 0 && j17 != cVar.getValue()) {
            throw new java.io.IOException("Checksum verification failed");
        }
        this.f398026o = -1L;
        cVar.f398035a = -1;
        this.f398024m = false;
        java.io.PushbackInputStream pushbackInputStream = this.f398019e;
        int read = pushbackInputStream.read();
        if (read != -1) {
            a(1);
            i17 = read & 255;
        } else {
            i17 = -1;
        }
        if (i17 == -1) {
            this.f398023i = true;
            return;
        }
        if (i17 == 255) {
            pushbackInputStream.unread(i17);
            this.f82887d--;
            i();
            c();
            return;
        }
        r46.c cVar2 = this.f398029r;
        if (i17 == 254 || (i17 > 127 && i17 <= 253)) {
            int b17 = (int) r46.d.b(cVar2, 3);
            if (b17 < 0) {
                throw new java.io.IOException("Found illegal chunk with negative size");
            }
            long j18 = b17;
            long b18 = r46.h.b(pushbackInputStream, j18);
            a(b18);
            if (b18 != j18) {
                throw new java.io.IOException("Premature end of stream");
            }
            c();
            return;
        }
        if (i17 >= 2 && i17 <= 127) {
            throw new java.io.IOException("Unskippable chunk with type " + i17 + " (hex " + java.lang.Integer.toHexString(i17) + ") detected.");
        }
        if (i17 == 1) {
            this.f398024m = true;
            int b19 = ((int) r46.d.b(cVar2, 3)) - 4;
            this.f398025n = b19;
            if (b19 < 0) {
                throw new java.io.IOException("Found illegal chunk with negative size");
            }
            long b27 = (b() - 2726488792L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            this.f398026o = ((b27 << 15) | (b27 >> 17)) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            return;
        }
        if (i17 != 0) {
            throw new java.io.IOException("Unknown chunk type " + i17 + " detected.");
        }
        boolean z17 = this.f398020f.f398033d;
        long b28 = ((int) r46.d.b(cVar2, 3)) - (z17 ? 4L : 0L);
        if (b28 < 0) {
            throw new java.io.IOException("Found illegal chunk with negative size");
        }
        if (z17) {
            long b29 = (b() - 2726488792L) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            this.f398026o = ((b29 << 15) | (b29 >> 17)) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        } else {
            this.f398026o = -1L;
        }
        l46.e eVar = new l46.e(new r46.b(pushbackInputStream, b28), this.f398027p);
        this.f398021g = eVar;
        a(eVar.f82887d);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.PushbackInputStream pushbackInputStream = this.f398019e;
        try {
            l46.e eVar = this.f398021g;
            if (eVar != null) {
                eVar.close();
                this.f398021g = null;
            }
        } finally {
            pushbackInputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.f398024m
            r1 = -1
            if (r0 == 0) goto L20
            int r0 = r4.f398025n
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto Le
            return r1
        Le:
            java.io.PushbackInputStream r0 = r4.f398019e
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L3d
            int r0 = r4.f398025n
            int r0 = r0 - r7
            r4.f398025n = r0
            long r0 = (long) r7
            r4.a(r0)
            goto L3d
        L20:
            l46.e r0 = r4.f398021g
            if (r0 == 0) goto L3e
            long r2 = r0.f82887d
            int r7 = r0.read(r5, r6, r7)
            if (r7 != r1) goto L35
            l46.e r0 = r4.f398021g
            r0.close()
            r0 = 0
            r4.f398021g = r0
            goto L3d
        L35:
            l46.e r0 = r4.f398021g
            long r0 = r0.f82887d
            long r0 = r0 - r2
            r4.a(r0)
        L3d:
            r1 = r7
        L3e:
            if (r1 <= 0) goto L45
            l46.c r7 = r4.f398028q
            r7.update(r5, r6, r1)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l46.a.f(byte[], int, int):int");
    }

    public final void i() {
        byte[] bArr = new byte[10];
        int a17 = r46.h.a(this.f398019e, bArr, 0, 10);
        a(a17);
        if (10 != a17 || !java.util.Arrays.equals(bArr, f398018s)) {
            throw new java.io.IOException("Not a framed Snappy stream");
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f398022h;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int f17 = f(bArr, i17, i18);
        if (f17 != -1) {
            return f17;
        }
        c();
        if (this.f398023i) {
            return -1;
        }
        return f(bArr, i17, i18);
    }
}
