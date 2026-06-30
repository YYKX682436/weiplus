package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9294d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f9295e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f9296f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f9297g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9298h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9299i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9300m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9301n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9302o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9303p;

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, cVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296173a);
        boolean z17 = false;
        this.f9298h = obtainStyledAttributes.getDrawable(0);
        this.f9299i = obtainStyledAttributes.getDrawable(2);
        this.f9303p = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.tencent.mm.R.id.nfc) {
            this.f9301n = true;
            this.f9300m = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f9301n ? !(this.f9298h != null || this.f9299i != null) : this.f9300m == null) {
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
        android.graphics.drawable.Drawable drawable = this.f9298h;
        if (drawable != null && drawable.isStateful()) {
            this.f9298h.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f9299i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9299i.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f9300m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f9300m.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return this.f9295e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f9298h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f9299i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f9300m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9296f = findViewById(com.tencent.mm.R.id.f482432ef);
        this.f9297g = findViewById(com.tencent.mm.R.id.f482459f3);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f9294d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.graphics.drawable.Drawable drawable;
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f9295e;
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
        if (this.f9301n) {
            android.graphics.drawable.Drawable drawable2 = this.f9300m;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z18 = z19;
        } else {
            if (this.f9298h != null) {
                if (this.f9296f.getVisibility() == 0) {
                    this.f9298h.setBounds(this.f9296f.getLeft(), this.f9296f.getTop(), this.f9296f.getRight(), this.f9296f.getBottom());
                } else {
                    android.view.View view2 = this.f9297g;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f9298h.setBounds(0, 0, 0, 0);
                    } else {
                        this.f9298h.setBounds(this.f9297g.getLeft(), this.f9297g.getTop(), this.f9297g.getRight(), this.f9297g.getBottom());
                    }
                }
                z19 = true;
            }
            this.f9302o = z27;
            if (z27 && (drawable = this.f9299i) != null) {
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
        if (this.f9296f == null && android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE && (i19 = this.f9303p) >= 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i19, android.view.View.MeasureSpec.getSize(i18)), Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        if (this.f9296f == null) {
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i18);
        android.view.View view = this.f9295e;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        android.view.View view2 = this.f9296f;
        boolean z17 = true;
        int i27 = 0;
        if (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) {
            android.view.View view3 = this.f9297g;
            if (view3 != null && view3.getVisibility() != 8 && view3.getMeasuredHeight() != 0) {
                z17 = false;
            }
            if (!z17) {
                i27 = a(this.f9297g);
            }
        } else {
            i27 = a(this.f9296f);
        }
        setMeasuredDimension(getMeasuredWidth(), java.lang.Math.min(i27 + a(this.f9295e), mode == Integer.MIN_VALUE ? android.view.View.MeasureSpec.getSize(i18) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f9298h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9298h);
        }
        this.f9298h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f9296f;
            if (view != null) {
                this.f9298h.setBounds(view.getLeft(), this.f9296f.getTop(), this.f9296f.getRight(), this.f9296f.getBottom());
            }
        }
        boolean z17 = true;
        if (!this.f9301n ? this.f9298h != null || this.f9299i != null : this.f9300m != null) {
            z17 = false;
        }
        setWillNotDraw(z17);
        invalidate();
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f9300m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9300m);
        }
        this.f9300m = drawable;
        boolean z17 = this.f9301n;
        boolean z18 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z17 && (drawable2 = this.f9300m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z17 ? !(this.f9298h != null || this.f9299i != null) : this.f9300m == null) {
            z18 = true;
        }
        setWillNotDraw(z18);
        invalidate();
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f9299i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9299i);
        }
        this.f9299i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9302o && (drawable2 = this.f9299i) != null) {
                drawable2.setBounds(this.f9295e.getLeft(), this.f9295e.getTop(), this.f9295e.getRight(), this.f9295e.getBottom());
            }
        }
        boolean z17 = true;
        if (!this.f9301n ? this.f9298h != null || this.f9299i != null : this.f9300m != null) {
            z17 = false;
        }
        setWillNotDraw(z17);
        invalidate();
    }

    public void setTabContainer(androidx.appcompat.widget.r1 r1Var) {
        android.view.View view = this.f9295e;
        if (view != null) {
            removeView(view);
        }
        this.f9295e = r1Var;
    }

    public void setTransitioning(boolean z17) {
        this.f9294d = z17;
        setDescendantFocusability(z17 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        boolean z17 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f9298h;
        if (drawable != null) {
            drawable.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f9299i;
        if (drawable2 != null) {
            drawable2.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f9300m;
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
        android.graphics.drawable.Drawable drawable2 = this.f9298h;
        boolean z17 = this.f9301n;
        return (drawable == drawable2 && !z17) || (drawable == this.f9299i && this.f9302o) || ((drawable == this.f9300m && z17) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i17) {
        if (i17 != 0) {
            return super.startActionModeForChild(view, callback, i17);
        }
        return null;
    }
}
