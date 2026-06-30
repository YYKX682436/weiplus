package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 f195351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f195354g;

    public p20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var, java.lang.String str, android.view.View view, yz5.a aVar) {
        this.f195351d = t20Var;
        this.f195352e = str;
        this.f195353f = view;
        this.f195354g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var = this.f195351d;
        t20Var.v1();
        ((android.widget.TextView) ((jz5.n) t20Var.f195866r).mo141623x754a37bb()).setText(this.f195352e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20.t1(t20Var, this.f195353f);
        t20Var.K0(0);
        this.f195354g.mo152xb9724478();
    }
}
