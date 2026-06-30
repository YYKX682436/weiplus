package p34;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static int f433232a;

    /* renamed from: b, reason: collision with root package name */
    public static int f433233b;

    /* renamed from: c, reason: collision with root package name */
    public static int f433234c;

    /* renamed from: d, reason: collision with root package name */
    public static int f433235d;

    public static void a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTestConfig", "handleCmd, msg=" + str);
        try {
            java.lang.String[] split = str.split(" ");
            str2 = "";
            if (split != null) {
                java.lang.String trim = split.length >= 2 ? split[1].trim() : "";
                str3 = split.length >= 3 ? split[2] : "";
                str2 = trim;
            } else {
                str3 = "";
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdTestConfig", "handleCmd, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        } else {
            b(context, str2, str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        }
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTestConfig", "handleSubCmd, subCmd=" + str + ", value=" + str2);
        if ("fullcard_online".equals(str)) {
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            if (D1 == 0 || D1 == 1 || D1 == 2) {
                f433232a = D1;
            }
            int i17 = f433232a;
            if (i17 == 0) {
                dp.a.m125854x26a183b(context, "default cfg", 1).show();
            } else if (i17 == 1) {
                dp.a.m125854x26a183b(context, "force offline", 1).show();
            } else if (i17 == 2) {
                dp.a.m125854x26a183b(context, "force online", 1).show();
            }
        } else if ("fullcard_new_item".equals(str)) {
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            if (D12 == 0 || D12 == 1 || D12 == 2) {
                f433233b = D12;
            }
            int i18 = f433233b;
            if (i18 == 0) {
                dp.a.m125854x26a183b(context, "default cfg", 1).show();
            } else if (i18 == 1) {
                dp.a.m125854x26a183b(context, "force old item", 1).show();
            } else if (i18 == 2) {
                dp.a.m125854x26a183b(context, "force new item", 1).show();
            }
        } else if ("useTp".equals(str)) {
            int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            if (D13 == 0 || D13 == 1 || D13 == 2) {
                f433234c = D13;
            }
            int i19 = f433234c;
            if (i19 == 0) {
                dp.a.m125854x26a183b(context, "default cfg", 1).show();
            } else if (i19 == 1) {
                dp.a.m125854x26a183b(context, "force not thumbPlayer", 1).show();
            } else if (i19 == 2) {
                dp.a.m125854x26a183b(context, "force thumbPlayer", 1).show();
            }
        } else if ("notCheckAtBtn".equals(str)) {
            int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            if (D14 == 0 || D14 == 1) {
                f433235d = D14;
            }
            int i27 = f433235d;
            if (i27 == 0) {
                dp.a.m125854x26a183b(context, "should check at btn", 1).show();
            } else if (i27 == 1) {
                dp.a.m125854x26a183b(context, "not check at btn", 1).show();
            }
        } else if ("cleanad".equals(str)) {
            l44.h.a();
        } else if ("addtestad".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (split = str2.split(",")) != null && split.length > 2) {
                int D15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                l44.h.f397690b = D15;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                int D16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                l44.h.f397691c = D16;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[2], 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            }
        } else if ("localwspkg".equalsIgnoreCase(str)) {
            boolean equalsIgnoreCase = "c".equalsIgnoreCase(str2);
            java.util.Map map = e64.p.f331371a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            try {
                java.util.Map map2 = e64.p.f331371a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
                boolean booleanValue = ((java.lang.Boolean) ((jz5.n) e64.p.f331373c).mo141623x754a37bb()).booleanValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
                if (booleanValue) {
                    if (equalsIgnoreCase) {
                        com.p314xaae8f345.mm.vfs.w6.e(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + ".localwspkg");
                    } else {
                        com.p314xaae8f345.mm.vfs.w6.h(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + ".localwspkg");
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            if ("c".equalsIgnoreCase(str2)) {
                dp.a.m125854x26a183b(context, "用本地的wspkg", 1).show();
            } else {
                dp.a.m125854x26a183b(context, "用boots的wspkg", 1).show();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
    }
}
