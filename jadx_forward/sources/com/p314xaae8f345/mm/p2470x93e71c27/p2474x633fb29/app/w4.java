package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class w4 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    public dn.h A;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270646d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270647e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270650h;

    /* renamed from: i, reason: collision with root package name */
    public final long f270651i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f270652m;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f270655p;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f270648f = null;

    /* renamed from: g, reason: collision with root package name */
    public ot0.q f270649g = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f270653n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f270654o = true;

    /* renamed from: q, reason: collision with root package name */
    public z25.d f270656q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f270657r = false;

    /* renamed from: s, reason: collision with root package name */
    public long f270658s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f270659t = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f270660u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f270661v = false;

    /* renamed from: w, reason: collision with root package name */
    public final z25.e f270662w = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j4(this);

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f270663x = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v4(this);

    /* renamed from: y, reason: collision with root package name */
    public boolean f270664y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f270665z = 0;

    public w4(long j17, java.lang.String str, java.lang.String str2) {
        this.f270651i = -1L;
        this.f270652m = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$6
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                java.lang.String str3;
                ot0.q v17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                java.lang.String str4 = "";
                java.lang.String str5 = c5886xd11a0be72.f136194g.f87901a;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.this;
                if (str5.equals(w4Var.f270648f.f68099xfeae815)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                    java.lang.String e17 = s6Var.e(c5886xd11a0be72);
                    int c17 = s6Var.c(c5886xd11a0be72);
                    try {
                        str3 = java.net.URLEncoder.encode(e17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.io.UnsupportedEncodingException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneUploadAppAttach", e18, "", new java.lang.Object[0]);
                        str3 = "";
                    }
                    if (w4Var.f270665z == 1) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
                        m21.x xVar = new m21.x();
                        xVar.a("20toUser", w4Var.f270650h + ",");
                        xVar.a("21source", "4,");
                        xVar.a("22qrUrl", str3 + ",");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        dn.h hVar = w4Var.A;
                        sb6.append(hVar == null ? "" : hVar.f69526x419c9c3d);
                        sb6.append(",");
                        xVar.a("23md5", sb6.toString());
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        dn.h hVar2 = w4Var.A;
                        sb7.append(hVar2 == null ? "" : hVar2.f69522xf9dbbe9c);
                        sb7.append(",");
                        xVar.a("24cdnFileId", sb7.toString());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        dn.h hVar3 = w4Var.A;
                        sb8.append(hVar3 == null ? "" : hVar3.f69502xf11df5f5);
                        sb8.append(",");
                        xVar.a("25cdnAesKey", sb8.toString());
                        if (Li.k2() && (v17 = ot0.q.v(Li.j())) != null) {
                            str4 = v17.f430179d;
                        }
                        xVar.a("26appip", str4 + ",");
                        xVar.a("27toUsersCount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(w4Var.f270650h) + ",");
                        xVar.a("28codeType", c17 + ",");
                        xVar.a("29msgid", java.lang.Long.valueOf(Li.I0()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "report qrCodeImgChatting(13628): " + xVar.c());
                        v90.x xVar2 = (v90.x) i95.n0.c(v90.x.class);
                        java.lang.String m146697x9616526c = xVar.m146697x9616526c();
                        ((u90.v) xVar2).getClass();
                        com.p314xaae8f345.mm.p959x883644fd.i0.g(13628, m146697x9616526c);
                    }
                    w4Var.B.mo48814x2efc64();
                }
                return false;
            }
        };
        this.f270651i = j17;
        this.f270652m = str;
        this.f270655p = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pt6();
        lVar.f152198b = new r45.qt6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadappattach";
        lVar.f152200d = 220;
        lVar.f152201e = 105;
        lVar.f152202f = 1000000105;
        this.f270646d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", java.lang.Long.valueOf(j17), str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static void H(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var, java.lang.String str) {
        w4Var.getClass();
        e40.u uVar = (e40.u) i95.n0.c(e40.u.class);
        java.lang.String str2 = w4Var.f270648f.f68099xfeae815;
        ((bf5.o) uVar).getClass();
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(w4Var.f270648f.f68099xfeae815, com.p314xaae8f345.mm.vfs.w6.k(str2) >= ez.v0.f339310a.h() ? 130 : 6, str, null);
        java.lang.String str3 = w4Var.f270648f.f68099xfeae815;
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

    public final void J(dn.h hVar) {
        if (this.f270648f.f68114x2262335f != 2) {
            return;
        }
        this.f270665z = 1;
        if (this.f270664y) {
            return;
        }
        this.A = hVar;
        this.f270664y = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
        this.B.mo48813x58998cd();
        java.lang.String str = this.f270648f.f68099xfeae815;
        am.aq aqVar = c5884x4c2d9184.f136192g;
        aqVar.f87708b = str;
        aqVar.f87707a = java.lang.System.currentTimeMillis();
        c5884x4c2d9184.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0401 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06de  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r43, com.p314xaae8f345.mm.p944x882e457a.u0 r44) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 220;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 3 && i19 == -1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f270659t)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f270659t);
            return;
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + i18 + ", errCode = " + i19);
            fp.k.a();
            this.f270647e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.qt6 qt6Var = (r45.qt6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (qt6Var.m75945x2fec8307(1) != null && this.f270652m == null && (!qt6Var.m75945x2fec8307(1).equals(this.f270648f.f68094x28d45f97) || !qt6Var.m75945x2fec8307(3).equals(this.f270648f.f68095x97924316))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
            fp.k.a();
            this.f270647e.mo815x76e0bfae(3, -1, "", this);
            return;
        }
        if (qt6Var.m75939xb282bd08(5) >= 0 && qt6Var.m75939xb282bd08(5) == this.f270648f.f68113xeb1a61d6 && qt6Var.m75939xb282bd08(6) >= 0) {
            long m75939xb282bd08 = qt6Var.m75939xb282bd08(6);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f270648f;
            if (m75939xb282bd08 <= dVar.f68113xeb1a61d6) {
                dVar.f68109x90a9378 = qt6Var.m75939xb282bd08(6);
                this.f270648f.f68105x2c1f0acb = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.b(qt6Var.m75945x2fec8307(2)) ? qt6Var.m75945x2fec8307(2) : "";
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f270648f;
                if (dVar2.f68112x10a0fed7 == 105) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.f270648f.f68105x2c1f0acb + "," + this.f270648f.f68109x90a9378 + "] ");
                    this.f270647e.mo815x76e0bfae(i18, -1, "", this);
                    return;
                }
                if (dVar2.f68109x90a9378 == dVar2.f68113xeb1a61d6) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar2.f68105x2c1f0acb)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
                        fp.k.a();
                        this.f270647e.mo815x76e0bfae(3, -1, "", this);
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(this.f270648f.f72763xa3c65b86, bu.a.d(-4));
                        return;
                    }
                    this.f270648f.f68112x10a0fed7 = 199L;
                }
                boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(this.f270648f, new java.lang.String[0]);
                if (!mo9952xce0038c9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:" + mo9952xce0038c9);
                    fp.k.a();
                    J(null);
                    this.f270647e.mo815x76e0bfae(3, -1, "", this);
                    return;
                }
                if (this.f270648f.f68112x10a0fed7 == 199) {
                    this.f270647e.mo815x76e0bfae(0, 0, "", this);
                    return;
                } else {
                    if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f270647e) < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
                        this.f270647e.mo815x76e0bfae(3, -1, "", this);
                        return;
                    }
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
        fp.k.a();
        this.f270647e.mo815x76e0bfae(3, -1, "", this);
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
