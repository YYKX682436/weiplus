package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public abstract class ka {

    /* renamed from: a, reason: collision with root package name */
    public static android.graphics.Typeface f246856a;

    public static java.lang.String a(java.lang.String str, boolean z17, java.lang.String... strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (strArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return str;
        }
        if (!z17 && !ca4.m0.p()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2056, 13);
            try {
                java.net.URI uri = new java.net.URI(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.String str2 : strArr) {
                    sb6.append(str2);
                    sb6.append("&");
                }
                if (sb6.length() > 1) {
                    java.lang.StringBuilder deleteCharAt = sb6.deleteCharAt(sb6.length() - 1);
                    java.lang.String query = uri.getQuery();
                    java.net.URI uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query == null ? deleteCharAt.toString() : query + "&" + deleteCharAt.toString(), uri.getFragment());
                    if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                        uri2.toString();
                    }
                    java.lang.String uri3 = uri2.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                    return uri3;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LandingPageUtil", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2056, 14);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        if (str == null) {
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        } else {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(strArr);
                while (true) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    sb7.append((java.lang.String) bVar.next());
                    sb7.append("&");
                }
                if (sb7.length() > 1) {
                    java.lang.StringBuilder deleteCharAt2 = sb7.deleteCharAt(sb7.length() - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deleteCharAt2, "deleteCharAt(...)");
                    java.lang.String encodedQuery = parse.getEncodedQuery();
                    android.net.Uri.Builder encodedQuery2 = parse.buildUpon().clearQuery().encodedQuery(encodedQuery == null ? deleteCharAt2.toString() : encodedQuery + '&' + ((java.lang.Object) deleteCharAt2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UrlHelper", "appendUriParams url:" + str + "  query:" + ((java.lang.Object) deleteCharAt2) + "  finalUrl = " + encodedQuery2);
                    java.lang.String builder = encodedQuery2.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(builder, "toString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
                    str = builder;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UrlHelper", e18, "", new java.lang.Object[0]);
                ca4.q.a("UrlHelper", "appendUriParams Error!", 7);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return str;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String... strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        java.lang.String a17 = a(str, false, strArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return a17;
    }

    public static int[] c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        int[] iArr = {point.x, point.y};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return iArr;
    }

    public static boolean d(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, java.lang.String str3, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, int i17) {
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "openApp, pkg=" + str + ", appName=" + str3 + ", showType=" + i17 + ", pageUrl=" + str2 + ", intent=" + intent);
        if (context == null || (android.text.TextUtils.isEmpty(str) && intent == null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LandingPageUtil", "openApp, null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return false;
        }
        if (intent != null) {
            p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.fa(context, intent, str3, i17, a5Var));
        } else if (android.text.TextUtils.isEmpty(str2)) {
            p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ja(context, str, str3, i17, a5Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "openApp, jump pageUrl=" + str2);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2));
            intent2.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(context, intent2);
            if (w17 != null && !w17.isEmpty()) {
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str4 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                } else {
                    str4 = intent2.getPackage();
                }
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (str5 == null) {
                    str5 = "";
                }
                if (!str5.equals(str4)) {
                    p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ha(context, intent2, str3, i17, a5Var));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return true;
    }

    public static void e(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        b4.d.a(context).c(new android.content.Intent("com.tencent.mm.adlanding.set_uioption"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static void f(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        boolean u17 = com.p314xaae8f345.mm.ui.bk.u(activity, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "setFullScreen, hasCut=" + u17);
        activity.getWindow().getDecorView().setSystemUiVisibility((!u17 ? 1542 : 514) | 4096);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static void g(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "setFullScreen");
        activity.getWindow().getDecorView().setSystemUiVisibility(5638);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static java.lang.String h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h(), "tmpLargeCanvasDir");
        if (!r6Var.m()) {
            r6Var.J();
        }
        try {
            byte[] bytes = str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, java.lang.System.currentTimeMillis() + "").o();
            if (com.p314xaae8f345.mm.vfs.w6.S(o17, bytes, 0, bytes.length) == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                return o17;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LandingPageUtil", "writeTempCanvasXmlToLocal fail");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return "";
    }
}
