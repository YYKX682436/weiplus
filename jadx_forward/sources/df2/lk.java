package df2;

/* loaded from: classes3.dex */
public final class lk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f312204d;

    public lk(df2.pk pkVar) {
        this.f312204d = pkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pk pkVar = this.f312204d;
        if (pkVar.E == null) {
            pkVar.E = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(pkVar.N6());
            df2.pk pkVar2 = this.f312204d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = pkVar2.E;
            if (f5Var != null) {
                f5Var.f291933e = new df2.kk(pkVar2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f312204d.E;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
