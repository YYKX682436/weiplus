package s34;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s34.y0 f484369c = new s34.y0(null);

    /* renamed from: a, reason: collision with root package name */
    public s34.m1 f484370a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f484371b;

    public static final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        boolean a17 = f484369c.a(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final s34.z0 e(java.util.Map r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s34.z0.e(java.util.Map, java.lang.String):s34.z0");
    }

    public final boolean a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkProductInfoPAGValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        s34.m1 m1Var = this.f484370a;
        boolean z17 = false;
        if (m1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            int i18 = m1Var.f484247c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (i18 > 0) {
                s34.m1 m1Var2 = this.f484370a;
                if (m1Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                    i17 = m1Var2.f484248d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                } else {
                    i17 = 0;
                }
                if (i17 > 0) {
                    java.lang.String[] strArr = new java.lang.String[3];
                    s34.m1 m1Var3 = this.f484370a;
                    java.lang.String str = null;
                    strArr[0] = m1Var3 != null ? m1Var3.a() : null;
                    s34.m1 m1Var4 = this.f484370a;
                    strArr[1] = m1Var4 != null ? m1Var4.b() : null;
                    s34.m1 m1Var5 = this.f484370a;
                    if (m1Var5 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                        java.lang.String str2 = m1Var5.f484246b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                        str = str2;
                    }
                    strArr[2] = str;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
                        z17 = true;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkProductInfoPAGValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return z17;
    }

    public final s34.m1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpeningPAGInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        s34.m1 m1Var = this.f484370a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpeningPAGInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return m1Var;
    }

    public final java.util.List c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProductInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        java.util.List list = this.f484371b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProductInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo");
        return list;
    }
}
