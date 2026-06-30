package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247634a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247635b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247636c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f247637d = new java.util.ArrayList();

    public void a(java.lang.String str, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str4 = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.appUserName");
        if (!android.text.TextUtils.isEmpty(str4)) {
            this.f247634a = str4;
            this.f247636c = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.appVersion");
            this.f247635b = (java.lang.String) map.get(str2 + ".adxml.adTurnActionExtWeApp.relativePagePath");
        }
        java.lang.String str5 = str2 + ".adxml.adTurnInfo.materialInfo";
        int i17 = 0;
        while (true) {
            if (i17 > 0) {
                str3 = str5 + i17;
            } else {
                str3 = str5;
            }
            if (map.get(str3 + ".displayType") == null) {
                break;
            }
            if (((java.lang.String) map.get(str3 + ".displayType")).length() <= 0) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str3 + ".displayType"));
            ((java.util.ArrayList) this.f247637d).add(wVar);
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
    }
}
