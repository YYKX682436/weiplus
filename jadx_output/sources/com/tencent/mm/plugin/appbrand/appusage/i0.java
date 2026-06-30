package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.plugin.appbrand.appusage.j3 {
    public i0(int i17, java.lang.String str) {
        super(i17, str, new r45.id7());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.rs3 rs3Var = (r45.rs3) fVar;
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.appusage.j0.f76473g = false;
            if (rs3Var == null) {
                str2 = "resp null";
            } else {
                r45.z50 z50Var = rs3Var.f385173e;
                if (z50Var == null) {
                    str2 = "commuse_appinfo null";
                } else {
                    java.util.LinkedList linkedList3 = z50Var.f391721d;
                    str2 = (linkedList3 == null || linkedList3.size() == 0) ? "common_use null" : rs3Var.f385173e.f391722e == null ? "commuse_config null" : "";
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onCgiBack, errType %d, errCode %d, errMsg %s, resp %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
            long i19 = com.tencent.mm.sdk.platformtools.t8.i1();
            if (i17 == 0 && i18 == 0 && rs3Var != null) {
                r45.z50 z50Var2 = rs3Var.f385173e;
                if (z50Var2 == null || (linkedList2 = z50Var2.f391721d) == null || linkedList2.size() <= 0) {
                    r45.z50 z50Var3 = rs3Var.f385173e;
                    if (z50Var3 == null || !((linkedList = z50Var3.f391721d) == null || linkedList.size() == 0)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetch common used data fail");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "clean common used data");
                        ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).y0(null, 0L, true, 3, null);
                        com.tencent.mm.plugin.appbrand.appusage.j0.a(null);
                    }
                } else {
                    r45.a60 a60Var = rs3Var.f385173e.f391722e;
                    boolean z17 = a60Var != null ? a60Var.f369759g : true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "update common used data refreshImmediately:%b", java.lang.Boolean.valueOf(z17));
                    ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).y0(rs3Var.f385173e.f391721d, 0L, z17, 3, null);
                    com.tencent.mm.plugin.appbrand.appusage.j0.a(rs3Var.f385173e.f391722e);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onCgiBack, next_req_interval:%d, now:%d", java.lang.Integer.valueOf(rs3Var.f385174f), java.lang.Long.valueOf(i19));
                if (rs3Var.f385174f >= 60) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_NEXT_REQ_INTERVAL_LONG, java.lang.Long.valueOf(rs3Var.f385174f));
                    com.tencent.mm.plugin.appbrand.appusage.j0.f76481o = rs3Var.f385174f;
                }
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, java.lang.Long.valueOf(i19));
            com.tencent.mm.plugin.appbrand.appusage.j0.f76480n = i19;
        }
    }
}
