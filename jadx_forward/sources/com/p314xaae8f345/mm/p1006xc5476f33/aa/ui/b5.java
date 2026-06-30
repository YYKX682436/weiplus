package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class b5 extends com.p314xaae8f345.mm.p2802xd031a825.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154117a;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154117a = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154117a;
        java.lang.String string = activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gaw);
        if (activityC11351x975a7907.f154037h != 2 && activityC11351x975a7907.f154038i == 4) {
            string = activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gar);
        }
        accessibilityNodeInfo.setContentDescription(java.lang.String.format("%s,%s,%s", string, activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gal), activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gap)));
    }
}
