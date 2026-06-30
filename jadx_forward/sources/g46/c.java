package g46;

/* loaded from: classes13.dex */
public class c extends a46.b {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f350388v = {4, 34, 77, 24};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f350389w = {42, 77, 24};

    /* renamed from: g, reason: collision with root package name */
    public final r46.g f350392g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350393h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350394i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f350395m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f350396n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f350397o;

    /* renamed from: p, reason: collision with root package name */
    public java.io.InputStream f350398p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f350399q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f350400r;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f350403u;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f350390e = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public final r46.c f350391f = new r46.c() { // from class: g46.c$$a
        @Override // r46.c
        public final int a() {
            return g46.c.this.i();
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final g46.d f350401s = new g46.d();

    /* renamed from: t, reason: collision with root package name */
    public final g46.d f350402t = new g46.d();

    public c(java.io.InputStream inputStream, boolean z17) {
        this.f350392g = new r46.g(inputStream);
        this.f350393h = z17;
        b(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006f A[EDGE_INSN: B:86:0x006f->B:87:0x006f BREAK  A[LOOP:0: B:63:0x0020->B:79:0x0056], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g46.c.b(boolean):void");
    }

    public final void c() {
        java.io.InputStream inputStream = this.f350398p;
        g46.d dVar = this.f350402t;
        if (inputStream != null) {
            inputStream.close();
            this.f350398p = null;
            if (this.f350394i) {
                j(dVar, "block");
                dVar.reset();
            }
        }
        long b17 = r46.d.b(this.f350391f, 4);
        boolean z17 = ((-2147483648L) & b17) != 0;
        int i17 = (int) (b17 & 2147483647L);
        if (i17 < 0) {
            throw new java.io.IOException("Found illegal block with negative size");
        }
        if (i17 == 0) {
            boolean z18 = this.f350397o;
            g46.d dVar2 = this.f350401s;
            if (z18) {
                j(dVar2, "content");
            }
            dVar2.reset();
            if (this.f350393h) {
                b(false);
                return;
            } else {
                this.f350399q = true;
                return;
            }
        }
        java.io.InputStream bVar = new r46.b(this.f350392g, i17);
        if (this.f350394i) {
            bVar = new r46.e(dVar, bVar);
        }
        if (z17) {
            this.f350400r = true;
            this.f350398p = bVar;
            return;
        }
        this.f350400r = false;
        g46.b bVar2 = new g46.b(bVar);
        if (this.f350395m) {
            byte[] bArr = this.f350403u;
            if (bVar2.f360504g != 0) {
                throw new java.lang.IllegalStateException("The stream has already been read from, can't prefill anymore");
            }
            int min = java.lang.Math.min(bVar2.f360502e, bArr.length);
            java.lang.System.arraycopy(bArr, bArr.length - min, bVar2.f360503f, 0, min);
            bVar2.f360504g += min;
            bVar2.f360505h += min;
        }
        this.f350398p = bVar2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r46.g gVar = this.f350392g;
        try {
            java.io.InputStream inputStream = this.f350398p;
            if (inputStream != null) {
                inputStream.close();
                this.f350398p = null;
            }
        } finally {
            gVar.close();
        }
    }

    public final int f(byte[] bArr, int i17, int i18) {
        if (this.f350400r) {
            int read = this.f350398p.read(bArr, i17, i18);
            a(read);
            return read;
        }
        java.io.InputStream inputStream = this.f350398p;
        g46.b bVar = (g46.b) inputStream;
        long j17 = bVar.f82887d;
        int read2 = inputStream.read(bArr, i17, i18);
        a(bVar.f82887d - j17);
        return read2;
    }

    public final int i() {
        int read = this.f350392g.read();
        if (read == -1) {
            return -1;
        }
        a(1);
        return read & 255;
    }

    public final void j(g46.d dVar, java.lang.String str) {
        byte[] bArr = new byte[4];
        int a17 = r46.h.a(this.f350392g, bArr, 0, 4);
        a(a17);
        if (4 != a17) {
            throw new java.io.IOException("Premature end of stream while reading " + str + " checksum");
        }
        if (dVar.getValue() == r46.d.c(bArr, 0, 4)) {
            return;
        }
        throw new java.io.IOException(str + " checksum mismatch.");
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f350390e;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int min;
        if (i18 == 0) {
            return 0;
        }
        if (this.f350399q) {
            return -1;
        }
        int f17 = f(bArr, i17, i18);
        if (f17 == -1) {
            c();
            if (!this.f350399q) {
                f17 = f(bArr, i17, i18);
            }
        }
        if (f17 != -1) {
            if (this.f350395m && (min = java.lang.Math.min(f17, this.f350403u.length)) > 0) {
                byte[] bArr2 = this.f350403u;
                int length = bArr2.length - min;
                if (length > 0) {
                    java.lang.System.arraycopy(bArr2, min, bArr2, 0, length);
                }
                java.lang.System.arraycopy(bArr, i17, this.f350403u, length, min);
            }
            if (this.f350397o) {
                this.f350401s.update(bArr, i17, f17);
            }
        }
        return f17;
    }
}
