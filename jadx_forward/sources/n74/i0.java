package n74;

/* loaded from: classes4.dex */
public final class i0 {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMiniShopType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        boolean z17 = c17702x544f64e9.f244104b == 26;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMiniShopType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        return z17;
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        if (c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9> list = c17902x72cc1771.f38072xb6139d47;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.MiniShopHelper", "the click info in ad info is empty!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        boolean a17 = a(list.get(0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        return a17;
    }
}
