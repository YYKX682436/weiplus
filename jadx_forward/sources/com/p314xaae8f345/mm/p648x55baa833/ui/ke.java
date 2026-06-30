package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class ke extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.le f145826a;

    public ke(com.p314xaae8f345.mm.p648x55baa833.ui.le leVar) {
        this.f145826a = leVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.le leVar = this.f145826a;
        leVar.getClass();
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            return com.p314xaae8f345.mm.p648x55baa833.ui.le.b(leVar, i17);
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p648x55baa833.ui.le leVar = this.f145826a;
        leVar.getClass();
        if (!com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            return false;
        }
        java.util.HashMap hashMap = (java.util.HashMap) leVar.W;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        if (i18 == android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS.getId()) {
            int i19 = leVar.U;
            if (i17 == i19) {
                return false;
            }
            if (i19 != Integer.MIN_VALUE) {
                leVar.e(i19, 65536);
            }
            leVar.U = i17;
            leVar.invalidate();
            leVar.e(leVar.U, 32768);
            return false;
        }
        if (i18 == android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId()) {
            if (!(i17 == leVar.U)) {
                return false;
            }
            leVar.U = Integer.MIN_VALUE;
            leVar.invalidate();
            leVar.e(i17, 65536);
        } else {
            if (i18 != android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId()) {
                return false;
            }
            android.util.Pair pair = (android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17));
            if (pair != null) {
                leVar.c((kn.a) pair.first);
            }
        }
        return true;
    }
}
