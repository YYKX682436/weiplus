package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h50 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f194308a;

    public h50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        this.f194308a = r60Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50
    public boolean a(cm2.t data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return (data instanceof cm2.m0) || (data instanceof cm2.k0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 b(cm2.t promoteData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteData, "promoteData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f194308a;
        android.view.View findViewById = r60Var.f195628p.findViewById(com.p314xaae8f345.mm.R.id.muu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(r60Var.f446856d.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.das, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0((android.view.ViewGroup) findViewById, (android.view.ViewGroup) inflate, r60Var.f195630r, r60Var.f195627J, promoteData);
    }
}
