package it2;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ it2.x f376048d;

    public o(it2.x xVar) {
        this.f376048d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "auto destroy task triggered");
        it2.x xVar = this.f376048d;
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "destroy");
        jc3.j0 j0Var = xVar.f376063d;
        if (j0Var != null) {
            rc3.w0 w0Var = (rc3.w0) j0Var;
            w0Var.T(new rc3.v0(w0Var, xVar));
            w0Var.m162151x5cd39ffa();
            xVar.Ni(null);
            xVar.Di(it2.n.f376047d);
        }
    }
}
