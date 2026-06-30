package bg;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19827d;

    public q(bg.f fVar) {
        this.f19827d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19827d;
        com.tencent.mars.xlog.Log.i(fVar.A(), "*** handler(%s) handleWebViewDestroy", fVar.q());
        fVar.M();
    }
}
