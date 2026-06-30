package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public final android.util.SparseIntArray A;
    public androidx.recyclerview.widget.t0 B;
    public final android.graphics.Rect C;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11860v;

    /* renamed from: w, reason: collision with root package name */
    public int f11861w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f11862x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View[] f11863y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.SparseIntArray f11864z;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f11860v = false;
        this.f11861w = -1;
        this.f11864z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new androidx.recyclerview.widget.s0();
        this.C = new android.graphics.Rect();
        c0(androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(context, attributeSet, i17, i18).f12228b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (position >= 0 && position < i19 && Z(z2Var, h3Var, position) == 0) {
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void J(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.m1 m1Var, androidx.recyclerview.widget.l1 l1Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        int i49;
        int i57;
        int i58;
        int i59;
        int childMeasureSpec;
        int i66;
        android.view.View b17;
        int j17 = this.f11869f.j();
        boolean z17 = j17 != 1073741824;
        int i67 = getChildCount() > 0 ? this.f11862x[this.f11861w] : 0;
        if (z17) {
            d0();
        }
        boolean z18 = m1Var.f12132e == 1;
        int i68 = this.f11861w;
        if (!z18) {
            i68 = Z(z2Var, h3Var, m1Var.f12131d) + a0(z2Var, h3Var, m1Var.f12131d);
        }
        int i69 = 0;
        while (i69 < this.f11861w) {
            int i76 = m1Var.f12131d;
            if (!(i76 >= 0 && i76 < h3Var.b()) || i68 <= 0) {
                break;
            }
            int i77 = m1Var.f12131d;
            int a07 = a0(z2Var, h3Var, i77);
            if (a07 > this.f11861w) {
                throw new java.lang.IllegalArgumentException("Item at position " + i77 + " requires " + a07 + " spans but GridLayoutManager has only " + this.f11861w + " spans.");
            }
            i68 -= a07;
            if (i68 < 0 || (b17 = m1Var.b(z2Var)) == null) {
                break;
            }
            this.f11863y[i69] = b17;
            i69++;
        }
        if (i69 == 0) {
            l1Var.f12121b = true;
            return;
        }
        if (z18) {
            i17 = 0;
            i18 = 0;
            i27 = 1;
            i19 = i69;
        } else {
            i17 = i69 - 1;
            i18 = 0;
            i19 = -1;
            i27 = -1;
        }
        while (i17 != i19) {
            android.view.View view = this.f11863y[i17];
            androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
            int a08 = a0(z2Var, h3Var, getPosition(view));
            layoutParams.f11866i = a08;
            layoutParams.f11865h = i18;
            i18 += a08;
            i17 += i27;
        }
        float f17 = 0.0f;
        int i78 = 0;
        for (int i79 = 0; i79 < i69; i79++) {
            android.view.View view2 = this.f11863y[i79];
            if (m1Var.f12137j == null) {
                if (z18) {
                    addView(view2);
                } else {
                    addView(view2, 0);
                }
            } else if (z18) {
                addDisappearingView(view2);
            } else {
                addDisappearingView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.C);
            b0(view2, j17, false);
            int c17 = this.f11869f.c(view2);
            if (c17 > i78) {
                i78 = c17;
            }
            float d17 = (this.f11869f.d(view2) * 1.0f) / ((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view2.getLayoutParams()).f11866i;
            if (d17 > f17) {
                f17 = d17;
            }
        }
        if (z17) {
            W(java.lang.Math.max(java.lang.Math.round(f17 * this.f11861w), i67));
            i78 = 0;
            for (int i86 = 0; i86 < i69; i86++) {
                android.view.View view3 = this.f11863y[i86];
                b0(view3, 1073741824, true);
                int c18 = this.f11869f.c(view3);
                if (c18 > i78) {
                    i78 = c18;
                }
            }
        }
        for (int i87 = 0; i87 < i69; i87++) {
            android.view.View view4 = this.f11863y[i87];
            if (this.f11869f.c(view4) != i78) {
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view4.getLayoutParams();
                android.graphics.Rect rect = layoutParams2.f11916e;
                int i88 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i89 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int X = X(layoutParams2.f11865h, layoutParams2.f11866i);
                if (this.f11867d == 1) {
                    i66 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(X, 1073741824, i89, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    childMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i78 - i88, 1073741824);
                } else {
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i78 - i89, 1073741824);
                    childMeasureSpec = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(X, 1073741824, i88, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    i66 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i66, childMeasureSpec, (androidx.recyclerview.widget.RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i66, childMeasureSpec);
                }
            }
        }
        l1Var.f12120a = i78;
        if (this.f11867d == 1) {
            if (m1Var.f12133f == -1) {
                i47 = m1Var.f12129b;
                i59 = i47 - i78;
            } else {
                i59 = m1Var.f12129b;
                i47 = i59 + i78;
            }
            i38 = i59;
            i39 = 0;
            i37 = 0;
        } else {
            if (m1Var.f12133f == -1) {
                i29 = m1Var.f12129b;
                i28 = i29 - i78;
            } else {
                i28 = m1Var.f12129b;
                i29 = i28 + i78;
            }
            i37 = i28;
            i38 = 0;
            i39 = i29;
            i47 = 0;
        }
        int i96 = 0;
        while (i96 < i69) {
            android.view.View view5 = this.f11863y[i96];
            androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view5.getLayoutParams();
            if (this.f11867d != 1) {
                i38 = this.f11862x[layoutParams3.f11865h] + getPaddingTop();
                i47 = this.f11869f.d(view5) + i38;
            } else if (I()) {
                i39 = getPaddingLeft() + this.f11862x[this.f11861w - layoutParams3.f11865h];
                i37 = i39 - this.f11869f.d(view5);
            } else {
                int paddingLeft = getPaddingLeft() + this.f11862x[layoutParams3.f11865h];
                i58 = i47;
                i48 = paddingLeft;
                i49 = i38;
                i57 = this.f11869f.d(view5) + paddingLeft;
                layoutDecoratedWithMargins(view5, i48, i49, i57, i58);
                if (!layoutParams3.d() || layoutParams3.c()) {
                    l1Var.f12122c = true;
                }
                l1Var.f12123d |= view5.hasFocusable();
                i96++;
                i47 = i58;
                i39 = i57;
                i38 = i49;
                i37 = i48;
            }
            i58 = i47;
            i57 = i39;
            i49 = i38;
            i48 = i37;
            layoutDecoratedWithMargins(view5, i48, i49, i57, i58);
            if (!layoutParams3.d()) {
            }
            l1Var.f12122c = true;
            l1Var.f12123d |= view5.hasFocusable();
            i96++;
            i47 = i58;
            i39 = i57;
            i38 = i49;
            i37 = i48;
        }
        java.util.Arrays.fill(this.f11863y, (java.lang.Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void K(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.k1 k1Var, int i17) {
        d0();
        if (h3Var.b() > 0 && !h3Var.f12065g) {
            boolean z17 = i17 == 1;
            int Z = Z(z2Var, h3Var, k1Var.f12109b);
            if (z17) {
                while (Z > 0) {
                    int i18 = k1Var.f12109b;
                    if (i18 <= 0) {
                        break;
                    }
                    int i19 = i18 - 1;
                    k1Var.f12109b = i19;
                    Z = Z(z2Var, h3Var, i19);
                }
            } else {
                int b17 = h3Var.b() - 1;
                int i27 = k1Var.f12109b;
                while (i27 < b17) {
                    int i28 = i27 + 1;
                    int Z2 = Z(z2Var, h3Var, i28);
                    if (Z2 <= Z) {
                        break;
                    }
                    i27 = i28;
                    Z = Z2;
                }
                k1Var.f12109b = i27;
            }
        }
        android.view.View[] viewArr = this.f11863y;
        if (viewArr == null || viewArr.length != this.f11861w) {
            this.f11863y = new android.view.View[this.f11861w];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void S(boolean z17) {
        if (z17) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.S(false);
    }

    public final void W(int i17) {
        int i18;
        int[] iArr = this.f11862x;
        int i19 = this.f11861w;
        if (iArr == null || iArr.length != i19 + 1 || iArr[iArr.length - 1] != i17) {
            iArr = new int[i19 + 1];
        }
        int i27 = 0;
        iArr[0] = 0;
        int i28 = i17 / i19;
        int i29 = i17 % i19;
        int i37 = 0;
        for (int i38 = 1; i38 <= i19; i38++) {
            i27 += i29;
            if (i27 <= 0 || i19 - i27 >= i29) {
                i18 = i28;
            } else {
                i18 = i28 + 1;
                i27 -= i19;
            }
            i37 += i18;
            iArr[i38] = i37;
        }
        this.f11862x = iArr;
    }

    public int X(int i17, int i18) {
        if (this.f11867d != 1 || !I()) {
            int[] iArr = this.f11862x;
            return iArr[i18 + i17] - iArr[i17];
        }
        int[] iArr2 = this.f11862x;
        int i19 = this.f11861w;
        return iArr2[i19 - i17] - iArr2[(i19 - i17) - i18];
    }

    public final int Y(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (!h3Var.f12065g) {
            return this.B.a(i17, this.f11861w);
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 0;
        }
        return this.B.a(d17, this.f11861w);
    }

    public final int Z(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (!h3Var.f12065g) {
            androidx.recyclerview.widget.t0 t0Var = this.B;
            int i18 = this.f11861w;
            if (!t0Var.f12225b) {
                return t0Var.b(i17, i18);
            }
            android.util.SparseIntArray sparseIntArray = t0Var.f12224a;
            int i19 = sparseIntArray.get(i17, -1);
            if (i19 != -1) {
                return i19;
            }
            int b17 = t0Var.b(i17, i18);
            sparseIntArray.put(i17, b17);
            return b17;
        }
        int i27 = this.A.get(i17, -1);
        if (i27 != -1) {
            return i27;
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 0;
        }
        androidx.recyclerview.widget.t0 t0Var2 = this.B;
        int i28 = this.f11861w;
        if (!t0Var2.f12225b) {
            return t0Var2.b(d17, i28);
        }
        android.util.SparseIntArray sparseIntArray2 = t0Var2.f12224a;
        int i29 = sparseIntArray2.get(d17, -1);
        if (i29 != -1) {
            return i29;
        }
        int b18 = t0Var2.b(d17, i28);
        sparseIntArray2.put(d17, b18);
        return b18;
    }

    public final int a0(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (!h3Var.f12065g) {
            return this.B.c(i17);
        }
        int i18 = this.f11864z.get(i17, -1);
        if (i18 != -1) {
            return i18;
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 1;
        }
        return this.B.c(d17);
    }

    public final void b0(android.view.View view, int i17, boolean z17) {
        int i18;
        int i19;
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect = layoutParams.f11916e;
        int i27 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i28 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int X = X(layoutParams.f11865h, layoutParams.f11866i);
        if (this.f11867d == 1) {
            i19 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(X, i17, i28, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i18 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(this.f11869f.l(), getHeightMode(), i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(X, i17, i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(this.f11869f.l(), getWidthMode(), i28, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i18 = childMeasureSpec;
            i19 = childMeasureSpec2;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z17 ? shouldReMeasureChild(view, i19, i18, layoutParams2) : shouldMeasureChild(view, i19, i18, layoutParams2)) {
            view.measure(i19, i18);
        }
    }

    public void c0(int i17) {
        if (i17 == this.f11861w) {
            return;
        }
        this.f11860v = true;
        if (i17 < 1) {
            throw new java.lang.IllegalArgumentException("Span count should be at least 1. Provided " + i17);
        }
        this.f11861w = i17;
        this.B.d();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams;
    }

    public final void d0() {
        int height;
        int paddingTop;
        if (this.f11867d == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        W(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f11867d == 0 ? new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(-2, -1) : new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f11867d == 1) {
            return this.f11861w;
        }
        if (h3Var.b() < 1) {
            return 0;
        }
        return Y(z2Var, h3Var, h3Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f11867d == 0) {
            return this.f11861w;
        }
        if (h3Var.b() < 1) {
            return 0;
        }
        return Y(z2Var, h3Var, h3Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void m(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.m1 m1Var, androidx.recyclerview.widget.s2 s2Var) {
        int i17 = this.f11861w;
        for (int i18 = 0; i18 < this.f11861w; i18++) {
            int i19 = m1Var.f12131d;
            if (!(i19 >= 0 && i19 < h3Var.b()) || i17 <= 0) {
                return;
            }
            int i27 = m1Var.f12131d;
            ((androidx.recyclerview.widget.p0) s2Var).a(i27, java.lang.Math.max(0, m1Var.f12134g));
            i17 -= this.B.c(i27);
            m1Var.f12131d += m1Var.f12132e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.z2 r26, androidx.recyclerview.widget.h3 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, android.view.View view, o3.l lVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, lVar);
            return;
        }
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams;
        int Y = Y(z2Var, h3Var, layoutParams2.b());
        if (this.f11867d == 0) {
            int i17 = layoutParams2.f11865h;
            int i18 = layoutParams2.f11866i;
            int i19 = this.f11861w;
            lVar.o(o3.k.a(i17, i18, Y, 1, i19 > 1 && i18 == i19, false));
            return;
        }
        int i27 = layoutParams2.f11865h;
        int i28 = layoutParams2.f11866i;
        int i29 = this.f11861w;
        lVar.o(o3.k.a(Y, 1, i27, i28, i29 > 1 && i28 == i29, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.B.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.B.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        this.B.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.B.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.Object obj) {
        this.B.d();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        boolean z17 = h3Var.f12065g;
        android.util.SparseIntArray sparseIntArray = this.A;
        android.util.SparseIntArray sparseIntArray2 = this.f11864z;
        if (z17) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) getChildAt(i17).getLayoutParams();
                int b17 = layoutParams.b();
                sparseIntArray2.put(b17, layoutParams.f11866i);
                sparseIntArray.put(b17, layoutParams.f11865h);
            }
        }
        super.onLayoutChildren(z2Var, h3Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        this.f11860v = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        d0();
        android.view.View[] viewArr = this.f11863y;
        if (viewArr == null || viewArr.length != this.f11861w) {
            this.f11863y = new android.view.View[this.f11861w];
        }
        return super.scrollHorizontallyBy(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        d0();
        android.view.View[] viewArr = this.f11863y;
        if (viewArr == null || viewArr.length != this.f11861w) {
            this.f11863y = new android.view.View[this.f11861w];
        }
        return super.scrollVerticallyBy(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect rect, int i17, int i18) {
        int chooseSize;
        int chooseSize2;
        if (this.f11862x == null) {
            super.setMeasuredDimension(rect, i17, i18);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f11867d == 1) {
            chooseSize2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i18, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f11862x;
            chooseSize = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i17, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i17, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f11862x;
            chooseSize2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i18, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.f11878r == null && !this.f11860v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(layoutParams);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public int f11865h;

        /* renamed from: i, reason: collision with root package name */
        public int f11866i;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11865h = -1;
            this.f11866i = 0;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f11865h = -1;
            this.f11866i = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11865h = -1;
            this.f11866i = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11865h = -1;
            this.f11866i = 0;
        }
    }

    public GridLayoutManager(android.content.Context context, int i17) {
        super(context);
        this.f11860v = false;
        this.f11861w = -1;
        this.f11864z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new androidx.recyclerview.widget.s0();
        this.C = new android.graphics.Rect();
        c0(i17);
    }

    public GridLayoutManager(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i18, z17);
        this.f11860v = false;
        this.f11861w = -1;
        this.f11864z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new androidx.recyclerview.widget.s0();
        this.C = new android.graphics.Rect();
        c0(i17);
    }
}
