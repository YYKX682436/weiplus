package an2;

/* loaded from: classes14.dex */
public final class g extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f8850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8851e;

    /* renamed from: f, reason: collision with root package name */
    public int f8852f;

    /* renamed from: g, reason: collision with root package name */
    public int f8853g;

    public g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f8850d = i65.a.b(context, 34);
        this.f8851e = i65.a.b(context, 24);
        this.f8853g = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, this.f8850d);
    }

    public final int m(androidx.recyclerview.widget.z2 z2Var, int i17) {
        int i18;
        detachAndScrapAttachedViews(z2Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int itemCount = getItemCount();
        int i19 = 0;
        int i27 = 0;
        while (true) {
            i18 = this.f8851e;
            if (i19 >= itemCount) {
                break;
            }
            android.view.View f17 = z2Var.f(i19);
            kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
            arrayList.add(f17);
            measureChild(f17, 0, 0);
            i27 += getDecoratedMeasuredWidth(f17) + i18;
            i19++;
        }
        int max = java.lang.Math.max(0, i27 - i18);
        if (max <= getWidth()) {
            int width = (getWidth() - max) / 2;
            int itemCount2 = getItemCount();
            for (int i28 = 0; i28 < itemCount2; i28++) {
                android.view.View view = (android.view.View) arrayList.get(i28);
                addView(view);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
                layoutDecorated(view, width, 0, width + decoratedMeasuredWidth, this.f8850d);
                width += decoratedMeasuredWidth + i18;
            }
            return 0;
        }
        int f18 = e06.p.f(this.f8852f + i17, 0, max - getWidth());
        int width2 = getWidth() + f18;
        int itemCount3 = getItemCount();
        int i29 = 0;
        for (int i37 = 0; i37 < itemCount3; i37++) {
            android.view.View view2 = (android.view.View) arrayList.get(i37);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(view2);
            if (i29 + decoratedMeasuredWidth2 < f18) {
                i29 += decoratedMeasuredWidth2 + i18;
                z2Var.i(view2);
            } else if (i29 > width2) {
                z2Var.i(view2);
            } else {
                addView(view2);
                int i38 = i29 - f18;
                layoutDecorated(view2, i38, 0, i38 + decoratedMeasuredWidth2, this.f8850d);
                i29 += decoratedMeasuredWidth2 + i18;
            }
        }
        return f18;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        int i17;
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int i18 = this.f8853g;
        this.f8853g = -1;
        int i19 = 0;
        if (i18 < 0) {
            m(recycler, 0);
            return;
        }
        detachAndScrapAttachedViews(recycler);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int itemCount = getItemCount();
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i17 = this.f8851e;
            if (i27 >= itemCount) {
                break;
            }
            android.view.View f17 = recycler.f(i27);
            kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
            arrayList.add(f17);
            measureChild(f17, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(f17);
            if (i27 == i18) {
                i29 = (decoratedMeasuredWidth / 2) + i28;
            }
            i28 += decoratedMeasuredWidth + i17;
            i27++;
        }
        int max = java.lang.Math.max(0, i28 - i17);
        if (max <= getWidth()) {
            this.f8852f = 0;
            int width = (getWidth() - max) / 2;
            int itemCount2 = getItemCount();
            while (i19 < itemCount2) {
                android.view.View view = (android.view.View) arrayList.get(i19);
                addView(view);
                int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(view);
                layoutDecorated(view, width, 0, width + decoratedMeasuredWidth2, this.f8850d);
                width += decoratedMeasuredWidth2 + i17;
                i19++;
            }
            return;
        }
        int f18 = e06.p.f(i29 - (getWidth() / 2), 0, max - getWidth());
        this.f8852f = f18;
        int width2 = getWidth() + f18;
        int itemCount3 = getItemCount();
        int i37 = 0;
        while (i19 < itemCount3) {
            android.view.View view2 = (android.view.View) arrayList.get(i19);
            int decoratedMeasuredWidth3 = getDecoratedMeasuredWidth(view2);
            if (i37 + decoratedMeasuredWidth3 < f18) {
                i37 += decoratedMeasuredWidth3 + i17;
                recycler.i(view2);
            } else if (i37 > width2) {
                recycler.i(view2);
            } else {
                addView(view2);
                int i38 = i37 - f18;
                layoutDecorated(view2, i38, 0, i38 + decoratedMeasuredWidth3, this.f8850d);
                i37 += decoratedMeasuredWidth3 + i17;
            }
            i19++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int m17 = m(recycler, i17);
        int i18 = m17 - this.f8852f;
        this.f8852f = m17;
        return i18;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f8853g = i17;
        requestLayout();
    }
}
