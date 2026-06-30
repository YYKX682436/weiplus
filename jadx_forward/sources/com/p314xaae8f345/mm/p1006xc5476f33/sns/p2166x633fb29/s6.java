package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f246212a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f246213b = new java.util.LinkedList();

    public static void a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(str);
            r6Var.f246182f = i17 | r6Var.f246182f;
            hashMap.put(str, r6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void b(android.view.Menu menu, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAddTransChangeMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (z17) {
            menu.add(0, 34, 0, com.p314xaae8f345.mm.R.C30867xcad56011.ly9);
        } else {
            menu.add(0, 35, 0, com.p314xaae8f345.mm.R.C30867xcad56011.ly9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAddTransChangeMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void c(android.view.Menu menu, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (g()) {
            if (z17) {
                menu.add(0, 14, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jgl);
            } else {
                menu.add(0, 15, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jgl);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void d(android.view.Menu menu, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (g()) {
            if (z17) {
                menu.add(0, 16, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jgn);
            } else {
                menu.add(0, 17, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jgn);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.lang.String str3 = str + ";" + str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return str3;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return r6Var;
    }

    public static boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        j45.l.g("translate");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TranslateSnsOff");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17, 0) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return true;
    }

    public static boolean h(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return false;
        }
        boolean z17 = (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(str)).f246182f & i17) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return z17;
    }

    public static void i(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(str);
            r6Var.f246179c = str3;
            r6Var.f246178b = str2;
            r6Var.f246180d = true;
            r6Var.f246181e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
            r6Var.f246185i = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            hashMap.put(str, r6Var);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.jgm, 1).show();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6103xe068b111 c6103xe068b111 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6103xe068b111();
        am.dx dxVar = c6103xe068b111.f136380g;
        dxVar.f88038a = i17;
        dxVar.f88039b = str;
        dxVar.f88040c = str2;
        dxVar.f88041d = str3;
        c6103xe068b111.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void j(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6();
            r6Var.f246177a = str;
            r6Var.f246179c = null;
            r6Var.f246178b = null;
            r6Var.f246180d = false;
            r6Var.f246181e = false;
            r6Var.f246184h = true;
            r6Var.f246183g = true;
            hashMap.put(str, r6Var);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6105xefd242ce c6105xefd242ce = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6105xefd242ce();
        am.fx fxVar = c6105xefd242ce.f136382g;
        fxVar.f88243a = i17;
        fxVar.f88244b = str;
        c6105xefd242ce.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void k(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f246212a;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(str);
            r6Var.f246182f &= ~i17;
            if (i17 != 2 && i17 == 4) {
                r6Var.f246184h = true;
            }
            hashMap.put(str, r6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var) {
        r45.e86 e86Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (u1Var != null && (e86Var = u1Var.f252090e) != null) {
            java.lang.String str = u1Var.f252088c;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTranslateManager", "commentContent is empty, quit translate");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = e86Var.f454665m;
            sb6.append(i17 != 0 ? i17 : e86Var.f454670r);
            sb6.append("");
            java.lang.String e17 = e(u1Var.f252087b, sb6.toString());
            java.util.HashMap hashMap = f246212a;
            if (hashMap.containsKey(e17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(e17);
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (r6Var.f246180d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6Var.f246178b) && c17.equals(r6Var.f246185i)) {
                    i(r6Var.f246177a, 2, r6Var.f246178b, r6Var.f246179c);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
                hashMap.remove(e17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
            am.hz hzVar = c6175x4c627f21.f136435g;
            hzVar.f88413c = e17;
            hzVar.f88411a = str;
            hzVar.f88414d = 3;
            hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            c6175x4c627f21.e();
            j(e17, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6();
            q6Var.f246149a = e17;
            q6Var.f246152d = 3;
            f246213b.add(q6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (c17933xe8d1b226 != null) {
            java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
            long j17 = c17933xe8d1b226.f68891x29d1292e;
            java.util.HashMap hashMap = f246212a;
            if (j17 == 0) {
                hashMap.remove(m70367x7525eefd);
                i(m70367x7525eefd, 1, null, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            if (hashMap.containsKey(m70367x7525eefd)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6) hashMap.get(m70367x7525eefd);
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (r6Var.f246180d && !r6Var.f246181e && c17.equals(r6Var.f246185i)) {
                    i(r6Var.f246177a, 1, r6Var.f246178b, r6Var.f246179c);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
                hashMap.remove(m70367x7525eefd);
            }
            if (c17933xe8d1b226.m70371x485d7() != null) {
                java.lang.String str = c17933xe8d1b226.m70371x485d7().f39013x4c306a8a;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
                am.hz hzVar = c6175x4c627f21.f136435g;
                hzVar.f88413c = m70367x7525eefd;
                hzVar.f88411a = str;
                hzVar.f88414d = 2;
                hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                c6175x4c627f21.e();
                j(c17933xe8d1b226.m70367x7525eefd() + "", 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6();
                q6Var.f246149a = m70367x7525eefd;
                q6Var.f246152d = 2;
                f246213b.add(q6Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (c17933xe8d1b226 != null) {
            java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
            p(f(m70367x7525eefd));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6106x6983e65d c6106x6983e65d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6106x6983e65d();
            am.gx gxVar = c6106x6983e65d.f136383g;
            gxVar.f88329a = 1;
            gxVar.f88330b = m70367x7525eefd;
            c6106x6983e65d.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i17 = r6Var.f246182f;
        if ((i17 & 2) != 0) {
            r6Var.f246183g = false;
        } else if ((i17 & 4) != 0) {
            r6Var.f246184h = false;
        }
        f246212a.put(r6Var.f246177a, r6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i17 = r6Var.f246182f;
        if ((i17 & 2) != 0) {
            r6Var.f246183g = true;
        } else if ((i17 & 4) != 0) {
            r6Var.f246184h = true;
        }
        f246212a.put(r6Var.f246177a, r6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }
}
