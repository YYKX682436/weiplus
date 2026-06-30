package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.plugin.ball.ui.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.d f93128a;

    public c(com.tencent.mm.plugin.ball.service.d dVar) {
        this.f93128a = dVar;
    }

    @Override // com.tencent.mm.plugin.ball.ui.v0
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, reach count limit, callback: %d", java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.ball.service.d dVar = this.f93128a;
        if (i18 != 1) {
            if (i18 == 2 && i17 == 1 && (ballInfo = dVar.f93132d) != null) {
                ballInfo.M.f93091n = 2;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f93132d);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, show float menu view");
        gp1.v vVar = dVar.f93136h;
        if (vVar != null) {
            vVar.C0();
            if (dVar.k()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "doContinueAddFloatBall add new after remove floatBall done");
                dVar.t().f93091n = 1;
                dVar.A(true, 7);
            } else if (dVar.f93132d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "doContinueAddFloatBall onReceiveResult not add, canAdd");
                dVar.t().f93091n = 2;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f93132d);
            }
        }
    }
}
