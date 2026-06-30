package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f197212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f197213b;

    /* renamed from: c, reason: collision with root package name */
    public final long f197214c;

    /* renamed from: d, reason: collision with root package name */
    public final long f197215d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n f197216e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.g f197217f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f197218g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f197219h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f197220i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f197221j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f197222k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m f197223l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197224m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.View f197225n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 f197226o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnTouchListener f197227p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o f197228q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f197229r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f197230s;

    public t() {
        int i17 = dk2.ef.P;
        this.f197212a = i17 <= 0 ? 5 : i17;
        int i18 = dk2.ef.Q;
        this.f197213b = i18 <= 0 ? 1000 : i18;
        this.f197214c = 500L;
        this.f197215d = 100L;
        this.f197216e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197164d;
        this.f197217f = new dk2.g(0L);
        this.f197221j = true;
        this.f197224m = true;
        this.f197226o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2();
        this.f197227p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s(this);
        this.f197228q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o(this);
        this.f197229r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("ContinuousClickManager::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r(this), true);
        this.f197230s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("ContinuousClickManager::longClickTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q(this), true);
    }

    public static final /* synthetic */ java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar) {
        tVar.getClass();
        return "Finder.ContinuousClickManager";
    }

    public final void b() {
        pm0.v.C(this.f197228q);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f197230s;
        b4Var.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "cancelLongClickState: longClickTimer.stopped = " + b4Var.e());
    }

    public final void c() {
        int i17 = this.f197218g - this.f197219h;
        if (i17 >= this.f197212a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "checkComboBatchSize: clickCnt = " + this.f197218g + ", lastClickCnt = " + this.f197219h);
            this.f197219h = this.f197218g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = this.f197223l;
            if (mVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.b(mVar, this.f197225n, this.f197218g, i17, this.f197216e, this.f197217f, false, false, 96, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 r2Var = this.f197226o;
            r2Var.a("checkComboBatchSize", i17, r2Var.b(true));
            if (this.f197229r.e()) {
                return;
            }
            this.f197229r.d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f197229r;
            long j17 = this.f197213b;
            b4Var.c(j17, j17);
        }
    }

    public final void d(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        if (this.f197225n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "unRegisterView view null");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197225n, view)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "unRegisterView view not eqauls");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "unRegisterView view: " + view);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (c14227x4262fb44 = ((je2.t) eVar.a(je2.t.class)).f380803p) != null) {
            android.view.View view2 = this.f197225n;
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Integer.valueOf(view2 != null ? view2.hashCode() : 0));
        }
        android.view.View view3 = this.f197225n;
        if (view3 != null) {
            view3.setOnTouchListener(null);
        }
        this.f197225n = null;
        this.f197229r.d();
        b();
        int i17 = this.f197218g - this.f197219h;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = this.f197223l;
            if (mVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep) mVar).c(this.f197225n, this.f197218g, i17, this.f197216e, this.f197217f, true, this.f197222k);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 r2Var = this.f197226o;
            r2Var.a("unRegisterView", i17, r2Var.b(false));
        }
        this.f197222k = false;
        this.f197223l = null;
        e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197164d);
        this.f197221j = true;
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "updateState: newState = " + nVar);
        this.f197216e = nVar;
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            this.f197218g = 0;
            this.f197219h = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 r2Var = this.f197226o;
            synchronized (r2Var.f197201a) {
                r2Var.f197201a.clear();
            }
            this.f197217f = new dk2.g(0L);
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            this.f197218g++;
            this.f197226o.c(this.f197217f, 1);
            int i17 = this.f197218g - this.f197219h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = this.f197223l;
            if (mVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.a(mVar, this.f197225n, this.f197218g, nVar, this.f197217f, i17, false, 32, null);
            }
            this.f197226o.a(java.lang.String.valueOf(nVar), i17, this.f197226o.b(false));
            c();
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f197218g++;
        this.f197226o.c(this.f197217f, 1);
        int i18 = this.f197218g - this.f197219h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar2 = this.f197223l;
        if (mVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.a(mVar2, this.f197225n, this.f197218g, nVar, this.f197217f, i18, false, 32, null);
        }
        this.f197226o.a(java.lang.String.valueOf(nVar), i18, this.f197226o.b(false));
        c();
    }
}
