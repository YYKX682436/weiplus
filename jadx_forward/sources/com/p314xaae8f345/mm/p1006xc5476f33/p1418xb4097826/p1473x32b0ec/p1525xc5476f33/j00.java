package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class j00 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f194575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 f194576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f194577f;

    public j00(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var, int i18) {
        this.f194575d = i17;
        this.f194576e = w00Var;
        this.f194577f = i18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f194577f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = this.f194576e;
        int i18 = this.f194575d;
        if (i18 == 0) {
            g4Var.f(w00Var.f196377r, w00Var.f446856d.getContext().getResources().getString(i17));
        } else {
            g4Var.d(w00Var.f196377r, w00Var.f446856d.getContext().getResources().getColor(i18), w00Var.f446856d.getContext().getResources().getString(i17));
        }
    }
}
