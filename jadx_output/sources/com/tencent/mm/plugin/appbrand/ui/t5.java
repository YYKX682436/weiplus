package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public final class t5 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f90225a;

    public t5(android.view.View view) {
        this.f90225a = view;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (info.isSelected()) {
            return;
        }
        info.setTraversalAfter(this.f90225a);
        info.setTraversalBefore(null);
    }
}
