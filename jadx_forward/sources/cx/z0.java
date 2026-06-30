package cx;

/* loaded from: classes7.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f306024d;

    public z0(cx.j1 j1Var) {
        this.f306024d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pj6;
        yw.w1 w1Var = yw.w1.f548020a;
        boolean z17 = yw.w1.f548022c;
        cx.j1 j1Var = this.f306024d;
        pj6 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj6, "onEnterBackground biz flutter isDestroyed:" + z17);
        if (z17) {
            j1Var.K6(2);
        }
    }
}
