package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class FlexboxLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements com.google.android.flexbox.a, androidx.recyclerview.widget.f3 {
    public static final android.graphics.Rect F = new android.graphics.Rect();
    public final android.util.SparseArray A;
    public final android.content.Context B;
    public android.view.View C;
    public int D;
    public final com.google.android.flexbox.d E;

    /* renamed from: d, reason: collision with root package name */
    public int f44199d;

    /* renamed from: e, reason: collision with root package name */
    public int f44200e;

    /* renamed from: f, reason: collision with root package name */
    public int f44201f;

    /* renamed from: g, reason: collision with root package name */
    public int f44202g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44203h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44204i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44205m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f44206n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.flexbox.f f44207o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.z2 f44208p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.h3 f44209q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.android.flexbox.k f44210r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.flexbox.i f44211s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f44212t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f44213u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.flexbox.FlexboxLayoutManager.SavedState f44214v;

    /* renamed from: w, reason: collision with root package name */
    public int f44215w;

    /* renamed from: x, reason: collision with root package name */
    public int f44216x;

    /* renamed from: y, reason: collision with root package name */
    public int f44217y;

    /* renamed from: z, reason: collision with root package name */
    public int f44218z;

    public FlexboxLayoutManager(android.content.Context context) {
        this(context, 0, 1);
    }

    public static boolean isMeasurementUpToDate(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (i19 > 0 && i17 != i19) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i17;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i17;
        }
        return true;
    }

    private boolean shouldMeasureChild(android.view.View view, int i17, int i18, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final int A(int i17) {
        int i18;
        if (getChildCount() == 0 || i17 == 0) {
            return 0;
        }
        p();
        boolean l17 = l();
        android.view.View view = this.C;
        int width = l17 ? view.getWidth() : view.getHeight();
        int width2 = l17 ? getWidth() : getHeight();
        boolean z17 = getLayoutDirection() == 1;
        com.google.android.flexbox.i iVar = this.f44211s;
        if (z17) {
            int abs = java.lang.Math.abs(i17);
            if (i17 < 0) {
                return -java.lang.Math.min((width2 + iVar.f44260d) - width, abs);
            }
            i18 = iVar.f44260d;
            if (i18 + i17 <= 0) {
                return i17;
            }
        } else {
            if (i17 > 0) {
                return java.lang.Math.min((width2 - iVar.f44260d) - width, i17);
            }
            i18 = iVar.f44260d;
            if (i18 + i17 >= 0) {
                return i17;
            }
        }
        return -i18;
    }

    public final void B(androidx.recyclerview.widget.z2 z2Var, com.google.android.flexbox.k kVar) {
        int childCount;
        android.view.View childAt;
        int i17;
        int childCount2;
        int i18;
        android.view.View childAt2;
        int i19;
        if (kVar.f44274j) {
            int i27 = kVar.f44273i;
            int i28 = -1;
            com.google.android.flexbox.f fVar = this.f44207o;
            if (i27 == -1) {
                if (kVar.f44270f < 0 || (childCount2 = getChildCount()) == 0 || (childAt2 = getChildAt(childCount2 - 1)) == null || (i19 = fVar.f44254c[getPosition(childAt2)]) == -1) {
                    return;
                }
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44206n.get(i19);
                int i29 = i18;
                while (true) {
                    if (i29 < 0) {
                        break;
                    }
                    android.view.View childAt3 = getChildAt(i29);
                    if (childAt3 != null) {
                        int i37 = kVar.f44270f;
                        if (!(l() || !this.f44204i ? this.f44212t.e(childAt3) >= this.f44212t.f() - i37 : this.f44212t.b(childAt3) <= i37)) {
                            break;
                        }
                        if (bVar.f44244o != getPosition(childAt3)) {
                            continue;
                        } else if (i19 <= 0) {
                            childCount2 = i29;
                            break;
                        } else {
                            i19 += kVar.f44273i;
                            bVar = (com.google.android.flexbox.b) this.f44206n.get(i19);
                            childCount2 = i29;
                        }
                    }
                    i29--;
                }
                while (i18 >= childCount2) {
                    removeAndRecycleViewAt(i18, z2Var);
                    i18--;
                }
                return;
            }
            if (kVar.f44270f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null || (i17 = fVar.f44254c[getPosition(childAt)]) == -1) {
                return;
            }
            com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) this.f44206n.get(i17);
            int i38 = 0;
            while (true) {
                if (i38 >= childCount) {
                    break;
                }
                android.view.View childAt4 = getChildAt(i38);
                if (childAt4 != null) {
                    int i39 = kVar.f44270f;
                    if (!(l() || !this.f44204i ? this.f44212t.b(childAt4) <= i39 : this.f44212t.f() - this.f44212t.e(childAt4) <= i39)) {
                        break;
                    }
                    if (bVar2.f44245p != getPosition(childAt4)) {
                        continue;
                    } else if (i17 >= this.f44206n.size() - 1) {
                        i28 = i38;
                        break;
                    } else {
                        i17 += kVar.f44273i;
                        bVar2 = (com.google.android.flexbox.b) this.f44206n.get(i17);
                        i28 = i38;
                    }
                }
                i38++;
            }
            while (i28 >= 0) {
                removeAndRecycleViewAt(i28, z2Var);
                i28--;
            }
        }
    }

    public final void C() {
        int heightMode = l() ? getHeightMode() : getWidthMode();
        this.f44210r.f44266b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public void D(int i17) {
        int i18 = this.f44202g;
        if (i18 != i17) {
            if (i18 == 4 || i17 == 4) {
                removeAllViews();
                this.f44206n.clear();
                com.google.android.flexbox.i iVar = this.f44211s;
                com.google.android.flexbox.i.b(iVar);
                iVar.f44260d = 0;
            }
            this.f44202g = i17;
            requestLayout();
        }
    }

    public void E(int i17) {
        if (this.f44199d != i17) {
            removeAllViews();
            this.f44199d = i17;
            this.f44212t = null;
            this.f44213u = null;
            this.f44206n.clear();
            com.google.android.flexbox.i iVar = this.f44211s;
            com.google.android.flexbox.i.b(iVar);
            iVar.f44260d = 0;
            requestLayout();
        }
    }

    public void F(int i17) {
        if (i17 == 2) {
            throw new java.lang.UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i18 = this.f44200e;
        if (i18 != i17) {
            if (i18 == 0 || i17 == 0) {
                removeAllViews();
                this.f44206n.clear();
                com.google.android.flexbox.i iVar = this.f44211s;
                com.google.android.flexbox.i.b(iVar);
                iVar.f44260d = 0;
            }
            this.f44200e = i17;
            this.f44212t = null;
            this.f44213u = null;
            requestLayout();
        }
    }

    public final void G(int i17) {
        android.view.View v17 = v(getChildCount() - 1, -1, false);
        if (i17 >= (v17 != null ? getPosition(v17) : -1)) {
            return;
        }
        int childCount = getChildCount();
        com.google.android.flexbox.f fVar = this.f44207o;
        fVar.j(childCount);
        fVar.k(childCount);
        fVar.i(childCount);
        if (i17 >= fVar.f44254c.length) {
            return;
        }
        this.D = i17;
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f44215w = getPosition(childAt);
        if (l() || !this.f44204i) {
            this.f44216x = this.f44212t.e(childAt) - this.f44212t.k();
        } else {
            this.f44216x = this.f44212t.b(childAt) + this.f44212t.h();
        }
    }

    public final void H(com.google.android.flexbox.i iVar, boolean z17, boolean z18) {
        int i17;
        if (z18) {
            C();
        } else {
            this.f44210r.f44266b = false;
        }
        if (l() || !this.f44204i) {
            this.f44210r.f44265a = this.f44212t.g() - iVar.f44259c;
        } else {
            this.f44210r.f44265a = iVar.f44259c - getPaddingRight();
        }
        com.google.android.flexbox.k kVar = this.f44210r;
        kVar.f44268d = iVar.f44257a;
        kVar.f44272h = 1;
        kVar.f44273i = 1;
        kVar.f44269e = iVar.f44259c;
        kVar.f44270f = Integer.MIN_VALUE;
        kVar.f44267c = iVar.f44258b;
        if (!z17 || this.f44206n.size() <= 1 || (i17 = iVar.f44258b) < 0 || i17 >= this.f44206n.size() - 1) {
            return;
        }
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44206n.get(iVar.f44258b);
        com.google.android.flexbox.k kVar2 = this.f44210r;
        kVar2.f44267c++;
        kVar2.f44268d += bVar.f44237h;
    }

    public final void I(com.google.android.flexbox.i iVar, boolean z17, boolean z18) {
        if (z18) {
            C();
        } else {
            this.f44210r.f44266b = false;
        }
        if (l() || !this.f44204i) {
            this.f44210r.f44265a = iVar.f44259c - this.f44212t.k();
        } else {
            this.f44210r.f44265a = (this.C.getWidth() - iVar.f44259c) - this.f44212t.k();
        }
        com.google.android.flexbox.k kVar = this.f44210r;
        kVar.f44268d = iVar.f44257a;
        kVar.f44272h = 1;
        kVar.f44273i = -1;
        kVar.f44269e = iVar.f44259c;
        kVar.f44270f = Integer.MIN_VALUE;
        int i17 = iVar.f44258b;
        kVar.f44267c = i17;
        if (!z17 || i17 <= 0) {
            return;
        }
        int size = this.f44206n.size();
        int i18 = iVar.f44258b;
        if (size > i18) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44206n.get(i18);
            r4.f44267c--;
            this.f44210r.f44268d -= bVar.f44237h;
        }
    }

    @Override // androidx.recyclerview.widget.f3
    public android.graphics.PointF a(int i17) {
        android.view.View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i18 = i17 < getPosition(childAt) ? -1 : 1;
        return l() ? new android.graphics.PointF(0.0f, i18) : new android.graphics.PointF(i18, 0.0f);
    }

    @Override // com.google.android.flexbox.a
    public void b(android.view.View view, int i17, int i18, com.google.android.flexbox.b bVar) {
        calculateItemDecorationsForChild(view, F);
        if (l()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            bVar.f44234e += leftDecorationWidth;
            bVar.f44235f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            bVar.f44234e += topDecorationHeight;
            bVar.f44235f += topDecorationHeight;
        }
    }

    @Override // com.google.android.flexbox.a
    public android.view.View c(int i17) {
        android.view.View view = (android.view.View) this.A.get(i17);
        return view != null ? view : this.f44208p.f(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f44200e == 0) {
            return l();
        }
        if (l()) {
            int width = getWidth();
            android.view.View view = this.C;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        if (this.f44200e == 0) {
            return !l();
        }
        if (l()) {
            return true;
        }
        int height = getHeight();
        android.view.View view = this.C;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.flexbox.FlexboxLayoutManager.LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return m(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return n(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        return m(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return n(h3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        return o(h3Var);
    }

    @Override // com.google.android.flexbox.a
    public int d(int i17, int i18, int i19) {
        return androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i18, i19, getF123307r());
    }

    @Override // com.google.android.flexbox.a
    public int e(android.view.View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (l()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.a
    public android.view.View f(int i17) {
        return c(i17);
    }

    @Override // com.google.android.flexbox.a
    public int g(android.view.View view, int i17, int i18) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (l()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f44202g;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f44199d;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.f44209q.b();
    }

    @Override // com.google.android.flexbox.a
    public java.util.List getFlexLinesInternal() {
        return this.f44206n;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f44200e;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.f44206n.size() == 0) {
            return 0;
        }
        int size = this.f44206n.size();
        int i17 = Integer.MIN_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            i17 = java.lang.Math.max(i17, ((com.google.android.flexbox.b) this.f44206n.get(i18)).f44234e);
        }
        return i17;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f44203h;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f44206n.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 += ((com.google.android.flexbox.b) this.f44206n.get(i18)).f44236g;
        }
        return i17;
    }

    @Override // com.google.android.flexbox.a
    public int h(int i17, int i18, int i19) {
        return androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i18, i19, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.a
    public void i(com.google.android.flexbox.b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.flexbox.a
    public void j(int i17, android.view.View view) {
        this.A.put(i17, view);
    }

    @Override // com.google.android.flexbox.a
    public boolean l() {
        int i17 = this.f44199d;
        return i17 == 0 || i17 == 1;
    }

    public final int m(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        p();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() == 0 || r17 == null || t17 == null) {
            return 0;
        }
        return java.lang.Math.min(this.f44212t.l(), this.f44212t.b(t17) - this.f44212t.e(r17));
    }

    public final int n(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() != 0 && r17 != null && t17 != null) {
            int position = getPosition(r17);
            int position2 = getPosition(t17);
            int abs = java.lang.Math.abs(this.f44212t.b(t17) - this.f44212t.e(r17));
            int i17 = this.f44207o.f44254c[position];
            if (i17 != 0 && i17 != -1) {
                return java.lang.Math.round((i17 * (abs / ((r4[position2] - i17) + 1))) + (this.f44212t.k() - this.f44212t.e(r17)));
            }
        }
        return 0;
    }

    public final int o(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() == 0 || r17 == null || t17 == null) {
            return 0;
        }
        android.view.View v17 = v(0, getChildCount(), false);
        int position = v17 == null ? -1 : getPosition(v17);
        return (int) ((java.lang.Math.abs(this.f44212t.b(t17) - this.f44212t.e(r17)) / (((v(getChildCount() - 1, -1, false) != null ? getPosition(r1) : -1) - position) + 1)) * h3Var.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(androidx.recyclerview.widget.f2 f2Var, androidx.recyclerview.widget.f2 f2Var2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.C = (android.view.View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        super.onItemsAdded(recyclerView, i17, i18);
        G(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        super.onItemsMoved(recyclerView, i17, i18, i19);
        G(java.lang.Math.min(i17, i18));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        super.onItemsRemoved(recyclerView, i17, i18);
        G(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.Object obj) {
        super.onItemsUpdated(recyclerView, i17, i18, obj);
        G(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0280  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.z2 r22, androidx.recyclerview.widget.h3 r23) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        this.f44214v = null;
        this.f44215w = -1;
        this.f44216x = Integer.MIN_VALUE;
        this.D = -1;
        com.google.android.flexbox.i.b(this.f44211s);
        this.A.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.flexbox.FlexboxLayoutManager.SavedState) {
            this.f44214v = (com.google.android.flexbox.FlexboxLayoutManager.SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState = this.f44214v;
        if (savedState != null) {
            return new com.google.android.flexbox.FlexboxLayoutManager.SavedState(savedState, (com.google.android.flexbox.h) null);
        }
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState2 = new com.google.android.flexbox.FlexboxLayoutManager.SavedState();
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            savedState2.f44228d = getPosition(childAt);
            savedState2.f44229e = this.f44212t.e(childAt) - this.f44212t.k();
        } else {
            savedState2.f44228d = -1;
        }
        return savedState2;
    }

    public final void p() {
        if (this.f44212t != null) {
            return;
        }
        if (l()) {
            if (this.f44200e == 0) {
                this.f44212t = new androidx.recyclerview.widget.u1(this);
                this.f44213u = new androidx.recyclerview.widget.v1(this);
                return;
            } else {
                this.f44212t = new androidx.recyclerview.widget.v1(this);
                this.f44213u = new androidx.recyclerview.widget.u1(this);
                return;
            }
        }
        if (this.f44200e == 0) {
            this.f44212t = new androidx.recyclerview.widget.v1(this);
            this.f44213u = new androidx.recyclerview.widget.u1(this);
        } else {
            this.f44212t = new androidx.recyclerview.widget.u1(this);
            this.f44213u = new androidx.recyclerview.widget.v1(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x042d, code lost:
    
        r26 = r3;
        r1 = r34.f44265a - r8;
        r34.f44265a = r1;
        r3 = r34.f44270f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0438, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x043a, code lost:
    
        r3 = r3 + r8;
        r34.f44270f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x043d, code lost:
    
        if (r1 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x043f, code lost:
    
        r34.f44270f = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0442, code lost:
    
        B(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x044b, code lost:
    
        return r26 - r34.f44265a;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(androidx.recyclerview.widget.z2 r32, androidx.recyclerview.widget.h3 r33, com.google.android.flexbox.k r34) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.q(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3, com.google.android.flexbox.k):int");
    }

    public final android.view.View r(int i17) {
        android.view.View w17 = w(0, getChildCount(), i17);
        if (w17 == null) {
            return null;
        }
        int i18 = this.f44207o.f44254c[getPosition(w17)];
        if (i18 == -1) {
            return null;
        }
        return s(w17, (com.google.android.flexbox.b) this.f44206n.get(i18));
    }

    public final android.view.View s(android.view.View view, com.google.android.flexbox.b bVar) {
        boolean l17 = l();
        int i17 = bVar.f44237h;
        for (int i18 = 1; i18 < i17; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f44204i || l17) {
                    if (this.f44212t.e(view) <= this.f44212t.e(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f44212t.b(view) >= this.f44212t.b(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (!l() || this.f44200e == 0) {
            int z17 = z(i17, z2Var, h3Var);
            this.A.clear();
            return z17;
        }
        int A = A(i17);
        this.f44211s.f44260d += A;
        this.f44213u.p(-A);
        return A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f44215w = i17;
        this.f44216x = Integer.MIN_VALUE;
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState = this.f44214v;
        if (savedState != null) {
            savedState.f44228d = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (l() || (this.f44200e == 0 && !l())) {
            int z17 = z(i17, z2Var, h3Var);
            this.A.clear();
            return z17;
        }
        int A = A(i17);
        this.f44211s.f44260d += A;
        this.f44213u.p(-A);
        return A;
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(java.util.List list) {
        this.f44206n = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        androidx.recyclerview.widget.o1 o1Var = new androidx.recyclerview.widget.o1(recyclerView.getContext());
        o1Var.f12049a = i17;
        startSmoothScroll(o1Var);
    }

    public final android.view.View t(int i17) {
        android.view.View w17 = w(getChildCount() - 1, -1, i17);
        if (w17 == null) {
            return null;
        }
        return u(w17, (com.google.android.flexbox.b) this.f44206n.get(this.f44207o.f44254c[getPosition(w17)]));
    }

    public final android.view.View u(android.view.View view, com.google.android.flexbox.b bVar) {
        boolean l17 = l();
        int childCount = (getChildCount() - bVar.f44237h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            android.view.View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f44204i || l17) {
                    if (this.f44212t.b(view) >= this.f44212t.b(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f44212t.e(view) <= this.f44212t.e(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final android.view.View v(int i17, int i18, boolean z17) {
        int i19 = i17;
        int i27 = i18 > i19 ? 1 : -1;
        while (i19 != i18) {
            android.view.View childAt = getChildAt(i19);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z18 = false;
            boolean z19 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z27 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z28 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z29 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (!z17 ? !(!z27 || !z29) : !(!z19 || !z28)) {
                z18 = true;
            }
            if (z18) {
                return childAt;
            }
            i19 += i27;
        }
        return null;
    }

    public final android.view.View w(int i17, int i18, int i19) {
        int position;
        p();
        android.view.View view = null;
        if (this.f44210r == null) {
            this.f44210r = new com.google.android.flexbox.k(null);
        }
        int k17 = this.f44212t.k();
        int g17 = this.f44212t.g();
        int i27 = i18 > i17 ? 1 : -1;
        android.view.View view2 = null;
        while (i17 != i18) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i19) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f44212t.e(childAt) >= k17 && this.f44212t.b(childAt) <= g17) {
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

    public final int x(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int i18;
        int g17;
        if (!l() && this.f44204i) {
            int k17 = i17 - this.f44212t.k();
            if (k17 <= 0) {
                return 0;
            }
            i18 = z(k17, z2Var, h3Var);
        } else {
            int g18 = this.f44212t.g() - i17;
            if (g18 <= 0) {
                return 0;
            }
            i18 = -z(-g18, z2Var, h3Var);
        }
        int i19 = i17 + i18;
        if (!z17 || (g17 = this.f44212t.g() - i19) <= 0) {
            return i18;
        }
        this.f44212t.p(g17);
        return g17 + i18;
    }

    public final int y(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, boolean z17) {
        int i18;
        int k17;
        if (l() || !this.f44204i) {
            int k18 = i17 - this.f44212t.k();
            if (k18 <= 0) {
                return 0;
            }
            i18 = -z(k18, z2Var, h3Var);
        } else {
            int g17 = this.f44212t.g() - i17;
            if (g17 <= 0) {
                return 0;
            }
            i18 = z(-g17, z2Var, h3Var);
        }
        int i19 = i17 + i18;
        if (!z17 || (k17 = i19 - this.f44212t.k()) <= 0) {
            return i18;
        }
        this.f44212t.p(-k17);
        return i18 - k17;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(int r19, androidx.recyclerview.widget.z2 r20, androidx.recyclerview.widget.h3 r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.z(int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):int");
    }

    public FlexboxLayoutManager(android.content.Context context, int i17, int i18) {
        this.f44203h = -1;
        this.f44206n = new java.util.ArrayList();
        this.f44207o = new com.google.android.flexbox.f(this);
        this.f44211s = new com.google.android.flexbox.i(this, null);
        this.f44215w = -1;
        this.f44216x = Integer.MIN_VALUE;
        this.f44217y = Integer.MIN_VALUE;
        this.f44218z = Integer.MIN_VALUE;
        this.A = new android.util.SparseArray();
        this.D = -1;
        this.E = new com.google.android.flexbox.d();
        E(i17);
        F(i18);
        D(4);
        this.B = context;
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.flexbox.FlexboxLayoutManager.SavedState> CREATOR = new com.google.android.flexbox.l();

        /* renamed from: d, reason: collision with root package name */
        public int f44228d;

        /* renamed from: e, reason: collision with root package name */
        public int f44229e;

        public SavedState(android.os.Parcel parcel, com.google.android.flexbox.h hVar) {
            this.f44228d = parcel.readInt();
            this.f44229e = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "SavedState{mAnchorPosition=" + this.f44228d + ", mAnchorOffset=" + this.f44229e + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f44228d);
            parcel.writeInt(this.f44229e);
        }

        public SavedState(com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState, com.google.android.flexbox.h hVar) {
            this.f44228d = savedState.f44228d;
            this.f44229e = savedState.f44229e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        super.onItemsUpdated(recyclerView, i17, i18);
        G(i17);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams implements com.google.android.flexbox.FlexItem {
        public static final android.os.Parcelable.Creator<com.google.android.flexbox.FlexboxLayoutManager.LayoutParams> CREATOR = new com.google.android.flexbox.j();

        /* renamed from: h, reason: collision with root package name */
        public final float f44219h;

        /* renamed from: i, reason: collision with root package name */
        public final float f44220i;

        /* renamed from: m, reason: collision with root package name */
        public final int f44221m;

        /* renamed from: n, reason: collision with root package name */
        public final float f44222n;

        /* renamed from: o, reason: collision with root package name */
        public int f44223o;

        /* renamed from: p, reason: collision with root package name */
        public int f44224p;

        /* renamed from: q, reason: collision with root package name */
        public final int f44225q;

        /* renamed from: r, reason: collision with root package name */
        public final int f44226r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f44227s;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44219h = 0.0f;
            this.f44220i = 1.0f;
            this.f44221m = -1;
            this.f44222n = -1.0f;
            this.f44225q = 16777215;
            this.f44226r = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void A1(int i17) {
            this.f44223o = i17;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float M0() {
            return this.f44222n;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean V0() {
            return this.f44227s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.f44221m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.f44219h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.f44220i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f44226r;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f44225q;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.f44224p;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.f44223o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i17) {
            this.f44224p = i17;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeFloat(this.f44219h);
            parcel.writeFloat(this.f44220i);
            parcel.writeInt(this.f44221m);
            parcel.writeFloat(this.f44222n);
            parcel.writeInt(this.f44223o);
            parcel.writeInt(this.f44224p);
            parcel.writeInt(this.f44225q);
            parcel.writeInt(this.f44226r);
            parcel.writeByte(this.f44227s ? (byte) 1 : (byte) 0);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f44219h = 0.0f;
            this.f44220i = 1.0f;
            this.f44221m = -1;
            this.f44222n = -1.0f;
            this.f44225q = 16777215;
            this.f44226r = 16777215;
        }

        public LayoutParams(android.os.Parcel parcel) {
            super(-2, -2);
            this.f44219h = 0.0f;
            this.f44220i = 1.0f;
            this.f44221m = -1;
            this.f44222n = -1.0f;
            this.f44225q = 16777215;
            this.f44226r = 16777215;
            this.f44219h = parcel.readFloat();
            this.f44220i = parcel.readFloat();
            this.f44221m = parcel.readInt();
            this.f44222n = parcel.readFloat();
            this.f44223o = parcel.readInt();
            this.f44224p = parcel.readInt();
            this.f44225q = parcel.readInt();
            this.f44226r = parcel.readInt();
            this.f44227s = parcel.readByte() != 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f44203h = -1;
        this.f44206n = new java.util.ArrayList();
        this.f44207o = new com.google.android.flexbox.f(this);
        this.f44211s = new com.google.android.flexbox.i(this, null);
        this.f44215w = -1;
        this.f44216x = Integer.MIN_VALUE;
        this.f44217y = Integer.MIN_VALUE;
        this.f44218z = Integer.MIN_VALUE;
        this.A = new android.util.SparseArray();
        this.D = -1;
        this.E = new com.google.android.flexbox.d();
        androidx.recyclerview.widget.t2 properties = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(context, attributeSet, i17, i18);
        int i19 = properties.f12227a;
        if (i19 != 0) {
            if (i19 == 1) {
                if (properties.f12229c) {
                    E(3);
                } else {
                    E(2);
                }
            }
        } else if (properties.f12229c) {
            E(1);
        } else {
            E(0);
        }
        F(1);
        D(4);
        this.B = context;
    }
}
