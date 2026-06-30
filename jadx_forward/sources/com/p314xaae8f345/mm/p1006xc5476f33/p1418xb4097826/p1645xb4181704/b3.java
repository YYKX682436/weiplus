package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class b3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f211741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211742d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, jv2.i iVar, boolean z17, fp0.r rVar) {
        this.f211739a = q3Var;
        this.f211740b = iVar;
        this.f211741c = z17;
        this.f211742d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        jv2.i iVar = this.f211740b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211739a;
        if (intValue == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j2 j2Var = q3Var.f211907n;
            if (j2Var != null) {
                j2Var.a(iVar.f383756d.t0(), iVar.f383756d.f67480xf609be94, true);
            }
            db5.t7.m123882x26a183b(q3Var.f211900d, com.p314xaae8f345.mm.R.C30867xcad56011.f2d, 0).show();
        } else if (intValue == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.g(q3Var, list, iVar, this.f211741c);
        }
        this.f211742d.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
