package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247613a;

    /* renamed from: adSelectCardClickInfoLeft */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f38342x5aeb90e;

    /* renamed from: adSelectCardClickInfoRight */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f38343xb07ec9f5;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247614b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
    }

    public void a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
        java.lang.String str2 = str + ".leftBtnClickActionInfo";
        if (map.containsKey(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str2);
            this.f38342x5aeb90e = f17;
            f17.f244102a = 5;
        }
        java.lang.String str3 = str + ".rightBtnClickActionInfo";
        if (map.containsKey(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str3);
            this.f38343xb07ec9f5 = f18;
            f18.f244102a = 6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
    }
}
