package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class w4 extends com.tencent.mm.wallet_core.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72874a;

    public w4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72874a = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72874a;
        java.lang.String string = launchAAUI.getString(com.tencent.mm.R.string.gaw);
        if (launchAAUI.f72504h == 2) {
            string = launchAAUI.getString(com.tencent.mm.R.string.gar);
        }
        accessibilityNodeInfo.setContentDescription(java.lang.String.format("%s,%s,%s", string, launchAAUI.getString(com.tencent.mm.R.string.gaj), launchAAUI.getString(com.tencent.mm.R.string.gan)));
    }
}
