package sx4;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f495170a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b f495171b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f495172c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f495173d;

    /* renamed from: e, reason: collision with root package name */
    public final sx4.s0 f495174e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f495175f;

    /* renamed from: g, reason: collision with root package name */
    public nw4.n f495176g;

    /* renamed from: h, reason: collision with root package name */
    public final kh0.h f495177h;

    /* renamed from: i, reason: collision with root package name */
    public sx4.p f495178i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f495179j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc f495180k;

    /* renamed from: l, reason: collision with root package name */
    public final sx4.d0 f495181l;

    /* renamed from: m, reason: collision with root package name */
    public long f495182m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f495183n;

    /* renamed from: o, reason: collision with root package name */
    public final sx4.v f495184o = new sx4.g(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3 f495185p = new sx4.n(this);

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b, android.view.ViewGroup viewGroup, java.lang.String str) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc a17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.a(str);
        this.f495180k = a17;
        a17.f149707d = str;
        a17.f149708e = (activityC19411xef36c7b.hashCode() & Integer.MAX_VALUE) + "_" + (str.hashCode() & Integer.MAX_VALUE);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a17.f149718r = activityC19411xef36c7b.getIntent().getLongExtra("start_time", currentTimeMillis);
        a17.f149720t = activityC19411xef36c7b.getIntent().getLongExtra("start_activity_time", currentTimeMillis);
        a17.f149725y = currentTimeMillis;
        a17.A = currentTimeMillis;
        sx4.d0 a18 = sx4.d0.a(str);
        this.f495181l = a18;
        a18.f495116b = java.lang.System.currentTimeMillis();
        this.f495170a = activityC19411xef36c7b;
        this.f495171b = activityC19411xef36c7b;
        this.f495173d = viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19486x36f27892 a19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p4.a(activityC19411xef36c7b);
        a19.setBackgroundResource(android.R.color.transparent);
        a19.setBackgroundColor(0);
        a19.setVisibility(4);
        sx4.p pVar = new sx4.p(this, a19);
        this.f495178i = pVar;
        a19.mo74800x23d27c02(pVar);
        a19.mo81410x6fd49b97(new sx4.o(this, a19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "createFloatWebView, webview: %d, floatWebViewClient: %d", java.lang.Integer.valueOf(a19.hashCode()), java.lang.Integer.valueOf(this.f495178i.hashCode()));
        a19.mo120153xd15cf999().E(true);
        a19.mo120153xd15cf999().z(true);
        a19.mo120153xd15cf999().r(false);
        a19.mo120153xd15cf999().P(true);
        a19.mo120153xd15cf999().G(true);
        a19.mo120153xd15cf999().M(false);
        a19.mo120153xd15cf999().L(false);
        a19.mo120153xd15cf999().C(true);
        a19.mo120153xd15cf999().D(true);
        a19.mo120153xd15cf999().J(0);
        a19.mo120153xd15cf999().l(10485760L);
        a19.mo120153xd15cf999().m(activityC19411xef36c7b.getDir("webviewcache", 0).getAbsolutePath());
        a19.mo120153xd15cf999().k(true);
        a19.mo120153xd15cf999().t(true);
        a19.mo120153xd15cf999().u(lp0.b.X() + "databases/");
        com.p314xaae8f345.p3210x3857dc.d.g().d(true);
        com.p314xaae8f345.p3210x3857dc.d.g().f(a19, true);
        this.f495172c = a19;
        this.f495174e = new sx4.s0(activityC19411xef36c7b.getIntent());
        ((jh0.v) ((kh0.g) i95.n0.c(kh0.g.class))).getClass();
        vz4.x xVar = new vz4.x();
        this.f495177h = xVar;
        xVar.f523297l = new sx4.h(this);
        a17.B = java.lang.System.currentTimeMillis();
        a18.f495117c = java.lang.System.currentTimeMillis();
    }

    public void a() {
        if (this.f495183n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "onDestroy");
        this.f495183n = true;
        this.f495184o.f495199f.a();
        ((vz4.x) this.f495177h).g(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f495172c;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo74800x23d27c02(null);
            c22633x83752a59.mo81410x6fd49b97(null);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.f495180k;
        c10723x8ab106bc.I += java.lang.System.currentTimeMillis() - this.f495182m;
        c10723x8ab106bc.f149706J = java.lang.System.currentTimeMillis();
        jj0.a.a().e(c10723x8ab106bc);
    }
}
