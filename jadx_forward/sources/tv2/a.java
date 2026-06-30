package tv2;

/* loaded from: classes2.dex */
public final class a extends pv2.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f503798e;

    /* renamed from: f, reason: collision with root package name */
    public final int f503799f;

    /* renamed from: g, reason: collision with root package name */
    public final int f503800g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f503801h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f503802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, int i17, int i18, java.lang.String errMsg) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f503798e = finderObj;
        this.f503799f = i17;
        this.f503800g = i18;
        this.f503801h = errMsg;
        this.f503802i = "LogPost.FinderFailedStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72;
        int i17 = this.f503799f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f503800g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f503802i, "post failed, errType %d, errCode %d, errMsg %s", valueOf, java.lang.Integer.valueOf(i18), this.f503801h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503798e;
        c14994x9b99c079.m59403x65a826ff();
        if (Integer.MIN_VALUE != i17 && (c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8) != null) {
            c19783xd9a946b72.m76360x362883df(i17);
        }
        if (Integer.MIN_VALUE != i18 && (c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8) != null) {
            c19783xd9a946b7.m76359x3620a292(i18);
        }
        cu2.u.f303974a.l(c14994x9b99c079);
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 18L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1523L, 18L, 1L);
        }
        mv2.f0 f0Var = mv2.f0.f413094a;
        pm0.v.X(new mv2.v(c14994x9b99c079.m59260x51f8f5b0(), false));
        pm0.v.X(new mv2.w(c14994x9b99c079.m59260x51f8f5b0()));
        boolean m59314x4d5c4d552 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.C(1253L, 16L, 1L);
        if (m59314x4d5c4d552) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var2.C(1253 == 1253 ? 1523L : 0L, 16L, 1L);
            }
        }
    }
}
