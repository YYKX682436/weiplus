package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class r9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13998xbfff9384 f192020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f192021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13998xbfff9384 activityC13998xbfff9384, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super(0);
        this.f192020d = activityC13998xbfff9384;
        this.f192021e = m1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((db2.n5) ((zy2.kc) this.f192021e)).f309633g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.v51) fVar).m75941xfb821914(5);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13998xbfff9384.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13998xbfff9384 activityC13998xbfff9384 = this.f192020d;
        activityC13998xbfff9384.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13998xbfff9384.f190900v, sb6.toString());
        if (m75941xfb821914 != null) {
            java.util.ArrayList arrayList = activityC13998xbfff9384.f190904z;
            arrayList.addAll(m75941xfb821914);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o9 o9Var = activityC13998xbfff9384.f190903y;
            o9Var.getClass();
            o9Var.f191902d = arrayList;
            o9Var.notifyDataSetChanged();
            activityC13998xbfff9384.e7();
        }
        return jz5.f0.f384359a;
    }
}
