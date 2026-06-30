package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247704a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247705b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247706c;

    /* renamed from: d, reason: collision with root package name */
    public int f247707d;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".appUserName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".relativePagePath");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".appVersion");
        java.lang.String str5 = str4 != null ? str4 : "";
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".miniProgramType"), 0);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y();
        yVar.f247704a = str2;
        yVar.f247705b = str3;
        yVar.f247706c = str5;
        yVar.f247707d = D1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
        return yVar;
    }
}
