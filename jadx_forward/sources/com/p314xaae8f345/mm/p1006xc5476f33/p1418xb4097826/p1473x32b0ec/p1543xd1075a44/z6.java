package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 f202063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202064e;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var, android.view.View view) {
        this.f202063d = d7Var;
        this.f202064e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = this.f202063d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(d7Var.f199716e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d7Var.K, "navigationBarHeight:" + c17);
        android.view.ViewGroup.LayoutParams layoutParams = this.f202064e.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
    }
}
