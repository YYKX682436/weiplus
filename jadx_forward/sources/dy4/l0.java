package dy4;

/* loaded from: classes15.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326218d;

    public l0(dy4.f1 f1Var) {
        this.f326218d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f326218d;
        if (!f1Var.N) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f1Var.Y;
            if (!(atomicBoolean != null ? atomicBoolean.get() : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", f1Var.f334031e);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handleWebViewBackground, video not auto pause, try resume, type:%s", f1Var.f334031e);
                f1Var.A(false, true);
                return;
            }
        }
        ye1.e eVar = f1Var.f326160n;
        if (eVar != null && f1Var.f326168u && f1Var.Y == null) {
            boolean z17 = eVar.mo1856xc00617a4();
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handleWebViewBackground runnable, video playing state when enter background:%s", java.lang.Boolean.valueOf(z17));
            f1Var.z();
        }
    }
}
