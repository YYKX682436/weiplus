package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseCardIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str3 = b(str) + "_" + str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseCardIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str3;
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBasePageIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                str = gm0.j1.b().j() + "_" + str;
            } else {
                str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69896xb5887524() + "_" + str;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "getBasePageIdKey exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBasePageIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggBulletCommentCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str4 = a(str, str2) + "_" + str3 + "_comment";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggBulletCommentCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str4;
    }

    public static java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId, pageId empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return "";
        }
        if (g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId debug switch open");
            j(str, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("finder_cny_ad");
        java.lang.String e17 = e(str);
        java.lang.String string = M.getString(e17, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId, cacheKey=" + e17 + ", cardId=" + string);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return string;
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggCardIdCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str2 = b(str) + "_lastCardId";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardIdCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str2;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggHbCoverUrlCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str3 = a(str, str2) + "_hbUrl";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggHbCoverUrlCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19915x2bb63360()) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            java.lang.String r0 = "isDebugHalfEggCardSwitchOpen"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = ca4.m0.c0()
            if (r2 == 0) goto L1d
            bm5.o1 r2 = bm5.o1.f104252a
            com.tencent.mm.repairer.config.ad.RepairerConfigFinderHalfEggCard r3 = new com.tencent.mm.repairer.config.ad.RepairerConfigFinderHalfEggCard
            r3.<init>()
            int r2 = r2.h(r3)
            r3 = 1
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.g():boolean");
    }

    public static void h(ab4.n0 n0Var, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (n0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult, landingPageData==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            java.lang.String e17 = n0Var.e();
            if (e17 == null) {
                e17 = "";
            }
            jSONObject2.put("canvasId", e17);
            java.lang.String i18 = n0Var.i();
            if (i18 == null) {
                i18 = "";
            }
            jSONObject2.put("pageId", i18);
            if (str == null) {
                str = "";
            }
            jSONObject2.put("cardId", str);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("finder_cny_get_cardId_result", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult exp:" + e18.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState pageId empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, cardId empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, comment empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("finder_cny_ad");
        java.lang.String c17 = c(str, str2, str3);
        if (z17) {
            M.getClass();
            M.putBoolean(c17, true).commit();
        } else {
            M.getClass();
            M.remove(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, cacheKey=" + c17 + ", clicked=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardExposedId, pageId empty, pageId=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("finder_cny_ad");
        java.lang.String e17 = e(str);
        M.getClass();
        M.putString(e17, str2 == null ? "" : str2).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageHalfEggCardUtils", "setHalfEggCardExposedId, cacheKey=" + e17 + ", cardId=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }
}
