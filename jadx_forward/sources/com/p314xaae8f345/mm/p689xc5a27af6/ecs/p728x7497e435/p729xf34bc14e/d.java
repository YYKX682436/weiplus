package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes15.dex */
public class d implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.accessibility.AccessibilityManager f147179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h f147180e;

    public d(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar, android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.f147180e = hVar;
        this.f147179d = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar = this.f147180e;
        if (hVar.f147234s) {
            return;
        }
        if (!z17) {
            hVar.h(false);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = hVar.f147228m;
            if (gVar != null) {
                hVar.f(gVar.f147188b, 256);
                hVar.f147228m = null;
            }
        }
        if (hVar.f147232q != null) {
            this.f147179d.isEnabled();
        }
    }
}
