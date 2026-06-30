package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class w4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 f211977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211978e;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var, android.view.View view) {
        this.f211977d = a5Var;
        this.f211978e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211977d;
        a5Var.h().m82794x2d5b4f1b().removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f211978e;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), a5Var.l().m61117x987216ea().getHeight());
        view2.requestLayout();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "bottomMargin=" + a5Var.l().m61117x987216ea().getHeight() + " paddingBottom=" + view2.getPaddingBottom());
    }
}
