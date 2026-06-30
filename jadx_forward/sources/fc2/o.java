package fc2;

/* loaded from: classes2.dex */
public abstract class o extends fc2.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f342490b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f342491c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f342492d;

    /* renamed from: e, reason: collision with root package name */
    public int f342493e;

    /* renamed from: f, reason: collision with root package name */
    public int f342494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f342495g;

    /* renamed from: h, reason: collision with root package name */
    public int f342496h;

    /* renamed from: i, reason: collision with root package name */
    public int f342497i;

    /* renamed from: j, reason: collision with root package name */
    public int f342498j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f342499k;

    /* renamed from: l, reason: collision with root package name */
    public int f342500l;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f342501m;

    /* renamed from: n, reason: collision with root package name */
    public final long f342502n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 f342503o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f342504p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f342505q;

    public o(fc2.c cVar) {
        super(cVar);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewConfiguration, "get(...)");
        this.f342490b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;
        this.f342491c = jz5.h.b(fc2.h.f342478d);
        this.f342492d = new android.graphics.Rect();
        this.f342493e = Integer.MAX_VALUE;
        this.f342494f = Integer.MAX_VALUE;
        this.f342495g = viewConfiguration.getScaledTouchSlop();
        this.f342499k = new int[5];
        this.f342502n = 500L;
        this.f342503o = new fc2.f(this);
        this.f342504p = new fc2.n(this);
        this.f342505q = new fc2.g(this, android.os.Looper.getMainLooper());
    }

    public static final /* synthetic */ java.lang.String b(fc2.o oVar) {
        oVar.getClass();
        return "Finder.FinderFeedFlowEventSubscriber";
    }

    public abstract fc2.a c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17);

    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f342501m = recyclerView;
        recyclerView.i(new fc2.i(this));
        recyclerView.O(new fc2.k(recyclerView, this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 == null || !(mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf)) {
            return;
        }
        mo7946xf939df19.mo8163xed962dec(this.f342503o);
    }

    public void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f342504p);
        this.f342505q.mo50303x856b99f0(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f342501m;
        if (c1163xf1deaba4 != null) {
            g(c1163xf1deaba4, 10);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onInvisible " + this.f342493e + ' ' + this.f342494f);
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onVisible " + this.f342493e + ' ' + this.f342494f);
        this.f342493e = Integer.MAX_VALUE;
        this.f342494f = Integer.MAX_VALUE;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f342504p, 200L);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f342501m;
        if (c1163xf1deaba4 != null) {
            g(c1163xf1deaba4, 7);
        }
    }

    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        fc2.a c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            c17 = c(recyclerView, i17);
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= 50) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderFeedFlowEventSubscriber", "[checkUICost] " + ("what are you doing? guy! This operation is so slow in ui thread.[" + uptimeMillis2 + "ms]"));
            }
        } else {
            c17 = c(recyclerView, i17);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z17 = false;
        if (layoutManager != null && !layoutManager.m8042xf4368959()) {
            z17 = true;
        }
        if (z17 && (i17 == 10 || i17 == 7)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209589z8).mo141623x754a37bb()).r()).intValue() == 1) {
                pm0.v.V(0L, new fc2.l(this, c17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "publish event but recyclerView is detached, newState:" + i17);
                pm0.z.b(xy2.b.f539688b, "unfocusNotCalled", false, null, null, false, false, null, 124, null);
                return;
            }
        }
        recyclerView.post(new fc2.m(this, c17));
    }
}
