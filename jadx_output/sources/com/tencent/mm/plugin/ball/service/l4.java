package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class l4 implements com.tencent.mm.ipcinvoker.j {
    private l4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "UpdateCustomViewInMMProcessTask invoke");
        com.tencent.mm.plugin.ball.service.s.H0().b0((com.tencent.mm.plugin.ball.model.BallInfo) obj);
    }
}
