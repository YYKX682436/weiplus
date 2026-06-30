package com.tencent.mm.modelsimple;

/* loaded from: classes5.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f71286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.d1 f71287f;

    public a1(com.tencent.mm.modelsimple.d1 d1Var, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f71287f = d1Var;
        this.f71285d = str;
        this.f71286e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17 = ot0.q.v(this.f71285d);
        com.tencent.mm.modelsimple.d1 d1Var = this.f71287f;
        if (v17 != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRevokeMsg", "pause msg:%s send, result:%s", java.lang.Long.valueOf(d1Var.f71308e), java.lang.Integer.valueOf(com.tencent.mm.pluginsdk.model.app.k0.x(d1Var.f71308e, this.f71286e.Q0(), v17.n())));
        }
        ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).aj(d1Var.f71308e, d1Var.f71309f);
    }
}
