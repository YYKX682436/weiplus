package gt;

/* loaded from: classes7.dex */
public class t5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b c6019x2a86117b = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            return false;
        }
        c6019x2a86117b.f136313h.f89109a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.d();
        if (c6019x2a86117b.f136312g.f88995a) {
            am.ou ouVar = c6019x2a86117b.f136313h;
            ouVar.f89110b = false;
            ouVar.f89111c = false;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.e()) {
                ouVar.f89111c = true;
            } else {
                boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i2 i2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i2.NONE;
                if (a17) {
                    int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, 0)).intValue();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i2[] m49773xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i2.m49773xcee59d22();
                    int length = m49773xcee59d22.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i2 i2Var2 = m49773xcee59d22[i17];
                        if (i2Var2.f157999d == intValue) {
                            i2Var = i2Var2;
                            break;
                        }
                        i17++;
                    }
                }
                int ordinal = i2Var.ordinal();
                if (ordinal == 1) {
                    ouVar.f89110b = true;
                } else if (ordinal == 2) {
                    ouVar.f89111c = true;
                }
            }
            if (ouVar.f89110b || ouVar.f89111c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
                if (gm0.j1.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2.f158072a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN;
                    if (!((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                        p2Var.b((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 0, p2Var.a());
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.f158077a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
            if (gm0.j1.a() && com.p314xaae8f345.mm.p944x882e457a.z2.c()) {
                long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG, 0L)).longValue();
                long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG, java.lang.Long.valueOf(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697))).longValue();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_LAST_TIME_SECOND_LONG;
                long longValue3 = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue() + longValue2;
                if (longValue3 > 0 && i18 < longValue && i18 >= longValue3) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h e17 = i11.h.e();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.m2 m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.m2(n2Var);
                    ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a).add(m2Var);
                    e17.j(m2Var, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
                    gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(i18));
                }
            }
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.a(false) ? 1 : 2;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.f158091e >= 1000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.f158092f = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.f158092f = false;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.f158092f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.f158091e = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportFindMorePageExposed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.b(1, 0, "", "", i19, 0);
            }
        }
        return true;
    }
}
