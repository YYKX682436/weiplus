package ry4;

/* loaded from: classes.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f483111e;

    public a1(ry4.d1 d1Var, int i17) {
        this.f483110d = d1Var;
        this.f483111e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ry4.d1 d1Var = this.f483110d;
            int i18 = this.f483111e;
            if (i18 < 0) {
                d1Var.getClass();
            } else {
                if (i18 >= ((java.util.ArrayList) d1Var.f483143f).size()) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) d1Var.m158354x19263085(), 1, false);
                k0Var.f293405n = new ry4.m0(d1Var);
                k0Var.f293414s = new ry4.n0(d1Var, i18);
                k0Var.v();
            }
        }
    }
}
