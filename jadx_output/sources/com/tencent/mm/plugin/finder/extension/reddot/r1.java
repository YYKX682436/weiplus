package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w1 f105794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f105796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var, java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        super(0);
        this.f105794d = w1Var;
        this.f105795e = str;
        this.f105796f = jbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        r45.vs2 vs2Var = new r45.vs2();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f105796f;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(vs2Var.parseFrom(jbVar.field_ctrInfo.toByteArray()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.NewDiscoveryRedDotHandler", m524exceptionOrNullimpl, "[isNeedRequest] rebuild DISCOVERY red dot failed! ctrlInfo toByteArray crash!", new java.lang.Object[0]);
        } else {
            java.util.LinkedList linkedList = vs2Var.f388489g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f373887d = 1;
            f03Var.f373891h = 1;
            f03Var.f373892i = "Discovery";
            f03Var.f373906z = jbVar.field_username;
            linkedList.add(f03Var);
            this.f105794d.aj().w(vs2Var, "Finder.NewDiscoveryRedDotHandler");
            com.tencent.mars.xlog.Log.i("Finder.NewDiscoveryRedDotHandler", "[isNeedRequest] rebuild DISCOVERY red dot! path=" + this.f105795e);
        }
        return jz5.f0.f302826a;
    }
}
