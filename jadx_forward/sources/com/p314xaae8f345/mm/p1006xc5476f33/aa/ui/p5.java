package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class p5 extends com.p314xaae8f345.mm.p2802xd031a825.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154302a;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154302a = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154302a;
        java.lang.String charSequence = activityC11351x975a7907.f154046q.getText().toString();
        java.lang.String charSequence2 = activityC11351x975a7907.f154047r.getText().toString();
        java.lang.String charSequence3 = activityC11351x975a7907.f154048s.getText().toString();
        accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
        accessibilityNodeInfo.setContentDescription(charSequence + "," + charSequence3 + charSequence2);
        view.setImportantForAccessibility(activityC11351x975a7907.f154037h == 2 || activityC11351x975a7907.f154038i != 4 ? 1 : 2);
    }
}
