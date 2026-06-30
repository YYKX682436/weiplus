package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
final class k4 implements com.tencent.mm.ipcinvoker.j {
    private k4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel floatBallServiceProxy$UpdateBallVisibilityParcel = (com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel) obj;
        com.tencent.mm.plugin.ball.service.s.H0().N(floatBallServiceProxy$UpdateBallVisibilityParcel.f93116e, floatBallServiceProxy$UpdateBallVisibilityParcel.f93115d);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
