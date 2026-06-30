package t21;

/* loaded from: classes12.dex */
public class w0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496564d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f496565e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496566f;

    /* renamed from: h, reason: collision with root package name */
    public final int f496568h;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f496571n;

    /* renamed from: p, reason: collision with root package name */
    public final fp.j f496573p;

    /* renamed from: t, reason: collision with root package name */
    public final int f496577t;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f496567g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f496569i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f496570m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f496572o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f496574q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f496575r = "";

    /* renamed from: s, reason: collision with root package name */
    public long f496576s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f496578u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f496579v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f496580w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final z25.e f496581x = new t21.c1(this);

    /* renamed from: y, reason: collision with root package name */
    public final dn.k f496582y = new t21.h1(this);

    /* renamed from: z, reason: collision with root package name */
    public final z25.e f496583z = new t21.l1(this);
    public final dn.k A = new t21.o1(this);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 B = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.p1(this), true);

    public w0(java.lang.String str) {
        this.f496573p = null;
        this.f496577t = 4;
        iz5.a.g(null, str != null);
        this.f496566f = str;
        t21.v2 h17 = t21.d3.h(str);
        this.f496571n = h17;
        if (h17 != null) {
            this.f496568h = 2500;
        } else {
            this.f496568h = 0;
        }
        this.f496573p = new fp.j();
        t21.v2 v2Var = this.f496571n;
        if (v2Var != null && 3 == v2Var.f496559x) {
            this.f496577t = 6;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", N(), java.lang.Integer.valueOf(this.f496577t));
    }

    public static void H(final t21.w0 w0Var, final dn.h hVar) {
        final t21.v2 v2Var = w0Var.f496571n;
        if (v2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, video info is null !");
            return;
        }
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, cdn result is null !");
            return;
        }
        final y15.d dVar = new y15.d();
        dVar.m126728xdc93280d(v2Var.g());
        y15.c n17 = dVar.n();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.m75945x2fec8307(n17.f540455d + 0)) && !hVar.b()) {
            y15.c n18 = dVar.n();
            n18.set(n18.f540455d + 0, hVar.f69502xf11df5f5);
            y15.c n19 = dVar.n();
            n19.set(n19.f540455d + 2, hVar.f69502xf11df5f5);
            y15.c n27 = dVar.n();
            n27.set(n27.f540455d + 1, hVar.f69522xf9dbbe9c);
            y15.c n28 = dVar.n();
            n28.set(n28.f540455d + 3, hVar.f69522xf9dbbe9c);
            v2Var.f496558w = dVar.m126747x696739c();
            v2Var.U = 2097152;
            t21.d3.Q(v2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "do check before md5 check, aeskey = " + hVar.f69502xf11df5f5);
        }
        if (!hVar.b() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69502xf11df5f5)) {
            w0Var.L(v2Var, hVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, upload by cdn hit md5, do md5 check");
        ((at3.b) ((xy.f) i95.n0.c(xy.f.class))).wi(hVar.f69522xf9dbbe9c, hVar.f69526x419c9c3d, hVar.f69543x16680d46, hVar.f69525x419c7893, new xy.e() { // from class: t21.w0$$a
            @Override // xy.e
            public final void a(java.lang.String str, int i17, int i18) {
                t21.w0 w0Var2 = t21.w0.this;
                w0Var2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 check, aeskey = %s, errType = %d, errCode = %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 || i18 != 0) {
                    w0Var2.f496564d.mo815x76e0bfae(4, 102, "", w0Var2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 chech failed, do reUpload");
                    return;
                }
                y15.d dVar2 = dVar;
                y15.c n29 = dVar2.n();
                n29.set(n29.f540455d + 0, str);
                y15.c n37 = dVar2.n();
                n37.set(n37.f540455d + 2, str);
                java.lang.String m126747x696739c = dVar2.m126747x696739c();
                t21.v2 v2Var2 = v2Var;
                v2Var2.f496558w = m126747x696739c;
                v2Var2.U = 2097152;
                t21.d3.Q(v2Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 check, recv xml = %s", v2Var2.g());
                w0Var2.L(v2Var2, hVar);
            }
        });
    }

    public final int I() {
        int i17;
        int i18 = 0;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, this.f496571n.d(), false);
        if (!d61.c.a(rj6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideo", "%s check preload length but it not mp4.", N());
            return 0;
        }
        d61.b bVar = new d61.b();
        long a17 = bVar.a(rj6);
        long j17 = bVar.f308244a;
        if (a17 < 131072 && a17 > 0 && (i17 = this.f496571n.f496548m) > 5) {
            long j18 = bVar.f308245b;
            if (j18 > 0 && j17 > 0 && (i18 = ((int) j17) + ((int) ((j18 * 5) / i17))) <= 131072) {
                i18 += 131072;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", N(), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f496571n.f496548m), java.lang.Long.valueOf(bVar.f308245b));
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J() {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.J():boolean");
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
    public final java.lang.String K(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.K(java.lang.String):java.lang.String");
    }

    public final void L(t21.v2 v2Var, dn.h hVar) {
        zz.b hj6;
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496544i = 199;
        v2Var.U = 2098436;
        t21.d3.Q(v2Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f496571n.h(), this.f496571n.f496549n);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        this.f496564d.mo815x76e0bfae(0, 0, "", this);
        M(hVar);
        if (z17 && hVar != null) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f104104s;
            java.lang.String str = this.f496566f;
            java.lang.String rj6 = ((k90.b) u0Var).rj(Li, f0Var, str, false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str, false);
            if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.f())) {
                    java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(tj6);
                    hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.mo78013xfb85f7b0(), hVar.f69526x419c9c3d, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "check video thumb dup, fileName = " + str + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.mo78013xfb85f7b0(), p17, null).f559224a);
                } else {
                    hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f496571n.f(), rj6, tj6, Li.mo78013xfb85f7b0(), this.f496571n.f496548m, com.p314xaae8f345.mm.vfs.w6.p(this.f496571n.f()));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "check video dup, fileName = " + str + " result = " + hj6.f559224a);
            }
        }
    }

    public final void M(dn.h hVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f496571n.h(), this.f496571n.f496549n);
        t21.i2.wi().Ri(hVar, new wf0.l1(this.f496566f, bm5.f0.f104104s), !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f496571n.M) ? this.f496571n.M : c01.ia.v(Li.G), Li.I0());
    }

    public final java.lang.String N() {
        return this.f496566f + "_" + hashCode();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s stop %s", N(), this.f496575r);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f496575r)) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f496575r);
        }
        this.f496570m = true;
        super.mo9408xae7a2e7a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(5:178|179|180|181|182)|(2:184|(6:186|187|188|(1:14)|15|(1:17)(4:19|(1:21)(3:155|(1:157)(1:177)|(1:159)(6:160|(2:162|(4:167|(3:169|(1:171)(1:174)|(1:173))|175|(1:24)(29:25|(1:27)(2:147|(2:149|150)(2:151|(2:153|154)))|28|(1:30)|31|(1:33)|34|(1:36)|37|(1:39)(1:146)|40|(1:42)(2:135|(4:138|139|140|141)(1:137))|43|(1:45)|46|(1:48)|49|(1:(1:134))(11:53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68)|69|(1:71)|(5:73|(1:75)|76|(1:78)|79)|80|(1:82)(2:126|(1:128))|83|(4:85|(1:87)|88|(1:92))|93|(2:95|(2:109|110)(4:99|(1:101)|102|(2:104|105)(1:106)))(2:111|(2:124|125)(2:115|(2:117|118)(2:119|(2:121|122)(1:123))))|107|108))(1:166))|176|(0)|175|(0)(0)))|22|(0)(0))))|192|193) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x008e, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ee  */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.InputStream] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r22, com.p314xaae8f345.mm.p944x882e457a.u0 r23) {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        t21.v2 v2Var = this.f496571n;
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(v2Var.f496549n, v2Var.f496553r), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReturnTimeout */
    public long mo48003xd8232e5b() {
        return 1800000L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f7  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r27, int r28, int r29, java.lang.String r30, com.p314xaae8f345.mm.p971x6de15a2e.v0 r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return this.f496568h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 210L, 1L, false);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        r45.xu6 xu6Var = (r45.xu6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xu6Var.f471970d) && xu6Var.f471984r > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xu6Var.f471971e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xu6Var.f471972f) && xu6Var.f471983q > 0 && (i17 = xu6Var.f471974h) <= (i18 = xu6Var.f471973g) && i17 >= 0 && (i19 = xu6Var.f471978n) <= (i27 = xu6Var.f471977m) && i19 >= 0 && ((i19 != i27 || i17 != i18) && i18 > 0 && i27 > 0 && (xu6Var.f471979o.f453372d > 0 || xu6Var.f471975i.f453372d > 0))) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.f496566f + " user:" + xu6Var.f471972f);
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 221L, 1L, false);
        t21.d3.G(this.f496566f);
    }
}
