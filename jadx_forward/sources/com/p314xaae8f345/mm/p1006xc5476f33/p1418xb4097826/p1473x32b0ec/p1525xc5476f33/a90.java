package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 f193371d;

    public a90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var) {
        this.f193371d = g90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Point a17;
        tn0.w0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f193371d;
        tn0.w0 d18 = g90Var.d();
        if (d18 == null || (a17 = d18.Q().a()) == null) {
            return;
        }
        int i17 = a17.x;
        int i18 = g90Var.f194191h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = g90Var.f194190g;
        if (i17 == 0 && a17.y == 0 && (d17 = g90Var.d()) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            d17.b0(i18, marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        tn0.w0 d19 = g90Var.d();
        if (d19 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = c14313x19517c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            d19.b0(i18, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        }
    }
}
