package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class t5 {
    public t5(kotlin.jvm.internal.i iVar) {
    }

    public static void a(com.tencent.mm.plugin.appbrand.appusage.t5 t5Var, int i17, int i18, com.tencent.mm.plugin.appbrand.appusage.u5 u5Var, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var;
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
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COLLECTION_LIST_FETCH_NEXT_TIME_SEC_LONG, 0L);
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                j17 = ((java.lang.Long) m17).longValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchListFromServer checkFrequency by configStg fail, e=" + e17);
            }
            if (j17 > com.tencent.mm.sdk.platformtools.t8.i1()) {
                if (u5Var == null || (w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)) == null) {
                    return;
                }
                w2Var.doNotify("batch", 3, null);
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COLLECTION_LIST_FETCH_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1() + com.tencent.mm.plugin.appbrand.appusage.v5.f76601b));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchList reason=" + i17 + ", prescene=" + i27);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        new com.tencent.mm.plugin.appbrand.appusage.k3(i17, i27, 2, Integer.MAX_VALUE, 0, "", null, null, "").l().H(new com.tencent.mm.plugin.appbrand.appusage.s5(u5Var, i17, java.lang.System.currentTimeMillis()));
    }
}
