package n74;

/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (c17702x544f64e9 == null || c17902x72cc1771 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, adClickActionInfo or adInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        java.lang.String str = c17702x544f64e9.f244129n0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, searchQuery is null or nil");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        try {
            java.lang.String str2 = c17902x72cc1771.f38104xce64ddf1;
            cl0.g gVar = new cl0.g();
            gVar.h("uxInfo", str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("query", str);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 105);
            hashMap.put("thirdExtParam", gVar.toString());
            boolean d17 = d(hashMap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return d17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, exp is " + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
    }

    public static int b(java.util.Map map, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        java.lang.String c17 = c(map, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i17;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(c17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return parseInt;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i17;
        }
    }

    public static java.lang.String c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (!map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return "";
        }
        java.lang.Object obj = map.get(str);
        java.lang.String obj2 = obj != null ? obj.toString() : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return obj2;
    }

    public static boolean d(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (((tg0.o1) i95.n0.c(tg0.o1.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdJumpBrandRegion", "IWebSearchApiLogicService is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        java.lang.String c17 = c(map, "query");
        int b17 = b(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        int b18 = b(map, "type", 0);
        java.lang.String obj = map.get("thirdExtParam") == null ? "" : map.get("thirdExtParam").toString();
        java.lang.String f17 = su4.r2.f(b17);
        java.util.Map b19 = su4.r2.b(b17, true, 0);
        java.util.HashMap hashMap = (java.util.HashMap) b19;
        hashMap.put("query", c17);
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        hashMap.put("thirdExtParam", fp.s0.a(obj));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Di(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b17, c17, f17, true, b19, b18, true, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return true;
    }
}
