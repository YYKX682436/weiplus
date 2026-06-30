package k84;

/* loaded from: classes4.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.n f386800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k84.n nVar) {
        super(0);
        this.f386800d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        mb4.p pVar;
        mb4.h0 c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        k84.l lVar = k84.q1.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        k84.n dataRef = this.f386800d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataRef, "dataRef");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = dataRef.f386666b;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i17 = dataRef.f386667c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i18 = dataRef.f386668d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i19 = dataRef.f386669e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, dataRef.f386665a);
            java.lang.String str2 = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("adExtInfo", str2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            mb4.c cVar = c17933xe8d1b226.m70354x74235b3e().f38211x1b3eca3e;
            if (cVar == null || (pVar = cVar.f406920l) == null || (c17 = pVar.c()) == null) {
                str = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo");
                str = c17.f406946a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo");
            }
            jSONObject2.put("numberRequestId", str);
            jSONObject2.put("totalLikeCount", i17);
            jSONObject2.put("continuousLikeCount", i18);
            jSONObject2.put("bannerPlayCount", i19);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdContinuousLikeComponent", "sns_ad_continuous_like_report:".concat(jSONObject3));
            ca4.m0.a("sns_ad_continuous_like_report", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f386667c = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f386668d = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f386669e = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        return f0Var;
    }
}
