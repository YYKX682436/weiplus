package ej4;

/* loaded from: classes11.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334893d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334894e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334895f;

    public h(java.lang.String str) {
        this.f334893d = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5215;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgetselfinfo";
        lVar.f152197a = new pj4.h1();
        lVar.f152198b = new pj4.i1();
        this.f334895f = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334894e = callback;
        return mo9409x10f9447a(dispatcher, this.f334895f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5215;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334895f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfInfoResp");
            pj4.i1 i1Var = (pj4.i1) fVar;
            ai4.m0 m0Var = ai4.m0.f86706a;
            mj4.h b17 = m0Var.G().b(en1.a.a());
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str2 = this.f334893d;
            objArr[0] = str2;
            objArr[1] = b17 != null ? ((mj4.k) b17).l() : null;
            objArr[2] = java.lang.Integer.valueOf(i1Var.f436646d);
            objArr[3] = java.lang.Integer.valueOf(i1Var.f436648f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "GetSelfinfo back reqStatusId:%s, curStatusId:%s like:%s ref:%s", objArr);
            if (b17 != null) {
                mj4.k kVar = (mj4.k) b17;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.l(), str2)) {
                    mj4.j jVar = new mj4.j(kVar);
                    jVar.b(i1Var.f436646d);
                    jVar.f408599b.put("field_referenceCount", java.lang.Integer.valueOf(i1Var.f436648f));
                    si4.a.r(m0Var.G(), jVar.a(), false, 2, null);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334894e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
