package re1;

/* loaded from: classes13.dex */
public class d implements se1.f {

    /* renamed from: a, reason: collision with root package name */
    public final re1.b f475834a;

    /* renamed from: b, reason: collision with root package name */
    public final long f475835b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f475836c;

    /* renamed from: d, reason: collision with root package name */
    public se1.i f475837d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.BufferedOutputStream f475838e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f475839f;

    /* renamed from: g, reason: collision with root package name */
    public long f475840g;

    /* renamed from: h, reason: collision with root package name */
    public long f475841h;

    /* renamed from: i, reason: collision with root package name */
    public long f475842i = -1;

    /* renamed from: j, reason: collision with root package name */
    public te1.b f475843j = te1.b.f499301c;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f475844k = "";

    public d(re1.b bVar, long j17) {
        this.f475834a = bVar;
        this.f475835b = j17;
    }

    public void a() {
        try {
            b();
            ve1.g.p(4, c(), "close outputStream, " + java.lang.String.format("total cached %d bytes", java.lang.Long.valueOf(this.f475841h)), null);
        } catch (java.io.IOException e17) {
            throw new re1.c(e17);
        }
    }

    public final void b() {
        java.io.BufferedOutputStream bufferedOutputStream = this.f475838e;
        if (bufferedOutputStream == null) {
            ve1.g.p(4, c(), "finish cache, outputStream is null", null);
            return;
        }
        try {
            bufferedOutputStream.flush();
            try {
                this.f475838e.close();
            } catch (java.io.IOException unused) {
            }
            re1.b bVar = this.f475834a;
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f475836c;
            re1.m mVar = (re1.m) bVar;
            synchronized (mVar) {
                re1.i b17 = re1.i.b(r6Var);
                ve1.a.a(b17 != null);
                ve1.a.a(mVar.f475884d.containsKey(b17.f475868d));
                if (r6Var.m()) {
                    if (r6Var.C() == 0) {
                        r6Var.l();
                    } else {
                        mVar.b(b17);
                        mVar.notifyAll();
                    }
                }
            }
            ve1.g.p(4, c(), "finish cache " + this.f475836c.o() + "  fileSize=" + this.f475836c.C(), null);
            this.f475839f = null;
            this.f475838e = null;
            this.f475836c = null;
        } catch (java.lang.Throwable th6) {
            try {
                this.f475838e.close();
            } catch (java.io.IOException unused2) {
            }
            this.f475836c.l();
            ve1.g.p(6, c(), "close outputStream failed: " + this.f475836c.o(), null);
            this.f475839f = null;
            this.f475838e = null;
            this.f475836c = null;
            throw th6;
        }
    }

    public java.lang.String c() {
        return this.f475844k + "CacheDataSink";
    }

    public void d() {
        com.p314xaae8f345.mm.vfs.r6 d17;
        re1.b bVar = this.f475834a;
        se1.i iVar = this.f475837d;
        java.lang.String str = iVar.f488309e;
        long j17 = iVar.f488306b;
        long j18 = this.f475841h;
        long j19 = j17 + j18;
        long j27 = this.f475842i;
        te1.b bVar2 = this.f475843j;
        long min = java.lang.Math.min(iVar.f488308d - j18, this.f475835b);
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            ve1.a.a(mVar.f475884d.containsKey(str));
            if (!mVar.f475882b.m()) {
                mVar.g();
                mVar.f475882b.J();
            }
            ((re1.k) mVar.f475883c).a(mVar, min);
            d17 = re1.i.d(mVar.f475882b, str, j19, j27, bVar2, java.lang.System.currentTimeMillis());
        }
        this.f475836c = d17;
        ve1.g.p(4, c(), "start cache " + this.f475836c.o(), null);
        this.f475839f = com.p314xaae8f345.mm.vfs.w6.H(this.f475836c);
        this.f475838e = new java.io.BufferedOutputStream(this.f475839f);
        this.f475840g = 0L;
    }

    public void e(byte[] bArr, int i17, int i18) {
        int i19 = 0;
        while (i19 < i18) {
            try {
                long j17 = this.f475840g;
                long j18 = this.f475835b;
                if (j17 == j18) {
                    b();
                    d();
                }
                int min = (int) java.lang.Math.min(i18 - i19, j18 - this.f475840g);
                this.f475838e.write(bArr, i17 + i19, min);
                i19 += min;
                long j19 = min;
                this.f475840g += j19;
                this.f475841h += j19;
            } catch (java.io.IOException e17) {
                throw new re1.c(e17);
            }
        }
    }
}
