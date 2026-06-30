package sv2;

/* loaded from: classes10.dex */
public final class q extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494876h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f494877i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f494878m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494879n;

    /* renamed from: o, reason: collision with root package name */
    public pv2.g f494880o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f494881p;

    public /* synthetic */ q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var, byte[] bArr, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(x80Var, (i17 & 2) != 0 ? null : bArr);
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
        r45.q23 m76980xaa7f977e;
        r45.ko6 ko6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494879n;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494878m, "start localId:" + c14994x9b99c079.m59260x51f8f5b0() + " checkSum:" + ((m76802x2dd01666 == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null || (ko6Var = m76980xaa7f977e.f465134w) == null) ? null : ko6Var.f460417i));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494876h;
        if (!(((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null)) {
            return new sv2.c(x80Var, 1);
        }
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 23L, 1L);
            }
        }
        c14994x9b99c079.m59432x8c9240d6("doPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(4);
        }
        cu2.o.f303963a.b(x80Var);
        java.lang.String m75945x2fec83074 = c14994x9b99c079.m59277xa8f45ee4().m75945x2fec8307(0);
        if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
            c14994x9b99c079.m59277xa8f45ee4().set(0, "FinderLocal_feed_" + java.lang.System.nanoTime());
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (((m76802x2dd016662 == null || (m76943xbb439a28 = m76802x2dd016662.m76943xbb439a28()) == null) ? 0 : m76943xbb439a28.m75939xb282bd08(0)) == 0) {
            r45.qo5 qo5Var = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
            java.lang.String m75945x2fec83075 = qo5Var != null ? qo5Var.m75945x2fec8307(2) : null;
            if (!(m75945x2fec83075 == null || m75945x2fec83075.length() == 0)) {
                r45.qo5 qo5Var2 = (r45.qo5) c14994x9b99c079.m59277xa8f45ee4().m75936x14adae67(12);
                java.lang.String field_username = c14994x9b99c079.f66949xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                new db2.k0(field_username, c14994x9b99c079.m59213xb1ff73bc(), (qo5Var2 == null || (m75945x2fec83073 = qo5Var2.m75945x2fec8307(2)) == null) ? "" : m75945x2fec83073, (qo5Var2 == null || (m75945x2fec83072 = qo5Var2.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072, (qo5Var2 == null || (m75945x2fec8307 = qo5Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307).l().K(new sv2.o(c14994x9b99c079, this));
                this.f494881p.await();
                return this.f494880o;
            }
        }
        k();
        this.f494881p.await();
        return this.f494880o;
    }

    public final boolean k() {
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494876h;
        if (intValue == 3) {
            this.f494880o = new sv2.c(x80Var, 2);
            this.f494881p.countDown();
            return false;
        }
        ov2.e.i(this, "andr_Cgi_Draft_Begin", this.f494879n, 0, null, 12, null);
        new db2.w4(x80Var.t0(), null, this.f494877i, null, 10, null).l().q(new sv2.p(this));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem, byte[] bArr) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494876h = draftItem;
        this.f494877i = bArr;
        this.f494878m = "LogPost.FinderDraftPostCgiStage";
        this.f494879n = draftItem.t0();
        this.f494880o = new sv2.c(draftItem, 2);
        this.f494881p = new java.util.concurrent.CountDownLatch(1);
    }
}
