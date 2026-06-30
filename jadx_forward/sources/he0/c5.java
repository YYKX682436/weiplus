package he0;

/* loaded from: classes4.dex */
public class c5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final i64.j0 f362207d;

    public c5() {
        super(0);
        this.f362207d = new he0.b5(this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07;
        java.lang.String str3;
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad2;
        i64.a aVar;
        boolean z19;
        int i17;
        java.lang.String str4;
        java.lang.String str5;
        r45.r2 r2Var;
        r45.r2 r2Var2;
        java.lang.String str6 = "callback";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9 c5909x7c5c81e9 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9) abstractC20979x809547d1;
        java.lang.String str7 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        if (gm0.j1.a()) {
            try {
                c11137xb05b06ad = c5909x7c5c81e9.f136213g.f89743a;
                y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(c11137xb05b06ad.f153001f);
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                str2 = "MicroMsg.ReportAdClickListener";
            }
            if (y07 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = c11137xb05b06ad.f152999d == 2 ? m70298xd15b2ed8.m70356x450e1efa() : m70298xd15b2ed8.m70346x10413e67();
                ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAdFeed", ca4.z0.t0(m70298xd15b2ed8.f68891x29d1292e));
                if (m70356x450e1efa == null) {
                    str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                    z17 = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                    z18 = z17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                    return z18;
                }
                java.lang.String str8 = m70356x450e1efa.f38106x4281f227;
                java.lang.String d17 = me4.c.d(str8);
                i64.a aVar2 = new i64.a();
                if (ca4.m0.i0()) {
                    aVar2.f370576a = ca4.m0.t(m70298xd15b2ed8);
                }
                aVar2.f370577b = ca4.m0.C(m70298xd15b2ed8);
                aVar2.f370578c = (int) c11137xb05b06ad.f153011s;
                aVar2.f370579d = c11137xb05b06ad.f153012t;
                aVar2.f370585j = c11137xb05b06ad;
                aVar2.f370586k = m70356x450e1efa.f38104xce64ddf1;
                aVar2.f370588m = m70356x450e1efa.aid;
                aVar2.f370589n = m70356x450e1efa.f38103xc060c120;
                aVar2.f370590o = m70356x450e1efa.pId;
                aVar2.f370587l = m70298xd15b2ed8.m70354x74235b3e().f38172xd73c98cc;
                aVar2.f370591p = c11137xb05b06ad.f153013u;
                aVar2.f370592q = m70298xd15b2ed8.m70354x74235b3e().m70140xf2f65501() ? 1 : 0;
                if (m70356x450e1efa.m70106x7ba4fd89() && l44.u3.b(m70298xd15b2ed8.m70354x74235b3e())) {
                    aVar2.f370580e = l44.u3.a(m70356x450e1efa.f38052x97c8d728.f247459a) ? 1 : 0;
                }
                aVar2.f370581f = v34.b.d();
                v34.b.c();
                aVar2.f370582g = "";
                aVar2.f370583h = v34.b.e();
                aVar2.f370584i = v34.b.a();
                aVar2.f370594s = m70298xd15b2ed8.m70354x74235b3e().f38261xc453974;
                if (c11137xb05b06ad.f152999d == 0) {
                    java.lang.String O = ca4.m0.O();
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (O != null) {
                        str7 = O;
                    }
                    aVar2.f370593r = str7;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdClickListener", "timelineSessionId=" + aVar2.f370593r);
                }
                java.lang.String t07 = ca4.z0.t0(m70298xd15b2ed8.f68891x29d1292e);
                int i18 = c11137xb05b06ad.f152999d;
                i64.j0 j0Var = this.f362207d;
                try {
                    if (i18 == 2) {
                        try {
                            sb6 = new java.lang.StringBuilder("report ad click, at detail, exposureTime=");
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                        }
                        try {
                            sb6.append(c11137xb05b06ad.f153010r);
                            sb6.append(", clkPos=");
                            sb6.append(c11137xb05b06ad.f153002g);
                            sb6.append(", source=");
                            sb6.append(c11137xb05b06ad.f152999d);
                            sb6.append(", snsId=");
                            sb6.append(t07);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdClickListener", sb6.toString());
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                            i64.l0 l0Var = new i64.l0(c11137xb05b06ad.f153001f, m70356x450e1efa.f38105xcf532ea0, c11137xb05b06ad.f153002g, c11137xb05b06ad.f153003h, c11137xb05b06ad.f153000e, "", m70298xd15b2ed8.m70353x104668f3(), m70298xd15b2ed8.m70371x485d7().f39040xbd345fc4, c11137xb05b06ad.f153009q, m70298xd15b2ed8.m70351xaa22b9ed().m70303x1b6a23e3(), m70298xd15b2ed8.m70351xaa22b9ed().m70302xec4a6114(), c11137xb05b06ad.f153010r, str8, d17, aVar2, null);
                            l0Var.f370753g = j0Var;
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(l0Var);
                            i64.u1.c(44, 1, 0, t07);
                            c11137xb05b06ad2 = c11137xb05b06ad;
                            aVar = aVar2;
                            str2 = "MicroMsg.ReportAdClickListener";
                            z19 = true;
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                            str2 = "MicroMsg.ReportAdClickListener";
                            str6 = "callback";
                            str = str3;
                            z17 = false;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "report ad click error", new java.lang.Object[0]);
                            ca4.q.c("clickReportError", e);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                            z18 = z17;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                            return z18;
                        }
                    } else {
                        str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportAdClickListener", "report ad click, exposureTime=" + c11137xb05b06ad.f153010r + ", clkPos=" + c11137xb05b06ad.f153002g + ", source=" + c11137xb05b06ad.f152999d + ", snsId=" + t07);
                        long j17 = c11137xb05b06ad.f153001f;
                        java.lang.String str9 = m70356x450e1efa.f38105xcf532ea0;
                        int i19 = c11137xb05b06ad.f153002g;
                        int i27 = c11137xb05b06ad.f153003h;
                        int i28 = c11137xb05b06ad.f153000e;
                        int m70353x104668f3 = m70298xd15b2ed8.m70353x104668f3();
                        java.lang.String str10 = m70298xd15b2ed8.m70371x485d7().f39040xbd345fc4;
                        int i29 = c11137xb05b06ad.f153009q;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m70313x3f7dbf73 = m70298xd15b2ed8.m70351xaa22b9ed().m70313x3f7dbf73();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m70312x94afa0a4 = m70298xd15b2ed8.m70351xaa22b9ed().m70312x94afa0a4();
                        long j18 = c11137xb05b06ad.f153010r;
                        if (c11137xb05b06ad.f152999d == 0) {
                            l44.i iVar = l44.i.f397701a;
                            java.lang.String str11 = "getAdClickQualityInfo";
                            str2 = "MicroMsg.ReportAdClickListener";
                            try {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickQualityInfo", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                if (m70298xd15b2ed8.m70367x7525eefd() != null) {
                                    aVar = aVar2;
                                    c11137xb05b06ad2 = c11137xb05b06ad;
                                    str5 = str10;
                                    str11 = "getAdClickQualityInfo";
                                    str4 = str8;
                                    if (ca4.m0.u0(e42.c0.clicfg_ad_timeline_click_quality_click_report_disabled, 0) != 1) {
                                        r45.r2 r2Var3 = (r45.r2) l44.i.f397704d.get(m70298xd15b2ed8.m70367x7525eefd());
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str11, "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                        r2Var2 = r2Var3;
                                        r2Var = r2Var2;
                                    }
                                } else {
                                    c11137xb05b06ad2 = c11137xb05b06ad;
                                    str4 = str8;
                                    aVar = aVar2;
                                    str5 = str10;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str11, "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                r2Var2 = null;
                                r2Var = r2Var2;
                            } catch (java.lang.Exception e27) {
                                e = e27;
                                str6 = "callback";
                                str = str3;
                                z17 = false;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "report ad click error", new java.lang.Object[0]);
                                ca4.q.c("clickReportError", e);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                                z18 = z17;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                                return z18;
                            }
                        } else {
                            c11137xb05b06ad2 = c11137xb05b06ad;
                            str4 = str8;
                            aVar = aVar2;
                            str2 = "MicroMsg.ReportAdClickListener";
                            str5 = str10;
                            r2Var = null;
                        }
                        i64.l0 l0Var2 = new i64.l0(j17, str9, i19, i27, i28, "", m70353x104668f3, str5, i29, m70313x3f7dbf73, m70312x94afa0a4, j18, str4, d17, aVar, r2Var);
                        l0Var2.f370753g = j0Var;
                        gm0.j1.i();
                        gm0.j1.n().f354821b.g(l0Var2);
                        z19 = true;
                        i64.u1.c(44, 1, 1, t07);
                    }
                    l44.z.t(aVar, 4000000);
                    i17 = c11137xb05b06ad2.f153003h;
                    str = str3;
                } catch (java.lang.Exception e28) {
                    e = e28;
                }
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdClickTarget", str);
                    if (i17 == 21) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1673, 36);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdClickTarget", str);
                    str6 = "callback";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                    z18 = z19;
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str6 = "callback";
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "report ad click error", new java.lang.Object[0]);
                    ca4.q.c("clickReportError", e);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                    z18 = z17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                    return z18;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
                return z18;
            }
            ca4.q.c("clickReportNoadSnsInfo", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportAdClickListener", "ReportAdClickEvent arrived before account was ready, ignore it.");
            ca4.q.c("clickReportAccNoReady", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        }
        str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
        z18 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str);
        return z18;
    }
}
