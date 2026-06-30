package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l4 f270505d;

    public k4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l4 l4Var) {
        this.f270505d = l4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l4 l4Var = this.f270505d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = l4Var.f270515a;
        w4Var.f270654o = false;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        dVar.f68096xac3be4e = java.lang.System.currentTimeMillis();
        l4Var.f270515a.f270648f.f68103x4a777c2 = c01.id.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = l4Var.f270515a.f270648f;
        dVar2.f68109x90a9378 = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(true);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar2.f68112x10a0fed7 = 101;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", java.lang.Boolean.valueOf(l4Var.f270515a.f270654o), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(l4Var.f270515a.f270648f, new java.lang.String[0])), java.lang.Long.valueOf(l4Var.f270515a.f270648f.f68096xac3be4e));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var2 = l4Var.f270515a;
        w4Var2.mo807x6c193ac1(w4Var2.m47995xb7ba1aa7(), l4Var.f270515a.f270647e);
    }
}
