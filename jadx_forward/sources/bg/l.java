package bg;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101347d;

    public l(bg.f fVar) {
        this.f101347d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        bg.f fVar = this.f101347d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "*** handler(%s) handleWebViewForeground", fVar.q());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewForeground, requestFocus");
            fVar.G1.mo51100x4c4bb389();
        }
        if (fVar.t()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewForeground, resume playing");
        if (fVar.f101297h != null && fVar.f101319z && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewForeground runnable, video playing when enter background");
            fVar.K(false, false);
        }
    }
}
