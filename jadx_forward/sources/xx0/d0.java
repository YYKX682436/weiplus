package xx0;

/* loaded from: classes5.dex */
public final class d0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f539409d;

    /* renamed from: e, reason: collision with root package name */
    public final vt3.r f539410e;

    /* renamed from: f, reason: collision with root package name */
    public final xx0.i f539411f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f539412g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f539413h;

    /* renamed from: i, reason: collision with root package name */
    public final xx0.t f539414i;

    /* renamed from: m, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f539415m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e06.k f539416n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f539417o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context, p3325xe03a0797.p3326xc267989b.y0 scope, vt3.r tabItem, xx0.i dataProvider, xx0.j jVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabItem, "tabItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataProvider, "dataProvider");
        this.f539409d = scope;
        this.f539410e = tabItem;
        this.f539411f = dataProvider;
        this.f539416n = new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571003dk3, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lbl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f539412g = (android.widget.ProgressBar) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f539413h = c1163xf1deaba4;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ait);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aix);
        int i17 = (com.p314xaae8f345.mm.ui.bk.h(context).x - (dimensionPixelSize * 2)) / dimensionPixelSize2;
        i17 = i17 <= 0 ? 4 : i17;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, i17, 1, false));
        c1163xf1deaba4.N(new xx0.o(context, i17, dimensionPixelSize2));
        xx0.t tVar = new xx0.t(dataProvider, jVar);
        this.f539414i = tVar;
        c1163xf1deaba4.mo7960x6cab2c8d(tVar);
        c1163xf1deaba4.i(new xx0.a0(this));
    }

    public final void a() {
        e06.k kVar;
        int i17;
        int i18;
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        long j17 = this.f539410e.f521572a;
        ((yy0.o0) k0Var).getClass();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        java.lang.String templateTabID = java.lang.String.valueOf(j17);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateTabID, "templateTabID");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.e6(m7Var, templateTabID, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_tab_id", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "sc_enter_template_tab");
        ((cy1.a) rVar).yj("sc_enter_template_tab", null, Ai, 6, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", "notifyIsSelected tab: " + this.f539410e.f521572a);
        this.f539417o = true;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539416n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) || (i17 = (kVar = this.f539416n).f327742d) > (i18 = kVar.f327743e)) {
            return;
        }
        while (true) {
            this.f539414i.B(i17);
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b() {
        e06.k kVar;
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", "notifyIsUnselected tab: " + this.f539410e.f521572a);
        this.f539417o = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539416n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) || (i17 = (kVar = this.f539416n).f327742d) > (i18 = kVar.f327743e)) {
            return;
        }
        while (true) {
            this.f539414i.z(i17);
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* renamed from: getTabID */
    public final long m176151x752dddba() {
        return this.f539410e.f521572a;
    }
}
