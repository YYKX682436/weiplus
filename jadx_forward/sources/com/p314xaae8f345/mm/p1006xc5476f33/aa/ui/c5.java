package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class c5 extends com.p314xaae8f345.mm.p2802xd031a825.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154126a;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154126a = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        accessibilityNodeInfo.setContentDescription(this.f154126a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g__));
        if (view.isClickable()) {
            return;
        }
        view.setImportantForAccessibility(2);
    }
}
