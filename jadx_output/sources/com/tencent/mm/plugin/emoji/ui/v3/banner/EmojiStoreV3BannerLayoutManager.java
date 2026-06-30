package com.tencent.mm.plugin.emoji.ui.v3.banner;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroidx/recyclerview/widget/f3;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreV3BannerLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.f3 {

    /* renamed from: e, reason: collision with root package name */
    public int f98480e;

    /* renamed from: h, reason: collision with root package name */
    public int f98483h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98484i;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.w1 f98479d = new androidx.recyclerview.widget.u1(this);

    /* renamed from: f, reason: collision with root package name */
    public int f98481f = 2000;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98482g = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f98485m = "MicroMsg.EmojiStoreV3BannerLayoutManager";

    /* renamed from: n, reason: collision with root package name */
    public boolean f98486n = true;

    @Override // androidx.recyclerview.widget.f3
    public android.graphics.PointF a(int i17) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally, reason: from getter */
    public boolean getF98486n() {
        return this.f98486n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
    }

    public final int m() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null && getDecoratedLeft(childAt) >= 0 && getDecoratedRight(childAt) <= this.f98479d.l()) {
                return getPosition(childAt);
            }
        }
        return -1;
    }

    public final int n(android.view.View view) {
        return ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getDecoratedMeasuredHeight(view)) / 2) + getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        android.view.View childAt;
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        if (getItemCount() == 0 || state.f12065g) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        if (this.f98484i) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        android.view.View f17 = recycler.f(0);
        kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
        measureChildWithMargins(f17, 0, 0);
        this.f98480e = getDecoratedMeasuredWidth(f17);
        int itemCount = getItemCount();
        int i17 = 0;
        for (int i18 = 0; i18 < itemCount && i17 <= this.f98479d.l(); i18++) {
            android.view.View f18 = recycler.f(i18);
            kotlin.jvm.internal.o.f(f18, "getViewForPosition(...)");
            addView(f18);
            measureChildWithMargins(f18, 0, 0);
            int i19 = i17 + this.f98483h;
            layoutDecoratedWithMargins(f18, i19, n(f18), i19 + this.f98480e, n(f18) + getDecoratedMeasuredHeight(f18));
            i17 += this.f98480e + this.f98483h;
        }
        if (getItemCount() >= 3 && this.f98482g && (childAt = getChildAt(getChildCount() - 2)) != null) {
            android.view.View f19 = recycler.f(getItemCount() - 1);
            kotlin.jvm.internal.o.f(f19, "getViewForPosition(...)");
            addView(f19, 0);
            measureChildWithMargins(f19, 0, 0);
            int n17 = n(f19);
            int decoratedLeft = getDecoratedLeft(childAt);
            int i27 = this.f98480e;
            int i28 = decoratedLeft - i27;
            layoutDecoratedWithMargins(f19, i28 - (i27 + i28), n17, 0, n17 + getDecoratedMeasuredHeight(f19));
        }
        this.f98484i = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int i18;
        int i19 = 0;
        if (z2Var == null) {
            return 0;
        }
        androidx.recyclerview.widget.w1 w1Var = this.f98479d;
        java.lang.String str = this.f98485m;
        if (i17 > 0) {
            if (getItemCount() > 0) {
                while (true) {
                    android.view.View childAt = getChildAt(getChildCount() - 1);
                    if (childAt != null) {
                        int decoratedRight = getDecoratedRight(childAt);
                        if (decoratedRight - i17 >= w1Var.l()) {
                            break;
                        }
                        int position = getPosition(childAt);
                        if (!this.f98482g && position == getItemCount() - 1) {
                            break;
                        }
                        android.view.View f17 = z2Var.f(this.f98482g ? (position + 1) % getItemCount() : position + 1);
                        kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                        addView(f17);
                        measureChildWithMargins(f17, 0, 0);
                        layoutDecoratedWithMargins(f17, decoratedRight + this.f98483h, n(f17), this.f98483h + decoratedRight + getDecoratedMeasuredWidth(f17), n(f17) + getDecoratedMeasuredHeight(f17));
                        getDecoratedMeasuredWidth(f17);
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "scrollToLeft stopped, rightView null");
                        break;
                    }
                }
                android.view.View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 == null) {
                    com.tencent.mars.xlog.Log.i(str, "scrollToLeft failed, lastChild null");
                } else {
                    i18 = getDecoratedLeft(childAt2);
                    if (getPosition(childAt2) != getItemCount() - 1 || i18 - i17 >= 0) {
                        i18 = i17;
                    }
                    offsetChildrenHorizontal(-i18);
                    e06.k kVar = new e06.k(0, getChildCount());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = kVar.iterator();
                    while (((e06.j) it).hasNext()) {
                        android.view.View childAt3 = getChildAt(((kz5.x0) it).b());
                        if (childAt3 != null) {
                            arrayList.add(childAt3);
                        }
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        android.view.View view = (android.view.View) it6.next();
                        if (getDecoratedRight(view) < 0) {
                            removeAndRecycleView(view, z2Var);
                        }
                    }
                }
            }
            i18 = 0;
        } else {
            i18 = i17;
        }
        if (i17 >= 0) {
            return i18;
        }
        if (getItemCount() <= 0) {
            return 0;
        }
        while (true) {
            android.view.View childAt4 = getChildAt(0);
            if (childAt4 != null) {
                if (getDecoratedLeft(childAt4) + java.lang.Math.abs(i17) <= getPaddingLeft()) {
                    break;
                }
                android.view.View childAt5 = getChildAt(0);
                if (childAt5 == null) {
                    com.tencent.mars.xlog.Log.i(str, "addLeftItemView failed, child null, pos:0");
                } else {
                    int decoratedLeft = getDecoratedLeft(childAt5);
                    int position2 = getPosition(childAt5);
                    boolean z17 = this.f98482g;
                    if (z17 || position2 != 0) {
                        int i27 = position2 - 1;
                        if (z17) {
                            i27 = (i27 + getItemCount()) % getItemCount();
                        }
                        android.view.View f18 = z2Var.f(i27);
                        kotlin.jvm.internal.o.f(f18, "getViewForPosition(...)");
                        addView(f18, 0);
                        measureChildWithMargins(f18, 0, 0);
                        java.lang.Math.abs(i17);
                        getPaddingLeft();
                        getDecoratedMeasuredWidth(f18);
                        layoutDecoratedWithMargins(f18, (decoratedLeft - getDecoratedMeasuredWidth(f18)) - this.f98483h, n(f18), decoratedLeft - this.f98483h, n(f18) + getDecoratedMeasuredHeight(f18));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "scrollToRight stopped, child null, pos:0");
                break;
            }
        }
        android.view.View childAt6 = getChildAt(0);
        if (childAt6 == null) {
            com.tencent.mars.xlog.Log.i(str, "scrollToRight failed, firstChild null");
            return 0;
        }
        int decoratedRight2 = getDecoratedRight(childAt6);
        if (getPosition(childAt6) == 0 && java.lang.Math.abs(i17) + decoratedRight2 > w1Var.l()) {
            i17 = -(w1Var.l() - decoratedRight2);
        }
        offsetChildrenHorizontal(-i17);
        e06.k kVar2 = new e06.k(0, getChildCount());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = kVar2.iterator();
        while (((e06.j) it7).hasNext()) {
            android.view.View childAt7 = getChildAt(((kz5.x0) it7).b());
            if (childAt7 != null) {
                arrayList2.add(childAt7);
            }
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            java.lang.Object next = it8.next();
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            getDecoratedLeft(view2);
            getDecoratedRight(view2);
            if (getDecoratedLeft(view2) > w1Var.l()) {
                removeAndRecycleView(view2, z2Var);
            }
            i19 = i28;
        }
        return i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (getItemCount() > 0) {
            if (this.f98482g || (i17 >= 0 && i17 <= getItemCount() - 1)) {
                if (this.f98482g || getItemCount() > 0) {
                    i17 = ((i17 % getItemCount()) + getItemCount()) % getItemCount();
                }
                if (recyclerView != null) {
                    recyclerView.requestFocus();
                }
                int m17 = m();
                int i18 = (m17 == getItemCount() + (-1) && i17 == 0 && this.f98482g) ? this.f98480e + this.f98483h : (i17 - m17) * (this.f98480e + this.f98483h);
                if (recyclerView != null) {
                    recyclerView.b1(i18, 0, null);
                }
                java.util.Objects.toString(h3Var);
            }
        }
    }
}
