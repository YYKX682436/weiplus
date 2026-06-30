package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes14.dex */
public final class pi extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195422p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f195423q;

    /* renamed from: r, reason: collision with root package name */
    public ik2.d f195424r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f195425s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(android.view.ViewGroup entranceRoot, qo0.c statusMonitor) {
        super(entranceRoot, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entranceRoot, "entranceRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195422p = entranceRoot;
        this.f195423q = "MicroMsg.FinderLiveGameDynamicFramePlugin";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
        this.f195425s = true;
    }

    @Override // qo0.a
    public void J0() {
        this.f195425s = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (status.ordinal() != 123) {
            return;
        }
        t1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        ik2.d dVar = this.f195424r;
        if (dVar != null) {
            return dVar != null && dVar.f373396e;
        }
        return true;
    }

    public void t1() {
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        java.lang.String str = this.f195423q;
        if (uq1Var == null) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "liveGameData is null");
            return;
        }
        if (!this.f195425s && uq1Var.m75933x41a8a7f2(3)) {
            if (uq1Var.m75939xb282bd08(2) == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                ik2.d dVar = this.f195424r;
                objArr[0] = dVar != null ? dVar.f373392a : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "game_frameset_visibility is 0, id:%s", objArr);
                K0(8);
                return;
            }
            ik2.d dVar2 = this.f195424r;
            if (dVar2 != null) {
                java.lang.Integer valueOf = dVar2 != null ? java.lang.Integer.valueOf(dVar2.f373397f) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
                int intValue = valueOf.intValue();
                if ((uq1Var.m75939xb282bd08(2) & intValue) == 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[3];
                    ik2.d dVar3 = this.f195424r;
                    objArr2[0] = dVar3 != null ? dVar3.f373392a : null;
                    objArr2[1] = java.lang.Integer.valueOf(intValue);
                    objArr2[2] = java.lang.Integer.valueOf(uq1Var.m75939xb282bd08(2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "frameSet id:%s is invisible, bit:%d, game_frameset_visibility:%d", objArr2);
                    K0(8);
                    return;
                }
                if (x0()) {
                    ik2.d dVar4 = this.f195424r;
                    if ((dVar4 == null || dVar4.f373395d) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not support show in landscape");
                        K0(8);
                        return;
                    }
                }
                if (!x0()) {
                    ik2.d dVar5 = this.f195424r;
                    if ((dVar5 == null || dVar5.f373394c) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not support show in portrait");
                        K0(8);
                        return;
                    }
                }
                K0(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti tiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ti.class);
                if (tiVar != null) {
                    tiVar.w1(uq1Var);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
    }
}
