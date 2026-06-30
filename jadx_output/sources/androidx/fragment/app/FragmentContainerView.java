package androidx.fragment.app;

/* loaded from: classes14.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f11206d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f11207e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11208f;

    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.view.View view) {
        java.util.ArrayList arrayList = this.f11207e;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f11206d == null) {
            this.f11206d = new java.util.ArrayList();
        }
        this.f11206d.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (androidx.fragment.app.FragmentManager.getViewFragment(view) != null) {
            super.addView(view, i17, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        if (androidx.fragment.app.FragmentManager.getViewFragment(view) != null) {
            return super.addViewInLayout(view, i17, layoutParams, z17);
        }
        throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f11208f && this.f11206d != null) {
            for (int i17 = 0; i17 < this.f11206d.size(); i17++) {
                super.drawChild(canvas, (android.view.View) this.f11206d.get(i17), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        java.util.ArrayList arrayList;
        if (!this.f11208f || (arrayList = this.f11206d) == null || arrayList.size() <= 0 || !this.f11206d.contains(view)) {
            return super.drawChild(canvas, view, j17);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View view) {
        java.util.ArrayList arrayList = this.f11207e;
        if (arrayList != null) {
            arrayList.remove(view);
            java.util.ArrayList arrayList2 = this.f11206d;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f11208f = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            getChildAt(i17).dispatchApplyWindowInsets(new android.view.WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View view, boolean z17) {
        if (z17) {
            a(view);
        }
        super.removeDetachedView(view, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i17) {
        a(getChildAt(i17));
        super.removeViewAt(i17);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            a(getChildAt(i19));
        }
        super.removeViews(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            a(getChildAt(i19));
        }
        super.removeViewsInLayout(i17, i18);
    }

    public void setDrawDisappearingViewsLast(boolean z17) {
        this.f11208f = z17;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View view) {
        if (view.getParent() == this) {
            if (this.f11207e == null) {
                this.f11207e = new java.util.ArrayList();
            }
            this.f11207e.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str;
        this.f11208f = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f433081b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new java.lang.UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, androidx.fragment.app.FragmentManager fragmentManager) {
        super(context, attributeSet);
        this.f11208f = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f433081b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        java.lang.String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id6 = getId();
        androidx.fragment.app.Fragment findFragmentById = fragmentManager.findFragmentById(id6);
        if (classAttribute != null && findFragmentById == null) {
            if (id6 <= 0) {
                throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            androidx.fragment.app.Fragment a17 = fragmentManager.getFragmentFactory().a(context.getClassLoader(), classAttribute);
            a17.onInflate(context, attributeSet, (android.os.Bundle) null);
            androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.f11359p = true;
            a17.mContainer = this;
            beginTransaction.h(getId(), a17, string, 1);
            beginTransaction.g();
        }
        fragmentManager.onContainerAvailable(this);
    }
}
