package hw;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366910d;

    public f0(hw.o0 o0Var) {
        this.f366910d = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String ij6;
        hw.o0 o0Var = this.f366910d;
        boolean aj6 = o0Var.aj();
        ij6 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij6, "onEnterBackground biz flutter isDestroyed:" + aj6);
        if (aj6) {
            o0Var.K6(2);
        }
    }
}
