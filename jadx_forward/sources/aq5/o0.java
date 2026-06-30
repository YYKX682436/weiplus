package aq5;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.r0 f94803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f94804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(aq5.r0 r0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94803d = r0Var;
        this.f94804e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq5.o0(this.f94803d, this.f94804e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        aq5.o0 o0Var = (aq5.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unInit() called initResult:");
        aq5.r0 r0Var = this.f94803d;
        sb6.append(r0Var != null ? new java.lang.Integer(r0Var.f94824a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.F2FService", sb6.toString());
        aq5.f fVar = aq5.p0.f94807b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar != null ? fVar.f94769f : null, r0Var)) {
            aq5.p0.f94807b = null;
        }
        if (this.f94804e) {
            cq5.i iVar = cq5.i.f303076a;
            if (!cq5.i.f303078c && cq5.i.f303077b > 0) {
                aq5.p0 p0Var = aq5.p0.f94806a;
                jq5.l lVar = jq5.n.f382815a;
                cq5.b bVar = !lVar.c() ? cq5.b.f303036f : !lVar.e() ? cq5.b.f303037g : cq5.b.f303038h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FReportService", "reportConnectUserEndIfStarted() res:" + bVar);
                iVar.e(bVar, 0);
            }
            if (!cq5.i.f303080e && cq5.i.f303079d > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FReportService", "reportTransmitUserEndIfStarted()");
                iVar.h(cq5.h.f303073g);
            }
            if (!cq5.i.f303082g && cq5.i.f303081f > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FReportService", "reportTotalUserEndIfStarted()");
                iVar.g(cq5.g.f303068g);
            }
        }
        i95.m c17 = i95.n0.c(gz.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "unInit");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.m("F2F-Transfer");
        ((kp.s) ((gz.l) c17)).f392364d = null;
        return jz5.f0.f384359a;
    }
}
