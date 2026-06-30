package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.plugin.appbrand.utils.l2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.i f90466d = new com.tencent.mm.plugin.appbrand.utils.i();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f90467e = jz5.h.b(com.tencent.mm.plugin.appbrand.utils.e.f90407d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f90468f = jz5.h.b(com.tencent.mm.plugin.appbrand.utils.h.f90454d);

    @Override // com.tencent.mm.plugin.appbrand.utils.l2
    public boolean isEnable() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) ((jz5.n) f90467e).getValue();
        if (accessibilityManager != null) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.l2
    public e75.g o9() {
        return (e75.g) ((jz5.n) f90468f).getValue();
    }
}
