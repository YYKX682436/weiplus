package bg;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101363d;

    public r(bg.f fVar) {
        this.f101363d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        bg.f fVar = this.f101363d;
        fVar.T = false;
        fVar.W = false;
        if (fVar.S) {
            z17 = false;
        } else {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = fVar.U;
            z17 = atomicBoolean != null && atomicBoolean.get();
            fVar.U = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onRuntimeEnterForeground, mWebViewInBackground: " + fVar.S);
        if (!fVar.S && fVar.G() && !fVar.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onRuntimeEnterForeground, requestFocus");
            fVar.G1.mo51100x4c4bb389();
        }
        if (z17) {
            if (fVar.t()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, cancel resume playing when relaunch");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, isPlayingWhenEnterBackground, try resume");
                fVar.K(false, true);
            }
        }
    }
}
