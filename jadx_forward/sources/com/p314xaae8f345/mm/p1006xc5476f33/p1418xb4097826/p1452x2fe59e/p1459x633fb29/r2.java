package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 f189819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a f189821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189822g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var) {
        super(1);
        this.f189819d = s2Var;
        this.f189820e = obj;
        this.f189821f = c13865x4e81e68a;
        this.f189822g = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var = this.f189819d;
        java.lang.String m56464xb5886c64 = s2Var.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] pullType=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o2 request = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o2) this.f189820e;
        sb6.append(request.f189753a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        eb2.b0 b0Var = s2Var.f189843e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p2(s2Var, this.f189821f, this.f189822g, task);
        int i17 = request.f189753a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q2(s2Var, task);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        eb2.w wVar = b0Var.f332250i;
        int i18 = wVar.f332390a;
        im5.c cVar = b0Var.f332251m;
        if (i18 == 1) {
            new db2.e1(i17 != 2 ? null : wVar.f332391b, new eb2.x(b0Var, p2Var, q2Var), i17, q2Var, b0Var.f332249h).l().f(cVar);
        } else {
            eb2.a0 a0Var = new eb2.a0(b0Var, i17, p2Var);
            if (i18 == 2) {
                new db2.w3(new eb2.z(b0Var, a0Var), i17, b0Var.f332248g, q2Var, wVar.f332392c, false, b0Var.f332249h).l().f(cVar);
            } else {
                eb2.b0.E0(b0Var, a0Var, b0Var.f332253o, i17, null, false, b0Var.f332254p, null, 64, null);
                b0Var.f332253o = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
