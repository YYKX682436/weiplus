package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class u4 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f270624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 f270625b;

    public u4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var, dn.h hVar) {
        this.f270625b = v4Var;
        this.f270624a = hVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4 v4Var = this.f270625b;
        if (i17 != 4 || i18 != 102) {
            if (i17 == 0 && i18 == 0) {
                v4Var.f270643d.J(this.f270624a);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = v4Var.f270643d;
            w4Var.f270647e.mo815x76e0bfae(i17, i18, "", w4Var);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var2 = v4Var.f270643d;
        if (w4Var2.f270648f.f68113xeb1a61d6 <= 26214400) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t4(this));
            return;
        }
        w4Var2.f270649g.T = "";
        if (!((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s4(this));
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var3 = v4Var.f270643d;
        e17.g(new g35.e(w4Var3.f270649g, w4Var3.f270648f.f68099xfeae815, w4Var3.f270650h, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r4(this)));
    }
}
