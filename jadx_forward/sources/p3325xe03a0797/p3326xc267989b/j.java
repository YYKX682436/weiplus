package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class j extends p3325xe03a0797.p3326xc267989b.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Thread f392075f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.w1 f392076g;

    public j(oz5.l lVar, java.lang.Thread thread, p3325xe03a0797.p3326xc267989b.w1 w1Var) {
        super(lVar, true, true);
        this.f392075f = thread;
        this.f392076g = w1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public void u(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f392075f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
