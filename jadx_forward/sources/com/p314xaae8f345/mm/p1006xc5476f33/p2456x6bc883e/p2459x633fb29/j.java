package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public abstract class j {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k kVar) {
        java.lang.String str;
        if (x51.o1.V) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterLiteAppManager", "updateLiteAppInfo, but ignoreGameLiteCheck, patchId: ", kVar.f269966c);
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(kVar.f269964a);
        if (Bj != null && (str = Bj.f14368xd0d13783) != null && str.equals(kVar.f269966c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterLiteAppManager", "updateLiteAppInfo, patchId is same : ", kVar.f269966c);
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
        c3712x3ed8a441.f14359x58b7f1c = kVar.f269964a;
        c3712x3ed8a441.f14368xd0d13783 = kVar.f269966c;
        c3712x3ed8a441.f14369x346425 = kVar.f269967d;
        c3712x3ed8a441.f14372xa8503287 = kVar.f269965b;
        c3712x3ed8a441.f14373x368f3a = "release";
        c3712x3ed8a441.f14374xee5c7336 = java.lang.System.currentTimeMillis() / 1000;
        c3712x3ed8a441.f14375x14f51cd8 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65338x15e79bbb(kVar.f269967d, kVar.f269964a, kVar.f269965b);
        c3712x3ed8a441.f14361x117d5bfa = "game";
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().V(c3712x3ed8a441);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str2 = c3712x3ed8a441.f14359x58b7f1c;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65664xefe6099a(str2);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppFeatureService", e18, "", new java.lang.Object[0]);
        }
    }
}
