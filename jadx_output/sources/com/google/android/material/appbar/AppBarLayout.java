package com.google.android.material.appbar;

@androidx.coordinatorlayout.widget.b(com.google.android.material.appbar.AppBarLayout.Behavior.class)
/* loaded from: classes15.dex */
public class AppBarLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f44278d;

    /* renamed from: e, reason: collision with root package name */
    public int f44279e;

    /* renamed from: f, reason: collision with root package name */
    public int f44280f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44281g;

    /* renamed from: h, reason: collision with root package name */
    public int f44282h;

    /* renamed from: i, reason: collision with root package name */
    public n3.g3 f44283i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f44284m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44285n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44286o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44287p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f44288q;

    /* loaded from: classes15.dex */
    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes15.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public android.view.View C(java.util.List list) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.view.View view = (android.view.View) list.get(i17);
                if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                    return (com.google.android.material.appbar.AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float D(android.view.View view) {
            int i17;
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) appBarLayout.getLayoutParams()).f11006a;
                int z17 = behavior instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior ? ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) behavior).z() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + z17 > downNestedPreScrollRange) && (i17 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (z17 / i17) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int E(android.view.View view) {
            return view instanceof com.google.android.material.appbar.AppBarLayout ? ((com.google.android.material.appbar.AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return view2 instanceof com.google.android.material.appbar.AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            int b17;
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) view2.getLayoutParams()).f11006a;
            if (behavior instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) behavior).f44289p + this.f44333h;
                if (this.f44334i == 0) {
                    b17 = 0;
                } else {
                    float D = D(view2);
                    int i17 = this.f44334i;
                    b17 = h3.a.b((int) (D * i17), 0, i17);
                }
                int i18 = bottom - b17;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                view.offsetTopAndBottom(i18);
            }
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view2;
                if (appBarLayout.f44287p) {
                    boolean z17 = view.getScrollY() > 0;
                    if (appBarLayout.f44286o != z17) {
                        appBarLayout.f44286o = z17;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z17) {
            com.google.android.material.appbar.AppBarLayout appBarLayout;
            java.util.ArrayList arrayList = (java.util.ArrayList) coordinatorLayout.k(view);
            int size = arrayList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    appBarLayout = null;
                    break;
                }
                android.view.View view2 = (android.view.View) arrayList.get(i17);
                if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                    appBarLayout = (com.google.android.material.appbar.AppBarLayout) view2;
                    break;
                }
                i17++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                android.graphics.Rect rect2 = this.f44331f;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.d(false, !z17, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434128r);
            this.f44334i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44278d = -1;
        this.f44279e = -1;
        this.f44280f = -1;
        this.f44282h = 0;
        setOrientation(1);
        int i17 = android.os.Build.VERSION.SDK_INT;
        setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray d17 = fa.d0.d(context2, attributeSet, com.google.android.material.appbar.m.f44351a, 0, com.tencent.mm.R.style.f494743v1, new int[0]);
        try {
            if (d17.hasValue(0)) {
                setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context2, d17.getResourceId(0, 0)));
            }
            d17.recycle();
            android.content.res.TypedArray d18 = fa.d0.d(context, attributeSet, v9.a.f434111a, 0, com.tencent.mm.R.style.f494743v1, new int[0]);
            android.graphics.drawable.Drawable drawable = d18.getDrawable(0);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(this, drawable);
            if (d18.hasValue(4)) {
                d(d18.getBoolean(4, false), false, false);
            }
            if (d18.hasValue(3)) {
                com.google.android.material.appbar.m.a(this, d18.getDimensionPixelSize(3, 0));
            }
            if (i17 >= 26) {
                if (d18.hasValue(2)) {
                    setKeyboardNavigationCluster(d18.getBoolean(2, false));
                }
                if (d18.hasValue(1)) {
                    setTouchscreenBlocksFocus(d18.getBoolean(1, false));
                }
            }
            this.f44287p = d18.getBoolean(5, false);
            d18.recycle();
            n3.a1.u(this, new com.google.android.material.appbar.a(this));
        } catch (java.lang.Throwable th6) {
            d17.recycle();
            throw th6;
        }
    }

    public void a(com.google.android.material.appbar.e eVar) {
        if (this.f44284m == null) {
            this.f44284m = new java.util.ArrayList();
        }
        if (eVar == null || this.f44284m.contains(eVar)) {
            return;
        }
        this.f44284m.add(eVar);
    }

    public void b(int i17) {
        java.util.List list = this.f44284m;
        if (list != null) {
            int size = ((java.util.ArrayList) list).size();
            for (int i18 = 0; i18 < size; i18++) {
                com.google.android.material.appbar.e eVar = (com.google.android.material.appbar.e) ((java.util.ArrayList) this.f44284m).get(i18);
                if (eVar != null) {
                    eVar.a(this, i17);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.widget.LinearLayout.LayoutParams ? new com.google.android.material.appbar.AppBarLayout.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new com.google.android.material.appbar.AppBarLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new com.google.android.material.appbar.AppBarLayout.LayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams;
    }

    public final void d(boolean z17, boolean z18, boolean z19) {
        this.f44282h = (z17 ? 1 : 2) | (z18 ? 4 : 0) | (z19 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, -2);
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i17 = this.f44279e;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i19 = layoutParams.f44300a;
            if ((i19 & 5) != 5) {
                if (i18 > 0) {
                    break;
                }
            } else {
                int i27 = i18 + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i19 & 8) != 0) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    i18 = i27 + n3.u0.d(childAt);
                } else {
                    if ((i19 & 2) != 0) {
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                        topInset = n3.u0.d(childAt);
                    } else {
                        topInset = getTopInset();
                    }
                    i18 = i27 + (measuredHeight - topInset);
                }
            }
        }
        int max = java.lang.Math.max(0, i18);
        this.f44279e = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i17 = this.f44280f;
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
            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
            int i27 = layoutParams.f44300a;
            if ((i27 & 1) == 0) {
                break;
            }
            i19 += measuredHeight;
            if ((i27 & 2) != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                i19 -= n3.u0.d(childAt) + getTopInset();
                break;
            }
            i18++;
        }
        int max = java.lang.Math.max(0, i19);
        this.f44280f = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int d17 = n3.u0.d(this);
        if (d17 == 0) {
            int childCount = getChildCount();
            d17 = childCount >= 1 ? n3.u0.d(getChildAt(childCount - 1)) : 0;
            if (d17 == 0) {
                return getHeight() / 3;
            }
        }
        return (d17 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f44282h;
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        n3.g3 g3Var = this.f44283i;
        if (g3Var != null) {
            return g3Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i17 = this.f44278d;
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
            com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i27 = layoutParams.f44300a;
            if ((i27 & 1) == 0) {
                break;
            }
            i19 += measuredHeight + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
            if ((i27 & 2) != 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                i19 -= n3.u0.d(childAt);
                break;
            }
            i18++;
        }
        int max = java.lang.Math.max(0, i19 - getTopInset());
        this.f44278d = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        if (this.f44288q == null) {
            this.f44288q = new int[4];
        }
        int[] iArr = this.f44288q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + iArr.length);
        boolean z17 = this.f44285n;
        iArr[0] = z17 ? com.tencent.mm.R.attr.f478407j0 : -2130969927;
        iArr[1] = (z17 && this.f44286o) ? com.tencent.mm.R.attr.f478408j1 : -2130969928;
        iArr[2] = z17 ? com.tencent.mm.R.attr.f478406iz : -2130969926;
        iArr[3] = (z17 && this.f44286o) ? com.tencent.mm.R.attr.f478405iy : -2130969925;
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
            r1.f44278d = r2
            r1.f44279e = r2
            r1.f44280f = r2
            r2 = 0
            r1.f44281g = r2
            int r3 = r1.getChildCount()
            r4 = r2
        L12:
            r5 = 1
            if (r4 >= r3) goto L29
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            android.view.animation.Interpolator r6 = r6.f44301b
            if (r6 == 0) goto L26
            r1.f44281g = r5
            goto L29
        L26:
            int r4 = r4 + 1
            goto L12
        L29:
            boolean r3 = r1.f44287p
            if (r3 != 0) goto L55
            int r3 = r1.getChildCount()
            r4 = r2
        L32:
            if (r4 >= r3) goto L52
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            int r6 = r6.f44300a
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
            boolean r3 = r1.f44285n
            if (r3 == r2) goto L5f
            r1.f44285n = r2
            r1.refreshDrawableState()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f44278d = -1;
        this.f44279e = -1;
        this.f44280f = -1;
    }

    public void setExpanded(boolean z17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        d(z17, n3.x0.c(this), true);
    }

    public void setLiftOnScroll(boolean z17) {
        this.f44287p = z17;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i17) {
        if (i17 != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i17);
    }

    @java.lang.Deprecated
    public void setTargetElevation(float f17) {
        com.google.android.material.appbar.m.a(this, f17);
    }

    /* loaded from: classes15.dex */
    public static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.HeaderBehavior<T> {

        /* renamed from: p, reason: collision with root package name */
        public int f44289p;

        /* renamed from: q, reason: collision with root package name */
        public int f44290q;

        /* renamed from: r, reason: collision with root package name */
        public android.animation.ValueAnimator f44291r;

        /* renamed from: s, reason: collision with root package name */
        public int f44292s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f44293t;

        /* renamed from: u, reason: collision with root package name */
        public float f44294u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.ref.WeakReference f44295v;

        /* renamed from: w, reason: collision with root package name */
        public com.google.android.material.appbar.c f44296w;

        /* loaded from: classes13.dex */
        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState> CREATOR = new com.google.android.material.appbar.d();

            /* renamed from: f, reason: collision with root package name */
            public int f44297f;

            /* renamed from: g, reason: collision with root package name */
            public float f44298g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f44299h;

            public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f44297f = parcel.readInt();
                this.f44298g = parcel.readFloat();
                this.f44299h = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeParcelable(this.f11112d, i17);
                parcel.writeInt(this.f44297f);
                parcel.writeFloat(this.f44298g);
                parcel.writeByte(this.f44299h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f44292s = -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if (r4.canScrollVertically(-1) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        
            if (r4.E == false) goto L18;
         */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean C(android.view.View r4) {
            /*
                r3 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                com.google.android.material.appbar.c r4 = r3.f44296w
                r0 = 0
                r1 = 1
                if (r4 == 0) goto L15
                y23.a r4 = (y23.a) r4
                com.tencent.mm.plugin.gallery.picker.behavior.AppBarLayoutBehavior r4 = r4.f459119a
                boolean r2 = r4.D
                if (r2 != 0) goto L2e
                boolean r4 = r4.E
                if (r4 == 0) goto L2f
                goto L2e
            L15:
                java.lang.ref.WeakReference r4 = r3.f44295v
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.C(android.view.View):boolean");
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int D(android.view.View view) {
            return -((com.google.android.material.appbar.AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int E(android.view.View view) {
            return ((com.google.android.material.appbar.AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public void F(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            N(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int H(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17, int i18, int i19) {
            int i27;
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            int z17 = z();
            int i28 = 0;
            if (i18 == 0 || z17 < i18 || z17 > i19) {
                this.f44289p = 0;
                return 0;
            }
            int b17 = h3.a.b(i17, i18, i19);
            if (z17 == b17) {
                return 0;
            }
            if (appBarLayout.f44281g) {
                int abs = java.lang.Math.abs(b17);
                int childCount = appBarLayout.getChildCount();
                int i29 = 0;
                while (true) {
                    if (i29 >= childCount) {
                        break;
                    }
                    android.view.View childAt = appBarLayout.getChildAt(i29);
                    com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                    android.view.animation.Interpolator interpolator = layoutParams.f44301b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i29++;
                    } else if (interpolator != null) {
                        int i37 = layoutParams.f44300a;
                        if ((i37 & 1) != 0) {
                            i28 = 0 + childAt.getHeight() + ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin + ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((i37 & 2) != 0) {
                                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                                i28 -= n3.u0.d(childAt);
                            }
                        }
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                        if (n3.u0.b(childAt)) {
                            i28 -= appBarLayout.getTopInset();
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
            this.f44289p = b17 - i27;
            if (!B && appBarLayout.f44281g) {
                coordinatorLayout.g(appBarLayout);
            }
            appBarLayout.b(super.y());
            O(coordinatorLayout, appBarLayout, b17, b17 < z17 ? -1 : 1, false);
            return i38;
        }

        public final void I(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i17, float f17) {
            int abs = java.lang.Math.abs(z() - i17);
            float abs2 = java.lang.Math.abs(f17);
            int round = abs2 > 0.0f ? java.lang.Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int z17 = z();
            if (z17 == i17) {
                android.animation.ValueAnimator valueAnimator = this.f44291r;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f44291r.cancel();
                return;
            }
            android.animation.ValueAnimator valueAnimator2 = this.f44291r;
            if (valueAnimator2 == null) {
                android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
                this.f44291r = valueAnimator3;
                valueAnimator3.setInterpolator(w9.a.f444038e);
                this.f44291r.addUpdateListener(new com.google.android.material.appbar.b(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f44291r.setDuration(java.lang.Math.min(round, 600));
            this.f44291r.setIntValues(z17, i17);
            this.f44291r.start();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
            int round;
            super.g(coordinatorLayout, appBarLayout, i17);
            int pendingAction = appBarLayout.getPendingAction();
            int i18 = this.f44292s;
            if (i18 >= 0 && (pendingAction & 8) == 0) {
                android.view.View childAt = appBarLayout.getChildAt(i18);
                int i19 = -childAt.getBottom();
                if (this.f44293t) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    round = n3.u0.d(childAt) + appBarLayout.getTopInset();
                } else {
                    round = java.lang.Math.round(childAt.getHeight() * this.f44294u);
                }
                G(coordinatorLayout, appBarLayout, i19 + round);
            } else if (pendingAction != 0) {
                boolean z17 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i27 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z17) {
                        I(coordinatorLayout, appBarLayout, i27, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, i27);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z17) {
                        I(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f44282h = 0;
            this.f44292s = -1;
            super.B(h3.a.b(super.y(), -appBarLayout.getTotalScrollRange(), 0));
            O(coordinatorLayout, appBarLayout, super.y(), 0, true);
            appBarLayout.b(super.y());
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int[] iArr, int i19) {
            int i27;
            int i28;
            if (i18 != 0) {
                if (i18 < 0) {
                    i27 = -appBarLayout.getTotalScrollRange();
                    i28 = appBarLayout.getDownNestedPreScrollRange() + i27;
                } else {
                    i27 = -appBarLayout.getUpNestedPreScrollRange();
                    i28 = 0;
                }
                int i29 = i27;
                int i37 = i28;
                if (i29 != i37) {
                    iArr[1] = H(coordinatorLayout, appBarLayout, z() - i18, i29, i37);
                    if (i19 == 1) {
                        int z17 = z();
                        if ((i18 >= 0 || z17 != 0) && (i18 <= 0 || z17 != (-appBarLayout.getDownNestedScrollRange()))) {
                            return;
                        }
                        n3.l1.p(view, 1);
                    }
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
            if (i27 < 0) {
                H(coordinatorLayout, appBarLayout, z() - i27, -appBarLayout.getDownNestedScrollRange(), 0);
                if (i28 == 1) {
                    int z17 = z();
                    if ((i27 < 0 && z17 == 0) || (i27 > 0 && z17 == (-appBarLayout.getDownNestedScrollRange()))) {
                        n3.l1.p(view, 1);
                    }
                }
            }
            if (appBarLayout.f44287p) {
                boolean z18 = view.getScrollY() > 0;
                if (appBarLayout.f44286o != z18) {
                    appBarLayout.f44286o = z18;
                    appBarLayout.refreshDrawableState();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L16;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.appbar.AppBarLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2a
                boolean r5 = r3.f44287p
                r0 = 1
                if (r5 != 0) goto L29
                int r5 = r3.getTotalScrollRange()
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
                android.animation.ValueAnimator r2 = r1.f44291r
                if (r2 == 0) goto L33
                r2.cancel()
            L33:
                r2 = 0
                r1.f44295v = r2
                r1.f44290q = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        public final void N(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int z17 = z();
            int childCount = appBarLayout.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    i17 = -1;
                    break;
                }
                android.view.View childAt = appBarLayout.getChildAt(i17);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f44300a & 32) == 32) {
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
                android.view.View childAt2 = appBarLayout.getChildAt(i17);
                com.google.android.material.appbar.AppBarLayout.LayoutParams layoutParams2 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) childAt2.getLayoutParams();
                int i19 = layoutParams2.f44300a;
                if ((i19 & 17) == 17) {
                    int i27 = -childAt2.getTop();
                    int i28 = -childAt2.getBottom();
                    if (i17 == appBarLayout.getChildCount() - 1) {
                        i28 += appBarLayout.getTopInset();
                    }
                    if ((i19 & 2) == 2) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        i28 += n3.u0.d(childAt2);
                    } else {
                        if ((i19 & 5) == 5) {
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
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
                    I(coordinatorLayout, appBarLayout, h3.a.b(i27, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
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
        public final void O(androidx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.android.material.appbar.AppBarLayout r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.O(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17, int i18, int i19, int i27) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            if (((android.view.ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.u(appBarLayout, i17, i18, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i27);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
            if (!(parcelable instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState)) {
                this.f44292s = -1;
                return;
            }
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) parcelable;
            android.os.Parcelable parcelable2 = savedState.f11112d;
            this.f44292s = savedState.f44297f;
            this.f44294u = savedState.f44298g;
            this.f44293t = savedState.f44299h;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public android.os.Parcelable s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            android.view.AbsSavedState absSavedState = android.view.View.BaseSavedState.EMPTY_STATE;
            int y17 = super.y();
            int childCount = appBarLayout.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = appBarLayout.getChildAt(i17);
                int bottom = childAt.getBottom() + y17;
                if (childAt.getTop() + y17 <= 0 && bottom >= 0) {
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(absSavedState);
                    savedState.f44297f = i17;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    savedState.f44299h = bottom == n3.u0.d(childAt) + appBarLayout.getTopInset();
                    savedState.f44298g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            if (this.f44290q == 0 || i17 == 1) {
                N(coordinatorLayout, appBarLayout);
            }
            this.f44295v = new java.lang.ref.WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public int z() {
            return super.y() + this.f44289p;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44292s = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.AppBarLayout.LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f44300a;

        /* renamed from: b, reason: collision with root package name */
        public final android.view.animation.Interpolator f44301b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44300a = 1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434112b);
            this.f44300a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f44301b = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f44300a = 1;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44300a = 1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44300a = 1;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44300a = 1;
        }
    }
}
