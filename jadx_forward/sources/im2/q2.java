package im2;

/* loaded from: classes3.dex */
public final class q2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d32 f374037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374038e;

    public q2(int i17, r45.d32 d32Var, int i18, im2.z3 z3Var) {
        this.f374037d = d32Var;
        this.f374038e = z3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        im2.z3 z3Var = this.f374038e;
        if (itemId == 0) {
            r45.d32 d32Var = this.f374037d;
            if (d32Var != null) {
                z3Var.n7(d32Var);
                return;
            }
            return;
        }
        if (itemId == 1) {
            z3Var.Z6().m57280xb07cee8c().setText((java.lang.CharSequence) null);
            z3Var.f374205z1 = null;
        }
    }
}
