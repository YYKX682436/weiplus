package ee5;

/* loaded from: classes9.dex */
public final class j2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.m2 f333471e;

    public j2(ae5.g gVar, ee5.m2 m2Var) {
        this.f333470d = gVar;
        this.f333471e = m2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f439742b1;
        ae5.g gVar = this.f333470d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(gVar.f85938i, gVar.f85933d);
        int itemId = menuItem.getItemId();
        ee5.m2 m2Var = this.f333471e;
        m2Var.T6(itemId, n17, m2Var.f333589o);
    }
}
