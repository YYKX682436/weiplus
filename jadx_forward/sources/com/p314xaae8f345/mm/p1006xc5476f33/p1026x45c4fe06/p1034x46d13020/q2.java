package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n2 f158077a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n2();

    public static boolean a() {
        if (!gm0.j1.a()) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        boolean z17 = longValue > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (!z17 && longValue > 0) {
            gm0.j1.u().c().x(u3Var, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2.f158072a;
            p2Var.b((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 3, p2Var.a());
        }
        return z17;
    }

    public static void b(boolean z17, long j17, long j18) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG, java.lang.Long.valueOf(z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + java.lang.Math.max(0L, j17) : 0L));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG;
        if (!z17) {
            j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        c17.x(u3Var, java.lang.Long.valueOf(j18));
    }

    public static void c(boolean z17, long j17) {
        long max;
        if (!z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG, 0L);
            return;
        }
        if (j17 == 0) {
            max = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        } else {
            max = java.lang.Math.max(0L, j17) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG, java.lang.Long.valueOf(max));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_RED_DOT_ONCE_BOOLEAN, java.lang.Boolean.TRUE);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2.f158072a;
        p2Var.b((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 1, p2Var.a());
    }
}
