package s34;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public s34.e0 f484176a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f484177b = 0L;

    /* renamed from: c, reason: collision with root package name */
    public int f484178c;

    /* renamed from: wallpaperInfo */
    @za4.k1
    private s34.f0 f76707xba6e15d0;

    public static final s34.g0 c(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        s34.f0 f0Var = null;
        r5 = null;
        r5 = null;
        s34.g0 g0Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (map.containsKey(str)) {
            s34.g0 g0Var2 = new s34.g0();
            java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str.concat(".previewJoinliveAdControlFlag")), 0L));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            g0Var2.f484177b = valueOf;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str.concat(".displayType")), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDisplayType", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            g0Var2.f484178c = D1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDisplayType", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            java.lang.String concat = str.concat(".wallpaperInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            if (concat == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            } else {
                java.lang.String str2 = (java.lang.String) map.get(concat.concat(".frontImageUrl"));
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(concat.concat(".brandWallpaperImageUrl"));
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = (java.lang.String) map.get(concat.concat(".horizontalGravity"));
                int intValue = (str4 == null || (h18 = r26.h0.h(str4)) == null) ? 0 : h18.intValue();
                java.lang.String str5 = (java.lang.String) map.get(concat.concat(".verticalGravity"));
                f0Var = new s34.f0(str2, str3, intValue, (str5 == null || (h17 = r26.h0.h(str5)) == null) ? 0 : h17.intValue());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$WallpaperInfo$Companion");
            }
            g0Var2.d(f0Var);
            java.lang.String concat2 = str.concat(".finderLiveInfo");
            if (map.containsKey(concat2)) {
                s34.e0 e0Var = new s34.e0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                g0Var2.f484176a = e0Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                s34.e0 a17 = g0Var2.a();
                if (a17 != null) {
                    java.lang.String str6 = (java.lang.String) map.get(concat2 + ".finderLiveFeedExportId");
                    if (str6 == null) {
                        str6 = "";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a17.f484155a = str6;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a18 = g0Var2.a();
                if (a18 != null) {
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(concat2 + ".finderLiveId"), 0L));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a18.f484156b = valueOf2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a19 = g0Var2.a();
                if (a19 != null) {
                    java.lang.String str7 = (java.lang.String) map.get(concat2 + ".finderLiveFeedNonceId");
                    if (str7 == null) {
                        str7 = "";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a19.f484157c = str7;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                s34.e0 a27 = g0Var2.a();
                if (a27 != null) {
                    java.lang.String str8 = (java.lang.String) map.get(concat2 + ".finderUsername");
                    java.lang.String str9 = str8 != null ? str8 : "";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a27.f484158d = str9;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
            }
            if (map.containsKey(str.concat(".playerInfo"))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
            g0Var = g0Var2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return g0Var;
    }

    public final s34.e0 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        s34.e0 e0Var = this.f484176a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return e0Var;
    }

    public final s34.f0 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        s34.f0 f0Var = this.f76707xba6e15d0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return f0Var;
    }

    public final void d(s34.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        this.f76707xba6e15d0 = f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWallpaperInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
    }
}
