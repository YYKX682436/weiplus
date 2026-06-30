package tk3;

/* loaded from: classes8.dex */
public final class t implements jk3.f {

    /* renamed from: o, reason: collision with root package name */
    public static final tk3.g f501480o = new tk3.g(null);

    /* renamed from: p, reason: collision with root package name */
    public static volatile tk3.t f501481p;

    /* renamed from: d, reason: collision with root package name */
    public tk3.d f501482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f501483e;

    /* renamed from: f, reason: collision with root package name */
    public final al3.f f501484f;

    /* renamed from: g, reason: collision with root package name */
    public final al3.f f501485g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f501486h;

    /* renamed from: i, reason: collision with root package name */
    public int f501487i;

    /* renamed from: m, reason: collision with root package name */
    public tk3.h f501488m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f501489n;

    public t() {
        al3.f fVar = new al3.f();
        this.f501484f = fVar;
        al3.f fVar2 = new al3.f();
        this.f501485g = fVar2;
        this.f501486h = jz5.h.b(tk3.i.f501459d);
        tk3.h hVar = tk3.h.f501455d;
        this.f501488m = hVar;
        this.f501489n = kz5.c1.k(new jz5.l(hVar, java.lang.Float.valueOf(0.0f)), new jz5.l(tk3.h.f501456e, java.lang.Float.valueOf(0.4f)), new jz5.l(tk3.h.f501457f, java.lang.Float.valueOf(1.0f)));
        tk3.k kVar = new tk3.k(this);
        tk3.l lVar = new tk3.l(this);
        fVar.f87389c = kVar;
        fVar2.f87389c = lVar;
    }

    public static final void k(tk3.t tVar) {
        al3.f fVar = tVar.f501484f;
        fVar.f87387a.removeCallbacks(fVar.f87388b);
        fVar.a(fVar.f87390d);
        al3.f fVar2 = tVar.f501485g;
        fVar2.f87387a.removeCallbacks(fVar2.f87388b);
        fVar2.a(fVar2.f87390d);
        tVar.s(java.lang.System.currentTimeMillis());
        d75.b.g(new tk3.p(tVar, 1.0f));
        tVar.f501488m = tk3.h.f501457f;
    }

    public static void t(tk3.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar, boolean z17, int i17, java.lang.Object obj) {
        tk3.d dVar;
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if (!tVar.p() || (dVar = tVar.f501482d) == null) {
            return;
        }
        if (c16601x7ed0e40c != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e = dVar.f501446a;
            objArr[0] = c16608xd141945e != null ? java.lang.Boolean.valueOf(c16608xd141945e.f232088z) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e2 = dVar.f501446a;
            if (c16608xd141945e2 != null && !c16608xd141945e2.f232088z) {
                c16608xd141945e2.u(z17, false, aVar);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e3 = dVar.f501446a;
            if (c16608xd141945e3 != null && c16608xd141945e3.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e4 = dVar.f501446a;
                if (c16608xd141945e4 != null) {
                    c16608xd141945e4.p(false, false, aVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e5 = dVar.f501446a;
        if (c16608xd141945e5 != null) {
            c16608xd141945e5.f(c16601x7ed0e40c, aVar);
        }
    }

    @Override // kk3.c
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            n(c16601x7ed0e40c, aVar);
        } else {
            d75.b.g(new tk3.o(this, c16601x7ed0e40c, aVar));
        }
    }

    @Override // jk3.f
    public void g(boolean z17, boolean z18) {
        d75.b.g(new tk3.r(this, z17));
    }

    public final void l() {
        tk3.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        tk3.d dVar2 = new tk3.d(context);
        this.f501482d = dVar2;
        android.view.WindowManager windowManager = dVar2.f501448c;
        if (windowManager != null) {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            if (fp.h.c(26)) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.format = 1;
            layoutParams.packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
            layoutParams.flags = android.R.style.DialogWindowTitle.Material;
            layoutParams.gravity = 8388659;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.x = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232028l + qp1.c0.f447241q;
            layoutParams.y = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232029m - qp1.c0.f447238n;
            try {
                windowManager.addView(dVar2.f501446a, layoutParams);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "attachFloatBallViewToWindow success");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTaskNewFloatBallContainer", e17, "attachFloatBallViewToWindow fail", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskNewFloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
        }
        boolean z17 = this.f501483e;
        if (z17) {
            tk3.d dVar3 = this.f501482d;
            if (dVar3 != null && (c16608xd141945e = dVar3.f501446a) != null) {
                c16608xd141945e.m67190x2e48800e(z17);
            }
            this.f501483e = false;
        }
        if (!p() || (dVar = this.f501482d) == null) {
            return;
        }
        tk3.j jVar = new tk3.j(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e2 = dVar.f501446a;
        if (c16608xd141945e2 != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) c16608xd141945e2.f232074i).add(jVar);
        }
    }

    public final void m(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "ball detachFloatBallContainer");
        d75.b.g(new tk3.m(this, i17));
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        try {
            this.f501483e = false;
            if (c16601x7ed0e40c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "empty ball info list");
                m(0);
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            if (p()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "float ball already created");
                t(this, c16601x7ed0e40c, aVar, false, 4, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "float ball did not create");
                l();
                t(this, c16601x7ed0e40c, aVar, false, 4, null);
                q();
            }
            r(o());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskNewUIManager", "doOnFloatBallInfoChanged exp:%s", e17);
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    public final long o() {
        return ((java.lang.Number) ((jz5.n) this.f501486h).mo141623x754a37bb()).longValue();
    }

    public final boolean p() {
        return this.f501482d != null;
    }

    public final void q() {
        java.util.Map map = nk3.e.f419570a;
        nk3.e.f419573d = this.f501487i;
        nk3.e.f419571b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        nk3.e.f419572c = java.lang.System.currentTimeMillis();
        java.util.Map map2 = nk3.e.f419570a;
        ((java.util.LinkedHashMap) map2).clear();
        map2.put("suspended_ball_sid", nk3.e.f419571b);
        map2.put("suspended_ball_startms", java.lang.Long.valueOf(nk3.e.f419572c));
        map2.put("suspended_ball_source", java.lang.Integer.valueOf(nk3.e.f419573d));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("generate_suspended_ball", map2, 33488);
    }

    public final void r(long j17) {
        this.f501484f.a(j17);
        if (7000 < j17) {
            j17 = 7000;
        }
        this.f501485g.a(j17);
        s(java.lang.System.currentTimeMillis());
        d75.b.g(new tk3.p(this, 1.0f));
        this.f501488m = tk3.h.f501457f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "start timer");
    }

    public final void s(long j17) {
        if (j17 > java.lang.System.currentTimeMillis()) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multi_task_ui_storage").B("multi_task_float_ball_create_time", j17);
    }
}
