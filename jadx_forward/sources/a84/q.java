package a84;

/* loaded from: classes4.dex */
public final class q extends android.view.View.AccessibilityDelegate implements com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.InterfaceC4872x19968869 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.accessibility.AccessibilityManager f83881a;

    public final boolean a(android.content.Context context) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTouchExplorationEnabled", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureAccessibilityManager", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            if (this.f83881a == null) {
                java.lang.Object systemService = context.getSystemService("accessibility");
                this.f83881a = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureAccessibilityManager", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            android.view.accessibility.AccessibilityManager accessibilityManager = this.f83881a;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTouchExplorationEnabled", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return booleanValue;
    }

    public final boolean b(android.view.View view, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        android.content.Context context = view.getContext();
        boolean z17 = false;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FeedbackProtection", "the host view's context is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            return false;
        }
        if (a(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 141);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FeedbackProtection", "the touch exploration is enabled, return false");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FeedbackProtection", "the touch exploration isn't enabled, return true");
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return z17;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        android.content.Context context = host.getContext();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FeedbackProtection", "the context is null, it's not valid!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        } else {
            if (!a(context)) {
                info.setClickable(false);
                info.setBoundsInScreen(new android.graphics.Rect(-1, -1, -1, -1));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View host, int i17, android.os.Bundle bundle) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FeedbackProtection", "the performAccessibilityAction is called, action is " + i17);
        if (16 != i17) {
            boolean performAccessibilityAction = super.performAccessibilityAction(host, i17, bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            return performAccessibilityAction;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 140);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(b(host, bundle)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) m143895xf1229813;
        boolean performAccessibilityAction2 = bool != null ? bool.booleanValue() : false ? true : super.performAccessibilityAction(host, i17, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return performAccessibilityAction2;
    }
}
