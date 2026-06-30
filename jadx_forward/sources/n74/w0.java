package n74;

/* loaded from: classes4.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.String f416977a = "";

    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "clearWuid, old=" + f416977a);
        f416977a = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1940, 6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
    }

    public static java.lang.String b(boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String str2 = f416977a;
        if (!android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "doGetWuid, hit mem cache=" + str2 + ", isPreload=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            str = "";
        } else {
            str = p34.o.c(d17);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "doGetWuid, hit local cache=" + str + ", isPreload=" + z17);
            f416977a = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "doGetWuid, empty, isPreload=" + z17);
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ku5.t0) ku5.t0.f394148d).g(new n74.v0());
        }
        java.lang.String str3 = f416977a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str3;
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.System.currentTimeMillis();
        java.lang.String b17 = b(false);
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1940, 1);
        if (android.text.TextUtils.isEmpty(b17)) {
            g0Var.A(1940, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return b17;
    }

    public static java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String str = "";
        try {
            java.lang.String j17 = gm0.j1.b().j();
            if (!android.text.TextUtils.isEmpty(j17)) {
                str = "ad_wuid_" + j17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWuidHelper", "getWuidCacheKey, exp=" + th6.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "getWuidCacheKey, key=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1940, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str;
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String b17 = n74.d2.b(str, 13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdWuidHelper", "updateWuid, empty wuid, uxInfo=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "updateWuid:" + b17 + ", uxInfo=" + str);
        f416977a = b17;
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWuidHelper", "updateWuid, cacheKey is empty");
        } else {
            p34.o.g(d17, b17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return b17;
    }
}
