package t54;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final t54.d f497379a = new t54.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f497380b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    /* renamed from: c, reason: collision with root package name */
    public static final yz5.l f497381c = t54.c.f497378d;

    public static final boolean a(t54.d dVar, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        boolean z17 = false;
        z17 = false;
        z17 = false;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        } else {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "adCanvasInfo", null);
            if (d17 == null || d17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PreloadSnsAdHelper", "invalid landingpages xml");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            } else {
                t54.b bVar = new t54.b();
                bVar.b(0);
                bVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".adCanvasInfo.type"), 0));
                bVar.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".adCanvasInfo.subtype"), 0));
                int i17 = 0;
                loop0: while (true) {
                    bVar.b(1);
                    java.lang.String str3 = ".adCanvasInfo.PageList.Page";
                    if (i17 != 0) {
                        str3 = ".adCanvasInfo.PageList.Page" + i17;
                    }
                    if (d17.containsKey(str3 + ".componentItemList.componentItem.type")) {
                        bVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(str3 + ".type"), z17 ? 1 : 0));
                        bVar.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(str3 + ".subType"), z17 ? 1 : 0));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        int i18 = bVar.f497376b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        if (i18 == 82) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadSnsAdHelper", "get webView type!");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                            break;
                        }
                        java.lang.String str4 = str3 + ".componentItemList.componentItem";
                        bVar.b(2);
                        int i19 = 0;
                        while (true) {
                            if (i19 == 0) {
                                str2 = str4;
                            } else {
                                str2 = str4 + i19;
                            }
                            if (!d17.containsKey(str2 + ".type")) {
                                break;
                            }
                            java.lang.String str5 = str4;
                            bVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(str2 + ".type"), 0));
                            bVar.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(str2 + ".subType"), 0));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            int i27 = bVar.f497376b;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            if (i27 == 82) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadSnsAdHelper", "get webView type!");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                break loop0;
                            }
                            i19++;
                            str4 = str5;
                        }
                    } else {
                        bVar.b(2);
                        java.util.Iterator it = d17.entrySet().iterator();
                        while (it.hasNext()) {
                            java.lang.String str6 = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
                            if (str6 != null) {
                                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\s\\S]*\\.componentItem[0-9]*\\.type$");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                                if (compile.matcher(str6).matches()) {
                                    java.lang.Object t17 = r26.i0.t(str6, ".type", ".subType", z17);
                                    bVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(str6), z17 ? 1 : 0));
                                    bVar.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(t17), z17 ? 1 : 0));
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    int i28 = bVar.f497376b;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    if (i28 == 82) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadSnsAdHelper", "get webView type!");
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    }
                    i17++;
                    z17 = false;
                }
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        return z17;
    }
}
