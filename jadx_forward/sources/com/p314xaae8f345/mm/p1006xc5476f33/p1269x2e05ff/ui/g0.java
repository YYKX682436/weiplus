package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f174826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174828f;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f174828f = q0Var;
        this.f174826d = list;
        this.f174827e = c12886x91aa2b6d;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Vector vector;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var = this.f174828f;
        q0Var.getClass();
        try {
            boolean z17 = q0Var.f174882g;
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d> list = this.f174826d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174827e;
            if (!z17) {
                if (!qp1.w.a(list)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "empty ball info list");
                    q0Var.c();
                    return;
                } else if (q0Var.f()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "float ball already created");
                    q0Var.g(list, null, null, c12886x91aa2b6d);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "float ball did not create");
                    q0Var.a();
                    q0Var.g(list, null, null, c12886x91aa2b6d);
                    return;
                }
            }
            java.util.List d17 = qp1.w.d(list);
            if (qp1.w.a(list)) {
                vector = new java.util.Vector();
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 : list) {
                    if (!qp1.w.r(c12886x91aa2b6d2)) {
                        vector.add(c12886x91aa2b6d2);
                    }
                }
            } else {
                vector = new java.util.Vector();
            }
            java.util.Vector vector2 = (java.util.Vector) d17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "doOnFloatBallInfoChanged contentBallInfoList: %s, nonContentBallInfoList: %s", java.lang.Integer.valueOf(vector2.size()), java.lang.Integer.valueOf(vector.size()));
            if (!vector2.isEmpty() || !vector.isEmpty()) {
                q0Var.a();
                if (!vector2.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar2 = q0Var.f174879d;
                    if (nVar2.f174853e == null) {
                        nVar2.b();
                    }
                }
                q0Var.g(list, d17, vector, c12886x91aa2b6d);
            }
            if (vector2.isEmpty() && vector.isEmpty()) {
                q0Var.c();
            } else {
                if (!vector2.isEmpty() || (nVar = q0Var.f174879d) == null) {
                    return;
                }
                nVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallUIManager", e17, "onFloatBallInfoChangedInternal exception", new java.lang.Object[0]);
        }
    }
}
