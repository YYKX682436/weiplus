package id2;

/* loaded from: classes3.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372022d;

    public b1(id2.v1 v1Var) {
        this.f372022d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id2.v1 v1Var = this.f372022d;
        if (v1Var.M == null) {
            v1Var.M = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(v1Var.m158354x19263085());
            id2.v1 v1Var2 = this.f372022d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = v1Var2.M;
            if (f5Var != null) {
                f5Var.f291933e = new id2.a1(v1Var2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f372022d.M;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
