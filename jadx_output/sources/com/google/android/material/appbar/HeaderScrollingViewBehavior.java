package com.google.android.material.appbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public abstract class HeaderScrollingViewBehavior extends com.google.android.material.appbar.ViewOffsetBehavior<android.view.View> {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f44331f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f44332g;

    /* renamed from: h, reason: collision with root package name */
    public int f44333h;

    /* renamed from: i, reason: collision with root package name */
    public int f44334i;

    public HeaderScrollingViewBehavior() {
        this.f44331f = new android.graphics.Rect();
        this.f44332g = new android.graphics.Rect();
        this.f44333h = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        android.view.View C = C(coordinatorLayout.k(view));
        int i18 = 0;
        if (C == null) {
            coordinatorLayout.s(view, i17);
            this.f44333h = 0;
            return;
        }
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int bottom = C.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int height = ((coordinatorLayout.getHeight() + C.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        android.graphics.Rect rect = this.f44331f;
        rect.set(paddingLeft, bottom, width, height);
        n3.g3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.u0.b(coordinatorLayout) && !n3.u0.b(view)) {
                rect.left += lastWindowInsets.c();
                rect.right -= lastWindowInsets.d();
            }
        }
        android.graphics.Rect rect2 = this.f44332g;
        int i19 = cVar.f11008c;
        if (i19 == 0) {
            i19 = 8388659;
        }
        n3.r.b(i19, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i17);
        if (this.f44334i != 0) {
            float D = D(C);
            int i27 = this.f44334i;
            i18 = h3.a.b((int) (D * i27), 0, i27);
        }
        view.layout(rect2.left, rect2.top - i18, rect2.right, rect2.bottom - i18);
        this.f44333h = rect2.top - C.getBottom();
    }

    public abstract android.view.View C(java.util.List list);

    public float D(android.view.View view) {
        return 1.0f;
    }

    public int E(android.view.View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.View C;
        int i28 = view.getLayoutParams().height;
        if ((i28 != -1 && i28 != -2) || (C = C(coordinatorLayout.k(view))) == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.u0.b(C) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
            if (n3.u0.b(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = android.view.View.MeasureSpec.getSize(i19);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.u(view, i17, i18, android.view.View.MeasureSpec.makeMeasureSpec((size - C.getMeasuredHeight()) + E(C), i28 == -1 ? 1073741824 : Integer.MIN_VALUE), i27);
        return true;
    }

    public HeaderScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44331f = new android.graphics.Rect();
        this.f44332g = new android.graphics.Rect();
        this.f44333h = 0;
    }
}
