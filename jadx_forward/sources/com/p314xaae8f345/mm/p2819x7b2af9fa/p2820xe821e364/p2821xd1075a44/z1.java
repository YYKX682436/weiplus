package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class z1 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a2 f296261e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f296262f = new java.util.WeakHashMap();

    public z1(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a2 a2Var) {
        this.f296261e = a2Var;
    }

    @Override // n3.c
    /* renamed from: dispatchPopulateAccessibilityEvent */
    public boolean mo83645x94b6bc90(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        return cVar != null ? cVar.mo83645x94b6bc90(view, accessibilityEvent) : super.mo83645x94b6bc90(view, accessibilityEvent);
    }

    @Override // n3.c
    /* renamed from: getAccessibilityNodeProvider */
    public o3.p mo7150x3c1c23cb(android.view.View view) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        return cVar != null ? cVar.mo7150x3c1c23cb(view) : super.mo7150x3c1c23cb(view);
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        if (cVar != null) {
            cVar.mo7239x9d5dd31b(view, accessibilityEvent);
        } else {
            super.mo7239x9d5dd31b(view, accessibilityEvent);
        }
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a2 a2Var = this.f296261e;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = a2Var.f295984e;
        if (!(!c22949xf1deaba4.A || c22949xf1deaba4.I || c22949xf1deaba4.f295934h.g())) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = a2Var.f295984e;
            if (c22949xf1deaba42.m83599xfd37656d() != null) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 m83599xfd37656d = c22949xf1deaba42.m83599xfd37656d();
                m83599xfd37656d.getClass();
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
                if (K != null && !K.m() && !m83599xfd37656d.f296054a.j(K.f296236d)) {
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = m83599xfd37656d.f296055b.f295932f;
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n) m83599xfd37656d).A.f296284z).f296316d;
                    lVar.o(o3.k.a(c22956x1a4bbf4.m83652x84093c9a() == 1 ? c22956x1a4bbf4.f296271m.o(view) : 0, 1, c22956x1a4bbf4.m83652x84093c9a() == 0 ? c22956x1a4bbf4.f296271m.o(view) : 0, 1, false, false));
                }
                n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
                if (cVar != null) {
                    cVar.mo7102x1bd2f9af(view, lVar);
                    return;
                } else {
                    super.mo7102x1bd2f9af(view, lVar);
                    return;
                }
            }
        }
        super.mo7102x1bd2f9af(view, lVar);
    }

    @Override // n3.c
    /* renamed from: onPopulateAccessibilityEvent */
    public void mo20440x6b5fe1b5(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        if (cVar != null) {
            cVar.mo20440x6b5fe1b5(view, accessibilityEvent);
        } else {
            super.mo20440x6b5fe1b5(view, accessibilityEvent);
        }
    }

    @Override // n3.c
    /* renamed from: onRequestSendAccessibilityEvent */
    public boolean mo8238xde18d764(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(viewGroup);
        return cVar != null ? cVar.mo8238xde18d764(viewGroup, view, accessibilityEvent) : super.mo8238xde18d764(viewGroup, view, accessibilityEvent);
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a2 a2Var = this.f296261e;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = a2Var.f295984e;
        if (!(!c22949xf1deaba4.A || c22949xf1deaba4.I || c22949xf1deaba4.f295934h.g())) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = a2Var.f295984e;
            if (c22949xf1deaba42.m83599xfd37656d() != null) {
                n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
                if (cVar != null) {
                    if (cVar.mo7240xcdbe3403(view, i17, bundle)) {
                        return true;
                    }
                } else if (super.mo7240xcdbe3403(view, i17, bundle)) {
                    return true;
                }
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba42.m83599xfd37656d().f296055b.f295932f;
                return false;
            }
        }
        return super.mo7240xcdbe3403(view, i17, bundle);
    }

    @Override // n3.c
    /* renamed from: sendAccessibilityEvent */
    public void mo83646xf64a1b94(android.view.View view, int i17) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        if (cVar != null) {
            cVar.mo83646xf64a1b94(view, i17);
        } else {
            super.mo83646xf64a1b94(view, i17);
        }
    }

    @Override // n3.c
    /* renamed from: sendAccessibilityEventUnchecked */
    public void mo83647x80129dba(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        n3.c cVar = (n3.c) ((java.util.WeakHashMap) this.f296262f).get(view);
        if (cVar != null) {
            cVar.mo83647x80129dba(view, accessibilityEvent);
        } else {
            super.mo83647x80129dba(view, accessibilityEvent);
        }
    }
}
