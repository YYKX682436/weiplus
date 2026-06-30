package a84;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static void a(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        b(context, str, n0Var, i17, j17, str2, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }

    public static void b(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        try {
            android.content.Intent intent = new android.content.Intent();
            if (android.text.TextUtils.isEmpty(n0Var.m()) || android.text.TextUtils.isEmpty(n0Var.c())) {
                str3 = str;
            } else {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(str, "traceid=" + n0Var.m() + "&aid=" + n0Var.c());
            }
            java.lang.String n17 = n0Var.n();
            if (android.text.TextUtils.isEmpty(n17)) {
                n17 = n0Var.o();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use orig_UxInfo:" + n17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use updated_UxInfo:" + n17);
            }
            if (z17) {
                str3 = ca4.z0.b(str3, n17);
                ca4.z0.c(intent, n17);
            }
            java.lang.String e17 = f44.a.e(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "open url %s", e17);
            intent.putExtra("rawUrl", e17);
            intent.putExtra("useJs", true);
            intent.putExtra("type", -255);
            if (n0Var.d() == 0) {
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, 7, j17, 0, 0, 0, 0, 0);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("KSnsAdTag", c11137xb05b06ad);
                if (!android.text.TextUtils.isEmpty(n17)) {
                    bundle.putString("KAnsUxInfo", n17);
                }
                intent.putExtra("jsapiargs", bundle);
            }
            if ((context instanceof android.app.Activity) && n0Var.d() == 2) {
                java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("sns_landing_pages_sessionId");
                java.lang.String stringExtra2 = ((android.app.Activity) context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                        stringExtra2 = "";
                    }
                    objArr[0] = stringExtra2;
                    objArr[1] = stringExtra;
                    objArr[2] = str2;
                    objArr[3] = valueOf;
                    java.lang.String format = java.lang.String.format("official_mall_%s_%s_%s_%s", objArr);
                    intent.putExtra("prePublishId", format);
                    intent.putExtra("KPublisherId", format);
                    intent.putExtra("pay_channel", 47);
                }
            }
            ca4.z0.a(intent, 84);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageH5Jumper", "adLandingJumpWebPageUI exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }

    public static void c(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        if (android.text.TextUtils.isEmpty(n0Var.m()) || android.text.TextUtils.isEmpty(n0Var.c())) {
            str2 = str;
        } else {
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(str, "traceid=" + n0Var.m() + "&aid=" + n0Var.c());
        }
        java.lang.String n17 = n0Var.n();
        if (android.text.TextUtils.isEmpty(n17)) {
            n17 = n0Var.o();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use orig_UxInfo:" + n17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use updated_UxInfo:" + n17);
        }
        java.lang.String url = f44.a.e(ca4.z0.b(str2, n17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageH5Jumper", "jumpHalfStyleH5ForFinder, source=" + i17 + ", snsId=" + ca4.z0.t0(j17) + ", url=" + url);
        ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        c19786x6a1e2862.m76550x2592a27b(2);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 c19799x6a7e198 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198();
        c19799x6a7e198.m77171xca029dad(url);
        c19799x6a7e198.m77169x53b6de6f(1);
        c19786x6a1e2862.m76541x751b57e5(c19799x6a7e198);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.t.a(context, url, new xc2.p0(c19786x6a1e2862), null, new oy2.p(0, 0.75f, false, null, null, null, 61, null), 89, "", null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }
}
