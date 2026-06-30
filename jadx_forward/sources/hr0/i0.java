package hr0;

/* loaded from: classes12.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0.k0 f364835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f364836e;

    public i0(hr0.k0 k0Var, q01.s0 s0Var) {
        this.f364835d = k0Var;
        this.f364836e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Ai = this.f364835d.Ai();
        hr0.k0 k0Var = this.f364835d;
        q01.s0 req = this.f364836e;
        synchronized (Ai) {
            java.util.Iterator it = k0Var.Ai().iterator();
            while (it.hasNext()) {
                ((cr0.h3) ((q01.p0) it.next())).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
            }
        }
    }
}
