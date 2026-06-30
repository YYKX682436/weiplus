package uu1;

/* loaded from: classes.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f512797d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pr1 f512798e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f512799f;

    public a(java.lang.String ticket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.or1();
        lVar.f152198b = new r45.pr1();
        lVar.f152200d = 4261;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f512797d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationRequest");
        r45.or1 or1Var = (r45.or1) fVar;
        or1Var.set(6, 3);
        or1Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        or1Var.set(4, ticket);
        m48017xd0f4c159(true);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "doScene");
        this.f512799f = u0Var;
        return mo9409x10f9447a(sVar, this.f512797d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4261;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.o82 o82Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationResponse");
        this.f512798e = (r45.pr1) fVar;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastFailedNetSceneCallbackFailedReport");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 2L, 1L);
        }
        r45.pr1 pr1Var = this.f512798e;
        if (pr1Var == null || (o82Var = (r45.o82) pr1Var.m75936x14adae67(2)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f512799f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "response is " + o82Var.m75945x2fec8307(0) + " and " + o82Var.m75945x2fec8307(1) + " and " + o82Var.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSceneCallbackSuccReport");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 3L, 1L);
    }
}
