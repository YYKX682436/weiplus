package bt3;

/* loaded from: classes9.dex */
public class t2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public pt.n0 f105947f;

    /* renamed from: i, reason: collision with root package name */
    public final int f105950i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f105945d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f105946e = -1;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f105948g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f105949h = new java.util.LinkedList();

    public t2() {
        this.f105950i = 7;
        gm0.j1.n().f354821b.a(632, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, this);
        try {
            this.f105950i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_recordmsg_send_waiting_time, 7);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordMsgSendService", e17, "RecordMsgSendService init error.", new java.lang.Object[0]);
        }
    }

    public static void a(bt3.t2 t2Var, java.lang.String str) {
        t2Var.getClass();
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str, 19, null, null);
    }

    public final void b(zs3.b0 b0Var, boolean z17) {
        pt.n0 n0Var = this.f105947f;
        if (n0Var != null) {
            long j17 = b0Var.f68498x297eb4f7;
            if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4) n0Var).f270365g == j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue currentAppMsgScene same msgId %s", java.lang.Long.valueOf(j17));
                return;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] update msg content, msg null ? %B, msgId %d recordInfoId %d, recordInfo.localId:%d, afterCdnUpload %s, toUser:%s", java.lang.Boolean.FALSE, java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Long.valueOf(b0Var.f68498x297eb4f7), java.lang.Integer.valueOf(b0Var.f68497x88be67a1), java.lang.Boolean.valueOf(z17), b0Var.f68503x1209e7cb);
        long m124847x74d37ac6 = Li.m124847x74d37ac6();
        long j18 = b0Var.f68498x297eb4f7;
        if (m124847x74d37ac6 == j18) {
            Li.d1(bt3.g2.h(b0Var.f68502x29dd02d3, b0Var.f68495x225aa2b6, b0Var.f68494x84214f59, b0Var.f68496x3474bf20, j18, b0Var.f68503x1209e7cb));
            Li.r1(1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(b0Var.f68498x297eb4f7, Li, true);
        }
        ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7);
        if (y07 != null) {
            y07.f67771x4b6e9352 = Li.j();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[]{"msgId"});
        }
        if (c01.e2.O(b0Var.f68503x1209e7cb) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20502x482d5ffe()) == 0) {
            ((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).y0(b0Var.f68497x88be67a1);
        }
        this.f105948g.remove(b0Var.f68497x88be67a1);
        if (Li.mo78012x3fdd41df() + (this.f105950i * 24 * 3600 * 1000) < c01.id.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue, out of wait time, " + Li.mo78012x3fdd41df());
            Li.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(b0Var.f68498x297eb4f7, Li, true);
            return;
        }
        if (bt3.g2.I(b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, true, "")) {
            return;
        }
        zs3.v vVar = (zs3.v) i95.n0.c(zs3.v.class);
        java.lang.String str = b0Var.f68503x1209e7cb;
        long j19 = b0Var.f68498x297eb4f7;
        ((bt3.x1) vVar).getClass();
        this.f105947f = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().b(str, j19);
    }

    public final void c(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() == j17) {
            Li.d1(str2);
            Li.r1(1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str, j17);
        if (y07 != null) {
            y07.f67771x4b6e9352 = Li.j();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[]{"msgId"});
        }
        this.f105948g.remove(i17);
        ((bt3.x1) ((zs3.v) i95.n0.c(zs3.v.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().b(str, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "batch tran cdn ok, talker[%s], msgId[%d], recordLocalId[%d], begin send appmsg", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public final boolean d(zs3.y yVar, java.util.List list, int i17) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 17) {
                    r45.ul5 A = bt3.g2.A(gp0Var.Z1);
                    if (A == null) {
                        break;
                    }
                    boolean d17 = d(yVar, A.f468998f, i17 + 1);
                    if (d17) {
                        gp0Var.C0(bt3.g2.i(A, gp0Var.Z1));
                    }
                    z17 = d17;
                } else if (yVar.f68319xf604e54a.equals(bt3.g2.w(gp0Var.T, i17))) {
                    gp0Var.a0(yVar.f68317xf47749d7);
                    gp0Var.b0(yVar.f68318xf47770e7);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    z17 = true;
                    if (!(i17 == 1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
                        gp0Var.e0(bt3.g2.p(gp0Var.toString(), gp0Var.I));
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "replaceOtherCdnInfoEmbeddedRecord() msgData == null");
        }
        return z17;
    }

    public final boolean e(zs3.y yVar, java.util.List list, int i17) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 17) {
                    r45.ul5 A = bt3.g2.A(gp0Var.Z1);
                    if (A == null) {
                        break;
                    }
                    boolean e17 = e(yVar, A.f468998f, i17 + 1);
                    if (e17) {
                        gp0Var.C0(bt3.g2.i(A, gp0Var.Z1));
                    }
                    z17 = e17;
                } else if (yVar.f68319xf604e54a.equals(bt3.g2.w(bt3.g2.F(gp0Var.T), i17))) {
                    gp0Var.c0(yVar.f68317xf47749d7);
                    gp0Var.d0(yVar.f68318xf47770e7);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    z17 = true;
                    if (!(i17 == 1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
                        gp0Var.e0(bt3.g2.p(gp0Var.toString(), gp0Var.I));
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "replaceThumbCdnInfomEbeddedRecord() msgData == null");
        }
        return z17;
    }

    public void f(zs3.b0 b0Var, boolean z17) {
        bt3.j2 j2Var = new bt3.j2(this, b0Var, z17);
        jm0.f fVar = jm0.g.f381799e;
        if (b0Var == null) {
            ys3.i iVar = (ys3.i) i95.n0.c(ys3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            ((bt3.h1) fVar.a(iVar, bt3.h1.class)).W6();
            gm0.j1.e().j(j2Var);
            return;
        }
        if (b0Var.f68504x2262335f != 1) {
            gm0.j1.e().j(j2Var);
            return;
        }
        ys3.i iVar2 = (ys3.i) i95.n0.c(ys3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
        ((bt3.h1) fVar.a(iVar2, bt3.h1.class)).W6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r16, int r17, java.lang.String r18, com.p314xaae8f345.mm.p944x882e457a.m1 r19) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.t2.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
