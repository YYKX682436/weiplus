package p3325xe03a0797.p3326xc267989b.p3330xd70c6594;

/* loaded from: classes14.dex */
public final class d extends p3325xe03a0797.p3326xc267989b.f2 implements java.util.concurrent.Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.d f392140e = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.d();

    /* renamed from: f, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p0 f392141f;

    static {
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.o oVar = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.o.f392154e;
        int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.n0.f392044a;
        if (64 >= i17) {
            i17 = 64;
        }
        f392141f = oVar.J(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m0.b("kotlinx.coroutines.io.parallelism", i17, 0, 0, 12, null));
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        f392141f.D(lVar, runnable);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        f392141f.F(lVar, runnable);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public p3325xe03a0797.p3326xc267989b.p0 J(int i17) {
        return p3325xe03a0797.p3326xc267989b.p3330xd70c6594.o.f392154e.J(i17);
    }

    @Override // p3325xe03a0797.p3326xc267989b.f2
    public java.util.concurrent.Executor K() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        D(oz5.m.f431862d, runnable);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    /* renamed from: toString */
    public java.lang.String mo143973x9616526c() {
        return "Dispatchers.IO";
    }
}
