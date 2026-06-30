package dy4;

/* loaded from: classes8.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326220d;

    public m0(dy4.f1 f1Var) {
        this.f326220d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f326220d;
        f1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handler(%s) handlePluginDestroy", f1Var.q());
        f1Var.K();
        android.view.Surface surface = f1Var.f326159m;
        if (surface != null) {
            surface.release();
            f1Var.f326159m = null;
        }
    }
}
