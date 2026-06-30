package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.n2 f76544a = new com.tencent.mm.plugin.appbrand.appusage.n2();

    public static boolean a() {
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        boolean z17 = longValue > com.tencent.mm.sdk.platformtools.t8.i1();
        if (!z17 && longValue > 0) {
            gm0.j1.u().c().x(u3Var, 0L);
            com.tencent.mm.plugin.appbrand.appusage.p2 p2Var = com.tencent.mm.plugin.appbrand.appusage.p2.f76539a;
            p2Var.b((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 3, p2Var.a());
        }
        return z17;
    }

    public static void b(boolean z17, long j17, long j18) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG, java.lang.Long.valueOf(z17 ? com.tencent.mm.sdk.platformtools.t8.i1() + java.lang.Math.max(0L, j17) : 0L));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG;
        if (!z17) {
            j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        c17.x(u3Var, java.lang.Long.valueOf(j18));
    }

    public static void c(boolean z17, long j17) {
        long max;
        if (!z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG, 0L);
            return;
        }
        if (j17 == 0) {
            max = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        } else {
            max = java.lang.Math.max(0L, j17) + com.tencent.mm.sdk.platformtools.t8.i1();
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG, java.lang.Long.valueOf(max));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_RED_DOT_ONCE_BOOLEAN, java.lang.Boolean.TRUE);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.appbrand.appusage.p2 p2Var = com.tencent.mm.plugin.appbrand.appusage.p2.f76539a;
        p2Var.b((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 1, p2Var.a());
    }
}
