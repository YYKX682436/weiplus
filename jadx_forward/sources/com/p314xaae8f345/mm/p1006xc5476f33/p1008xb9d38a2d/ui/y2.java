package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class y2 implements com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long[] f155866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z2 f155867b;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z2 z2Var, long[] jArr) {
        this.f155867b = z2Var;
        this.f155866a = jArr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InviteFacebookFriendsUI", "fbinvite oncomplete");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long[] jArr = this.f155866a;
        arrayList.add(new e21.p(33, java.lang.Integer.toString(jArr.length)));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
        for (long j17 : jArr) {
            r61.v0 v0Var = new r61.v0();
            v0Var.f474501a = java.lang.Long.toString(j17);
            v0Var.f474502b = 5;
            v0Var.f474503c = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            m61.k.Ni().n0(v0Var);
        }
        db5.e1.j(this.f155867b.f155887d, com.p314xaae8f345.mm.R.C30867xcad56011.c8l, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu, com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w2(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void c(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void d(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    /* renamed from: onCancel */
    public void mo48702x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite cancle");
    }
}
