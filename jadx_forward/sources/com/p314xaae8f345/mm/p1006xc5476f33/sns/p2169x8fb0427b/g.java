package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247532a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247533b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247534c;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".objectNonceId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".finderUsername");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".exportId");
        java.lang.String str5 = str4 != null ? str4 : "";
        if (android.text.TextUtils.isEmpty(str5) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.g();
        gVar.f247532a = str2;
        gVar.f247533b = str3;
        gVar.f247534c = str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
        return gVar;
    }
}
