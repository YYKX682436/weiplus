package yq1;

/* loaded from: classes11.dex */
public final class j implements q25.a {

    /* renamed from: b, reason: collision with root package name */
    public static final yq1.e f545969b = new yq1.e(null);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f545970c = true;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f545971a = jz5.h.b(yq1.f.f545962d);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        int i17 = 0;
        i17 = 0;
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//biz", strArr[0])) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openrectimeline", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineOpenStatus", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                return true;
            }
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openfluttertimeline", strArr[1]);
            yq1.e eVar = f545969b;
            if (b17 && strArr.length > 2) {
                b().A("BizTimeLineOpenFlutter", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openflutterAfftimeline", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineUserAff", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("recFeed", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineRecFeedStatus", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("finderLive", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineFinderLiveStatus", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("biztlbold", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineTitleBold", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showbottomnav", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WebViewUIShowBottom").A("WebViewUIShowBottomNav", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adautotest", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineAdOpen", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().A("BizTimeLineAdTestMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[3], -1));
                b().A("BizAdInsertPos", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[4], -1));
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("autoreboot", strArr[1]) && strArr.length > 2) {
                f545970c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1) == 1;
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("deleteolddata", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineDeleteOldData", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                return true;
            }
            java.util.Map map = null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("addPayAlbum", strArr[1]) && strArr.length > 2) {
                byte[] decode = android.util.Base64.decode(strArr[2], 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                java.lang.String str2 = new java.lang.String(decode, r26.c.f450398a);
                int L = r26.n0.L(str2, "<sysmsg", 0, false, 6, null);
                if (L != -1) {
                    java.lang.String substring = str2.substring(L);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    map = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(substring, "sysmsg", null);
                    if (map == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("//biz", "XmlParser values is null, msgContent %s", str2);
                        return true;
                    }
                }
                eq1.z.f337409a.b(map, str2);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("paySuccess", strArr[1]) && strArr.length > 2) {
                byte[] decode2 = android.util.Base64.decode(strArr[2], 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode2, "decode(...)");
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(new java.lang.String(decode2, r26.c.f450398a), "sysmsg", null);
                lr1.f fVar = lr1.f.f402190a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                fVar.c(d17);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("profileCrash", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("ProfileCrashCheck").A("testCrash", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1));
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("updateAppInfo", strArr[1]) && strArr.length > 2) {
                java.lang.String str3 = strArr[2];
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    return true;
                }
                ((ku5.t0) ku5.t0.f394148d).h(new yq1.h(str3), "GetAppInfoASyncThread");
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("resortbizmsgcheck", strArr[1]) && strArr.length > 2) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1);
                b().A("BizTimeLineReSortMsgCheck", P);
                b().getClass();
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17 = yw.q3.f547970a.c();
                if (c17 != null) {
                    c17.o(P != 1 ? 1 : 0);
                }
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("recycleCardCheck", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineRecycleCardCheck", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("updateCard", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineUpdateCard", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showdigest", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineShowDigest", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                b().getClass();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("oftenread", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1);
                eq1.n0 n0Var = eq1.n0.f337370a;
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("videochannel", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1);
                eq1.n0 n0Var2 = eq1.n0.f337370a;
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sl", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("bizCommand").A("sameLayerOpen", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adtest", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineAdTestMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("setadquata", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineHardcodeAdQuota", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("setadexposecount", strArr[1]) && strArr.length > 2) {
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0);
                com.p314xaae8f345.mm.p2621x8fb0427b.u wi6 = r01.q3.wi();
                wi6.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2621x8fb0427b.t(wi6, P2));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("forbidDeleteCanvasFromJS", strArr[1]) && strArr.length > 2) {
                b().G("forbidDeleteCanvasFromJS", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
                b().getClass();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("testAdCrashEnv", strArr[1]) && strArr.length > 2) {
                b().G("testAdCrashEnv", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0) == 1);
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearTestAdCrash", strArr[1])) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.v3) ((jz5.n) eq1.n0.f337372c).mo141623x754a37bb()).i()).clear();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adtestext", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").D("BizTimeLineAdTestExtInfo", strArr[2]);
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adtestaction", strArr[1]) && strArr.length > 2) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).e("wxa06c02b5c00ff39b", null, "adTestExtAction", "data:" + strArr[2]);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ad", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineAdOpen", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adprefetch", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineAdPrefetcherOpen", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adInsertPos", strArr[1]) && strArr.length > 2) {
                b().A("BizAdInsertPos", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 3));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearadexposetime", strArr[1])) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("biz_timeline_ad").B("BizLastExposeAdTime", 0L);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearadexposecount", strArr[1])) {
                r01.q3.wi().y0();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearpkg", strArr[1])) {
                ku4.z.f394072a.c(true);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("adpreview", strArr[1]) && strArr.length > 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WebCanvasStorage").A("BizTimeLineAdPkgPreviewMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("test", strArr[1]) && strArr.length > 2) {
                b().A("BizTimeLineTestMode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0));
                b().getClass();
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("checkfinderreddot", strArr[1])) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
                b0Var.b();
                r45.fm6 a17 = bs1.a.a();
                if (a17 != null && (linkedList2 = a17.f455987d) != null) {
                    b0Var.s(linkedList2);
                }
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Success!", 1).show();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("addfinderreddot", strArr[1])) {
                eVar.a();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mockInsertAdCanvas", strArr[1])) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b18 = yw.q3.f547970a.b();
                if (b18 != null) {
                    b18.c(1, "frameSetName-" + java.lang.System.currentTimeMillis(), "frameSetData-" + java.lang.System.currentTimeMillis());
                }
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("setAdRequestInfo", strArr[1])) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b19 = yw.q3.f547970a.b();
                if (b19 != null) {
                    b19.e("adFetchControl-" + java.lang.System.currentTimeMillis(), "adFetchInfo-" + java.lang.System.currentTimeMillis());
                }
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getAllDynamicCardInfo", strArr[1])) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b27 = yw.q3.f547970a.b();
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r3 b28 = b27 != null ? b27.b(1) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAllDynamicCardInfo size = ");
                if (b28 != null && (linkedList = b28.f300055d) != null) {
                    i17 = linkedList.size();
                }
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProcessorCommand", sb6.toString());
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("flutterFlingFactor", strArr[1]) && strArr.length > 3) {
                b().z("flingFriction", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(strArr[2], 0.01f));
                b().z("minFlingVelocityFactor", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(strArr[3], 5.0f));
                eVar.b();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("videofetchdebug", strArr[1])) {
                eq1.n0.f337376g = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProcessorCommand", "mpManifestPath=" + ((java.lang.String) ((jz5.n) eq1.n0.f337375f).mo141623x754a37bb()));
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearsubscribemsg", strArr[1])) {
                ((ba0.h) ((ca0.e) i95.n0.c(ca0.e.class))).getClass();
                k31.h.f385372a.a();
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearimg", strArr[1])) {
                ((ku5.t0) ku5.t0.f394148d).g(yq1.i.f545968d);
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("gamejs", strArr[1]) && strArr.length > 2) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[2], "null")) {
                    b().remove("GameCenterJsPath");
                } else {
                    b().D("GameCenterJsPath", strArr[2]);
                    b().getClass();
                }
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mbad", strArr[1]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mock", strArr[2])) {
                ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).Ai(1, "mock_ad_card_pic_" + java.lang.System.currentTimeMillis(), "{\"isMock\":true,\"ad_desc\":\"\",\"ad_height\":0,\"ad_posid\":\"4031112715115510\",\"ad_token\":\"0034a231174155d717b9648aeb6ace913e8a9dd2c769f22549e4bb5aeaaeccc178adc1f843c6612ce1009620378f6b64\",\"ad_width\":0,\"aid\":\"379120646\",\"apurl\":\"http://ad.wx.com:12638/cgi-bin/exposure?viewid=AQOhQ%2FjtcpZ4OIAHJbKj1yeMDtOV%2F%2Fi9%2B2OzcUqzEAar8IMDi%2FXOzpehZxJW2%2B7sW6QWuBx7tcaCF6uGxLwEETBg0%2FzSilHuBjNuQ2vzgyMfnKCsTGCHo2Cl22tEH5ps979sKkr25LENWUmtrMnorDifV0Cqv8pSJNrlcV3FXJnjcWcMGp3UgIso0GedV7E6TVoTErws9kLgOEMFDkJVXbRTbiD5Uotb6t6tSqYeijLW027LV7nYaSQEgwQpDC54qI9CKNctloKHiQLE7YlPpmTt4ynMMU5CWAb2SccwvbKu1Gsd5tbbvPFXh2cLltrx6FqABESJQcENncPpY5wYMCPwQKGYs3SZWYO25XOGTJ4R3DjM4%2FS%2FPvIVwhD1BXzp5mgqLM28I4h%2FCUh%2B9FKDUJGCaAWeDfhLV64SM5pXESgt86X2EDUN97G9IuxPLX6a2wzD%2FAdSfgLf6Fxjyfs5aoy6xjFdMKnGEO3S03k52hDoF8MCJG5dPdfmwOiGeE8%2FmCOhCDymFeUIW6v80ZVWxiF0hfzDI6bkUgow02fP0L5D3X87KUzchV3CTYhEmrAIxdmmTTOPkRB96tsxxaNuwtOs3EgGFDE3oXjJpwT%2BRHcKy5LLP1LoGL1WfNbPC5x0wriD0B9gGD6T3yK2U%2Fxsfbfrsan2ihv7jNyMeVQhS%2BqanEgknhhoInq%2FYnublI6PZoYLo7tjFU0l4MGmv7bt3hBuba%2Bh5J0Iq8rFM5I3HsTyPHc9PcMpTIxN6K3RpGR1WJjOtUewxpk1fMEDUqIyAERYLiFvSMk32FxzfdmcHrcjBn6XcJymGzEgw4CdN6skKLsdI%2F7odU%2FFcpB8UWIkNoLsv4WWvqcCgLS0zqXCVhPA5I35G5le1h41mAon%2F4BfWnPfJDQfTvz4s0BqzSvBZVfg6Y81Xuqo0gHWhQIEC5VFWBE8%2BbcUA%2BvG6Y4%2Bs4tOUE5zCh2LcUsqntzWlHTXozqHvEqinpzclEdERLgNz9SBwBaoNzWjBRn9wIDDlXJ3xADxzf5Zb8ojWhIvAEGgVnOzxFLI4Ki4BNa2azGrc3Tjjm9Fprc5HoQGbK5lBTelpbP0zQtlnhXwL%2F9LryXh9kcJpnG2GcEk2SmbRDvY%2Fcg1QqgH56qP8O2hLCGH1Paim1cIJZ6iCkZSUx5edaFUsNvl1TvocsnUfoXExapWJAL8uAei8OcWtx3UF3la7MiuCDW%2BEi4jhIhc5S4ZsyyPvPQFiPp%2BKm2HSGiJlzsDvoLvrmOMnaYRlELOAEJGoMIwgIeFsyXZoYVDPWH9PUU9DNdWeWzFvRx4RV9hFhfkuQkNsjdtkEMNvUn%2BUBTO0fhZG70MtOSZ1gNBeSrDfQlR1vrBbYa61nJipKl79JZKy4JTLWk8fHQ5W4uoa0eaj4qO7DPuMsxSZVzBoUKLIGkCppJNGcHDDsum5Wp9TkofI2844h2ZKH3ylbNeq77U5X5iI7KOc7csa%2BSxEaMzkWW%2BEwaSdr8wXxAyRQ8pV8lE5o76YIFjUC3Q1tljehMfBUd1Ybd2mAldtnR2gAGc1X35Juv%2BjOQ6Pa71TJzTF8KlURENI9E22G7UiSGf4b0Tm0koB%2FNIzyIzzek0gJaDnTNYAUcLYxuJRr%2F8%2F1Q7NYJEYNywk%2F4Db3bccF%2B7JjGTfADPx96QpypKeccJJgd%2BmEYAx2oD2nmMpCCQ69yHKqxkZ4MFFWs3Z3Et7rauSmI7zbsz5PyKSW8GbusBlz7FH2DRIKOVGmJSFFRZDHp2x5nRbEV1Ynh3tjct2DG7V6lYCIwhQ0Bt3nM%2BbuR5njNBsD2w2GmcGYi%2FEKEZZjH4hqSyao0RTK9msEDNFCJRD7KejKaOoM6hVa3dtnhw1nPF0nh78B9XKMvgqteuK77jRt3QrTEAweK7apaf%2BzNduJWQy6GJzENNAuqc%2B0WtXmA4fwlgBTVddVNftiNupNvWk78TgNwUT8fVp8SZa1t91JNpA3750XCtwTwjm1X%2B7go0usrrqu%2Bl1dQqpS6CxZYffqQBPtcooskJdxwYhOkQHE3qeTRFSBI8YNQs11AF6kbyBhKSeOZhEIGLvetxt8H7jBUKjya3py9QaKSHy8fI6iF8NSpustvmyiF3StboswdtiVHEq5B505XV88FAo0ZN0EHLGem0l6Q4%2F%2FSanYgVUIfGbZXIBo7u0QzFL19zoR6CpNiszLBJYCs%3D&is_use_unify_report=1\",\"biz_appid\":\"wx69618ae091cf2c76\",\"biz_info\":{\"biz_uin\":3094043316,\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM6ZJ2vDpsGQf7L1Y69AHjiaVxiblHibrC984BxIeII705dvA/0\",\"nick_name\":\"快乐测试123\",\"signature\":\"品香堂夜勤病栋美妆头条旗下TV直播平台，美妆行业领先的视频直播平台，开启行业移动互联营销新模式 ！新品发布直播、年度庆典直播、招商论坛直播、培训活动直播等，打造从未有过的营销 体验！直播：15920578029\",\"user_name\":\"gh_1e80bb81a1d2\"},\"biz_timeline_ad_data\":{\"ad_pos\":2,\"frame_set_name\":\"ad_card379120646_wx0t7hhsygquwwc200_127\"},\"button_action\":\"{\\\"button_text\\\":\\\"进入小游戏\\\",\\\"jump_type\\\":6,\\\"jump_url\\\":\\\"?weixinadkey=c1ebee9aa88f7344b19fb871bbbb22c5e50e98e6a169d24871bdc0b4c3db7be01d8e0595bd7a536ad28a30118cff1b8f&wx_aid=379120646&wx_traceid=wx0t7hhsygquwwc200&gdt_vid=wx0t7hhsygquwwc200&weixinadinfo=379120646.wx0t7hhsygquwwc200.0.1\\\",\\\"text_type\\\":0}\",\"crt_exp_info\":\"\",\"crt_exp_tid\":0,\"crt_info\":\"[{\\\"image_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"thumb_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"height\\\":540,\\\"width\\\":960,\\\"size\\\":48069,\\\"image_md5\\\":\\\"f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"materialId\\\":\\\"268403379\\\",\\\"card_info\\\":{\\\"head_desc_type\\\":2,\\\"description\\\":\\\"好友在玩标签\\\",\\\"mp_tag_type\\\":1,\\\"pure_color_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=a20c345085306b175090c34f3b509315&filekey=3033020101041f301d02016d040253480410a20c345085306b175090c34f3b50931502023b6f040d00000004627466730000000131&hy=SH&storeid=32303230313230383134343133353030303962633530313336666664393335353037396430393030303030303664&bizid=1023\\\",\\\"material_blur_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=d5c43c43de30506fa463c69319c1ae3f&filekey=30340201010420301e02016d040253480410d5c43c43de30506fa463c69319c1ae3f020303c010040d00000004627466730000000131&hy=SH&storeid=32303230313230383134343133353030306131353739313336666664393335353037396430393030303030303664&bizid=1023\\\",\\\"thumb\\\":\\\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\\\",\\\"title\\\":\\\"最强弹一弹\\\"}}]\",\"crt_size\":\"998\",\"dest_type\":6,\"ext_back_comm\":\"{\\\"pctr\\\":0.019999999553,\\\"uid\\\":\\\"95918\\\",\\\"check_ad_info\\\":\\\"{\\\\\\\"ecpm\\\\\\\":4859.99951171875}\\\",\\\"ad_template_info\\\":\\\"{\\\\\\\"type\\\\\\\":\\\\\\\"root\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adRoot\\\\\\\",\\\\\\\"tplConfig\\\\\\\":{\\\\\\\"tlBizMbPkgVersion\\\\\\\":\\\\\\\"0.0.1\\\\\\\"},\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"viewableArea\\\\\\\":0.5,\\\\\\\"flattenLayer\\\\\\\":true},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":8,\\\\\\\"paddingRight\\\\\\\":8,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"body\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"popup\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"feedbackPopup\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"mask\\\\\\\":true,\\\\\\\"maskColor\\\\\\\":\\\\\\\"#000000\\\\\\\",\\\\\\\"maskOpacity\\\\\\\":0.2,\\\\\\\"popupWidth\\\\\\\":300,\\\\\\\"popupHeight\\\\\\\":239,\\\\\\\"popupLeftExpr\\\\\\\":\\\\\\\"#add(#get(#getVar('popupInfo'), 'left'), 8)\\\\\\\",\\\\\\\"popupTopExpr\\\\\\\":\\\\\\\"#add(#get(#getVar('popupInfo'), 'top'), #get(#getVar('popupInfo'), 'height'))\\\\\\\"}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"feedbackDialog\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"feedbackDialog\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1}}]},{\\\\\\\"type\\\\\\\":\\\\\\\"feedback\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adFeedback\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"data\\\\\\\":{\\\\\\\"_bubbleEvent\\\\\\\":false,\\\\\\\"feedbackIconExpr\\\\\\\":\\\\\\\"$const.darkMode ? 'resources\\\\/arrow_down_dark.png' : 'resources\\\\/arrow_down.png'\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"padding\\\\\\\":\\\\\\\"8 0\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\"}},\\\\\\\"feedbackIcon\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":16,\\\\\\\"height\\\\\\\":8,\\\\\\\"marginLeft\\\\\\\":0},\\\\\\\"darkStyle\\\\\\\":{\\\\\\\"width\\\\\\\":16,\\\\\\\"height\\\\\\\":8,\\\\\\\"marginLeft\\\\\\\":0}},\\\\\\\"feedbackTagContainer\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"height\\\\\\\":22,\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#e5e5e5\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":8,\\\\\\\"paddingRight\\\\\\\":2,\\\\\\\"paddingTop\\\\\\\":1},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#1C1C1C\\\\\\\"}},\\\\\\\"feedbackTag\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"height\\\\\\\":16,\\\\\\\"lineHeight\\\\\\\":16,\\\\\\\"fontSize\\\\\\\":12,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.5)\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.5)\\\\\\\"}}},\\\\\\\"lifecycle\\\\\\\":{\\\\\\\"onInit\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"getBoundingClientRect\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"id\\\\\\\":\\\\\\\"$$\\\\\\\",\\\\\\\"eventName\\\\\\\":\\\\\\\"rectReceive\\\\\\\"}}]},\\\\\\\"events\\\\\\\":{\\\\\\\"rectReceive\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"setExprVar\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"key\\\\\\\":\\\\\\\"popupInfo\\\\\\\",\\\\\\\"valueExpr\\\\\\\":\\\\\\\"$args.rect\\\\\\\"}}],\\\\\\\"dislikeReasonTap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"triggerEvent\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"eventName\\\\\\\":\\\\\\\"videodislike\\\\\\\"}}],\\\\\\\"tagTap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"showPopup\\\\\\\",\\\\\\\"targetid\\\\\\\":\\\\\\\"feedbackPopup\\\\\\\"}]}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_ad_container\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_img_container\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"borderTopLeftRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"borderTopRightRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.05)\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adImage\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.05)\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":0,\\\\\\\"paddingBottomExpr\\\\\\\":\\\\\\\"$ad.crt_size == 998 || $ad.crt_size == 538 ? '56.25%' : '34.792%'\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.05)\\\\\\\"}},\\\\\\\"img\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":\\\\\\\"auto\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"absolute\\\\\\\",\\\\\\\"top\\\\\\\":0,\\\\\\\"left\\\\\\\":0}}},\\\\\\\"data\\\\\\\":{\\\\\\\"useBgMode\\\\\\\":false,\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"$ad.crt_size != 538\\\\\\\",\\\\\\\"usePredownload\\\\\\\":true},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"video\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_video\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.05)\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":0,\\\\\\\"paddingBottomExpr\\\\\\\":\\\\\\\"$ad.crt_size == 998 || $ad.crt_size == 538 ? '56.25%' : '34.792%'\\\\\\\"}}},\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"$ad.crt_size == 538\\\\\\\",\\\\\\\"muted\\\\\\\":true,\\\\\\\"loop\\\\\\\":true,\\\\\\\"isShowProgress\\\\\\\":false,\\\\\\\"useImagePoster\\\\\\\":true},\\\\\\\"events\\\\\\\":{}}}]},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adBar\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"boxSizing\\\\\\\":\\\\\\\"border-box\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":64,\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#fff\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":12,\\\\\\\"paddingRight\\\\\\\":12,\\\\\\\"borderBottomLeftRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"borderBottomRightRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#1C1C1C\\\\\\\"}}},\\\\\\\"data\\\\\\\":{},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"avatarInfo\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"flex\\\\\\\":\\\\\\\"1 1 auto\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}},\\\\\\\"data\\\\\\\":{},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adIcon\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type) ? 'true' : $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 1\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"flex\\\\\\\":\\\\\\\"0 0 auto\\\\\\\",\\\\\\\"width\\\\\\\":40,\\\\\\\"height\\\\\\\":40,\\\\\\\"marginRight\\\\\\\":8}},\\\\\\\"img\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"borderRadiusExpr\\\\\\\":\\\\\\\"$ad.product_type == 12 || $ad.product_type == 19 ? 2 : 20\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"layoutText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"flex\\\\\\\":\\\\\\\"1 1 auto\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adTitle\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type) ? 'true' : $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 1\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 2\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.description\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsTitle\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 4 && $ad.hint_txt\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.hint_txt\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 4 && $ad.ad_desc\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.ad_desc\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"height\\\\\\\":18,\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsNormalDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 3\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.ad_desc\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"marginTop\\\\\\\":0,\\\\\\\"height\\\\\\\":36,\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\",\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"normal\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":2,\\\\\\\"wordBreak\\\\\\\":\\\\\\\"break-all\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"tagText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":4,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type != 7\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"none\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"height\\\\\\\":18,\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiInfo\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type == 7 && $ad.poi.poi_name\\\\\\\",\\\\\\\"_bubbleEvent\\\\\\\":false,\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\"}},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\"}}},\\\\\\\"events\\\\\\\":{\\\\\\\"tap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"emitCustomMessage\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"message\\\\\\\":\\\\\\\"poiLand\\\\\\\",\\\\\\\"args\\\\\\\":{}}}]}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiImage\\\\\\\",\\\\\\\"style\\\\\\\":{},\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginRight\\\\\\\":2,\\\\\\\"width\\\\\\\":10,\\\\\\\"height\\\\\\\":12}}},\\\\\\\"data\\\\\\\":{\\\\\\\"imgUrl\\\\\\\":\\\\\\\"resources\\\\/poi.png\\\\\\\"}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.poi.poi_name\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"marginTop\\\\\\\":0,\\\\\\\"color\\\\\\\":\\\\\\\"#5F749E\\\\\\\",\\\\\\\"height\\\\\\\":16,\\\\\\\"lineHeight\\\\\\\":16,\\\\\\\"fontSize\\\\\\\":12,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{}}},\\\\\\\"events\\\\\\\":{}}}]}]}]},{\\\\\\\"type\\\\\\\":\\\\\\\"button\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"land_button\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"marginLeft\\\\\\\":\\\\\\\"12px\\\\\\\",\\\\\\\"flex\\\\\\\":\\\\\\\"0 0 auto\\\\\\\",\\\\\\\"height\\\\\\\":32,\\\\\\\"lineHeight\\\\\\\":32,\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#f2f2f2\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"padding\\\\\\\":0,\\\\\\\"displayExpr\\\\\\\":\\\\\\\"$ad.product_type == 23 ? 'flex' : 'none'\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#323232\\\\\\\"}},\\\\\\\"buttonText\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"textAlign\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"verticalAlign\\\\\\\":\\\\\\\"middle\\\\\\\",\\\\\\\"marginExpr\\\\\\\":\\\\\\\"$ad.button_action.jump_type == 6 ? '0 12 0 0' : '0 12'\\\\\\\",\\\\\\\"height\\\\\\\":32,\\\\\\\"lineHeight\\\\\\\":32,\\\\\\\"fontSize\\\\\\\":15,\\\\\\\"fontWeight\\\\\\\":500,\\\\\\\"color\\\\\\\":\\\\\\\"#06AD56\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}},\\\\\\\"buttonIcon\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"backgroundImage\\\\\\\":\\\\\\\"resources\\\\/weapp.png\\\\\\\",\\\\\\\"marginLeft\\\\\\\":12,\\\\\\\"width\\\\\\\":12.1,\\\\\\\"height\\\\\\\":11},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundImage\\\\\\\":\\\\\\\"resources\\\\/weapp_dark.png\\\\\\\"}}},\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"isHandleDownload\\\\\\\":false,\\\\\\\"isShowIconExpr\\\\\\\":\\\\\\\"$ad.button_action.jump_type == 6 ? $const.true : $const.false\\\\\\\",\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\"}},\\\\\\\"events\\\\\\\":{}}}]}]}]}\\\",\\\"live_video_mode\\\":0,\\\"live_video_sub_mode\\\":0,\\\"ams_second_industry_id\\\":21474841490,\\\"antifraud_popup\\\":false,\\\"is_from_snsadinfo\\\":0,\\\"ad_special_strategy_type\\\":0}\",\"ext_info\":\"{\\\"gh_id\\\":\\\"gh_9cc128a6adbf\\\"}\",\"flow_exp_info\":\"[{\\\"exp_para\\\":[{\\\"name\\\":\\\"widget_gray_batchload_app\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_minigame_dialog\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_video_download_v2\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_videodownload\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":94804,\\\"value\\\":\\\"5\\\"},{\\\"name\\\":94822,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":95071,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":103124,\\\"value\\\":\\\"0\\\"},{\\\"name\\\":104692,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":104860,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":105786,\\\"value\\\":\\\"0.01\\\"}]},{\\\"exp_para\\\":[{\\\"name\\\":94794,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":94805,\\\"value\\\":\\\"0\\\"},{\\\"name\\\":95489,\\\"value\\\":\\\"12\\\"},{\\\"name\\\":100036,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":100332,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":105490,\\\"value\\\":\\\"112002\\\"},{\\\"name\\\":111832,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":111664,\\\"value\\\":\\\"1\\\"}]}]\\n\",\"game_ghid\":\"gh_9cc128a6adbf\",\"game_info\":{\"biz_uin\":3847021493,\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\",\"nick_name\":\"最强弹一弹\",\"user_name\":\"gh_9cc128a6adbf\"},\"group_id\":\"wx0t7hhsygquwwc200\",\"hint_txt\":\"创意-20201208_1\",\"image_url\":\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\",\"is_cpm\":0,\"logo\":\"\",\"material_height\":388,\"material_type\":0,\"material_width\":690,\"path_type\":\"ad\",\"pos_type\":15,\"product_type\":46,\"pt\":2,\"reranking_ext_info\":\"{\\\"tid\\\":379121128,\\\"material_hash\\\":\\\"CM-nnacFEAA\\\"}\",\"rl\":\"http://ad.wx.com:12638/cgi-bin/click?viewid=AQOhQ%2FjtcpZ4OIAHJbKj1yeMDtOV%2F%2Fi9%2B2OzcUqzEAar8IMDi%2FXOzpehZxJW2%2B7sW6QWuBx7tcaCF6uGxLwEETBg0%2FzSilHuBjNuQ2vzgyMfnKCsTGCHo2Cl22tEH5ps979sKkr25LENWUmtrMnorDifV0Cqv8pSJNrlcV3FXJnjcWcMGp3UgIso0GedV7E6TVoTErws9kLgOEMFDkJVXbRTbiD5Uotb6t6tSqYeijLW027LV7nYaSQEgwQpDC54qI9CKNctloKHiQLE7YlPpmTt4ynMMU5CWAb2SccwvbKu1Gsd5tbbvPFXh2cLltrx6FqABESJQcENncPpY5wYMCPwQKGYs3SZWYO25XOGTJ4R3DjM4%2FS%2FPvIVwhD1BXzp5mgqLM28I4h%2FCUh%2B9FKDUJGCaAWeDfhLV64SM5pXESgt86X2EDUN97G9IuxPLX6a2wzD%2FAdSfgLf6Fxjyfs5aoy6xjFdMKnGEO3S03k52hDoF8MCJG5dPdfmwOiGeE8%2FmCOhCDymFeUIW6v80ZVWxiF0hfzDI6bkUgow02fP0L5D3X87KUzchV3CTYhEmrAIxdmmTTOPkRB96tsxxaNuwtOs3EgGFDE3oXjJpwT%2BRHcKy5LLP1LoGL1WfNbPC5x0wriD0B9gGD6T3yK2U%2Fxsfbfrsan2ihv7jNyMeVQhS%2BqanEgknhhoInq%2FYnublI6PZoYLo7tjFU0l4MGmv7bt3hBuba%2Bh5J0Iq8rFM5I3HsTyPHc9PcMpTIxN6K3RpGR1WJjOtUewxpk1fMEDUqIyAERYLiFvSMk32FxzfdmcHrcjBn6XcJymGzEgw4CdN6skKLsdI%2F7odU%2FFcpB8UWIkNoLsv4WWvqcCgLS0zqXCVhPA5I35G5le1h41mAon%2F4BfWnPfJDQfTvz4s0BqzSvBZVfg6Y81Xuqo0gHWhQIEC5VFWBE8%2BbcUA%2BvG6Y4%2Bs4tOUE5zCh2LcUsqntzWlHTXozqHvEqinpzclEdERLgNz9SBwBaoNzWjBRn9wIDDlXJ3xADxzf5Zb8ojWhIvAEGgVnOzxFLI4Ki4BNa2azGrc3Tjjm9Fprc5HoQGbK5lBTelpbP0zQtlnhXwL%2F9LryXh9kcJpnG2GcEk2SmbRDvY%2Fcg1QqgH56qP8O2hLCGH1Paim1cIJZ6iCkZSUx5edaFUsNvl1TvocsnUfoXExapWJAL8uAei8OcWtx3UF3la7MiuCDW%2BEi4jhIhc5S4ZsyyPvPQFiPp%2BKm2HSGiJlzsDvoLvrmOMnaYRlELOAEJGoMIwgIeFsyXZoYVDPWH9PUU9DNdWeWzFvRx4RV9hFhfkuQkNsjdtkEMNvUn%2BUBTO0fhZG70MtOSZ1gNBeSrDfQlR1vrBbYa61nJipKl79JZKy4JTLWk8fHQ5W4uoa0eaj4qO7DPuMsxSZVzBoUKLIGkCppJNGcHDDsum5Wp9TkofI2844h2ZKH3ylbNeq77U5X5iI7KOc7csa%2BSxEaMzkWW%2BEwaSdr8wXxAyRQ8pV8lE5o76YIFjUC3Q1tljehMfBUd1Ybd2mAldtnR2gAGc1X35Juv%2BjOQ6Pa71TJzTF8KlURENI9E22G7UiSGf4b0Tm0koB%2FNIzyIzzek0gJaDnTNYAUcLYxuJRr%2F8%2F1Q7NYJEYNywk%2F4Db3bccF%2B7JjGTfADPx96QpypKeccJJgd%2BmEYAx2oD2nmMpCCQ69yHKqxkZ4MFFWs3Z3Et7rauSmI7zbsz5PyKSW8GbusBlz7FH2DRIKOVGmJSFFRZDHp2x5nRbEV1Ynh3tjct2DG7V6lYCIwhQ0Bt3nM%2BbuR5njNBsD2w2GmcGYi%2FEKEZZjH4hqSyao0RTK9msEDNFCJRD7KejKaOoM6hVa3dtnhw1nPF0nh78B9XKMvgqteuK77jRt3QrTEAweK7apaf%2BzNduJWQy6GJzENNAuqc%2B0WtXmA4fwlgBTVddVNftiNupNvWk78TgNwUT8fVp8SZa1t91JNpA3750XCtwTwjm1X%2B7go0usrrqu%2Bl1dQqpS6CxZYffqQBPtcooskJdxwYhOkQHE3qeTRFSBI8YNQs11AF6kbyBhKSeOZhEIGLvetxt8H7jBUKjya3py9QaKSHy8fI6iF8NSpustvmyiF3StboswdtiVHEq5B505XV88FAo0ZN0EHLGem0l6Q4%2F%2FSanYgVUIfGbZXIBo7u0QzFL19zoR6CpNiszLBJYCs%3D&is_use_unify_report=1\",\"ticket\":\"\",\"traceid\":\"wx0t7hhsygquwwc200\",\"type\":\"0\",\"url\":\"?weixinadkey=0dcd25b2a0fdc6658b6226bebe9fc46004a69eac4387ee4b2c12357297e48652771255ee0161a5367dd583373b58ffbd&wx_aid=379120646&wx_traceid=wx0t7hhsygquwwc200&gdt_vid=wx0t7hhsygquwwc200&weixinadinfo=379120646.wx0t7hhsygquwwc200.0.1\",\"use_new_protocol\":2,\"uxinfo\":\"379120646|wx0t7hhsygquwwc200|346005421|0|1670934671|0|2|4031112715115510||AgKuZBrXr8o4DzI1MEfacSPmBLKAQlyM3+qjT0xwwab5ghwnx9QBxoClWYSVQVPPWsk=|379121128|21|0|oDdoCtwy1X__LCl4WZwlYfFYnHFY\",\"watermark_text\":\"小游戏推广\",\"watermark_type\":0,\"weapp_info\":{\"appid\":\"wxbe77d50ac82c441d\",\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\",\"nick_name\":\"最强弹一弹\",\"original_id\":\"gh_9cc128a6adbf\"}}\n");
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mbad", strArr[1]) && strArr.length > 2) {
                java.lang.String str4 = strArr[2];
                if (str4 != null) {
                    if ((str4.length() > 0) != false) {
                        i95.m c18 = i95.n0.c(bx.r.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        java.lang.String testJs = strArr[2];
                        cx.f0 f0Var = (cx.f0) ((bx.q) c18);
                        synchronized (f0Var) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(testJs, "testJs");
                            f0Var.Di(0);
                            cx.w0 w0Var = f0Var.f305955e;
                            if (w0Var != null) {
                                w0Var.J1(testJs, null);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f545971a).mo141623x754a37bb();
    }
}
