package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195652e;

    public ra(android.view.ViewGroup viewGroup, int i17) {
        this.f195651d = viewGroup;
        this.f195652e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f195651d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f195652e + com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
    }
}
