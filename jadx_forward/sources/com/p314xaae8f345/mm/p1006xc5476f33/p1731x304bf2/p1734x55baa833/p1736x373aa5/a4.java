package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes2.dex */
public final class a4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f220558d;

    /* renamed from: e, reason: collision with root package name */
    public final int f220559e;

    public a4(int i17) {
        this.f220558d = i17;
        this.f220559e = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) parent.getLayoutManager();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1161x57298f5d);
        int i17 = c1161x57298f5d.f93394w;
        parent.u0(view);
        int i18 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams).f93398h;
        int i19 = i17 - 1;
        int i27 = this.f220558d * i19;
        int i28 = this.f220559e;
        int i29 = (i27 + (i28 * 2)) / i17;
        int i37 = ((i18 * ((i29 - i28) - i28)) / i19) + i28;
        outRect.set(i37, 0, i29 - i37, 0);
    }
}
