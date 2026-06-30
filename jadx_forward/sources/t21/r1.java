package t21;

/* loaded from: classes12.dex */
public class r1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496455d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f496456e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496457f;

    /* renamed from: g, reason: collision with root package name */
    public final int f496458g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f496459h;

    /* renamed from: i, reason: collision with root package name */
    public dn.h f496460i;

    /* renamed from: m, reason: collision with root package name */
    public final m11.a0 f496461m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f496462n;

    /* renamed from: o, reason: collision with root package name */
    public t21.v2 f496463o;

    /* renamed from: p, reason: collision with root package name */
    public int f496464p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f496465q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f496466r;

    /* renamed from: s, reason: collision with root package name */
    public t21.v2 f496467s;

    /* renamed from: t, reason: collision with root package name */
    public dn.h f496468t;

    /* renamed from: u, reason: collision with root package name */
    public final dn.k f496469u = new t21.t1(this);

    public r1(java.lang.String str, int i17, dn.h hVar, m11.a0 a0Var, boolean z17) {
        this.f496457f = null;
        this.f496458g = 0;
        this.f496460i = null;
        this.f496461m = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, a0Var != null);
        this.f496457f = str;
        this.f496460i = hVar;
        this.f496461m = a0Var;
        this.f496458g = i17;
        this.f496465q = z17;
    }

    public static void H(t21.r1 r1Var) {
        if (r1Var.f496467s == null) {
            return;
        }
        t21.v2 v2Var = r1Var.f496463o;
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("upvideo", v2Var.f496545j, v2Var.h(), r1Var.f496463o.S);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra genClientId failed not use cdn file:%s", r1Var.L(), r1Var.f496463o.d());
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(r1Var.f496463o.h(), r1Var.f496463o.f496549n);
        java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
        r1Var.f496462n = b17;
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_NetSceneUploadVideo_1";
        mVar.f323320f = r1Var.f496469u;
        mVar.f69601xaca5bdda = b17;
        mVar.f69595x6d25b0d9 = Ai;
        mVar.f69580x454032b6 = 11;
        mVar.f69592xf1ebe47b = 4;
        mVar.f69618x114ef53e = r1Var.f496463o.h();
        mVar.N = "HDVideo:1";
        mVar.f69587xa6fe74c = !com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(r1Var.f496463o.h()) && r1Var.f496465q;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(r1Var.f496463o.h())) {
            mVar.f69611x9257a74a = false;
        } else if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e4.b(Ai)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(106L, 30L, 1L, false);
        }
        mVar.f69598x47e3df1e = 1;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20520xd53518e6()) == 1) {
            java.lang.String I = r1Var.I(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, r1Var.f496463o.d(), false));
            mVar.f69619xe9ed65f6 = I;
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(I);
            r1Var.f496464p = k17;
            if (k17 >= 5242880) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", r1Var.L(), mVar.f69619xe9ed65f6, java.lang.Integer.valueOf(r1Var.f496464p));
                return;
            }
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r1Var.f496463o.g(), "msg", null);
        if (d17 != null) {
            mVar.f69591xf9dbbe9c = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
            mVar.f69575xf11df5f5 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideoaeskey");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69591xf9dbbe9c) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69575xf11df5f5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra parse video recv xml failed", r1Var.L());
                try {
                    java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseVideoHash");
                    if (d18 == null) {
                        d18 = "";
                    }
                    java.lang.String[] split = d18.split(",");
                    gm0.j1.i();
                    int b18 = kk.m.b(gm0.j1.b().h(), 100);
                    boolean z17 = split != null && split.length >= 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0) >= b18;
                    boolean z18 = split != null && split.length >= 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0) >= b18;
                    if (split != null && split.length >= 3) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
                    }
                    if (z65.c.a()) {
                        z18 = true;
                        z17 = true;
                    }
                    java.lang.String[] i17 = z17 ? t21.o2.Ui().i(Ai, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0)) : null;
                    if (z18 && i17 != null && i17.length == 2) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(i17[0], "null")) {
                            mVar.f69591xf9dbbe9c = i17[0];
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(i17[1], "null")) {
                            mVar.f69575xf11df5f5 = i17[1];
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "Check use videohash :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra parse video recv xml failed", r1Var.L());
            try {
                java.lang.String d19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseVideoHash");
                if (d19 == null) {
                    d19 = "";
                }
                java.lang.String[] split2 = d19.split(",");
                gm0.j1.i();
                int b19 = kk.m.b(gm0.j1.b().h(), 100);
                boolean z19 = split2 != null && split2.length >= 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[0], 0) >= b19;
                boolean z27 = split2 != null && split2.length >= 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[1], 0) >= b19;
                if (split2 != null && split2.length >= 3) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[2], 0);
                }
                if (z65.c.a()) {
                    z27 = true;
                    z19 = true;
                }
                java.lang.String[] i18 = z19 ? t21.o2.Ui().i(Ai, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[2], 0)) : null;
                if (z27 && i18 != null && i18.length == 2) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(i18[0], "null")) {
                        mVar.f69591xf9dbbe9c = i18[0];
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(i18[1], "null")) {
                        mVar.f69575xf11df5f5 = i18[1];
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "Check use videohash :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69575xf11df5f5)) {
            mVar.f69575xf11df5f5 = "";
            mVar.f69591xf9dbbe9c = "";
            mVar.f69575xf11df5f5 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi();
            mVar.f69587xa6fe74c = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s summersafecdn check hit cache VideoHash origin video :%s %s %s %b %d", r1Var.L(), mVar.f69601xaca5bdda, mVar.f69591xf9dbbe9c, mVar.f69575xf11df5f5, java.lang.Boolean.valueOf(r1Var.f496465q), java.lang.Integer.valueOf(mVar.f69598x47e3df1e));
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10228x8998e7bb(Ai)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "origin video upload h265, set file format to x265");
            mVar.f69590xe1500f8 = 2;
        } else {
            mVar.f69590xe1500f8 = 1;
        }
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 226L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra addSendTask failed.", r1Var.L());
            r1Var.f496462n = "";
        } else {
            f65.y0 y0Var = f65.y0.f341552a;
            java.lang.String str = r1Var.f496457f;
            if (str == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).b(new f65.h0(str), "MicroMsg.VideoSendReporter");
        }
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
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.I(java.lang.String):java.lang.String");
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
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f496463o.h(), this.f496463o.f496549n);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        this.f496455d.mo815x76e0bfae(0, 0, "", this);
        if (!t21.d3.t() || this.f496459h == null) {
            this.f496461m.a(0, 0, 0L, "");
        }
        dn.h hVar3 = this.f496468t;
        if (hVar3 != null) {
            K(hVar3);
        } else {
            K(hVar);
        }
        if (z17) {
            java.lang.String str2 = this.f496457f;
            if (hVar != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, str2, false);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str2, false);
                if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.f())) {
                        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(tj6);
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.mo78013xfb85f7b0(), hVar.f69526x419c9c3d, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video thumb dup, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.mo78013xfb85f7b0(), p17, null).f559224a);
                    } else {
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f496463o.f(), rj6, tj6, Li.mo78013xfb85f7b0(), this.f496463o.f496548m, com.p314xaae8f345.mm.vfs.w6.p(this.f496463o.f()));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup, fileName = " + str2 + " result = " + hj6.f559224a);
                }
            }
            if (hVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
            if (com.p314xaae8f345.mm.vfs.w6.j(Ai)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup origin, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(Ai, Li.mo78013xfb85f7b0(), hVar2.f69526x419c9c3d, null).f559224a);
            }
        }
    }

    public final void K(dn.h hVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f496463o.h(), this.f496463o.f496549n);
        t21.i2.wi().Ri(hVar, new wf0.l1(this.f496457f, bm5.f0.f104104s), !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f496463o.M) ? this.f496463o.M : c01.ia.v(Li.G), Li.I0());
    }

    public final java.lang.String L() {
        return this.f496457f + "_" + hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0406 A[Catch: Exception -> 0x043b, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0429 A[Catch: Exception -> 0x043b, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0436 A[Catch: Exception -> 0x043b, TRY_LEAVE, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(int r33, int r34, java.lang.String r35, r45.c06 r36, com.p314xaae8f345.mm.p944x882e457a.m1 r37) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.M(int, int, java.lang.String, r45.c06, com.tencent.mm.modelbase.m1):void");
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
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        t21.v2 v2Var = this.f496463o;
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(v2Var.f496549n, v2Var.f496553r), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6828;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra onGYNetEnd errtype[%d %d]", L(), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.c06 c06Var = (r45.c06) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.String str2 = this.f496457f;
        t21.v2 h17 = t21.d3.h(str2);
        this.f496463o = h17;
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd Get INFO FAILED :" + str2);
            f65.y0.f341552a.l(null, this.f496457f, 5, 0L, 0L, 0L, 0L, this.f496466r != null, -1);
            this.f496455d.mo815x76e0bfae(i18, i19, str, this);
            this.f496461m.a(3, -1, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == 102) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496463o.h());
            f65.y0.f341552a.l(null, this.f496457f, 4, 0L, 0L, 0L, 0L, this.f496466r != null, i19);
            this.f496455d.mo815x76e0bfae(i18, i19, str, this);
            this.f496461m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == -22) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd BLACK  errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496463o.h());
            f65.y0.f341552a.l(null, this.f496457f, 4, 0L, 0L, 0L, 0L, this.f496466r != null, i19);
            t21.d3.D(str2);
            this.f496455d.mo815x76e0bfae(i18, i19, str, this);
            this.f496461m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd SERVER FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496463o.h());
            t21.d3.G(str2);
            f65.y0.f341552a.l(null, this.f496457f, 4, 0L, 0L, 0L, 0L, this.f496466r != null, i19);
            this.f496455d.mo815x76e0bfae(i18, i19, str, this);
            this.f496461m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 0 && i19 == 0) {
            M(i18, i19, str, c06Var, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f496463o.h());
        t21.d3.G(str2);
        f65.y0.f341552a.l(null, this.f496457f, 4, 0L, 0L, 0L, 0L, this.f496466r != null, i19);
        this.f496455d.mo815x76e0bfae(i18, i19, str, this);
        this.f496461m.a(i18, i19, 0L, "");
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
        t21.d3.G(this.f496457f);
    }
}
