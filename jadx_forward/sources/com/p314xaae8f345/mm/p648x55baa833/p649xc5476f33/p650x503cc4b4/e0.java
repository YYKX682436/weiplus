package com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4;

/* loaded from: classes11.dex */
public class e0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5761xb35fab50 c5761xb35fab50 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5761xb35fab50) abstractC20979x809547d1;
        if ((c5761xb35fab50 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5761xb35fab50) && c5761xb35fab50.f136080g.f89436a != null) {
            rn.i Di = ((nn.j) i95.n0.c(nn.j.class)).Di();
            am.sl slVar = c5761xb35fab50.f136080g;
            rn.h y07 = Di.y0(slVar.f89436a.Q0());
            if (y07 == null) {
                slVar.f89436a.Q0();
            } else if (y07.f66386xae782d0e == 0) {
                slVar.f89436a.Q0();
            } else {
                y07.f66386xae782d0e = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyGroupToolsResetListener", "NotifyGroupToolsResetEvent(%s) result:%s", slVar.f89436a.Q0(), java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(y07, new java.lang.String[0])));
            }
        }
        return false;
    }
}
