package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class a2 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f295984e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z1 f295985f;

    public a2(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f295984e = c22949xf1deaba4;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z1 z1Var = this.f295985f;
        if (z1Var != null) {
            this.f295985f = z1Var;
        } else {
            this.f295985f = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z1(this);
        }
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        if (view instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f295984e;
            if (!c22949xf1deaba4.A || c22949xf1deaba4.I || c22949xf1deaba4.f295934h.g()) {
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) view;
            if (c22949xf1deaba42.m83599xfd37656d() != null) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 e0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) c22949xf1deaba42.m83599xfd37656d();
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba43 = e0Var.f296055b;
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = c22949xf1deaba43.f295932f;
                if (accessibilityEvent != null) {
                    accessibilityEvent.setScrollable(c22949xf1deaba43.canScrollVertically(1) || e0Var.f296055b.canScrollVertically(-1) || e0Var.f296055b.canScrollHorizontally(-1) || e0Var.f296055b.canScrollHorizontally(1));
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 u0Var = e0Var.f296055b.f295945s;
                    if (u0Var != null) {
                        accessibilityEvent.setItemCount(u0Var.a());
                    }
                }
                if (e0Var.h() > 0) {
                    accessibilityEvent.setFromIndex(e0Var.N());
                    android.view.View P = e0Var.P(e0Var.h() - 1, -1, false, true);
                    accessibilityEvent.setToIndex(P != null ? e0Var.o(P) : -1);
                }
            }
        }
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f295984e;
        if ((!c22949xf1deaba4.A || c22949xf1deaba4.I || c22949xf1deaba4.f295934h.g()) || c22949xf1deaba4.m83599xfd37656d() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 m83599xfd37656d = c22949xf1deaba4.m83599xfd37656d();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = m83599xfd37656d.f296055b.f295932f;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n nVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n) m83599xfd37656d;
        if (nVar.f296055b.canScrollVertically(-1) || nVar.f296055b.canScrollHorizontally(-1)) {
            lVar.a(8192);
            lVar.t(true);
        }
        if (nVar.f296055b.canScrollVertically(1) || nVar.f296055b.canScrollHorizontally(1)) {
            lVar.a(4096);
            lVar.t(true);
        }
        lVar.f424175a.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(-1, -1, false, 0));
        nVar.A.f296284z.getClass();
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        int n17;
        int l17;
        int i18;
        int i19;
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f295984e;
        if ((!c22949xf1deaba4.A || c22949xf1deaba4.I || c22949xf1deaba4.f295934h.g()) || c22949xf1deaba4.m83599xfd37656d() == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 m83599xfd37656d = c22949xf1deaba4.m83599xfd37656d();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var = m83599xfd37656d.f296055b.f295932f;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n nVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n) m83599xfd37656d;
        nVar.A.f296284z.getClass();
        if (nVar.f296055b != null) {
            int i27 = nVar.f296066m;
            int i28 = nVar.f296065l;
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nVar.f296055b.getMatrix().isIdentity() && nVar.f296055b.getGlobalVisibleRect(rect)) {
                i27 = rect.height();
                i28 = rect.width();
            }
            if (i17 == 4096) {
                n17 = nVar.f296055b.canScrollVertically(1) ? (i27 - nVar.n()) - nVar.k() : 0;
                if (nVar.f296055b.canScrollHorizontally(1)) {
                    l17 = (i28 - nVar.l()) - nVar.m();
                    i18 = n17;
                    i19 = l17;
                }
                i18 = n17;
                i19 = 0;
            } else if (i17 != 8192) {
                i19 = 0;
                i18 = 0;
            } else {
                n17 = nVar.f296055b.canScrollVertically(-1) ? -((i27 - nVar.n()) - nVar.k()) : 0;
                if (nVar.f296055b.canScrollHorizontally(-1)) {
                    l17 = -((i28 - nVar.l()) - nVar.m());
                    i18 = n17;
                    i19 = l17;
                }
                i18 = n17;
                i19 = 0;
            }
            if (i18 != 0 || i19 != 0) {
                nVar.f296055b.d0(i19, i18, null, Integer.MIN_VALUE, true);
                return true;
            }
        }
        return false;
    }
}
