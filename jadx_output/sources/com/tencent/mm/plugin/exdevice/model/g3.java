package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class g3 extends com.tencent.mm.network.r0 {
    public g3(com.tencent.mm.plugin.exdevice.model.l3 l3Var) {
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        my3.q qVar = (my3.q) ((fy3.e) i95.n0.c(fy3.e.class));
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332822e) || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332821d)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onNetworkChange state " + i17);
        int i18 = qVar.f332824g.f313617d;
        if (i18 == 1 || i18 == 10) {
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.x.class);
        }
    }
}
