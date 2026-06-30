package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class p extends android.widget.AbsoluteLayout implements com.tencent.mm.plugin.appbrand.page.ma, bl1.d, com.tencent.mm.plugin.appbrand.page.sd, com.tencent.mm.plugin.appbrand.page.r8, com.tencent.mm.plugin.appbrand.page.ja, pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f91587d;

    /* renamed from: e, reason: collision with root package name */
    public bl1.g f91588e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f91589f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f91590g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91591h;

    /* renamed from: i, reason: collision with root package name */
    public int f91592i;

    /* renamed from: m, reason: collision with root package name */
    public int f91593m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f91594n;

    public p(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(v5Var.getContext().getApplicationContext());
        this.f91587d = new java.util.LinkedList();
        super.setId(com.tencent.mm.R.id.f483177yq);
        this.f91590g = v5Var;
        this.f91589f = this;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.translate(-getScrollX(), -getScrollY());
        if (com.tencent.mm.plugin.appbrand.page.we.b(this)) {
            com.tencent.mm.plugin.appbrand.page.we.a(canvas, this, 0.0f, 0.0f);
        } else {
            draw(canvas);
        }
        canvas.restore();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.widget.AbsoluteLayout absoluteLayout = this.f91589f;
        if (absoluteLayout != null) {
            r(false, view.getWidth(), view.getHeight());
            absoluteLayout.scrollTo(i17, i18);
        }
        java.util.Iterator it = this.f91587d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.ga gaVar = (com.tencent.mm.plugin.appbrand.page.ga) ((com.tencent.mm.plugin.appbrand.page.rd) it.next());
            float f17 = i17;
            gaVar.f86644d = f17;
            gaVar.f86641a.setX(gaVar.f86642b + f17);
            gaVar.f86641a.setY(gaVar.f86643c + i18);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.sd
    public void e(com.tencent.mm.plugin.appbrand.page.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        ((java.util.LinkedList) this.f91587d).remove(rdVar);
    }

    @Override // bl1.c
    public boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        for (int i17 = 0; i17 <= getChildCount(); i17++) {
            if (com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.d(getChildAt(i17))) {
                return true;
            }
        }
        return false;
    }

    public bl1.g getDuplicateDispatch() {
        if (this.f91588e == null) {
            this.f91588e = new bl1.g(this.f91589f);
        }
        return this.f91588e;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r8
    public void h(int i17) {
        setTranslationY(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
        if (r(z17, i19 - i17, i27 - i18)) {
            java.lang.Runnable runnable = this.f91594n;
            if (runnable == null) {
                this.f91594n = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.input.p$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.widget.input.p.this.requestLayout();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            post(this.f91594n);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.sd
    public void k(com.tencent.mm.plugin.appbrand.page.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        java.util.List list = this.f91587d;
        if (((java.util.LinkedList) list).contains(rdVar)) {
            return;
        }
        ((java.util.LinkedList) list).add(rdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m(com.tencent.mm.plugin.appbrand.page.fb fbVar, android.view.View view, int i17, int i18, int i19, int i27) {
        if (fbVar == null || fbVar.getWrapperView() == null || view == 0) {
            return false;
        }
        o(fbVar);
        this.f91589f.addView(view, new android.widget.AbsoluteLayout.LayoutParams(i17, i18, i19, i27));
        ((com.tencent.mm.plugin.appbrand.widget.input.t4) view).b(this.f91590g);
        return true;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (this.f91591h) {
            view.forceLayout();
        }
        super.measureChild(view, i17, i18);
    }

    public final void o(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        android.view.View wrapperView = fbVar.getWrapperView();
        android.widget.AbsoluteLayout absoluteLayout = this.f91589f;
        if (absoluteLayout.getWidth() == wrapperView.getWidth() && absoluteLayout.getHeight() == wrapperView.getHeight()) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
        layoutParams.width = wrapperView.getWidth();
        layoutParams.height = wrapperView.getHeight();
        absoluteLayout.setLayoutParams(layoutParams);
    }

    @Override // android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f91591h = (!isLayoutRequested() && i17 == this.f91592i && i18 == this.f91593m) ? false : true;
        this.f91592i = i17;
        this.f91593m = i18;
        super.onMeasure(i17, i18);
        this.f91591h = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(android.view.View view) {
        if (view == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.widget.input.m5.b(this).isActive();
        this.f91589f.removeView(view);
        ((com.tencent.mm.plugin.appbrand.widget.input.t4) view).h(this.f91590g);
    }

    public final boolean r(boolean z17, int i17, int i18) {
        android.widget.AbsoluteLayout absoluteLayout = this.f91589f;
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

    public boolean s(com.tencent.mm.plugin.appbrand.page.fb fbVar, android.view.View view, int i17, int i18, int i19, int i27) {
        android.widget.AbsoluteLayout absoluteLayout;
        boolean z17;
        if (fbVar != null && fbVar.getWrapperView() != null && view != null) {
            if (view != null && (absoluteLayout = this.f91589f) != null) {
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
