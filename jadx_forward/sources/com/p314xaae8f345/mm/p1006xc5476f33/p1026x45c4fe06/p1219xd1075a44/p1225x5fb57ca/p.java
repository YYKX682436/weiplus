package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class p extends android.widget.AbsoluteLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma, bl1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja, pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f173120d;

    /* renamed from: e, reason: collision with root package name */
    public bl1.g f173121e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f173122f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f173123g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173124h;

    /* renamed from: i, reason: collision with root package name */
    public int f173125i;

    /* renamed from: m, reason: collision with root package name */
    public int f173126m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f173127n;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        super(v5Var.mo50352x76847179().getApplicationContext());
        this.f173120d = new java.util.LinkedList();
        super.setId(com.p314xaae8f345.mm.R.id.f564710yq);
        this.f173123g = v5Var;
        this.f173122f = this;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.translate(-getScrollX(), -getScrollY());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.we.b(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.we.a(canvas, this, 0.0f, 0.0f);
        } else {
            draw(canvas);
        }
        canvas.restore();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.widget.AbsoluteLayout absoluteLayout = this.f173122f;
        if (absoluteLayout != null) {
            r(false, view.getWidth(), view.getHeight());
            absoluteLayout.scrollTo(i17, i18);
        }
        java.util.Iterator it = this.f173120d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga gaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd) it.next());
            float f17 = i17;
            gaVar.f168177d = f17;
            gaVar.f168174a.setX(gaVar.f168175b + f17);
            gaVar.f168174a.setY(gaVar.f168176c + i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        ((java.util.LinkedList) this.f173120d).remove(rdVar);
    }

    @Override // bl1.c
    public boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        for (int i17 = 0; i17 <= getChildCount(); i17++) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.d(getChildAt(i17))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getDuplicateDispatch */
    public bl1.g m53514x3fc41ef() {
        if (this.f173121e == null) {
            this.f173121e = new bl1.g(this.f173122f);
        }
        return this.f173121e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8
    public void h(int i17) {
        setTranslationY(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
        if (r(z17, i19 - i17, i27 - i18)) {
            java.lang.Runnable runnable = this.f173127n;
            if (runnable == null) {
                this.f173127n = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.input.p$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p.this.requestLayout();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            post(this.f173127n);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        java.util.List list = this.f173120d;
        if (((java.util.LinkedList) list).contains(rdVar)) {
            return;
        }
        ((java.util.LinkedList) list).add(rdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar, android.view.View view, int i17, int i18, int i19, int i27) {
        if (fbVar == null || fbVar.mo14669x50cdf8a2() == null || view == 0) {
            return false;
        }
        o(fbVar);
        this.f173122f.addView(view, new android.widget.AbsoluteLayout.LayoutParams(i17, i18, i19, i27));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) view).b(this.f173123g);
        return true;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (this.f173124h) {
            view.forceLayout();
        }
        super.measureChild(view, i17, i18);
    }

    public final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        android.view.View mo14669x50cdf8a2 = fbVar.mo14669x50cdf8a2();
        android.widget.AbsoluteLayout absoluteLayout = this.f173122f;
        if (absoluteLayout.getWidth() == mo14669x50cdf8a2.getWidth() && absoluteLayout.getHeight() == mo14669x50cdf8a2.getHeight()) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
        layoutParams.width = mo14669x50cdf8a2.getWidth();
        layoutParams.height = mo14669x50cdf8a2.getHeight();
        absoluteLayout.setLayoutParams(layoutParams);
    }

    @Override // android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f173124h = (!isLayoutRequested() && i17 == this.f173125i && i18 == this.f173126m) ? false : true;
        this.f173125i = i17;
        this.f173126m = i18;
        super.onMeasure(i17, i18);
        this.f173124h = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(android.view.View view) {
        if (view == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(this).isActive();
        this.f173122f.removeView(view);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) view).h(this.f173123g);
    }

    public final boolean r(boolean z17, int i17, int i18) {
        android.widget.AbsoluteLayout absoluteLayout = this.f173122f;
        if (absoluteLayout == null) {
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
        if (layoutParams == null) {
            absoluteLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(i17, i18));
            return true;
        }
        if (i17 == layoutParams.width && i18 == layoutParams.height) {
            return z17;
        }
        layoutParams.width = i17;
        layoutParams.height = i18;
        absoluteLayout.setLayoutParams(layoutParams);
        return true;
    }

    public boolean s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar, android.view.View view, int i17, int i18, int i19, int i27) {
        android.widget.AbsoluteLayout absoluteLayout;
        boolean z17;
        if (fbVar != null && fbVar.mo14669x50cdf8a2() != null && view != null) {
            if (view != null && (absoluteLayout = this.f173122f) != null) {
                for (int i28 = 0; i28 < absoluteLayout.getChildCount(); i28++) {
                    if (view == absoluteLayout.getChildAt(i28)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                return false;
            }
            o(fbVar);
            if (view.getLayoutParams() != null && (view.getLayoutParams() instanceof android.widget.AbsoluteLayout.LayoutParams)) {
                if (view.getWidth() != i17 || view.getHeight() != i18 || view.getLeft() != i19 || view.getTop() != i27) {
                    android.widget.AbsoluteLayout.LayoutParams layoutParams = (android.widget.AbsoluteLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.x = i19;
                    layoutParams.y = i27;
                    layoutParams.width = i17;
                    layoutParams.height = i18;
                    view.setLayoutParams(layoutParams);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
