package a84;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupFeedbackAccessibilityProtection", "com.tencent.mm.plugin.sns.ad.utils.AdAccessibilityProtectionHelper");
        if (view != null) {
            view.setAccessibilityDelegate(new a84.q());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupFeedbackAccessibilityProtection", "com.tencent.mm.plugin.sns.ad.utils.AdAccessibilityProtectionHelper");
    }
}
