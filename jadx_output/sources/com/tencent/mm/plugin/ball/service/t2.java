package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
final class t2 implements com.tencent.mm.ipcinvoker.k0 {
    private t2() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        int i17 = -1;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView != null) {
                i17 = floatBallView.getCurrentCollapseState();
            } else {
                gp1.j[] jVarArr = gp1.j.f274185d;
            }
        } else {
            gp1.j[] jVarArr2 = gp1.j.f274185d;
        }
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
    }
}
