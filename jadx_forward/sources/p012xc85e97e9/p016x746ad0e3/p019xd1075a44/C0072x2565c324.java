package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActionBarContainer */
/* loaded from: classes13.dex */
public class C0072x2565c324 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f90827d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f90828e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f90829f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f90830g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90831h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90832i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90833m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f90834n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f90835o;

    /* renamed from: p, reason: collision with root package name */
    public final int f90836p;

    public C0072x2565c324(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c cVar = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, cVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377706a);
        boolean z17 = false;
        this.f90831h = obtainStyledAttributes.getDrawable(0);
        this.f90832i = obtainStyledAttributes.getDrawable(2);
        this.f90836p = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.p314xaae8f345.mm.R.id.nfc) {
            this.f90834n = true;
            this.f90833m = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f90834n ? !(this.f90831h != null || this.f90832i != null) : this.f90833m == null) {
            z17 = true;
        }
        setWillNotDraw(z17);
    }

    public final int a(android.view.View view) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f90831h;
        if (drawable != null && drawable.isStateful()) {
            this.f90831h.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f90832i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f90832i.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f90833m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f90833m.setState(getDrawableState());
    }

    /* renamed from: getTabContainer */
    public android.view.View m2592x2b29f6e2() {
        return this.f90828e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f90831h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f90832i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f90833m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f90829f = findViewById(com.p314xaae8f345.mm.R.id.f563965ef);
        this.f90830g = findViewById(com.p314xaae8f345.mm.R.id.f563992f3);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f90827d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.graphics.drawable.Drawable drawable;
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f90828e;
        boolean z18 = true;
        boolean z19 = false;
        boolean z27 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i28 = layoutParams.bottomMargin;
            view.layout(i17, measuredHeight2 - i28, i19, measuredHeight - i28);
        }
        if (this.f90834n) {
            android.graphics.drawable.Drawable drawable2 = this.f90833m;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z18 = z19;
        } else {
            if (this.f90831h != null) {
                if (this.f90829f.getVisibility() == 0) {
                    this.f90831h.setBounds(this.f90829f.getLeft(), this.f90829f.getTop(), this.f90829f.getRight(), this.f90829f.getBottom());
                } else {
                    android.view.View view2 = this.f90830g;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f90831h.setBounds(0, 0, 0, 0);
                    } else {
                        this.f90831h.setBounds(this.f90830g.getLeft(), this.f90830g.getTop(), this.f90830g.getRight(), this.f90830g.getBottom());
                    }
                }
                z19 = true;
            }
            this.f90835o = z27;
            if (z27 && (drawable = this.f90832i) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z18 = z19;
        }
        if (z18) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (this.f90829f == null && android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE && (i19 = this.f90836p) >= 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i19, android.view.View.MeasureSpec.getSize(i18)), Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f90829f == null) {
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i18);
        android.view.View view = this.f90828e;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        android.view.View view2 = this.f90829f;
        boolean z17 = true;
        int i27 = 0;
        if (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) {
            android.view.View view3 = this.f90830g;
            if (view3 != null && view3.getVisibility() != 8 && view3.getMeasuredHeight() != 0) {
                z17 = false;
            }
            if (!z17) {
                i27 = a(this.f90830g);
            }
        } else {
            i27 = a(this.f90829f);
        }
        setMeasuredDimension(getMeasuredWidth(), java.lang.Math.min(i27 + a(this.f90828e), mode == Integer.MIN_VALUE ? android.view.View.MeasureSpec.getSize(i18) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: setPrimaryBackground */
    public void m2593x46c1b88e(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f90831h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f90831h);
        }
        this.f90831h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f90829f;
            if (view != null) {
                this.f90831h.setBounds(view.getLeft(), this.f90829f.getTop(), this.f90829f.getRight(), this.f90829f.getBottom());
            }
        }
        boolean z17 = true;
        if (!this.f90834n ? this.f90831h != null || this.f90832i != null : this.f90833m != null) {
            z17 = false;
        }
        setWillNotDraw(z17);
        invalidate();
    }

    /* renamed from: setSplitBackground */
    public void m2594xb0001f26(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f90833m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f90833m);
        }
        this.f90833m = drawable;
        boolean z17 = this.f90834n;
        boolean z18 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z17 && (drawable2 = this.f90833m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z17 ? !(this.f90831h != null || this.f90832i != null) : this.f90833m == null) {
            z18 = true;
        }
        setWillNotDraw(z18);
        invalidate();
    }

    /* renamed from: setStackedBackground */
    public void m2595x10b40d73(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f90832i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f90832i);
        }
        this.f90832i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f90835o && (drawable2 = this.f90832i) != null) {
                drawable2.setBounds(this.f90828e.getLeft(), this.f90828e.getTop(), this.f90828e.getRight(), this.f90828e.getBottom());
            }
        }
        boolean z17 = true;
        if (!this.f90834n ? this.f90831h != null || this.f90832i != null : this.f90833m != null) {
            z17 = false;
        }
        setWillNotDraw(z17);
        invalidate();
    }

    /* renamed from: setTabContainer */
    public void m2596x6172f1ee(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r1 r1Var) {
        android.view.View view = this.f90828e;
        if (view != null) {
            removeView(view);
        }
        this.f90828e = r1Var;
    }

    /* renamed from: setTransitioning */
    public void m2597x1acfd12b(boolean z17) {
        this.f90827d = z17;
        setDescendantFocusability(z17 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        boolean z17 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f90831h;
        if (drawable != null) {
            drawable.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f90832i;
        if (drawable2 != null) {
            drawable2.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f90833m;
        if (drawable3 != null) {
            drawable3.setVisible(z17, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f90831h;
        boolean z17 = this.f90834n;
        return (drawable == drawable2 && !z17) || (drawable == this.f90832i && this.f90835o) || ((drawable == this.f90833m && z17) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i17) {
        if (i17 != 0) {
            return super.startActionModeForChild(view, callback, i17);
        }
        return null;
    }
}
