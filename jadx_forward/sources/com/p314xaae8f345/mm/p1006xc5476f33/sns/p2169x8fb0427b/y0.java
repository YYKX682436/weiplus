package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247708a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247709b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247710c;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
        if (a84.b0.c(map) || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
        if (!map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".title");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            y0Var.f247708a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".description");
            if (str4 == null) {
                str4 = "";
            }
            y0Var.f247709b = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".iconUrl");
            if (str5 != null) {
                str3 = str5;
            }
            y0Var.f247710c = str3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f247709b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return y0Var;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
    }
}
