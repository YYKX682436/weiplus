package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public final class t5 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171758a;

    public t5(android.view.View view) {
        this.f171758a = view;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (info.isSelected()) {
            return;
        }
        info.setTraversalAfter(this.f171758a);
        info.setTraversalBefore(null);
    }
}
