package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class c5 extends com.tencent.mm.wallet_core.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72593a;

    public c5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72593a = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        accessibilityNodeInfo.setContentDescription(this.f72593a.getString(com.tencent.mm.R.string.g__));
        if (view.isClickable()) {
            return;
        }
        view.setImportantForAccessibility(2);
    }
}
