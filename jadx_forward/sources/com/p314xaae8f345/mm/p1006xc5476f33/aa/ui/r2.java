package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class r2 extends com.p314xaae8f345.mm.p2802xd031a825.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 f154317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 f154318b;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var) {
        this.f154318b = v2Var;
        this.f154317a = u2Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.e, android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.EditText.class.getName());
        java.lang.String obj = this.f154317a.f154364i.m83169xe7297452().getText().toString();
        if (obj.length() == 0) {
            obj = "0";
        }
        accessibilityNodeInfo.setContentDescription(obj + this.f154318b.f154384e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_p));
    }
}
