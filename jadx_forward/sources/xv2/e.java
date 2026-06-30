package xv2;

/* loaded from: classes10.dex */
public final class e extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f538936h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f538937i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f538938m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f538939n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f538940o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, byte[] bArr) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f538936h = finderObj;
        this.f538937i = bArr;
        this.f538938m = "LogPost.FinderPostCgiStage";
        this.f538939n = new tv2.x(finderObj, 2);
        this.f538940o = new java.util.concurrent.CountDownLatch(1);
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f538936h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f538938m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        cu2.t tVar = cu2.u.f303974a;
        if (!tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
            return new tv2.x(c14994x9b99c079, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doPostScene " + c14994x9b99c079.m59260x51f8f5b0());
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
        db2.p2 p2Var = new db2.p2(this.f538936h, this.f538937i, false, 4, null);
        r45.qo5 qo5Var = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qo5Var != null ? qo5Var.m75945x2fec8307(2) : null)) {
            k(p2Var);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
            int i17 = 0;
            if (((m76802x2dd01666 == null || (m76943xbb439a282 = m76802x2dd01666.m76943xbb439a28()) == null) ? 0 : m76943xbb439a282.m75939xb282bd08(0)) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dealDumpCgi has done, continue post");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
                if (m76802x2dd016662 != null && (m76943xbb439a28 = m76802x2dd016662.m76943xbb439a28()) != null) {
                    i17 = m76943xbb439a28.m75939xb282bd08(0);
                }
                p2Var.f309647w.set(23, java.lang.Integer.valueOf(i17));
                k(p2Var);
            } else {
                r45.qo5 qo5Var2 = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
                java.lang.String field_username = c14994x9b99c079.f66949xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                new db2.k0(field_username, c14994x9b99c079.m59213xb1ff73bc(), (qo5Var2 == null || (m75945x2fec83073 = qo5Var2.m75945x2fec8307(2)) == null) ? "" : m75945x2fec83073, (qo5Var2 == null || (m75945x2fec83072 = qo5Var2.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072, (qo5Var2 == null || (m75945x2fec8307 = qo5Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307).l().K(new xv2.c(c14994x9b99c079, this, p2Var));
            }
        }
        this.f538940o.await();
        return this.f538939n;
    }

    public final boolean k(db2.p2 p2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostSceneContinue finderObj_waitType: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f538936h;
        sb6.append(c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(13));
        sb6.append(", request_waitType:");
        sb6.append(p2Var.f309647w.m75939xb282bd08(23));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f538938m, sb6.toString());
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 3) {
            this.f538939n = new tv2.x(c14994x9b99c079, 2);
            this.f538940o.countDown();
            return false;
        }
        ov2.e.i(this, "andr_Cgi_Post_Begin", this.f538936h, 0, null, 12, null);
        p2Var.l().K(new xv2.d(this));
        return true;
    }
}
