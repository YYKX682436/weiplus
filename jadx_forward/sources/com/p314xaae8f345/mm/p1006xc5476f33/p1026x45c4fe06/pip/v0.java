package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public final class v0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.x0 f169092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.q0 f169093e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.q0 q0Var) {
        this.f169092d = x0Var;
        this.f169093e = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.graphics.Point point = (android.graphics.Point) obj;
        this.f169092d.f169099b = point;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i0) this.f169093e;
        if (point == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f169030a.f169051a, "onPipStablePosGot, point is null");
            return;
        }
        i0Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h0(i0Var, point));
    }
}
