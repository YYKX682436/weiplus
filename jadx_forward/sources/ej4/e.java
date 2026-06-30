package ej4;

/* loaded from: classes4.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f334873d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334874e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334875f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.e1 f334876g;

    public e(long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Integer num) {
        this.f334873d = num;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4255;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgeticonconfig";
        lVar.f152197a = new pj4.d1();
        lVar.f152198b = new pj4.e1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334875f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigReq");
        pj4.d1 d1Var = (pj4.d1) fVar;
        d1Var.f436552d = j17;
        d1Var.f436553e = l17 != null ? l17.longValue() : 0L;
        d1Var.f436554f = l18 != null ? l18.longValue() : 0L;
        pj4.h0 h0Var = new pj4.h0();
        h0Var.f436611d = "weapp_panel";
        h0Var.f436612e = l19 != null ? l19.longValue() : 0L;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(h0Var);
        d1Var.f436556h = linkedList;
        d1Var.f436555g = num != null ? num.intValue() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "key:" + j17 + " coverAgendaKey:" + l17 + " keyValueConfigKey:" + l18 + " flag:" + num);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334874e = callback;
        return mo9409x10f9447a(dispatcher, this.f334875f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4255;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334875f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigResp");
            this.f334876g = (pj4.e1) fVar;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334874e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
