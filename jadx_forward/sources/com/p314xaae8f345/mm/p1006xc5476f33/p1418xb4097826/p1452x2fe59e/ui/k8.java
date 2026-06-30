package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class k8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd f191750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f191751b;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd activityC13993xa27aaebd, yz5.q qVar) {
        this.f191750a = activityC13993xa27aaebd;
        this.f191751b = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ke2.n0 n0Var = ke2.o0.f388509v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        r45.kx5 kx5Var = (r45.kx5) n0Var.a(fVar, new r45.kx5());
        if (kx5Var != null) {
            if ((fVar.f152148a == 0) && fVar.f152149b == 0) {
                int m75939xb282bd08 = kx5Var.m75939xb282bd08(2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd activityC13993xa27aaebd = this.f191750a;
                activityC13993xa27aaebd.C = m75939xb282bd08;
                activityC13993xa27aaebd.D = kx5Var.m75945x2fec8307(3);
            } else {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073.C;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("finder_live_biz_list", "SearchScreenCastReq Request Fail! errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
            }
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j8(this.f191751b, fVar, kx5Var));
        }
        return jz5.f0.f384359a;
    }
}
