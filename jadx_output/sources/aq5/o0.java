package aq5;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.r0 f13270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(aq5.r0 r0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13270d = r0Var;
        this.f13271e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq5.o0(this.f13270d, this.f13271e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq5.o0 o0Var = (aq5.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unInit() called initResult:");
        aq5.r0 r0Var = this.f13270d;
        sb6.append(r0Var != null ? new java.lang.Integer(r0Var.f13291a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.F2FService", sb6.toString());
        aq5.f fVar = aq5.p0.f13274b;
        if (kotlin.jvm.internal.o.b(fVar != null ? fVar.f13236f : null, r0Var)) {
            aq5.p0.f13274b = null;
        }
        if (this.f13271e) {
            cq5.i iVar = cq5.i.f221543a;
            if (!cq5.i.f221545c && cq5.i.f221544b > 0) {
                aq5.p0 p0Var = aq5.p0.f13273a;
                jq5.l lVar = jq5.n.f301282a;
                cq5.b bVar = !lVar.c() ? cq5.b.f221503f : !lVar.e() ? cq5.b.f221504g : cq5.b.f221505h;
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "reportConnectUserEndIfStarted() res:" + bVar);
                iVar.e(bVar, 0);
            }
            if (!cq5.i.f221547e && cq5.i.f221546d > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "reportTransmitUserEndIfStarted()");
                iVar.h(cq5.h.f221540g);
            }
            if (!cq5.i.f221549g && cq5.i.f221548f > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "reportTotalUserEndIfStarted()");
                iVar.g(cq5.g.f221535g);
            }
        }
        i95.m c17 = i95.n0.c(gz.l.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "unInit");
        com.tencent.wechat.aff.local_connection.d.f217358c.m("F2F-Transfer");
        ((kp.s) ((gz.l) c17)).f310831d = null;
        return jz5.f0.f302826a;
    }
}
