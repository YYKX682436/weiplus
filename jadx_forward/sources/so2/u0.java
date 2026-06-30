package so2;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: l, reason: collision with root package name */
    public static final so2.s0 f492150l = new so2.q0();

    /* renamed from: m, reason: collision with root package name */
    public static final so2.s0 f492151m = new so2.p0();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f492152a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.r0 f492153b;

    /* renamed from: c, reason: collision with root package name */
    public int f492154c;

    /* renamed from: d, reason: collision with root package name */
    public int f492155d;

    /* renamed from: e, reason: collision with root package name */
    public int f492156e;

    /* renamed from: f, reason: collision with root package name */
    public long f492157f;

    /* renamed from: g, reason: collision with root package name */
    public int f492158g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f492159h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f492160i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f492161j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f492162k;

    public u0(java.lang.String tag, so2.r0 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f492152a = tag;
        this.f492153b = config;
        this.f492158g = -1;
    }

    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, boolean z17, so2.s0 s0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastScrollHelper", "attachRecyclerView " + z17 + ' ' + recyclerView + ' ' + s0Var + ' ' + this.f492153b);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f492159h;
        if (w2Var == null) {
            w2Var = new so2.t0(this, s0Var);
        }
        this.f492159h = w2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastScrollHelper", "attachRecyclerView " + z17 + ' ' + recyclerView + ' ' + this.f492159h);
        recyclerView.V0(w2Var);
        recyclerView.i(w2Var);
        if (z17) {
            this.f492154c = 0;
            this.f492155d = 0;
            this.f492156e = 0;
            this.f492157f = 0L;
        }
    }

    public final void b(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastScrollHelper_" + this.f492152a, str);
        }
    }
}
