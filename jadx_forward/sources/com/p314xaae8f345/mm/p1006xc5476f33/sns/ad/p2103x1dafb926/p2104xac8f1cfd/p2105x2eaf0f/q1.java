package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class q1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f244449a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f244450b;

    /* renamed from: c, reason: collision with root package name */
    public final f54.o f244451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f244452d;

    /* renamed from: e, reason: collision with root package name */
    public final long f244453e = java.lang.System.currentTimeMillis();

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f, o44.c cVar, f54.o oVar, int i17) {
        this.f244450b = new java.lang.ref.WeakReference(c17730x4c10861f);
        this.f244449a = new java.lang.ref.WeakReference(cVar);
        this.f244451c = oVar;
        this.f244452d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo, errType=" + i17 + ", errNo=" + i18);
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0 && obj != null) {
            r45.qp3 qp3Var = new r45.qp3();
            try {
                qp3Var.mo11468x92b714fd((byte[]) obj);
                bundle.putInt("status", qp3Var.f465710d);
                java.lang.String str2 = qp3Var.f465711e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                bundle.putString("card_id", str2);
                java.lang.String str3 = qp3Var.f465712f;
                if (str3 == null) {
                    str3 = "";
                }
                bundle.putString("give_card_id", str3);
                bundle.putString("receive_url", qp3Var.f465713g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo, status=" + qp3Var.f465710d + ", cardId=" + qp3Var.f465711e + ", giveCardId=" + qp3Var.f465712f + ", jumpUrl=" + qp3Var.f465713g);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo exp=" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        int i19 = bundle.getInt("status", -1);
        java.lang.String string = bundle.getString("card_id", "");
        java.lang.String string2 = bundle.getString("give_card_id", "");
        java.lang.String string3 = bundle.getString("receive_url", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "getHBStatus rsp, errType=" + i17 + ", errNo=" + i18 + ", status=" + i19 + ", cardId=" + string + ", giveCardId=" + string2 + ", timeCost=" + (java.lang.System.currentTimeMillis() - this.f244453e) + ", opType=" + this.f244452d + ", jumpUrl=" + string3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f) this.f244450b.get();
        o44.c cVar = (o44.c) this.f244449a.get();
        if (c17730x4c10861f == null || cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingHBCardComponent", "onCallback, hbComp==null or showCard==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.content.Context context = c17730x4c10861f.f246582d;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context;
            activityC18007x6d5e9773.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            a54.e eVar = activityC18007x6d5e9773.D2;
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            ((ku5.t0) ku5.t0.f394148d).B(new a54.d(eVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        f54.p pVar = (f54.p) c17730x4c10861f.p();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.content.Context context2 = c17730x4c10861f.f246582d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (i17 != 0 || i18 != 0 || obj == null) {
            if (this.f244452d == 1) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o1(this, context2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        } else {
            if (pVar != null && (str = pVar.F) != null && str.equals(string2) && this.f244451c != null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.p1(this, i19, cVar, c17730x4c10861f, string3, context2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        }
    }
}
