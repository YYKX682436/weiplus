package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class t5 {
    public t5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t5 t5Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u5 u5Var, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var;
        if ((i19 & 1) != 0) {
            i17 = 5;
        }
        int i27 = (i19 & 2) != 0 ? 0 : i18;
        if ((i19 & 4) != 0) {
            u5Var = null;
        }
        t5Var.getClass();
        if (i17 == 2 || i17 == 7 || i17 == 8) {
            long j17 = 0;
            try {
                java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COLLECTION_LIST_FETCH_NEXT_TIME_SEC_LONG, 0L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                j17 = ((java.lang.Long) m17).longValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchListFromServer checkFrequency by configStg fail, e=" + e17);
            }
            if (j17 > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                if (u5Var == null || (w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)) == null) {
                    return;
                }
                w2Var.mo142179xf35bbb4("batch", 3, null);
                return;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COLLECTION_LIST_FETCH_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v5.f158134b));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchList reason=" + i17 + ", prescene=" + i27);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k3(i17, i27, 2, Integer.MAX_VALUE, 0, "", null, null, "").l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s5(u5Var, i17, java.lang.System.currentTimeMillis()));
    }
}
