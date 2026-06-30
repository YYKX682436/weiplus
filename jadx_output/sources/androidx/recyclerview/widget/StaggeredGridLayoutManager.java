package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.f3 {
    public boolean A;
    public final boolean B;
    public int[] C;
    public final java.lang.Runnable D;

    /* renamed from: d, reason: collision with root package name */
    public int f11920d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.x3[] f11921e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f11922f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f11923g;

    /* renamed from: h, reason: collision with root package name */
    public int f11924h;

    /* renamed from: i, reason: collision with root package name */
    public int f11925i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.j1 f11926m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11927n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11928o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.BitSet f11929p;

    /* renamed from: q, reason: collision with root package name */
    public int f11930q;

    /* renamed from: r, reason: collision with root package name */
    public int f11931r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.v3 f11932s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11933t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11934u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11935v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState f11936w;

    /* renamed from: x, reason: collision with root package name */
    public int f11937x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f11938y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.recyclerview.widget.t3 f11939z;

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public androidx.recyclerview.widget.x3 f11940h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f11941i;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            androidx.recyclerview.widget.x3 x3Var = this.f11940h;
            if (x3Var == null) {
                return -1;
            }
            return x3Var.f12280e;
        }
    }

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f11920d = -1;
        this.f11927n = false;
        this.f11928o = false;
        this.f11930q = -1;
        this.f11931r = Integer.MIN_VALUE;
        this.f11932s = new androidx.recyclerview.widget.v3();
        this.f11933t = 2;
        this.f11938y = new android.graphics.Rect();
        this.f11939z = new androidx.recyclerview.widget.t3(this);
        this.A = false;
        this.B = true;
        this.D = new androidx.recyclerview.widget.s3(this);
        androidx.recyclerview.widget.t2 properties = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(context, attributeSet, i17, i18);
        int i19 = properties.f12227a;
        if (i19 != 0 && i19 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i19 != this.f11924h) {
            this.f11924h = i19;
            androidx.recyclerview.widget.w1 w1Var = this.f11922f;
            this.f11922f = this.f11923g;
            this.f11923g = w1Var;
            requestLayout();
        }
        Q(properties.f12228b);
        boolean z17 = properties.f12229c;
        assertNotInLayoutOrScroll(null);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.f11936w;
        if (savedState != null && savedState.f11953n != z17) {
            savedState.f11953n = z17;
        }
        this.f11927n = z17;
        requestLayout();
        this.f11926m = new androidx.recyclerview.widget.j1();
        this.f11922f = androidx.recyclerview.widget.w1.a(this, this.f11924h);
        this.f11923g = androidx.recyclerview.widget.w1.a(this, 1 - this.f11924h);
    }

    public final int A(int i17) {
        int i18 = this.f11921e[0].i(i17);
        for (int i19 = 1; i19 < this.f11920d; i19++) {
            int i27 = this.f11921e[i19].i(i17);
            if (i27 > i18) {
                i18 = i27;
            }
        }
        return i18;
    }

    public final int B(int i17) {
        int l17 = this.f11921e[0].l(i17);
        for (int i18 = 1; i18 < this.f11920d; i18++) {
            int l18 = this.f11921e[i18].l(i17);
            if (l18 < l17) {
                l17 = l18;
            }
        }
        return l17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f11928o
            if (r0 == 0) goto L9
            int r0 = r7.z()
            goto Ld
        L9:
            int r0 = r7.y()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.v3 r4 = r7.f11932s
            r4.f(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.h(r8, r5)
            r4.g(r9, r5)
            goto L39
        L32:
            r4.h(r8, r9)
            goto L39
        L36:
            r4.g(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f11928o
            if (r8 == 0) goto L45
            int r8 = r7.y()
            goto L49
        L45:
            int r8 = r7.z()
        L49:
            if (r3 > r8) goto L4e
            r7.requestLayout()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        if (r11 == r12) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r11 == r12) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View D() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D():android.view.View");
    }

    public boolean E() {
        return getLayoutDirection() == 1;
    }

    public final void F(android.view.View view, int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f11938y;
        calculateItemDecorationsForChild(view, rect);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        int U = U(i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int U2 = U(i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (z17 ? shouldReMeasureChild(view, U, U2, layoutParams) : shouldMeasureChild(view, U, U2, layoutParams)) {
            view.measure(U, U2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0420, code lost:
    
        if (n() != false) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.recyclerview.widget.z2 r17, androidx.recyclerview.widget.h3 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3, boolean):void");
    }

    public final boolean H(int i17) {
        if (this.f11924h == 0) {
            return (i17 == -1) != this.f11928o;
        }
        return ((i17 == -1) == this.f11928o) == E();
    }

    public void I(int i17, androidx.recyclerview.widget.h3 h3Var) {
        int y17;
        int i18;
        if (i17 > 0) {
            y17 = z();
            i18 = 1;
        } else {
            y17 = y();
            i18 = -1;
        }
        androidx.recyclerview.widget.j1 j1Var = this.f11926m;
        j1Var.f12084a = true;
        S(y17, h3Var);
        P(i18);
        j1Var.f12086c = y17 + j1Var.f12087d;
        j1Var.f12085b = java.lang.Math.abs(i17);
    }

    public final void J(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.j1 j1Var) {
        if (!j1Var.f12084a || j1Var.f12092i) {
            return;
        }
        if (j1Var.f12085b == 0) {
            if (j1Var.f12088e == -1) {
                K(z2Var, j1Var.f12090g);
                return;
            } else {
                L(z2Var, j1Var.f12089f);
                return;
            }
        }
        int i17 = 1;
        if (j1Var.f12088e == -1) {
            int i18 = j1Var.f12089f;
            int l17 = this.f11921e[0].l(i18);
            while (i17 < this.f11920d) {
                int l18 = this.f11921e[i17].l(i18);
                if (l18 > l17) {
                    l17 = l18;
                }
                i17++;
            }
            int i19 = i18 - l17;
            K(z2Var, i19 < 0 ? j1Var.f12090g : j1Var.f12090g - java.lang.Math.min(i19, j1Var.f12085b));
            return;
        }
        int i27 = j1Var.f12090g;
        int i28 = this.f11921e[0].i(i27);
        while (i17 < this.f11920d) {
            int i29 = this.f11921e[i17].i(i27);
            if (i29 < i28) {
                i28 = i29;
            }
            i17++;
        }
        int i37 = i28 - j1Var.f12090g;
        L(z2Var, i37 < 0 ? j1Var.f12089f : java.lang.Math.min(i37, j1Var.f12085b) + j1Var.f12089f);
    }

    public final void K(androidx.recyclerview.widget.z2 z2Var, int i17) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (this.f11922f.e(childAt) < i17 || this.f11922f.o(childAt) < i17) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f11941i) {
                for (int i18 = 0; i18 < this.f11920d; i18++) {
                    if (this.f11921e[i18].f12276a.size() == 1) {
                        return;
                    }
                }
                for (int i19 = 0; i19 < this.f11920d; i19++) {
                    this.f11921e[i19].m();
                }
            } else if (layoutParams.f11940h.f12276a.size() == 1) {
                return;
            } else {
                layoutParams.f11940h.m();
            }
            removeAndRecycleView(childAt, z2Var);
        }
    }

    public final void L(androidx.recyclerview.widget.z2 z2Var, int i17) {
        while (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            if (this.f11922f.b(childAt) > i17 || this.f11922f.n(childAt) > i17) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f11941i) {
                for (int i18 = 0; i18 < this.f11920d; i18++) {
                    if (this.f11921e[i18].f12276a.size() == 1) {
                        return;
                    }
                }
                for (int i19 = 0; i19 < this.f11920d; i19++) {
                    this.f11921e[i19].n();
                }
            } else if (layoutParams.f11940h.f12276a.size() == 1) {
                return;
            } else {
                layoutParams.f11940h.n();
            }
            removeAndRecycleView(childAt, z2Var);
        }
    }

    public final void M() {
        if (this.f11924h == 1 || !E()) {
            this.f11928o = this.f11927n;
        } else {
            this.f11928o = !this.f11927n;
        }
    }

    public int N(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0 || i17 == 0) {
            return 0;
        }
        I(i17, h3Var);
        androidx.recyclerview.widget.j1 j1Var = this.f11926m;
        int r17 = r(z2Var, j1Var, h3Var);
        if (j1Var.f12085b >= r17) {
            i17 = i17 < 0 ? -r17 : r17;
        }
        this.f11922f.p(-i17);
        this.f11934u = this.f11928o;
        j1Var.f12085b = 0;
        J(z2Var, j1Var);
        return i17;
    }

    public void O(int i17, int i18) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.f11936w;
        if (savedState != null) {
            savedState.f11949g = null;
            savedState.f11948f = 0;
            savedState.f11946d = -1;
            savedState.f11947e = -1;
        }
        this.f11930q = i17;
        this.f11931r = i18;
        requestLayout();
    }

    public final void P(int i17) {
        androidx.recyclerview.widget.j1 j1Var = this.f11926m;
        j1Var.f12088e = i17;
        j1Var.f12087d = this.f11928o != (i17 == -1) ? -1 : 1;
    }

    public void Q(int i17) {
        assertNotInLayoutOrScroll(null);
        if (i17 != this.f11920d) {
            androidx.recyclerview.widget.v3 v3Var = this.f11932s;
            int[] iArr = v3Var.f12250a;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            v3Var.f12251b = null;
            requestLayout();
            this.f11920d = i17;
            this.f11929p = new java.util.BitSet(this.f11920d);
            this.f11921e = new androidx.recyclerview.widget.x3[this.f11920d];
            for (int i18 = 0; i18 < this.f11920d; i18++) {
                this.f11921e[i18] = new androidx.recyclerview.widget.x3(this, i18);
            }
            requestLayout();
        }
    }

    public final void R(int i17, int i18) {
        for (int i19 = 0; i19 < this.f11920d; i19++) {
            if (!this.f11921e[i19].f12276a.isEmpty()) {
                T(this.f11921e[i19], i17, i18);
            }
        }
    }

    public final void S(int i17, androidx.recyclerview.widget.h3 h3Var) {
        int i18;
        int i19;
        int i27;
        androidx.recyclerview.widget.j1 j1Var = this.f11926m;
        boolean z17 = false;
        j1Var.f12085b = 0;
        j1Var.f12086c = i17;
        if (!isSmoothScrolling() || (i27 = h3Var.f12059a) == -1) {
            i18 = 0;
            i19 = 0;
        } else {
            if (this.f11928o == (i27 < i17)) {
                i18 = this.f11922f.l();
                i19 = 0;
            } else {
                i19 = this.f11922f.l();
                i18 = 0;
            }
        }
        if (getClipToPadding()) {
            j1Var.f12089f = this.f11922f.k() - i19;
            j1Var.f12090g = this.f11922f.g() + i18;
        } else {
            j1Var.f12090g = this.f11922f.f() + i18;
            j1Var.f12089f = -i19;
        }
        j1Var.f12091h = false;
        j1Var.f12084a = true;
        if (this.f11922f.i() == 0 && this.f11922f.f() == 0) {
            z17 = true;
        }
        j1Var.f12092i = z17;
    }

    public final void T(androidx.recyclerview.widget.x3 x3Var, int i17, int i18) {
        int i19 = x3Var.f12279d;
        int i27 = x3Var.f12280e;
        if (i17 == -1) {
            int i28 = x3Var.f12277b;
            if (i28 == Integer.MIN_VALUE) {
                x3Var.c();
                i28 = x3Var.f12277b;
            }
            if (i28 + i19 <= i18) {
                this.f11929p.set(i27, false);
                return;
            }
            return;
        }
        int i29 = x3Var.f12278c;
        if (i29 == Integer.MIN_VALUE) {
            x3Var.b();
            i29 = x3Var.f12278c;
        }
        if (i29 - i19 >= i18) {
            this.f11929p.set(i27, false);
        }
    }

    public final int U(int i17, int i18, int i19) {
        if (i18 == 0 && i19 == 0) {
            return i17;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i17) - i18) - i19), mode) : i17;
    }

    @Override // androidx.recyclerview.widget.f3
    public android.graphics.PointF a(int i17) {
        int m17 = m(i17);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (m17 == 0) {
            return null;
        }
        if (this.f11924h == 0) {
            pointF.x = m17;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m17;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String str) {
        if (this.f11936w == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f11924h == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.f11924h == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i17, int i18, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.s2 s2Var) {
        androidx.recyclerview.widget.j1 j1Var;
        int i19;
        int i27;
        if (this.f11924h != 0) {
            i17 = i18;
        }
        if (getChildCount() == 0 || i17 == 0) {
            return;
        }
        I(i17, h3Var);
        int[] iArr = this.C;
        if (iArr == null || iArr.length < this.f11920d) {
            this.C = new int[this.f11920d];
        }
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int i37 = this.f11920d;
            j1Var = this.f11926m;
            if (i28 >= i37) {
                break;
            }
            if (j1Var.f12087d == -1) {
                i19 = j1Var.f12089f;
                i27 = this.f11921e[i28].l(i19);
            } else {
                i19 = this.f11921e[i28].i(j1Var.f12090g);
                i27 = j1Var.f12090g;
            }
            int i38 = i19 - i27;
            if (i38 >= 0) {
                this.C[i29] = i38;
                i29++;
            }
            i28++;
        }
        java.util.Arrays.sort(this.C, 0, i29);
        for (int i39 = 0; i39 < i29; i39++) {
            int i47 = j1Var.f12086c;
            if (!(i47 >= 0 && i47 < h3Var.b())) {
                return;
            }
            ((androidx.recyclerview.widget.p0) s2Var).a(j1Var.f12086c, this.C[i39]);
            j1Var.f12086c += j1Var.f12087d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return p(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return q(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return p(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return q(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f11924h == 0 ? new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(-2, -1) : new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return this.f11924h == 1 ? this.f11920d : super.getColumnCountForAccessibility(z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return this.f11924h == 0 ? this.f11920d : super.getRowCountForAccessibility(z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.f11933t != 0;
    }

    public final int m(int i17) {
        if (getChildCount() == 0) {
            return this.f11928o ? 1 : -1;
        }
        return (i17 < y()) != this.f11928o ? -1 : 1;
    }

    public boolean n() {
        int y17;
        int z17;
        if (getChildCount() == 0 || this.f11933t == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f11928o) {
            y17 = z();
            z17 = y();
        } else {
            y17 = y();
            z17 = z();
        }
        androidx.recyclerview.widget.v3 v3Var = this.f11932s;
        if (y17 == 0 && D() != null) {
            int[] iArr = v3Var.f12250a;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            v3Var.f12251b = null;
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.A) {
            return false;
        }
        int i17 = this.f11928o ? -1 : 1;
        int i18 = z17 + 1;
        androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem d17 = v3Var.d(y17, i18, i17, true);
        if (d17 == null) {
            this.A = false;
            v3Var.c(i18);
            return false;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem d18 = v3Var.d(y17, d17.f11942d, i17 * (-1), true);
        if (d18 == null) {
            v3Var.c(d17.f11942d);
        } else {
            v3Var.c(d18.f11942d + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final int o(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        androidx.recyclerview.widget.w1 w1Var = this.f11922f;
        boolean z17 = this.B;
        return androidx.recyclerview.widget.n3.a(h3Var, w1Var, t(!z17), s(!z17), this, this.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i17) {
        super.offsetChildrenHorizontal(i17);
        for (int i18 = 0; i18 < this.f11920d; i18++) {
            androidx.recyclerview.widget.x3 x3Var = this.f11921e[i18];
            int i19 = x3Var.f12277b;
            if (i19 != Integer.MIN_VALUE) {
                x3Var.f12277b = i19 + i17;
            }
            int i27 = x3Var.f12278c;
            if (i27 != Integer.MIN_VALUE) {
                x3Var.f12278c = i27 + i17;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i17) {
        super.offsetChildrenVertical(i17);
        for (int i18 = 0; i18 < this.f11920d; i18++) {
            androidx.recyclerview.widget.x3 x3Var = this.f11921e[i18];
            int i19 = x3Var.f12277b;
            if (i19 != Integer.MIN_VALUE) {
                x3Var.f12277b = i19 + i17;
            }
            int i27 = x3Var.f12278c;
            if (i27 != Integer.MIN_VALUE) {
                x3Var.f12278c = i27 + i17;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
        removeCallbacks(this.D);
        for (int i17 = 0; i17 < this.f11920d; i17++) {
            this.f11921e[i17].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x003b, code lost:
    
        if (r9.f11924h == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0041, code lost:
    
        if (r9.f11924h == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x004d, code lost:
    
        if (E() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0059, code lost:
    
        if (E() == false) goto L30;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r10, int r11, androidx.recyclerview.widget.z2 r12, androidx.recyclerview.widget.h3 r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            android.view.View t17 = t(false);
            android.view.View s17 = s(false);
            if (t17 == null || s17 == null) {
                return;
            }
            int position = getPosition(t17);
            int position2 = getPosition(s17);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, android.view.View view, o3.l lVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, lVar);
            return;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams;
        if (this.f11924h == 0) {
            int e17 = layoutParams2.e();
            boolean z17 = layoutParams2.f11941i;
            lVar.o(o3.k.a(e17, z17 ? this.f11920d : 1, -1, -1, z17, false));
        } else {
            int e18 = layoutParams2.e();
            boolean z18 = layoutParams2.f11941i;
            lVar.o(o3.k.a(-1, -1, e18, z18 ? this.f11920d : 1, z18, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        C(i17, i18, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.v3 v3Var = this.f11932s;
        int[] iArr = v3Var.f12250a;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        v3Var.f12251b = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        C(i17, i18, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        C(i17, i18, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.Object obj) {
        C(i17, i18, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        G(z2Var, h3Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        this.f11930q = -1;
        this.f11931r = Integer.MIN_VALUE;
        this.f11936w = null;
        this.f11939z.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) {
            this.f11936w = (androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
        int l17;
        int k17;
        int[] iArr;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.f11936w;
        if (savedState != null) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState(savedState);
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState2 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState();
        savedState2.f11953n = this.f11927n;
        savedState2.f11954o = this.f11934u;
        savedState2.f11955p = this.f11935v;
        androidx.recyclerview.widget.v3 v3Var = this.f11932s;
        if (v3Var == null || (iArr = v3Var.f12250a) == null) {
            savedState2.f11950h = 0;
        } else {
            savedState2.f11951i = iArr;
            savedState2.f11950h = iArr.length;
            savedState2.f11952m = v3Var.f12251b;
        }
        if (getChildCount() > 0) {
            savedState2.f11946d = this.f11934u ? z() : y();
            android.view.View s17 = this.f11928o ? s(true) : t(true);
            savedState2.f11947e = s17 != null ? getPosition(s17) : -1;
            int i17 = this.f11920d;
            savedState2.f11948f = i17;
            savedState2.f11949g = new int[i17];
            for (int i18 = 0; i18 < this.f11920d; i18++) {
                if (this.f11934u) {
                    l17 = this.f11921e[i18].i(Integer.MIN_VALUE);
                    if (l17 != Integer.MIN_VALUE) {
                        k17 = this.f11922f.g();
                        l17 -= k17;
                        savedState2.f11949g[i18] = l17;
                    } else {
                        savedState2.f11949g[i18] = l17;
                    }
                } else {
                    l17 = this.f11921e[i18].l(Integer.MIN_VALUE);
                    if (l17 != Integer.MIN_VALUE) {
                        k17 = this.f11922f.k();
                        l17 -= k17;
                        savedState2.f11949g[i18] = l17;
                    } else {
                        savedState2.f11949g[i18] = l17;
                    }
                }
            }
        } else {
            savedState2.f11946d = -1;
            savedState2.f11947e = -1;
            savedState2.f11948f = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i17) {
        if (i17 == 0) {
            n();
        }
    }

    public final int p(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        androidx.recyclerview.widget.w1 w1Var = this.f11922f;
        boolean z17 = this.B;
        return androidx.recyclerview.widget.n3.b(h3Var, w1Var, t(!z17), s(!z17), this, this.B, this.f11928o);
    }

    public final int q(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        androidx.recyclerview.widget.w1 w1Var = this.f11922f;
        boolean z17 = this.B;
        return androidx.recyclerview.widget.n3.c(h3Var, w1Var, t(!z17), s(!z17), this, this.B);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(androidx.recyclerview.widget.z2 r21, androidx.recyclerview.widget.j1 r22, androidx.recyclerview.widget.h3 r23) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.j1, androidx.recyclerview.widget.h3):int");
    }

    public android.view.View s(boolean z17) {
        int k17 = this.f11922f.k();
        int g17 = this.f11922f.g();
        android.view.View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            int e17 = this.f11922f.e(childAt);
            int b17 = this.f11922f.b(childAt);
            if (b17 > k17 && e17 < g17) {
                if (b17 <= g17 || !z17) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return N(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.f11936w;
        if (savedState != null && savedState.f11946d != i17) {
            savedState.f11949g = null;
            savedState.f11948f = 0;
            savedState.f11946d = -1;
            savedState.f11947e = -1;
        }
        this.f11930q = i17;
        this.f11931r = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return N(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect rect, int i17, int i18) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f11924h == 1) {
            chooseSize2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i18, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i17, (this.f11925i * this.f11920d) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i17, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i18, (this.f11925i * this.f11920d) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        androidx.recyclerview.widget.o1 o1Var = new androidx.recyclerview.widget.o1(recyclerView.getContext());
        o1Var.f12049a = i17;
        startSmoothScroll(o1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.f11936w == null;
    }

    public android.view.View t(boolean z17) {
        int k17 = this.f11922f.k();
        int g17 = this.f11922f.g();
        int childCount = getChildCount();
        android.view.View view = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            int e17 = this.f11922f.e(childAt);
            if (this.f11922f.b(childAt) > k17 && e17 < g17) {
                if (e17 >= k17 || !z17) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int[] u(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f11920d];
        } else if (iArr.length < this.f11920d) {
            throw new java.lang.IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f11920d + ", array size:" + iArr.length);
        }
        for (int i17 = 0; i17 < this.f11920d; i17++) {
            androidx.recyclerview.widget.x3 x3Var = this.f11921e[i17];
            iArr[i17] = x3Var.f12281f.f11927n ? x3Var.h(r4.size() - 1, -1, false) : x3Var.h(0, x3Var.f12276a.size(), false);
        }
        return iArr;
    }

    public int[] v(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f11920d];
        } else if (iArr.length < this.f11920d) {
            throw new java.lang.IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f11920d + ", array size:" + iArr.length);
        }
        for (int i17 = 0; i17 < this.f11920d; i17++) {
            androidx.recyclerview.widget.x3 x3Var = this.f11921e[i17];
            iArr[i17] = x3Var.f12281f.f11927n ? x3Var.h(0, x3Var.f12276a.size(), false) : x3Var.h(r4.size() - 1, -1, false);
        }
        return iArr;
    }

    public final void w(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int g17;
        int A = A(Integer.MIN_VALUE);
        if (A != Integer.MIN_VALUE && (g17 = this.f11922f.g() - A) > 0) {
            int i17 = g17 - (-N(-g17, z2Var, h3Var));
            if (!z17 || i17 <= 0) {
                return;
            }
            this.f11922f.p(i17);
        }
    }

    public final void x(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int k17;
        int B = B(Integer.MAX_VALUE);
        if (B != Integer.MAX_VALUE && (k17 = B - this.f11922f.k()) > 0) {
            int N = k17 - N(k17, z2Var, h3Var);
            if (!z17 || N <= 0) {
                return;
            }
            this.f11922f.p(-N);
        }
    }

    public int y() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int z() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(layoutParams);
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState> CREATOR = new androidx.recyclerview.widget.w3();

        /* renamed from: d, reason: collision with root package name */
        public int f11946d;

        /* renamed from: e, reason: collision with root package name */
        public int f11947e;

        /* renamed from: f, reason: collision with root package name */
        public int f11948f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f11949g;

        /* renamed from: h, reason: collision with root package name */
        public int f11950h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f11951i;

        /* renamed from: m, reason: collision with root package name */
        public java.util.List f11952m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f11953n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f11954o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f11955p;

        public SavedState(android.os.Parcel parcel) {
            this.f11946d = parcel.readInt();
            this.f11947e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f11948f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f11949g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f11950h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f11951i = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f11953n = parcel.readInt() == 1;
            this.f11954o = parcel.readInt() == 1;
            this.f11955p = parcel.readInt() == 1;
            this.f11952m = parcel.readArrayList(androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f11946d);
            parcel.writeInt(this.f11947e);
            parcel.writeInt(this.f11948f);
            if (this.f11948f > 0) {
                parcel.writeIntArray(this.f11949g);
            }
            parcel.writeInt(this.f11950h);
            if (this.f11950h > 0) {
                parcel.writeIntArray(this.f11951i);
            }
            parcel.writeInt(this.f11953n ? 1 : 0);
            parcel.writeInt(this.f11954o ? 1 : 0);
            parcel.writeInt(this.f11955p ? 1 : 0);
            parcel.writeList(this.f11952m);
        }

        public SavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState) {
            this.f11948f = savedState.f11948f;
            this.f11946d = savedState.f11946d;
            this.f11947e = savedState.f11947e;
            this.f11949g = savedState.f11949g;
            this.f11950h = savedState.f11950h;
            this.f11951i = savedState.f11951i;
            this.f11953n = savedState.f11953n;
            this.f11954o = savedState.f11954o;
            this.f11955p = savedState.f11955p;
            this.f11952m = savedState.f11952m;
        }
    }

    public StaggeredGridLayoutManager(int i17, int i18) {
        this.f11920d = -1;
        this.f11927n = false;
        this.f11928o = false;
        this.f11930q = -1;
        this.f11931r = Integer.MIN_VALUE;
        this.f11932s = new androidx.recyclerview.widget.v3();
        this.f11933t = 2;
        this.f11938y = new android.graphics.Rect();
        this.f11939z = new androidx.recyclerview.widget.t3(this);
        this.A = false;
        this.B = true;
        this.D = new androidx.recyclerview.widget.s3(this);
        this.f11924h = i18;
        Q(i17);
        this.f11926m = new androidx.recyclerview.widget.j1();
        this.f11922f = androidx.recyclerview.widget.w1.a(this, this.f11924h);
        this.f11923g = androidx.recyclerview.widget.w1.a(this, 1 - this.f11924h);
    }
}
