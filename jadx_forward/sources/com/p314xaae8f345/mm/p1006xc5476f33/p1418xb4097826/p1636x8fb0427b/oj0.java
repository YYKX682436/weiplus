package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class oj0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pj0 f208853d;

    public oj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pj0 pj0Var) {
        this.f208853d = pj0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pj0 pj0Var = this.f208853d;
        if (pj0Var.f208911d) {
            int b17 = i65.a.b(view.getContext(), 1);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i) {
                outRect.left = 0;
                outRect.right = 0;
                outRect.bottom = 0;
                outRect.top = 0;
                return;
            }
            int i17 = b17 / 2;
            outRect.left = i17;
            outRect.right = i17;
            outRect.bottom = i17;
            outRect.top = i17;
            return;
        }
        int dimension = (int) (pj0Var.f208913f == 2 ? view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) : view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        int dimension2 = (int) (pj0Var.f208913f == 2 ? view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj) : view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams2).f93474i) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams3).e() % 2 == 0) {
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
