package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int i17 = event.f135532g.f89122a;
        boolean z17 = (i17 & 1) != 0;
        boolean z18 = (i17 & 8) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBeforeAggressiveCleanCacheEventListener", "received clean event, flag is " + event.f135532g.f89122a + ", is system " + z17 + ", is appbrand: " + z18);
        if (z17 || z18) {
            if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48900x42891314();
            }
            synchronized (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129214e) {
                rVar = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129215f;
                if (rVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("INSTANCE_");
                    throw null;
                }
            }
            rVar.q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129167h);
        }
        return false;
    }
}
