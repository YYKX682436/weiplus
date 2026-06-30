package at2;

/* loaded from: classes3.dex */
public final class y implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at2.b0 f13777a;

    public y(at2.b0 b0Var) {
        this.f13777a = b0Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        at2.b0 b0Var = this.f13777a;
        com.tencent.mars.xlog.Log.i(b0Var.f13636p, "request miniWindow, onResultAllow");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        b0Var.t1();
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        at2.b0 b0Var = this.f13777a;
        com.tencent.mars.xlog.Log.e(b0Var.f13636p, "request miniWindow, onResultCancel");
        ((ct2.j) b0Var.P0(ct2.j.class)).Y6(false);
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        at2.b0 b0Var = this.f13777a;
        com.tencent.mars.xlog.Log.e(b0Var.f13636p, "request miniWindow, onResultRefuse");
        ((ct2.j) b0Var.P0(ct2.j.class)).Y6(false);
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
