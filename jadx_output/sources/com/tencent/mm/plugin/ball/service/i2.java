package com.tencent.mm.plugin.ball.service;

/* loaded from: classes7.dex */
final class i2 implements com.tencent.mm.ipcinvoker.j {
    private i2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        H0.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resetReadyStatusBallInfo");
        H0.f93222h = null;
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
