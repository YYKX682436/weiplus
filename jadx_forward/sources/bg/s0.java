package bg;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101366d;

    public s0(bg.f fVar) {
        this.f101366d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101366d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "*** handler(%s) handlePluginDestroy", fVar.q());
        if (!fVar.X) {
            fVar.W();
        } else if (fVar.G() && fVar.J(false)) {
            fVar.V = true;
            fVar.I1 = true;
        }
        fVar.u();
    }
}
