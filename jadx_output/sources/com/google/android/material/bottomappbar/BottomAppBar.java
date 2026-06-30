package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.a {
    public static final /* synthetic */ int B1 = 0;
    public final android.animation.AnimatorListenerAdapter A1;
    public final int W;

    /* renamed from: l1, reason: collision with root package name */
    public android.animation.Animator f44362l1;

    /* renamed from: p0, reason: collision with root package name */
    public final la.c f44363p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.animation.Animator f44364p1;

    /* renamed from: x0, reason: collision with root package name */
    public final com.google.android.material.bottomappbar.i f44365x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f44366x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.animation.Animator f44367y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f44368y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f44369z1;

    /* loaded from: classes15.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.SavedState> CREATOR = new com.google.android.material.bottomappbar.h();

        /* renamed from: f, reason: collision with root package name */
        public int f44371f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f44372g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44371f = parcel.readInt();
            this.f44372g = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeInt(this.f44371f);
            parcel.writeInt(this.f44372g ? 1 : 0);
        }
    }

    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478115b3);
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof androidx.appcompat.widget.ActionMenuView) {
                return (androidx.appcompat.widget.ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return t(this.f44366x1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationY() {
        return u(this.f44369z1);
    }

    public static void r(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, boolean z17) {
        bottomAppBar.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(bottomAppBar)) {
            android.animation.Animator animator = bottomAppBar.f44367y0;
            if (animator != null) {
                animator.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z18 = z17 && bottomAppBar.v();
            if (z18) {
                bottomAppBar.f44365x0.f44388e = bottomAppBar.getFabTranslationX();
            }
            float[] fArr = new float[2];
            fArr[0] = bottomAppBar.f44363p0.f317432o;
            fArr[1] = z18 ? 1.0f : 0.0f;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new com.google.android.material.bottomappbar.f(bottomAppBar));
            ofFloat.setDuration(300L);
            arrayList.add(ofFloat);
            com.google.android.material.floatingactionbutton.FloatingActionButton s17 = bottomAppBar.s();
            if (s17 != null) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(s17, "translationY", bottomAppBar.u(z17));
                ofFloat2.setDuration(300L);
                arrayList.add(ofFloat2);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(arrayList);
            bottomAppBar.f44367y0 = animatorSet;
            animatorSet.addListener(new com.google.android.material.bottomappbar.e(bottomAppBar));
            bottomAppBar.f44367y0.start();
        }
    }

    public android.content.res.ColorStateList getBackgroundTint() {
        return this.f44363p0.f317441x;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.bottomappbar.BottomAppBar> getBehavior() {
        return new com.google.android.material.bottomappbar.BottomAppBar.Behavior();
    }

    public float getCradleVerticalOffset() {
        return this.f44365x0.f44387d;
    }

    public int getFabAlignmentMode() {
        return this.f44366x1;
    }

    public float getFabCradleMargin() {
        return this.f44365x0.f44385b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.f44365x0.f44384a;
    }

    public boolean getHideOnScroll() {
        return this.f44368y1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.animation.Animator animator = this.f44367y0;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.f44364p1;
        if (animator2 != null) {
            animator2.cancel();
        }
        android.animation.Animator animator3 = this.f44362l1;
        if (animator3 != null) {
            animator3.cancel();
        }
        x();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.bottomappbar.BottomAppBar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.bottomappbar.BottomAppBar.SavedState savedState = (com.google.android.material.bottomappbar.BottomAppBar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        this.f44366x1 = savedState.f44371f;
        this.f44369z1 = savedState.f44372g;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.bottomappbar.BottomAppBar.SavedState savedState = new com.google.android.material.bottomappbar.BottomAppBar.SavedState(super.onSaveInstanceState());
        savedState.f44371f = this.f44366x1;
        savedState.f44372g = this.f44369z1;
        return savedState;
    }

    public final com.google.android.material.floatingactionbutton.FloatingActionButton s() {
        if (!(getParent() instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
            return null;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) getParent();
        java.util.List list = (java.util.List) coordinatorLayout.f10988e.f451479b.getOrDefault(this, null);
        java.util.ArrayList arrayList = (java.util.ArrayList) coordinatorLayout.f10990g;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view instanceof com.google.android.material.floatingactionbutton.FloatingActionButton) {
                return (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
            }
        }
        return null;
    }

    public void setBackgroundTint(android.content.res.ColorStateList colorStateList) {
        f3.b.h(this.f44363p0, colorStateList);
    }

    public void setCradleVerticalOffset(float f17) {
        if (f17 != getCradleVerticalOffset()) {
            this.f44365x0.f44387d = f17;
            this.f44363p0.invalidateSelf();
        }
    }

    public void setFabAlignmentMode(int i17) {
        if (this.f44366x1 != i17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(this)) {
                android.animation.Animator animator = this.f44362l1;
                if (animator != null) {
                    animator.cancel();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (this.f44369z1) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f44365x0.f44388e, t(i17));
                    ofFloat.addUpdateListener(new com.google.android.material.bottomappbar.b(this));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                }
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(s(), "translationX", t(i17));
                ofFloat2.setDuration(300L);
                arrayList.add(ofFloat2);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f44362l1 = animatorSet;
                animatorSet.addListener(new com.google.android.material.bottomappbar.a(this));
                this.f44362l1.start();
            }
        }
        w(i17, this.f44369z1);
        this.f44366x1 = i17;
    }

    public void setFabCradleMargin(float f17) {
        if (f17 != getFabCradleMargin()) {
            this.f44365x0.f44385b = f17;
            this.f44363p0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f17) {
        if (f17 != getFabCradleRoundedCornerRadius()) {
            this.f44365x0.f44384a = f17;
            this.f44363p0.invalidateSelf();
        }
    }

    public void setFabDiameter(int i17) {
        float f17 = i17;
        com.google.android.material.bottomappbar.i iVar = this.f44365x0;
        if (f17 != iVar.f44386c) {
            iVar.f44386c = f17;
            this.f44363p0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z17) {
        this.f44368y1 = z17;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    public final int t(int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(this) == 1;
        if (i17 == 1) {
            return ((getMeasuredWidth() / 2) - this.W) * (z17 ? -1 : 1);
        }
        return 0;
    }

    public final float u(boolean z17) {
        com.google.android.material.floatingactionbutton.FloatingActionButton s17 = s();
        if (s17 == null) {
            return 0.0f;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        s17.e(rect);
        float height = rect.height();
        if (height == 0.0f) {
            height = s17.getMeasuredHeight();
        }
        float height2 = s17.getHeight() - rect.bottom;
        float height3 = s17.getHeight() - rect.height();
        float f17 = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float paddingBottom = height3 - s17.getPaddingBottom();
        float f18 = -getMeasuredHeight();
        if (!z17) {
            f17 = paddingBottom;
        }
        return f18 + f17;
    }

    public final boolean v() {
        com.google.android.material.floatingactionbutton.FloatingActionButton s17 = s();
        return s17 != null && s17.h();
    }

    public final void w(int i17, boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(this)) {
            android.animation.Animator animator = this.f44364p1;
            if (animator != null) {
                animator.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!v()) {
                i17 = 0;
                z17 = false;
            }
            androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if ((this.f44369z1 || (z17 && v())) && (this.f44366x1 == 1 || i17 == 1)) {
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new com.google.android.material.bottomappbar.d(this, actionMenuView, i17, z17));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f44364p1 = animatorSet2;
            animatorSet2.addListener(new com.google.android.material.bottomappbar.c(this));
            this.f44364p1.start();
        }
    }

    public final void x() {
        this.f44365x0.f44388e = getFabTranslationX();
        com.google.android.material.floatingactionbutton.FloatingActionButton s17 = s();
        float f17 = (this.f44369z1 && v()) ? 1.0f : 0.0f;
        la.c cVar = this.f44363p0;
        cVar.f317432o = f17;
        cVar.invalidateSelf();
        if (s17 != null) {
            s17.setTranslationY(getFabTranslationY());
            s17.setTranslationX(getFabTranslationX());
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (v()) {
                y(actionMenuView, this.f44366x1, this.f44369z1);
            } else {
                y(actionMenuView, 0, false);
            }
        }
    }

    public final void y(androidx.appcompat.widget.ActionMenuView actionMenuView, int i17, boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z18 = n3.v0.d(this) == 1;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            android.view.View childAt = getChildAt(i19);
            if ((childAt.getLayoutParams() instanceof androidx.appcompat.widget.Toolbar.LayoutParams) && (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).f9070a & 8388615) == 8388611) {
                i18 = java.lang.Math.max(i18, z18 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i17 == 1 && z17) ? i18 - (z18 ? actionMenuView.getRight() : actionMenuView.getLeft()) : 0.0f);
    }

    /* loaded from: classes15.dex */
    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {

        /* renamed from: g, reason: collision with root package name */
        public final android.graphics.Rect f44370g;

        public Behavior() {
            this.f44370g = new android.graphics.Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void A(android.view.View view) {
            com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) view;
            super.A(bottomAppBar);
            int i17 = com.google.android.material.bottomappbar.BottomAppBar.B1;
            com.google.android.material.floatingactionbutton.FloatingActionButton s17 = bottomAppBar.s();
            if (s17 != null) {
                s17.clearAnimation();
                s17.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(w9.a.f444037d).setDuration(225L);
            }
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
            android.animation.Animator animator;
            android.animation.Animator animator2;
            com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) view;
            int i18 = com.google.android.material.bottomappbar.BottomAppBar.B1;
            com.google.android.material.floatingactionbutton.FloatingActionButton s17 = bottomAppBar.s();
            if (s17 != null) {
                ((androidx.coordinatorlayout.widget.c) s17.getLayoutParams()).f11009d = 17;
                android.animation.AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.A1;
                s17.k(animatorListenerAdapter);
                s17.l(animatorListenerAdapter);
                s17.c(animatorListenerAdapter);
                s17.d(animatorListenerAdapter);
                int measuredWidth = s17.getMeasuredWidth();
                int measuredHeight = s17.getMeasuredHeight();
                android.graphics.Rect rect = this.f44370g;
                rect.set(0, 0, measuredWidth, measuredHeight);
                s17.i(rect);
                bottomAppBar.setFabDiameter(rect.height());
            }
            android.animation.Animator animator3 = bottomAppBar.f44367y0;
            if (!((animator3 != null && animator3.isRunning()) || ((animator = bottomAppBar.f44364p1) != null && animator.isRunning()) || ((animator2 = bottomAppBar.f44362l1) != null && animator2.isRunning()))) {
                bottomAppBar.x();
            }
            coordinatorLayout.s(bottomAppBar, i17);
            this.f44352d = bottomAppBar.getMeasuredHeight();
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
            com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.u(coordinatorLayout, bottomAppBar, view2, view3, i17, i18);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void z(android.view.View view) {
            com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) view;
            super.z(bottomAppBar);
            int i17 = com.google.android.material.bottomappbar.BottomAppBar.B1;
            com.google.android.material.floatingactionbutton.FloatingActionButton s17 = bottomAppBar.s();
            if (s17 != null) {
                android.graphics.Rect rect = this.f44370g;
                s17.e(rect);
                float measuredHeight = s17.getMeasuredHeight() - rect.height();
                s17.clearAnimation();
                s17.animate().translationY((-s17.getPaddingBottom()) + measuredHeight).setInterpolator(w9.a.f444036c).setDuration(175L);
            }
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44370g = new android.graphics.Rect();
        }
    }

    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44369z1 = true;
        this.A1 = new com.google.android.material.bottomappbar.g(this);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434113c, i17, com.tencent.mm.R.style.v_, new int[0]);
        android.content.res.ColorStateList a17 = ia.a.a(context, d17, 0);
        float dimensionPixelOffset = d17.getDimensionPixelOffset(2, 0);
        float dimensionPixelOffset2 = d17.getDimensionPixelOffset(3, 0);
        float dimensionPixelOffset3 = d17.getDimensionPixelOffset(4, 0);
        this.f44366x1 = d17.getInt(1, 0);
        this.f44368y1 = d17.getBoolean(5, false);
        d17.recycle();
        this.W = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480573a66);
        com.google.android.material.bottomappbar.i iVar = new com.google.android.material.bottomappbar.i(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f44365x0 = iVar;
        la.h hVar = new la.h();
        hVar.f317458a = iVar;
        la.c cVar = new la.c(hVar);
        this.f44363p0 = cVar;
        cVar.f317431n = true;
        cVar.invalidateSelf();
        cVar.f317438u = android.graphics.Paint.Style.FILL;
        cVar.invalidateSelf();
        f3.b.h(cVar, a17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, cVar);
    }
}
