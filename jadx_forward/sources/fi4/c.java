package fi4;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f344597d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f344598e;

    public c(hi4.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4290;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusprivatechatsend";
        lVar.f152197a = new pj4.i2();
        lVar.f152198b = new pj4.j2();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f344598e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendReq");
        pj4.i2 i2Var = (pj4.i2) fVar;
        i2Var.f436649d = item.f76600x4b6e82d5;
        i2Var.f436650e = item.f76598x35627aba;
        i2Var.f436651f = item.f76590x1d4a4a55;
        i2Var.f436652g = item.f76599x1f396f83;
        i2Var.f436653h = item.f76594x2b07e86f;
        i2Var.f436654i = item.f76592x6c03540b;
        i2Var.f436655m = item.f76593x5ef57e62;
        i2Var.f436657o = item.f76597x1c3513c9;
        i2Var.f436656n = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r()) + i2Var.f436657o + item.f76595x6edd4861 + '_' + c01.id.a() + "_greetingReply";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f344597d = callback;
        return mo9409x10f9447a(dispatcher, this.f344598e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4290;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusPrivateChatSend", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f344598e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendResp");
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f344597d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
