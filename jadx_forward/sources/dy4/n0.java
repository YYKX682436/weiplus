package dy4;

/* loaded from: classes15.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f326224e;

    public n0(dy4.f1 f1Var, android.view.Surface surface) {
        this.f326223d = f1Var;
        this.f326224e = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f326223d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handler(%s) handlePluginReady", f1Var.q());
        f1Var.f326162p = false;
        f1Var.f326164q = false;
        f1Var.f326165r = false;
        f1Var.f326169v = false;
        android.view.Surface surface = this.f326224e;
        f1Var.f326159m = surface;
        if (f1Var.f326160n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handlePluginReady, setSurface:%s", surface);
            try {
                ye1.e eVar = f1Var.f326160n;
                if (eVar != null) {
                    eVar.mo1864x42c875eb(f1Var.f326159m);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f1Var.x(), "handlePluginReady, setSurface:ex " + e17.getMessage());
            }
        }
    }
}
