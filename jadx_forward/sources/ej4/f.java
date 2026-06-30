package ej4;

/* loaded from: classes8.dex */
public final class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334884d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334885e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.g1 f334886f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f334887g;

    /* renamed from: h, reason: collision with root package name */
    public final pj4.f1 f334888h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334889i;

    public f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Integer num, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        jz5.f0 f0Var = null;
        gVar = (i17 & 1) != 0 ? null : gVar;
        l17 = (i17 & 2) != 0 ? null : l17;
        l18 = (i17 & 4) != 0 ? null : l18;
        l19 = (i17 & 8) != 0 ? null : l19;
        num = (i17 & 16) != 0 ? null : num;
        this.f334887g = -1;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4245;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgetselfhistories";
        lVar.f152197a = new pj4.f1();
        lVar.f152198b = new pj4.g1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334885e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesReq");
        pj4.f1 f1Var = (pj4.f1) fVar;
        this.f334888h = f1Var;
        f1Var.f436572d = gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfHistories", "init: op=" + l17 + ", requestOp=" + num + ", startKey=" + l18 + ", limit=" + l19);
        if (l17 != null) {
            l17.longValue();
            f1Var.f436573e = l17.longValue();
            this.f334887g = java.lang.Integer.valueOf((int) l17.longValue());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f334887g = 0;
        }
        if (num != null) {
            num.intValue();
            this.f334887g = num;
        }
        if (l18 != null) {
            l18.longValue();
            f1Var.f436574f = l18.longValue();
        }
        if (l19 != null) {
            l19.longValue();
            f1Var.f436575g = l19.longValue();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334884d = callback;
        return mo9409x10f9447a(dispatcher, this.f334885e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4245;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfHistories", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334885e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesResp");
            this.f334886f = (pj4.g1) fVar;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334884d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
