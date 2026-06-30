package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class on extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f191917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f191918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe f191919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(boolean z17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe activityC14104x32508bfe) {
        super(1);
        this.f191917d = z17;
        this.f191918e = j17;
        this.f191919f = activityC14104x32508bfe;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List m56409x97891cf7;
        so2.j5 j5Var;
        r45.vx0 vx0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (this.f191917d && it.getPullType() == 0) {
            long j17 = this.f191918e;
            if (j17 != 0 && (m56409x97891cf7 = it.m56409x97891cf7()) != null && (j5Var = (so2.j5) kz5.n0.Z(m56409x97891cf7)) != null && (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                if (abstractC14490x69736cb5.getFeedObject().m59251x5db1b11() == j17) {
                    r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
                    java.lang.Integer valueOf = (m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? null : java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(6));
                    cu2.g0 g0Var = cu2.g0.f303937a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe activityC14104x32508bfe = this.f191919f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 b17 = g0Var.b(activityC14104x32508bfe.I);
                    if (valueOf != null && valueOf.intValue() != 0 && b17 != null) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.nn(b17, activityC14104x32508bfe, valueOf));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
