package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f247659a;

    /* renamed from: imageUrls */
    @za4.l1(m178632x2fff6c = 2, m178633x415c6bfa = 2)
    private final java.util.List<java.lang.String> f38344xcba8e0df;

    public s0(java.util.List imageUrls, java.lang.String productDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrls, "imageUrls");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productDesc, "productDesc");
        this.f38344xcba8e0df = imageUrls;
        this.f247659a = productDesc;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s0 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s0 s0Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String concat = str.concat(".imageUrl");
            int i17 = 0;
            while (true) {
                if (i17 >= 3) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) map.get(concat + (i17 != 0 ? java.lang.String.valueOf(i17) : ""));
                java.lang.String str3 = str2 != null ? str2 : "";
                if (!r26.n0.N(str3)) {
                    arrayList.add(str3);
                }
                i17++;
            }
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".productDesc"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s0 s0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s0(arrayList, str4 != null ? str4 : "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo$Companion");
            s0Var = s0Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        return s0Var;
    }

    public final java.util.List a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrls", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        java.util.List<java.lang.String> list = this.f38344xcba8e0df;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrls", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
        return list;
    }
}
