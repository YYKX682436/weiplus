package ry4;

/* loaded from: classes.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f483199e;

    public n0(ry4.d1 d1Var, int i17) {
        this.f483198d = d1Var;
        this.f483199e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            int i18 = this.f483199e;
            int i19 = i18 + 1;
            ry4.d1 d1Var = this.f483198d;
            java.util.List list = d1Var.f483143f;
            ((java.util.ArrayList) list).remove(i18);
            ry4.g gVar = d1Var.f483142e;
            if (gVar != null) {
                gVar.m8146xced61ae5();
            }
            d1Var.Z6();
            d1Var.W6(1, kz5.b0.c(java.lang.Integer.valueOf(i19)));
            d1Var.X6(kz5.n0.S0(list));
        }
    }
}
