package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class j0 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.k0 f93763a;

    public j0(com.tencent.mm.plugin.base.stub.k0 k0Var) {
        this.f93763a = k0Var;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "checkIsLogin onSceneEnd() hasLogin:%s", java.lang.Boolean.valueOf(com.tencent.mm.plugin.base.stub.WXCommProvider.f93671m));
        this.f93763a.c(java.lang.Boolean.TRUE);
    }
}
