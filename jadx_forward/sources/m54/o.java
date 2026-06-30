package m54;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405829d;

    public o(java.lang.String str) {
        this.f405829d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "run";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preload$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preload$1");
        m54.s sVar = m54.s.f405838a;
        java.lang.String str5 = this.f405829d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghResPreloader", "it is going to preload some res!");
            java.util.List b17 = sVar.b(str5);
            if (!b17.isEmpty()) {
                boolean z17 = ca4.m0.u0(e42.c0.clicfg_vangogh_page_expand_preload_resources_number, 0) == 1;
                int size = b17.size();
                boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                int i17 = z17 ? m40093xb9aa8b5f ? size : 20 : m40093xb9aa8b5f ? 20 : 5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghResPreloader", "the preload node size is " + size + ", iswifi = " + m40093xb9aa8b5f + ", max count is " + i17 + ", expandPreloadResourcesNumber is " + z17);
                int i18 = 0;
                while (i18 < size && i18 < i17) {
                    m54.n nVar = (m54.n) b17.get(i18);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("node type is ");
                    nVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    int i19 = nVar.f405826b;
                    java.util.List list = b17;
                    java.lang.String str6 = nVar.f405825a;
                    sb6.append(i19);
                    sb6.append(", url is ");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    sb6.append(str6);
                    sb6.append(", md5 is ");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMd5", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMd5", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    sb6.append(nVar.f405827c);
                    sb6.append(", size is ");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    str = str3;
                    str2 = str4;
                    try {
                        sb6.append(nVar.f405828d);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghResPreloader", sb6.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                        int i27 = nVar.f405826b;
                        if (i27 == 3) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(str6);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            if (i27 == 1) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                                za4.t0.d("adId", str6, new m54.m(nVar));
                            }
                        }
                        i18++;
                        str3 = str;
                        b17 = list;
                        str4 = str2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghResPreloader", "there is an exception: " + th.getMessage());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                    }
                }
            }
            str = str3;
            str2 = str4;
        } catch (java.lang.Throwable th7) {
            th = th7;
            str = str3;
            str2 = str4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
