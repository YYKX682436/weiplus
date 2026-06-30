package x51;

/* loaded from: classes12.dex */
public final class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final x51.p1 f533608b = new x51.p1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f533609a;

    public q1(java.lang.String expt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expt, "expt");
        this.f533609a = expt;
    }

    public final void a(java.lang.Runnable runnable, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (!z17 || !f533608b.a(this.f533609a)) {
            gm0.j1.e().k(runnable, j17);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).l(runnable, j17, this.f533609a);
    }
}
