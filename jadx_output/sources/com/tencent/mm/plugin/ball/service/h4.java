package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class h4 implements com.tencent.mm.ipcinvoker.j {
    private h4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.ball.model.BallInfo info = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        com.tencent.mm.plugin.ball.service.g gVar = com.tencent.mm.plugin.ball.service.g.f93161a;
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String b17 = gVar.b(info);
        java.lang.String e17 = info.e();
        kotlin.jvm.internal.o.f(e17, "generateHashKey(...)");
        java.lang.String a17 = gVar.a(e17);
        if (com.tencent.mm.vfs.w6.j(b17)) {
            if (com.tencent.mm.vfs.w6.j(a17)) {
                com.tencent.mm.vfs.w6.h(a17);
            }
            com.tencent.mm.vfs.w6.w(b17, a17);
        }
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
