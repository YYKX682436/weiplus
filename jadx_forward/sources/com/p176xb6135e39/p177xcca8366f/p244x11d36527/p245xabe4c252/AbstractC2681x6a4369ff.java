package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.HeaderScrollingViewBehavior */
/* loaded from: classes15.dex */
public abstract class AbstractC2681x6a4369ff extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a<android.view.View> {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f125864f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f125865g;

    /* renamed from: h, reason: collision with root package name */
    public int f125866h;

    /* renamed from: i, reason: collision with root package name */
    public int f125867i;

    public AbstractC2681x6a4369ff() {
        this.f125864f = new android.graphics.Rect();
        this.f125865g = new android.graphics.Rect();
        this.f125866h = 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a
    public void A(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        android.view.View C = C(c1081xa22a3e5a.k(view));
        int i18 = 0;
        if (C == null) {
            c1081xa22a3e5a.s(view, i17);
            this.f125866h = 0;
            return;
        }
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) view.getLayoutParams();
        int paddingLeft = c1081xa22a3e5a.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int bottom = C.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin;
        int width = (c1081xa22a3e5a.getWidth() - c1081xa22a3e5a.getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int height = ((c1081xa22a3e5a.getHeight() + C.getBottom()) - c1081xa22a3e5a.getPaddingBottom()) - ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        android.graphics.Rect rect = this.f125864f;
        rect.set(paddingLeft, bottom, width, height);
        n3.g3 m7199x1d79f432 = c1081xa22a3e5a.m7199x1d79f432();
        if (m7199x1d79f432 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.u0.b(c1081xa22a3e5a) && !n3.u0.b(view)) {
                rect.left += m7199x1d79f432.c();
                rect.right -= m7199x1d79f432.d();
            }
        }
        android.graphics.Rect rect2 = this.f125865g;
        int i19 = cVar.f92541c;
        if (i19 == 0) {
            i19 = 8388659;
        }
        n3.r.b(i19, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i17);
        if (this.f125867i != 0) {
            float D = D(C);
            int i27 = this.f125867i;
            i18 = h3.a.b((int) (D * i27), 0, i27);
        }
        view.layout(rect2.left, rect2.top - i18, rect2.right, rect2.bottom - i18);
        this.f125866h = rect2.top - C.getBottom();
    }

    public abstract android.view.View C(java.util.List list);

    public float D(android.view.View view) {
        return 1.0f;
    }

    public int E(android.view.View view) {
        return view.getMeasuredHeight();
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean h(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.View C;
        int i28 = view.getLayoutParams().height;
        if ((i28 != -1 && i28 != -2) || (C = C(c1081xa22a3e5a.k(view))) == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.u0.b(C) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
            if (n3.u0.b(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = android.view.View.MeasureSpec.getSize(i19);
        if (size == 0) {
            size = c1081xa22a3e5a.getHeight();
        }
        c1081xa22a3e5a.u(view, i17, i18, android.view.View.MeasureSpec.makeMeasureSpec((size - C.getMeasuredHeight()) + E(C), i28 == -1 ? 1073741824 : Integer.MIN_VALUE), i27);
        return true;
    }

    public AbstractC2681x6a4369ff(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125864f = new android.graphics.Rect();
        this.f125865g = new android.graphics.Rect();
        this.f125866h = 0;
    }
}
