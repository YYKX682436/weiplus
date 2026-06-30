package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class pn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qn f251782d;

    public pn(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qn qnVar) {
        this.f251782d = qnVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16$1");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qn qnVar = this.f251782d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f = qnVar.f251883a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.C1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z17 = accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        intent.putExtra("sns_update_preview_video_del", z17);
        qnVar.f251883a.setResult(-1, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f2 = qnVar.f251883a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f2.P = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        qnVar.f251883a.finish();
        qnVar.f251883a.overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16$1");
    }
}
