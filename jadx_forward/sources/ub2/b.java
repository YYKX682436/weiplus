package ub2;

/* loaded from: classes14.dex */
public final class b extends p3325xe03a0797.p3326xc267989b.p0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.os.HandlerThread f507572e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f507573f;

    public b() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("FinderPostWatermarkCheck", -2);
        this.f507572e = a17;
        this.f507573f = jz5.h.b(new ub2.a(this));
        a17.start();
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        try {
            ((android.os.Handler) ((jz5.n) this.f507573f).mo141623x754a37bb()).post(block);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            p3325xe03a0797.p3326xc267989b.v2.b(context, p3325xe03a0797.p3326xc267989b.e2.a("The task was rejected", e17));
        }
    }
}
