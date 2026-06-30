package ee5;

/* loaded from: classes9.dex */
public final class e2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f333399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.h2 f333400e;

    public e2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ee5.h2 h2Var) {
        this.f333399d = f9Var;
        this.f333400e = h2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f333399d;
        if (f9Var != null) {
            int itemId = menuItem.getItemId();
            ee5.h2 h2Var = this.f333400e;
            h2Var.T6(itemId, f9Var, h2Var.f333589o);
        }
    }
}
