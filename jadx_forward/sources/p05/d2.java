package p05;

/* loaded from: classes10.dex */
public final class d2 implements p05.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f432019a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f432020b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f432021c;

    /* renamed from: d, reason: collision with root package name */
    public long f432022d;

    /* renamed from: e, reason: collision with root package name */
    public qu5.a f432023e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f432024f;

    /* renamed from: g, reason: collision with root package name */
    public p05.x0 f432025g;

    /* renamed from: h, reason: collision with root package name */
    public int f432026h;

    /* renamed from: i, reason: collision with root package name */
    public final p05.c2 f432027i;

    public d2(p05.z0 weVisionJsonCallbackBucket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f432019a = weVisionJsonCallbackBucket;
        this.f432024f = new java.util.ArrayList();
        this.f432026h = 1;
        this.f432027i = new p05.c2(this);
    }

    public static final void c(p05.d2 d2Var, p05.s1 s1Var) {
        java.util.ArrayList arrayList = d2Var.f432024f;
        arrayList.add(s1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#addToWorkingSet size=" + arrayList.size() + ' ' + s1Var);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f432020b && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432022d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        sb6.append(tq5.i.f502802a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f432021c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432021c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.c2 c17 = this.f432027i;
        p05.z0 z0Var = this.f432019a;
        if (d0Var != null) {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432022d = j17;
            if (j17 == 0) {
                return;
            }
            z0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
            z0Var.f432272a.add(c17);
            this.f432020b = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#destroy");
        z0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        z0Var.f432272a.remove(c17);
        this.f432023e = null;
        this.f432025g = null;
        this.f432022d = 0L;
        this.f432020b = false;
    }

    public void d(p05.w0 res, qu5.a threadHandler, p05.x0 x0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadHandler, "threadHandler");
        this.f432023e = threadHandler;
        if (x0Var != null) {
            ((tf2.g) x0Var).f500453a = new p05.t1(this);
        } else {
            x0Var = null;
        }
        this.f432025g = x0Var;
        if (res.f432253e.length == 4 && res.f432252d.length == 2) {
            if (!(res.f432250b.length() == 0)) {
                if (!(res.f432249a.length() == 0)) {
                    if (res.f432251c >= 0) {
                        e(100L, new p05.x1(res, this));
                        return;
                    } else {
                        e(100L, new p05.z1(res, this));
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#append bad data");
    }

    public final void e(long j17, yz5.a aVar) {
        final p05.u1 u1Var = new p05.u1(java.lang.System.currentTimeMillis(), j17, aVar);
        qu5.a aVar2 = this.f432023e;
        if (aVar2 != null) {
            aVar2.mo50297x7c4d7ca2(new java.lang.Runnable(u1Var) { // from class: p05.a2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f431971d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u1Var, "function");
                    this.f431971d = u1Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f431971d.mo152xb9724478();
                }
            }, j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePkGiftEffect", "#glThread holy.. where is your threadHandler");
        }
    }
}
