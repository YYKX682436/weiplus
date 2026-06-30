package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247540a;

    /* renamed from: b, reason: collision with root package name */
    public int f247541b;

    /* renamed from: bgImageUrl */
    @za4.k1(m178629x2fff6c = 2, m178630x415c6bfa = 2)
    public java.lang.String f38332xfc43bd79;

    /* renamed from: descIconUrl */
    @za4.k1(m178629x2fff6c = 2, m178630x415c6bfa = 2)
    public java.lang.String f38333x1607d665;

    /* renamed from: detectSucIconUrl */
    @za4.k1(m178629x2fff6c = 2, m178630x415c6bfa = 2)
    public java.lang.String f38334x5c2163b8;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".bgImage");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".descIcon");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) map.get(str + ".detectSucIcon");
        java.lang.String str6 = str5 != null ? str5 : "";
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".scanGestureType"), 0);
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str4) || android.text.TextUtils.isEmpty(str6) || D1 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h();
        hVar.f38332xfc43bd79 = str2;
        hVar.f247540a = str3;
        hVar.f38333x1607d665 = str4;
        hVar.f38334x5c2163b8 = str6;
        hVar.f247541b = D1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
        return hVar;
    }
}
