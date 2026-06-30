package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class b implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.h f65644a;

    public b(com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar) {
        this.f65644a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z17) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65644a;
        if (hVar.f65701s) {
            return;
        }
        if (z17) {
            com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = hVar.f65684b;
            lVar.f65710a = hVar.f65702t;
            lVar.f65712c = true;
            lVar.d("onAccessibilityEnabled", null);
        } else {
            hVar.h(false);
            com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar2 = hVar.f65684b;
            lVar2.f65710a = null;
            lVar2.f65712c = false;
            lVar2.d("onAccessibilityDisabled", null);
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.f fVar = hVar.f65699q;
        if (fVar != null) {
            hVar.f65685c.isTouchExplorationEnabled();
            fVar.getClass();
        }
    }
}
