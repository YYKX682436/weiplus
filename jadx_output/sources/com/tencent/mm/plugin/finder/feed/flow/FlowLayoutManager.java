package com.tencent.mm.plugin.finder.feed.flow;

/* loaded from: classes15.dex */
public class FlowLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f106754d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.z2 f106756f;

    /* renamed from: g, reason: collision with root package name */
    public vc2.e f106757g;

    /* renamed from: h, reason: collision with root package name */
    public final vc2.e f106758h;

    /* renamed from: i, reason: collision with root package name */
    public vc2.g f106759i;

    /* renamed from: m, reason: collision with root package name */
    public wc2.a f106760m;

    /* renamed from: n, reason: collision with root package name */
    public final vc2.j f106761n;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f106764q;

    /* renamed from: e, reason: collision with root package name */
    public int f106755e = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f106762o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f106763p = 0;

    public FlowLayoutManager() {
        vc2.e eVar = new vc2.e();
        this.f106757g = eVar;
        this.f106758h = vc2.e.a(eVar);
        setAutoMeasureEnabled(true);
        this.f106761n = new vc2.j(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        if (getChildCount() == 0) {
            return false;
        }
        android.view.View childAt = getChildAt(0);
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        return ((q(childAt) == 0 && getDecoratedTop(getChildAt(r(0))) >= getPaddingTop()) && (q(childAt2) == this.f106754d.getAdapter().getItemCount() - 1 && getDecoratedBottom(getChildAt(r(getChildCount() - 1))) <= n())) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    public final int m(int i17, android.graphics.Rect rect, vc2.f fVar) {
        return fVar.f435240a.f435238a.ordinal() != 1 ? i17 + rect.width() : i17 - rect.width();
    }

    public final int n() {
        return getHeight() - getPaddingBottom();
    }

    public final boolean o(android.view.View view, int i17, int i18, int i19, vc2.f fVar, android.graphics.Rect rect, vc2.d dVar) {
        measureChildWithMargins(view, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
        if (fVar.f435240a.f435238a.ordinal() != 1) {
            int paddingLeft = getPaddingLeft();
            int w17 = w();
            dVar.getClass();
            if (!vc2.g.b(i17, decoratedMeasuredWidth, paddingLeft, w17, 0, fVar)) {
                rect.left = i17;
                rect.top = i18;
                rect.right = i17 + decoratedMeasuredWidth;
                rect.bottom = i18 + decoratedMeasuredHeight;
                return false;
            }
            int paddingLeft2 = getPaddingLeft();
            rect.left = paddingLeft2;
            int i27 = i18 + i19;
            rect.top = i27;
            rect.right = paddingLeft2 + decoratedMeasuredWidth;
            rect.bottom = i27 + decoratedMeasuredHeight;
        } else {
            int paddingLeft3 = getPaddingLeft();
            int w18 = w();
            dVar.getClass();
            if (!vc2.g.b(i17, decoratedMeasuredWidth, paddingLeft3, w18, 0, fVar)) {
                rect.left = i17 - decoratedMeasuredWidth;
                rect.top = i18;
                rect.right = i17;
                rect.bottom = i18 + decoratedMeasuredHeight;
                return false;
            }
            rect.left = w() - decoratedMeasuredWidth;
            rect.top = i18 + i19;
            rect.right = w();
            rect.bottom = rect.top + decoratedMeasuredHeight;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(androidx.recyclerview.widget.f2 f2Var, androidx.recyclerview.widget.f2 f2Var2) {
        vc2.j jVar = this.f106761n;
        if (f2Var != null && jVar.f435251e) {
            try {
                jVar.f435251e = false;
                f2Var.unregisterAdapterDataObserver(jVar);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        if (f2Var2 != null) {
            jVar.f435251e = true;
            f2Var2.registerAdapterDataObserver(jVar);
        }
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f106754d = recyclerView;
        vc2.g gVar = new vc2.g(this, recyclerView);
        this.f106759i = gVar;
        this.f106760m = new wc2.a(this.f106757g.f435239b, gVar.c());
        if (this.f106759i.c() == 0) {
            if (this.f106764q == null) {
                this.f106764q = new vc2.b(this, recyclerView);
            }
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.f106764q);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
        if (this.f106764q != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f106764q);
            this.f106764q = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        wc2.a aVar = this.f106760m;
        if (aVar.g()) {
            aVar.c(i17);
            android.util.SparseArray sparseArray = aVar.f444499c;
            int size = sparseArray.size();
            while (true) {
                size--;
                if (size < i17) {
                    break;
                } else {
                    sparseArray.put(size + i18, (android.graphics.Point) sparseArray.get(size));
                }
            }
            for (int i19 = i17; i19 < i17 + i18; i19++) {
                sparseArray.remove(i19);
            }
            aVar.e();
        }
        super.onItemsAdded(recyclerView, i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f106757g = vc2.e.a(this.f106758h);
        wc2.a aVar = this.f106760m;
        if (aVar != null) {
            aVar.f444499c.clear();
            aVar.f444500d.clear();
        }
        this.f106760m = new wc2.a(this.f106757g.f435239b, this.f106759i.c());
        super.onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        int i27;
        android.util.SparseArray sparseArray;
        wc2.a aVar = this.f106760m;
        if (aVar.g()) {
            aVar.c(java.lang.Math.min(i17, i18));
            android.graphics.Point[] pointArr = new android.graphics.Point[i19];
            int i28 = i17;
            while (true) {
                i27 = i17 + i19;
                sparseArray = aVar.f444499c;
                if (i28 >= i27) {
                    break;
                }
                pointArr[i28 - i17] = (android.graphics.Point) sparseArray.get(i28);
                i28++;
            }
            int i29 = i17 - i18;
            int i37 = 0;
            boolean z17 = i29 > 0;
            int abs = java.lang.Math.abs(i29);
            if (!z17) {
                abs -= i19;
            }
            if (z17) {
                i27 = i17 - 1;
            }
            int i38 = z17 ? -1 : 1;
            for (int i39 = 0; i39 < abs; i39++) {
                sparseArray.put(i27 - (i38 * i19), (android.graphics.Point) sparseArray.get(i27));
                i27 += i38;
            }
            int i47 = !z17 ? abs + i17 : i18;
            while (i37 < i19) {
                sparseArray.put(i47, pointArr[i37]);
                i37++;
                i47++;
            }
            aVar.e();
        }
        super.onItemsMoved(recyclerView, i17, i18, i19);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        wc2.a aVar = this.f106760m;
        if (aVar.g()) {
            aVar.c(i17);
            int i19 = i17 + i18;
            android.util.SparseArray sparseArray = aVar.f444499c;
            int size = i19 > sparseArray.size() ? sparseArray.size() - i17 : i18;
            for (int i27 = 0; i27 < size; i27++) {
                sparseArray.remove(i17 + i27);
            }
            for (int i28 = i17 + size; i28 < sparseArray.size() + size; i28++) {
                android.graphics.Point point = (android.graphics.Point) sparseArray.get(i28);
                sparseArray.remove(i28);
                sparseArray.put(i28 - size, point);
            }
            aVar.e();
        }
        super.onItemsRemoved(recyclerView, i17, i18);
        vc2.j jVar = this.f106761n;
        jVar.getClass();
        jVar.f435247a.postOnAnimation(new vc2.i(jVar, recyclerView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.f106760m.b(i17, i18);
        super.onItemsUpdated(recyclerView, i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.z2 r29, androidx.recyclerview.widget.h3 r30) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager.onLayoutChildren(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    public final int p(int i17) {
        return q(getChildAt(i17));
    }

    public final int q(android.view.View view) {
        if (view == null) {
            return -1;
        }
        return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).a();
    }

    public final int r(int i17) {
        android.view.View childAt = getChildAt(i17);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
        int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(childAt);
        int i18 = i17;
        int i19 = i18;
        while (i18 >= 0 && !s(i18, vc2.f.a(this.f106757g))) {
            android.view.View childAt2 = getChildAt(i18);
            if (getDecoratedMeasuredHeight(childAt2) > decoratedMeasuredHeight) {
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt2);
                i19 = i18;
            }
            i18--;
        }
        if (decoratedMeasuredHeight < getDecoratedMeasuredHeight(getChildAt(i18))) {
            decoratedMeasuredHeight = getDecoratedMeasuredHeight(getChildAt(i18));
        } else {
            i18 = i19;
        }
        int i27 = decoratedMeasuredHeight2;
        int i28 = i17;
        while (i17 < getChildCount()) {
            vc2.f a17 = vc2.f.a(this.f106757g);
            int i29 = a17.f435240a.f435239b;
            boolean z17 = true;
            if ((!(i29 > 0) || a17.f435241b != i29) && getChildCount() != 0 && i17 != getChildCount() - 1) {
                z17 = s(i17 + 1, a17);
            }
            if (z17) {
                break;
            }
            android.view.View childAt3 = getChildAt(i17);
            if (getDecoratedMeasuredHeight(childAt3) > i27) {
                i27 = getDecoratedMeasuredHeight(childAt3);
                i28 = i17;
            }
            i17++;
        }
        if (i27 < getDecoratedMeasuredHeight(getChildAt(i17))) {
            i27 = getDecoratedMeasuredHeight(getChildAt(i17));
        } else {
            i17 = i28;
        }
        return decoratedMeasuredHeight >= i27 ? i18 : i17;
    }

    public final boolean s(int i17, vc2.f fVar) {
        if (i17 == 0) {
            return true;
        }
        return fVar.f435240a.f435238a.ordinal() != 1 ? getDecoratedLeft(getChildAt(i17)) <= getPaddingLeft() : getDecoratedRight(getChildAt(i17)) >= w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f106755e = i17;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int i18;
        int i19;
        int max;
        int d17;
        int i27;
        if (i17 == 0 || getItemCount() == 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        int i28 = 1;
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        android.view.View childAt3 = getChildAt(r(0));
        android.view.View childAt4 = getChildAt(r(getChildCount() - 1));
        boolean z17 = q(childAt) == 0 && getDecoratedTop(childAt3) >= getPaddingTop();
        boolean z18 = q(childAt2) == this.f106754d.getAdapter().getItemCount() - 1 && getDecoratedBottom(childAt4) <= n();
        if (i17 > 0 && z18) {
            return 0;
        }
        if (i17 < 0 && z17) {
            return 0;
        }
        if (i17 > 0) {
            int decoratedBottom = getDecoratedBottom(getChildAt(r(getChildCount() - 1))) - n();
            if (decoratedBottom >= i17) {
                offsetChildrenVertical(-i17);
                return i17;
            }
            int i29 = decoratedBottom;
            while (p(getChildCount() - i28) < getItemCount() - i28) {
                int i37 = t().x;
                int decoratedBottom2 = getDecoratedBottom(getChildAt(r(getChildCount() - i28)));
                int p17 = p(getChildCount() - i28) + i28;
                if (p17 != getItemCount()) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    vc2.f a17 = vc2.f.a(this.f106757g);
                    vc2.d dVar = new vc2.d(this);
                    int i38 = i37;
                    int i39 = p17;
                    int i47 = i28;
                    while (i39 < getItemCount()) {
                        android.view.View f17 = z2Var.f(i39);
                        int i48 = i39;
                        int i49 = i38;
                        vc2.d dVar2 = dVar;
                        int i57 = decoratedBottom2;
                        vc2.f fVar = a17;
                        boolean o17 = o(f17, i38, decoratedBottom2, 0, a17, rect, dVar2);
                        this.f106760m.f(i48, new android.graphics.Point(rect.width(), rect.height()));
                        if (o17 && i47 == 0) {
                            z2Var.i(f17);
                            fVar.f435241b = 1;
                            i27 = 1;
                            break;
                        }
                        addView(f17);
                        layoutDecorated(f17, rect.left, rect.top, rect.right, rect.bottom);
                        i38 = m(i49, rect, fVar);
                        i39 = i48 + 1;
                        fVar.f435241b++;
                        i28 = 1;
                        a17 = fVar;
                        dVar = dVar2;
                        decoratedBottom2 = i57;
                        i47 = 0;
                    }
                }
                i27 = i28;
                i29 += getDecoratedMeasuredHeight(getChildAt(r(getChildCount() - i27)));
                if (i29 >= i17) {
                    break;
                }
                i28 = 1;
            }
            if (i29 >= i17) {
                i29 = i17;
            }
            offsetChildrenVertical(-i29);
            while (!u(0)) {
                v(0, z2Var);
            }
            this.f106755e = p(0);
            return i29;
        }
        int paddingTop = getPaddingTop() - getDecoratedTop(getChildAt(r(0)));
        if (paddingTop > java.lang.Math.abs(i17)) {
            offsetChildrenVertical(-i17);
            i18 = i17;
        } else {
            int i58 = paddingTop;
            for (int i59 = 0; p(i59) > 0; i59 = 0) {
                int i66 = t().x;
                int decoratedTop = getDecoratedTop(getChildAt(r(i59)));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int i67 = -1;
                int p18 = p(i59) - 1;
                android.graphics.Rect rect2 = new android.graphics.Rect();
                vc2.f a18 = vc2.f.a(this.f106757g);
                int p19 = p(i59);
                wc2.a aVar = this.f106760m;
                if (aVar.g() && (d17 = aVar.d(p19)) != -1 && d17 > 0) {
                    int d18 = this.f106760m.d(p19) - 1;
                    wc2.a aVar2 = this.f106760m;
                    wc2.b bVar = aVar2.g() ? (wc2.b) aVar2.f444500d.get(d18, null) : null;
                    wc2.a aVar3 = this.f106760m;
                    if (aVar3.g()) {
                        i67 = 0;
                        for (int i68 = 0; i68 < d18; i68++) {
                            i67 += ((wc2.b) aVar3.f444500d.get(i68)).f444502a;
                        }
                    }
                    for (int i69 = 0; i69 < bVar.f444502a; i69++) {
                        android.view.View f18 = z2Var.f(i67 + i69);
                        addView(f18, i69);
                        linkedList.add(f18);
                    }
                    i19 = bVar.f444504c;
                } else {
                    vc2.d dVar3 = new vc2.d(this);
                    int i76 = i66;
                    int i77 = 0;
                    int i78 = 0;
                    boolean z19 = true;
                    while (i78 <= p18) {
                        android.view.View f19 = z2Var.f(i78);
                        int i79 = i77;
                        int i86 = i76;
                        int i87 = i78;
                        vc2.d dVar4 = dVar3;
                        int i88 = p18;
                        vc2.f fVar2 = a18;
                        boolean o18 = o(f19, i76, 0, i79, a18, rect2, dVar4);
                        this.f106760m.f(i87, new android.graphics.Point(rect2.width(), rect2.height()));
                        addView(f19, linkedList.size());
                        if (!o18 || z19) {
                            int m17 = m(i86, rect2, fVar2);
                            max = java.lang.Math.max(i79, rect2.height());
                            fVar2.f435241b++;
                            i76 = m17;
                            z19 = false;
                        } else {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                removeAndRecycleView((android.view.View) it.next(), z2Var);
                            }
                            linkedList.clear();
                            int m18 = m(t().x, rect2, fVar2);
                            max = rect2.height();
                            fVar2.f435241b = 1;
                            i76 = m18;
                        }
                        linkedList.add(f19);
                        i78 = i87 + 1;
                        i77 = max;
                        a18 = fVar2;
                        dVar3 = dVar4;
                        p18 = i88;
                    }
                    i19 = i77;
                }
                int i89 = t().x;
                int i96 = decoratedTop - i19;
                vc2.f a19 = vc2.f.a(this.f106757g);
                vc2.d dVar5 = new vc2.d(this);
                int i97 = i89;
                int i98 = 0;
                boolean z27 = true;
                while (i98 < linkedList.size()) {
                    android.view.View view = (android.view.View) linkedList.get(i98);
                    int i99 = i19;
                    int i100 = i19;
                    int i101 = i97;
                    int i102 = i98;
                    vc2.d dVar6 = dVar5;
                    if (o(view, i97, i96, i99, a19, rect2, dVar5) && z27) {
                        int height = rect2.height();
                        rect2.top -= height;
                        rect2.bottom -= height;
                        z27 = false;
                    }
                    layoutDecorated(view, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    i97 = m(i101, rect2, a19);
                    i98 = i102 + 1;
                    i19 = i100;
                    dVar5 = dVar6;
                }
                i58 += getDecoratedMeasuredHeight(getChildAt(r(0)));
                if (i58 >= java.lang.Math.abs(i17)) {
                    break;
                }
            }
            i18 = i58 < java.lang.Math.abs(i17) ? -i58 : i17;
            offsetChildrenVertical(-i18);
            while (!u(getChildCount() - 1)) {
                v(getChildCount() - 1, z2Var);
            }
            this.f106755e = p(0);
        }
        return i18;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setAutoMeasureEnabled(boolean z17) {
        super.setAutoMeasureEnabled(z17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(int i17, int i18) {
        vc2.j jVar = this.f106761n;
        if (jVar.f435248b) {
            jVar.f435249c = java.lang.Math.max(i17, jVar.f435252f.intValue());
            jVar.f435250d = java.lang.Math.max(i18, jVar.f435254h.intValue());
        } else {
            jVar.f435249c = i17;
            jVar.f435250d = i18;
        }
        super.setMeasuredDimension(jVar.f435249c, jVar.f435250d);
        int i19 = jVar.f435250d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        vc2.c cVar = new vc2.c(this, recyclerView.getContext());
        cVar.f12049a = i17;
        startSmoothScroll(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return true;
    }

    public final android.graphics.Point t() {
        return this.f106759i.a(vc2.f.a(this.f106757g));
    }

    public final boolean u(int i17) {
        android.view.View childAt = getChildAt(r(i17));
        return android.graphics.Rect.intersects(new android.graphics.Rect(getPaddingLeft(), getPaddingTop(), w(), n()), new android.graphics.Rect(getPaddingLeft(), getDecoratedTop(childAt), w(), getDecoratedBottom(childAt)));
    }

    public final void v(int i17, androidx.recyclerview.widget.z2 z2Var) {
        while (!s(i17, vc2.f.a(this.f106757g))) {
            i17--;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(getChildAt(i17));
        while (true) {
            i17++;
            if (i17 >= getChildCount() || s(i17, vc2.f.a(this.f106757g))) {
                break;
            } else {
                linkedList.add(getChildAt(i17));
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            removeAndRecycleView((android.view.View) it.next(), z2Var);
        }
    }

    public final int w() {
        return getWidth() - getPaddingRight();
    }

    public final android.graphics.Point x(android.graphics.Rect rect, vc2.f fVar) {
        return fVar.f435240a.f435238a.ordinal() != 1 ? new android.graphics.Point(getPaddingLeft() + rect.width(), rect.top) : new android.graphics.Point(w() - rect.width(), rect.top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, java.lang.Object obj) {
        this.f106760m.b(i17, i18);
        super.onItemsUpdated(recyclerView, i17, i18, obj);
    }
}
