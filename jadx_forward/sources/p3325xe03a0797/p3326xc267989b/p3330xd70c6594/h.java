package p3325xe03a0797.p3326xc267989b.p3330xd70c6594;

/* loaded from: classes14.dex */
public abstract class h extends p3325xe03a0797.p3326xc267989b.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c f392144e;

    public h(int i17, int i18, long j17, java.lang.String str) {
        this.f392144e = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c(i17, i18, j17, str);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.f392129n;
        this.f392144e.b(runnable, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392152f, false);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.f392129n;
        this.f392144e.b(runnable, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392152f, true);
    }

    @Override // p3325xe03a0797.p3326xc267989b.f2
    public java.util.concurrent.Executor K() {
        return this.f392144e;
    }
}
