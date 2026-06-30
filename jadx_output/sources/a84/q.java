package a84;

/* loaded from: classes4.dex */
public final class q extends android.view.View.AccessibilityDelegate implements com.tencent.mm.accessibility.core.IMMAccessibilityPerformMark {

    /* renamed from: a, reason: collision with root package name */
    public android.view.accessibility.AccessibilityManager f2348a;

    public final boolean a(android.content.Context context) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTouchExplorationEnabled", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureAccessibilityManager", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            if (this.f2348a == null) {
                java.lang.Object systemService = context.getSystemService("accessibility");
                this.f2348a = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureAccessibilityManager", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            android.view.accessibility.AccessibilityManager accessibilityManager = this.f2348a;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(accessibilityManager != null ? accessibilityManager.isTouchExplorationEnabled() : false));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTouchExplorationEnabled", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return booleanValue;
    }

    public final boolean b(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        android.content.Context context = view.getContext();
        boolean z17 = false;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FeedbackProtection", "the host view's context is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            return false;
        }
        if (a(context)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 141);
            com.tencent.mars.xlog.Log.i("SnsAd.FeedbackProtection", "the touch exploration is enabled, return false");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.FeedbackProtection", "the touch exploration isn't enabled, return true");
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPerformAccessibilityClickAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return z17;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        android.content.Context context = host.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FeedbackProtection", "the context is null, it's not valid!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        } else {
            if (!a(context)) {
                info.setClickable(false);
                info.setBoundsInScreen(new android.graphics.Rect(-1, -1, -1, -1));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View host, int i17, android.os.Bundle bundle) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mars.xlog.Log.i("SnsAd.FeedbackProtection", "the performAccessibilityAction is called, action is " + i17);
        if (16 != i17) {
            boolean performAccessibilityAction = super.performAccessibilityAction(host, i17, bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
            return performAccessibilityAction;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 140);
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(b(host, bundle)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) m521constructorimpl;
        boolean performAccessibilityAction2 = bool != null ? bool.booleanValue() : false ? true : super.performAccessibilityAction(host, i17, bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.ad.utils.AdFeedbackAccessibilityProtection");
        return performAccessibilityAction2;
    }
}
