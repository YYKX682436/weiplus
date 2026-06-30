package x83;

/* loaded from: classes5.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f534102d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f534103e;

    public h(java.lang.String nickName, java.lang.String bindMobile, int i17, boolean z17, java.lang.String extRegUrl, java.lang.String fileId, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindMobile, "bindMobile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extRegUrl, "extRegUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gn0();
        lVar.f152198b = new r45.hn0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/extreg";
        lVar.f152200d = 5888;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f534103e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        r45.gn0 gn0Var = (r45.gn0) fVar;
        gn0Var.f456902d = nickName;
        gn0Var.f456903e = bindMobile;
        gn0Var.f456904f = i17;
        gn0Var.f456905g = z17 ? 1 : 0;
        gn0Var.f456908m = extRegUrl;
        gn0Var.f456909n = fileId;
        gn0Var.f456910o = aesKey;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneExtReg", "fileId:" + fileId + ", aesKey:" + aesKey);
    }

    public final void H(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f534103e.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        ((r45.gn0) fVar).f456906h = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneExtReg", "setRegSessionId %s", str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s autoAuth, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoAuth, "autoAuth");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f534102d = callback;
        return mo9409x10f9447a(autoAuth, this.f534103e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5888;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) rr6;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f534102d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
        u0Var.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneExtReg", "errType:" + i18 + ", errCode:" + i19 + ", errType:" + str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }
}
