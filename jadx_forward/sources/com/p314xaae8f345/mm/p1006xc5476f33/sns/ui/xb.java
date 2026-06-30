package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xb implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f253035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f253036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f253037c;

    public xb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773, long j17, yz5.l lVar) {
        this.f253037c = activityC18007x6d5e9773;
        this.f253035a = j17;
        this.f253036b = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f253037c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        try {
            java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.f248225q3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            a54.e eVar = activityC18007x6d5e9773.D2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            android.view.View view = eVar.f83127b;
            boolean z17 = view != null && view.getVisibility() == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                a54.e eVar2 = activityC18007x6d5e9773.D2;
                eVar2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                ((ku5.t0) ku5.t0.f394148d).B(new a54.d(eVar2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = activityC18007x6d5e9773.f248233d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestDynamicCanvasXml callback, pageId is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                java.lang.String str3 = activityC18007x6d5e9773.C2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                sb6.append(str3);
                sb6.append(", pageIdParam is ");
                sb6.append(this.f253035a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                yz5.l lVar = this.f253036b;
                if (lVar != null) {
                    lVar.mo146xb9724478(str);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC18007x6d5e9773.f248233d, "doRequestDynamicCanvasXml callback, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
    }
}
