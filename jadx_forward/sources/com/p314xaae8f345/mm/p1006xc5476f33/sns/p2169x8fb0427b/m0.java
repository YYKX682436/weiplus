package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f247594a;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    private final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f38335xf7a0a3ac;

    /* renamed from: gridItems */
    @za4.l1
    private final java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g1> f38336x4b1c881a;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 clickActionInfo, java.util.List gridItems, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickActionInfo, "clickActionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gridItems, "gridItems");
        this.f38335xf7a0a3ac = clickActionInfo;
        this.f38336x4b1c881a = gridItems;
        this.f247594a = i17;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 d(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g1 g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = null;
        if (map != null) {
            if (str != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String concat = str.concat(".gridItems.item");
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str.concat(".clickActionInfo")), arrayList, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str.concat(".displayMode")), 0));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        m0Var = m0Var2;
                        break;
                    }
                    java.lang.String str2 = concat + (i17 != 0 ? java.lang.String.valueOf(i17) : "");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    r45.jj4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k1.f247569a.a(str2 + ".media", map);
                    if (a17 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                        g1Var = null;
                    } else {
                        a17.N = true;
                        g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g1(a17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str2 + ".clickActionInfo"));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.GridItemInfo$Companion");
                    }
                    if (g1Var == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
                        break;
                    }
                    arrayList.add(g1Var);
                    i17++;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return m0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f38335xf7a0a3ac;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return c17702x544f64e9;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayMode", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayMode", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return this.f247594a;
    }

    public final java.util.List c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g1> list = this.f38336x4b1c881a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridItems", "com.tencent.mm.plugin.sns.storage.AdCombinedGridInfo");
        return list;
    }
}
