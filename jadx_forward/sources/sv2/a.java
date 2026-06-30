package sv2;

/* loaded from: classes2.dex */
public final class a extends pv2.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f494771f;

    /* renamed from: g, reason: collision with root package name */
    public final int f494772g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f494773h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem, int i17, int i18, java.lang.String errMsg) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f494770e = draftItem;
        this.f494771f = i17;
        this.f494772g = i18;
        this.f494773h = errMsg;
        this.f494774i = "LogPost.FinderDraftFailedStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post failed, localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494770e;
        sb6.append(x80Var.f66236x88be67a1);
        sb6.append(", errType %d, errCode %d, errMsg %s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f494774i, sb6.toString(), java.lang.Integer.valueOf(this.f494771f), java.lang.Integer.valueOf(this.f494772g), this.f494773h);
        x80Var.f66235x52c1d072 = (x80Var.f66235x52c1d072 | 2) & (-2);
        cu2.o.f303963a.b(x80Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206494a.a(x80Var);
        mv2.f0 f0Var = mv2.f0.f413094a;
        pm0.v.X(new mv2.t(x80Var.f66236x88be67a1, false));
        boolean m59314x4d5c4d55 = x80Var.t0().m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 16L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1719L, 16L, 1L);
        }
    }
}
