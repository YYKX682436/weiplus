package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
final class d2 implements com.tencent.mm.ipcinvoker.j {
    private d2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        if (ballInfo != null) {
            com.tencent.mm.plugin.ball.service.h.a(ballInfo, com.tencent.mm.plugin.ball.service.s.H0().f93215a);
        }
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
