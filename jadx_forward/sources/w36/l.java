package w36;

/* loaded from: classes16.dex */
public final class l implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public int f524349d;

    /* renamed from: e, reason: collision with root package name */
    public long f524350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f524351f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f524352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w36.m f524353h;

    public l(w36.m mVar) {
        this.f524353h = mVar;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        boolean z17;
        long a17;
        if (this.f524352g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f524353h;
        mVar.f524359f.U(kVar, j17);
        if (this.f524351f) {
            long j18 = this.f524350e;
            if (j18 != -1 && mVar.f524359f.f533227e > j18 - 8192) {
                z17 = true;
                a17 = mVar.f524359f.a();
                if (a17 > 0 || z17) {
                }
                this.f524353h.b(this.f524349d, a17, this.f524351f, false);
                this.f524351f = false;
                return;
            }
        }
        z17 = false;
        a17 = mVar.f524359f.a();
        if (a17 > 0) {
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f524352g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f524353h;
        mVar.b(this.f524349d, mVar.f524359f.f533227e, this.f524351f, true);
        this.f524352g = true;
        this.f524353h.f524361h = false;
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        if (this.f524352g) {
            throw new java.io.IOException("closed");
        }
        w36.m mVar = this.f524353h;
        mVar.b(this.f524349d, mVar.f524359f.f533227e, this.f524351f, false);
        this.f524351f = false;
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f524353h.f524356c.h();
    }
}
