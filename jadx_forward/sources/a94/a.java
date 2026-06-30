package a94;

/* loaded from: classes4.dex */
public class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f83963d;

    /* renamed from: e, reason: collision with root package name */
    public int f83964e;

    /* renamed from: f, reason: collision with root package name */
    public int f83965f;

    /* renamed from: g, reason: collision with root package name */
    public int f83966g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83967h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f83968i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f83969m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f83970n;

    /* renamed from: o, reason: collision with root package name */
    public int f83971o;

    /* renamed from: p, reason: collision with root package name */
    public int f83972p;

    /* renamed from: simpleTransitionAnimationUrl */
    @za4.k1(m178630x415c6bfa = 3)
    public java.lang.String f0xf8176992;

    /* renamed from: themePAGUrl */
    @za4.k1(m178630x415c6bfa = 3)
    public java.lang.String f1xda657822;

    public static a94.a a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        if (map.containsKey(str)) {
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".shakeStartTime"), 0);
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".shakeEndTime"), 0);
            int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".coverStartTime"), 0);
            int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".coverEndTime"), 0);
            if (D13 == 0) {
                D13 = D1;
            }
            if (D14 == 0) {
                D14 = D12;
            }
            if (D1 >= 0 && D12 > D1 && D14 >= D13 && D13 >= D1 && D14 <= D12) {
                java.lang.String str2 = (java.lang.String) map.get(str + ".title");
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                if (str3 == null) {
                    str3 = "";
                }
                a94.a aVar = new a94.a();
                aVar.f83963d = D1;
                aVar.f83964e = D12;
                aVar.f83965f = D13;
                aVar.f83966g = D14;
                aVar.f83967h = str2;
                aVar.f83968i = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".simpleTransitionAnimationUrl");
                if (str4 == null) {
                    str4 = "";
                }
                aVar.f0xf8176992 = str4;
                java.lang.String str5 = (java.lang.String) map.get(str + ".simpleTransitionAnimationMD5");
                if (str5 == null) {
                    str5 = "";
                }
                aVar.f83969m = str5;
                java.lang.String str6 = (java.lang.String) map.get(str + ".themePAGUrl");
                if (str6 == null) {
                    str6 = "";
                }
                aVar.f1xda657822 = str6;
                java.lang.String str7 = (java.lang.String) map.get(str + ".themePAGMD5");
                aVar.f83970n = str7 != null ? str7 : "";
                aVar.f83971o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".triggerGForceMin"), 0);
                aVar.f83972p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".triggerGForceMax"), 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
                return aVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m875x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        java.lang.String str = "{shakeStartTime=" + this.f83963d + ", shakeEndTime=" + this.f83964e + ", coverStartTime=" + this.f83965f + ", coverEndTime=" + this.f83966g + ", title=" + this.f83967h + ", desc=" + this.f83968i + ", simpleTransitionAnimationUrl=" + this.f0xf8176992 + ", simpleTransitionAnimationMD5=" + this.f83969m + ", themePAGUrl=" + this.f1xda657822 + ", themePAGMD5=" + this.f83970n + '}';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo");
        return str;
    }
}
