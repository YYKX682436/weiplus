package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f93293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93295f;

    public g0(com.tencent.mm.plugin.ball.ui.q0 q0Var, java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93295f = q0Var;
        this.f93293d = list;
        this.f93294e = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Vector vector;
        com.tencent.mm.plugin.ball.ui.n nVar;
        com.tencent.mm.plugin.ball.ui.q0 q0Var = this.f93295f;
        q0Var.getClass();
        try {
            boolean z17 = q0Var.f93349g;
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> list = this.f93293d;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93294e;
            if (!z17) {
                if (!qp1.w.a(list)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "empty ball info list");
                    q0Var.c();
                    return;
                } else if (q0Var.f()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "float ball already created");
                    q0Var.g(list, null, null, ballInfo);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "float ball did not create");
                    q0Var.a();
                    q0Var.g(list, null, null, ballInfo);
                    return;
                }
            }
            java.util.List d17 = qp1.w.d(list);
            if (qp1.w.a(list)) {
                vector = new java.util.Vector();
                for (com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 : list) {
                    if (!qp1.w.r(ballInfo2)) {
                        vector.add(ballInfo2);
                    }
                }
            } else {
                vector = new java.util.Vector();
            }
            java.util.Vector vector2 = (java.util.Vector) d17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "doOnFloatBallInfoChanged contentBallInfoList: %s, nonContentBallInfoList: %s", java.lang.Integer.valueOf(vector2.size()), java.lang.Integer.valueOf(vector.size()));
            if (!vector2.isEmpty() || !vector.isEmpty()) {
                q0Var.a();
                if (!vector2.isEmpty()) {
                    com.tencent.mm.plugin.ball.ui.n nVar2 = q0Var.f93346d;
                    if (nVar2.f93320e == null) {
                        nVar2.b();
                    }
                }
                q0Var.g(list, d17, vector, ballInfo);
            }
            if (vector2.isEmpty() && vector.isEmpty()) {
                q0Var.c();
            } else {
                if (!vector2.isEmpty() || (nVar = q0Var.f93346d) == null) {
                    return;
                }
                nVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallUIManager", e17, "onFloatBallInfoChangedInternal exception", new java.lang.Object[0]);
        }
    }
}
