package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class tc implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd f171773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc f171774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al1.l f171775f;

    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd kdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc ucVar, al1.l lVar) {
        this.f171773d = kdVar;
        this.f171774e = ucVar;
        this.f171775f = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc ucVar = this.f171774e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.sc scVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.sc(ucVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd kdVar = this.f171773d;
        kdVar.mo2218x262881b4(scVar);
        kdVar.mo2224x4c2b09dd(ucVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571781p8));
        kdVar.mo2220xf5e6816c(com.p314xaae8f345.mm.ui.bk.C() ? "white" : "black");
        kdVar.mo134899x67f06213(b3.l.m9702x7444d5ad(ucVar.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        kdVar.mo2223x5b5c5185(true);
        this.f171775f.x(kdVar.getF87324d(), true ^ com.p314xaae8f345.mm.ui.bk.C());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }
}
