package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class c implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f244300a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f244301b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f244302c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f244303d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f244304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f244305f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f244306g;

    /* renamed from: h, reason: collision with root package name */
    public int f244307h;

    /* renamed from: i, reason: collision with root package name */
    public final int f244308i;

    public c(int i17, java.lang.String str) {
        this.f244308i = -1;
        this.f244305f = i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f244306g = str == null ? "" : str;
    }

    public final void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("appId", this.f244303d);
                jSONObject.putOpt("stockId", this.f244304e);
                jSONObject.putOpt("result", java.lang.Integer.valueOf(this.f244305f));
                jSONObject.putOpt("msg", this.f244306g);
                jSONObject.putOpt(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f244307h));
                jSONObject.putOpt("actionType", java.lang.Integer.valueOf(this.f244308i));
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        return "sns_ad_native_landing_page_coupon";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        try {
            jSONObject.putOpt("snsid", this.f244300a);
            jSONObject.putOpt("uxinfo", this.f244301b);
            jSONObject.putOpt("adExtInfo", this.f244302c);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.putOpt("extInfo", jSONObject2);
            a(jSONObject2);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        java.lang.String jSONObject3 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        return jSONObject3;
    }

    public c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f fVar, int i17, java.lang.String str, int i18) {
        java.lang.String str2;
        this.f244308i = -1;
        if (fVar != null) {
            ab4.n0 u17 = fVar.u();
            if (u17 != null) {
                java.lang.String k17 = u17.k();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                try {
                    str2 = ca4.z0.t0(ca4.m0.D0(k17));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                    str2 = "";
                }
                this.f244300a = str2;
                java.lang.String a17 = u17.a();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f244302c = a17 == null ? "" : a17;
                java.lang.String n17 = u17.n();
                n17 = n17 == null ? "" : n17;
                this.f244301b = n17;
                if (android.text.TextUtils.isEmpty(n17)) {
                    java.lang.String o17 = u17.o();
                    this.f244301b = o17 == null ? "" : o17;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            f54.b bVar = fVar.B;
            if (bVar != null) {
                this.f244303d = bVar.f341232z1;
                this.f244304e = bVar.A1;
            }
        }
        this.f244307h = 0;
        this.f244305f = i17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f244306g = str == null ? "" : str;
        this.f244308i = i18;
    }
}
