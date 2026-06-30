package sv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494804h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f494805i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f494806m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494807n;

    /* renamed from: o, reason: collision with root package name */
    public pv2.g f494808o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f494809p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem, byte[] bArr) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494804h = draftItem;
        this.f494805i = bArr;
        this.f494806m = "LogPost.FinderAdDraftPostCgiStage";
        this.f494807n = draftItem.t0();
        this.f494808o = new sv2.c(draftItem, 2);
        this.f494809p = new java.util.concurrent.CountDownLatch(1);
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494807n;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494806m, sb6.toString());
        c14994x9b99c079.m59432x8c9240d6("doAdDraftPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(4);
        }
        java.lang.String m75945x2fec8307 = c14994x9b99c079.m59277xa8f45ee4().m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            c14994x9b99c079.m59277xa8f45ee4().set(0, "FinderLocal_feed_" + java.lang.System.nanoTime());
        }
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue();
        java.util.concurrent.CountDownLatch countDownLatch = this.f494809p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494804h;
        if (intValue == 3) {
            this.f494808o = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
        } else {
            new db2.w4(x80Var.t0(), null, this.f494805i, (r45.ip2) x80Var.m60705xa8f45ee4().m75936x14adae67(29), 2, null).l().q(new sv2.e(this));
        }
        countDownLatch.await();
        return this.f494808o;
    }
}
