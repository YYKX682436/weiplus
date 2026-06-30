package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class n2 extends p3325xe03a0797.p3326xc267989b.t2 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392091i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.n2.class, "_invoked");

    /* renamed from: _invoked */
    private volatile /* synthetic */ int f72728x165f1ad = 0;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f392092h;

    public n2(yz5.l lVar) {
        this.f392092h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f384359a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.g0
    public void u(java.lang.Throwable th6) {
        if (f392091i.compareAndSet(this, 0, 1)) {
            this.f392092h.mo146xb9724478(th6);
        }
    }
}
