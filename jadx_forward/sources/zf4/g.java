package zf4;

/* loaded from: classes13.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f554189d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f554190e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f554191f;

    /* renamed from: g, reason: collision with root package name */
    public long f554192g;

    /* renamed from: h, reason: collision with root package name */
    public int f554193h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f554194i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f554195m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f554196n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f554197o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new zf4.f(this), true);

    public g(java.lang.String str) {
        iz5.a.g(null, str != null);
        this.f554191f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        boolean z17;
        int i17;
        int i18;
        this.f554189d = u0Var;
        this.f554195m = false;
        java.lang.String str = this.f554191f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
            this.f554193h = fp.k.a() + 10000;
            return -1;
        }
        zf4.q c17 = zf4.r.c(str);
        if (c17 != null) {
            int i19 = c17.f68517x10a0fed7;
            if ((i19 > 1 && i19 <= 3) || i19 == 8) {
                zf4.q c18 = zf4.r.c(str);
                if (c18 != null && (i18 = c18.f68513x6bdfe16e) < 80) {
                    c18.f68513x6bdfe16e = i18 + 1;
                    c18.U = 16384;
                    z17 = zf4.r.f(c18);
                } else {
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:".concat(str));
                    zf4.r.e(str);
                    this.f554193h = fp.k.a() + 10000;
                    return -1;
                }
                zf4.h hVar = new zf4.h();
                int i27 = c17.f68517x10a0fed7;
                if (i27 == 8) {
                    this.f554196n = 1;
                    zf4.r.a(c17.f68507xf1f75bac);
                    i17 = 1;
                } else {
                    if (i27 == 3) {
                        this.f554195m = true;
                    }
                    zf4.i d17 = zf4.r.d(str);
                    if (d17 == null) {
                        this.f554193h = fp.k.a() + 10000;
                        return -1;
                    }
                    hVar = d17.b(c17.f68514x90a9378, 6000);
                    fp.k.a();
                    if (hVar.f554201d < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] read ret:" + hVar.f554201d + " readlen:" + hVar.f554199b + " newOff:" + hVar.f554200c + " netOff:" + c17.f68514x90a9378);
                        zf4.r.e(str);
                        this.f554193h = fp.k.a() + 10000;
                        return -1;
                    }
                    int i28 = hVar.f554200c;
                    this.f554194i = i28;
                    if (i28 < c17.f68514x90a9378 || i28 >= 469000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] newOff:" + this.f554194i + " OldtOff:" + c17.f68514x90a9378);
                        zf4.r.e(str);
                        this.f554193h = fp.k.a() + 10000;
                        return -1;
                    }
                    this.f554196n = 0;
                    int i29 = hVar.f554199b;
                    if (i29 == 0 && !this.f554195m) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + str + " No Data temperature , will be retry");
                        zf4.r.e(str);
                        this.f554193h = fp.k.a() + 10000;
                        return -1;
                    }
                    if (this.f554195m) {
                        int i37 = c17.f68518xeb1ad9f6;
                        if (i37 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] read totalLen:" + c17.f68518xeb1ad9f6);
                            zf4.r.e(str);
                            this.f554193h = fp.k.a() + 10000;
                            return -1;
                        }
                        if (i37 > i28 && i29 < 6000) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] readlen:" + hVar.f554199b + " newOff:" + hVar.f554200c + " netOff:" + c17.f68514x90a9378 + " totalLen:" + c17.f68518xeb1ad9f6);
                            zf4.r.e(str);
                            this.f554193h = fp.k.a() + 10000;
                            return -1;
                        }
                        if (i37 <= i28) {
                            this.f554196n = 1;
                        }
                    }
                    i17 = 0;
                }
                int i38 = c17.f68521x920b456b;
                if (i38 == 0) {
                    i38 = ((this.f554194i - 6) / 32) * 20;
                }
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.cv6();
                lVar.f152198b = new r45.dv6();
                lVar.f152199c = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
                lVar.f152200d = 329;
                lVar.f152201e = 157;
                lVar.f152202f = 1000000157;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                this.f554190e = a17;
                r45.cv6 cv6Var = (r45.cv6) a17.f152243a.f152217a;
                cv6Var.set(0, c01.z1.r());
                cv6Var.set(1, c17.f68519x22628ff0);
                cv6Var.set(2, java.lang.Integer.valueOf(c17.f68514x90a9378));
                cv6Var.set(4, c17.f68505x53e843cb);
                cv6Var.set(6, java.lang.Integer.valueOf(i38));
                cv6Var.set(8, java.lang.Integer.valueOf(this.f554196n));
                cv6Var.set(15, java.lang.Long.valueOf(c17.f68511x297eb8d7));
                cv6Var.set(10, java.lang.Integer.valueOf(i17));
                cv6Var.set(13, java.lang.Integer.valueOf((int) (c17.f68506xad24a2e / 1000)));
                cv6Var.set(12, 1);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(c17.f68519x22628ff0)) {
                    cv6Var.set(17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(c17.f68519x22628ff0));
                }
                if (i17 != 1) {
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.e(hVar.f554198a, 0, hVar.f554199b);
                    cv6Var.set(7, cu5Var);
                    cv6Var.set(3, java.lang.Integer.valueOf(hVar.f554199b));
                } else {
                    r45.cu5 cu5Var2 = new r45.cu5();
                    cu5Var2.c(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[1]));
                    cv6Var.set(7, cu5Var2);
                    cv6Var.set(3, 1);
                }
                cv6Var.m75942xfb822ef2(15);
                cv6Var.m75945x2fec8307(1);
                cv6Var.m75939xb282bd08(2);
                int i39 = ((r45.cu5) cv6Var.m75936x14adae67(7)).f453372d;
                cv6Var.m75939xb282bd08(8);
                this.f554192g = java.lang.System.currentTimeMillis();
                return mo9409x10f9447a(sVar, this.f554190e, this);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:".concat(str));
        this.f554193h = fp.k.a() + 10000;
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 329;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r23, int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p971x6de15a2e.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf4.g.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 240;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.cv6 cv6Var = (r45.cv6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        cv6Var.m75939xb282bd08(2);
        int i17 = ((r45.cu5) cv6Var.m75936x14adae67(7)).f453372d;
        cv6Var.m75939xb282bd08(8);
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        zf4.r.e(this.f554191f);
    }
}
