package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ha extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        int dimension;
        int y07;
        float dimension2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd((int) root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4));
        if (x0()) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (r4Var.v1(root)) {
                y07 = com.p314xaae8f345.mm.ui.bl.h(root.getContext());
                dimension2 = root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            } else {
                y07 = r4Var.y0(this);
                dimension2 = root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            }
            dimension = y07 + ((int) dimension2);
        } else {
            dimension = (int) root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        }
        marginLayoutParams.setMarginStart(dimension);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.f566094eo1);
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams2 = childAt != null ? childAt.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null && x0()) {
                marginLayoutParams2.topMargin = 0;
            }
        }
        if (zl2.r4.f555483a.v1(viewGroup)) {
            android.view.View findViewById = R0().findViewById(com.p314xaae8f345.mm.R.id.f566090en3);
            android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = i65.a.b(viewGroup.getContext(), 36) * (-1);
            }
            findViewById.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga(viewGroup));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }
}
