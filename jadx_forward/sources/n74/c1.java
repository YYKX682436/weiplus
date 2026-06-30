package n74;

/* loaded from: classes4.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f416847a = new java.util.concurrent.ConcurrentHashMap();

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        boolean z17 = false;
        if (c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17902x72cc1771.f38078x88b8744a) && c17902x72cc1771.f38079xad31f4e4 > 0;
        if (z18) {
            boolean contains = c17902x72cc1771.f38078x88b8744a.contains("%d");
            int indexOf = c17902x72cc1771.f38078x88b8744a.indexOf("%");
            int lastIndexOf = c17902x72cc1771.f38078x88b8744a.lastIndexOf("%");
            if (contains && indexOf == lastIndexOf) {
                z17 = true;
            }
            z18 = z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return z18;
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (c17902x72cc1771 == null || ((c17902x72cc1771.f38058x2f17b6f2 != com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.f38039x1568bf40 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17902x72cc1771.f38060xc67219e0) || c17902x72cc1771.f38061x48a65a51.size() <= 0) && (c17902x72cc1771.f38058x2f17b6f2 != com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.f38038xeaf0f4df || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17902x72cc1771.f38060xc67219e0)))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", "use init adChainData");
        ((java.util.concurrent.ConcurrentHashMap) f416847a).put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return true;
    }

    public static void c(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (c17902x72cc1771 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "adInfo or snsId is null, snsId = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "snsObject is null, snsId = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (c17902x72cc1771.f38070x9d5a9cb8 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", "adChainType is not 1, snsId = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70354x74235b3e().m70143xb570c4d8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", "isHideAdChainStrengthenLabel is 1, snsId = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        int i18 = c17902x72cc1771.f38071xdb390f64;
        int i19 = i18 == 0 ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 : i18 * 1000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = f416847a;
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (currentTimeMillis - (l17 == null ? 0L : l17.longValue()) < i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        java.util.HashSet H = ca4.m0.H(c19806x4c372b7);
        java.util.HashSet F = ca4.m0.F(c19806x4c372b7);
        i64.o0 o0Var = new i64.o0(i17, "", c17902x72cc1771.aid, str, c17902x72cc1771.f38104xce64ddf1, ca4.m0.G(H, F).size(), H.size(), F.size());
        gm0.j1.d().a(4342, new n74.b1(i17, str, null));
        gm0.j1.n().f354821b.g(o0Var);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 43);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
    }

    public static void d(android.widget.TextView textView, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (textView == null || c19806x4c372b7 == null || c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            java.util.HashSet G = ca4.m0.G(ca4.m0.H(c19806x4c372b7), ca4.m0.F(c19806x4c372b7));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19806x4c372b7.f38999xf403ecf6)) {
                G.remove(c19806x4c372b7.f38999xf403ecf6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            textView.setText(java.lang.String.format(c17902x72cc1771.f38078x88b8744a, java.lang.Integer.valueOf(java.lang.Math.max(G.size(), c17902x72cc1771.f38079xad31f4e4))));
            textView.setVisibility(0);
            if (c17902x72cc1771.f38079xad31f4e4 < G.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 51);
            }
        } catch (java.lang.Throwable th6) {
            textView.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
    }
}
