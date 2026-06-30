package bg;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19833d;

    public s0(bg.f fVar) {
        this.f19833d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19833d;
        com.tencent.mars.xlog.Log.i(fVar.A(), "*** handler(%s) handlePluginDestroy", fVar.q());
        if (!fVar.X) {
            fVar.W();
        } else if (fVar.G() && fVar.J(false)) {
            fVar.V = true;
            fVar.I1 = true;
        }
        fVar.u();
    }
}
