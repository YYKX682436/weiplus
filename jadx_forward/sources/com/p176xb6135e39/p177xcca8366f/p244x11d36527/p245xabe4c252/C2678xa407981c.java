package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

@p012xc85e97e9.p073xee01125a.p074xd1075a44.b(m7206x6ac9171 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior.class)
/* renamed from: com.google.android.material.appbar.AppBarLayout */
/* loaded from: classes15.dex */
public class C2678xa407981c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f125811d;

    /* renamed from: e, reason: collision with root package name */
    public int f125812e;

    /* renamed from: f, reason: collision with root package name */
    public int f125813f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125814g;

    /* renamed from: h, reason: collision with root package name */
    public int f125815h;

    /* renamed from: i, reason: collision with root package name */
    public n3.g3 f125816i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f125817m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f125818n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f125819o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f125820p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f125821q;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior */
    /* loaded from: classes15.dex */
    public static class Behavior extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior */
    /* loaded from: classes15.dex */
    public static class ScrollingViewBehavior extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2681x6a4369ff {
        public ScrollingViewBehavior() {
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2681x6a4369ff
        public android.view.View C(java.util.List list) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.view.View view = (android.view.View) list.get(i17);
                if (view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                    return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
                }
            }
            return null;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2681x6a4369ff
        public float D(android.view.View view) {
            int i17;
            if (view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
                int m19973xa8f0dc02 = c2678xa407981c.m19973xa8f0dc02();
                int m19967x1adc91dc = c2678xa407981c.m19967x1adc91dc();
                p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c2678xa407981c.getLayoutParams()).f92539a;
                int z17 = behavior instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior ? ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior) behavior).z() : 0;
                if ((m19967x1adc91dc == 0 || m19973xa8f0dc02 + z17 > m19967x1adc91dc) && (i17 = m19973xa8f0dc02 - m19967x1adc91dc) != 0) {
                    return (z17 / i17) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2681x6a4369ff
        public int E(android.view.View view) {
            return view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c ? ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view).m19973xa8f0dc02() : view.getMeasuredHeight();
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
            return view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean d(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
            int b17;
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view2.getLayoutParams()).f92539a;
            if (behavior instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior) behavior).f125822p + this.f125866h;
                if (this.f125867i == 0) {
                    b17 = 0;
                } else {
                    float D = D(view2);
                    int i17 = this.f125867i;
                    b17 = h3.a.b((int) (D * i17), 0, i17);
                }
                int i18 = bottom - b17;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                view.offsetTopAndBottom(i18);
            }
            if (view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view2;
                if (c2678xa407981c.f125820p) {
                    boolean z17 = view.getScrollY() > 0;
                    if (c2678xa407981c.f125819o != z17) {
                        c2678xa407981c.f125819o = z17;
                        c2678xa407981c.refreshDrawableState();
                    }
                }
            }
            return false;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean q(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.graphics.Rect rect, boolean z17) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c;
            java.util.ArrayList arrayList = (java.util.ArrayList) c1081xa22a3e5a.k(view);
            int size = arrayList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    c2678xa407981c = null;
                    break;
                }
                android.view.View view2 = (android.view.View) arrayList.get(i17);
                if (view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) {
                    c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view2;
                    break;
                }
                i17++;
            }
            if (c2678xa407981c != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = c1081xa22a3e5a.getWidth();
                int height = c1081xa22a3e5a.getHeight();
                android.graphics.Rect rect2 = this.f125864f;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    c2678xa407981c.d(false, !z17, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515661r);
            this.f125867i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    public C2678xa407981c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125811d = -1;
        this.f125812e = -1;
        this.f125813f = -1;
        this.f125815h = 0;
        setOrientation(1);
        int i17 = android.os.Build.VERSION.SDK_INT;
        setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray d17 = fa.d0.d(context2, attributeSet, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.m.f125884a, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576276v1, new int[0]);
        try {
            if (d17.hasValue(0)) {
                setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context2, d17.getResourceId(0, 0)));
            }
            d17.recycle();
            android.content.res.TypedArray d18 = fa.d0.d(context, attributeSet, v9.a.f515644a, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576276v1, new int[0]);
            android.graphics.drawable.Drawable drawable = d18.getDrawable(0);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.q(this, drawable);
            if (d18.hasValue(4)) {
                d(d18.getBoolean(4, false), false, false);
            }
            if (d18.hasValue(3)) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.m.a(this, d18.getDimensionPixelSize(3, 0));
            }
            if (i17 >= 26) {
                if (d18.hasValue(2)) {
                    setKeyboardNavigationCluster(d18.getBoolean(2, false));
                }
                if (d18.hasValue(1)) {
                    setTouchscreenBlocksFocus(d18.getBoolean(1, false));
                }
            }
            this.f125820p = d18.getBoolean(5, false);
            d18.recycle();
            n3.a1.u(this, new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.a(this));
        } catch (java.lang.Throwable th6) {
            d17.recycle();
            throw th6;
        }
    }

    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e eVar) {
        if (this.f125817m == null) {
            this.f125817m = new java.util.ArrayList();
        }
        if (eVar == null || this.f125817m.contains(eVar)) {
            return;
        }
        this.f125817m.add(eVar);
    }

    public void b(int i17) {
        java.util.List list = this.f125817m;
        if (list != null) {
            int size = ((java.util.ArrayList) list).size();
            for (int i18 = 0; i18 < size; i18++) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e eVar = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e) ((java.util.ArrayList) this.f125817m).get(i18);
                if (eVar != null) {
                    eVar.a(this, i17);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.widget.LinearLayout.LayoutParams ? new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams;
    }

    public final void d(boolean z17, boolean z18, boolean z19) {
        this.f125815h = (z17 ? 1 : 2) | (z18 ? 4 : 0) | (z19 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams(-1, -2);
    }

    /* renamed from: getDownNestedPreScrollRange */
    public int m19967x1adc91dc() {
        int m19972x410d7a3e;
        int i17 = this.f125812e;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i19 = layoutParams.f125833a;
            if ((i19 & 5) != 5) {
                if (i18 > 0) {
                    break;
                }
            } else {
                int i27 = i18 + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i19 & 8) != 0) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    i18 = i27 + n3.u0.d(childAt);
                } else {
                    if ((i19 & 2) != 0) {
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                        m19972x410d7a3e = n3.u0.d(childAt);
                    } else {
                        m19972x410d7a3e = m19972x410d7a3e();
                    }
                    i18 = i27 + (measuredHeight - m19972x410d7a3e);
                }
            }
        }
        int max = java.lang.Math.max(0, i18);
        this.f125812e = max;
        return max;
    }

    /* renamed from: getDownNestedScrollRange */
    public int m19968xb8b4f6c1() {
        int i17 = this.f125813f;
        if (i17 != -1) {
            return i17;
        }
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i18);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
            int i27 = layoutParams.f125833a;
            if ((i27 & 1) == 0) {
                break;
            }
            i19 += measuredHeight;
            if ((i27 & 2) != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                i19 -= n3.u0.d(childAt) + m19972x410d7a3e();
                break;
            }
            i18++;
        }
        int max = java.lang.Math.max(0, i19);
        this.f125813f = max;
        return max;
    }

    /* renamed from: getMinimumHeightForVisibleOverlappingContent */
    public final int m19969xbdc95208() {
        int m19972x410d7a3e = m19972x410d7a3e();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.u0.d(this);
        if (d17 == 0) {
            int childCount = getChildCount();
            d17 = childCount >= 1 ? n3.u0.d(getChildAt(childCount - 1)) : 0;
            if (d17 == 0) {
                return getHeight() / 3;
            }
        }
        return (d17 * 2) + m19972x410d7a3e;
    }

    /* renamed from: getPendingAction */
    public int m19970xb6c6e2f7() {
        return this.f125815h;
    }

    @java.lang.Deprecated
    /* renamed from: getTargetElevation */
    public float m19971x665ae196() {
        return 0.0f;
    }

    /* renamed from: getTopInset */
    final int m19972x410d7a3e() {
        n3.g3 g3Var = this.f125816i;
        if (g3Var != null) {
            return g3Var.e();
        }
        return 0;
    }

    /* renamed from: getTotalScrollRange */
    public final int m19973xa8f0dc02() {
        int i17 = this.f125811d;
        if (i17 != -1) {
            return i17;
        }
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i18);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i27 = layoutParams.f125833a;
            if ((i27 & 1) == 0) {
                break;
            }
            i19 += measuredHeight + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
            if ((i27 & 2) != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                i19 -= n3.u0.d(childAt);
                break;
            }
            i18++;
        }
        int max = java.lang.Math.max(0, i19 - m19972x410d7a3e());
        this.f125811d = max;
        return max;
    }

    /* renamed from: getUpNestedPreScrollRange */
    public int m19974xc4a7aad5() {
        return m19973xa8f0dc02();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        if (this.f125821q == null) {
            this.f125821q = new int[4];
        }
        int[] iArr = this.f125821q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + iArr.length);
        boolean z17 = this.f125818n;
        iArr[0] = z17 ? com.p314xaae8f345.mm.R.C30857x2dd9f1.f559940j0 : -2130969927;
        iArr[1] = (z17 && this.f125819o) ? com.p314xaae8f345.mm.R.C30857x2dd9f1.f559941j1 : -2130969928;
        iArr[2] = z17 ? com.p314xaae8f345.mm.R.C30857x2dd9f1.f559939iz : -2130969926;
        iArr[3] = (z17 && this.f125819o) ? com.p314xaae8f345.mm.R.C30857x2dd9f1.f559938iy : -2130969925;
        return android.view.View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = -1
            r1.f125811d = r2
            r1.f125812e = r2
            r1.f125813f = r2
            r2 = 0
            r1.f125814g = r2
            int r3 = r1.getChildCount()
            r4 = r2
        L12:
            r5 = 1
            if (r4 >= r3) goto L29
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) r6
            android.view.animation.Interpolator r6 = r6.f125834b
            if (r6 == 0) goto L26
            r1.f125814g = r5
            goto L29
        L26:
            int r4 = r4 + 1
            goto L12
        L29:
            boolean r3 = r1.f125820p
            if (r3 != 0) goto L55
            int r3 = r1.getChildCount()
            r4 = r2
        L32:
            if (r4 >= r3) goto L52
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) r6
            int r6 = r6.f125833a
            r0 = r6 & 1
            if (r0 != r5) goto L4a
            r6 = r6 & 10
            if (r6 == 0) goto L4a
            r6 = r5
            goto L4b
        L4a:
            r6 = r2
        L4b:
            if (r6 == 0) goto L4f
            r3 = r5
            goto L53
        L4f:
            int r4 = r4 + 1
            goto L32
        L52:
            r3 = r2
        L53:
            if (r3 == 0) goto L56
        L55:
            r2 = r5
        L56:
            boolean r3 = r1.f125818n
            if (r3 == r2) goto L5f
            r1.f125818n = r2
            r1.refreshDrawableState()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f125811d = -1;
        this.f125812e = -1;
        this.f125813f = -1;
    }

    /* renamed from: setExpanded */
    public void m19975x2fe4b3b(boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        d(z17, n3.x0.c(this), true);
    }

    /* renamed from: setLiftOnScroll */
    public void m19976xc8f52339(boolean z17) {
        this.f125820p = z17;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i17) {
        if (i17 != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i17);
    }

    @java.lang.Deprecated
    /* renamed from: setTargetElevation */
    public void m19977x9d317b0a(float f17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.m.a(this, f17);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior */
    /* loaded from: classes15.dex */
    public static class BaseBehavior<T extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c> extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f<T> {

        /* renamed from: p, reason: collision with root package name */
        public int f125822p;

        /* renamed from: q, reason: collision with root package name */
        public int f125823q;

        /* renamed from: r, reason: collision with root package name */
        public android.animation.ValueAnimator f125824r;

        /* renamed from: s, reason: collision with root package name */
        public int f125825s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f125826t;

        /* renamed from: u, reason: collision with root package name */
        public float f125827u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.ref.WeakReference f125828v;

        /* renamed from: w, reason: collision with root package name */
        public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.c f125829w;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState */
        /* loaded from: classes13.dex */
        public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState> f7855x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.d();

            /* renamed from: f, reason: collision with root package name */
            public int f125830f;

            /* renamed from: g, reason: collision with root package name */
            public float f125831g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f125832h;

            public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f125830f = parcel.readInt();
                this.f125831g = parcel.readFloat();
                this.f125832h = parcel.readByte() != 0;
            }

            @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeParcelable(this.f92645d, i17);
                parcel.writeInt(this.f125830f);
                parcel.writeFloat(this.f125831g);
                parcel.writeByte(this.f125832h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f125825s = -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if (r4.canScrollVertically(-1) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        
            if (r4.E == false) goto L18;
         */
        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean C(android.view.View r4) {
            /*
                r3 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) r4
                com.google.android.material.appbar.c r4 = r3.f125829w
                r0 = 0
                r1 = 1
                if (r4 == 0) goto L15
                y23.a r4 = (y23.a) r4
                com.tencent.mm.plugin.gallery.picker.behavior.AppBarLayoutBehavior r4 = r4.f540652a
                boolean r2 = r4.D
                if (r2 != 0) goto L2e
                boolean r4 = r4.E
                if (r4 == 0) goto L2f
                goto L2e
            L15:
                java.lang.ref.WeakReference r4 = r3.f125828v
                if (r4 == 0) goto L30
                java.lang.Object r4 = r4.get()
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L2f
                boolean r2 = r4.isShown()
                if (r2 == 0) goto L2f
                r2 = -1
                boolean r4 = r4.canScrollVertically(r2)
                if (r4 != 0) goto L2f
            L2e:
                r0 = r1
            L2f:
                r1 = r0
            L30:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.C(android.view.View):boolean");
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f
        public int D(android.view.View view) {
            return -((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view).m19968xb8b4f6c1();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f
        public int E(android.view.View view) {
            return ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view).m19973xa8f0dc02();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f
        public void F(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
            N(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f
        public int H(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17, int i18, int i19) {
            int i27;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
            int z17 = z();
            int i28 = 0;
            if (i18 == 0 || z17 < i18 || z17 > i19) {
                this.f125822p = 0;
                return 0;
            }
            int b17 = h3.a.b(i17, i18, i19);
            if (z17 == b17) {
                return 0;
            }
            if (c2678xa407981c.f125814g) {
                int abs = java.lang.Math.abs(b17);
                int childCount = c2678xa407981c.getChildCount();
                int i29 = 0;
                while (true) {
                    if (i29 >= childCount) {
                        break;
                    }
                    android.view.View childAt = c2678xa407981c.getChildAt(i29);
                    com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt.getLayoutParams();
                    android.view.animation.Interpolator interpolator = layoutParams.f125834b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i29++;
                    } else if (interpolator != null) {
                        int i37 = layoutParams.f125833a;
                        if ((i37 & 1) != 0) {
                            i28 = 0 + childAt.getHeight() + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((i37 & 2) != 0) {
                                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                                i28 -= n3.u0.d(childAt);
                            }
                        }
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                        if (n3.u0.b(childAt)) {
                            i28 -= c2678xa407981c.m19972x410d7a3e();
                        }
                        if (i28 > 0) {
                            float f17 = i28;
                            i27 = java.lang.Integer.signum(b17) * (childAt.getTop() + java.lang.Math.round(f17 * interpolator.getInterpolation((abs - childAt.getTop()) / f17)));
                        }
                    }
                }
            }
            i27 = b17;
            boolean B = super.B(i27);
            int i38 = z17 - b17;
            this.f125822p = b17 - i27;
            if (!B && c2678xa407981c.f125814g) {
                c1081xa22a3e5a.g(c2678xa407981c);
            }
            c2678xa407981c.b(super.y());
            O(c1081xa22a3e5a, c2678xa407981c, b17, b17 < z17 ? -1 : 1, false);
            return i38;
        }

        public final void I(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17, float f17) {
            int abs = java.lang.Math.abs(z() - i17);
            float abs2 = java.lang.Math.abs(f17);
            int round = abs2 > 0.0f ? java.lang.Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / c2678xa407981c.getHeight()) + 1.0f) * 150.0f);
            int z17 = z();
            if (z17 == i17) {
                android.animation.ValueAnimator valueAnimator = this.f125824r;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f125824r.cancel();
                return;
            }
            android.animation.ValueAnimator valueAnimator2 = this.f125824r;
            if (valueAnimator2 == null) {
                android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
                this.f125824r = valueAnimator3;
                valueAnimator3.setInterpolator(w9.a.f525571e);
                this.f125824r.addUpdateListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.b(this, c1081xa22a3e5a, c2678xa407981c));
            } else {
                valueAnimator2.cancel();
            }
            this.f125824r.setDuration(java.lang.Math.min(round, 600));
            this.f125824r.setIntValues(z17, i17);
            this.f125824r.start();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
            int round;
            super.g(c1081xa22a3e5a, c2678xa407981c, i17);
            int m19970xb6c6e2f7 = c2678xa407981c.m19970xb6c6e2f7();
            int i18 = this.f125825s;
            if (i18 >= 0 && (m19970xb6c6e2f7 & 8) == 0) {
                android.view.View childAt = c2678xa407981c.getChildAt(i18);
                int i19 = -childAt.getBottom();
                if (this.f125826t) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    round = n3.u0.d(childAt) + c2678xa407981c.m19972x410d7a3e();
                } else {
                    round = java.lang.Math.round(childAt.getHeight() * this.f125827u);
                }
                G(c1081xa22a3e5a, c2678xa407981c, i19 + round);
            } else if (m19970xb6c6e2f7 != 0) {
                boolean z17 = (m19970xb6c6e2f7 & 4) != 0;
                if ((m19970xb6c6e2f7 & 2) != 0) {
                    int i27 = -c2678xa407981c.m19974xc4a7aad5();
                    if (z17) {
                        I(c1081xa22a3e5a, c2678xa407981c, i27, 0.0f);
                    } else {
                        G(c1081xa22a3e5a, c2678xa407981c, i27);
                    }
                } else if ((m19970xb6c6e2f7 & 1) != 0) {
                    if (z17) {
                        I(c1081xa22a3e5a, c2678xa407981c, 0, 0.0f);
                    } else {
                        G(c1081xa22a3e5a, c2678xa407981c, 0);
                    }
                }
            }
            c2678xa407981c.f125815h = 0;
            this.f125825s = -1;
            super.B(h3.a.b(super.y(), -c2678xa407981c.m19973xa8f0dc02(), 0));
            O(c1081xa22a3e5a, c2678xa407981c, super.y(), 0, true);
            c2678xa407981c.b(super.y());
            return true;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int[] iArr, int i19) {
            int i27;
            int i28;
            if (i18 != 0) {
                if (i18 < 0) {
                    i27 = -c2678xa407981c.m19973xa8f0dc02();
                    i28 = c2678xa407981c.m19967x1adc91dc() + i27;
                } else {
                    i27 = -c2678xa407981c.m19974xc4a7aad5();
                    i28 = 0;
                }
                int i29 = i27;
                int i37 = i28;
                if (i29 != i37) {
                    iArr[1] = H(c1081xa22a3e5a, c2678xa407981c, z() - i18, i29, i37);
                    if (i19 == 1) {
                        int z17 = z();
                        if ((i18 >= 0 || z17 != 0) && (i18 <= 0 || z17 != (-c2678xa407981c.m19968xb8b4f6c1()))) {
                            return;
                        }
                        n3.l1.p(view, 1);
                    }
                }
            }
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
            if (i27 < 0) {
                H(c1081xa22a3e5a, c2678xa407981c, z() - i27, -c2678xa407981c.m19968xb8b4f6c1(), 0);
                if (i28 == 1) {
                    int z17 = z();
                    if ((i27 < 0 && z17 == 0) || (i27 > 0 && z17 == (-c2678xa407981c.m19968xb8b4f6c1()))) {
                        n3.l1.p(view, 1);
                    }
                }
            }
            if (c2678xa407981c.f125820p) {
                boolean z18 = view.getScrollY() > 0;
                if (c2678xa407981c.f125819o != z18) {
                    c2678xa407981c.f125819o = z18;
                    c2678xa407981c.refreshDrawableState();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (((r3.m19973xa8f0dc02() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L16;
         */
        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a r2, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2a
                boolean r5 = r3.f125820p
                r0 = 1
                if (r5 != 0) goto L29
                int r5 = r3.m19973xa8f0dc02()
                if (r5 == 0) goto L12
                r5 = r0
                goto L13
            L12:
                r5 = r6
            L13:
                if (r5 == 0) goto L26
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L26
                r2 = r0
                goto L27
            L26:
                r2 = r6
            L27:
                if (r2 == 0) goto L2a
            L29:
                r6 = r0
            L2a:
                if (r6 == 0) goto L33
                android.animation.ValueAnimator r2 = r1.f125824r
                if (r2 == 0) goto L33
                r2.cancel()
            L33:
                r2 = 0
                r1.f125828v = r2
                r1.f125823q = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        public final void N(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c) {
            int z17 = z();
            int childCount = c2678xa407981c.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    i17 = -1;
                    break;
                }
                android.view.View childAt = c2678xa407981c.getChildAt(i17);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f125833a & 32) == 32) {
                    top -= ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i18 = -z17;
                if (top <= i18 && bottom >= i18) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                android.view.View childAt2 = c2678xa407981c.getChildAt(i17);
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams layoutParams2 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams) childAt2.getLayoutParams();
                int i19 = layoutParams2.f125833a;
                if ((i19 & 17) == 17) {
                    int i27 = -childAt2.getTop();
                    int i28 = -childAt2.getBottom();
                    if (i17 == c2678xa407981c.getChildCount() - 1) {
                        i28 += c2678xa407981c.m19972x410d7a3e();
                    }
                    if ((i19 & 2) == 2) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        i28 += n3.u0.d(childAt2);
                    } else {
                        if ((i19 & 5) == 5) {
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                            int d17 = n3.u0.d(childAt2) + i28;
                            if (z17 < d17) {
                                i27 = d17;
                            } else {
                                i28 = d17;
                            }
                        }
                    }
                    if ((i19 & 32) == 32) {
                        i27 += ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i28 -= ((android.widget.LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (z17 < (i28 + i27) / 2) {
                        i27 = i28;
                    }
                    I(c1081xa22a3e5a, c2678xa407981c, h3.a.b(i27, -c2678xa407981c.m19973xa8f0dc02(), 0), 0.0f);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void O(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a r8, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.O(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public boolean h(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17, int i18, int i19, int i27) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
            if (((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) c2678xa407981c.getLayoutParams())).height != -2) {
                return false;
            }
            c1081xa22a3e5a.u(c2678xa407981c, i17, i18, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i27);
            return true;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public void r(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.os.Parcelable parcelable) {
            if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState)) {
                this.f125825s = -1;
                return;
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState) parcelable;
            android.os.Parcelable parcelable2 = savedState.f92645d;
            this.f125825s = savedState.f125830f;
            this.f125827u = savedState.f125831g;
            this.f125826t = savedState.f125832h;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public android.os.Parcelable s(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
            android.view.AbsSavedState absSavedState = android.view.View.BaseSavedState.EMPTY_STATE;
            int y17 = super.y();
            int childCount = c2678xa407981c.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c2678xa407981c.getChildAt(i17);
                int bottom = childAt.getBottom() + y17;
                if (childAt.getTop() + y17 <= 0 && bottom >= 0) {
                    com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState savedState = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior.SavedState(absSavedState);
                    savedState.f125830f = i17;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    savedState.f125832h = bottom == n3.u0.d(childAt) + c2678xa407981c.m19972x410d7a3e();
                    savedState.f125831g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
        public void w(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
            if (this.f125823q == 0 || i17 == 1) {
                N(c1081xa22a3e5a, c2678xa407981c);
            }
            this.f125828v = new java.lang.ref.WeakReference(view2);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a
        public int z() {
            return super.y() + this.f125822p;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125825s = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f125833a;

        /* renamed from: b, reason: collision with root package name */
        public final android.view.animation.Interpolator f125834b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125833a = 1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515645b);
            this.f125833a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f125834b = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f125833a = 1;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f125833a = 1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f125833a = 1;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f125833a = 1;
        }
    }
}
