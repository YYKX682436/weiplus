package dy4;

/* loaded from: classes15.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326239d;

    public t0(dy4.f1 f1Var) {
        this.f326239d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f326239d;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerCompletion, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onCompletion");
        if (f1Var.J() && (wVar = f1Var.U) != null) {
            try {
                wVar.a("onVideoEnded", wVar.c());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoEnded fail", e17);
            }
            wVar.i();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dy4.v(wVar));
        }
        ye1.e eVar = f1Var.f326160n;
        if (eVar != null) {
            dy4.h1 h1Var = f1Var.X;
            sf.f fVar = f1Var.F;
            h1Var.getClass();
            dy4.g1 g1Var = h1Var.f326197a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g1Var.f326193p) && g1Var.f326181d > 0) {
                g1Var.f326189l = java.lang.System.currentTimeMillis();
                h1Var.b(fVar, eVar, "onMediaPlayerVideoEnd");
            }
        }
        if (!f1Var.f326154J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onCompletion, video end playing");
            f1Var.L = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onCompletion, video loop playing");
            f1Var.f326162p = true;
            f1Var.H(0L);
        }
    }
}
