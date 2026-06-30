package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class tj extends android.view.View.AccessibilityDelegate {
    public tj(com.tencent.mm.plugin.account.ui.WelcomeSelectView welcomeSelectView) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }
}
