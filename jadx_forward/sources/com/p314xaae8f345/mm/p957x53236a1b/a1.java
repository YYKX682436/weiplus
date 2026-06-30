package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes5.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f152819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.d1 f152820f;

    public a1(com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f152820f = d1Var;
        this.f152818d = str;
        this.f152819e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17 = ot0.q.v(this.f152818d);
        com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var = this.f152820f;
        if (v17 != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRevokeMsg", "pause msg:%s send, result:%s", java.lang.Long.valueOf(d1Var.f152841e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.x(d1Var.f152841e, this.f152819e.Q0(), v17.n())));
        }
        ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).aj(d1Var.f152841e, d1Var.f152842f);
    }
}
