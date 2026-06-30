package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class o0 extends com.tencent.mm.network.r0 {
    public o0(com.tencent.mm.modelstat.t0 t0Var) {
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        if (i17 == 4 || i17 == 6) {
            gm0.j1.e().k(new com.tencent.mm.modelstat.n0(this), 3000L);
        }
    }
}
