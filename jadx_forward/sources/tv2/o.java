package tv2;

/* loaded from: classes10.dex */
public final class o extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f503855h;

    /* renamed from: i, reason: collision with root package name */
    public pv2.g f503856i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f503857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503855h = finderObj;
        this.f503856i = new tv2.q(finderObj);
        this.f503857m = new java.util.concurrent.CountDownLatch(1);
    }

    @Override // pv2.g
    public int a() {
        return 5;
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
        r45.q23 m76980xaa7f977e;
        r45.ko6 ko6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503855h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostConfirmStage", "start localId:" + c14994x9b99c079.m59260x51f8f5b0() + " checkSum:" + ((m76802x2dd01666 == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null || (ko6Var = m76980xaa7f977e.f465134w) == null) ? null : ko6Var.f460417i));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(5);
            c19783xd9a946b7.m76368x829861a8(c19783xd9a946b7.m76261x4bc1c834() + 1);
        }
        c14994x9b99c079.m59277xa8f45ee4().set(17, java.lang.Long.valueOf(c01.id.a()));
        cu2.u.f303974a.l(c14994x9b99c079);
        c14994x9b99c079.m59433x2b7e608b("doPostConfirmStart");
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue();
        java.util.concurrent.CountDownLatch countDownLatch = this.f503857m;
        if (intValue == 6) {
            this.f503856i = new tv2.q(c14994x9b99c079);
            countDownLatch.countDown();
            return this.f503856i;
        }
        ov2.e.i(this, "andr_Cgi_Confirm_Begin", this.f503855h, 0, null, 12, null);
        new db2.r2(c14994x9b99c079).l().K(new tv2.n(this));
        countDownLatch.await();
        return this.f503856i;
    }
}
