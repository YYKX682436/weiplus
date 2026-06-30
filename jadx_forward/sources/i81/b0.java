package i81;

/* loaded from: classes7.dex */
public class b0 implements i81.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f371058b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f371059c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c f371060d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f371062f;

    /* renamed from: g, reason: collision with root package name */
    public long f371063g;

    /* renamed from: a, reason: collision with root package name */
    public final bm5.z0 f371057a = new bm5.z0(new i81.C28497x57b5d14());

    /* renamed from: e, reason: collision with root package name */
    public int f371061e = 9;

    /* renamed from: h, reason: collision with root package name */
    public long f371064h = 0;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f371065i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f371066j = false;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f371067k = false;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f371068l = false;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f371069m = null;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c cVar) {
        this.f371058b = o6Var;
        this.f371060d = cVar;
    }

    public static boolean i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        return i81.a0.a(o6Var).f371109t == 1;
    }

    public final void a() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, isSplashAdFinished:%s, canLoadingSplashFinish:%s", java.lang.Boolean.valueOf(this.f371066j), java.lang.Boolean.valueOf(this.f371067k));
        if (this.f371066j && this.f371067k && (f17 = f()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, remove AdLoadingSplash");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g0.a()) {
                f17.m();
            } else if (i(this.f371058b)) {
                h(new yz5.a() { // from class: i81.b0$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc.this.m();
                        return null;
                    }
                });
            } else {
                f17.m();
            }
            yz5.a aVar = this.f371069m;
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "call splash hide listener, which is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "call splash hide listener");
            this.f371069m = null;
            aVar.mo152xb9724478();
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdPrepareProcessReady   isResourceReady=" + this.f371068l + " isSplashAdFinished=" + this.f371066j);
    }

    public void c(final boolean z17, final java.lang.String str, int i17, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc ycVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "closeSplashAd, source: %s, closeType: %d", str, java.lang.Integer.valueOf(i17));
        int i18 = this.f371061e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f371058b;
        if (10 != i18) {
            this.f371061e = 10;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.g(o6Var, false, i17);
        }
        o6Var.m(new java.lang.Runnable() { // from class: i81.b0$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f17;
                i81.b0 b0Var = i81.b0.this;
                boolean z18 = z17;
                java.lang.String str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc ycVar2 = ycVar;
                b0Var.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g0.a() && b0Var.f371067k && (f17 = b0Var.f()) != null) {
                    android.view.View mo52965xfb86a31b = f17.mo52986xf673f150().mo52965xfb86a31b();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mo52965xfb86a31b, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ad/AppBrandSplashAdLogic", "hideLoadingSplashImmediately", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo52965xfb86a31b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(mo52965xfb86a31b, "com/tencent/mm/plugin/appbrand/ad/AppBrandSplashAdLogic", "hideLoadingSplashImmediately", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f18 = b0Var.f();
                if (f18 != null) {
                    f18.e(z18, str2, ycVar2);
                }
            }
        });
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "closeSplashAdImmediately");
        this.f371058b.m(new java.lang.Runnable() { // from class: i81.b0$$g
            @Override // java.lang.Runnable
            public final void run() {
                i81.b0 b0Var = i81.b0.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f17 = b0Var.f();
                if (f17 != null) {
                    f17.a();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onSplashAdViewContainerHideImmediately");
                b0Var.j();
                b0Var.f371066j = true;
                if (b0Var.g() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
                    b0Var.g().M1();
                }
                b0Var.b();
                b0Var.a();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                b0Var.f371064h = java.lang.System.currentTimeMillis();
            }
        });
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 e(jz5.l lVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c6314x36a0adf7, int i17, long j17, java.lang.String str) {
        c6314x36a0adf7.f136689g = ((java.lang.Long) lVar.f384366d).longValue();
        c6314x36a0adf7.f136690h = ((java.lang.Long) lVar.f384367e).longValue();
        c6314x36a0adf7.f136692j = i17;
        c6314x36a0adf7.f136693k = j17;
        if (str == null) {
            str = "";
        }
        c6314x36a0adf7.f136695m = c6314x36a0adf7.b("AdWorkerCreateFailErrorMsg", str, true);
        return c6314x36a0adf7;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f371058b.f156344t;
        if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc) vcVar;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f371059c;
        if (c0Var != null) {
            return c0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f371058b;
        if (o6Var != null) {
            return o6Var.C0();
        }
        return null;
    }

    public void h(yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc f17 = f();
        if (f17 == null) {
            if (aVar != null) {
                aVar.mo152xb9724478();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke3");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc mo52986xf673f150 = f17.mo52986xf673f150();
        android.view.View mo52965xfb86a31b = mo52986xf673f150.mo52965xfb86a31b();
        if (mo52965xfb86a31b == null || mo52965xfb86a31b.getParent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke1");
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        mo52986xf673f150.n(new i81.c0(this, aVar));
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "reportSplashAd %s", this.f371058b.f156336n);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c17 = i81.a0.c(this.f371058b);
        cm.e0 e0Var = null;
        if (c17 != null) {
            c17.f136701s = this.f371057a.a() ? 1L : 0L;
            if (i(this.f371058b) && (c0Var = this.f371059c) != null && c0Var.c1() != null) {
                em1.c cVar = this.f371059c.c1().f173919f;
                if (cVar.f336550b == null) {
                    cVar = null;
                }
                if (cVar != null) {
                    em1.c cVar2 = this.f371059c.c1().f173919f;
                    if (cVar2.f336550b == null) {
                        cVar2 = null;
                    }
                    long j17 = cVar2.f336558j;
                    em1.c cVar3 = this.f371059c.c1().f173919f;
                    if (cVar3.f336550b == null) {
                        cVar3 = null;
                    }
                    long j18 = cVar3.f336557i;
                    if (j17 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -2");
                        c17.f136702t = -2L;
                    } else if (j18 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -3");
                        c17.f136702t = -3L;
                    } else if (j17 < j18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -4");
                        c17.f136702t = -4L;
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WorkerCreateEarlyTime: ");
                        long j19 = j17 - j18;
                        sb6.append(j19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", sb6.toString());
                        c17.f136702t = j19;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f371058b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(o6Var);
        if (a17 != null) {
            i81.e a18 = i81.a0.a(o6Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7105x626a21ab c7105x626a21ab = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7105x626a21ab();
            java.lang.String str = a17.f169667d;
            c7105x626a21ab.f144214d = c7105x626a21ab.b("InstanceId", str, true);
            c7105x626a21ab.f144215e = c7105x626a21ab.b("AppId", a17.f169668e, true);
            c7105x626a21ab.f144216f = a17.f169672i;
            int i17 = a17.f169669f;
            if (i17 == 1) {
                e0Var = cm.e0.release;
            } else if (i17 == 2) {
                e0Var = cm.e0.debug;
            } else if (i17 == 3) {
                e0Var = cm.e0.demo;
            }
            c7105x626a21ab.f144217g = e0Var;
            c7105x626a21ab.f144218h = a17.f169670g;
            c7105x626a21ab.f144220j = a17.f169671h;
            long j27 = a18.f371096g;
            c7105x626a21ab.f144221k = j27;
            long j28 = a18.f371099j;
            c7105x626a21ab.f144222l = j28;
            c7105x626a21ab.f144219i = j28 - j27;
            c7105x626a21ab.f144223m = o6Var.A2 != null ? r2.f371061e : 9;
            c7105x626a21ab.f144224n = j27;
            c7105x626a21ab.f144225o = j28;
            c7105x626a21ab.f144226p = j28 - j27;
            long j29 = a18.f371101l;
            c7105x626a21ab.f144227q = j29;
            long j37 = a18.f371102m;
            c7105x626a21ab.f144228r = j37;
            c7105x626a21ab.f144229s = j37 - j29;
            long j38 = a18.f371103n;
            c7105x626a21ab.f144230t = j38;
            long j39 = a18.f371104o;
            c7105x626a21ab.f144231u = j39;
            c7105x626a21ab.f144232v = j39 - j38;
            c7105x626a21ab.f144233w = i81.d.c();
            long j47 = a18.f371098i;
            long j48 = a18.f371097h;
            c7105x626a21ab.B = j47 - j48;
            c7105x626a21ab.f144234x = j48;
            c7105x626a21ab.f144235y = j48 - a18.f371096g;
            c7105x626a21ab.f144236z = j47;
            c7105x626a21ab.A = a18.f371099j - j47;
            c7105x626a21ab.C = o6Var.u0() != null ? o6Var.u0().f158834n2 : -1;
            c7105x626a21ab.D = 0L;
            c7105x626a21ab.E = a18.f371100k;
            long j49 = a18.f371105p;
            c7105x626a21ab.F = j49;
            long j57 = a18.f371106q;
            c7105x626a21ab.G = j57;
            long j58 = a18.f371107r;
            c7105x626a21ab.H = j58;
            long j59 = a18.f371108s;
            c7105x626a21ab.I = j59;
            c7105x626a21ab.f144213J = j59 - j49;
            c7105x626a21ab.K = j58 - j57;
            c7105x626a21ab.M = a18.f371094e;
            c7105x626a21ab.L = i81.d.c();
            c7105x626a21ab.N = 1L;
            c7105x626a21ab.O = o6Var.S2(false) != null ? o6Var.S2(false).i() : 0L;
            c7105x626a21ab.P = c7105x626a21ab.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
            c7105x626a21ab.Q = a18.f371109t;
            c7105x626a21ab.S = a18.f371095f;
            c7105x626a21ab.T = a18.f371115z;
            c7105x626a21ab.k();
            c7105x626a21ab.n();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c18 = i81.a0.c(o6Var);
            if (c18 != null) {
                c18.f136687e = c18.b("InstanceId", str, true);
                c18.f136694l = a18.f371099j - a18.f371096g;
                c18.f136696n = o6Var.A2 != null ? r2.f371061e : 9;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c cVar4 = o6Var.D2;
                c18.f136691i = a18.f371109t;
                c18.f136703u = a18.f371110u;
                if (cVar4 != null) {
                    c18.f136697o = cVar4.f158554g;
                    c18.f136698p = cVar4.f158555h;
                }
                c18.k();
            }
        }
        if (!i(this.f371058b) || c17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.h(1754L, 200L, c17.f136699q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.h(1755L, 500L, c17.f136700r);
    }

    public final void k(final int i17) {
        em1.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f371058b;
        i81.z zVar = i81.a0.f371049c;
        i81.a0 a17 = zVar.a(o6Var);
        if (!this.f371058b.v0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, can not show ad, reason: %d, appId:%s", java.lang.Integer.valueOf(this.f371058b.C2), this.f371058b.f156336n);
            this.f371061e = 0;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.d(this.f371058b.q2()));
        i81.e eVar = a17.f371052a;
        eVar.f371115z = i17;
        final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c6314x36a0adf7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6314x36a0adf7.f136688f = java.lang.System.currentTimeMillis();
        c6314x36a0adf7.f136686d = c6314x36a0adf7.b("Appid", this.f371058b.f156336n, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f371058b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        zVar.a(runtime).f371053b = c6314x36a0adf7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = i17 == 2 ? this.f371058b.C0() : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.d(this.f371058b.u0().k()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdIfNeed, displayMode:%s  appId:%s, may show ad, preloadedService:%s", java.lang.Integer.valueOf(i17), this.f371058b.f156336n, C0);
        this.f371059c = C0;
        if (C0 != null) {
            cVar = C0.c1().f173919f;
            if (cVar.f336550b == null) {
                cVar = null;
            }
            if (cVar != null) {
                eVar.f371109t = i17 == 2 ? 3 : 2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [preload] adWorker is ready");
            } else {
                eVar.f371109t = 4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [preload] adWorker is not ready");
            }
        } else {
            eVar.f371109t = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [not preload] waiting ad worker ready");
            cVar = null;
        }
        this.f371061e = 6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f(this.f371058b);
        if (cVar == null) {
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f371060d.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc() { // from class: i81.b0$$f
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc
                public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, jz5.l lVar, java.lang.String str) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c6314x36a0adf72 = c6314x36a0adf7;
                    i81.b0 b0Var = i81.b0.this;
                    b0Var.getClass();
                    long longValue = ((java.lang.Long) lVar.f384367e).longValue() - ((java.lang.Long) lVar.f384366d).longValue();
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = b0Var.f371058b;
                    i81.e a19 = i81.a0.a(o6Var2);
                    if (a19 != null) {
                        a19.f371095f = currentTimeMillis2;
                    }
                    boolean z19 = false;
                    if (c0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker obtain fail");
                        b0Var.m("obtainAdWorkerFail");
                        java.lang.Long l17 = -1L;
                        java.lang.Long l18 = -1L;
                        c6314x36a0adf72.f136689g = l17.longValue();
                        c6314x36a0adf72.f136690h = l18.longValue();
                        c6314x36a0adf72.f136692j = 0;
                        c6314x36a0adf72.f136693k = currentTimeMillis2;
                        if (str == null) {
                            str = "";
                        }
                        c6314x36a0adf72.f136695m = c6314x36a0adf72.b("AdWorkerCreateFailErrorMsg", str, true);
                        c6314x36a0adf72.k();
                        b0Var.f371061e = 22;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f(o6Var2);
                        b0Var.d();
                        return;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6314x36a0adf7 c17 = i81.a0.c(o6Var2);
                    if (c17 != null) {
                        c17.f136699q = longValue;
                    }
                    b0Var.e(lVar, c6314x36a0adf72, 0, currentTimeMillis2, "");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = b0Var.f371062f;
                    if (b4Var != null && b4Var.e()) {
                        z19 = true;
                    }
                    if (z19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker is ready but timeout");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f(o6Var2);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker is ready");
                    if (i81.b0.i(o6Var2)) {
                        b0Var.f371059c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) b0Var.f371060d.f158553f;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = b0Var.f371059c;
                    c0Var2.s1(o6Var2);
                    c0Var2.d2(true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.n();
                    nVar.f156452i = "launch";
                    nVar.f156453m = i17;
                    nVar.x(c0Var2, null, c0Var);
                    b0Var.f371061e = 8;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f(o6Var2);
                }
            });
            l(i17, eVar);
            this.f371061e = 7;
            i81.j.b(this.f371058b, a18, false);
            return;
        }
        this.f371060d.f(cVar);
        l(i17, eVar);
        this.f371061e = 8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f(this.f371058b);
        cl.q0 engine = cVar.f336550b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b(engine);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f371059c;
        c0Var.s1(this.f371058b);
        c0Var.d2(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.n();
        nVar.f156452i = "launch";
        nVar.f156453m = i17;
        nVar.x(c0Var, null, bVar);
        e(cVar.f336551c, c6314x36a0adf7, 1, 0L, null);
        i81.j.b(this.f371058b, a18, true);
    }

    public final void l(int i17, i81.e eVar) {
        int c17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f371063g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f371062f;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f371062f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("AppBrandSplashAdLogic.checkShowAdTimeoutTask#" + this.f371058b.f156336n, new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: i81.b0$$i
            @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
            /* renamed from: onTimerExpired */
            public final boolean mo322xdd48fb9f() {
                final i81.b0 b0Var = i81.b0.this;
                if (b0Var.f371065i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer, timer already stopped");
                    return false;
                }
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer timeOut, realTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b0Var.f371063g));
                if (b0Var.f371061e == 7) {
                    b0Var.f371061e = 21;
                } else {
                    b0Var.f371061e = 3;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: i81.b0$$j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i81.b0.this.d();
                    }
                });
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = b0Var.f371062f;
                if (b4Var2 == null) {
                    return false;
                }
                b4Var2.d();
                return false;
            }
        }, false);
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "RESUME SHOW");
            c17 = i81.d.d();
            if (c17 <= 0) {
                c17 = 1500;
            }
        } else if (eVar.f371109t != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "NOT PRELOAD SHOW");
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_appbrand_ad_not_preload_timeout_interval;
            this.f371058b.getClass();
            c17 = ((h62.d) e0Var).Ni(d0Var, i81.d.c());
            if (c17 <= 0) {
                this.f371058b.getClass();
                c17 = i81.d.c();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "PRELOAD SHOW");
            this.f371058b.getClass();
            c17 = i81.d.c();
        }
        eVar.f371094e = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer start, timeThreshold:%s", java.lang.Integer.valueOf(c17));
        this.f371065i = false;
        long j17 = c17;
        this.f371062f.c(j17, j17);
    }

    public final void m(java.lang.String str) {
        if (this.f371062f != null) {
            java.lang.String str2 = this.f371058b.f156336n;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "stopCheckShowAdTimeoutTick, appId:%s, reason:%s, realTime:%s", str2, str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f371063g));
            this.f371065i = true;
            this.f371062f.d();
            this.f371062f = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f371062f;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
