package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class y1 extends androidx.recyclerview.widget.r3 {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f12287d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f12288e;

    private android.view.View j(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
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

    private androidx.recyclerview.widget.w1 l(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f12288e;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f12288e = new androidx.recyclerview.widget.u1(layoutManager);
        }
        return this.f12288e;
    }

    private androidx.recyclerview.widget.w1 m(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f12287d;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f12287d = new androidx.recyclerview.widget.v1(layoutManager);
        }
        return this.f12287d;
    }

    @Override // androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
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
    public androidx.recyclerview.widget.o1 e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.f3) {
            return new androidx.recyclerview.widget.x1(this, this.f12212a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.getF123307r()) {
            return j(layoutManager, m(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return j(layoutManager, l(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int position;
        android.graphics.PointF a17;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        android.view.View k17 = layoutManager.getF123307r() ? k(layoutManager, m(layoutManager)) : layoutManager.canScrollHorizontally() ? k(layoutManager, l(layoutManager)) : null;
        if (k17 == null || (position = layoutManager.getPosition(k17)) == -1) {
            return -1;
        }
        boolean z17 = false;
        boolean z18 = !layoutManager.canScrollHorizontally() ? i18 <= 0 : i17 <= 0;
        if ((layoutManager instanceof androidx.recyclerview.widget.f3) && (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount - 1)) != null && (a17.x < 0.0f || a17.y < 0.0f)) {
            z17 = true;
        }
        return z17 ? z18 ? position - 1 : position : z18 ? position + 1 : position;
    }

    public final int i(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view, androidx.recyclerview.widget.w1 w1Var) {
        return (w1Var.e(view) + (w1Var.c(view) / 2)) - (layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    public final android.view.View k(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int e17 = w1Var.e(childAt);
            if (e17 < i17) {
                view = childAt;
                i17 = e17;
            }
        }
        return view;
    }
}
