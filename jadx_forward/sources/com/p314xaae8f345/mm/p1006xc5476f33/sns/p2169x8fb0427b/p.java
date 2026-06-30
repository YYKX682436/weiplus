package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public int f247622a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247623b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247624c;

    /* renamed from: d, reason: collision with root package name */
    public int f247625d = 30;

    /* renamed from: e, reason: collision with root package name */
    public int f247626e;

    /* renamed from: f, reason: collision with root package name */
    public int f247627f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f247628g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f247629h;

    public void a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
        this.f247622a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".displayType"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        if (str2 == null) {
            str2 = "";
        }
        this.f247623b = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".description");
        if (str3 == null) {
            str3 = "";
        }
        this.f247624c = str3;
        this.f247625d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".markMaxAlpha"), 30);
        this.f247626e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".titlePosition"), 0);
        this.f247627f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".gestureDelayTime"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".sphereThumbUrl");
        if (str4 == null) {
            str4 = "";
        }
        this.f247629h = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".sphereImageUrl");
        this.f247628g = str5 != null ? str5 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
    }
}
