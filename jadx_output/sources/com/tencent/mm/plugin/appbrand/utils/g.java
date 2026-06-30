package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class g implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.f f90446d;

    public g(com.tencent.mm.plugin.appbrand.utils.f fVar) {
        this.f90446d = fVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z17) {
        this.f90446d.notify(java.lang.Boolean.valueOf(z17));
    }
}
