package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes2.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f239679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ch f239680b;

    public a1(java.util.Map.Entry entry, r45.ch chVar) {
        this.f239679a = entry;
        this.f239680b = chVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UserDataOperationReporter", "upload succ. day " + ((java.lang.Number) this.f239679a.getKey()).longValue() + ", size " + ((java.util.LinkedList) this.f239679a.getValue()).size());
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UserDataOperationReporter", "upload err. day " + ((java.lang.Number) this.f239679a.getKey()).longValue() + ". errCode:" + fVar.f152149b + " errType:" + fVar.f152148a + " errMsg:" + fVar.f152150c);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.z0(this.f239680b, this.f239679a);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return t0Var.l(z0Var, 0L, "MicroMsg.UserDataOperationReporter");
    }
}
