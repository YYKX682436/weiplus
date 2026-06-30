package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f247691a;

    /* renamed from: b, reason: collision with root package name */
    public int f247692b;

    /* renamed from: c, reason: collision with root package name */
    public int f247693c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f247694d;

    /* renamed from: e, reason: collision with root package name */
    public int f247695e;

    /* renamed from: f, reason: collision with root package name */
    public int f247696f;

    /* renamed from: g, reason: collision with root package name */
    public int f247697g;

    /* renamed from: h, reason: collision with root package name */
    public int f247698h;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
        if (!map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x();
        xVar.f247691a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".pressStartTime"), 0);
        xVar.f247692b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".pressEndTime"), 0);
        xVar.f247693c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".pressDuration"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".spriteImageUrl");
        if (str2 == null) {
            str2 = "";
        }
        xVar.f247694d = str2;
        xVar.f247695e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".spriteType"), 0);
        xVar.f247696f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".spriteSizeType"), 0);
        xVar.f247697g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".spriteDuration"), 0);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".minimumPressDuration"), 0);
        xVar.f247698h = D1;
        if (xVar.f247697g == 0) {
            xVar.f247697g = 4000;
        }
        if (D1 == 0) {
            xVar.f247698h = 500;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
        return xVar;
    }
}
