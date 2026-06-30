package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class ke extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.le f64293a;

    public ke(com.tencent.mm.chatroom.ui.le leVar) {
        this.f64293a = leVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        com.tencent.mm.chatroom.ui.le leVar = this.f64293a;
        leVar.getClass();
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            return com.tencent.mm.chatroom.ui.le.b(leVar, i17);
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        com.tencent.mm.chatroom.ui.le leVar = this.f64293a;
        leVar.getClass();
        if (!com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
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
