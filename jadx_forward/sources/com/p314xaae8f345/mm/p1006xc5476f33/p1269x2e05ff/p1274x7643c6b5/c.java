package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d f174661a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar) {
        this.f174661a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, reach count limit, callback: %d", java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar = this.f174661a;
        if (i18 != 1) {
            if (i18 == 2 && i17 == 1 && (c12886x91aa2b6d = dVar.f174665d) != null) {
                c12886x91aa2b6d.M.f174624n = 2;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f174665d);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, show float menu view");
        gp1.v vVar = dVar.f174669h;
        if (vVar != null) {
            vVar.C0();
            if (dVar.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "doContinueAddFloatBall add new after remove floatBall done");
                dVar.t().f174624n = 1;
                dVar.A(true, 7);
            } else if (dVar.f174665d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "doContinueAddFloatBall onReceiveResult not add, canAdd");
                dVar.t().f174624n = 2;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f174665d);
            }
        }
    }
}
