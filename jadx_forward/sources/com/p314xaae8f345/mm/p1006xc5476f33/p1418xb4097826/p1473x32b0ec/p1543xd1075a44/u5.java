package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f201480d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var) {
        this.f201480d = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f201480d;
        if (d6Var.f199594c.x0()) {
            return;
        }
        android.view.View view = d6Var.f199606o;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.p314xaae8f345.mm.ui.bl.c(d6Var.f199592a.getContext());
    }
}
