package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f211990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211991d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, jv2.d dVar, boolean z17, fp0.r rVar) {
        this.f211988a = o0Var;
        this.f211989b = dVar;
        this.f211990c = z17;
        this.f211991d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        jv2.d dVar = this.f211989b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211988a;
        if (intValue == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g gVar = o0Var.f211864p;
            if (gVar != null) {
                gVar.a(dVar.f383740d.t0(), dVar.f383740d.f67480xf609be94, true);
            }
            db5.t7.m123882x26a183b(o0Var.f211855d, com.p314xaae8f345.mm.R.C30867xcad56011.f2d, 0).show();
        } else if (intValue == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.b(o0Var, list, dVar, this.f211990c);
        }
        this.f211991d.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
