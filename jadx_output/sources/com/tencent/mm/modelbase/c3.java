package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class c3 extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f70596d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f70597e = this;

    /* renamed from: f, reason: collision with root package name */
    public final long f70598f;

    /* renamed from: g, reason: collision with root package name */
    public int f70599g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f70600h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f70601i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f70602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Executor f70603n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.e3 f70604o;

    public c3(com.tencent.mm.modelbase.o oVar, java.util.concurrent.Executor executor, com.tencent.mm.modelbase.e3 e3Var) {
        this.f70602m = oVar;
        this.f70603n = executor;
        this.f70604o = e3Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f70598f = java.lang.System.currentTimeMillis();
        this.f70599g = 0;
        this.f70600h = new com.tencent.mm.modelbase.a3(this);
        this.f70601i = new com.tencent.mm.sdk.platformtools.b4(com.tencent.mm.modelbase.z2.f70846a.getLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelbase.b3(this), false);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f70596d = u0Var;
        com.tencent.mm.network.l0 l0Var = this.f70600h;
        com.tencent.mm.modelbase.o oVar = this.f70602m;
        int dispatch = dispatch(sVar, oVar, l0Var);
        com.tencent.mm.modelbase.m1 m1Var = this.f70597e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m1Var.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(oVar.f70713d);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(dispatch);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RunCgi", "Start doScene:%d func:%d netid:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f70598f));
        com.tencent.mm.modelbase.e3 e3Var = this.f70604o;
        if (e3Var != null) {
            if (dispatch < 0) {
                this.f70599g = 1;
                com.tencent.mm.modelbase.z2.a(this.f70603n, e3Var, 3, -1, "", this.f70602m, m1Var);
            } else {
                this.f70601i.c(60000L, 60000L);
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.network.v0 getReqResp() {
        com.tencent.mm.network.v0 reqResp = super.getReqResp();
        return reqResp != null ? reqResp : this.f70602m;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f70602m.f70713d;
    }
}
