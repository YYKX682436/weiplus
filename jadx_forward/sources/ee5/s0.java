package ee5;

/* loaded from: classes9.dex */
public final class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f333574e;

    public s0(ae5.g gVar, ee5.v0 v0Var) {
        this.f333573d = gVar;
        this.f333574e = v0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f439742b1;
        ae5.g gVar = this.f333573d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(gVar.f85938i, gVar.f85933d);
        int itemId = menuItem.getItemId();
        ee5.v0 v0Var = this.f333574e;
        v0Var.T6(itemId, n17, v0Var.f333589o);
    }
}
