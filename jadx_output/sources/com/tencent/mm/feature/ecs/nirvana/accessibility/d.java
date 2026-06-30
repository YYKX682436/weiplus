package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class d implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.accessibility.AccessibilityManager f65646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.h f65647e;

    public d(com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar, android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.f65647e = hVar;
        this.f65646d = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z17) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65647e;
        if (hVar.f65701s) {
            return;
        }
        if (!z17) {
            hVar.h(false);
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = hVar.f65695m;
            if (gVar != null) {
                hVar.f(gVar.f65655b, 256);
                hVar.f65695m = null;
            }
        }
        if (hVar.f65699q != null) {
            this.f65646d.isEnabled();
        }
    }
}
