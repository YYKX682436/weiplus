package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class p5 extends com.tencent.mm.wallet_core.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72769a;

    public p5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72769a = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72769a;
        java.lang.String charSequence = launchAAUI.f72513q.getText().toString();
        java.lang.String charSequence2 = launchAAUI.f72514r.getText().toString();
        java.lang.String charSequence3 = launchAAUI.f72515s.getText().toString();
        accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
        accessibilityNodeInfo.setContentDescription(charSequence + "," + charSequence3 + charSequence2);
        view.setImportantForAccessibility(launchAAUI.f72504h == 2 || launchAAUI.f72505i != 4 ? 1 : 2);
    }
}
