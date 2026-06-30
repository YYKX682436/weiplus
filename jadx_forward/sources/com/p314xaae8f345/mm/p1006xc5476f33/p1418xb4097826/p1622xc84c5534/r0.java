package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes15.dex */
public abstract class r0 extends fc2.d {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0 f206812q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0(null);

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f206813r = "";

    /* renamed from: s, reason: collision with root package name */
    public static int f206814s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f206815t = "";

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f206816g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qt2 f206817h;

    /* renamed from: i, reason: collision with root package name */
    public vg3.t3 f206818i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p0 f206819m;

    /* renamed from: n, reason: collision with root package name */
    public final long f206820n;

    /* renamed from: o, reason: collision with root package name */
    public final kw2.m0 f206821o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f206822p;

    public r0(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206816g = activity;
        this.f206817h = contextObj;
        this.f206820n = 1277L;
        this.f206821o = new kw2.m0(contextObj);
        ((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.e0.f257118a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.e0.f257118a = true;
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d0(activity));
        }
        this.f206819m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p0();
        this.f206818i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n0(this);
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.f276652f.v(this.f206818i);
        this.f206822p = true;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        nk4.a aVar;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        java.lang.String description;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        java.lang.String nickName;
        r45.mb4 e17;
        r45.mb4 e18;
        r45.vf2 f17;
        java.lang.String m75945x2fec8307;
        r45.vf2 f18;
        r45.vf2 f19;
        java.lang.String mo148083xfb83cc9b;
        java.lang.String n17;
        java.lang.String n18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f206817h.m75939xb282bd08(5) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowReporter", "[onEventHappen] invalid scene");
            return;
        }
        if (event instanceof ec2.f) {
            ec2.f fVar = (ec2.f) event;
            kw2.m0 m0Var = this.f206821o;
            int i17 = fVar.f332492d;
            if (i17 == 33) {
                long j17 = fVar.f332498j;
                java.lang.Object obj = event.f342469c;
                boolean z17 = obj instanceof nk4.c;
                nk4.c cVar = z17 ? (nk4.c) obj : null;
                r9 = cVar != null ? cVar.f419600d : 0;
                nk4.c cVar2 = z17 ? (nk4.c) obj : null;
                java.lang.Object obj2 = cVar2 != null ? cVar2.f419601e : null;
                m0Var.getClass();
                kw2.d0 d0Var = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j17));
                if (d0Var != null) {
                    long j18 = event.f342467a;
                    if (r9 == 3) {
                        if (d0Var.T0 == 0) {
                            d0Var.T0 = j18 - d0Var.f394457l;
                            return;
                        }
                        return;
                    } else if (r9 == 4) {
                        if (d0Var.S0 == 0) {
                            d0Var.S0 = j18 - d0Var.f394457l;
                            return;
                        }
                        return;
                    } else if (r9 == 6) {
                        d0Var.U0 = 1;
                        return;
                    } else {
                        if (r9 == 7 && (aVar = d0Var.I0) != null) {
                            aVar.F = obj2 instanceof org.json.JSONObject ? (org.json.JSONObject) obj2 : null;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            switch (i17) {
                case 1:
                    jx3.f.INSTANCE.mo68477x336bdfd8(this.f206820n, 1L, 1L, false);
                    m0Var.A(new nk4.b(fVar.f332498j, event.f342467a, fVar.f332499k));
                    return;
                case 2:
                    jx3.f.INSTANCE.mo68477x336bdfd8(this.f206820n, 2L, 1L, false);
                    m0Var.z(new nk4.b(fVar.f332498j, event.f342467a, fVar.f332499k));
                    return;
                case 3:
                    long j19 = fVar.f332498j;
                    long j27 = fVar.f332496h;
                    long j28 = fVar.f332497i;
                    java.lang.Object obj3 = event.f342469c;
                    nk4.r rVar = obj3 instanceof nk4.r ? (nk4.r) obj3 : null;
                    m0Var.v(new nk4.r(j19, j27, j28, rVar != null ? rVar.f419635f : 0L, event.f342467a, fVar.f332499k));
                    return;
                case 4:
                    jx3.f.INSTANCE.mo68477x336bdfd8(this.f206820n, 0L, 1L, false);
                    long j29 = fVar.f332498j;
                    mn2.j4 j4Var = fVar.f332495g;
                    java.lang.String str2 = (j4Var == null || (n17 = j4Var.n()) == null) ? "" : n17;
                    mn2.j4 j4Var2 = fVar.f332495g;
                    java.lang.String str3 = (j4Var2 == null || (mo148083xfb83cc9b = j4Var2.mo148083xfb83cc9b()) == null) ? "" : mo148083xfb83cc9b;
                    mn2.j4 j4Var3 = fVar.f332495g;
                    float m75939xb282bd08 = (j4Var3 == null || (f19 = j4Var3.f()) == null) ? 0.0f : f19.m75939xb282bd08(6);
                    mn2.j4 j4Var4 = fVar.f332495g;
                    float m75939xb282bd082 = (j4Var4 == null || (f18 = j4Var4.f()) == null) ? 0.0f : f18.m75939xb282bd08(7);
                    mn2.j4 j4Var5 = fVar.f332495g;
                    java.lang.String str4 = (j4Var5 == null || (f17 = j4Var5.f()) == null || (m75945x2fec8307 = f17.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
                    mn2.j4 j4Var6 = fVar.f332495g;
                    long m75939xb282bd083 = (j4Var6 == null || (e18 = j4Var6.e()) == null) ? 0L : e18.m75939xb282bd08(3);
                    mn2.j4 j4Var7 = fVar.f332495g;
                    if (j4Var7 != null && (e17 = j4Var7.e()) != null) {
                        r10 = e17.m75939xb282bd08(7);
                    }
                    long j37 = r10;
                    int i18 = fVar.f332502n;
                    int i19 = fVar.C;
                    cw2.wa waVar = fVar.f332493e;
                    java.lang.String str5 = (waVar == null || (c14989xf862ae882 = waVar.f305632f) == null || (nickName = c14989xf862ae882.getNickName()) == null) ? "-1" : nickName;
                    cw2.wa waVar2 = fVar.f332493e;
                    java.lang.String str6 = (waVar2 == null || (c14989xf862ae88 = waVar2.f305632f) == null || (description = c14989xf862ae88.getDescription()) == null) ? "-1" : description;
                    int i27 = fVar.f332508t;
                    java.lang.Object obj4 = event.f342469c;
                    boolean z18 = obj4 instanceof nk4.e;
                    nk4.e eVar = z18 ? (nk4.e) obj4 : null;
                    int i28 = eVar != null ? eVar.f419615p : 0;
                    nk4.e eVar2 = z18 ? (nk4.e) obj4 : null;
                    m0Var.B(new nk4.e(j29, str2, str3, m75939xb282bd08, m75939xb282bd082, str4, m75939xb282bd083, j37, i18, i19, str5, str6, i27, i28, (eVar2 == null || (str = eVar2.f419616q) == null) ? "" : str, event.f342467a, fVar.f332499k));
                    return;
                case 5:
                    m0Var.E(new nk4.b(fVar.f332498j, event.f342467a, fVar.f332499k));
                    return;
                case 6:
                    jx3.f.INSTANCE.mo68477x336bdfd8(this.f206820n, 3L, 1L, false);
                    long j38 = fVar.f332498j;
                    mn2.j4 j4Var8 = fVar.f332495g;
                    m0Var.C(new nk4.o(j38, (j4Var8 == null || (n18 = j4Var8.n()) == null) ? "" : n18, fVar.f332511w, event.f342467a, fVar.f332499k));
                    return;
                case 7:
                    m0Var.s(new nk4.l(fVar.f332498j, event.f342467a, fVar.f332496h, fVar.f332497i, fVar.f332499k));
                    return;
                case 8:
                    m0Var.o(new nk4.h(fVar.f332498j, fVar.f332496h, fVar.f332497i, event.f342467a, fVar.f332499k));
                    return;
                case 9:
                    m0Var.D(new nk4.f(fVar.f332498j, event.f342467a, fVar.B, fVar.f332499k));
                    return;
                case 10:
                    long j39 = fVar.f332498j;
                    m0Var.getClass();
                    kw2.d0 d0Var2 = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j39));
                    if (d0Var2 != null) {
                        d0Var2.f394466p0 = 1;
                        return;
                    }
                    return;
                case 11:
                    m0Var.t(new nk4.m(fVar.f332498j, event.f342467a, fVar.f332511w, fVar.f332499k));
                    return;
                case 12:
                    long j47 = fVar.f332498j;
                    long j48 = event.f342467a;
                    r45.mb4 mb4Var = fVar.f332494f;
                    if (mb4Var != null && (c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69)) != null) {
                        r9 = c19791x8d6e6bf1.m76723x2c179394();
                    }
                    m0Var.q(new nk4.k(j47, j48, r9, fVar.f332509u, fVar.f332499k));
                    return;
                case 13:
                    long j49 = fVar.f332498j;
                    long j57 = fVar.f332496h;
                    long j58 = fVar.f332497i;
                    m0Var.getClass();
                    kw2.d0 d0Var3 = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j49));
                    if (d0Var3 == null || d0Var3.V != 0) {
                        return;
                    }
                    d0Var3.V = j57 + j58;
                    return;
                case 14:
                    m0Var.n(new nk4.g(fVar.f332498j, fVar.f332506r, event.f342467a, fVar.f332499k));
                    return;
                case 15:
                    nk4.s.c(m0Var, new nk4.i(fVar.f332498j, fVar.f332505q, fVar.f332506r, event.f342467a, fVar.f332499k), null, 2, null);
                    return;
                case 16:
                    nk4.s.d(m0Var, new nk4.b(fVar.f332498j, event.f342467a, fVar.f332499k), null, 2, null);
                    return;
                case 17:
                    long j59 = fVar.f332498j;
                    m0Var.getClass();
                    kw2.d0 d0Var4 = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j59));
                    if (d0Var4 != null) {
                        d0Var4.f394470r0 = 1;
                        return;
                    }
                    return;
                case 18:
                    m0Var.u(new nk4.n(fVar.f332498j, fVar.f332507s, event.f342467a, fVar.f332499k));
                    return;
                case 19:
                    long j66 = fVar.f332498j;
                    long j67 = event.f342467a;
                    r45.mb4 mb4Var2 = fVar.f332494f;
                    if (mb4Var2 != null && (c19791x8d6e6bf12 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var2.m75936x14adae67(69)) != null) {
                        r9 = c19791x8d6e6bf12.m76723x2c179394();
                    }
                    m0Var.r(new nk4.k(j66, j67, r9, fVar.f332509u, fVar.f332499k));
                    return;
                case 20:
                    m0Var.w(new nk4.p(fVar.f332498j, fVar.f332510v, event.f342467a, fVar.f332499k));
                    return;
                case 21:
                    long j68 = fVar.f332498j;
                    int i29 = fVar.f332513y;
                    int i37 = fVar.A;
                    int i38 = fVar.f332514z;
                    m0Var.getClass();
                    kw2.d0 d0Var5 = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j68));
                    if (d0Var5 != null) {
                        long j69 = d0Var5.f394438b0 + 1;
                        d0Var5.f394438b0 = j69;
                        d0Var5.f394440c0 += i38;
                        d0Var5.f394442d0 += i37;
                        float f27 = (float) (j69 - 1);
                        float f28 = (float) j69;
                        d0Var5.f394444e0 = ((d0Var5.f394444e0 * f27) + i38) / f28;
                        d0Var5.f394446f0 = ((d0Var5.f394446f0 * f27) + i37) / f28;
                        if (i29 - i38 > 2) {
                            d0Var5.f394448g0++;
                        }
                        if (i29 - i37 > 2) {
                            d0Var5.f394450h0++;
                        }
                        d0Var5.f394452i0 = d0Var5.f394448g0 / f28;
                        d0Var5.f394454j0 = d0Var5.f394450h0 / f28;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", "videoFPS: " + i29 + " staticSeconds: " + d0Var5.f394438b0 + " decodeFps: " + d0Var5.f394444e0 + " renderFps: " + d0Var5.f394446f0 + " playDecodeStuckCount: " + d0Var5.f394448g0 + " playRenderStuckCount: " + d0Var5.f394450h0);
                        return;
                    }
                    return;
                default:
                    switch (i17) {
                        case 29:
                            m0Var.x(new nk4.q(fVar.f332498j, fVar.f332509u, event.f342467a, fVar.f332499k));
                            return;
                        case 30:
                            m0Var.p(new nk4.j(fVar.f332498j, event.f342467a, fVar.f332499k));
                            return;
                        case 31:
                            long j76 = fVar.f332498j;
                            java.lang.Object obj5 = event.f342469c;
                            nk4.d dVar = obj5 instanceof nk4.d ? (nk4.d) obj5 : null;
                            r9 = dVar != null ? dVar.f419602d : 0;
                            m0Var.getClass();
                            kw2.d0 d0Var6 = (kw2.d0) m0Var.f394592d.get(java.lang.Long.valueOf(j76));
                            if (d0Var6 != null) {
                                if (r9 == 1) {
                                    d0Var6.O0 = 1;
                                } else if (r9 == 2) {
                                    d0Var6.P0 = 1;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", m0Var.f("onActionMiniView", d0Var6) + " action:" + r9);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        kw2.m0 m0Var = this.f206821o;
        for (java.util.Map.Entry entry : m0Var.f394592d.entrySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoPlayReporter", m0Var.f("syncNotifyNotReportItem", (kw2.d0) entry.getValue()));
            m0Var.k((kw2.d0) entry.getValue());
            ni3.a1 a1Var = m0Var.f394598j;
            if (a1Var != null) {
                a1Var.g((kw2.d0) entry.getValue());
            }
        }
        pm0.v.O("FinderReporterThread", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q0(this));
    }

    public void I0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f J0() {
        return this.f206816g;
    }

    public final r45.qt2 L0() {
        return this.f206817h;
    }

    public final kw2.m0 M0() {
        return this.f206821o;
    }

    public final boolean N0() {
        return this.f206822p;
    }

    public void O0() {
        this.f206822p = false;
    }

    public final void P0(r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206817h = contextObj;
        kw2.m0 m0Var = this.f206821o;
        m0Var.getClass();
        m0Var.f394589a = contextObj;
    }

    public void Q0() {
        this.f206822p = true;
    }

    public java.util.LinkedList R0() {
        return new java.util.LinkedList();
    }
}
