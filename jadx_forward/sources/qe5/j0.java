package qe5;

/* loaded from: classes12.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f443662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qe5.m0 m0Var) {
        super(1);
        this.f443662d = m0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        oi3.g gVar;
        ot0.q qVar;
        oi3.g gVar2;
        java.lang.Object obj2;
        java.lang.String j17;
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.f fVar = (kd5.f) state.a(kd5.f.class);
        qe5.m0 m0Var = this.f443662d;
        if (fVar != null && fVar.f388429b && m0Var.f443681g == 1) {
            m0Var.c7(false);
        }
        kd5.p pVar = (kd5.p) state.a(kd5.p.class);
        if (pVar != null) {
            m0Var.getClass();
            xg3.l0 l0Var = pVar.f388442b;
            java.util.ArrayList arrayList = l0Var != null ? l0Var.f535945c : null;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    long m124847x74d37ac6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj2).m124847x74d37ac6();
                    java.lang.Long X6 = m0Var.X6();
                    if (X6 != null && m124847x74d37ac6 == X6.longValue()) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj2;
                if (f9Var != null) {
                    kd5.e V6 = m0Var.V6();
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(V6 != null ? V6.f388413h : null) && f9Var.A0() == 0) {
                        j17 = f9Var.j();
                        if (j17 != null) {
                            j17 = c01.w9.u(j17);
                        }
                    } else {
                        j17 = f9Var.j();
                    }
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null) {
                        m0Var.f443681g = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, m0Var.U6());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "update msgId:%s newType:%s newFileStatus:%s", m0Var.X6(), java.lang.Integer.valueOf(v17.f430199i), java.lang.Integer.valueOf(m0Var.f443681g));
                        if (ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m0Var.m158354x19263085();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                            j75.f Q6 = ((qe5.n1) pf5.z.f435481a.a(activity).a(qe5.n1.class)).Q6();
                            if (Q6 != null) {
                                Q6.B3(new kd5.i(false));
                            }
                        }
                    }
                }
            }
        }
        if (((kd5.c) state.a(kd5.c.class)) != null) {
            if (m0Var.e7()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y6 = m0Var.Y6();
                if (m0Var.X6() == null || Y6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "onCreate: msgInfo or msgId is null");
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d U6 = m0Var.U6();
                    if (U6 != null) {
                        m0Var.W6(false);
                        U6.f68112x10a0fed7 = 101;
                        U6.f68103x4a777c2 = c01.id.e();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(U6, new java.lang.String[0]);
                    }
                    bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                    long I0 = Y6.I0();
                    java.lang.String y07 = Y6.y0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y07, "getFromUsername(...)");
                    ((kq3.e) sVar).Ai(I0, y07, true, Y6.mo78012x3fdd41df());
                    p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m0Var.m158354x19263085()), null, null, new qe5.i0(Y6, m0Var, null), 3, null);
                }
            }
            m0Var.c7(false);
        }
        kd5.r rVar = (kd5.r) state.a(kd5.r.class);
        if (rVar != null) {
            m0Var.h7(rVar.f388443b);
        }
        kd5.t tVar = (kd5.t) state.a(kd5.t.class);
        if (tVar != null) {
            if (tVar.f388444b) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d U62 = m0Var.U6();
                if (U62 != null) {
                    long j18 = U62.f68112x10a0fed7;
                    if (j18 != 199) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", java.lang.Long.valueOf(j18));
                        U62.f68112x10a0fed7 = 102L;
                        U62.f68103x4a777c2 = c01.id.e();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(U62, new java.lang.String[0]);
                        kd5.e V62 = m0Var.V6();
                        if (V62 != null) {
                            V62.H = false;
                        }
                    }
                }
                kd5.e V63 = m0Var.V6();
                java.lang.String str = V63 != null ? V63.f388413h : null;
                if (str == null) {
                    str = "";
                }
                kd5.e V64 = m0Var.V6();
                ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).Zi(new h40.f(str, (V64 == null || (gVar2 = V64.f388414i) == null) ? 0L : gVar2.m75942xfb822ef2(gVar2.f427150d + 1)));
            } else {
                kd5.e V65 = m0Var.V6();
                if (V65 == null || (gVar = V65.f388414i) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "dealUploadingPause: simpleMsgInfo is null");
                } else {
                    kd5.e V66 = m0Var.V6();
                    java.lang.String n17 = (V66 == null || (qVar = V66.f388415m) == null) ? null : qVar.n();
                    if (n17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "dealUploadingPause: appMsgContent is null");
                    } else {
                        int i17 = gVar.f427150d;
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.x(gVar.m75942xfb822ef2(i17 + 0), gVar.m75945x2fec8307(i17 + 3), n17);
                        m0Var.c7(false);
                    }
                }
            }
        }
        if (((kd5.y) state.a(kd5.y.class)) != null) {
            m0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "start receive file");
            kd5.e V67 = m0Var.V6();
            java.lang.Integer valueOf = V67 != null ? java.lang.Integer.valueOf(V67.f388422t) : null;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y62 = m0Var.Y6();
            if (Y62 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
            } else {
                ez.v0 v0Var = ez.v0.f339310a;
                if (v0Var.k(valueOf)) {
                    ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y62, null, 1, true);
                } else {
                    ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y62, null, 0, true);
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y62.m124847x74d37ac6(), Y62, true);
                if (v0Var.k(valueOf)) {
                    m0Var.c7(true);
                } else {
                    m0Var.c7(true);
                    if (m0Var.e7()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y63 = m0Var.Y6();
                        if (Y63 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "startToDownloadFile");
                            m0Var.T6();
                            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                            com.p314xaae8f345.mm.p957x53236a1b.g1.M(Y63);
                        }
                    }
                }
                d35.h hVar = d35.h.f307877a;
                kd5.e V68 = m0Var.V6();
                hVar.d(Y62, V68 != null ? V68.f388415m : null);
            }
        }
        kd5.v vVar = (kd5.v) state.a(kd5.v.class);
        if (vVar != null) {
            m0Var.c7(vVar.f388447b);
        }
        if (((kd5.a) state.a(kd5.a.class)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadUIC", "cancel receive file");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y64 = m0Var.Y6();
            if (Y64 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
            } else {
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y64, null, 5, true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y64.m124847x74d37ac6(), Y64, true);
                m0Var.c7(false);
            }
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(state.a(kd5.x.class));
        return jz5.f0.f384359a;
    }
}
