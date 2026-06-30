package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
final class e3 implements com.tencent.mm.ipcinvoker.k0 {
    private e3() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        java.util.List list = H0.f93215a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                if (ballInfo.f93046d == i17 && !ballInfo.f93045J) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}
