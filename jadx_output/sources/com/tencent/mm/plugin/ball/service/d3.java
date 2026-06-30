package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class d3 implements com.tencent.mm.ipcinvoker.j {
    private d3() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "InitCustomViewInMMProcessTask invoke");
        com.tencent.mm.plugin.ball.service.s.H0().x(ballInfo, new com.tencent.mm.plugin.ball.service.c3(this, rVar, ballInfo));
    }
}
