package ej4;

/* loaded from: classes8.dex */
public final class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334870d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334871e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.c1 f334872f;

    public d(java.lang.String str, java.lang.String str2, pj4.m2 m2Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6889;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgetbrandinfo";
        lVar.f152197a = new pj4.b1();
        lVar.f152198b = new pj4.c1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334871e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoReq");
        pj4.b1 b1Var = (pj4.b1) fVar;
        b1Var.f436525d = str;
        b1Var.f436526e = str2;
        b1Var.f436527f = m2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url:");
        sb6.append(str);
        sb6.append(" signature:");
        sb6.append(str2);
        sb6.append(", extInfo:");
        java.lang.String str3 = null;
        if (m2Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("pay_sign:[");
            pj4.q qVar = m2Var.f436716d;
            if (qVar != null) {
                str3 = "transaction_id:" + qVar.f436788d + " pay_signature:" + qVar.f436789e;
            }
            sb7.append(str3);
            sb7.append("] source_id:");
            sb7.append(m2Var.f436717e);
            sb7.append(" mp_signature:");
            sb7.append(m2Var.f436718f);
            str3 = sb7.toString();
        }
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334870d = callback;
        return mo9409x10f9447a(dispatcher, this.f334871e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6889;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334871e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoResp");
            this.f334872f = (pj4.c1) fVar;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334870d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
