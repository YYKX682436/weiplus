package ck1;

/* loaded from: classes4.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.t0 f42404e;

    public z(ck1.k0 k0Var, ck1.t0 t0Var) {
        this.f42403d = k0Var;
        this.f42404e = t0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ck1.t0 t0Var = this.f42404e;
        ck1.k0 k0Var = this.f42403d;
        ck1.k0.x(k0Var, menuItem, new ck1.y(k0Var, t0Var));
    }
}
