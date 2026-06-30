package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class q2 implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 f189798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f189799b;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var, fp0.r rVar) {
        this.f189798a = s2Var;
        this.f189799b = rVar;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var = this.f189798a;
        fp0.t tVar = s2Var.f189842d;
        fp0.r rVar = this.f189799b;
        if (tVar != null && tVar.f346819f == rVar.f346812h) {
            return false;
        }
        rVar.b(fp0.u.f346823f);
        java.lang.String m56464xb5886c64 = s2Var.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isFetchConsume] executorToken=");
        fp0.t tVar2 = s2Var.f189842d;
        sb6.append(tVar2 != null ? java.lang.Integer.valueOf(tVar2.f346819f) : null);
        sb6.append(" taskToken=");
        sb6.append(rVar.f346812h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m56464xb5886c64, sb6.toString());
        return true;
    }
}
