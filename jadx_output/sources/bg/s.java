package bg;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19832d;

    public s(bg.f fVar) {
        this.f19832d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19832d;
        fVar.T = true;
        if (fVar.U == null) {
            boolean G = fVar.G();
            fVar.U = new java.util.concurrent.atomic.AtomicBoolean(G);
            com.tencent.mars.xlog.Log.i(fVar.A(), "onRuntimeEnterBackground, abandonFocus");
            fVar.G1.a();
            com.tencent.mars.xlog.Log.i(fVar.A(), "onRuntimeEnterBackground, isPlayingWhenEnterBackground:%s", java.lang.Boolean.valueOf(G));
            if (fVar.R1 && fVar.s()) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "onRuntimeEnterBackground, background play audio is enabled");
            } else {
                fVar.J(false);
            }
        }
    }
}
