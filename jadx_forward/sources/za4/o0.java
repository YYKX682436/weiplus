package za4;

/* loaded from: classes4.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f552696a = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final za4.j1 f552697b;

    /* renamed from: c, reason: collision with root package name */
    public q34.b f552698c;

    /* renamed from: d, reason: collision with root package name */
    public int f552699d;

    public o0() {
        za4.j0 j0Var = new za4.j0(this);
        za4.j1 j1Var = new za4.j1("landingPage");
        this.f552697b = j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
        j1Var.f552666b = j0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
    }

    public static void a(za4.o0 o0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        synchronized (o0Var) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDownloadedUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            o0Var.f552696a.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownloadedUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public static void c(long j17, boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5816xe622eb58 c5816xe622eb58 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5816xe622eb58();
        am.jn jnVar = c5816xe622eb58.f136123g;
        jnVar.f88585a = j17 + "";
        jnVar.f88590f = 0;
        jnVar.f88587c = 1;
        jnVar.f88588d = 0;
        jnVar.f88593i = z17 ? 1 : 0;
        jnVar.f88589e = 0;
        if (str2 != null) {
            jnVar.f88592h = str2;
        }
        if (str != null) {
            jnVar.f88591g = str;
        }
        c5816xe622eb58.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public static void d(ab4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (d0Var instanceof f54.c0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69821xf699f44b((f54.c0) d0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public static synchronized za4.o0 g() {
        za4.o0 o0Var;
        synchronized (za4.o0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstanse", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            o0Var = new za4.o0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstanse", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        return o0Var;
    }

    public static android.util.Pair h(int i17) {
        android.util.Pair pair;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPreloadLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (!m40093xb9aa8b5f) {
            switch (i17) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 6:
                case 7:
                case 8:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    try {
                        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_landing_page_normal_preload_mobile_cfg, "2|3", true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getMobilePreloadConfig, config=" + Zi);
                        int[] l17 = l(Zi);
                        if (l17 != null && l17.length == 2) {
                            android.util.Pair pair2 = new android.util.Pair(java.lang.Integer.valueOf(l17[0]), java.lang.Integer.valueOf(l17[1]));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                            pair = pair2;
                            break;
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "getMobilePreloadConfig, exp=" + th6.toString());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getMobilePreloadConfig, use default");
                    android.util.Pair pair3 = new android.util.Pair(2, 3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    pair = pair3;
                    break;
                case 4:
                case 5:
                    pair = i();
                    break;
                default:
                    pair = i();
                    break;
            }
        } else if (i17 == 4 || i17 == 5) {
            pair = i();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            try {
                java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_landing_page_normal_preload_wifi_cfg, "1000|1000", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getWifiPreloadConfig, config=" + Zi2);
                int[] l18 = l(Zi2);
                if (l18 != null && l18.length == 2) {
                    pair = new android.util.Pair(java.lang.Integer.valueOf(l18[0]), java.lang.Integer.valueOf(l18[1]));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "getWifiPreloadConfig, exp=" + th7.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getWifiPreloadConfig, use default");
            pair = new android.util.Pair(1000, 1000);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, landingpage, getPreloadLimit, isWifi=" + m40093xb9aa8b5f + ", scene=" + i17 + ", pageLimit=" + pair.first + ", resCount=" + pair.second);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPreloadLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return pair;
    }

    public static android.util.Pair i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_landing_page_share_preload_cfg, "1|2", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getSharePreloadConfig, config=" + Zi);
            int[] l17 = l(Zi);
            if (l17 != null && l17.length == 2) {
                android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(l17[0]), java.lang.Integer.valueOf(l17[1]));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                return pair;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "getSharePreloadConfig, exp=" + th6.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, getSharePreloadConfig, use default");
        android.util.Pair pair2 = new android.util.Pair(1, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return pair2;
    }

    public static int[] l(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "parseConfig, cfg=" + str + ", exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return null;
        }
        java.lang.String[] split = str.split("\\|");
        if (split != null && split.length == 2) {
            int parseInt = java.lang.Integer.parseInt(split[1]);
            int[] iArr = {java.lang.Integer.parseInt(split[0]), parseInt};
            if (iArr[0] < 0 || parseInt < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return iArr;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return null;
    }

    public static void n(java.lang.String str, int i17, ab4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadComponentJumpOutInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (d0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadComponentJumpOutInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (za4.z0.s(d0Var.f84360q)) {
                java.util.List a17 = d0Var.a();
                if (a17 != null) {
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        n(str, i17, (ab4.d0) it.next());
                    }
                }
            } else if (d0Var instanceof ab4.j0) {
                ab4.j0 j0Var = (ab4.j0) d0Var;
                d(j0Var.P);
                l44.a5.g(str, i17, j0Var.P);
            } else if (d0Var instanceof f54.m) {
                f54.m mVar = (f54.m) d0Var;
                d(mVar.I);
                l44.a5.g(str, i17, mVar.I);
            } else {
                d(d0Var);
                l44.a5.g(str, i17, d0Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "preloadComponentInfo, type = " + d0Var.f84360q + ", subType = " + d0Var.f84359p + ", costTime = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "preloadComponentInfo exp = " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadComponentJumpOutInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public final void b(ab4.g0 g0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPreloadRandomPickCardRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (g0Var == null || g0Var.F == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadRandomPickCardRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "checkPreloadRandomPickCardRes");
        p44.u uVar = g0Var.F;
        if (a84.b0.e(uVar.f76389x61d0ad81)) {
            if (!android.text.TextUtils.isEmpty(uVar.f76388xc65d0d62)) {
                m(uVar.f76388xc65d0d62, "landingpage_randomPickCard-item-background");
            }
            for (p44.s sVar : uVar.f76389x61d0ad81) {
                if (!android.text.TextUtils.isEmpty(sVar.f76387xccc36214)) {
                    m(sVar.f76387xccc36214, "landingpage_randomPickCard-item-img");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadRandomPickCardRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public final void e(java.lang.String str, java.lang.String str2, int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doStartPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
            za4.x0 x0Var = new za4.x0(str, str2);
            java.util.LinkedList linkedList = x0Var.f552747a;
            ab4.j0 j0Var = x0Var.f552748b;
            android.util.Pair h17 = h(i17);
            int intValue = ((java.lang.Integer) h17.first).intValue();
            int intValue2 = ((java.lang.Integer) h17.second).intValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adVideoPreload, landingpage, startPreDownloadResource, pageLimt=");
            sb6.append(intValue);
            sb6.append(", resLimit=");
            sb6.append(intValue2);
            sb6.append(", scene=");
            sb6.append(i17);
            sb6.append(", pageCount=");
            sb6.append(linkedList == null ? 0 : linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", sb6.toString());
            java.lang.String str3 = x0Var.f552756j;
            if (!android.text.TextUtils.isEmpty(str3)) {
                m(str3, "landingpage-globalBackgroundImgUrl");
            }
            s34.x xVar = x0Var.f552751e;
            za4.j1 j1Var = this.f552697b;
            if (xVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "preload adEggAnimationInfo");
                j1Var.a(xVar, null);
                s34.p pVar = xVar.f76722x5f2c8e1e;
                if (pVar != null && (arrayList = pVar.f484263a) != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        s34.o oVar = (s34.o) it.next();
                        if (!android.text.TextUtils.isEmpty(oVar.f484253a)) {
                            m(oVar.f484253a, "adEggAnimationInfo");
                        }
                    }
                }
            }
            if (i17 == 5 || i17 == 4) {
                b(x0Var.f552755i);
            }
            if (linkedList != null && linkedList.size() > 0) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    za4.g0 g0Var = (za4.g0) it6.next();
                    m(g0Var.f77550xe4a1f586, "pageInfo-backgroundCoverUrl");
                    if (intValue2 <= 0 || intValue <= 0) {
                        break;
                    }
                    java.util.Iterator it7 = g0Var.f552616c.iterator();
                    do {
                        if (!it7.hasNext()) {
                            break;
                        }
                        f("adId", (ab4.d0) it7.next());
                        intValue2--;
                    } while (intValue2 > 0);
                    intValue--;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedPreloadFloatComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedPreloadFloatComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    if (m40093xb9aa8b5f) {
                        java.util.Map map = g0Var.f552617d;
                        for (java.lang.String str4 : ((java.util.LinkedHashMap) map).keySet()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "preload floatComponent, cid=" + str4);
                            f("adId", (ab4.d0) ((java.util.LinkedHashMap) map).get(str4));
                        }
                    }
                }
            }
            if (j0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "preload floatBarComp");
                j1Var.a(j0Var, null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "startPreDownloadResource, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doStartPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public final void f(java.lang.String str, ab4.d0 d0Var) {
        ab4.g gVar;
        int i17;
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPageComponentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean s17 = za4.z0.s(d0Var.f84360q);
        za4.j1 j1Var = this.f552697b;
        if (s17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i18 = d0Var.f84360q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            if (i18 == 101) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z17 = false;
            }
            if (z17) {
                arrayList2.addAll(((ab4.r0) d0Var).a());
            } else if (za4.z0.r(d0Var.f84360q)) {
                arrayList2.addAll(((ab4.b0) d0Var).F);
            } else {
                int i19 = d0Var.f84360q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                if (i19 == 103) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    z18 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    z18 = false;
                }
                if (z18) {
                    arrayList2.addAll(((ab4.e0) d0Var).a());
                } else {
                    int i27 = d0Var.f84360q;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    if (i27 == 104) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                        r4 = true;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    }
                    if (r4) {
                        arrayList2.addAll(((ab4.c0) d0Var).a());
                    } else if (za4.z0.q(d0Var.f84360q)) {
                        arrayList2.addAll(((f54.f) d0Var).a());
                    }
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f(str, (ab4.d0) it.next());
            }
            if (za4.z0.q(d0Var.f84360q)) {
                f54.f fVar = (f54.f) d0Var;
                s34.p pVar = fVar.f69682x5f2c8e1e;
                if (pVar != null && (arrayList = pVar.f484263a) != null) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        s34.o oVar = (s34.o) it6.next();
                        if (!android.text.TextUtils.isEmpty(oVar.f484253a)) {
                            m(oVar.f484253a, fVar.f84351e + "");
                        }
                    }
                }
                j1Var.a(d0Var, null);
            }
        } else {
            int i28 = d0Var.f84351e;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f552696a;
            if (i28 == 61) {
                if (j()) {
                    ab4.z zVar = (ab4.z) d0Var;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, landingpage 61_Video, useHttp=" + zVar.S + ", cId=" + d0Var.f84350d);
                    l44.c0.a(zVar, true);
                    if (!k(zVar.F)) {
                        concurrentLinkedQueue.add(zVar.F);
                        if (zVar.S) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 26);
                            za4.t0.e(str, zVar.F, true, 61, 0, new za4.k0(this, zVar));
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 9);
                            za4.t0.f(str, zVar.F, new za4.l0(this, zVar));
                        }
                        if (!((iv.a) ((jv.e) i95.n0.c(jv.e.class))).wi(new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f())) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 25);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "adVideoPreload, landingpage forbid 61_Video preload, cid=" + d0Var.f84350d);
                }
                j1Var.a(d0Var, null);
            } else if (i28 == 62) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, landingpage 62_Video, no preload video, cid=" + d0Var.f84350d);
                j1Var.a(d0Var, null);
            } else if (i28 == 142) {
                ab4.g gVar2 = (ab4.g) d0Var;
                r4 = !j() || gVar2.P;
                int i29 = gVar2.Q;
                q34.b bVar = this.f552698c;
                if (bVar != null && (i17 = bVar.f441502d) > 0) {
                    i29 = java.lang.Math.min(i29, i17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, landingpage 142_Video, forbid=" + r4 + ", ratio=" + i29 + ", cId=" + d0Var.f84350d);
                if (r4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 30);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 29);
                }
                if (i29 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 31);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 32);
                }
                if (!r4 && i29 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                    java.lang.String j17 = l44.c0.j(gVar2.F, true);
                    java.lang.String h17 = l44.c0.h("AdLandingGeneralVideo_" + j17.hashCode(), true);
                    java.lang.String str2 = za4.t0.g() + "AdLandingGeneralVideo_" + j17.hashCode() + ".mp4";
                    if (k(j17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "isDownloadingUrl, mediaId = " + h17 + ", enableH265 = true");
                    } else {
                        concurrentLinkedQueue.add(j17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "landingpage 142_Video, startDownloadingUrl, mediaId = " + h17 + ", enableH265 = true, cId=" + d0Var.f84350d);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 7);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69830xc4004f7d(h17, j17, str2, 1, true, i29, true, new za4.m0(this, j17));
                    }
                }
                j1Var.a(d0Var, null);
            } else if (i28 == 149) {
                try {
                    if (d0Var instanceof f54.v) {
                        f54.v vVar = (f54.v) d0Var;
                        f54.u b17 = vVar.b();
                        b17.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        java.lang.String str3 = b17.f341284a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            m(str3, "halfEggCard_animImg");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                        java.lang.String str4 = vVar.I;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            m(str4, "halfEggCard_bkgImg");
                        }
                        java.lang.String a17 = vVar.d().a();
                        if (!android.text.TextUtils.isEmpty(a17)) {
                            m(a17, "halfEggCard_preAnimImg");
                        }
                        java.util.List c17 = vVar.c();
                        if (c17 != null) {
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) c17;
                            if (arrayList3.size() > 0) {
                                java.util.Iterator it7 = arrayList3.iterator();
                                while (it7.hasNext()) {
                                    f54.r rVar = (f54.r) it7.next();
                                    rVar.a();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    ab4.d0 d0Var2 = rVar.f341275g;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    ab4.d0 d0Var3 = rVar.f341276h;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    if (d0Var2 != null) {
                                        f("adId", d0Var2);
                                    }
                                    if (d0Var3 != null) {
                                        f("adId", d0Var3);
                                    }
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "preload AdLandingHalfEggCardContainerInfo exp=" + th6.toString());
                }
            } else if (i28 == 144) {
                if ((d0Var instanceof f54.p) && (gVar = ((f54.p) d0Var).G) != null) {
                    f("adId", gVar);
                }
                j1Var.a(d0Var, null);
            } else {
                j1Var.a(d0Var, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageComponentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public final boolean j() {
        q34.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isConfigPreloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        int i17 = this.f552699d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGestureCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean z17 = i17 == 1 || i17 == 3 || i17 == 7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGestureCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean z18 = z17 || (bVar = this.f552698c) == null || !bVar.f441501c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isConfigPreloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return z18;
    }

    public synchronized boolean k(java.lang.String str) {
        boolean contains;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloadingUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        contains = this.f552696a.contains(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloadingUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return contains;
    }

    public final void m(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPageResPreloader", "predownload img url==null, compType=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return;
        }
        if (!k(str)) {
            this.f552696a.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 33);
            za4.t0.b("adId", str, true, 0, 0, new za4.n0(this, str2, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPageResPreloader", "predownload img busy, compType=" + str2 + ", url=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    public void o(java.lang.String str, java.lang.String str2, q34.b bVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, landingpage, startPreDownloadResource, preloadScene=" + i17 + ", preloadConfig=" + bVar);
        this.f552699d = i17;
        this.f552698c = bVar;
        if ((i17 == 4 || i17 == 5) && a84.o0.a(str, str2)) {
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(a84.o0.c(str, dm.n.f67493x36901555, ".adxml.canvasShareInfo.canvasId"));
            java.lang.String c17 = a84.o0.c(str, str2, ".adxml.canvasShareInfo.uxInfo");
            java.lang.String c18 = a84.o0.c(str, str2, ".adxml.canvasShareInfo.canvasDynamicInfo");
            int i18 = i17 == 4 ? 3 : 5;
            za4.a aVar = new za4.a();
            aVar.f552589d = false;
            boolean z17 = ca4.m0.u0(e42.c0.clicfg_share_vangogh_page_resource_preload, 1) == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            java.lang.String str3 = "";
            if (c18 == null || c18.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            } else {
                try {
                    java.lang.String optString = new org.json.JSONObject(c18).optString("vangogh_id");
                    if (optString != null) {
                        str3 = optString;
                    }
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            }
            boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "vangoghPageResourcePreload is " + z17 + ", isVangophPage is " + z18);
            if (z17 && z18) {
                za4.s1.f(E1, 1, 1, i18, c17, c18, aVar, null, null);
            } else {
                za4.s1.f(E1, 0, 0, i18, c17, c18, aVar, new za4.i0(this, E1, str2, i17), null);
            }
        } else {
            e(str, str2, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadWuid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (i17 == 2 || i17 == 4 || i17 == 5 || i17 == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWuidHelper", "preloadWuid, scene=" + i17);
            n74.w0.b(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadWuid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }
}
