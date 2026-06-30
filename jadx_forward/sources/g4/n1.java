package g4;

/* loaded from: classes5.dex */
public final class n1 implements g4.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.y2 f349987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f349988b;

    public n1(g4.x1 x1Var, g4.y2 pageFetcherSnapshot, g4.e0 retryEventBus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageFetcherSnapshot, "pageFetcherSnapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retryEventBus, "retryEventBus");
        this.f349988b = x1Var;
        this.f349987a = pageFetcherSnapshot;
    }

    @Override // g4.y4
    public void a() {
        this.f349988b.f350139a.a(java.lang.Boolean.TRUE);
    }

    @Override // g4.y4
    public void b(g4.b5 viewportHint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewportHint, "viewportHint");
        g4.y2 y2Var = this.f349987a;
        y2Var.getClass();
        if (viewportHint instanceof g4.z4) {
            y2Var.f350164b = (g4.z4) viewportHint;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) y2Var.f350163a).e(viewportHint);
    }
}
