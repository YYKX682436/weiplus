package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class iz implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz f194569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194570b;

    public iz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar, android.view.ViewGroup viewGroup) {
        this.f194569a = ozVar;
        this.f194570b = viewGroup;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar = this.f194569a;
        if (!ozVar.x0() && !((mm2.c1) ozVar.P0(mm2.c1.class)).R7()) {
            android.view.ViewGroup viewGroup = this.f194570b;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.addRule(12);
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14) + com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamIndicatorPlugin", "bottomMargin: " + layoutParams2.bottomMargin);
            }
            viewGroup.requestLayout();
        }
        return n3.l1.i(v17, insets);
    }
}
