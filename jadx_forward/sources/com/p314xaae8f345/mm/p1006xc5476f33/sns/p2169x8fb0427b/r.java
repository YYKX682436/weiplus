package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class r implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f247640d;

    /* renamed from: e, reason: collision with root package name */
    public int f247641e;

    /* renamed from: f, reason: collision with root package name */
    public int f247642f;

    /* renamed from: g, reason: collision with root package name */
    public int f247643g;

    /* renamed from: h, reason: collision with root package name */
    public int f247644h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f247645i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f247646m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f247647n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f247648o;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        if (map.containsKey(str)) {
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".twistStartTime"), 0);
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".twistEndTime"), 0);
            int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".twistDegree"), 0);
            int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".coverStartTime"), 0);
            int D15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".coverEndTime"), 0);
            if (D14 == 0) {
                D14 = D1;
            }
            if (D15 == 0) {
                D15 = D12;
            }
            if (D1 >= 0 && D12 > D1 && D15 >= D14 && D14 >= D1 && D15 <= D12 && D13 > 0) {
                int D16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".isClockwise"), 0);
                int D17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".showSimpleTransition"), 0);
                java.lang.String str2 = (java.lang.String) map.get(str + ".title");
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                java.lang.String str4 = str3 != null ? str3 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r();
                rVar.f247640d = D1;
                rVar.f247641e = D12;
                rVar.f247642f = D14;
                rVar.f247643g = D15;
                rVar.f247644h = D13;
                rVar.f247646m = str2;
                rVar.f247647n = str4;
                rVar.f247645i = D16 == 1;
                rVar.f247648o = D17 == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
                return rVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m70517x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        java.lang.String str = "{twistStartTime=" + this.f247640d + ", twistEndTime=" + this.f247641e + ", coverStartTime=" + this.f247642f + ", coverEndTime=" + this.f247643g + ", maxDegree=" + this.f247644h + ", isClockWise=" + this.f247645i + ", title='" + this.f247646m + "', desc='" + this.f247647n + "'}";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
        return str;
    }
}
