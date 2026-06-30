package ej4;

/* loaded from: classes.dex */
public final class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334896d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334897e;

    public i() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6868;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgetuserpermission";
        lVar.f152197a = new pj4.l1();
        lVar.f152198b = new pj4.m1();
        this.f334897e = lVar.a();
        jx3.f.INSTANCE.mo68477x336bdfd8(1629L, 6L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334896d = callback;
        return mo9409x10f9447a(dispatcher, this.f334897e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6868;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334897e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetUserPermissionResp");
            pj4.m1 m1Var = (pj4.m1) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "value: " + m1Var.f436715d);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_INPUT_LEVEL_LONG_SYNC, java.lang.Long.valueOf(m1Var.f436715d));
            if (m1Var.f436715d == 1) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1629L, 3L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1629L, 4L, 1L, false);
            }
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1629L, 5L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334896d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
