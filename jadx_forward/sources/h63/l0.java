package h63;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f360795g;

    public l0(android.content.Context context, h63.v0 v0Var, java.lang.String str, java.lang.Runnable runnable) {
        this.f360792d = context;
        this.f360793e = v0Var;
        this.f360794f = str;
        this.f360795g = runnable;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Context context = this.f360792d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new h63.j0(context);
        k0Var.f293414s = new h63.k0(this.f360793e, this.f360794f, context, this.f360795g);
        k0Var.v();
    }
}
