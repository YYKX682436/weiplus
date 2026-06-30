package n44;

/* loaded from: classes14.dex */
public final class p0 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f416545a;

    /* renamed from: e, reason: collision with root package name */
    public long f416549e;

    /* renamed from: f, reason: collision with root package name */
    public int f416550f;

    /* renamed from: g, reason: collision with root package name */
    public int f416551g;

    /* renamed from: h, reason: collision with root package name */
    public int f416552h;

    /* renamed from: j, reason: collision with root package name */
    public n44.o0 f416554j;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f416546b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f416547c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416548d = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f416553i = new java.util.ArrayList();

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        if (jSONObject != null) {
            jSONObject.putOpt("snsid", this.f416547c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f416548d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("aid", this.f416546b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f416545a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    @Override // a84.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n44.p0.b(org.json.JSONObject):void");
    }

    public final n44.o0 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.g6.f34480x24728b, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        n44.o0 o0Var = this.f416554j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.g6.f34480x24728b, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        return o0Var;
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        return "sns_ad_conventional_half_screen_report";
    }
}
