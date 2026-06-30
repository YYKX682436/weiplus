package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class nb extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f251520a;

    public nb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773) {
        this.f251520a = activityC18007x6d5e9773;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "show", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251520a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.T6(activityC18007x6d5e9773) == null || !(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.T6(activityC18007x6d5e9773).m70244xf939df19() instanceof p012xc85e97e9.p087x9da2e250.app.y1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC18007x6d5e9773.f248233d, "videoProgressbarStatusChangeReceiver called ,but the viewpager or adapter is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.y1 y1Var = (p012xc85e97e9.p087x9da2e250.app.y1) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.T6(activityC18007x6d5e9773).m70244xf939df19();
        int m70245xfda78ef6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.T6(activityC18007x6d5e9773).m70245xfda78ef6();
        if (m70245xfda78ef6 >= y1Var.mo8338x7444f759()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC18007x6d5e9773.f248233d, "videoProgressbarStatusChangeReceiver called ,current index is larger than item count!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
            return;
        }
        java.lang.String str = activityC18007x6d5e9773.f248233d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 c17928xf2aba9c9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9) y1Var.mo7764xfb80e389(m70245xfda78ef6);
        boolean z17 = g17 == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        activityC18007x6d5e9773.f248231c2 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        activityC18007x6d5e9773.u8(500L);
        c17928xf2aba9c9.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        c17928xf2aba9c9.f247283t = z17;
        if (!c17928xf2aba9c9.o0() || z17) {
            c17928xf2aba9c9.A0();
        } else {
            c17928xf2aba9c9.z0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
    }
}
