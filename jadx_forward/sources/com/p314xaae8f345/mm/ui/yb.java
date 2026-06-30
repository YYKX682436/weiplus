package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class yb extends com.p314xaae8f345.mm.ui.ga implements ma5.d {
    public ma5.e A0;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f294117y0 = null;

    /* renamed from: z0, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f294118z0;

    @Override // com.p314xaae8f345.mm.ui.ga
    public int A() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public s75.b B() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78649xe9868365();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public int C() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.getF153758d();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public android.view.View D() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78651x29ebce5();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public p012xc85e97e9.p016x746ad0e3.app.b F() {
        if (this.f294118z0 == null) {
            this.f294118z0 = this.A0.e();
        }
        return this.f294118z0;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void N0() {
        ma5.e eVar = this.A0;
        if (eVar.f406773o) {
            return;
        }
        eVar.f406773o = true;
        ((ma5.c) eVar.f406774p).run();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean V() {
        return true;
    }

    @Override // ma5.d
    public void a(o.r rVar, boolean z17) {
    }

    @Override // ma5.d
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        return j0(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void f0() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78673x6c4bab6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void i0() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78677x62d1e2e9();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void m(android.view.View view) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26076x2105eeb2(view);
        }
    }

    @Override // ma5.d
    /* renamed from: onCreatePanelMenu */
    public boolean mo82211xfb331c08(int i17, android.view.Menu menu) {
        this.f294117y0.mo7502xa71d2e62(menu, this.A0.f());
        return true;
    }

    @Override // ma5.d
    /* renamed from: onPreparePanel */
    public boolean mo82212xfb83a4bc(int i17, android.view.View view, android.view.Menu menu) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            return true;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7514x99b541d5(menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean s() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public java.lang.String v() {
        return this.f294117y0.getClass().getName();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public int y() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f294117y0;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78648xc86d394a();
        }
        return -1;
    }
}
