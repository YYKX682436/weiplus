package bt3;

/* loaded from: classes9.dex */
public class l0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    public static bt3.p0 C;
    public com.p314xaae8f345.mm.p947xba6de98f.q0 A;
    public final com.p314xaae8f345.mm.p947xba6de98f.q0 B;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f105845d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f105846e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.v0 f105847f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f105848g;

    /* renamed from: h, reason: collision with root package name */
    public long f105849h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f105850i;

    /* renamed from: m, reason: collision with root package name */
    public final long f105851m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f105852n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105853o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f105854p;

    /* renamed from: q, reason: collision with root package name */
    public long f105855q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f105856r;

    /* renamed from: s, reason: collision with root package name */
    public final int f105857s;

    /* renamed from: t, reason: collision with root package name */
    public int f105858t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f105859u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f105860v;

    /* renamed from: w, reason: collision with root package name */
    public final int f105861w;

    /* renamed from: x, reason: collision with root package name */
    public final long f105862x;

    /* renamed from: y, reason: collision with root package name */
    public int f105863y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f105864z;

    public l0(java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var) {
        this(str, 0L, "", v0Var, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(bt3.l0 r31, com.p314xaae8f345.mm.p947xba6de98f.n1 r32) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.H(bt3.l0, com.tencent.mm.modelcdntran.n1):void");
    }

    public static boolean J(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgInfo is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (J0 == null) {
            return false;
        }
        java.lang.String K = K(J0.f68096xac3be4e, f9Var.Q0(), f9Var.m124847x74d37ac6());
        boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(str, J0.f68099xfeae815, true);
        if (x17) {
            J0.f68112x10a0fed7 = 199L;
            J0.f68109x90a9378 = J0.f68113xeb1a61d6;
            boolean mo9952xce0038c9 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(J0, new java.lang.String[0]);
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (K == null) {
                K = "";
            }
            objArr[0] = K;
            objArr[1] = java.lang.Boolean.valueOf(mo9952xce0038c9);
            objArr[2] = java.lang.Boolean.valueOf(x17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish mediaId:%s, updateRsult:%s, move result:%s", objArr);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(J0.f68099xfeae815, ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(J0.f68113xeb1a61d6), null, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadAppAttach", "file move fail!!! %s => %s", str, J0.f68099xfeae815);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(198L, 45L, J0.f68113xeb1a61d6, false);
        g0Var.mo68477x336bdfd8(198L, 46L, 1L, false);
        g0Var.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? 48L : 47L, 1L, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(J0.f68107xaaaa6883, J0.f68106x315a5445);
        int ij6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(Li, J0);
        if (Li.P0() == 5 || ij6 != 0) {
            Li.r1(3);
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, J0, 0, true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(Li.Q0(), "update", Li, 0));
        }
        return true;
    }

    public static java.lang.String K(long j17, java.lang.String str, long j18) {
        return com.p314xaae8f345.mm.p947xba6de98f.i2.b("downattach", j17, str, j18 + "");
    }

    public final void I(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        long j17;
        if (this.f105846e != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: bt3.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    bt3.l0.this.f105846e.mo815x76e0bfae(i17, i18, str, m1Var);
                }
            });
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
            if (dVar != null) {
                if (i17 != 0 || i18 != 0) {
                    if (!(this.f105863y != 0)) {
                        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(this.f105863y != 0, java.lang.String.valueOf(this.f105851m), this.f105853o.I0(), false, false, this.f105853o.Q0());
                        return;
                    } else {
                        dVar.f68112x10a0fed7 = 102L;
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(this.f105848g, new java.lang.String[0]);
                        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(this.f105853o, this.f105848g, 0, true);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f105853o.m124847x74d37ac6(), this.f105853o);
                        return;
                    }
                }
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(this.f105863y != 0, java.lang.String.valueOf(this.f105851m), this.f105853o.I0(), true, false, this.f105853o.Q0());
                if (this.f105853o.n2() && this.f105847f == null && (f9Var = this.f105853o) != null) {
                    try {
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        if (v17 != null) {
                            long I0 = f9Var.I0();
                            rt0.b bVar = (rt0.b) v17.y(rt0.b.class);
                            if (bVar != null) {
                                long j18 = bVar.f480905b;
                                if (j18 != 0) {
                                    j17 = j18;
                                    ct3.d.f303836a.a(f9Var, v17, 0, j17);
                                }
                            }
                            j17 = I0;
                            ct3.d.f303836a.a(f9Var, v17, 0, j17);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadAppAttach", "reportKVStat exception:%s", e17.getMessage());
                    }
                }
                bt3.p0 p0Var = C;
                if (p0Var != null) {
                    ((d35.h) p0Var).a(this.f105853o);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f105848g.f68099xfeae815)) {
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(this.f105848g.f68099xfeae815, ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(this.f105848g.f68113xeb1a61d6), null, null);
                    java.lang.String str3 = this.f105848g.f68099xfeae815;
                }
                ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = this.f105853o;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3 d3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) w2Var;
                d3Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
                v05.b bVar2 = new v05.b();
                java.lang.String U1 = msgInfo.U1();
                if (U1 == null) {
                    U1 = "";
                }
                bVar2.m126728xdc93280d(U1);
                v05.a aVar = (v05.a) bVar2.m75936x14adae67(bVar2.f513848e + 8);
                if (aVar == null || (str2 = aVar.r()) == null) {
                    str2 = "";
                }
                d3Var.Ai(msgInfo, str2, 0, "");
            }
        }
    }

    public java.lang.String L() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
        return dVar == null ? "" : dVar.f68105x2c1f0acb;
    }

    public void M(final bt3.q0 q0Var) {
        boolean z17 = this.f105859u;
        if (!z17) {
            this.A = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: bt3.l0$$c
                @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
                public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                    bt3.l0 l0Var = bt3.l0.this;
                    l0Var.getClass();
                    if (n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "onTask cancel mediaId:%s", l0Var.f105854p);
                        lt.g0 wi6 = ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
                        java.lang.String str = l0Var.f105848g.f68107xaaaa6883;
                        long j17 = l0Var.f105851m;
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) wi6).J0(j17, str);
                        l0Var.f105848g = J0;
                        if (J0 == null) {
                            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                            java.lang.String str2 = l0Var.f105850i;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "pause get by msgid  %s null then get by mediaId %s", valueOf, str2);
                            l0Var.f105848g = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str2);
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = l0Var.f105848g;
                        if (dVar == null) {
                            return;
                        }
                        dVar.f68112x10a0fed7 = 102L;
                        if (!l0Var.f105859u) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "pause done %s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(l0Var.f105848g, new java.lang.String[0])));
                        }
                        bt3.q0 q0Var2 = q0Var;
                        if (q0Var2 != null) {
                            q0Var2.D6(l0Var);
                        }
                        l0Var.A = null;
                    }
                }
            };
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).wi(this.f105854p, new java.lang.ref.WeakReference(this.A));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", q0Var, dVar, valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public final boolean N() {
        lt.g0 wi6 = ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
            ot0.q v17 = ot0.q.v(pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445).j());
            java.lang.String n17 = v17.n();
            java.lang.String str = v17.f430223o;
            java.lang.String str2 = v17.f430243t;
            long j17 = v17.f430215m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "tryRescueFileFromPreviousDownload title: " + n17 + ", ext: " + str + ", size: " + j17);
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(this.f105848g.f68099xfeae815);
            if (!n17.endsWith(str)) {
                n17 = n17 + "." + str;
            }
            for (int i17 = 0; i17 < 20; i17++) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(r17);
                sb6.append('/');
                sb6.append(i17 == 0 ? "" : i17 + "_");
                sb6.append(n17);
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(sb7);
                if (m17 != null && m17.f294766c == j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Found same size file: " + sb7);
                    if (str2.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(sb7))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Found same MD5 file: " + sb7);
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e eVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) wi6;
                        eVar.getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
                        dVar2.f68099xfeae815 = sb7;
                        if (!eVar.get(dVar2, "fileFullPath")) {
                            dVar2 = null;
                        }
                        if (dVar2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "No occupied, possibly table miss.");
                            this.f105848g.f68099xfeae815 = sb7;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Occupied, copy " + sb7 + " -> " + this.f105848g.f68099xfeae815);
                            com.p314xaae8f345.mm.vfs.w6.c(sb7, this.f105848g.f68099xfeae815);
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar3 = this.f105848g;
                        dVar3.f68113xeb1a61d6 = j17;
                        dVar3.f68109x90a9378 = j17;
                        dVar3.f68112x10a0fed7 = 199L;
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) wi6).mo9952xce0038c9(dVar3, new java.lang.String[0]);
                        return true;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneDownloadAppAttach", e17, "tryRescueFileFromPreviousDownload failed.", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "No same file found.");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        super.mo9408xae7a2e7a();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
        if (dVar != null) {
            long j17 = dVar.f68112x10a0fed7;
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
            if (j17 == 101) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneDownloadAppAttach", "cancel netscene, but status is downloading!");
                M(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a1  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r27, com.p314xaae8f345.mm.p944x882e457a.u0 r28) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ed, code lost:
    
        if ((r3.f68109x90a9378 + r2.length) == r3.f68113xeb1a61d6) goto L62;
     */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r18, int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p971x6de15a2e.v0 r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 400;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public l0(long j17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var) {
        this(str2, j17, str, v0Var, 0);
        this.f105851m = j17;
    }

    public l0(long j17, java.lang.String str, long j18, int i17, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var, boolean z17) {
        this.f105848g = null;
        this.f105849h = -1L;
        this.f105850i = "";
        this.f105851m = 0L;
        this.f105852n = "";
        this.f105853o = null;
        this.f105854p = "";
        this.f105855q = 0L;
        this.f105856r = "";
        this.f105857s = 0;
        this.f105858t = 0;
        this.f105859u = false;
        this.f105860v = false;
        this.f105862x = 0L;
        this.f105863y = 0;
        this.f105864z = false;
        this.A = null;
        this.B = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: bt3.l0$$b
            @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
            public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f105862x = j18;
        this.f105851m = j17;
        this.f105852n = str;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str);
        this.f105848g = J0;
        this.f105847f = v0Var;
        this.f105860v = z17;
        this.f105861w = i17;
        if (J0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadAppAttach", "big appMsg, info is null, msgid = , svrId" + j17, java.lang.Long.valueOf(j18));
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(J0.f68106x315a5445);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach1, msgId:%s, mediaId:%s, path:%s", valueOf, dVar.f68104xaca5bdda, dVar.f68099xfeae815);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nf0();
        lVar.f152198b = new r45.of0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f152200d = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23;
        lVar.f152201e = 106;
        lVar.f152202f = 1000000106;
        this.f105845d = lVar.a();
    }

    public l0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, boolean z17) {
        this.f105849h = -1L;
        this.f105850i = "";
        this.f105851m = 0L;
        this.f105852n = "";
        this.f105853o = null;
        this.f105854p = "";
        this.f105855q = 0L;
        this.f105856r = "";
        this.f105857s = 0;
        this.f105858t = 0;
        this.f105859u = false;
        this.f105860v = false;
        this.f105862x = 0L;
        this.f105863y = 0;
        this.f105864z = false;
        this.A = null;
        this.B = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: bt3.l0$$b
            @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
            public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f105848g = dVar;
        this.f105859u = z17;
        java.lang.String str = dVar.f68104xaca5bdda;
        this.f105850i = str;
        this.f105847f = null;
        this.f105857s = 0;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + str);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nf0();
        lVar.f152198b = new r45.of0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f152200d = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23;
        lVar.f152201e = 106;
        lVar.f152202f = 1000000106;
        this.f105845d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach2 info msgId:%s, fullpath[%s], justSaveFile[%b], stack[%s]", java.lang.Long.valueOf(dVar.f68106x315a5445), dVar.f68099xfeae815, java.lang.Boolean.valueOf(z17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public l0(java.lang.String str, long j17, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var, int i17) {
        this.f105848g = null;
        this.f105849h = -1L;
        this.f105850i = "";
        this.f105851m = 0L;
        this.f105852n = "";
        this.f105853o = null;
        this.f105854p = "";
        this.f105855q = 0L;
        this.f105856r = "";
        this.f105857s = 0;
        this.f105858t = 0;
        this.f105859u = false;
        this.f105860v = false;
        this.f105862x = 0L;
        this.f105863y = 0;
        this.f105864z = false;
        this.A = null;
        this.B = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: bt3.l0$$b
            @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
            public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f105850i = str;
        this.f105851m = j17;
        this.f105852n = str2;
        this.f105847f = v0Var;
        this.f105857s = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str2);
        this.f105848g = J0;
        if (J0 == null) {
            this.f105848g = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str);
        }
        if (this.f105848g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + str);
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f105848g.f68106x315a5445);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105848g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach3, oriMsgId:%s, msgId:%s, mediaId:%s, path:%s", valueOf, valueOf2, dVar.f68104xaca5bdda, dVar.f68099xfeae815);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nf0();
        lVar.f152198b = new r45.of0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f152200d = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23;
        lVar.f152201e = 106;
        lVar.f152202f = 1000000106;
        this.f105845d = lVar.a();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f105848g;
        java.lang.String str3 = dVar2.f68099xfeae815;
        long j18 = dVar2.f68114x2262335f;
        java.lang.String str4 = this.f105848g.f68111xda9bc3b3;
    }
}
