package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderShoppingListNestedScrollCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderShoppingListNestedScrollCoordinatorLayout */
/* loaded from: classes14.dex */
public final class C14983x705ac60a extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a implements n3.d0 {
    public final java.lang.String D;
    public final n3.f0 E;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c F;
    public boolean G;
    public boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14983x705ac60a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.D = "NestedScrollCoordinatorLayout";
        this.E = new n3.f0(this);
        this.G = true;
        setNestedScrollingEnabled(true);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, n3.g0
    public boolean B(android.view.View child, android.view.View target, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return startNestedScroll(i17) || super.B(child, target, i17, i18);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.E.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.E.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.E.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.E.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.E.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.E.f415867d;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, n3.g0
    public void j(android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        super.j(target, i17);
        stopNestedScroll();
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, n3.g0
    public void l(android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        super.l(target, i17, i18, i19, i27, i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.D, "onNestedScroll, dyUnconsumed = " + i27);
        if (i27 < 0) {
            if (this.G) {
                dispatchNestedScroll(i17, i18, i19, i27, null);
            }
        } else if (this.H) {
            dispatchNestedScroll(i17, i18, i19, i27, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @Override // android.view.View
    public void onFinishInflate() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c;
        super.onFinishInflate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.D, "on set appbarLayout");
        n3.t1 t1Var = new n3.t1(this);
        while (true) {
            if (!t1Var.hasNext()) {
                c2678xa407981c = 0;
                break;
            } else {
                c2678xa407981c = t1Var.next();
                if (((android.view.View) c2678xa407981c) instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                    break;
                }
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c2 = c2678xa407981c instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c ? c2678xa407981c : null;
        this.F = c2678xa407981c2;
        if (c2678xa407981c2 != null) {
            c2678xa407981c2.a(new xt2.l6(this));
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return dispatchNestedFling(f17, f18, z17) || super.onNestedFling(target, f17, f18, z17);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return super.onNestedPreFling(target, f17, f18);
    }

    @Override // n3.d0
    public void p(int i17) {
        this.E.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.E.i(z17);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.E.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.E.k(0);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, n3.g0
    public void t(android.view.View target, int i17, int i18, int[] consumed, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        if (dispatchNestedPreScroll(i17, i18, consumed, null)) {
            return;
        }
        super.t(target, i17, i18, consumed, i19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14983x705ac60a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.D = "NestedScrollCoordinatorLayout";
        this.E = new n3.f0(this);
        this.G = true;
        setNestedScrollingEnabled(true);
    }
}
