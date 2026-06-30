package com.tencent.mm.feature.app.extension;

/* loaded from: classes9.dex */
public class q0 implements hm0.w {
    @Override // hm0.w
    public void onNetworkChange(int i17) {
        if ((i17 == 4 || i17 == 6) && gm0.j1.a() && gm0.j1.b().f273254q && !gm0.m.r()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LegacyWorkProfileAsyncService", "dkmsg Network connected , try send msg.");
            w11.p1 p1Var = w11.p1.f442102d;
            w11.r1 r1Var = new w11.r1();
            r1Var.f442137l = p1Var;
            r1Var.a().a();
        }
    }
}
