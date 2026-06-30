package qq2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f447463a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.dd2 f447464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f447465c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f447466d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f447467e;

    /* renamed from: f, reason: collision with root package name */
    public final int f447468f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f447469g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f447470h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f447471i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f447472j;

    /* renamed from: k, reason: collision with root package name */
    public long f447473k;

    public b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 feedLoader, r45.dd2 dd2Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f447463a = feedLoader;
        this.f447464b = dd2Var;
        this.f447465c = i17;
        this.f447466d = "FeedStreamPreload";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f447467e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.N4).mo141623x754a37bb()).r()).intValue() == 1;
        this.f447468f = ((java.lang.Number) t70Var.V0().r()).intValue();
        this.f447471i = true;
        recyclerView.i(new qq2.a(this));
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f447466d, "finishPreload hasMore:" + z17 + " preloadTime:" + (java.lang.System.currentTimeMillis() - this.f447473k));
        this.f447470h = false;
        this.f447471i = z17;
    }
}
