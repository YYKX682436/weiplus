package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class CollapsingToolbarLayout extends android.widget.FrameLayout {
    public com.google.android.material.appbar.g A;
    public int B;
    public n3.g3 C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44303e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.Toolbar f44304f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f44305g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f44306h;

    /* renamed from: i, reason: collision with root package name */
    public int f44307i;

    /* renamed from: m, reason: collision with root package name */
    public int f44308m;

    /* renamed from: n, reason: collision with root package name */
    public int f44309n;

    /* renamed from: o, reason: collision with root package name */
    public int f44310o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f44311p;

    /* renamed from: q, reason: collision with root package name */
    public final fa.f f44312q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f44313r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f44314s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44315t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44316u;

    /* renamed from: v, reason: collision with root package name */
    public int f44317v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f44318w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ValueAnimator f44319x;

    /* renamed from: y, reason: collision with root package name */
    public long f44320y;

    /* renamed from: z, reason: collision with root package name */
    public int f44321z;

    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static com.google.android.material.appbar.l b(android.view.View view) {
        com.google.android.material.appbar.l lVar = (com.google.android.material.appbar.l) view.getTag(com.tencent.mm.R.id.p1n);
        if (lVar != null) {
            return lVar;
        }
        com.google.android.material.appbar.l lVar2 = new com.google.android.material.appbar.l(view);
        view.setTag(com.tencent.mm.R.id.p1n, lVar2);
        return lVar2;
    }

    public final void a() {
        if (this.f44302d) {
            androidx.appcompat.widget.Toolbar toolbar = null;
            this.f44304f = null;
            this.f44305g = null;
            int i17 = this.f44303e;
            if (i17 != -1) {
                androidx.appcompat.widget.Toolbar toolbar2 = (androidx.appcompat.widget.Toolbar) findViewById(i17);
                this.f44304f = toolbar2;
                if (toolbar2 != null) {
                    android.view.ViewParent parent = toolbar2.getParent();
                    android.view.View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof android.view.View) {
                            view = (android.view.View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f44305g = view;
                }
            }
            if (this.f44304f == null) {
                int childCount = getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 >= childCount) {
                        break;
                    }
                    android.view.View childAt = getChildAt(i18);
                    if (childAt instanceof androidx.appcompat.widget.Toolbar) {
                        toolbar = (androidx.appcompat.widget.Toolbar) childAt;
                        break;
                    }
                    i18++;
                }
                this.f44304f = toolbar;
            }
            c();
            this.f44302d = false;
        }
    }

    public final void c() {
        android.view.View view;
        if (!this.f44313r && (view = this.f44306h) != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f44306h);
            }
        }
        if (!this.f44313r || this.f44304f == null) {
            return;
        }
        if (this.f44306h == null) {
            this.f44306h = new android.view.View(getContext());
        }
        if (this.f44306h.getParent() == null) {
            this.f44304f.addView(this.f44306h, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams;
    }

    public final void d() {
        if (this.f44315t == null && this.f44316u == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f44304f == null && (drawable = this.f44315t) != null && this.f44317v > 0) {
            drawable.mutate().setAlpha(this.f44317v);
            this.f44315t.draw(canvas);
        }
        if (this.f44313r && this.f44314s) {
            this.f44312q.d(canvas);
        }
        if (this.f44316u == null || this.f44317v <= 0) {
            return;
        }
        n3.g3 g3Var = this.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        if (e17 > 0) {
            this.f44316u.setBounds(0, -this.B, getWidth(), e17 - this.B);
            this.f44316u.mutate().setAlpha(this.f44317v);
            this.f44316u.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f44315t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            int r3 = r4.f44317v
            if (r3 <= 0) goto L2d
            android.view.View r3 = r4.f44305g
            if (r3 == 0) goto L14
            if (r3 != r4) goto L11
            goto L14
        L11:
            if (r6 != r3) goto L1a
            goto L18
        L14:
            androidx.appcompat.widget.Toolbar r3 = r4.f44304f
            if (r6 != r3) goto L1a
        L18:
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f44317v
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f44315t
            r0.draw(r5)
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L38
            if (r0 == 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f44316u;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.f44315t;
        if (drawable2 != null && drawable2.isStateful()) {
            z17 |= drawable2.setState(drawableState);
        }
        fa.f fVar = this.f44312q;
        if (fVar != null) {
            z17 |= fVar.o(drawableState);
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.f44312q.f260603h;
    }

    public android.graphics.Typeface getCollapsedTitleTypeface() {
        android.graphics.Typeface typeface = this.f44312q.f260614s;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    public android.graphics.drawable.Drawable getContentScrim() {
        return this.f44315t;
    }

    public int getExpandedTitleGravity() {
        return this.f44312q.f260602g;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f44310o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f44309n;
    }

    public int getExpandedTitleMarginStart() {
        return this.f44307i;
    }

    public int getExpandedTitleMarginTop() {
        return this.f44308m;
    }

    public android.graphics.Typeface getExpandedTitleTypeface() {
        android.graphics.Typeface typeface = this.f44312q.f260615t;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    public int getScrimAlpha() {
        return this.f44317v;
    }

    public long getScrimAnimationDuration() {
        return this.f44320y;
    }

    public int getScrimVisibleHeightTrigger() {
        int i17 = this.f44321z;
        if (i17 >= 0) {
            return i17;
        }
        n3.g3 g3Var = this.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int d17 = n3.u0.d(this);
        return d17 > 0 ? java.lang.Math.min((d17 * 2) + e17, getHeight()) : getHeight() / 3;
    }

    public android.graphics.drawable.Drawable getStatusBarScrim() {
        return this.f44316u;
    }

    public java.lang.CharSequence getTitle() {
        if (this.f44313r) {
            return this.f44312q.f260617v;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.Object parent = getParent();
        if (parent instanceof com.google.android.material.appbar.AppBarLayout) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            setFitsSystemWindows(n3.u0.b((android.view.View) parent));
            if (this.A == null) {
                this.A = new com.google.android.material.appbar.j(this);
            }
            ((com.google.android.material.appbar.AppBarLayout) parent).a(this.A);
            n3.y0.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        java.util.List list;
        android.view.ViewParent parent = getParent();
        com.google.android.material.appbar.g gVar = this.A;
        if (gVar != null && (parent instanceof com.google.android.material.appbar.AppBarLayout) && (list = ((com.google.android.material.appbar.AppBarLayout) parent).f44284m) != null) {
            ((java.util.ArrayList) list).remove(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int height;
        int height2;
        android.view.View view;
        super.onLayout(z17, i17, i18, i19, i27);
        n3.g3 g3Var = this.C;
        if (g3Var != null) {
            int e17 = g3Var.e();
            int childCount = getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                android.view.View childAt = getChildAt(i28);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (!n3.u0.b(childAt) && childAt.getTop() < e17) {
                    childAt.offsetTopAndBottom(e17);
                }
            }
        }
        boolean z18 = this.f44313r;
        fa.f fVar = this.f44312q;
        if (z18 && (view = this.f44306h) != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            boolean z19 = n3.x0.b(view) && this.f44306h.getVisibility() == 0;
            this.f44314s = z19;
            if (z19) {
                boolean z27 = n3.v0.d(this) == 1;
                android.view.View view2 = this.f44305g;
                if (view2 == null) {
                    view2 = this.f44304f;
                }
                int height3 = ((getHeight() - b(view2).f44348b) - view2.getHeight()) - ((android.widget.FrameLayout.LayoutParams) ((com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) view2.getLayoutParams())).bottomMargin;
                android.view.View view3 = this.f44306h;
                android.graphics.Rect rect = this.f44311p;
                fa.g.a(this, view3, rect);
                int titleMarginEnd = rect.left + (z27 ? this.f44304f.getTitleMarginEnd() : this.f44304f.getTitleMarginStart());
                int titleMarginTop = rect.top + height3 + this.f44304f.getTitleMarginTop();
                int titleMarginStart = rect.right + (z27 ? this.f44304f.getTitleMarginStart() : this.f44304f.getTitleMarginEnd());
                int titleMarginBottom = (rect.bottom + height3) - this.f44304f.getTitleMarginBottom();
                android.graphics.Rect rect2 = fVar.f260600e;
                if (!(rect2.left == titleMarginEnd && rect2.top == titleMarginTop && rect2.right == titleMarginStart && rect2.bottom == titleMarginBottom)) {
                    rect2.set(titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom);
                    fVar.C = true;
                    fVar.g();
                }
                int i29 = z27 ? this.f44309n : this.f44307i;
                int i37 = rect.top + this.f44308m;
                int i38 = (i19 - i17) - (z27 ? this.f44307i : this.f44309n);
                int i39 = (i27 - i18) - this.f44310o;
                android.graphics.Rect rect3 = fVar.f260599d;
                if (!(rect3.left == i29 && rect3.top == i37 && rect3.right == i38 && rect3.bottom == i39)) {
                    rect3.set(i29, i37, i38, i39);
                    fVar.C = true;
                    fVar.g();
                }
                fVar.i();
            }
        }
        int childCount2 = getChildCount();
        for (int i47 = 0; i47 < childCount2; i47++) {
            com.google.android.material.appbar.l b17 = b(getChildAt(i47));
            android.view.View view4 = b17.f44347a;
            b17.f44348b = view4.getTop();
            b17.f44349c = view4.getLeft();
            b17.b();
        }
        if (this.f44304f != null) {
            if (this.f44313r && android.text.TextUtils.isEmpty(fVar.f260617v)) {
                setTitle(this.f44304f.getTitle());
            }
            android.view.View view5 = this.f44305g;
            if (view5 == null || view5 == this) {
                androidx.appcompat.widget.Toolbar toolbar = this.f44304f;
                android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    height = toolbar.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    height = toolbar.getHeight();
                }
                setMinimumHeight(height);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 = view5.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    height2 = view5.getHeight();
                }
                setMinimumHeight(height2);
            }
        }
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        a();
        super.onMeasure(i17, i18);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        n3.g3 g3Var = this.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        if (mode != 0 || e17 <= 0) {
            return;
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e17, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.drawable.Drawable drawable = this.f44315t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i17, i18);
        }
    }

    public void setCollapsedTitleGravity(int i17) {
        fa.f fVar = this.f44312q;
        if (fVar.f260603h != i17) {
            fVar.f260603h = i17;
            fVar.i();
        }
    }

    public void setCollapsedTitleTextAppearance(int i17) {
        this.f44312q.j(i17);
    }

    public void setCollapsedTitleTextColor(int i17) {
        setCollapsedTitleTextColor(android.content.res.ColorStateList.valueOf(i17));
    }

    public void setCollapsedTitleTypeface(android.graphics.Typeface typeface) {
        fa.f fVar = this.f44312q;
        if (fVar.f260614s != typeface) {
            fVar.f260614s = typeface;
            fVar.i();
        }
    }

    public void setContentScrim(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f44315t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f44315t = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.f44315t.setCallback(this);
                this.f44315t.setAlpha(this.f44317v);
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void setContentScrimColor(int i17) {
        setContentScrim(new android.graphics.drawable.ColorDrawable(i17));
    }

    public void setContentScrimResource(int i17) {
        setContentScrim(b3.l.getDrawable(getContext(), i17));
    }

    public void setExpandedTitleColor(int i17) {
        setExpandedTitleTextColor(android.content.res.ColorStateList.valueOf(i17));
    }

    public void setExpandedTitleGravity(int i17) {
        fa.f fVar = this.f44312q;
        if (fVar.f260602g != i17) {
            fVar.f260602g = i17;
            fVar.i();
        }
    }

    public void setExpandedTitleMarginBottom(int i17) {
        this.f44310o = i17;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i17) {
        this.f44309n = i17;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i17) {
        this.f44307i = i17;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i17) {
        this.f44308m = i17;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i17) {
        this.f44312q.l(i17);
    }

    public void setExpandedTitleTextColor(android.content.res.ColorStateList colorStateList) {
        fa.f fVar = this.f44312q;
        if (fVar.f260606k != colorStateList) {
            fVar.f260606k = colorStateList;
            fVar.i();
        }
    }

    public void setExpandedTitleTypeface(android.graphics.Typeface typeface) {
        fa.f fVar = this.f44312q;
        if (fVar.f260615t != typeface) {
            fVar.f260615t = typeface;
            fVar.i();
        }
    }

    public void setScrimAlpha(int i17) {
        androidx.appcompat.widget.Toolbar toolbar;
        if (i17 != this.f44317v) {
            if (this.f44315t != null && (toolbar = this.f44304f) != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.k(toolbar);
            }
            this.f44317v = i17;
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void setScrimAnimationDuration(long j17) {
        this.f44320y = j17;
    }

    public void setScrimVisibleHeightTrigger(int i17) {
        if (this.f44321z != i17) {
            this.f44321z = i17;
            d();
        }
    }

    public void setScrimsShown(boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z18 = n3.x0.c(this) && !isInEditMode();
        if (this.f44318w != z17) {
            if (z18) {
                int i17 = z17 ? 255 : 0;
                a();
                android.animation.ValueAnimator valueAnimator = this.f44319x;
                if (valueAnimator == null) {
                    android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
                    this.f44319x = valueAnimator2;
                    valueAnimator2.setDuration(this.f44320y);
                    this.f44319x.setInterpolator(i17 > this.f44317v ? w9.a.f444036c : w9.a.f444037d);
                    this.f44319x.addUpdateListener(new com.google.android.material.appbar.i(this));
                } else if (valueAnimator.isRunning()) {
                    this.f44319x.cancel();
                }
                this.f44319x.setIntValues(this.f44317v, i17);
                this.f44319x.start();
            } else {
                setScrimAlpha(z17 ? 255 : 0);
            }
            this.f44318w = z17;
        }
    }

    public void setStatusBarScrim(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f44316u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f44316u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f44316u.setState(getDrawableState());
                }
                android.graphics.drawable.Drawable drawable3 = this.f44316u;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                f3.c.b(drawable3, n3.v0.d(this));
                this.f44316u.setVisible(getVisibility() == 0, false);
                this.f44316u.setCallback(this);
                this.f44316u.setAlpha(this.f44317v);
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void setStatusBarScrimColor(int i17) {
        setStatusBarScrim(new android.graphics.drawable.ColorDrawable(i17));
    }

    public void setStatusBarScrimResource(int i17) {
        setStatusBarScrim(b3.l.getDrawable(getContext(), i17));
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        fa.f fVar = this.f44312q;
        if (charSequence == null || !charSequence.equals(fVar.f260617v)) {
            fVar.f260617v = charSequence;
            fVar.f260618w = null;
            android.graphics.Bitmap bitmap = fVar.f260620y;
            if (bitmap != null) {
                bitmap.recycle();
                fVar.f260620y = null;
            }
            fVar.i();
        }
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z17) {
        if (z17 != this.f44313r) {
            this.f44313r = z17;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        boolean z17 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f44316u;
        if (drawable != null && drawable.isVisible() != z17) {
            this.f44316u.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f44315t;
        if (drawable2 == null || drawable2.isVisible() == z17) {
            return;
        }
        this.f44315t.setVisible(z17, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44315t || drawable == this.f44316u;
    }

    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44302d = true;
        this.f44311p = new android.graphics.Rect();
        this.f44321z = -1;
        fa.f fVar = new fa.f(this);
        this.f44312q = fVar;
        fVar.G = w9.a.f444038e;
        fVar.i();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434118h, i17, com.tencent.mm.R.style.f494746v4, new int[0]);
        int i18 = d17.getInt(3, 8388691);
        if (fVar.f260602g != i18) {
            fVar.f260602g = i18;
            fVar.i();
        }
        int i19 = d17.getInt(0, 8388627);
        if (fVar.f260603h != i19) {
            fVar.f260603h = i19;
            fVar.i();
        }
        int dimensionPixelSize = d17.getDimensionPixelSize(4, 0);
        this.f44310o = dimensionPixelSize;
        this.f44309n = dimensionPixelSize;
        this.f44308m = dimensionPixelSize;
        this.f44307i = dimensionPixelSize;
        if (d17.hasValue(7)) {
            this.f44307i = d17.getDimensionPixelSize(7, 0);
        }
        if (d17.hasValue(6)) {
            this.f44309n = d17.getDimensionPixelSize(6, 0);
        }
        if (d17.hasValue(8)) {
            this.f44308m = d17.getDimensionPixelSize(8, 0);
        }
        if (d17.hasValue(5)) {
            this.f44310o = d17.getDimensionPixelSize(5, 0);
        }
        this.f44313r = d17.getBoolean(14, true);
        setTitle(d17.getText(13));
        fVar.l(com.tencent.mm.R.style.f494587qy);
        fVar.j(com.tencent.mm.R.style.f494579qq);
        if (d17.hasValue(9)) {
            fVar.l(d17.getResourceId(9, 0));
        }
        if (d17.hasValue(1)) {
            fVar.j(d17.getResourceId(1, 0));
        }
        this.f44321z = d17.getDimensionPixelSize(11, -1);
        this.f44320y = d17.getInt(10, 600);
        setContentScrim(d17.getDrawable(2));
        setStatusBarScrim(d17.getDrawable(12));
        this.f44303e = d17.getResourceId(15, -1);
        d17.recycle();
        setWillNotDraw(false);
        com.google.android.material.appbar.h hVar = new com.google.android.material.appbar.h(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(this, hVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f44312q.k(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(layoutParams);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f44322a;

        /* renamed from: b, reason: collision with root package name */
        public float f44323b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44322a = 0;
            this.f44323b = 0.5f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434119i);
            this.f44322a = obtainStyledAttributes.getInt(0, 0);
            this.f44323b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f44322a = 0;
            this.f44323b = 0.5f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44322a = 0;
            this.f44323b = 0.5f;
        }
    }
}
