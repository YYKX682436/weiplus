package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class e4 implements com.tencent.mm.ipcinvoker.j {
    private e4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.service.d4(this, (com.tencent.mm.plugin.ball.model.BallInfo) obj));
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
