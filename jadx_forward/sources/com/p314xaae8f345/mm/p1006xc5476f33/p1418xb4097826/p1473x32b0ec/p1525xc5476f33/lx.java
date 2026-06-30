package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f194975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f194976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f194977f;

    public lx(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar, int i18) {
        this.f194975d = i17;
        this.f194976e = tyVar;
        this.f194977f = i18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f194977f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f194976e;
        int i18 = this.f194975d;
        if (i18 == 0) {
            g4Var.f(tyVar.f196024t, tyVar.A.getString(i17));
        } else {
            g4Var.d(tyVar.f196024t, tyVar.A.getColor(i18), tyVar.A.getString(i17));
        }
    }
}
