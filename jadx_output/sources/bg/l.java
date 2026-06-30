package bg;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19814d;

    public l(bg.f fVar) {
        this.f19814d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        bg.f fVar = this.f19814d;
        com.tencent.mars.xlog.Log.i(fVar.A(), "*** handler(%s) handleWebViewForeground", fVar.q());
        fVar.S = false;
        if (fVar.T) {
            z17 = false;
        } else {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = fVar.U;
            z17 = atomicBoolean != null && atomicBoolean.get();
            fVar.U = null;
        }
        fVar.A();
        if (!fVar.T && fVar.G() && !fVar.D) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewForeground, requestFocus");
            fVar.G1.requestFocus();
        }
        if (fVar.t()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewForeground, resume playing");
        if (fVar.f19764h != null && fVar.f19786z && z17) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewForeground runnable, video playing when enter background");
            fVar.K(false, false);
        }
    }
}
