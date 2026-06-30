package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ch0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193685p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f193686q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f193687r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193685p = statusMonitor;
        this.f193686q = "Finder.LiveVisitorExceptionPlugin";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            ((mm2.c1) P0(mm2.c1.class)).O1 = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f193687r == null) {
            this.f193687r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se(this.f446856d, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), this);
        }
    }

    public final void u1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVisitorJoinForbidden anchorUserName:");
        sb6.append(anchorUserName);
        sb6.append(", errPage:");
        sb6.append(qp1Var != null ? pm0.b0.g(qp1Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193686q, sb6.toString());
        t1(anchorUserName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f193687r;
        if (seVar != null) {
            seVar.c(12, qp1Var, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bh0(this));
        }
    }
}
