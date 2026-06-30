package df2;

/* loaded from: classes3.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312520d;

    public ol(df2.pl plVar) {
        this.f312520d = plVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pl plVar = this.f312520d;
        if (plVar.F == null) {
            plVar.F = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(plVar.N6());
            df2.pl plVar2 = this.f312520d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = plVar2.F;
            if (f5Var != null) {
                f5Var.f291933e = new df2.nl(plVar2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f312520d.F;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
