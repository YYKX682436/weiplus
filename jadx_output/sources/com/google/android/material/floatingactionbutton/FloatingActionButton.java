package com.google.android.material.floatingactionbutton;

@androidx.coordinatorlayout.widget.b(com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior.class)
/* loaded from: classes15.dex */
public class FloatingActionButton extends com.google.android.material.internal.VisibilityAwareImageButton implements da.a {

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f44491e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f44492f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f44493g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f44494h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f44495i;

    /* renamed from: m, reason: collision with root package name */
    public int f44496m;

    /* renamed from: n, reason: collision with root package name */
    public int f44497n;

    /* renamed from: o, reason: collision with root package name */
    public int f44498o;

    /* renamed from: p, reason: collision with root package name */
    public final int f44499p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f44500q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f44501r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f44502s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.appcompat.widget.j0 f44503t;

    /* renamed from: u, reason: collision with root package name */
    public final da.b f44504u;

    /* renamed from: v, reason: collision with root package name */
    public ea.l f44505v;

    /* loaded from: classes15.dex */
    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478275ff);
    }

    private ea.l getImpl() {
        if (this.f44505v == null) {
            this.f44505v = new ea.n(this, new ea.b(this));
        }
        return this.f44505v;
    }

    public static int m(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (mode == Integer.MIN_VALUE) {
            return java.lang.Math.min(i17, size);
        }
        if (mode == 0) {
            return i17;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public void c(android.animation.Animator.AnimatorListener animatorListener) {
        ea.l impl = getImpl();
        if (impl.f250497r == null) {
            impl.f250497r = new java.util.ArrayList();
        }
        impl.f250497r.add(animatorListener);
    }

    public void d(android.animation.Animator.AnimatorListener animatorListener) {
        ea.l impl = getImpl();
        if (impl.f250496q == null) {
            impl.f250496q = new java.util.ArrayList();
        }
        impl.f250496q.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public boolean e(android.graphics.Rect rect) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        i(rect);
        return true;
    }

    public final int f(int i17) {
        int i18 = this.f44497n;
        if (i18 != 0) {
            return i18;
        }
        android.content.res.Resources resources = getResources();
        return i17 != -1 ? i17 != 1 ? resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480282tf) : resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480281te) : java.lang.Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public void g(ea.a aVar, boolean z17) {
        ea.l impl = getImpl();
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = impl.f250498s;
        boolean z18 = false;
        if (visibilityAwareImageButton.getVisibility() != 0 ? impl.f250480a != 2 : impl.f250480a == 1) {
            return;
        }
        android.animation.Animator animator = impl.f250481b;
        if (animator != null) {
            animator.cancel();
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton2 = impl.f250498s;
        if (n3.x0.c(visibilityAwareImageButton2) && !visibilityAwareImageButton2.isInEditMode()) {
            z18 = true;
        }
        if (!z18) {
            visibilityAwareImageButton.a(z17 ? 8 : 4, z17);
            return;
        }
        w9.h hVar = impl.f250483d;
        if (hVar == null) {
            if (impl.f250485f == null) {
                impl.f250485f = w9.h.b(visibilityAwareImageButton.getContext(), com.tencent.mm.R.animator.f477958c);
            }
            hVar = impl.f250485f;
        }
        android.animation.AnimatorSet b17 = impl.b(hVar, 0.0f, 0.0f, 0.0f);
        b17.addListener(new ea.c(impl, z17, null));
        java.util.ArrayList arrayList = impl.f250497r;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b17.addListener((android.animation.Animator.AnimatorListener) it.next());
            }
        }
        b17.start();
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return this.f44491e;
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return this.f44492f;
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f250492m;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f250493n;
    }

    public android.graphics.drawable.Drawable getContentBackground() {
        return getImpl().f250490k;
    }

    public int getCustomSize() {
        return this.f44497n;
    }

    public int getExpandedComponentIdHint() {
        return this.f44504u.f227728c;
    }

    public w9.h getHideMotionSpec() {
        return getImpl().f250483d;
    }

    @java.lang.Deprecated
    public int getRippleColor() {
        android.content.res.ColorStateList colorStateList = this.f44495i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public android.content.res.ColorStateList getRippleColorStateList() {
        return this.f44495i;
    }

    public w9.h getShowMotionSpec() {
        return getImpl().f250482c;
    }

    public int getSize() {
        return this.f44496m;
    }

    public int getSizeDimension() {
        return f(this.f44496m);
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        return this.f44493g;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        return this.f44494h;
    }

    public boolean getUseCompatPadding() {
        return this.f44500q;
    }

    public boolean h() {
        ea.l impl = getImpl();
        if (impl.f250498s.getVisibility() != 0) {
            if (impl.f250480a != 2) {
                return false;
            }
        } else if (impl.f250480a == 1) {
            return false;
        }
        return true;
    }

    public final void i(android.graphics.Rect rect) {
        int i17 = rect.left;
        android.graphics.Rect rect2 = this.f44501r;
        rect.left = i17 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void j() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        android.content.res.ColorStateList colorStateList = this.f44493g;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        android.graphics.PorterDuff.Mode mode = this.f44494h;
        if (mode == null) {
            mode = android.graphics.PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.h0.j(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public void k(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList arrayList = getImpl().f250497r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void l(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList arrayList = getImpl().f250496q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void n(ea.a aVar, boolean z17) {
        ea.l impl = getImpl();
        if (impl.f250498s.getVisibility() == 0 ? impl.f250480a != 1 : impl.f250480a == 2) {
            return;
        }
        android.animation.Animator animator = impl.f250481b;
        if (animator != null) {
            animator.cancel();
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = impl.f250498s;
        boolean z18 = n3.x0.c(visibilityAwareImageButton) && !visibilityAwareImageButton.isInEditMode();
        android.graphics.Matrix matrix = impl.f250503x;
        if (!z18) {
            visibilityAwareImageButton.a(0, z17);
            visibilityAwareImageButton.setAlpha(1.0f);
            visibilityAwareImageButton.setScaleY(1.0f);
            visibilityAwareImageButton.setScaleX(1.0f);
            impl.f250495p = 1.0f;
            impl.a(1.0f, matrix);
            visibilityAwareImageButton.setImageMatrix(matrix);
            return;
        }
        if (visibilityAwareImageButton.getVisibility() != 0) {
            visibilityAwareImageButton.setAlpha(0.0f);
            visibilityAwareImageButton.setScaleY(0.0f);
            visibilityAwareImageButton.setScaleX(0.0f);
            impl.f250495p = 0.0f;
            impl.a(0.0f, matrix);
            visibilityAwareImageButton.setImageMatrix(matrix);
        }
        w9.h hVar = impl.f250482c;
        if (hVar == null) {
            if (impl.f250484e == null) {
                impl.f250484e = w9.h.b(visibilityAwareImageButton.getContext(), com.tencent.mm.R.animator.f477959d);
            }
            hVar = impl.f250484e;
        }
        android.animation.AnimatorSet b17 = impl.b(hVar, 1.0f, 1.0f, 1.0f);
        b17.addListener(new ea.d(impl, z17, null));
        java.util.ArrayList arrayList = impl.f250496q;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b17.addListener((android.animation.Animator.AnimatorListener) it.next());
            }
        }
        b17.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ea.l impl = getImpl();
        impl.getClass();
        if (!(impl instanceof ea.n)) {
            if (impl.f250504y == null) {
                impl.f250504y = new ea.e(impl);
            }
            impl.f250498s.getViewTreeObserver().addOnPreDrawListener(impl.f250504y);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ea.l impl = getImpl();
        if (impl.f250504y != null) {
            impl.f250498s.getViewTreeObserver().removeOnPreDrawListener(impl.f250504y);
            impl.f250504y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int sizeDimension = getSizeDimension();
        this.f44498o = (sizeDimension - this.f44499p) / 2;
        getImpl().o();
        int min = java.lang.Math.min(m(sizeDimension, i17), m(sizeDimension, i18));
        android.graphics.Rect rect = this.f44501r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.stateful.ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.stateful.ExtendableSavedState extendableSavedState = (com.google.android.material.stateful.ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f11112d);
        android.os.Bundle bundle = (android.os.Bundle) extendableSavedState.f44536f.getOrDefault("expandableWidgetHelper", null);
        da.b bVar = this.f44504u;
        bVar.getClass();
        bVar.f227727b = bundle.getBoolean("expanded", false);
        bVar.f227728c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f227727b) {
            android.view.View view = bVar.f227726a;
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                ((androidx.coordinatorlayout.widget.CoordinatorLayout) parent).g(view);
            }
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.stateful.ExtendableSavedState extendableSavedState = new com.google.android.material.stateful.ExtendableSavedState(super.onSaveInstanceState());
        x.n nVar = extendableSavedState.f44536f;
        da.b bVar = this.f44504u;
        bVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("expanded", bVar.f227727b);
        bundle.putInt("expandedComponentIdHint", bVar.f227728c);
        nVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            android.graphics.Rect rect = this.f44502s;
            if (e(rect) && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f44491e != colorStateList) {
            this.f44491e = colorStateList;
            ea.l impl = getImpl();
            android.graphics.drawable.Drawable drawable = impl.f250487h;
            if (drawable != null) {
                f3.b.h(drawable, colorStateList);
            }
            fa.d dVar = impl.f250489j;
            if (dVar != null) {
                if (colorStateList != null) {
                    dVar.f260590k = colorStateList.getColorForState(dVar.getState(), dVar.f260590k);
                }
                dVar.f260589j = colorStateList;
                dVar.f260591l = true;
                dVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f44492f != mode) {
            this.f44492f = mode;
            android.graphics.drawable.Drawable drawable = getImpl().f250487h;
            if (drawable != null) {
                f3.b.i(drawable, mode);
            }
        }
    }

    public void setCompatElevation(float f17) {
        ea.l impl = getImpl();
        if (impl.f250491l != f17) {
            impl.f250491l = f17;
            impl.k(f17, impl.f250492m, impl.f250493n);
        }
    }

    public void setCompatElevationResource(int i17) {
        setCompatElevation(getResources().getDimension(i17));
    }

    public void setCompatHoveredFocusedTranslationZ(float f17) {
        ea.l impl = getImpl();
        if (impl.f250492m != f17) {
            impl.f250492m = f17;
            impl.k(impl.f250491l, f17, impl.f250493n);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i17) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i17));
    }

    public void setCompatPressedTranslationZ(float f17) {
        ea.l impl = getImpl();
        if (impl.f250493n != f17) {
            impl.f250493n = f17;
            impl.k(impl.f250491l, impl.f250492m, f17);
        }
    }

    public void setCompatPressedTranslationZResource(int i17) {
        setCompatPressedTranslationZ(getResources().getDimension(i17));
    }

    public void setCustomSize(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Custom size must be non-negative");
        }
        this.f44497n = i17;
    }

    public void setExpandedComponentIdHint(int i17) {
        this.f44504u.f227728c = i17;
    }

    public void setHideMotionSpec(w9.h hVar) {
        getImpl().f250483d = hVar;
    }

    public void setHideMotionSpecResource(int i17) {
        setHideMotionSpec(w9.h.b(getContext(), i17));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        ea.l impl = getImpl();
        float f17 = impl.f250495p;
        impl.f250495p = f17;
        android.graphics.Matrix matrix = impl.f250503x;
        impl.a(f17, matrix);
        impl.f250498s.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        this.f44503t.c(i17);
    }

    public void setRippleColor(int i17) {
        setRippleColor(android.content.res.ColorStateList.valueOf(i17));
    }

    public void setShowMotionSpec(w9.h hVar) {
        getImpl().f250482c = hVar;
    }

    public void setShowMotionSpecResource(int i17) {
        setShowMotionSpec(w9.h.b(getContext(), i17));
    }

    public void setSize(int i17) {
        this.f44497n = 0;
        if (i17 != this.f44496m) {
            this.f44496m = i17;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f44493g != colorStateList) {
            this.f44493g = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f44494h != mode) {
            this.f44494h = mode;
            j();
        }
    }

    public void setUseCompatPadding(boolean z17) {
        if (this.f44500q != z17) {
            this.f44500q = z17;
            getImpl().i();
        }
    }

    /* loaded from: classes15.dex */
    public static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {

        /* renamed from: d, reason: collision with root package name */
        public android.graphics.Rect f44506d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44507e;

        public BaseBehavior() {
            this.f44507e = true;
        }

        public final boolean A(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (!y(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.n(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
            android.graphics.Rect rect2 = floatingActionButton.f44501r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void c(androidx.coordinatorlayout.widget.c cVar) {
            if (cVar.f11013h == 0) {
                cVar.f11013h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                z(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view2, floatingActionButton);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof androidx.coordinatorlayout.widget.c ? ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior : false) {
                    A(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
            java.util.ArrayList arrayList = (java.util.ArrayList) coordinatorLayout.k(floatingActionButton);
            int size = arrayList.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                android.view.View view2 = (android.view.View) arrayList.get(i19);
                if (!(view2 instanceof com.google.android.material.appbar.AppBarLayout)) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof androidx.coordinatorlayout.widget.c ? ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior : false) && A(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (z(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(floatingActionButton, i17);
            android.graphics.Rect rect = floatingActionButton.f44501r;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams();
            int i27 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin) {
                i18 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin) {
                i18 = -rect.top;
            }
            if (i18 != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                floatingActionButton.offsetTopAndBottom(i18);
            }
            if (i27 == 0) {
                return true;
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            floatingActionButton.offsetLeftAndRight(i27);
            return true;
        }

        public final boolean y(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            return this.f44507e && ((androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams()).f11011f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean z(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (!y(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f44506d == null) {
                this.f44506d = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f44506d;
            fa.g.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.n(null, false);
            return true;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434121k);
            this.f44507e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44501r = new android.graphics.Rect();
        this.f44502s = new android.graphics.Rect();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434120j, i17, com.tencent.mm.R.style.f494747v5, new int[0]);
        this.f44491e = ia.a.a(context, d17, 0);
        this.f44492f = fa.e0.a(d17.getInt(1, -1), null);
        this.f44495i = ia.a.a(context, d17, 10);
        this.f44496m = d17.getInt(5, -1);
        this.f44497n = d17.getDimensionPixelSize(4, 0);
        int dimensionPixelSize = d17.getDimensionPixelSize(2, 0);
        float dimension = d17.getDimension(3, 0.0f);
        float dimension2 = d17.getDimension(7, 0.0f);
        float dimension3 = d17.getDimension(9, 0.0f);
        this.f44500q = d17.getBoolean(12, false);
        int dimensionPixelSize2 = d17.getDimensionPixelSize(8, 0);
        this.f44499p = dimensionPixelSize2;
        w9.h a17 = w9.h.a(context, d17, 11);
        w9.h a18 = w9.h.a(context, d17, 6);
        d17.recycle();
        androidx.appcompat.widget.j0 j0Var = new androidx.appcompat.widget.j0(this);
        this.f44503t = j0Var;
        j0Var.b(attributeSet, i17);
        this.f44504u = new da.b(this);
        getImpl().m(this.f44491e, this.f44492f, this.f44495i, dimensionPixelSize);
        ea.l impl = getImpl();
        if (impl.f250491l != dimension) {
            impl.f250491l = dimension;
            impl.k(dimension, impl.f250492m, impl.f250493n);
        }
        ea.l impl2 = getImpl();
        if (impl2.f250492m != dimension2) {
            impl2.f250492m = dimension2;
            impl2.k(impl2.f250491l, dimension2, impl2.f250493n);
        }
        ea.l impl3 = getImpl();
        if (impl3.f250493n != dimension3) {
            impl3.f250493n = dimension3;
            impl3.k(impl3.f250491l, impl3.f250492m, dimension3);
        }
        ea.l impl4 = getImpl();
        if (impl4.f250494o != dimensionPixelSize2) {
            impl4.f250494o = dimensionPixelSize2;
            float f17 = impl4.f250495p;
            impl4.f250495p = f17;
            android.graphics.Matrix matrix = impl4.f250503x;
            impl4.a(f17, matrix);
            impl4.f250498s.setImageMatrix(matrix);
        }
        getImpl().f250482c = a17;
        getImpl().f250483d = a18;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.f44495i != colorStateList) {
            this.f44495i = colorStateList;
            getImpl().n(this.f44495i);
        }
    }
}
