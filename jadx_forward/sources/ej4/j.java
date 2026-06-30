package ej4;

/* loaded from: classes8.dex */
public final class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334898d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334899e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334900f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334901g;

    public j(java.lang.String topicId, java.lang.String statusId, java.lang.String userName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicId, "topicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f334898d = statusId;
        this.f334899e = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4099;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatuslike";
        lVar.f152197a = new pj4.z1();
        lVar.f152198b = new pj4.a2();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334901g = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeReq");
        pj4.z1 z1Var = (pj4.z1) fVar;
        z1Var.f436894d = topicId;
        z1Var.f436895e = statusId;
        z1Var.f436896f = userName;
        z1Var.f436897g = i17;
        z1Var.f436898h = i18;
        z1Var.f436899i = statusId + c01.id.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusLike", "topicId:" + topicId + ", statusId:" + statusId + ", username:" + userName + ", action:" + i17 + ", type:" + i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334900f = callback;
        return mo9409x10f9447a(dispatcher, this.f334901g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4099;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusLike", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334901g.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeResp");
            ai4.m0.f86706a.v(this.f334898d, this.f334899e != 1);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334900f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
