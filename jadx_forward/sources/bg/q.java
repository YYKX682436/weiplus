package bg;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101360d;

    public q(bg.f fVar) {
        this.f101360d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101360d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "*** handler(%s) handleWebViewDestroy", fVar.q());
        fVar.M();
    }
}
