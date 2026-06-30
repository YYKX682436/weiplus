package k84;

/* loaded from: classes4.dex */
public class k extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f386617a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f386618b;

    /* renamed from: c, reason: collision with root package name */
    public int f386619c;

    /* renamed from: d, reason: collision with root package name */
    public int f386620d;

    /* renamed from: e, reason: collision with root package name */
    public int f386621e;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("snsid", this.f386617a);
            jSONObject.putOpt("uxinfo", this.f386618b);
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f386619c == 0 ? 1 : 2));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("playCount", java.lang.Integer.valueOf(this.f386620d));
            jSONObject.putOpt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(this.f386621e));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    public void c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f386617a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f386618b = str2;
        this.f386619c = i17;
        this.f386620d = i18;
        this.f386621e = i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        return "sns_ad_card_like_attracting_animation_played";
    }
}
