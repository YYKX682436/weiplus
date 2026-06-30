package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class j2 implements com.tencent.mm.ipcinvoker.j {
    private j2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        H0.getClass();
        H0.x0(ballInfo, ballInfo.N);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
