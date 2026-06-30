package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class p1 extends androidx.recyclerview.widget.r3 {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f12189d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f12190e;

    @Override // androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.getF98486n()) {
            iArr[0] = i(layoutManager, view, l(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF123307r()) {
            iArr[1] = i(layoutManager, view, m(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.getF123307r()) {
            return k(layoutManager, m(layoutManager));
        }
        if (layoutManager.getF98486n()) {
            return k(layoutManager, l(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int itemCount;
        android.view.View f17;
        int position;
        int i19;
        android.graphics.PointF a17;
        int i27;
        int i28;
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3) || (itemCount = layoutManager.getItemCount()) == 0 || (f17 = f(layoutManager)) == null || (position = layoutManager.getPosition(f17)) == -1 || (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.getF98486n()) {
            i27 = j(layoutManager, l(layoutManager), i17, 0);
            if (a17.x < 0.0f) {
                i27 = -i27;
            }
        } else {
            i27 = 0;
        }
        if (layoutManager.getF123307r()) {
            i28 = j(layoutManager, m(layoutManager), 0, i18);
            if (a17.y < 0.0f) {
                i28 = -i28;
            }
        } else {
            i28 = 0;
        }
        if (layoutManager.getF123307r()) {
            i27 = i28;
        }
        if (i27 == 0) {
            return -1;
        }
        int i29 = position + i27;
        int i37 = i29 >= 0 ? i29 : 0;
        return i37 >= itemCount ? i19 : i37;
    }

    public final int i(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view, androidx.recyclerview.widget.w1 w1Var) {
        return (w1Var.e(view) + (w1Var.c(view) / 2)) - (layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    public final int j(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var, int i17, int i18) {
        this.f12213b.fling(0, 0, i17, i18, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f12213b.getFinalX(), this.f12213b.getFinalY()};
        int childCount = layoutManager.getChildCount();
        float f17 = 1.0f;
        if (childCount != 0) {
            android.view.View view = null;
            int i19 = Integer.MIN_VALUE;
            int i27 = Integer.MAX_VALUE;
            android.view.View view2 = null;
            for (int i28 = 0; i28 < childCount; i28++) {
                android.view.View childAt = layoutManager.getChildAt(i28);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i27) {
                        view = childAt;
                        i27 = position;
                    }
                    if (position > i19) {
                        view2 = childAt;
                        i19 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = java.lang.Math.max(w1Var.b(view), w1Var.b(view2)) - java.lang.Math.min(w1Var.e(view), w1Var.e(view2));
                if (max != 0) {
                    f17 = (max * 1.0f) / ((i19 - i27) + 1);
                }
            }
        }
        if (f17 <= 0.0f) {
            return 0;
        }
        return java.lang.Math.round((java.lang.Math.abs(iArr[0]) > java.lang.Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f17);
    }

    public final android.view.View k(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int k17 = layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int abs = java.lang.Math.abs((w1Var.e(childAt) + (w1Var.c(childAt) / 2)) - k17);
            if (abs < i17) {
                view = childAt;
                i17 = abs;
            }
        }
        return view;
    }

    public final androidx.recyclerview.widget.w1 l(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f12190e;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f12190e = new androidx.recyclerview.widget.u1(layoutManager);
        }
        return this.f12190e;
    }

    public final androidx.recyclerview.widget.w1 m(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f12189d;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f12189d = new androidx.recyclerview.widget.v1(layoutManager);
        }
        return this.f12189d;
    }
}
