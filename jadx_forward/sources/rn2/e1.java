package rn2;

/* loaded from: classes8.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.f1 f479250d;

    public e1(rn2.f1 f1Var) {
        this.f479250d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rn2.f1 f1Var = this.f479250d;
        if (f1Var.f479265g == null) {
            f1Var.f479265g = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(f1Var.m158354x19263085());
            rn2.f1 f1Var2 = this.f479250d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = f1Var2.f479265g;
            if (f5Var != null) {
                f5Var.f291933e = new rn2.d1(f1Var2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f479250d.f479265g;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
