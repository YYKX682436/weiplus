package ee5;

/* loaded from: classes9.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.d1 f333346e;

    public a1(ae5.g gVar, ee5.d1 d1Var) {
        this.f333345d = gVar;
        this.f333346e = d1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f439742b1;
        ae5.g gVar = this.f333345d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(gVar.f85938i, gVar.f85933d);
        int itemId = menuItem.getItemId();
        ee5.d1 d1Var = this.f333346e;
        d1Var.T6(itemId, n17, d1Var.f333589o);
    }
}
