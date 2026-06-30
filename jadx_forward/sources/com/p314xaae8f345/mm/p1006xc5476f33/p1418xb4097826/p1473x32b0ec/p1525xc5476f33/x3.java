package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class x3 implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 f196555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196557c;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var, android.view.ViewGroup viewGroup, int i17) {
        this.f196555a = c4Var;
        this.f196556b = viewGroup;
        this.f196557c = i17;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = this.f196555a;
        if (!c4Var.x0()) {
            if (!(sn0.b.f491497e2 != null) && !((mm2.c1) c4Var.P0(mm2.c1.class)).O7()) {
                android.view.ViewGroup viewGroup = this.f196556b;
                int c17 = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f196557c + c17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f193636w, "onApplyWindowInsets navigationHeight: " + c17);
            }
        }
        return n3.l1.i(v17, insets);
    }
}
