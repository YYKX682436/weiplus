package im2;

/* loaded from: classes3.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374113d;

    public v2(im2.z3 z3Var) {
        this.f374113d = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.z3 z3Var = this.f374113d;
        if (z3Var.P1 == null) {
            z3Var.P1 = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(z3Var.m158354x19263085());
            im2.z3 z3Var2 = this.f374113d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = z3Var2.P1;
            if (f5Var != null) {
                f5Var.f291933e = new im2.u2(z3Var2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f374113d.P1;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
