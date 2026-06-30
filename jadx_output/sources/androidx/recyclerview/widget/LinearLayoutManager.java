package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.f1, androidx.recyclerview.widget.f3 {

    /* renamed from: d, reason: collision with root package name */
    public int f11867d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.m1 f11868e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f11869f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11870g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11871h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11872i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11873m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11874n;

    /* renamed from: o, reason: collision with root package name */
    public int f11875o;

    /* renamed from: p, reason: collision with root package name */
    public int f11876p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11877q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager.SavedState f11878r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.k1 f11879s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f11880t;

    /* renamed from: u, reason: collision with root package name */
    public int f11881u;

    public LinearLayoutManager(android.content.Context context) {
        this(context, 1, false);
    }

    public android.view.View A(int i17, int i18, boolean z17, boolean z18) {
        r();
        int i19 = com.tencent.mapsdk.internal.km.f50100e;
        int i27 = z17 ? 24579 : 320;
        if (!z18) {
            i19 = 0;
        }
        return this.f11867d == 0 ? this.mHorizontalBoundCheck.a(i17, i18, i27, i19) : this.mVerticalBoundCheck.a(i17, i18, i27, i19);
    }

    public android.view.View B(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, int i18, int i19) {
        r();
        int k17 = this.f11869f.k();
        int g17 = this.f11869f.g();
        int i27 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        android.view.View view2 = null;
        while (i17 != i18) {
            android.view.View childAt = getChildAt(i17);
            int position = getPosition(childAt);
            if (position >= 0 && position < i19) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f11869f.e(childAt) < g17 && this.f11869f.b(childAt) >= k17) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i17 += i27;
        }
        return view != null ? view : view2;
    }

    public final int C(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int g17;
        int g18 = this.f11869f.g() - i17;
        if (g18 <= 0) {
            return 0;
        }
        int i18 = -O(-g18, z2Var, h3Var);
        int i19 = i17 + i18;
        if (!z17 || (g17 = this.f11869f.g() - i19) <= 0) {
            return i18;
        }
        this.f11869f.p(g17);
        return g17 + i18;
    }

    public final int D(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int k17;
        int k18 = i17 - this.f11869f.k();
        if (k18 <= 0) {
            return 0;
        }
        int i18 = -O(k18, z2Var, h3Var);
        int i19 = i17 + i18;
        if (!z17 || (k17 = i19 - this.f11869f.k()) <= 0) {
            return i18;
        }
        this.f11869f.p(-k17);
        return i18 - k17;
    }

    public final android.view.View E() {
        return getChildAt(this.f11872i ? 0 : getChildCount() - 1);
    }

    public final android.view.View F() {
        return getChildAt(this.f11872i ? getChildCount() - 1 : 0);
    }

    public int G(androidx.recyclerview.widget.h3 h3Var) {
        if (h3Var.f12059a != -1) {
            return this.f11869f.l();
        }
        return 0;
    }

    public int H() {
        return this.f11867d;
    }

    public boolean I() {
        return getLayoutDirection() == 1;
    }

    public void J(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.m1 m1Var, androidx.recyclerview.widget.l1 l1Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        int d17;
        android.view.View b17 = m1Var.b(z2Var);
        if (b17 == null) {
            l1Var.f12121b = true;
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) b17.getLayoutParams();
        if (m1Var.f12137j == null) {
            if (this.f11872i == (m1Var.f12133f == -1)) {
                addView(b17);
            } else {
                addView(b17, 0);
            }
        } else {
            if (this.f11872i == (m1Var.f12133f == -1)) {
                addDisappearingView(b17);
            } else {
                addDisappearingView(b17, 0);
            }
        }
        measureChildWithMargins(b17, 0, 0);
        l1Var.f12120a = this.f11869f.c(b17);
        if (this.f11867d == 1) {
            if (I()) {
                d17 = getWidth() - getPaddingRight();
                i27 = d17 - this.f11869f.d(b17);
            } else {
                i27 = getPaddingLeft();
                d17 = this.f11869f.d(b17) + i27;
            }
            if (m1Var.f12133f == -1) {
                int i28 = m1Var.f12129b;
                i19 = i28;
                i18 = d17;
                i17 = i28 - l1Var.f12120a;
            } else {
                int i29 = m1Var.f12129b;
                i17 = i29;
                i18 = d17;
                i19 = l1Var.f12120a + i29;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d18 = this.f11869f.d(b17) + paddingTop;
            if (m1Var.f12133f == -1) {
                int i37 = m1Var.f12129b;
                i18 = i37;
                i17 = paddingTop;
                i19 = d18;
                i27 = i37 - l1Var.f12120a;
            } else {
                int i38 = m1Var.f12129b;
                i17 = paddingTop;
                i18 = l1Var.f12120a + i38;
                i19 = d18;
                i27 = i38;
            }
        }
        layoutDecoratedWithMargins(b17, i27, i17, i18, i19);
        if (layoutParams.d() || layoutParams.c()) {
            l1Var.f12122c = true;
        }
        l1Var.f12123d = b17.hasFocusable();
    }

    public void K(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.k1 k1Var, int i17) {
    }

    public final void L(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.m1 m1Var) {
        if (!m1Var.f12128a || m1Var.f12138k) {
            return;
        }
        if (m1Var.f12133f != -1) {
            int i17 = m1Var.f12134g;
            if (i17 < 0) {
                return;
            }
            int childCount = getChildCount();
            if (!this.f11872i) {
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt = getChildAt(i18);
                    if (this.f11869f.b(childAt) > i17 || this.f11869f.n(childAt) > i17) {
                        M(z2Var, 0, i18);
                        return;
                    }
                }
                return;
            }
            int i19 = childCount - 1;
            for (int i27 = i19; i27 >= 0; i27--) {
                android.view.View childAt2 = getChildAt(i27);
                if (this.f11869f.b(childAt2) > i17 || this.f11869f.n(childAt2) > i17) {
                    M(z2Var, i19, i27);
                    return;
                }
            }
            return;
        }
        int i28 = m1Var.f12134g;
        int childCount2 = getChildCount();
        if (i28 < 0) {
            return;
        }
        int f17 = this.f11869f.f() - i28;
        if (this.f11872i) {
            for (int i29 = 0; i29 < childCount2; i29++) {
                android.view.View childAt3 = getChildAt(i29);
                if (this.f11869f.e(childAt3) < f17 || this.f11869f.o(childAt3) < f17) {
                    M(z2Var, 0, i29);
                    return;
                }
            }
            return;
        }
        int i37 = childCount2 - 1;
        for (int i38 = i37; i38 >= 0; i38--) {
            android.view.View childAt4 = getChildAt(i38);
            if (this.f11869f.e(childAt4) < f17 || this.f11869f.o(childAt4) < f17) {
                M(z2Var, i37, i38);
                return;
            }
        }
    }

    public final void M(androidx.recyclerview.widget.z2 z2Var, int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        if (i18 <= i17) {
            while (i17 > i18) {
                removeAndRecycleViewAt(i17, z2Var);
                i17--;
            }
        } else {
            for (int i19 = i18 - 1; i19 >= i17; i19--) {
                removeAndRecycleViewAt(i19, z2Var);
            }
        }
    }

    public final void N() {
        if (this.f11867d == 1 || !I()) {
            this.f11872i = this.f11871h;
        } else {
            this.f11872i = !this.f11871h;
        }
    }

    public int O(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0 || i17 == 0) {
            return 0;
        }
        this.f11868e.f12128a = true;
        r();
        int i18 = i17 > 0 ? 1 : -1;
        int abs = java.lang.Math.abs(i17);
        T(i18, abs, true, h3Var);
        androidx.recyclerview.widget.m1 m1Var = this.f11868e;
        int s17 = m1Var.f12134g + s(z2Var, m1Var, h3Var, false);
        if (s17 < 0) {
            return 0;
        }
        if (abs > s17) {
            i17 = i18 * s17;
        }
        this.f11869f.p(-i17);
        this.f11868e.f12136i = i17;
        return i17;
    }

    public void P(int i17, int i18) {
        this.f11875o = i17;
        this.f11876p = i18;
        androidx.recyclerview.widget.LinearLayoutManager.SavedState savedState = this.f11878r;
        if (savedState != null) {
            savedState.f11882d = -1;
        }
        requestLayout();
    }

    public void Q(int i17) {
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i17);
        }
        assertNotInLayoutOrScroll(null);
        if (i17 != this.f11867d || this.f11869f == null) {
            androidx.recyclerview.widget.w1 a17 = androidx.recyclerview.widget.w1.a(this, i17);
            this.f11869f = a17;
            this.f11879s.f12108a = a17;
            this.f11867d = i17;
            requestLayout();
        }
    }

    public void R(boolean z17) {
        assertNotInLayoutOrScroll(null);
        if (z17 == this.f11871h) {
            return;
        }
        this.f11871h = z17;
        requestLayout();
    }

    public void S(boolean z17) {
        assertNotInLayoutOrScroll(null);
        if (this.f11873m == z17) {
            return;
        }
        this.f11873m = z17;
        requestLayout();
    }

    public final void T(int i17, int i18, boolean z17, androidx.recyclerview.widget.h3 h3Var) {
        int k17;
        this.f11868e.f12138k = this.f11869f.i() == 0 && this.f11869f.f() == 0;
        this.f11868e.f12135h = G(h3Var);
        androidx.recyclerview.widget.m1 m1Var = this.f11868e;
        m1Var.f12133f = i17;
        if (i17 == 1) {
            m1Var.f12135h += this.f11869f.h();
            android.view.View E = E();
            androidx.recyclerview.widget.m1 m1Var2 = this.f11868e;
            m1Var2.f12132e = this.f11872i ? -1 : 1;
            int position = getPosition(E);
            androidx.recyclerview.widget.m1 m1Var3 = this.f11868e;
            m1Var2.f12131d = position + m1Var3.f12132e;
            m1Var3.f12129b = this.f11869f.b(E);
            k17 = this.f11869f.b(E) - this.f11869f.g();
        } else {
            android.view.View F = F();
            this.f11868e.f12135h += this.f11869f.k();
            androidx.recyclerview.widget.m1 m1Var4 = this.f11868e;
            m1Var4.f12132e = this.f11872i ? 1 : -1;
            int position2 = getPosition(F);
            androidx.recyclerview.widget.m1 m1Var5 = this.f11868e;
            m1Var4.f12131d = position2 + m1Var5.f12132e;
            m1Var5.f12129b = this.f11869f.e(F);
            k17 = (-this.f11869f.e(F)) + this.f11869f.k();
        }
        androidx.recyclerview.widget.m1 m1Var6 = this.f11868e;
        m1Var6.f12130c = i18;
        if (z17) {
            m1Var6.f12130c = i18 - k17;
        }
        m1Var6.f12134g = k17;
    }

    public final void U(int i17, int i18) {
        this.f11868e.f12130c = this.f11869f.g() - i18;
        androidx.recyclerview.widget.m1 m1Var = this.f11868e;
        m1Var.f12132e = this.f11872i ? -1 : 1;
        m1Var.f12131d = i17;
        m1Var.f12133f = 1;
        m1Var.f12129b = i18;
        m1Var.f12134g = Integer.MIN_VALUE;
    }

    public final void V(int i17, int i18) {
        this.f11868e.f12130c = i18 - this.f11869f.k();
        androidx.recyclerview.widget.m1 m1Var = this.f11868e;
        m1Var.f12131d = i17;
        m1Var.f12132e = this.f11872i ? 1 : -1;
        m1Var.f12133f = -1;
        m1Var.f12129b = i18;
        m1Var.f12134g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.f3
    public android.graphics.PointF a(int i17) {
        if (getChildCount() == 0) {
            return null;
        }
        int i18 = (i17 < getPosition(getChildAt(0))) != this.f11872i ? -1 : 1;
        return this.f11867d == 0 ? new android.graphics.PointF(i18, 0.0f) : new android.graphics.PointF(0.0f, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String str) {
        if (this.f11878r == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f11867d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.f11867d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i17, int i18, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.s2 s2Var) {
        if (this.f11867d != 0) {
            i17 = i18;
        }
        if (getChildCount() == 0 || i17 == 0) {
            return;
        }
        r();
        T(i17 > 0 ? 1 : -1, java.lang.Math.abs(i17), true, h3Var);
        m(h3Var, this.f11868e, s2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void collectInitialPrefetchPositions(int r7, androidx.recyclerview.widget.s2 r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f11878r
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f11882d
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f11884f
            goto L22
        L13:
            r6.N()
            boolean r0 = r6.f11872i
            int r4 = r6.f11875o
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.f11881u
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.p0 r2 = (androidx.recyclerview.widget.p0) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.collectInitialPrefetchPositions(int, androidx.recyclerview.widget.s2):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return n(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return p(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return n(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return p(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View findViewByPosition(int i17) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i17 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            android.view.View childAt = getChildAt(position);
            if (getPosition(childAt) == i17) {
                return childAt;
            }
        }
        return super.findViewByPosition(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void m(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.m1 m1Var, androidx.recyclerview.widget.s2 s2Var) {
        int i17 = m1Var.f12131d;
        if (i17 < 0 || i17 >= h3Var.b()) {
            return;
        }
        ((androidx.recyclerview.widget.p0) s2Var).a(i17, java.lang.Math.max(0, m1Var.f12134g));
    }

    public final int n(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        androidx.recyclerview.widget.w1 w1Var = this.f11869f;
        boolean z17 = this.f11874n;
        return androidx.recyclerview.widget.n3.a(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f11874n);
    }

    public final int o(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        androidx.recyclerview.widget.w1 w1Var = this.f11869f;
        boolean z17 = this.f11874n;
        return androidx.recyclerview.widget.n3.b(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f11874n, this.f11872i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
        if (this.f11877q) {
            removeAndRecycleAllViews(z2Var);
            z2Var.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View view, int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int q17;
        N();
        if (getChildCount() == 0 || (q17 = q(i17)) == Integer.MIN_VALUE) {
            return null;
        }
        r();
        r();
        T(q17, (int) (this.f11869f.l() * 0.33333334f), false, h3Var);
        androidx.recyclerview.widget.m1 m1Var = this.f11868e;
        m1Var.f12134g = Integer.MIN_VALUE;
        m1Var.f12128a = false;
        s(z2Var, m1Var, h3Var, true);
        android.view.View z17 = q17 == -1 ? this.f11872i ? z(getChildCount() - 1, -1) : z(0, getChildCount()) : this.f11872i ? z(0, getChildCount()) : z(getChildCount() - 1, -1);
        android.view.View F = q17 == -1 ? F() : E();
        if (!F.hasFocusable()) {
            return z17;
        }
        if (z17 == null) {
            return null;
        }
        return F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(w());
            accessibilityEvent.setToIndex(y());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0267  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.z2 r19, androidx.recyclerview.widget.h3 r20) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        this.f11878r = null;
        this.f11875o = -1;
        this.f11876p = Integer.MIN_VALUE;
        this.f11879s.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof androidx.recyclerview.widget.LinearLayoutManager.SavedState) {
            this.f11878r = (androidx.recyclerview.widget.LinearLayoutManager.SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
        androidx.recyclerview.widget.LinearLayoutManager.SavedState savedState = this.f11878r;
        if (savedState != null) {
            return new androidx.recyclerview.widget.LinearLayoutManager.SavedState(savedState);
        }
        androidx.recyclerview.widget.LinearLayoutManager.SavedState savedState2 = new androidx.recyclerview.widget.LinearLayoutManager.SavedState();
        if (getChildCount() > 0) {
            r();
            boolean z17 = this.f11870g ^ this.f11872i;
            savedState2.f11884f = z17;
            if (z17) {
                android.view.View E = E();
                savedState2.f11883e = this.f11869f.g() - this.f11869f.b(E);
                savedState2.f11882d = getPosition(E);
            } else {
                android.view.View F = F();
                savedState2.f11882d = getPosition(F);
                savedState2.f11883e = this.f11869f.e(F) - this.f11869f.k();
            }
        } else {
            savedState2.f11882d = -1;
        }
        return savedState2;
    }

    public final int p(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        androidx.recyclerview.widget.w1 w1Var = this.f11869f;
        boolean z17 = this.f11874n;
        return androidx.recyclerview.widget.n3.c(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f11874n);
    }

    public int q(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 17 ? i17 != 33 ? i17 != 66 ? (i17 == 130 && this.f11867d == 1) ? 1 : Integer.MIN_VALUE : this.f11867d == 0 ? 1 : Integer.MIN_VALUE : this.f11867d == 1 ? -1 : Integer.MIN_VALUE : this.f11867d == 0 ? -1 : Integer.MIN_VALUE : (this.f11867d != 1 && I()) ? -1 : 1 : (this.f11867d != 1 && I()) ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        if (this.f11868e == null) {
            this.f11868e = new androidx.recyclerview.widget.m1();
        }
    }

    public int s(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.m1 m1Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int i17 = m1Var.f12130c;
        int i18 = m1Var.f12134g;
        if (i18 != Integer.MIN_VALUE) {
            if (i17 < 0) {
                m1Var.f12134g = i18 + i17;
            }
            L(z2Var, m1Var);
        }
        int i19 = m1Var.f12130c + m1Var.f12135h;
        while (true) {
            if (!m1Var.f12138k && i19 <= 0) {
                break;
            }
            int i27 = m1Var.f12131d;
            if (!(i27 >= 0 && i27 < h3Var.b())) {
                break;
            }
            androidx.recyclerview.widget.l1 l1Var = this.f11880t;
            l1Var.f12120a = 0;
            l1Var.f12121b = false;
            l1Var.f12122c = false;
            l1Var.f12123d = false;
            J(z2Var, h3Var, m1Var, l1Var);
            if (!l1Var.f12121b) {
                int i28 = m1Var.f12129b;
                int i29 = l1Var.f12120a;
                m1Var.f12129b = i28 + (m1Var.f12133f * i29);
                if (!l1Var.f12122c || this.f11868e.f12137j != null || !h3Var.f12065g) {
                    m1Var.f12130c -= i29;
                    i19 -= i29;
                }
                int i37 = m1Var.f12134g;
                if (i37 != Integer.MIN_VALUE) {
                    int i38 = i37 + i29;
                    m1Var.f12134g = i38;
                    int i39 = m1Var.f12130c;
                    if (i39 < 0) {
                        m1Var.f12134g = i38 + i39;
                    }
                    L(z2Var, m1Var);
                }
                if (z17 && l1Var.f12123d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i17 - m1Var.f12130c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f11867d == 1) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f11875o = i17;
        this.f11876p = Integer.MIN_VALUE;
        androidx.recyclerview.widget.LinearLayoutManager.SavedState savedState = this.f11878r;
        if (savedState != null) {
            savedState.f11882d = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f11867d == 0) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        androidx.recyclerview.widget.o1 o1Var = new androidx.recyclerview.widget.o1(recyclerView.getContext());
        o1Var.f12049a = i17;
        startSmoothScroll(o1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.f11878r == null && this.f11870g == this.f11873m;
    }

    public int t() {
        android.view.View A = A(0, getChildCount(), true, false);
        if (A == null) {
            return -1;
        }
        return getPosition(A);
    }

    public final android.view.View u(boolean z17, boolean z18) {
        return this.f11872i ? A(0, getChildCount(), z17, z18) : A(getChildCount() - 1, -1, z17, z18);
    }

    public final android.view.View v(boolean z17, boolean z18) {
        return this.f11872i ? A(getChildCount() - 1, -1, z17, z18) : A(0, getChildCount(), z17, z18);
    }

    public int w() {
        android.view.View A = A(0, getChildCount(), false, true);
        if (A == null) {
            return -1;
        }
        return getPosition(A);
    }

    public int x() {
        android.view.View A = A(getChildCount() - 1, -1, true, false);
        if (A == null) {
            return -1;
        }
        return getPosition(A);
    }

    public int y() {
        android.view.View A = A(getChildCount() - 1, -1, false, true);
        if (A == null) {
            return -1;
        }
        return getPosition(A);
    }

    public android.view.View z(int i17, int i18) {
        int i19;
        int i27;
        r();
        if ((i18 > i17 ? (char) 1 : i18 < i17 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i17);
        }
        if (this.f11869f.e(getChildAt(i17)) < this.f11869f.k()) {
            i19 = 16644;
            i27 = 16388;
        } else {
            i19 = 4161;
            i27 = 4097;
        }
        return this.f11867d == 0 ? this.mHorizontalBoundCheck.a(i17, i18, i19, i27) : this.mVerticalBoundCheck.a(i17, i18, i19, i27);
    }

    public LinearLayoutManager(android.content.Context context, int i17, boolean z17) {
        this.f11867d = 1;
        this.f11871h = false;
        this.f11872i = false;
        this.f11873m = false;
        this.f11874n = true;
        this.f11875o = -1;
        this.f11876p = Integer.MIN_VALUE;
        this.f11878r = null;
        this.f11879s = new androidx.recyclerview.widget.k1();
        this.f11880t = new androidx.recyclerview.widget.l1();
        this.f11881u = 2;
        Q(i17);
        R(z17);
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.SavedState> CREATOR = new androidx.recyclerview.widget.n1();

        /* renamed from: d, reason: collision with root package name */
        public int f11882d;

        /* renamed from: e, reason: collision with root package name */
        public int f11883e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11884f;

        public SavedState(android.os.Parcel parcel) {
            this.f11882d = parcel.readInt();
            this.f11883e = parcel.readInt();
            this.f11884f = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f11882d);
            parcel.writeInt(this.f11883e);
            parcel.writeInt(this.f11884f ? 1 : 0);
        }

        public SavedState(androidx.recyclerview.widget.LinearLayoutManager.SavedState savedState) {
            this.f11882d = savedState.f11882d;
            this.f11883e = savedState.f11883e;
            this.f11884f = savedState.f11884f;
        }
    }

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f11867d = 1;
        this.f11871h = false;
        this.f11872i = false;
        this.f11873m = false;
        this.f11874n = true;
        this.f11875o = -1;
        this.f11876p = Integer.MIN_VALUE;
        this.f11878r = null;
        this.f11879s = new androidx.recyclerview.widget.k1();
        this.f11880t = new androidx.recyclerview.widget.l1();
        this.f11881u = 2;
        androidx.recyclerview.widget.t2 properties = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(context, attributeSet, i17, i18);
        Q(properties.f12227a);
        R(properties.f12229c);
        S(properties.f12230d);
    }
}
