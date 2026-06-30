package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class z4 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f270716d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270717e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270718f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f270719g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f270720h;

    /* renamed from: i, reason: collision with root package name */
    public long f270721i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f270723n;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f270722m = true;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f270724o = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y4(this, null);

    /* renamed from: p, reason: collision with root package name */
    public long f270725p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f270726q = "";

    /* renamed from: r, reason: collision with root package name */
    public final dn.k f270727r = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x4(this);

    public z4(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        this.f270716d = 8192;
        dVar.f68109x90a9378 = 0L;
        dVar.f68101x13f40970 = true;
        I(true);
        dVar.f68112x10a0fed7 = 101;
        dVar.f68108x6a1cf14e = 0L;
        this.f270719g = str;
        this.f270720h = dVar;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40095x80cd5fb5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            this.f270716d = 32768;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pt6();
        lVar.f152198b = new r45.qt6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadappattach";
        lVar.f152200d = 220;
        lVar.f152201e = 105;
        lVar.f152202f = 1000000105;
        this.f270717e = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig new NetSceneUploadAppAttachForHandOff stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d H(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a abstractC16084xdca2b46a) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68113xeb1a61d6 = abstractC16084xdca2b46a.getSize();
        dVar.f68099xfeae815 = abstractC16084xdca2b46a.getFullPath();
        dVar.f68110xfc39fee = 0L;
        dVar.f68094x28d45f97 = "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        dVar.f68095x97924316 = sb6.toString();
        dVar.f68114x2262335f = 0L;
        dVar.f68112x10a0fed7 = 200L;
        dVar.f68101x13f40970 = true;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        dVar.f68105x2c1f0acb = "" + java.lang.System.currentTimeMillis();
        dVar.f68102x141a7c95 = 0;
        return dVar;
    }

    public final int I(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r34, com.p314xaae8f345.mm.p944x882e457a.u0 r35) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 220;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        android.os.Handler handler = this.f270724o;
        if (i18 == 3 && i19 == -1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270726q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttachForHandOff", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f270726q);
            this.f270723n = false;
            handler.removeMessages(1);
            return;
        }
        java.lang.String str2 = this.f270719g;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : errType = " + i18 + ", errCode = " + i19);
            this.f270723n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        r45.qt6 qt6Var = (r45.qt6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.String m75945x2fec8307 = qt6Var.m75945x2fec8307(1);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f270720h;
        if (m75945x2fec8307 != null && (!qt6Var.m75945x2fec8307(1).equals(dVar.f68094x28d45f97) || !qt6Var.m75945x2fec8307(3).equals(dVar.f68095x97924316))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "argument is not consistent");
            this.f270723n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        if (qt6Var.m75939xb282bd08(5) < 0 || qt6Var.m75939xb282bd08(5) != dVar.f68113xeb1a61d6 || qt6Var.m75939xb282bd08(6) < 0 || qt6Var.m75939xb282bd08(6) > dVar.f68113xeb1a61d6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "dataLen, startPos or totalLen is incorrect");
            this.f270723n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        dVar.f68109x90a9378 = qt6Var.m75939xb282bd08(6);
        dVar.f68105x2c1f0acb = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.b(qt6Var.m75945x2fec8307(2)) ? qt6Var.m75945x2fec8307(2) : "";
        if (dVar.f68112x10a0fed7 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd STATUS PAUSE [" + dVar.f68105x2c1f0acb + "," + dVar.f68109x90a9378 + "] ");
            this.f270723n = false;
            handler.removeMessages(1);
            return;
        }
        long j17 = dVar.f68109x90a9378;
        if (j17 != dVar.f68113xeb1a61d6) {
            this.f270721i = j17;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f68105x2c1f0acb)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "finish upload but mediaid == null!");
                this.f270723n = false;
                handler.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
                return;
            }
            dVar.f68112x10a0fed7 = 199L;
        }
        if (dVar.f68112x10a0fed7 == 199) {
            this.f270723n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).e7(str2, dVar.f68094x28d45f97, (int) dVar.f68110xfc39fee, dVar.f68105x2c1f0acb);
        } else if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f270718f) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : doScene fail");
            this.f270723n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3200;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
