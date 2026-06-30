package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.e0.class)
/* loaded from: classes11.dex */
public class f7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.e0 {

    /* renamed from: f, reason: collision with root package name */
    public int f280549f;

    /* renamed from: y, reason: collision with root package name */
    public long f280565y;

    /* renamed from: z, reason: collision with root package name */
    public int f280566z;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f280548e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f280550g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f280551h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f280552i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280553m = false;

    /* renamed from: n, reason: collision with root package name */
    public final tg3.j1 f280554n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b7(this);

    /* renamed from: o, reason: collision with root package name */
    public long f280555o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f280556p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f280557q = null;

    /* renamed from: r, reason: collision with root package name */
    public long f280558r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f280559s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f280560t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f280561u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f280562v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f280563w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f280564x = false;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        o0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e7(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        o0();
        boolean n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(this.f280113d.x());
        yd5.j jVar = yd5.j.f542636b;
        boolean D = this.f280113d.D();
        int[] iArr = jVar.f542637a;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        ((ku5.t0) ku5.t0.f394148d).q(new yd5.i(jVar, D, n17, iArr2));
        yd5.k kVar = yd5.k.f542638g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s mCount:%s mDownCount:%s mUpCount:%s mErrCount:%s mSuccessCount:%s mFetchCount:%s", this.f280113d.x(), java.lang.Integer.valueOf(kVar.f542639a), java.lang.Integer.valueOf(kVar.f542642d), java.lang.Integer.valueOf(kVar.f542643e), java.lang.Integer.valueOf(kVar.f542640b), java.lang.Integer.valueOf(kVar.f542641c), java.lang.Integer.valueOf(kVar.f542644f));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(403L, 60L, kVar.f542639a, true);
        fVar.mo68477x336bdfd8(403L, 61L, kVar.f542642d, true);
        fVar.mo68477x336bdfd8(403L, 62L, kVar.f542643e, true);
        fVar.mo68477x336bdfd8(403L, 63L, kVar.f542640b, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(403, 64, kVar.f542641c));
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(403, 65, kVar.f542644f));
        fVar.b(arrayList, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280113d.x())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(110L, 0L, 1L, true);
        }
        java.lang.String x17 = this.f280113d.x();
        this.f280565y = 0L;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17) || (p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(x17)) == null || !"hidden_conv_parent".equalsIgnoreCase(p17.W0())) {
            return;
        }
        this.f280565y = java.lang.System.currentTimeMillis();
        this.f280566z = c01.h2.b(x17);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
    }

    public void m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w6(this, f9Var, false));
    }

    public void n0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!this.f280553m) {
            this.f280553m = true;
            com.p314xaae8f345.mm.p2621x8fb0427b.c z07 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100134");
            if (z07.m77959x7b953cf2()) {
                java.lang.String str = (java.lang.String) z07.t0().get("needUploadData");
                int i17 = x51.t1.f533619a;
                int i18 = 0;
                if (str != null) {
                    try {
                        if (str.length() > 0) {
                            i18 = java.lang.Integer.parseInt(str);
                        }
                    } catch (java.lang.NumberFormatException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                    }
                }
                this.f280552i = i18;
            }
        }
        if (this.f280552i == 0 || this.f280551h.contains(java.lang.Long.valueOf(f9Var.I0()))) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y6(this, f9Var));
    }

    public final void o0() {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z6(this, this.f280113d.x()), "MicroMsg.ChattingUI.ChattingReportComponent");
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee c5246x83c809ee = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee();
        c5246x83c809ee.f135579g.f88657a = false;
        c5246x83c809ee.e();
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        tg3.j1 j1Var = this.f280554n;
        ih3.e eVar = (ih3.e) k1Var;
        eVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ih3.g(eVar, "tmpl_type_succeed_contact", j1Var));
        java.lang.String x17 = this.f280113d.x();
        if (this.f280565y != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6649xe259c87 c6649xe259c87 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6649xe259c87();
            if (this.f280113d.f542250l.m78386x9c19e6d7("chat_from_scene", 0) == 5) {
                c6649xe259c87.f139976d = 1L;
            } else {
                c6649xe259c87.f139976d = 2L;
            }
            c6649xe259c87.f139977e = c6649xe259c87.b("ChatName", x17, true);
            c6649xe259c87.f139978f = this.f280565y;
            c6649xe259c87.f139979g = java.lang.System.currentTimeMillis();
            c6649xe259c87.f139980h = this.f280566z;
            c6649xe259c87.f139981i = c01.h2.b(x17);
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(x17);
            if (p17 != null) {
                if ("hidden_conv_parent".equalsIgnoreCase(p17.W0())) {
                    c6649xe259c87.f139982j = 1L;
                } else if (p17.w0() > this.f280565y) {
                    c6649xe259c87.f139982j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.z0()) ? 2L : 3L;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.A0()) || p17.D0() != 0) {
                    c6649xe259c87.f139982j = 4L;
                }
            }
            c6649xe259c87.k();
            this.f280565y = 0L;
        }
    }

    public void p0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (this.f280550g.contains(java.lang.Long.valueOf(f9Var.I0()))) {
            return;
        }
        this.f280550g.add(java.lang.Long.valueOf(f9Var.I0()));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x6(this, f9Var));
    }

    public final void q0() {
        this.f280557q = null;
        if (c01.z1.r() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChattingReportComponent", "getUsernameFromUserInfo is null!");
            return;
        }
        int i17 = 0;
        if (!c01.z1.r().equals(this.f280113d.x()) && this.f280113d.C()) {
            this.f280557q = this.f280113d.x();
            this.f280558r = (c01.w9.p() / 1000) * 1000;
            this.f280560t = 0;
            gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c7(this, this.f280557q, this.f280113d.x(), this.f280113d.u()));
        }
        if (this.f280556p) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f280555o;
            this.f280555o = 0L;
            this.f280556p = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            int i18 = 8;
            long[] jArr = {0, 200, 400, 600, 800, 1000, 1500, 2000};
            while (true) {
                if (i17 >= 8) {
                    i18 = -1;
                    break;
                } else if (currentTimeMillis >= jArr[i17]) {
                    if (i17 == 7) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    i18 = i17;
                    break;
                }
            }
            g0Var.mo68477x336bdfd8(109L, i18, 1L, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        r45.fh7 fh7Var = (r45.fh7) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(13, "report_".concat(this.f280113d.x()));
        if (fh7Var != null) {
            this.f280562v = fh7Var.f455893d;
            this.f280563w = fh7Var.f455894e;
        }
        if (!this.f280564x) {
            q0();
        }
        this.f280564x = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (android.text.TextUtils.isEmpty(this.f280557q) || !this.f280113d.C()) {
            return;
        }
        this.f280559s = c01.w9.p();
        java.lang.String str = this.f280557q;
        this.f280557q = "";
        int i17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class))).f281365h;
        if (i17 == 2) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class))).f281365h = 0;
        }
        int i18 = (this.f280113d.C() && this.f280113d.u().T == 0) ? 1 : 0;
        if (5 == this.f280113d.f542250l.m78386x9c19e6d7("chat_from_scene", 0)) {
            this.f280561u = 2;
        } else {
            this.f280561u = this.f280113d.f542250l.m78386x9c19e6d7("chat_from_scene_for_group_chats", 0);
        }
        int i19 = this.f280561u;
        this.f280561u = 0;
        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d7(this, str, i17, i18, i19, i18));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        int i17;
        this.f280555o = java.lang.System.currentTimeMillis();
        this.f280556p = true;
        if (this.f280113d.u() != null) {
            this.f280113d.x();
            if (c01.z1.r() != null) {
                v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                this.f280113d.x();
                ((u90.a) vVar).getClass();
                com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                if (!c01.z1.r().equals(this.f280113d.x())) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee c5246x83c809ee = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee();
                    c5246x83c809ee.f135579g.f88657a = true;
                    c5246x83c809ee.e();
                }
                int i18 = 2;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x())) {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206654e.put(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                } else {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0 m0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206654e.put(1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                }
                boolean r07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f280113d.f542241c.a(sb5.q2.class))).r0();
                int i19 = 0;
                if ("notification_messages".equals(this.f280113d.x()) || "schedule_message".equals(this.f280113d.x())) {
                    i18 = 8;
                    i17 = 1;
                } else if (c01.e2.G(this.f280113d.x())) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class));
                    if (aVar.f280286r) {
                        i17 = !r07 ? 1 : 0;
                        if (aVar.f280287s) {
                            aVar.f280277f.w0().size();
                            i18 = 5;
                        } else {
                            i18 = 4;
                        }
                    } else if (r01.z.h(this.f280113d.x())) {
                        i17 = !r07 ? 1 : 0;
                        i18 = 3;
                    } else {
                        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                        java.lang.String x17 = this.f280113d.x();
                        ((qv.o) u2Var).getClass();
                        if (r01.z.j(x17)) {
                            i17 = 1;
                            i18 = 0;
                        } else {
                            i18 = r01.z.n(this.f280113d.x()) ? 6 : 7;
                            i17 = 0;
                        }
                    }
                } else {
                    boolean C = this.f280113d.C();
                    i17 = !r07 ? 1 : 0;
                    if (!C) {
                        i18 = 1;
                    }
                }
                if (!this.f280113d.G()) {
                    for (java.lang.String str : c01.e2.f118665p) {
                        if (str.equals(this.f280113d.x())) {
                            i18 = 0;
                        }
                    }
                    i19 = i18;
                }
                if (i19 != 0) {
                    if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3) ((sb5.s) this.f280113d.f542241c.a(sb5.s.class))).u() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4) ((sb5.x) this.f280113d.f542241c.a(sb5.x.class))).t() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u7) ((sb5.h0) this.f280113d.f542241c.a(sb5.h0.class))).G() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).G0() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).H0() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9) ((sb5.j0) this.f280113d.f542241c.a(sb5.j0.class))).s()) {
                        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a7(this, i19, this.f280113d.x(), i17), "MicroMsg.ChattingUI.ChattingReportComponent");
                    }
                }
                tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
                tg3.j1 j1Var = this.f280554n;
                ih3.e eVar = (ih3.e) k1Var;
                eVar.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ih3.f(eVar, "tmpl_type_succeed_contact", j1Var));
            }
        }
        this.f280564x = true;
        q0();
    }
}
