package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout */
/* loaded from: classes15.dex */
public class C2679x5e425d5b extends android.widget.FrameLayout {
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g A;
    public int B;
    public n3.g3 C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125835d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125836e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b f125837f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f125838g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f125839h;

    /* renamed from: i, reason: collision with root package name */
    public int f125840i;

    /* renamed from: m, reason: collision with root package name */
    public int f125841m;

    /* renamed from: n, reason: collision with root package name */
    public int f125842n;

    /* renamed from: o, reason: collision with root package name */
    public int f125843o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f125844p;

    /* renamed from: q, reason: collision with root package name */
    public final fa.f f125845q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f125846r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f125847s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125848t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125849u;

    /* renamed from: v, reason: collision with root package name */
    public int f125850v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f125851w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ValueAnimator f125852x;

    /* renamed from: y, reason: collision with root package name */
    public long f125853y;

    /* renamed from: z, reason: collision with root package name */
    public int f125854z;

    public C2679x5e425d5b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l b(android.view.View view) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l lVar = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l) view.getTag(com.p314xaae8f345.mm.R.id.p1n);
        if (lVar != null) {
            return lVar;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l lVar2 = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l(view);
        view.setTag(com.p314xaae8f345.mm.R.id.p1n, lVar2);
        return lVar2;
    }

    public final void a() {
        if (this.f125835d) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = null;
            this.f125837f = null;
            this.f125838g = null;
            int i17 = this.f125836e;
            if (i17 != -1) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById(i17);
                this.f125837f = c0102x1f44235b2;
                if (c0102x1f44235b2 != null) {
                    android.view.ViewParent parent = c0102x1f44235b2.getParent();
                    android.view.View view = c0102x1f44235b2;
                    while (parent != this && parent != null) {
                        if (parent instanceof android.view.View) {
                            view = (android.view.View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f125838g = view;
                }
            }
            if (this.f125837f == null) {
                int childCount = getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 >= childCount) {
                        break;
                    }
                    android.view.View childAt = getChildAt(i18);
                    if (childAt instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) {
                        c0102x1f44235b = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) childAt;
                        break;
                    }
                    i18++;
                }
                this.f125837f = c0102x1f44235b;
            }
            c();
            this.f125835d = false;
        }
    }

    public final void c() {
        android.view.View view;
        if (!this.f125846r && (view = this.f125839h) != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f125839h);
            }
        }
        if (!this.f125846r || this.f125837f == null) {
            return;
        }
        if (this.f125839h == null) {
            this.f125839h = new android.view.View(getContext());
        }
        if (this.f125839h.getParent() == null) {
            this.f125837f.addView(this.f125839h, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams;
    }

    public final void d() {
        if (this.f125848t == null && this.f125849u == null) {
            return;
        }
        m20013xbc3abae2(getHeight() + this.B < m19990x146b166f());
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f125837f == null && (drawable = this.f125848t) != null && this.f125850v > 0) {
            drawable.mutate().setAlpha(this.f125850v);
            this.f125848t.draw(canvas);
        }
        if (this.f125846r && this.f125847s) {
            this.f125845q.d(canvas);
        }
        if (this.f125849u == null || this.f125850v <= 0) {
            return;
        }
        n3.g3 g3Var = this.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        if (e17 > 0) {
            this.f125849u.setBounds(0, -this.B, getWidth(), e17 - this.B);
            this.f125849u.mutate().setAlpha(this.f125850v);
            this.f125849u.draw(canvas);
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
            android.graphics.drawable.Drawable r0 = r4.f125848t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            int r3 = r4.f125850v
            if (r3 <= 0) goto L2d
            android.view.View r3 = r4.f125838g
            if (r3 == 0) goto L14
            if (r3 != r4) goto L11
            goto L14
        L11:
            if (r6 != r3) goto L1a
            goto L18
        L14:
            androidx.appcompat.widget.Toolbar r3 = r4.f125837f
            if (r6 != r3) goto L1a
        L18:
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f125850v
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f125848t
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f125849u;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.f125848t;
        if (drawable2 != null && drawable2.isStateful()) {
            z17 |= drawable2.setState(drawableState);
        }
        fa.f fVar = this.f125845q;
        if (fVar != null) {
            z17 |= fVar.o(drawableState);
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams(-1, -1);
    }

    /* renamed from: getCollapsedTitleGravity */
    public int m19979x36dec317() {
        return this.f125845q.f342136h;
    }

    /* renamed from: getCollapsedTitleTypeface */
    public android.graphics.Typeface m19980x765c00ee() {
        android.graphics.Typeface typeface = this.f125845q.f342147s;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    /* renamed from: getContentScrim */
    public android.graphics.drawable.Drawable m19981x91d69a43() {
        return this.f125848t;
    }

    /* renamed from: getExpandedTitleGravity */
    public int m19982x9cca84a5() {
        return this.f125845q.f342135g;
    }

    /* renamed from: getExpandedTitleMarginBottom */
    public int m19983x69a25d82() {
        return this.f125843o;
    }

    /* renamed from: getExpandedTitleMarginEnd */
    public int m19984x91905ce4() {
        return this.f125842n;
    }

    /* renamed from: getExpandedTitleMarginStart */
    public int m19985x6fb4ba2b() {
        return this.f125840i;
    }

    /* renamed from: getExpandedTitleMarginTop */
    public int m19986x9190955e() {
        return this.f125841m;
    }

    /* renamed from: getExpandedTitleTypeface */
    public android.graphics.Typeface m19987xcde87120() {
        android.graphics.Typeface typeface = this.f125845q.f342148t;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    /* renamed from: getScrimAlpha */
    public int m19988xb430bc2e() {
        return this.f125850v;
    }

    /* renamed from: getScrimAnimationDuration */
    public long m19989x74a55c08() {
        return this.f125853y;
    }

    /* renamed from: getScrimVisibleHeightTrigger */
    public int m19990x146b166f() {
        int i17 = this.f125854z;
        if (i17 >= 0) {
            return i17;
        }
        n3.g3 g3Var = this.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.u0.d(this);
        return d17 > 0 ? java.lang.Math.min((d17 * 2) + e17, getHeight()) : getHeight() / 3;
    }

    /* renamed from: getStatusBarScrim */
    public android.graphics.drawable.Drawable m19991xb56a5f7b() {
        return this.f125849u;
    }

    /* renamed from: getTitle */
    public java.lang.CharSequence m19992x7531c8a2() {
        if (this.f125846r) {
            return this.f125845q.f342150v;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.Object parent = getParent();
        if (parent instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            setFitsSystemWindows(n3.u0.b((android.view.View) parent));
            if (this.A == null) {
                this.A = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.j(this);
            }
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) parent).a(this.A);
            n3.y0.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        java.util.List list;
        android.view.ViewParent parent = getParent();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g gVar = this.A;
        if (gVar != null && (parent instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) && (list = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) parent).f125817m) != null) {
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
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (!n3.u0.b(childAt) && childAt.getTop() < e17) {
                    childAt.offsetTopAndBottom(e17);
                }
            }
        }
        boolean z18 = this.f125846r;
        fa.f fVar = this.f125845q;
        if (z18 && (view = this.f125839h) != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            boolean z19 = n3.x0.b(view) && this.f125839h.getVisibility() == 0;
            this.f125847s = z19;
            if (z19) {
                boolean z27 = n3.v0.d(this) == 1;
                android.view.View view2 = this.f125838g;
                if (view2 == null) {
                    view2 = this.f125837f;
                }
                int height3 = ((getHeight() - b(view2).f125881b) - view2.getHeight()) - ((android.widget.FrameLayout.LayoutParams) ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams) view2.getLayoutParams())).bottomMargin;
                android.view.View view3 = this.f125839h;
                android.graphics.Rect rect = this.f125844p;
                fa.g.a(this, view3, rect);
                int m2826x1f471cb = rect.left + (z27 ? this.f125837f.m2826x1f471cb() : this.f125837f.m2827x57673152());
                int m2828x1f4aa45 = rect.top + height3 + this.f125837f.m2828x1f4aa45();
                int m2827x57673152 = rect.right + (z27 ? this.f125837f.m2827x57673152() : this.f125837f.m2826x1f471cb());
                int m2825x783ecb3b = (rect.bottom + height3) - this.f125837f.m2825x783ecb3b();
                android.graphics.Rect rect2 = fVar.f342133e;
                if (!(rect2.left == m2826x1f471cb && rect2.top == m2828x1f4aa45 && rect2.right == m2827x57673152 && rect2.bottom == m2825x783ecb3b)) {
                    rect2.set(m2826x1f471cb, m2828x1f4aa45, m2827x57673152, m2825x783ecb3b);
                    fVar.C = true;
                    fVar.g();
                }
                int i29 = z27 ? this.f125842n : this.f125840i;
                int i37 = rect.top + this.f125841m;
                int i38 = (i19 - i17) - (z27 ? this.f125840i : this.f125842n);
                int i39 = (i27 - i18) - this.f125843o;
                android.graphics.Rect rect3 = fVar.f342132d;
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
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l b17 = b(getChildAt(i47));
            android.view.View view4 = b17.f125880a;
            b17.f125881b = view4.getTop();
            b17.f125882c = view4.getLeft();
            b17.b();
        }
        if (this.f125837f != null) {
            if (this.f125846r && android.text.TextUtils.isEmpty(fVar.f342150v)) {
                m20017x53bfe316(this.f125837f.m2824x7531c8a2());
            }
            android.view.View view5 = this.f125838g;
            if (view5 == null || view5 == this) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f125837f;
                android.view.ViewGroup.LayoutParams layoutParams = c0102x1f44235b.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    height = c0102x1f44235b.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    height = c0102x1f44235b.getHeight();
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
        android.graphics.drawable.Drawable drawable = this.f125848t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i17, i18);
        }
    }

    /* renamed from: setCollapsedTitleGravity */
    public void m19993x6f1758b(int i17) {
        fa.f fVar = this.f125845q;
        if (fVar.f342136h != i17) {
            fVar.f342136h = i17;
            fVar.i();
        }
    }

    /* renamed from: setCollapsedTitleTextAppearance */
    public void m19994x12d65794(int i17) {
        this.f125845q.j(i17);
    }

    /* renamed from: setCollapsedTitleTextColor */
    public void m19995xca05633(int i17) {
        m19996xca05633(android.content.res.ColorStateList.valueOf(i17));
    }

    /* renamed from: setCollapsedTitleTypeface */
    public void m19997xa89f9cfa(android.graphics.Typeface typeface) {
        fa.f fVar = this.f125845q;
        if (fVar.f342147s != typeface) {
            fVar.f342147s = typeface;
            fVar.i();
        }
    }

    /* renamed from: setContentScrim */
    public void m19998xc81f954f(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f125848t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f125848t = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.f125848t.setCallback(this);
                this.f125848t.setAlpha(this.f125850v);
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* renamed from: setContentScrimColor */
    public void m19999x4008a354(int i17) {
        m19998xc81f954f(new android.graphics.drawable.ColorDrawable(i17));
    }

    /* renamed from: setContentScrimResource */
    public void m20000xbe5efe7d(int i17) {
        m19998xc81f954f(b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setExpandedTitleColor */
    public void m20001x3a236d86(int i17) {
        m20008xc2b5a2d9(android.content.res.ColorStateList.valueOf(i17));
    }

    /* renamed from: setExpandedTitleGravity */
    public void m20002x171db3b1(int i17) {
        fa.f fVar = this.f125845q;
        if (fVar.f342135g != i17) {
            fVar.f342135g = i17;
            fVar.i();
        }
    }

    /* renamed from: setExpandedTitleMarginBottom */
    public void m20003xb36eb5f6(int i17) {
        this.f125843o = i17;
        requestLayout();
    }

    /* renamed from: setExpandedTitleMarginEnd */
    public void m20004xc3d3f8f0(int i17) {
        this.f125842n = i17;
        requestLayout();
    }

    /* renamed from: setExpandedTitleMarginStart */
    public void m20005x1f818337(int i17) {
        this.f125840i = i17;
        requestLayout();
    }

    /* renamed from: setExpandedTitleMarginTop */
    public void m20006xc3d4316a(int i17) {
        this.f125841m = i17;
        requestLayout();
    }

    /* renamed from: setExpandedTitleTextAppearance */
    public void m20007xad7502ae(int i17) {
        this.f125845q.l(i17);
    }

    /* renamed from: setExpandedTitleTextColor */
    public void m20008xc2b5a2d9(android.content.res.ColorStateList colorStateList) {
        fa.f fVar = this.f125845q;
        if (fVar.f342139k != colorStateList) {
            fVar.f342139k = colorStateList;
            fVar.i();
        }
    }

    /* renamed from: setExpandedTitleTypeface */
    public void m20009x9dfb2394(android.graphics.Typeface typeface) {
        fa.f fVar = this.f125845q;
        if (fVar.f342148t != typeface) {
            fVar.f342148t = typeface;
            fVar.i();
        }
    }

    /* renamed from: setScrimAlpha */
    public void m20010xe2550a3a(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b;
        if (i17 != this.f125850v) {
            if (this.f125848t != null && (c0102x1f44235b = this.f125837f) != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.k(c0102x1f44235b);
            }
            this.f125850v = i17;
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* renamed from: setScrimAnimationDuration */
    public void m20011xa6e8f814(long j17) {
        this.f125853y = j17;
    }

    /* renamed from: setScrimVisibleHeightTrigger */
    public void m20012x5e376ee3(int i17) {
        if (this.f125854z != i17) {
            this.f125854z = i17;
            d();
        }
    }

    /* renamed from: setScrimsShown */
    public void m20013xbc3abae2(boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z18 = n3.x0.c(this) && !isInEditMode();
        if (this.f125851w != z17) {
            if (z18) {
                int i17 = z17 ? 255 : 0;
                a();
                android.animation.ValueAnimator valueAnimator = this.f125852x;
                if (valueAnimator == null) {
                    android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
                    this.f125852x = valueAnimator2;
                    valueAnimator2.setDuration(this.f125853y);
                    this.f125852x.setInterpolator(i17 > this.f125850v ? w9.a.f525569c : w9.a.f525570d);
                    this.f125852x.addUpdateListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.i(this));
                } else if (valueAnimator.isRunning()) {
                    this.f125852x.cancel();
                }
                this.f125852x.setIntValues(this.f125850v, i17);
                this.f125852x.start();
            } else {
                m20010xe2550a3a(z17 ? 255 : 0);
            }
            this.f125851w = z17;
        }
    }

    /* renamed from: setStatusBarScrim */
    public void m20014x7d60c787(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f125849u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f125849u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f125849u.setState(getDrawableState());
                }
                android.graphics.drawable.Drawable drawable3 = this.f125849u;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                f3.c.b(drawable3, n3.v0.d(this));
                this.f125849u.setVisible(getVisibility() == 0, false);
                this.f125849u.setCallback(this);
                this.f125849u.setAlpha(this.f125850v);
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* renamed from: setStatusBarScrimColor */
    public void m20015x5d46141c(int i17) {
        m20014x7d60c787(new android.graphics.drawable.ColorDrawable(i17));
    }

    /* renamed from: setStatusBarScrimResource */
    public void m20016x6f4678b5(int i17) {
        m20014x7d60c787(b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setTitle */
    public void m20017x53bfe316(java.lang.CharSequence charSequence) {
        fa.f fVar = this.f125845q;
        if (charSequence == null || !charSequence.equals(fVar.f342150v)) {
            fVar.f342150v = charSequence;
            fVar.f342151w = null;
            android.graphics.Bitmap bitmap = fVar.f342153y;
            if (bitmap != null) {
                bitmap.recycle();
                fVar.f342153y = null;
            }
            fVar.i();
        }
        setContentDescription(m19992x7531c8a2());
    }

    /* renamed from: setTitleEnabled */
    public void m20018x62ccbb4b(boolean z17) {
        if (z17 != this.f125846r) {
            this.f125846r = z17;
            setContentDescription(m19992x7531c8a2());
            c();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        boolean z17 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f125849u;
        if (drawable != null && drawable.isVisible() != z17) {
            this.f125849u.setVisible(z17, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f125848t;
        if (drawable2 == null || drawable2.isVisible() == z17) {
            return;
        }
        this.f125848t.setVisible(z17, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f125848t || drawable == this.f125849u;
    }

    public C2679x5e425d5b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f125835d = true;
        this.f125844p = new android.graphics.Rect();
        this.f125854z = -1;
        fa.f fVar = new fa.f(this);
        this.f125845q = fVar;
        fVar.G = w9.a.f525571e;
        fVar.i();
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515651h, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576279v4, new int[0]);
        int i18 = d17.getInt(3, 8388691);
        if (fVar.f342135g != i18) {
            fVar.f342135g = i18;
            fVar.i();
        }
        int i19 = d17.getInt(0, 8388627);
        if (fVar.f342136h != i19) {
            fVar.f342136h = i19;
            fVar.i();
        }
        int dimensionPixelSize = d17.getDimensionPixelSize(4, 0);
        this.f125843o = dimensionPixelSize;
        this.f125842n = dimensionPixelSize;
        this.f125841m = dimensionPixelSize;
        this.f125840i = dimensionPixelSize;
        if (d17.hasValue(7)) {
            this.f125840i = d17.getDimensionPixelSize(7, 0);
        }
        if (d17.hasValue(6)) {
            this.f125842n = d17.getDimensionPixelSize(6, 0);
        }
        if (d17.hasValue(8)) {
            this.f125841m = d17.getDimensionPixelSize(8, 0);
        }
        if (d17.hasValue(5)) {
            this.f125843o = d17.getDimensionPixelSize(5, 0);
        }
        this.f125846r = d17.getBoolean(14, true);
        m20017x53bfe316(d17.getText(13));
        fVar.l(com.p314xaae8f345.mm.R.C30868x68b1db1.f576120qy);
        fVar.j(com.p314xaae8f345.mm.R.C30868x68b1db1.f576112qq);
        if (d17.hasValue(9)) {
            fVar.l(d17.getResourceId(9, 0));
        }
        if (d17.hasValue(1)) {
            fVar.j(d17.getResourceId(1, 0));
        }
        this.f125854z = d17.getDimensionPixelSize(11, -1);
        this.f125853y = d17.getInt(10, 600);
        m19998xc81f954f(d17.getDrawable(2));
        m20014x7d60c787(d17.getDrawable(12));
        this.f125836e = d17.getResourceId(15, -1);
        d17.recycle();
        setWillNotDraw(false);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.h hVar = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.h(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(this, hVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: setCollapsedTitleTextColor */
    public void m19996xca05633(android.content.res.ColorStateList colorStateList) {
        this.f125845q.k(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams(layoutParams);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f125855a;

        /* renamed from: b, reason: collision with root package name */
        public float f125856b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125855a = 0;
            this.f125856b = 0.5f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515652i);
            this.f125855a = obtainStyledAttributes.getInt(0, 0);
            this.f125856b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f125855a = 0;
            this.f125856b = 0.5f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f125855a = 0;
            this.f125856b = 0.5f;
        }
    }
}
