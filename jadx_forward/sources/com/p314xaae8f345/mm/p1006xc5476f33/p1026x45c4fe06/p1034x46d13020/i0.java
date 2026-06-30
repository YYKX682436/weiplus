package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j3 {
    public i0(int i17, java.lang.String str) {
        super(i17, str, new r45.id7());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.rs3 rs3Var = (r45.rs3) fVar;
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158006g = false;
            if (rs3Var == null) {
                str2 = "resp null";
            } else {
                r45.z50 z50Var = rs3Var.f466706e;
                if (z50Var == null) {
                    str2 = "commuse_appinfo null";
                } else {
                    java.util.LinkedList linkedList3 = z50Var.f473254d;
                    str2 = (linkedList3 == null || linkedList3.size() == 0) ? "common_use null" : rs3Var.f466706e.f473255e == null ? "commuse_config null" : "";
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onCgiBack, errType %d, errCode %d, errMsg %s, resp %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
            long i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            if (i17 == 0 && i18 == 0 && rs3Var != null) {
                r45.z50 z50Var2 = rs3Var.f466706e;
                if (z50Var2 == null || (linkedList2 = z50Var2.f473254d) == null || linkedList2.size() <= 0) {
                    r45.z50 z50Var3 = rs3Var.f466706e;
                    if (z50Var3 == null || !((linkedList = z50Var3.f473254d) == null || linkedList.size() == 0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetch common used data fail");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "clean common used data");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).y0(null, 0L, true, 3, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.a(null);
                    }
                } else {
                    r45.a60 a60Var = rs3Var.f466706e.f473255e;
                    boolean z17 = a60Var != null ? a60Var.f451292g : true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "update common used data refreshImmediately:%b", java.lang.Boolean.valueOf(z17));
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).y0(rs3Var.f466706e.f473254d, 0L, z17, 3, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.a(rs3Var.f466706e.f473255e);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onCgiBack, next_req_interval:%d, now:%d", java.lang.Integer.valueOf(rs3Var.f466707f), java.lang.Long.valueOf(i19));
                if (rs3Var.f466707f >= 60) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_NEXT_REQ_INTERVAL_LONG, java.lang.Long.valueOf(rs3Var.f466707f));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o = rs3Var.f466707f;
                }
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, java.lang.Long.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n = i19;
        }
    }
}
