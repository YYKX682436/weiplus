package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.FragmentContainerView */
/* loaded from: classes14.dex */
public final class C1103x8ca9b236 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f92739d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f92740e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92741f;

    public C1103x8ca9b236(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.view.View view) {
        java.util.ArrayList arrayList = this.f92740e;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f92739d == null) {
            this.f92739d = new java.util.ArrayList();
        }
        this.f92739d.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7618xece89e8b(view) != null) {
            super.addView(view, i17, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7618xece89e8b(view) != null) {
            return super.addViewInLayout(view, i17, layoutParams, z17);
        }
        throw new java.lang.IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f92741f && this.f92739d != null) {
            for (int i17 = 0; i17 < this.f92739d.size(); i17++) {
                super.drawChild(canvas, (android.view.View) this.f92739d.get(i17), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        java.util.ArrayList arrayList;
        if (!this.f92741f || (arrayList = this.f92739d) == null || arrayList.size() <= 0 || !this.f92739d.contains(view)) {
            return super.drawChild(canvas, view, j17);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View view) {
        java.util.ArrayList arrayList = this.f92740e;
        if (arrayList != null) {
            arrayList.remove(view);
            java.util.ArrayList arrayList2 = this.f92739d;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f92741f = true;
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

    /* renamed from: setDrawDisappearingViewsLast */
    public void m7610x94241e5f(boolean z17) {
        this.f92741f = z17;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View view) {
        if (view.getParent() == this) {
            if (this.f92740e == null) {
                this.f92740e = new java.util.ArrayList();
            }
            this.f92740e.add(view);
        }
        super.startViewTransition(view);
    }

    public C1103x8ca9b236(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str;
        this.f92741f = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f514614b);
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

    public C1103x8ca9b236(android.content.Context context, android.util.AttributeSet attributeSet, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(context, attributeSet);
        this.f92741f = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f514614b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        java.lang.String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id6 = getId();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b = abstractC1104xc1ad431d.m7664x6f4c869b(id6);
        if (classAttribute != null && m7664x6f4c869b == null) {
            if (id6 <= 0) {
                throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a17 = abstractC1104xc1ad431d.m7673x6e9e7e64().a(context.getClassLoader(), classAttribute);
            a17.m7508xc3995328(context, attributeSet, (android.os.Bundle) null);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
            m7630xb2c12e75.f92892p = true;
            a17.f3420x62389694 = this;
            m7630xb2c12e75.h(getId(), a17, string, 1);
            m7630xb2c12e75.g();
        }
        abstractC1104xc1ad431d.m7699x680f8f87(this);
    }
}
