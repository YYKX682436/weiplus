package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class v implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        java.lang.String a17 = com.tencent.matrix.lifecycle.f0.f52695c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OverlayWindowLifecycleOwner: OFF, hasOverlay = ");
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        sb6.append(overlayWindowLifecycleOwner.hasOverlayWindow());
        sb6.append(", hasVisible = ");
        sb6.append(overlayWindowLifecycleOwner.hasVisibleWindow());
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        java.lang.String a17 = com.tencent.matrix.lifecycle.f0.f52695c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OverlayWindowLifecycleOwner: ON, hasOverlay = ");
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        sb6.append(overlayWindowLifecycleOwner.hasOverlayWindow());
        sb6.append(", hasVisible = ");
        sb6.append(overlayWindowLifecycleOwner.hasVisibleWindow());
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
