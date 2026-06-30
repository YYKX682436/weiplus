package dr0;

/* loaded from: classes12.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.j0 f323958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323959e;

    public g0(dr0.j0 j0Var, java.lang.String str) {
        this.f323958d = j0Var;
        this.f323959e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.j0 j0Var = this.f323958d;
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        ph.c c17 = tVar.c();
        java.lang.String it = this.f323959e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        j0Var.j(c17, it);
    }
}
