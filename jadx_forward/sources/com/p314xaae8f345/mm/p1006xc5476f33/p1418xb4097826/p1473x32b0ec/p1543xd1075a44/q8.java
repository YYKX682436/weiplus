package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class q8 implements xi2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8 f201044a;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8 r8Var) {
        this.f201044a = r8Var;
    }

    @Override // xi2.f
    /* renamed from: onAnimationEnd */
    public void mo10404xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8 r8Var = this.f201044a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8Var.f201126d, "onAnimationEnd status:" + r8Var.f201137o);
        int i17 = r8Var.f201137o;
        r8Var.getClass();
        if (i17 == 0) {
            r8Var.c().mo140757x901b6914(8);
            r8Var.a().b();
        }
    }

    @Override // xi2.f
    /* renamed from: onAnimationStart */
    public void mo10405xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8 r8Var = this.f201044a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8Var.f201126d, "onAnimationStart status:" + r8Var.f201137o);
        int i17 = r8Var.f201137o;
        r8Var.getClass();
        if (i17 == 0) {
            if (((mm2.o4) r8Var.f201125c.P0(mm2.o4.class)).f410857s.size() == 1) {
                r8Var.a().e();
            }
        }
    }
}
