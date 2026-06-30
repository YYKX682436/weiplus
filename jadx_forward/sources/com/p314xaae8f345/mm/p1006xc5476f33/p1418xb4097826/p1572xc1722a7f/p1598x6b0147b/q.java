package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams2).e() % 2 == 0) {
            outRect.left = dimension;
            outRect.right = dimension2;
            outRect.bottom = dimension2;
            outRect.top = dimension2;
            return;
        }
        outRect.left = dimension2;
        outRect.right = dimension;
        outRect.bottom = dimension2;
        outRect.top = dimension2;
    }
}
