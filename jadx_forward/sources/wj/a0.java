package wj;

/* loaded from: classes12.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f527904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f527905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f527906f;

    public a0(wj.j0 j0Var, wj.t0 t0Var, yz5.l lVar) {
        this.f527904d = j0Var;
        this.f527905e = t0Var;
        this.f527906f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        wj.j0 j0Var = this.f527904d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j0Var.f527958f;
        wj.x xVar = new wj.x(h0Var, this.f527906f);
        wj.t0 t0Var = this.f527905e;
        concurrentHashMap.computeIfPresent(t0Var, xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdCommonFeatureService", "getAdInfoAsync, timeout, posId: " + t0Var);
        wj.p pj6 = j0Var.pj(t0Var);
        j0Var.nj(t0Var, pj6, "timeout=1");
        yz5.l lVar = (yz5.l) h0Var.f391656d;
        if (lVar != null) {
            pm0.v.X(new wj.y(lVar, pj6.f527995a));
        }
        j0Var.f527959g.computeIfPresent(t0Var, new wj.z(this));
    }
}
