package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes15.dex */
public class b implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h f147177a;

    public b(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar) {
        this.f147177a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar = this.f147177a;
        if (hVar.f147234s) {
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar = hVar.f147217b;
            lVar.f147243a = hVar.f147235t;
            lVar.f147245c = true;
            lVar.d("onAccessibilityEnabled", null);
        } else {
            hVar.h(false);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar2 = hVar.f147217b;
            lVar2.f147243a = null;
            lVar2.f147245c = false;
            lVar2.d("onAccessibilityDisabled", null);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.f fVar = hVar.f147232q;
        if (fVar != null) {
            hVar.f147218c.isTouchExplorationEnabled();
            fVar.getClass();
        }
    }
}
