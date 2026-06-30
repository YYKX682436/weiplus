package k84;

/* loaded from: classes4.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.s1 f386786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k84.s1 s1Var) {
        super(0);
        this.f386786d = s1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mb4.r rVar;
        mb4.v i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        k84.r1 r1Var = k84.d4.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        k84.s1 dataRef = this.f386786d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataRef, "dataRef");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = dataRef.f386768b;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            int i18 = dataRef.f386769c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            r1Var.c(3);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, dataRef.f386767a);
            java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            mb4.c cVar = c17933xe8d1b226.m70354x74235b3e().f38211x1b3eca3e;
            if (cVar != null && (rVar = cVar.f406921m) != null && (i17 = rVar.i()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                java.lang.String str3 = i17.f407013a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                if (str3 != null) {
                    str2 = str3;
                }
            }
            jSONObject2.put("numberRequestId", str2);
            jSONObject2.put("totalLikeCount", i18);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFireworkCheerComponent", "sns_ad_firework_cheer_report:".concat(jSONObject3));
            ca4.m0.a("sns_ad_firework_cheer_report", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            dataRef.f386769c = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        return f0Var;
    }
}
