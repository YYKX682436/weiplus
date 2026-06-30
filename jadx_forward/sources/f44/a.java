package f44;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null || !"1".equals(parse.getQueryParameter("canPrefetch"))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("prefetch", "1").build().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return uri;
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        try {
            java.lang.String a17 = a(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return a17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
    }

    public static void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            zq1.i0 i0Var = new zq1.i0();
            i0Var.f556516a = str;
            i0Var.f556518c = 181;
            arrayList.add(i0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1612L, 44L, arrayList.size());
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        if (m0Var != null) {
            ((yq1.x0) m0Var).h(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
    }

    public static java.lang.String[] d(java.util.Collection collection, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (a84.b0.b(collection)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str6 = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                str6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(str6, "traceid=" + str + "&aid=" + str2);
            }
            if (android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use orig_UxInfo:" + str4);
                str5 = str4;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use updated_UxInfo:" + str3);
                str5 = str3;
            }
            java.lang.String b17 = b(ca4.z0.b(str6, str5));
            if (!android.text.TextUtils.isEmpty(b17)) {
                linkedList.add(b17);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) linkedList.toArray(new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return strArr;
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        java.lang.String b17 = b(str);
        if (android.text.TextUtils.isEmpty(b17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return b17;
    }
}
