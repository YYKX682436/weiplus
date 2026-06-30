package p56;

/* loaded from: classes16.dex */
public abstract class r implements p56.m, p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final u56.o f433636d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.r f433637e;

    /* renamed from: f, reason: collision with root package name */
    public p56.n f433638f;

    /* renamed from: g, reason: collision with root package name */
    public long f433639g;

    public r() {
        this(null, false);
    }

    @Override // p56.s
    public final boolean b() {
        return this.f433636d.f506372e;
    }

    @Override // p56.s
    public final void c() {
        this.f433636d.c();
    }

    public final void d(p56.s sVar) {
        this.f433636d.a(sVar);
    }

    public void e() {
    }

    public final void f(long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("number requested cannot be negative: " + j17);
        }
        synchronized (this) {
            p56.n nVar = this.f433638f;
            if (nVar != null) {
                nVar.d(j17);
                return;
            }
            long j18 = this.f433639g;
            if (j18 == Long.MIN_VALUE) {
                this.f433639g = j17;
            } else {
                long j19 = j18 + j17;
                if (j19 < 0) {
                    this.f433639g = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                } else {
                    this.f433639g = j19;
                }
            }
        }
    }

    public void g(p56.n nVar) {
        long j17;
        p56.r rVar;
        boolean z17;
        synchronized (this) {
            j17 = this.f433639g;
            this.f433638f = nVar;
            rVar = this.f433637e;
            z17 = rVar != null && j17 == Long.MIN_VALUE;
        }
        if (z17) {
            rVar.g(nVar);
        } else if (j17 == Long.MIN_VALUE) {
            nVar.d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        } else {
            nVar.d(j17);
        }
    }

    public r(p56.r rVar, boolean z17) {
        this.f433639g = Long.MIN_VALUE;
        this.f433637e = rVar;
        this.f433636d = (!z17 || rVar == null) ? new u56.o() : rVar.f433636d;
    }
}
