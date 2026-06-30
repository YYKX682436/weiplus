package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (layoutParams2.f93398h % 3 == 1) {
                outRect.left = 1;
                outRect.right = 1;
            }
            outRect.bottom = 1;
            outRect.top = 0;
        }
    }
}
