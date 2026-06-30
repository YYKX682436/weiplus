package ee5;

/* loaded from: classes9.dex */
public final class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.i1 f333409e;

    public f1(ae5.g gVar, ee5.i1 i1Var) {
        this.f333408d = gVar;
        this.f333409e = i1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f439742b1;
        ae5.g gVar = this.f333408d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(gVar.f85938i, gVar.f85933d);
        int itemId = menuItem.getItemId();
        ee5.i1 i1Var = this.f333409e;
        i1Var.T6(itemId, n17, i1Var.f333589o);
    }
}
