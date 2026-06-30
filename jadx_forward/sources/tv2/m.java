package tv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f503848h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f503849i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f503850m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f503851n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f503852o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f503853p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, byte[] bArr) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503848h = finderObj;
        this.f503849i = bArr;
        this.f503850m = "LogPost.FinderPostCgiStage";
        this.f503851n = new tv2.x(finderObj, 2);
        this.f503852o = new java.util.concurrent.CountDownLatch(1);
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        java.lang.String str = finderObj.f66949xdec927b;
        ((qs2.q) eVar).getClass();
        boolean z17 = false;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.C8).mo141623x754a37bb()).r()).intValue() != 0) {
            m92.b j37 = g92.a.j3(g92.b.f351302e, str == null ? "" : str, false, 2, null);
            if (j37 != null) {
                r45.ju0 ju0Var = (r45.ju0) j37.u0().m75936x14adae67(33);
                z17 = !(ju0Var != null ? ju0Var.m75933x41a8a7f2(0) : true);
            }
        }
        this.f503853p = z17;
    }

    public static final void k(tv2.m mVar, int i17, int i18, java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = mVar.f503848h;
        c14994x9b99c079.m59433x2b7e608b("doPostSceneEnd");
        if (i17 == 0 && i18 == 0) {
            if (mVar.f503853p) {
                mVar.n(new tv2.o(c14994x9b99c079));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
                if (h17 != null && (c19783xd9a946b72 = h17.f66946x284ddcb8) != null) {
                    c19783xd9a946b72.m76426x5b7df934(c19783xd9a946b72.m76319x2534fe28() + ((int) mVar.g()));
                }
                if (h17 != null && (c19783xd9a946b7 = h17.f66946x284ddcb8) != null) {
                    hc2.p0.b(c19783xd9a946b7, "postSuccess");
                }
                mVar.n(new tv2.q(c14994x9b99c079));
            }
            ov2.e.i(mVar, "andr_Cgi_Post_Suc", mVar.f503848h, 0, null, 12, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.P(c14994x9b99c079.m59260x51f8f5b0(), i17, i18);
            if (c14994x9b99c079.m59328xcaae1dc7()) {
                mv2.f0 f0Var = mv2.f0.f413094a;
                pm0.v.X(new mv2.w(c14994x9b99c079.m59260x51f8f5b0()));
            }
            mVar.n(new tv2.x(c14994x9b99c079, 2));
            mVar.h("andr_Cgi_Post_Fail", c14994x9b99c079, i18, str);
        }
        hz2.d.f367846a.h(i17, i18, str);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        r45.zw0 m76943xbb439a28;
        r45.zw0 m76943xbb439a282;
        r45.q23 m76980xaa7f977e;
        r45.ko6 ko6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503848h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        java.lang.String str = "start localId:" + c14994x9b99c079.m59260x51f8f5b0() + " checkSum:" + ((m76802x2dd01666 == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null || (ko6Var = m76980xaa7f977e.f465134w) == null) ? null : ko6Var.f460417i);
        java.lang.String str2 = this.f503850m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        cu2.t tVar = cu2.u.f303974a;
        if (!tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
            return new tv2.x(c14994x9b99c079, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doPostScene " + c14994x9b99c079.m59260x51f8f5b0());
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 23L, 1L);
            }
        }
        c14994x9b99c079.m59433x2b7e608b("doPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(4);
        }
        tVar.l(c14994x9b99c079);
        boolean m59338xecb5e178 = c14994x9b99c079.m59338xecb5e178();
        byte[] bArr = this.f503849i;
        if (m59338xecb5e178) {
            int m59283x29a6bc40 = c14994x9b99c079.m59283x29a6bc40();
            db2.t2 t2Var = new db2.t2(c14994x9b99c079, bArr, m59283x29a6bc40 != 1 ? m59283x29a6bc40 != 2 ? 4 : 2 : 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doPostSceneContinue finderObj_waitType: " + c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(13));
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 3) {
                n(new tv2.x(c14994x9b99c079, 2));
            } else {
                t2Var.l().K(new tv2.k(this));
            }
        } else {
            db2.p2 p2Var = new db2.p2(c14994x9b99c079, bArr, this.f503853p);
            r45.qo5 qo5Var = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
            java.lang.String m75945x2fec83074 = qo5Var != null ? qo5Var.m75945x2fec8307(2) : null;
            int i17 = 0;
            if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
                l(p2Var);
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
                if (((m76802x2dd016662 == null || (m76943xbb439a282 = m76802x2dd016662.m76943xbb439a28()) == null) ? 0 : m76943xbb439a282.m75939xb282bd08(0)) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "dealDumpCgi has done, continue post");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
                    if (m76802x2dd016663 != null && (m76943xbb439a28 = m76802x2dd016663.m76943xbb439a28()) != null) {
                        i17 = m76943xbb439a28.m75939xb282bd08(0);
                    }
                    p2Var.f309647w.set(23, java.lang.Integer.valueOf(i17));
                    l(p2Var);
                } else {
                    r45.qo5 qo5Var2 = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
                    java.lang.String field_username = c14994x9b99c079.f66949xdec927b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                    new db2.k0(field_username, c14994x9b99c079.m59213xb1ff73bc(), (qo5Var2 == null || (m75945x2fec83073 = qo5Var2.m75945x2fec8307(2)) == null) ? "" : m75945x2fec83073, (qo5Var2 == null || (m75945x2fec83072 = qo5Var2.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072, (qo5Var2 == null || (m75945x2fec8307 = qo5Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307).l().K(new tv2.j(c14994x9b99c079, this, p2Var));
                }
            }
        }
        this.f503852o.await();
        return this.f503851n;
    }

    public final void l(db2.p2 p2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503848h;
        r45.ab4 ab4Var = (r45.ab4) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(31);
        if (ab4Var != null) {
            java.lang.String m75945x2fec8307 = ab4Var.m75945x2fec8307(1);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                new cq.k();
                int m75939xb282bd08 = ab4Var.m75939xb282bd08(0);
                java.lang.String m75945x2fec83072 = ab4Var.m75945x2fec8307(1);
                java.lang.String m75945x2fec83073 = ab4Var.m75945x2fec8307(2);
                r45.xy6 xy6Var = (r45.xy6) ab4Var.m75936x14adae67(3);
                java.lang.String m75945x2fec83074 = ab4Var.m75945x2fec8307(4);
                java.lang.String m75945x2fec83075 = ab4Var.m75945x2fec8307(5);
                java.lang.String m75945x2fec83076 = ab4Var.m75945x2fec8307(8);
                java.lang.String finderUsername = c14994x9b99c079.m59299x6bf53a6c();
                tv2.h hVar = new tv2.h(p2Var, ab4Var, this);
                tv2.i iVar = new tv2.i(this);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
                new bq.s1(m75939xb282bd08, m75945x2fec83072, m75945x2fec83073, xy6Var, m75945x2fec83074, m75945x2fec83075, m75945x2fec83076, finderUsername).l().q(new cq.p0(hVar, iVar));
                return;
            }
        }
        m(p2Var);
    }

    public final boolean m(db2.p2 p2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostSceneContinue finderObj_waitType: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f503848h;
        sb6.append(finderItem.m59277xa8f45ee4().m75939xb282bd08(13));
        sb6.append(", request_waitType:");
        sb6.append(p2Var.f309647w.m75939xb282bd08(23));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f503850m, sb6.toString());
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 3) {
            n(new tv2.x(finderItem, 2));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.y(p2Var2, finderItem, "PostConfirmCgi", null, null, 0, 0L, 60, null);
        ov2.e.i(this, "andr_Cgi_Post_Begin", this.f503848h, 0, null, 12, null);
        p2Var.l().K(new tv2.l(this));
        return true;
    }

    public final void n(pv2.g gVar) {
        this.f503851n = gVar;
        this.f503852o.countDown();
    }
}
