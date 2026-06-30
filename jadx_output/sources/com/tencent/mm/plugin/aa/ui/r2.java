package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r2 extends com.tencent.mm.wallet_core.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.u2 f72784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.v2 f72785b;

    public r2(com.tencent.mm.plugin.aa.ui.v2 v2Var, com.tencent.mm.plugin.aa.ui.u2 u2Var) {
        this.f72785b = v2Var;
        this.f72784a = u2Var;
    }

    @Override // com.tencent.mm.wallet_core.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.EditText.class.getName());
        java.lang.String obj = this.f72784a.f72831i.getContentEt().getText().toString();
        if (obj.length() == 0) {
            obj = "0";
        }
        accessibilityNodeInfo.setContentDescription(obj + this.f72785b.f72851e.getString(com.tencent.mm.R.string.g_p));
    }
}
