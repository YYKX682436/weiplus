package jy3;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jy3.b f384036f = new jy3.b(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384037d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f384038e;

    public c() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.go();
        lVar.f152198b = new r45.ho();
        lVar.f152199c = "/cgi-bin/mmiot-bin/mmiot/mmiot_build_device_secure_channel";
        lVar.f152200d = 5043;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f384038e = lVar.a();
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g H(java.lang.String base64) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64, "base64");
        try {
            return new com.p314xaae8f345.mm.p2495xc50a8b8b.g(android.util.Base64.decode(base64, 0));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "decodeBase64.:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public final r45.ho I() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f384038e;
        if (oVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
            if (oVar.f152244b.f152233a != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelResp");
                return (r45.ho) fVar;
            }
        }
        return null;
    }

    public final void J(jy3.a handShakeBody) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handShakeBody, "handShakeBody");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f384038e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152243a.f152217a : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelReq");
        r45.go goVar = (r45.go) fVar;
        goVar.f456923g = handShakeBody.f384026a;
        r45.j40 j40Var = new r45.j40();
        j40Var.f459104d = H(handShakeBody.f384027b);
        j40Var.f459106f = H(handShakeBody.f384028c);
        j40Var.f459107g = H(handShakeBody.f384029d);
        goVar.f456920d = j40Var;
        r45.l40 l40Var = new r45.l40();
        l40Var.f460655d = H(handShakeBody.f384030e);
        goVar.f456921e = l40Var;
        r45.c40 c40Var = new r45.c40();
        c40Var.f452794d = H(handShakeBody.f384031f);
        c40Var.f452795e = H(handShakeBody.f384032g);
        c40Var.f452796f = handShakeBody.f384033h;
        c40Var.f452798h = handShakeBody.f384035j;
        c40Var.f452797g = handShakeBody.f384034i;
        goVar.f456922f = c40Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384037d = u0Var;
        return mo9409x10f9447a(sVar, this.f384038e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5043;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + ' ' + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f384037d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
        u0Var.mo815x76e0bfae(i18, i19, str, this);
    }
}
