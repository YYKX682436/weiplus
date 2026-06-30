package w64;

/* loaded from: classes4.dex */
public final class p implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w64.o f524865a;

    public p(w64.o oVar) {
        this.f524865a = oVar;
    }

    @Override // bi4.l1
    /* renamed from: onFinishAction */
    public final void mo10624xfbbb8828(int i17, java.lang.String str, pj4.r0 r0Var) {
        w64.o oVar = this.f524865a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpTextStatusUIHelper", "callback:  result = " + i17 + ", errMsg = " + str + ",  info = " + r0Var);
        if (i17 == 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                oVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("snsid", oVar.f524862e);
                oVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("uxinfo", oVar.f524861d);
                oVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, oVar.f524863f);
                oVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("adExtInfo", oVar.f524864g);
                ca4.m0.a("sns_ad_state_publish_user_confirm", jSONObject.toString());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdJumpTextStatusUIHelper", th6, "adChannelCgiReport error!", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
    }
}
