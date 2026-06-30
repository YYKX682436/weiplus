package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 f196841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var) {
        super(0);
        this.f196841d = g90Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f196841d;
        tn0.w0 d17 = g90Var.d();
        if (d17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = g90Var.f194190g;
            android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            int marginEnd = marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0;
            android.view.ViewGroup.LayoutParams layoutParams2 = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            d17.b0(marginEnd, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        }
        return jz5.f0.f384359a;
    }
}
