package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
final class m4 implements com.tencent.mm.ipcinvoker.j {
    private m4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo floatBallServiceProxy$IPCKeyBoardChangedInfo = (com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo) obj;
        com.tencent.mm.plugin.ball.service.s.H0().m(floatBallServiceProxy$IPCKeyBoardChangedInfo.f93109d, floatBallServiceProxy$IPCKeyBoardChangedInfo.f93110e, floatBallServiceProxy$IPCKeyBoardChangedInfo.f93111f, floatBallServiceProxy$IPCKeyBoardChangedInfo.f93112g);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
