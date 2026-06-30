package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class q1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f251825a;

    /* renamed from: b, reason: collision with root package name */
    public int f251826b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f251827c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251828d;

    public q1(android.app.Activity activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var) {
        this.f251825a = activity;
        this.f251826b = i17;
        this.f251827c = k4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        i64.b1 b1Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i17;
        java.lang.String str6;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        android.content.Intent intent = new android.content.Intent();
        if (this.f251825a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return;
        }
        boolean z17 = obj instanceof ca4.h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var = this.f251827c;
        if (z17) {
            ca4.h hVar = (ca4.h) obj;
            java.lang.String str7 = hVar.f121468b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            java.lang.String str8 = hVar.f121469c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = Fj.k1(str8);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micro.ClickableCallBack", "onclick info is null. localId:%s", str8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            boolean z18 = hVar.f121467a;
            java.lang.String str9 = hVar.f121468b;
            if (z18) {
                try {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(k17) && ((i18 = m70371x485d7.f39014x86965dde.f451370e) == 15 || i18 == 5)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8 c6038x5a6f40a8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8();
                        c6038x5a6f40a8.f136327g.f87938a = ca4.z0.T(k17);
                        c6038x5a6f40a8.e();
                    }
                    if (k17.m70421xaf68c82a()) {
                        x84.c.c(k17);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = k17.m70354x74235b3e();
                java.lang.String str10 = b(k17).f38105xcf532ea0;
                int i19 = hVar.f121470d;
                if (i19 <= 0) {
                    i19 = 2;
                }
                int i27 = this.f251826b;
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i27, i27 == 0 ? 1 : 2, k17.m70351xaa22b9ed().f67610x29d1292e, i19, 0);
                android.app.Activity context = this.f251825a;
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) context;
                    activityC18022x27bfedac.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    b1Var = activityC18022x27bfedac.f248402l1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                } else if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2.class);
                    f2Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                    b1Var = f2Var.f250327d;
                } else {
                    b1Var = null;
                }
                ca4.m0.f(c11137xb05b06ad, b1Var, k17, i19);
                if (m70354x74235b3e == null) {
                    str3 = "Micro.ClickableCallBack";
                    str4 = str9;
                } else {
                    if (m70354x74235b3e.f38252xc7fab2e2 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70354x74235b3e.f38250x371869e5)) {
                        l44.b0.e(k17);
                        java.lang.String str11 = m70354x74235b3e.f38250x371869e5;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 b17 = b(k17);
                        if (b17 != null) {
                            str11 = ca4.z0.b(str11, b17.f38104xce64ddf1);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.ClickableCallBack", "headClickParam url " + str11 + " " + m70354x74235b3e.f38251xd174039c);
                        android.content.Intent intent2 = new android.content.Intent();
                        boolean z19 = m70354x74235b3e.f38251xd174039c == 0;
                        intent2.putExtra("KsnsViewId", str10);
                        intent2.putExtra("KRightBtn", z19);
                        intent2.putExtra("jsapiargs", new android.os.Bundle());
                        intent2.putExtra("rawUrl", str11);
                        intent2.putExtra("useJs", true);
                        if (this.f251826b == 0) {
                            ca4.z0.a(intent2, 81);
                        } else {
                            ca4.z0.a(intent2, 82);
                        }
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent2, this.f251825a);
                        ca4.z0.x0(c11137xb05b06ad);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                    if (m70354x74235b3e.f38252xc7fab2e2 == 0) {
                        str6 = "Micro.ClickableCallBack";
                        if (l44.s4.b(this.f251825a, m70354x74235b3e, b(k17), k17.f68891x29d1292e, 1)) {
                            l44.b0.e(k17);
                            a84.u0.a(c11137xb05b06ad, 41);
                            ca4.z0.x0(c11137xb05b06ad);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                            return;
                        }
                    } else {
                        str6 = "Micro.ClickableCallBack";
                    }
                    v64.d dVar = new v64.d();
                    dVar.b("ext_sns_ad_click", c11137xb05b06ad);
                    str4 = str9;
                    str3 = str6;
                    if (l44.k4.f397753a.b(view, this.f251825a, k17, this.f251826b, m70354x74235b3e, b1Var, dVar)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                    v64.c c17 = v64.a.c(this.f251825a);
                    if (c17 != null && c17.a(view, this.f251826b, k17, dVar)) {
                        l44.b0.e(k17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                }
                k4Var.a().d(k17, false);
                if (str4.endsWith("@ad")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                    return;
                }
                l44.b0.e(k17);
                a84.u0.a(c11137xb05b06ad, 40);
                ca4.z0.x0(c11137xb05b06ad);
                intent.putExtra("Contact_User", str4);
                intent.putExtra("KSnsAdTag", c11137xb05b06ad);
                intent.putExtra("Contact_Scene", 79);
                if (this.f251826b == 0) {
                    i17 = 6;
                    str5 = "CONTACT_INFO_UI_SOURCE";
                } else {
                    str5 = "CONTACT_INFO_UI_SOURCE";
                    i17 = 1;
                }
                intent.putExtra(str5, i17);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f251825a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startContactInfo, addScene=79");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            str = "CONTACT_INFO_UI_SOURCE";
            if (this.f251826b == 0) {
                m21.w.d(719);
            } else {
                m21.w.c(719);
            }
            ca4.z0.T(k17);
            k17.m70377x3172ed();
            k17.m70375x338a8cc7();
            m21.w d17 = this.f251826b == 0 ? m21.w.d(746) : m21.w.c(746);
            str9.endsWith(c01.z1.r());
            d17.g(intent);
            if (this.f251826b == 0) {
                k4Var.a().d(k17, false);
            }
            str2 = str9;
        } else {
            str = "CONTACT_INFO_UI_SOURCE";
            str2 = (java.lang.String) obj;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str2);
            if (q17 != null && q17.k2()) {
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Scene", 37);
                intent.putExtra(str, this.f251826b);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f251825a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            if (this.f251826b == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                c17933xe8d1b226.m70468x66ad9b78(str2);
                k4Var.a().d(c17933xe8d1b226, false);
            }
        }
        intent.putExtra("Contact_User", str2);
        int i28 = this.f251826b;
        if (i28 == 1) {
            intent.putExtra(str, 106);
        } else {
            intent.putExtra(str, i28);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f251828d;
        if (c17933xe8d1b2262 != null) {
            yc4.b0.f542372a.f(intent, c17933xe8d1b2262, this.f251825a);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this.f251825a);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        int i29 = this.f251826b;
        ((we0.j1) l0Var).hj(str2, i29 == 0 ? 6L : i29 == 13 ? 7L : 8L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return null;
        }
        if (this.f251826b == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = c17933xe8d1b226.m70356x450e1efa();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return m70356x450e1efa;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        return m70346x10413e67;
    }
}
