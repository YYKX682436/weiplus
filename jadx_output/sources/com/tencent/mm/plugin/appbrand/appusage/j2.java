package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.k2 f76485e;

    public j2(com.tencent.mm.plugin.appbrand.appusage.k2 k2Var, java.lang.String str) {
        this.f76485e = k2Var;
        this.f76484d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map d17;
        this.f76485e.getClass();
        boolean a17 = gm0.j1.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        java.lang.String str = this.f76484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPushNewOrRedDotLogic", "parseThenProcess, accReady %b, received xml %s", valueOf, str);
        if (a17 && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null)) != null && d17.size() > 0) {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.wxareddot.id");
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.activitytype"), 0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            if (P == 1 || P == 2) {
                int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.close"), 0);
                long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.pushtime"), 0L);
                long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.duration"), 0L);
                long V3 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.wxareddot.frequency"), 0L);
                int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.showType"), 0);
                int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.wxareddot.reason"), 0);
                if (P != 1) {
                    if (P == 2 && !str2.equals((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_MSG_ID_STRING, null))) {
                        com.tencent.mm.plugin.appbrand.appusage.q2.b(P2 != 1, V2, V3);
                        return;
                    }
                    return;
                }
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING;
                if (str2.equals((java.lang.String) c17.m(u3Var, null)) || com.tencent.mm.plugin.appbrand.appusage.r0.e() || com.tencent.mm.sdk.platformtools.t8.m0(com.tencent.mm.sdk.platformtools.x2.f193071a).equals(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.class.getName())) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
                boolean a18 = gm0.j1.a();
                com.tencent.mm.plugin.appbrand.appusage.e2 e2Var = com.tencent.mm.plugin.appbrand.appusage.e2.FORCE_OFF;
                if ((!a18 ? e2Var : com.tencent.mm.plugin.appbrand.appusage.e2.FORCE_ON) == e2Var) {
                    return;
                }
                gm0.j1.u().c().x(u3Var, str2);
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG;
                c18.x(u3Var2, java.lang.Long.valueOf(V));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, java.lang.Integer.valueOf(P3));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_REASON_INT, java.lang.Integer.valueOf(P4));
                if (P2 == 1 && com.tencent.mm.plugin.appbrand.appusage.q2.a()) {
                    com.tencent.mm.plugin.appbrand.appusage.p2 p2Var = com.tencent.mm.plugin.appbrand.appusage.p2.f76539a;
                    p2Var.b((java.lang.String) gm0.j1.u().c().m(u3Var, ""), ((java.lang.Long) gm0.j1.u().c().m(u3Var2, 0L)).longValue(), 4, p2Var.a());
                }
                com.tencent.mm.plugin.appbrand.appusage.q2.c(P2 != 1, V2);
            }
        }
    }
}
