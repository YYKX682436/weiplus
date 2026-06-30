package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yt implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f196763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f196764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f196765f;

    public yt(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, int i18) {
        this.f196763d = i17;
        this.f196764e = ivVar;
        this.f196765f = i18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f196765f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f196764e;
        int i18 = this.f196763d;
        if (i18 == 0) {
            g4Var.f(ivVar.f194552u, ivVar.B.getString(i17));
        } else {
            g4Var.d(ivVar.f194552u, ivVar.B.getColor(i18), ivVar.B.getString(i17));
        }
    }
}
