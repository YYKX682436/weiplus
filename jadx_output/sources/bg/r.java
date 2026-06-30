package bg;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19830d;

    public r(bg.f fVar) {
        this.f19830d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        bg.f fVar = this.f19830d;
        fVar.T = false;
        fVar.W = false;
        if (fVar.S) {
            z17 = false;
        } else {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = fVar.U;
            z17 = atomicBoolean != null && atomicBoolean.get();
            fVar.U = null;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onRuntimeEnterForeground, mWebViewInBackground: " + fVar.S);
        if (!fVar.S && fVar.G() && !fVar.D) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onRuntimeEnterForeground, requestFocus");
            fVar.G1.requestFocus();
        }
        if (z17) {
            if (fVar.t()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, cancel resume playing when relaunch");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, isPlayingWhenEnterBackground, try resume");
                fVar.K(false, true);
            }
        }
    }
}
