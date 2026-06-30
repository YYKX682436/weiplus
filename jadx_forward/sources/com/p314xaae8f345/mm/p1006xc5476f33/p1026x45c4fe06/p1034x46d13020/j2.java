package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k2 f158018e;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k2 k2Var, java.lang.String str) {
        this.f158018e = k2Var;
        this.f158017d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map d17;
        this.f158018e.getClass();
        boolean a17 = gm0.j1.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        java.lang.String str = this.f158017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPushNewOrRedDotLogic", "parseThenProcess, accReady %b, received xml %s", valueOf, str);
        if (a17 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null)) != null && d17.size() > 0) {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.wxareddot.id");
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.activitytype"), 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            if (P == 1 || P == 2) {
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.close"), 0);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.pushtime"), 0L);
                long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.duration"), 0L);
                long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.frequency"), 0L);
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.showType"), 0);
                int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.reason"), 0);
                if (P != 1) {
                    if (P == 2 && !str2.equals((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_MSG_ID_STRING, null))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.b(P2 != 1, V2, V3);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING;
                if (str2.equals((java.lang.String) c17.m(u3Var, null)) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.e() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.class.getName())) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
                boolean a18 = gm0.j1.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e2 e2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e2.FORCE_OFF;
                if ((!a18 ? e2Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e2.FORCE_ON) == e2Var) {
                    return;
                }
                gm0.j1.u().c().x(u3Var, str2);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG;
                c18.x(u3Var2, java.lang.Long.valueOf(V));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, java.lang.Integer.valueOf(P3));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_REASON_INT, java.lang.Integer.valueOf(P4));
                if (P2 == 1 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2.f158072a;
                    p2Var.b((java.lang.String) gm0.j1.u().c().m(u3Var, ""), ((java.lang.Long) gm0.j1.u().c().m(u3Var2, 0L)).longValue(), 4, p2Var.a());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.c(P2 != 1, V2);
            }
        }
    }
}
