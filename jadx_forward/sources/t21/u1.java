package t21;

/* loaded from: classes12.dex */
public class u1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496492d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f496493e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f496495g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f496496h;

    /* renamed from: i, reason: collision with root package name */
    public dn.h f496497i;

    /* renamed from: m, reason: collision with root package name */
    public final m11.a0 f496498m;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f496499n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f496500o;

    /* renamed from: p, reason: collision with root package name */
    public t21.v2 f496501p;

    /* renamed from: q, reason: collision with root package name */
    public dn.h f496502q;

    /* renamed from: r, reason: collision with root package name */
    public p25.e f496503r;

    /* renamed from: s, reason: collision with root package name */
    public final z25.e f496504s = new t21.w1(this);

    public u1(java.lang.String str, int i17, dn.h hVar, m11.a0 a0Var) {
        this.f496494f = null;
        this.f496495g = 0;
        this.f496497i = null;
        this.f496498m = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, a0Var != null);
        this.f496494f = str;
        this.f496497i = hVar;
        this.f496498m = a0Var;
        this.f496495g = i17;
    }

    public static int H(t21.u1 u1Var) {
        int i17;
        u1Var.getClass();
        int i18 = 0;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, u1Var.f496499n.d(), false);
        if (d61.c.a(rj6)) {
            d61.b bVar = new d61.b();
            long a17 = bVar.a(rj6);
            long j17 = bVar.f308244a;
            if (a17 < 131072 && a17 > 0 && (i17 = u1Var.f496499n.f496548m) > 5) {
                long j18 = bVar.f308245b;
                if (j18 > 0 && j17 > 0 && (i18 = ((int) j17) + ((int) ((j18 * 5) / i17))) <= 131072) {
                    i18 += 131072;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", u1Var.K(), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(u1Var.f496499n.f496548m), java.lang.Long.valueOf(bVar.f308245b));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length but it not mp4.", u1Var.K());
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u1.I(java.lang.String):java.lang.String");
    }

    public final void J(t21.v2 v2Var, dn.h hVar, dn.h hVar2) {
        zz.b hj6;
        t21.v2 h17;
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496544i = 199;
        v2Var.U = 2098436;
        t21.d3.Q(v2Var);
        java.lang.String str = v2Var.S;
        if (t21.d3.s() && hVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (h17 = t21.d3.h(str)) != null) {
            h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            h17.f496544i = 199;
            h17.U = cc1.y.f4296x366c91de;
            t21.d3.Q(h17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f496499n.h(), this.f496499n.f496549n);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) {
            java.lang.String str2 = this.f496494f;
            if (hVar != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, str2, false);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str2, false);
                if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.f())) {
                        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(tj6);
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.mo78013xfb85f7b0(), hVar.f69526x419c9c3d, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video thumb dup, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.mo78013xfb85f7b0(), p17, null).f559224a);
                    } else {
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f496499n.f(), rj6, tj6, Li.mo78013xfb85f7b0(), this.f496499n.f496548m, com.p314xaae8f345.mm.vfs.w6.p(this.f496499n.f()));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup, fileName = " + str2 + " result = " + hj6.f559224a);
                }
            }
            if (hVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
            if (com.p314xaae8f345.mm.vfs.w6.j(Ai)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup origin, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(Ai, Li.mo78013xfb85f7b0(), hVar2.f69526x419c9c3d, null).f559224a);
            }
        }
    }

    public final java.lang.String K() {
        return this.f496494f + "_" + hashCode();
    }

    public final void L(int i17, int i18, java.lang.String str, r45.c06 c06Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        this.f496499n.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (c06Var != null) {
            this.f496499n.f496537c = c06Var.f452728d;
            this.f496496h = c06Var.f452729e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s dkmsgid  set svrmsgid %d -> %d", K(), java.lang.Long.valueOf(this.f496499n.f496537c), java.lang.Integer.valueOf(x51.o1.f533598r));
        if (10007 == x51.o1.f533597q && (i19 = x51.o1.f533598r) != 0) {
            t21.v2 v2Var = this.f496499n;
            if (v2Var.f496537c != 0) {
                v2Var.f496537c = i19;
                x51.o1.f533598r = 0;
            }
        }
        t21.v2 v2Var2 = this.f496499n;
        v2Var2.U = 1028;
        t21.d3.Q(v2Var2);
        java.lang.String str2 = this.f496494f;
        if (c06Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f496499n.h(), true);
            if (((n17 == null || ((int) n17.E2) <= 0) ? false : n17.k2()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(this.f496499n.h())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s upload to biz :%s", K(), this.f496499n.h());
                if (this.f496499n.f496537c < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f496499n.f496537c + " file:" + str2 + " toUser:" + this.f496499n.h());
                    t21.d3.G(str2);
                    this.f496498m.a(3, -1, 0L, "");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s not upload to biz", K());
                if (this.f496499n.f496537c <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f496499n.f496537c + " file:" + str2 + " toUser:" + this.f496499n.h());
                    t21.d3.G(str2);
                    this.f496498m.a(3, -1, 0L, "");
                }
            }
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str2, false);
        java.lang.String I = I(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, false));
        z25.f fVar = new z25.f();
        t21.v2 v2Var3 = this.f496499n;
        fVar.f551332j = v2Var3.f496549n;
        fVar.f551337o = v2Var3.h();
        fVar.f551325c = this.f496504s;
        fVar.f551324b = 2;
        fVar.f551323a = 4;
        fVar.f551326d = rj6;
        fVar.f551327e = I;
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar = new z25.d();
        this.f496503r = dVar;
        dVar.d(fVar);
        f65.y0.f341552a.j(str2, f65.y.f341548f);
        this.f496492d.mo815x76e0bfae(i17, i18, str, m1Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        p25.e eVar = this.f496503r;
        if (eVar != null) {
            ((z25.d) eVar).f();
        }
        super.mo9408xae7a2e7a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r21, com.p314xaae8f345.mm.p944x882e457a.u0 r22) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u1.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6828;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra onGYNetEnd errtype[%d %d]", K(), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.c06 c06Var = (r45.c06) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.String str2 = this.f496494f;
        t21.v2 h17 = t21.d3.h(str2);
        this.f496499n = h17;
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd Get INFO FAILED :" + str2);
            this.f496492d.mo815x76e0bfae(i18, i19, str, this);
            this.f496498m.a(3, -1, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == 102) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496499n.h());
            this.f496492d.mo815x76e0bfae(i18, i19, str, this);
            this.f496498m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == -22) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd BLACK  errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496499n.h());
            t21.d3.D(str2);
            this.f496492d.mo815x76e0bfae(i18, i19, str, this);
            this.f496498m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd SERVER FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496499n.h());
            t21.d3.G(str2);
            this.f496492d.mo815x76e0bfae(i18, i19, str, this);
            this.f496498m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 0 && i19 == 0) {
            L(i18, i19, str, c06Var, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496499n.h());
        t21.d3.G(str2);
        this.f496492d.mo815x76e0bfae(i18, i19, str, this);
        this.f496498m.a(i18, i19, 0L, "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        t21.d3.G(this.f496494f);
    }
}
