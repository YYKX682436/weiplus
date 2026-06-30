package lf0;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399731d;

    public b0(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f399731d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TopStoryLiteAppJsApiFeatureService", "[TopStoryLiteApp]did preload top story liteapp: wxalite71e155e932f19de48da8333a8f225708 pages/videotab/main");
        q80.e0 e0Var = new q80.e0();
        e0Var.f442208a = "wxalite71e155e932f19de48da8333a8f225708";
        e0Var.f442209b = "pages/videotab/main";
        e0Var.f442211d = false;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Rj(this.f399731d, e0Var);
        }
    }
}
