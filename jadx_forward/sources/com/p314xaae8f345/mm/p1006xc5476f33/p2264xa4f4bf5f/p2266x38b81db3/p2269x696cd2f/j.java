package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes3.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f254826d;

    public j(int i17) {
        this.f254826d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager).f93394w;
        int i18 = u07 % i17;
        int i19 = i17 - 1;
        int i27 = this.f254826d;
        if (i18 == i19) {
            outRect.left = i27 / 2;
        } else {
            outRect.right = i27 / 2;
        }
    }
}
