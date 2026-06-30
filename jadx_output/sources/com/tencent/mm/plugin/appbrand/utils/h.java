package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.h f90454d = new com.tencent.mm.plugin.appbrand.utils.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.utils.f fVar = new com.tencent.mm.plugin.appbrand.utils.f();
        com.tencent.mm.plugin.appbrand.utils.i iVar = com.tencent.mm.plugin.appbrand.utils.i.f90466d;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.i.f90467e).getValue();
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(new com.tencent.mm.plugin.appbrand.utils.g(fVar));
        }
        return fVar;
    }
}
