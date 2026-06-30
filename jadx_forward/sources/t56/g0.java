package t56;

/* loaded from: classes16.dex */
public class g0 extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f497412d = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p56.p f497413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p56.m f497414f;

    public g0(t56.l0 l0Var, p56.p pVar, p56.m mVar) {
        this.f497413e = pVar;
        this.f497414f = mVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497412d.get();
    }

    @Override // p56.s
    public void c() {
        if (this.f497412d.compareAndSet(false, true)) {
            this.f497413e.c();
            this.f497414f.mo157868xaa8b332c();
        }
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        t56.j0 j0Var = new t56.j0(aVar);
        this.f497414f.a(j0Var);
        return j0Var;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        t56.i0 i0Var = new t56.i0(aVar, j17, timeUnit);
        this.f497414f.a(i0Var);
        return i0Var;
    }
}
