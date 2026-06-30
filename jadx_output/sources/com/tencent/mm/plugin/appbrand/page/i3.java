package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i3 extends android.widget.FrameLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f86700J = 0;
    public com.tencent.mm.plugin.appbrand.page.y4 A;
    public final java.util.List B;
    public final com.tencent.mm.plugin.appbrand.page.xa C;
    public boolean D;
    public com.tencent.mm.plugin.appbrand.page.x4 E;
    public com.tencent.mm.plugin.appbrand.page.b5 F;
    public com.tencent.mm.plugin.appbrand.page.a5 G;
    public boolean H;
    public com.tencent.mm.plugin.appbrand.page.w4 I;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f86701d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f86702e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f86703f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86704g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86705h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.r4 f86706i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.s4 f86707m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f86708n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f86709o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f86710p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f86711q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f86712r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f86713s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f86714t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f86715u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.jb f86716v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.w2 f86717w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ud f86718x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.pa f86719y;

    /* renamed from: z, reason: collision with root package name */
    public long f86720z;

    public i3(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(context);
        this.f86701d = false;
        this.f86704g = false;
        this.f86705h = false;
        this.f86708n = new java.util.HashMap();
        this.f86709o = new byte[0];
        this.f86710p = new java.util.LinkedList();
        this.f86711q = new java.util.LinkedList();
        this.f86712r = new java.util.LinkedList();
        this.f86713s = new java.util.LinkedList();
        this.f86719y = new com.tencent.mm.plugin.appbrand.page.pa();
        this.f86720z = 500L;
        this.B = new java.util.concurrent.CopyOnWriteArrayList();
        this.C = new com.tencent.mm.plugin.appbrand.page.xa();
        this.D = false;
        this.F = null;
        this.G = null;
        this.H = false;
        this.I = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "AppBrandPageContainerProfile| <init> appId[%s]", appBrandRuntime.f74803n);
        this.f86702e = appBrandRuntime;
        this.f86703f = appBrandRuntime.f74803n;
        this.f86718x = new com.tencent.mm.plugin.appbrand.page.td();
    }

    public static void f(com.tencent.mm.plugin.appbrand.page.i3 i3Var, int i17, java.lang.String str, org.json.JSONObject jSONObject, oi1.k kVar, java.lang.String str2) {
        i3Var.q();
        long a17 = i3Var.f86719y.a(com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK, str2);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(jSONObject == null ? -1 : jSONObject.length());
        objArr[3] = java.lang.Boolean.valueOf(kVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateBackImpl delta:%d, scene:%s, customArgs.length:%s, interceptorCallback:%b", objArr);
        com.tencent.mm.plugin.appbrand.page.n3 n3Var = new com.tencent.mm.plugin.appbrand.page.n3(i3Var, str, i17, a17);
        boolean m07 = i3Var.m0(str, n3Var);
        if (kVar != null) {
            nd1.o$$a o__a = (nd1.o$$a) kVar;
            nd1.p pVar = o__a.f336357a.f336356m;
            com.tencent.mm.plugin.appbrand.y yVar = o__a.f336358b;
            int i18 = o__a.f336359c;
            if (m07) {
                yVar.a(i18, pVar.o("fail:navigateBack intercepted"));
            } else {
                yVar.a(i18, pVar.o("ok"));
            }
        }
        if (m07) {
            return;
        }
        n3Var.run();
    }

    public void A() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = getCurrentPage();
        if (currentPage == null || currentPage.getCurrentPageView().u2()) {
            return;
        }
        synchronized (this.f86709o) {
            z17 = !this.f86711q.isEmpty();
        }
        if (z17 || currentPage.getTag(com.tencent.mm.R.id.f483175yo) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "onBackPressed, has navigating pages, skip");
        } else {
            c0(new com.tencent.mm.plugin.appbrand.page.q4(this, "scene_back_key_pressed"));
        }
    }

    public void B() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        synchronized (this.f86709o) {
            w2Var = (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.peekFirst();
        }
        if (w2Var == null || w2Var.I) {
            return;
        }
        w2Var.I = true;
        w2Var.E();
    }

    public void C() {
    }

    public void D() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        synchronized (this.f86709o) {
            w2Var = (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.peekFirst();
        }
        if (w2Var == null) {
            return;
        }
        if (w2Var.I) {
            w2Var.I = false;
            w2Var.f87192J = false;
            w2Var.G();
        }
        if (this.f86704g) {
            getAppId();
            w2Var.getCurrentPageView().X1();
            w2Var.getCurrentPageView().J2();
        }
    }

    public com.tencent.mm.plugin.appbrand.page.a5 E(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        java.util.Objects.requireNonNull(w2Var2);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = getAppId();
        objArr[1] = w2Var == null ? null : nf.z.a(w2Var.getCurrentUrl());
        objArr[2] = nf.z.a(w2Var2.getCurrentUrl());
        objArr[3] = java.lang.Boolean.valueOf(this.f86704g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "onNavigateBack, appId[%s] out[%s], in[%s], mActuallyVisible[%b]", objArr);
        if (this.f86704g) {
            w2Var2.getCurrentPageView().J2();
        }
        if (w2Var != null) {
            nf.o.a(w2Var.getContext());
            com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(w2Var.getContentView());
            if (d17 != null) {
                d17.c();
            }
        }
        mi1.v vVar = getRuntime().f74821z;
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var2.getCurrentPageView();
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK;
        vVar.g(currentPageView, wdVar);
        a0(w2Var2.getCurrentPageView());
        n(wdVar, w2Var, w2Var2);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.B).iterator();
        if (!it.hasNext()) {
            return this.G;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public void F(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = getAppId();
        objArr[1] = w2Var == null ? null : nf.z.a(w2Var.getCurrentUrl());
        objArr[2] = nf.z.a(w2Var2.getCurrentUrl());
        objArr[3] = java.lang.Boolean.valueOf(this.f86704g);
        objArr[4] = wdVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "onNavigateEnd, appId[%s] out[%s], in[%s], mActuallyVisible[%b], type[%s]", objArr);
        if (this.f86704g) {
            w2Var2.getCurrentPageView().J2();
        }
        if (com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH != wdVar) {
            getRuntime().f74821z.g(w2Var2.getCurrentPageView(), wdVar);
        }
        if (g0(w2Var2)) {
            w2Var2.getCurrentPageView().Y0();
        }
        a0(w2Var2.getCurrentPageView());
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.B).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public com.tencent.mm.plugin.appbrand.page.a5 G(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd wdVar, java.lang.String str, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = getAppId();
        objArr[1] = w2Var == null ? null : nf.z.a(w2Var.getCurrentUrl());
        objArr[2] = nf.z.a(str);
        objArr[3] = java.lang.Boolean.valueOf(this.f86704g);
        objArr[4] = wdVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "onNavigateStart, appId[%s] out[%s], in[%s], mActuallyVisible[%b], type[%s]", objArr);
        if (w2Var != null) {
            nf.o.a(w2Var.getContext());
            com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(w2Var.getContentView());
            if (d17 != null) {
                d17.c();
            }
        }
        n(wdVar, w2Var, w2Var2);
        if (com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH == wdVar) {
            getRuntime().f74821z.g(w2Var2.getCurrentPageView(), wdVar);
            a0(w2Var2.getCurrentPageView());
        }
        if (w2Var != null && w2Var.getCurrentPageView() != null && w2Var.getCurrentPageView().P1() != null) {
            w2Var.getCurrentPageView().P1().b(false);
        }
        if (w2Var != null && w2Var.getCurrentPageView() != null && w2Var.getCurrentPageView().C1() != null && w2Var.getCurrentPageView().C1().c()) {
            w2Var.getCurrentPageView().C1().g();
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.B).iterator();
        if (!it.hasNext()) {
            return this.G;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public void H(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
    }

    public final void I() {
        if (this.f86702e == null || this.D) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.x4 x4Var = this.E;
        if (x4Var != null) {
            com.tencent.mm.plugin.appbrand.d2 d2Var = ((com.tencent.mm.plugin.appbrand.d2$$a) x4Var).f77559a;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = d2Var.f77558d;
            java.lang.String str = appBrandRuntime.f74803n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|appId:%s, launch -> ready, cost %d", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - appBrandRuntime.f74822z1));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|appId:%s, initRuntimeImpl -> ready, cost %d", appBrandRuntime.f74803n, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - appBrandRuntime.A1));
            appBrandRuntime.I1(new com.tencent.mm.plugin.appbrand.h2(appBrandRuntime));
            com.tencent.mm.plugin.appbrand.AppBrandRuntime.M(d2Var.f77558d, null);
        }
        N();
        this.D = true;
    }

    public void J(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
    }

    public void K(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        android.view.View contentView;
        if (w2Var == w2Var2 || w2Var == null || (contentView = w2Var.getContentView()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "fixAccessibilityPageSwitchIssueOnEnd, " + w2Var.getCurrentUrl());
        contentView.setImportantForAccessibility(4);
    }

    public void L(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, float f17) {
    }

    public void M(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        android.view.View contentView;
        if (w2Var == w2Var2 || w2Var2 == null || (contentView = w2Var2.getContentView()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "fixAccessibilityPageSwitchIssueOnStart, " + w2Var2.getCurrentUrl());
        contentView.setImportantForAccessibility(1);
    }

    public void N() {
    }

    public final void O(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            getRuntime().m(new com.tencent.mm.plugin.appbrand.page.y3(this, str));
            return;
        }
        if (this.f86701d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "preloadNext, destroyed, appId:%s, reason:%s", getAppId(), str);
            return;
        }
        if (!this.f86704g) {
            this.f86705h = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNext, deferred, appId:%s, reason:%s", getAppId(), str);
            return;
        }
        this.f86705h = false;
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = this.f86706i;
        if (r4Var != null && r4Var.e(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNext, intercepted, appId:%s, reason:%s", getAppId(), str);
            return;
        }
        if (this.f86714t != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNext, already preloaded, appId:%s, reason:%s", getAppId(), str);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.page.r4 r4Var2 = this.f86706i;
        if (r4Var2 == null || (v5Var = r4Var2.a(this, "preload")) == null) {
            v5Var = null;
        }
        if (v5Var == null) {
            v5Var = new com.tencent.mm.plugin.appbrand.page.v5();
        }
        v5Var.X = getDecorWidgetFactory();
        v5Var.f2(getContext(), this.f86702e);
        v5Var.O0();
        addView(v5Var.getContentView(), 0);
        this.f86714t = v5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: appId:%s, cost:%d, reason:%s", getAppId(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), str);
    }

    public boolean P(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            getRuntime().m(new com.tencent.mm.plugin.appbrand.page.z3(this, z17));
            return true;
        }
        if (this.f86715u != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNextSkylineView, already preloaded, appId:%s", getAppId());
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = this.f86706i;
        if (r4Var == null || (v5Var = r4Var.a(this, "preload_skyline")) == null) {
            v5Var = null;
        }
        if (v5Var == null) {
            v5Var = new com.tencent.mm.plugin.appbrand.page.v5();
        }
        v5Var.X = getDecorWidgetFactory();
        v5Var.f2(getContext(), this.f86702e);
        v5Var.O0();
        addView(v5Var.getContentView(), 0);
        this.f86715u = v5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: appId:%s, cost:%d isCreateFlutterEngine:%b", getAppId(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(z17));
        return true;
    }

    public final void Q(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.z4 z4Var) {
        java.util.Objects.toString(z4Var);
        java.lang.Object obj = z4Var.f87311a;
        if (obj instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) obj;
            valueAnimator.addListener(new com.tencent.mm.plugin.appbrand.page.e4(this, wdVar, w2Var, w2Var2));
            valueAnimator.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.f4(this, wdVar, w2Var, w2Var2));
        } else {
            if (!(obj instanceof android.view.animation.Animation)) {
                l(wdVar, w2Var, w2Var2);
                return;
            }
            android.view.animation.Animation animation = (android.view.animation.Animation) obj;
            android.view.Choreographer.getInstance().postFrameCallback(new com.tencent.mm.plugin.appbrand.page.h4(this, android.os.SystemClock.elapsedRealtime(), animation.getDuration(), wdVar, w2Var, w2Var2, animation));
        }
    }

    public int R() {
        return 0;
    }

    public int S() {
        return 0;
    }

    public java.lang.Object T(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(w2Var, "translationX", -(w2Var.getWidth() * 0.25f), 0.0f);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public java.lang.Object U(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(w2Var, "translationX", 0.0f, w2Var.getWidth());
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public java.lang.Object V(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(w2Var, "translationX", w2Var.getWidth(), 0.0f);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    public java.lang.Object W(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(w2Var, "translationX", 0.0f, -(w2Var.getWidth() * 0.25f));
        ofFloat.setDuration(250L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(w2Var, "translationX", 0.0f);
        ofFloat2.setDuration(0L);
        new android.animation.AnimatorSet().playSequentially(ofFloat, ofFloat2);
        return ofFloat;
    }

    public int X(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return 0;
    }

    public void Y(oi1.n nVar, oi1.j jVar) {
        if (jVar == null || nVar == null) {
            return;
        }
        synchronized (this.f86708n) {
            ((java.util.HashMap) this.f86708n).put(nVar, jVar);
        }
    }

    public void Z(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        com.tencent.mm.plugin.appbrand.page.b5 b5Var = this.F;
        if (b5Var != null) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = ((com.tencent.mm.plugin.appbrand.pip.p) b5Var).f87544a;
            com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onPageDestroy, page: " + com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var));
            boolean z17 = w2Var.U;
            java.lang.String str = o0Var.f87518a;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "onPageDestroy, " + com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var) + " is PipVideoRelated");
            } else {
                com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
                com.tencent.mars.xlog.Log.i(str, "onPageDestroy, remove " + currentPageView + " from mPageView2PageScopedPipInfoMap");
                ((java.util.concurrent.ConcurrentHashMap) o0Var.f87525h).remove(java.lang.Integer.valueOf(currentPageView.hashCode()));
            }
            com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = o0Var.f87531n;
            if (w2Var2 != null && w2Var == w2Var2) {
                o0Var.f87532o = false;
                o0Var.f87521d.setPipVideoRelatedPage(w2Var2);
            }
        }
        w2Var.setVisibility(8);
        if (!w2Var.I) {
            w2Var.I = true;
            w2Var.E();
        }
        if (!w2Var.U) {
            w2Var.F();
        }
        removeView(w2Var);
        if (!w2Var.U) {
            w2Var.k();
            w2Var.G = null;
        }
        if (getRuntime() == null || getRuntime().r0() == null) {
            return;
        }
        android.app.Activity r07 = getRuntime().r0();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.widget.input.h1.f91462u;
        if (((com.tencent.mm.plugin.appbrand.widget.input.h1) r07.findViewById(com.tencent.mm.R.id.a0o)) != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.h1) getRuntime().r0().findViewById(com.tencent.mm.R.id.a0o)).requestLayout();
        }
    }

    public final void a0(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        if (getRuntime().D1 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.z zVar = getRuntime().D1;
        xi1.m C1 = v5Var.C1();
        zVar.f86764h = C1;
        C1.d(new com.tencent.mm.plugin.appbrand.page.z9(zVar));
        getRuntime().D1.v(new com.tencent.mm.plugin.appbrand.page.i4(this, v5Var));
    }

    public final boolean b0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.appbrand.page.w2 p17;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        int i18;
        if (i17 == 0) {
            p17 = getCurrentPage();
            if (p17 == null || (v5Var = getCurrentPage().getCurrentPageView()) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "rewriteRoute invalid page appId:%s, url:%s", getAppId(), str);
                return false;
            }
        } else {
            p17 = p(i17);
            if (p17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "rewriteRoute invalid page appId:%s, webviewId:%d, url:%s", getAppId(), java.lang.Integer.valueOf(i17), str);
                return false;
            }
            com.tencent.mm.plugin.appbrand.page.v5 u17 = p17.u(i17);
            if (u17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "rewriteRoute invalid page appId:%s, webviewId:%d, url:%s", getAppId(), java.lang.Integer.valueOf(i17), str);
                return false;
            }
            v5Var = u17;
        }
        boolean z17 = p17 instanceof com.tencent.mm.plugin.appbrand.page.y1;
        boolean a17 = getAppConfig().e().a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "rewriteRoute openType:%s currentIsMultiPage:%b targetIsMultiPage:%b", str2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        boolean z18 = "appLaunch".equals(str2) || "reLaunch".equals(str2) || "autoReLaunch".equals(str2);
        if (v5Var.p2() || v5Var.p3(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "skyline not support, rewriteRoute fail");
            return false;
        }
        if (z17) {
            if (a17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (!((com.tencent.mm.plugin.appbrand.page.y1) p17).x(str)) {
                    try {
                        jSONObject.put(com.tencent.mm.plugin.appbrand.page.b7.f86431c, i17);
                    } catch (org.json.JSONException unused) {
                    }
                }
                if (!v(com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB)) {
                    return false;
                }
                c0(new com.tencent.mm.plugin.appbrand.page.o4(this, str, jSONObject, str3));
                return true;
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "rewriteRoute not support, tab2single fail");
                return false;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(com.tencent.mm.plugin.appbrand.page.b7.f86431c, i17);
            } catch (org.json.JSONException unused2) {
            }
            c0(new com.tencent.mm.plugin.appbrand.page.m4(this, str, jSONObject2, str3));
            return true;
        }
        if (a17) {
            if (!z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "rewriteRoute not support, single2tab fail");
                return false;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put(com.tencent.mm.plugin.appbrand.page.b7.f86431c, i17);
            } catch (org.json.JSONException unused3) {
            }
            c0(new com.tencent.mm.plugin.appbrand.page.m4(this, str, jSONObject3, str3));
            return true;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long hash = java.util.Objects.hash(4, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        com.tencent.mm.plugin.appbrand.page.pa paVar = this.f86719y;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE;
        paVar.a(wdVar, str3);
        if (v5Var.p2() || v5Var.p3(str)) {
            throw new java.lang.UnsupportedOperationException();
        }
        v5Var.U2();
        synchronized (v5Var.C1) {
            v5Var.getComponentId();
            i18 = v5Var.D1[0];
        }
        int componentId = v5Var.getComponentId();
        v5Var.e("webviewIdChanged", java.lang.String.format(java.util.Locale.ENGLISH, "{webviewId: %d}", java.lang.Integer.valueOf(componentId)), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageView", "rewriteRoute --START-- appId:%s, url[%s]->[%s], componentId[%d]->[%d]", v5Var.getAppId(), v5Var.X1(), str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(componentId));
        v5Var.h3(false);
        v5Var.w1().M(hash, str);
        v5Var.w1().t(hash, "onAppRoute", wdVar, null, null, null);
        v5Var.w1().s(hash, wdVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageView", "rewriteRoute --END-- appId:%s, rewrittenURL:%s, rewrittenComponentId:%d", v5Var.getAppId(), str, java.lang.Integer.valueOf(v5Var.getComponentId()));
        return true;
    }

    public final void c0(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() != null && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f86702e;
        if (appBrandRuntime == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "runOnUiThread but mRuntime==NULL, appId:%s, stack:%s", getAppId(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else {
            appBrandRuntime.m(runnable);
        }
    }

    public final void d0(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        boolean z17;
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            getRuntime().m(new com.tencent.mm.plugin.appbrand.page.x3(this, v5Var));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.xa xaVar = this.C;
        xaVar.getClass();
        boolean z18 = true;
        if (v5Var != null && xaVar.indexOfKey(v5Var.getComponentId()) < 0) {
            xaVar.put(v5Var.getComponentId(), v5Var.getComponentId());
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17 || v5Var.w1() == null) {
            return;
        }
        synchronized (this.f86709o) {
            if (this.f86711q.contains(v5Var.w1())) {
                z18 = false;
            }
        }
        if (z18) {
            j(v5Var);
        }
    }

    public boolean e0(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f0(java.lang.String r5, com.tencent.mm.plugin.appbrand.page.wd r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.page.wd r0 = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB
            r1 = 1
            if (r6 != r0) goto L6
            return r1
        L6:
            com.tencent.mm.plugin.appbrand.page.wd r0 = com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH
            if (r6 == r0) goto L44
            com.tencent.mm.plugin.appbrand.page.wd r0 = com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH
            if (r6 != r0) goto Lf
            goto L44
        Lf:
            byte[] r0 = r4.f86709o
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.page.wd r2 = com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO     // Catch: java.lang.Throwable -> L41
            r3 = 0
            if (r6 == r2) goto L1e
            com.tencent.mm.plugin.appbrand.page.wd r2 = com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE     // Catch: java.lang.Throwable -> L41
            if (r6 != r2) goto L1c
            goto L1e
        L1c:
            r6 = r3
            goto L1f
        L1e:
            r6 = r1
        L1f:
            java.util.LinkedList r2 = r4.f86710p     // Catch: java.lang.Throwable -> L41
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L41
            int r2 = r2 + r1
            if (r6 == 0) goto L2a
            r6 = r1
            goto L2b
        L2a:
            r6 = r3
        L2b:
            int r2 = r2 - r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r4.f86702e
            k91.r r6 = r6.m0()
            k91.n r6 = r6.e()
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L40
            if (r2 != r1) goto L40
            return r1
        L40:
            return r3
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        L44:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r4.f86702e
            k91.r r6 = r6.m0()
            k91.n r6 = r6.e()
            boolean r5 = r6.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.i3.f0(java.lang.String, com.tencent.mm.plugin.appbrand.page.wd):boolean");
    }

    public final void g(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        w2Var.clearAnimation();
        java.lang.Object tag = w2Var.getTag(com.tencent.mm.R.id.f483175yo);
        if (tag instanceof android.animation.Animator) {
            android.animation.Animator animator = (android.animation.Animator) tag;
            animator.cancel();
            animator.removeAllListeners();
            w2Var.setIsAnimating(false);
            return;
        }
        if (tag instanceof android.view.animation.Animation) {
            android.view.animation.Animation animation = (android.view.animation.Animation) tag;
            animation.setAnimationListener(null);
            animation.cancel();
            w2Var.setIsAnimating(false);
        }
    }

    public boolean g0(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
        if (currentPageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "shouldShowActionBarHomeButton, appId:%s, page:%s, get NULL PageView", getAppId(), w2Var.getCurrentUrl());
            return false;
        }
        java.lang.String currentUrl = w2Var.getCurrentUrl();
        if (getRuntime() == null || getRuntime().m0() == null) {
            return false;
        }
        boolean z17 = !currentUrl.startsWith(getRuntime().m0().b());
        boolean[] zArr = new boolean[3];
        zArr[0] = (getPageCount() == 1 && z17) || (currentPageView.M1() != null && currentPageView.M1().f305728q && getPageCount() != 1 && z17);
        zArr[1] = (currentPageView.r1() == null || currentPageView.r1().f5746w) ? false : true;
        zArr[2] = !(w2Var instanceof com.tencent.mm.plugin.appbrand.page.y1);
        for (int i17 = 0; i17 < 3; i17++) {
            if (!zArr[i17]) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "[%s,%s]->shouldShowActionBarHomeButton: test fail cause #[%d] condition,", w2Var.getAppId(), w2Var.getCurrentUrl(), java.lang.Integer.valueOf(i17));
                return false;
            }
        }
        return true;
    }

    public final int getActualPageStackSize() {
        int size;
        synchronized (this.f86709o) {
            size = this.f86710p.size();
        }
        return size;
    }

    public final k91.r getAppConfig() {
        return this.f86702e.m0();
    }

    public java.lang.String getAppId() {
        return this.f86703f;
    }

    public com.tencent.mm.plugin.appbrand.page.w2 getCurrentPage() {
        synchronized (this.f86709o) {
            try {
                if (this.f86711q.isEmpty()) {
                    com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.peekFirst();
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f86702e;
                    if (appBrandRuntime != null) {
                        boolean z17 = (appBrandRuntime.Q1() && !this.f86702e.J0()) || this.f86702e.U0();
                        if (w2Var == null && !z17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s", getAppId(), java.lang.Integer.valueOf(this.f86711q.size()), java.lang.Integer.valueOf(this.f86710p.size()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
                        }
                    }
                    return w2Var;
                }
                com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = (com.tencent.mm.plugin.appbrand.page.w2) this.f86711q.getFirst();
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f86702e;
                if (appBrandRuntime2 != null) {
                    boolean z18 = (appBrandRuntime2.Q1() && !this.f86702e.J0()) || this.f86702e.U0();
                    if (w2Var2 == null && !z18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s", getAppId(), java.lang.Integer.valueOf(this.f86711q.size()), java.lang.Integer.valueOf(this.f86710p.size()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    }
                }
                return w2Var2;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f86702e;
                if (appBrandRuntime3 != null) {
                    if (!((appBrandRuntime3.Q1() && !this.f86702e.J0()) || this.f86702e.U0())) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "getCurrentPage returns NULL, appId[%s] mStagingStack.size[%d] mPageStack.size[%d] stack:%s", getAppId(), java.lang.Integer.valueOf(this.f86711q.size()), java.lang.Integer.valueOf(this.f86710p.size()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    }
                }
                throw th6;
            }
        }
    }

    public java.lang.String getCurrentUrl() {
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getCurrentUrl();
        }
        return null;
    }

    public com.tencent.mm.plugin.appbrand.page.ud getDecorWidgetFactory() {
        return this.f86718x;
    }

    public java.util.List<oi1.j> getNavigateBackInterceptorChain() {
        synchronized (this.f86708n) {
            if (((java.util.HashMap) this.f86708n).size() != 0 && getCurrentPage() != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.HashMap) this.f86708n).values());
                java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.appbrand.page.t3(this));
                return arrayList;
            }
            return null;
        }
    }

    public final int getPageCount() {
        return s(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0.f74797f.size() == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        /*
            r3 = this;
            boolean r0 = r3.f86701d
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r3.f86702e
            boolean r2 = r0.I1
            if (r2 == 0) goto L16
            java.util.LinkedList r0 = r0.f74797f
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            com.tencent.mm.plugin.appbrand.page.w2 r0 = r3.getCurrentPage()
            if (r0 != 0) goto L36
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getPageView() assert by NULL page, appId="
            r0.<init>(r2)
            java.lang.String r2 = r3.getAppId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            iz5.a.h(r0)
            throw r1
        L36:
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r0.getCurrentPageView()
            if (r0 != 0) goto L55
            if (r2 != 0) goto L3f
            goto L55
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getPageView() assert by NULL pv, appId="
            r0.<init>(r2)
            java.lang.String r2 = r3.getAppId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            iz5.a.h(r0)
            throw r1
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.i3.getPageView():com.tencent.mm.plugin.appbrand.page.v5");
    }

    public final java.util.List<com.tencent.mm.plugin.appbrand.page.v5> getPreloadedPageView() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86714t;
        if (v5Var != null) {
            linkedList.add(v5Var);
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = this.f86715u;
        if (v5Var2 != null) {
            linkedList.add(v5Var2);
        }
        return linkedList;
    }

    public final int getRenderPagesCount() {
        int size;
        synchronized (this.f86709o) {
            size = this.f86710p.size() + 0 + this.f86711q.size();
        }
        return size;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f86702e;
    }

    public com.tencent.mm.plugin.appbrand.page.jb getSkylineRouter() {
        return this.f86716v;
    }

    public int getTabWindowId() {
        com.tencent.mm.plugin.appbrand.page.y1 y1Var;
        synchronized (this.f86709o) {
            java.util.Iterator it = this.f86710p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    y1Var = null;
                    break;
                }
                com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
                if (w2Var instanceof com.tencent.mm.plugin.appbrand.page.y1) {
                    y1Var = (com.tencent.mm.plugin.appbrand.page.y1) w2Var;
                    break;
                }
            }
        }
        if (y1Var != null) {
            return y1Var.getCurrentWindowId();
        }
        return -1;
    }

    public void h() {
        if (this.f86701d) {
            return;
        }
        this.f86701d = true;
        C();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        synchronized (this.f86709o) {
            linkedList.addAll(this.f86710p);
            linkedList.addAll(this.f86711q);
            this.f86710p.clear();
            this.f86711q.clear();
            linkedList2.addAll(this.f86712r);
            linkedList2.addAll(this.f86713s);
            this.f86712r.clear();
            this.f86713s.clear();
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
            if (!w2Var.I) {
                w2Var.I = true;
                w2Var.E();
            }
            w2Var.F();
            w2Var.k();
            w2Var.G = null;
            g(w2Var);
        }
        linkedList.clear();
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            removeCallbacks((com.tencent.mm.plugin.appbrand.page.t4) it6.next());
        }
        linkedList2.clear();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86714t;
        if (v5Var != null) {
            try {
                v5Var.A2();
            } catch (java.lang.Exception unused) {
            }
            try {
                this.f86714t.h();
            } catch (java.lang.Exception unused2) {
            }
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = this.f86715u;
        if (v5Var2 != null) {
            try {
                v5Var2.A2();
            } catch (java.lang.Exception unused3) {
            }
            try {
                this.f86715u.h();
            } catch (java.lang.Exception unused4) {
            }
        }
        removeAllViews();
        this.E = null;
        this.f86702e = null;
        this.F = null;
        com.tencent.mm.plugin.appbrand.page.pa paVar = this.f86719y;
        paVar.f87012a.clear();
        paVar.f87013b.clear();
        paVar.f87014c.clear();
    }

    public java.util.Iterator h0(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f86709o) {
            if (z17) {
                linkedList.addAll(this.f86711q);
            }
            linkedList.addAll(this.f86710p);
        }
        return new com.tencent.mm.plugin.appbrand.page.g4(this, linkedList);
    }

    public final void i(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.w2> linkedList = new java.util.LinkedList();
        synchronized (this.f86709o) {
            java.util.Iterator it = this.f86710p.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.page.w2 w2Var3 = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
                if (w2Var3 == w2Var) {
                    z17 = true;
                } else {
                    if (w2Var3 == w2Var2) {
                        break;
                    }
                    if (z17) {
                        linkedList.add(w2Var3);
                        it.remove();
                        this.f86711q.remove(w2Var3);
                    }
                }
            }
        }
        for (com.tencent.mm.plugin.appbrand.page.w2 w2Var4 : linkedList) {
            if (w2Var2 != null && w2Var4.B() && w2Var2.B() && w2Var4.getWindowId() == w2Var2.getWindowId() && (currentPageView = w2Var2.getCurrentPageView()) != null) {
                currentPageView.W2();
            }
            g(w2Var4);
            Z(w2Var4);
        }
    }

    public final java.lang.Object i0(com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.Object obj, java.lang.Runnable runnable) {
        if (obj instanceof android.animation.Animator) {
            android.animation.Animator animator = (android.animation.Animator) obj;
            g(w2Var);
            w2Var.setTag(com.tencent.mm.R.id.f483175yo, animator);
            animator.addListener(new com.tencent.mm.plugin.appbrand.page.b4(this, w2Var, runnable));
            animator.start();
            w2Var.setIsAnimating(true);
        } else if (obj instanceof android.view.animation.Animation) {
            android.view.animation.Animation animation = (android.view.animation.Animation) obj;
            animation.setAnimationListener(new com.tencent.mm.plugin.appbrand.page.d4(this, runnable, w2Var));
            g(w2Var);
            w2Var.setTag(com.tencent.mm.R.id.f483175yo, animation);
            w2Var.startAnimation(animation);
            w2Var.setIsAnimating(true);
        } else if (obj instanceof li1.a) {
            li1.a aVar = (li1.a) obj;
            if (aVar.f318754a) {
                if (runnable != null) {
                    runnable.run();
                }
            } else if (runnable != null) {
                java.util.ArrayList arrayList = aVar.f318755b;
                if (!arrayList.contains(runnable)) {
                    arrayList.add(runnable);
                }
            }
        } else {
            if (obj != null) {
                throw new java.lang.IllegalArgumentException("Page animation should be Animator or Animation");
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        return obj;
    }

    public void j(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        int indexOfKey;
        com.tencent.mm.plugin.appbrand.page.xa xaVar = this.C;
        xaVar.getClass();
        boolean z17 = false;
        if (v5Var != null && (indexOfKey = xaVar.indexOfKey(v5Var.getComponentId())) >= 0) {
            xaVar.removeAt(indexOfKey);
            z17 = true;
        }
        if (!z17 || (runtime = getRuntime()) == null) {
            return;
        }
        runtime.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$h
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.page.i3.this.O(nd1.n.NAME);
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(final long j17, final com.tencent.mm.plugin.appbrand.page.w2 w2Var, final com.tencent.mm.plugin.appbrand.page.w2 w2Var2, final com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.a5 a5Var, li1.a aVar) {
        java.lang.Object obj;
        li1.a aVar2 = aVar;
        synchronized (this.f86709o) {
            this.f86710p.remove(w2Var2);
            this.f86711q.remove(w2Var2);
        }
        boolean z17 = aVar2 != null ? true : !w2Var2.R;
        g(w2Var2);
        if (z17) {
            com.tencent.mm.plugin.appbrand.page.t4 n07 = n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.i3.this.Z(w2Var2);
                }
            });
            if (aVar2 != null) {
                i0(w2Var2, aVar2, n07);
                obj = aVar2;
            } else {
                java.lang.Object U = U(w2Var2);
                i0(w2Var2, U, n07);
                obj = U;
            }
        } else {
            Z(w2Var2);
            obj = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "switchPageClear, in: %s out: %s", w2Var.getCurrentUrl(), w2Var2.getCurrentUrl());
        java.lang.Object obj2 = obj;
        w2Var.t(j17, "onAppRoute", wdVar, a5Var, null, null);
        if (aVar2 != null && !aVar2.f318754a) {
            w2Var.getCurrentPageView().l3();
        }
        if (w2Var.I) {
            w2Var.I = false;
            w2Var.f87192J = false;
            w2Var.G();
        }
        g(w2Var);
        if (z17) {
            com.tencent.mm.plugin.appbrand.page.t4 n08 = n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.w2.this.s(j17, wdVar);
                }
            });
            if (aVar2 != null) {
                i0(w2Var, aVar2, n08);
            } else {
                java.lang.Object T = T(w2Var);
                i0(w2Var, T, n08);
                aVar2 = T;
            }
        } else {
            w2Var.s(j17, wdVar);
            aVar2 = null;
        }
        Q(wdVar, w2Var2, w2Var, new com.tencent.mm.plugin.appbrand.page.z4(aVar2, obj2));
    }

    public void k(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.pip.i iVar;
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        n(wdVar, w2Var, w2Var2);
        J(wdVar, w2Var, w2Var2);
        com.tencent.mm.plugin.appbrand.page.w4 w4Var = this.I;
        if (w4Var != null) {
            com.tencent.mm.plugin.appbrand.pip.r rVar = (com.tencent.mm.plugin.appbrand.pip.r) w4Var;
            rVar.getClass();
            java.lang.String k17 = com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var);
            java.lang.String k18 = com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var2);
            com.tencent.mars.xlog.Log.i(rVar.f87549b.f87518a, "onPageSwitchCancel, type: %s, oldPage: %s, newPage: %s", wdVar, k17, k18);
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = rVar.f87549b;
            boolean z18 = o0Var.f87538u;
            if (z18 && o0Var.f87531n != null && o0Var.f87523f != null) {
                o0Var.f87537t = null;
                com.tencent.mars.xlog.Log.i(rVar.f87549b.f87518a, "onPageSwitchCancel, mPipVideoTargetPageViewId about null");
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = rVar.f87549b;
                if (w2Var == o0Var2.f87531n && o0Var2.m(true)) {
                    com.tencent.mm.plugin.appbrand.pip.o0 o0Var3 = rVar.f87549b;
                    com.tencent.mm.plugin.appbrand.pip.k kVar = o0Var3.C;
                    if (kVar != null && (cVar = o0Var3.f87533p) != null) {
                        ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).b(cVar.f87437i, com.tencent.mm.plugin.appbrand.pip.n.OTHERS);
                    }
                    rVar.f87549b.a("onPageSwitchCancel");
                    rVar.f87549b.e(false, false);
                    z17 = true;
                } else {
                    z17 = false;
                }
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var4 = rVar.f87549b;
                if (o0Var4.f87539v && (iVar = o0Var4.f87528k) != null) {
                    iVar.c();
                }
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var5 = rVar.f87549b;
                o0Var5.f87538u = false;
                o0Var5.f87539v = false;
                o0Var5.f87523f.f(!z17);
            } else if (z18) {
                com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onPageSwitchCancel, isTransfering but mPipVideoRelatedPage or mPipContainerView is null");
            } else if (w2Var == null) {
                com.tencent.mars.xlog.Log.w(o0Var.f87518a, "onPageSwitchCancel, oldPage is null");
            } else {
                o0Var.f87537t = java.lang.Integer.valueOf(w2Var.getCurrentPageView().hashCode());
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var6 = rVar.f87549b;
                com.tencent.mars.xlog.Log.i(o0Var6.f87518a, "onPageSwitchCancel, mPipVideoTargetPageViewId: %d(%s)", o0Var6.f87537t, k18);
            }
        }
        this.H = false;
    }

    public java.lang.Object k0(com.tencent.mm.plugin.appbrand.page.w2 w2Var, boolean z17, boolean z18, java.lang.Object obj) {
        if (w2Var == null) {
            return null;
        }
        if (z18) {
            synchronized (this.f86709o) {
                this.f86710p.remove(w2Var);
                this.f86711q.remove(w2Var);
            }
        }
        if (!w2Var.I) {
            w2Var.I = true;
            w2Var.E();
        }
        com.tencent.mm.plugin.appbrand.page.v3 v3Var = new com.tencent.mm.plugin.appbrand.page.v3(this, z18, w2Var);
        if (!z17) {
            g(w2Var);
            v3Var.run();
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.t4 n07 = n0(v3Var);
        if (obj != null) {
            i0(w2Var, obj, n07);
            return obj;
        }
        java.lang.Object W = W(w2Var);
        i0(w2Var, W, n07);
        return W;
    }

    public final void l(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mm.plugin.appbrand.pip.i iVar;
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        n(wdVar, w2Var, w2Var2);
        K(wdVar, w2Var, w2Var2);
        com.tencent.mm.plugin.appbrand.page.w4 w4Var = this.I;
        if (w4Var != null) {
            com.tencent.mm.plugin.appbrand.pip.r rVar = (com.tencent.mm.plugin.appbrand.pip.r) w4Var;
            com.tencent.mars.xlog.Log.i(rVar.f87549b.f87518a, "onPageSwitchEnd, pageOpenType: %s, oldPage: %s, page: %s", wdVar, com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var), com.tencent.mm.plugin.appbrand.pip.o0.k(w2Var2));
            if (w2Var != null && (currentPageView = w2Var.getCurrentPageView()) != null) {
                com.tencent.mm.plugin.appbrand.pip.d dVar = (com.tencent.mm.plugin.appbrand.pip.d) ((java.util.concurrent.ConcurrentHashMap) rVar.f87549b.f87525h).get(java.lang.Integer.valueOf(currentPageView.hashCode()));
                if (dVar != null && com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK == wdVar && w2Var != rVar.f87549b.f87531n) {
                    com.tencent.mars.xlog.Log.i(dVar.f87439a, "markCurPageDestroy");
                    synchronized (dVar.f87443e) {
                        dVar.f87444f.clear();
                        dVar.f87445g.clear();
                        dVar.f87446h.clear();
                    }
                    ((java.util.concurrent.ConcurrentHashMap) dVar.f87447i).clear();
                }
            }
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = rVar.f87549b;
            if (o0Var.f87538u && o0Var.f87539v) {
                com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onPageSwitchEnd, tryTransferFrom, isBack: " + rVar.f87548a);
                if (rVar.f87549b.m(true)) {
                    com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = rVar.f87549b;
                    if (o0Var2.C != null && o0Var2.f87533p != null) {
                        com.tencent.mm.plugin.appbrand.pip.n nVar = com.tencent.mm.plugin.appbrand.pip.n.OTHERS;
                        if (o0Var2.f87535r) {
                            nVar = com.tencent.mm.plugin.appbrand.pip.n.PIP_CLICKED;
                        } else if (!rVar.f87548a) {
                            nVar = com.tencent.mm.plugin.appbrand.pip.n.PAGE_RE_LAUNCH;
                        }
                        com.tencent.mm.plugin.appbrand.pip.o0 o0Var3 = rVar.f87549b;
                        ((com.tencent.mm.plugin.appbrand.pip.p0) o0Var3.C).b(o0Var3.f87533p.f87437i, nVar);
                    }
                    rVar.f87549b.a("onPageSwitchEnd 0");
                    if (!rVar.f87548a) {
                        com.tencent.mars.xlog.Log.i(rVar.f87549b.f87518a, "onPageSwitchEnd, clearPipVideoRelated");
                    }
                    com.tencent.mm.plugin.appbrand.pip.o0 o0Var4 = rVar.f87549b;
                    boolean z17 = !rVar.f87548a;
                    o0Var4.e(z17, z17);
                }
                rVar.f87549b.f87535r = false;
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var5 = rVar.f87549b;
                o0Var5.f87539v = false;
                o0Var5.f87538u = false;
            }
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var6 = rVar.f87549b;
            if (o0Var6.f87538u && o0Var6.f87530m != null && (iVar = o0Var6.f87528k) != null) {
                iVar.c();
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var7 = rVar.f87549b;
                o0Var7.f87538u = false;
                com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = o0Var7.f87523f;
                if (appBrandPipContainerView != null) {
                    appBrandPipContainerView.f(true);
                }
                rVar.f87549b.f87543z.requestFocus();
            }
            if (com.tencent.mm.plugin.appbrand.pip.o0.b(rVar.f87549b)) {
                com.tencent.mm.plugin.appbrand.pip.o0 o0Var8 = rVar.f87549b;
                if (o0Var8.f87530m != null && o0Var8.f87523f != null) {
                    com.tencent.mars.xlog.Log.i(o0Var8.f87518a, "onPageSwitchEnd, transferFrom for other video is playing");
                    rVar.f87549b.f87523f.post(new com.tencent.mm.plugin.appbrand.pip.q(rVar));
                }
            }
        }
        this.H = false;
    }

    public void m(com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, float f17) {
        com.tencent.mm.plugin.appbrand.pip.i iVar;
        n(wdVar, w2Var, w2Var2);
        L(wdVar, w2Var, w2Var2, f17);
        com.tencent.mm.plugin.appbrand.page.w4 w4Var = this.I;
        if (w4Var != null) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = ((com.tencent.mm.plugin.appbrand.pip.r) w4Var).f87549b;
            if (!o0Var.f87538u || o0Var.f87530m == null || (iVar = o0Var.f87528k) == null) {
                return;
            }
            if (o0Var.f87539v) {
                iVar.e(100.0f - f17);
            } else {
                iVar.e(f17);
            }
        }
    }

    public boolean m0(java.lang.String str, java.lang.Runnable runnable) {
        java.util.List<oi1.j> navigateBackInterceptorChain = getNavigateBackInterceptorChain();
        boolean z17 = false;
        if (navigateBackInterceptorChain == null) {
            return false;
        }
        java.util.Iterator<oi1.j> it = navigateBackInterceptorChain.iterator();
        while (it.hasNext() && !(z17 = it.next().b(getRuntime(), str, runnable))) {
        }
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023f  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.tencent.mm.plugin.appbrand.page.wd r20, com.tencent.mm.plugin.appbrand.page.w2 r21, com.tencent.mm.plugin.appbrand.page.w2 r22) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.i3.n(com.tencent.mm.plugin.appbrand.page.wd, com.tencent.mm.plugin.appbrand.page.w2, com.tencent.mm.plugin.appbrand.page.w2):void");
    }

    public final com.tencent.mm.plugin.appbrand.page.t4 n0(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.page.j4 j4Var = new com.tencent.mm.plugin.appbrand.page.j4(this, runnable);
        synchronized (this.f86709o) {
            this.f86712r.push(j4Var);
        }
        return j4Var;
    }

    public final com.tencent.mm.plugin.appbrand.page.v5 o(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2;
        boolean z17;
        com.tencent.mm.plugin.appbrand.page.v5 a17;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
        boolean z18 = (runtime == null || runtime.J0()) ? false : true;
        com.tencent.mm.plugin.appbrand.page.b7 b7Var = com.tencent.mm.plugin.appbrand.page.b7.f86429a;
        synchronized (com.tencent.mm.plugin.appbrand.page.b7.class) {
            java.util.List list = com.tencent.mm.plugin.appbrand.page.b7.f86430b;
            v5Var = null;
            if (((java.util.ArrayList) list).size() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewCachePool", "get fail, pageViewCache is empty");
                v5Var2 = null;
            } else {
                java.lang.Object remove = ((java.util.ArrayList) list).remove(0);
                com.tencent.mm.plugin.appbrand.page.v5 v5Var3 = (com.tencent.mm.plugin.appbrand.page.v5) remove;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewCachePool", "get success, appBrandPageView:" + v5Var3);
                android.view.View contentView = v5Var3.getContentView();
                android.view.ViewParent parent = contentView != null ? contentView.getParent() : null;
                if (parent != null && (parent instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) parent).removeView(v5Var3.getContentView());
                }
                v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) remove;
            }
        }
        if (v5Var2 != null) {
            if (z18) {
                v5Var2.s2();
            }
            v5Var2.V0();
            v5Var2.U2();
            v5Var2.e("webviewIdChanged", java.lang.String.format(java.util.Locale.ENGLISH, "{webviewId: %d}", java.lang.Integer.valueOf(v5Var2.getComponentId())), 0);
            return v5Var2;
        }
        if (runtime != null && runtime.A0(str) == -1) {
            com.tencent.mm.plugin.appbrand.page.r4 r4Var = this.f86706i;
            if (r4Var != null ? r4Var.c(this.f86715u, str) : this.f86715u != null) {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var4 = this.f86715u;
                this.f86715u = null;
                if (z18) {
                    v5Var4.s2();
                }
                v5Var4.V0();
                removeView(v5Var4.getContentView());
                return v5Var4;
            }
        }
        com.tencent.mm.plugin.appbrand.page.r4 r4Var2 = this.f86706i;
        if (r4Var2 != null) {
            z17 = r4Var2.c(this.f86714t, str);
        } else {
            z17 = this.f86714t != null;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var5 = this.f86714t;
            this.f86714t = null;
            if (z18) {
                v5Var5.s2();
            }
            v5Var5.V0();
            removeView(v5Var5.getContentView());
            return v5Var5;
        }
        com.tencent.mm.plugin.appbrand.page.r4 r4Var3 = this.f86706i;
        if (r4Var3 != null && (a17 = r4Var3.a(this, str)) != null) {
            v5Var = a17;
        }
        if (v5Var == null) {
            v5Var = new com.tencent.mm.plugin.appbrand.page.v5();
        }
        if (z18) {
            v5Var.s2();
        }
        v5Var.X = getDecorWidgetFactory();
        v5Var.f2(getContext(), this.f86702e);
        return v5Var;
    }

    public com.tencent.mm.plugin.appbrand.page.w2 p(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f86709o) {
            linkedList.addAll(this.f86711q);
            linkedList.addAll(this.f86710p);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
                if (w2Var != null && w2Var.u(i17) != null) {
                    return w2Var;
                }
            }
            return null;
        }
    }

    public final void q() {
        java.util.LinkedList linkedList;
        synchronized (this.f86709o) {
            linkedList = new java.util.LinkedList(this.f86712r);
            this.f86712r.clear();
        }
        java.util.Iterator descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.t4 t4Var = (com.tencent.mm.plugin.appbrand.page.t4) descendingIterator.next();
            t4Var.Z5(true);
            t4Var.run();
            descendingIterator.remove();
        }
    }

    public com.tencent.mm.plugin.appbrand.page.w2 r(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        synchronized (this.f86709o) {
            if (this.f86711q.contains(w2Var)) {
                return (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.peekFirst();
            }
            int indexOf = this.f86710p.indexOf(w2Var);
            if (indexOf >= this.f86710p.size() - 1) {
                return null;
            }
            return (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.get(indexOf + 1);
        }
    }

    public final int s(boolean z17) {
        int i17;
        synchronized (this.f86709o) {
            java.util.Iterator it = this.f86710p.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (!((com.tencent.mm.plugin.appbrand.page.w2) it.next()).B() || z17) {
                    i17++;
                }
            }
            java.util.Iterator it6 = this.f86711q.iterator();
            while (it6.hasNext()) {
                if (!((com.tencent.mm.plugin.appbrand.page.w2) it6.next()).B() || z17) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public void setActuallyVisible(boolean z17) {
        boolean z18 = this.f86704g != z17;
        this.f86704g = z17;
        if (z17 && z18) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = getCurrentPage();
            if (currentPage != null) {
                currentPage.getCurrentPageView().J2();
            }
            super.setVisibility(0);
            if (this.f86705h) {
                O("setActuallyVisible");
            }
        }
        if (z17 || !z18) {
            return;
        }
        super.setVisibility(4);
    }

    public void setDecorWidgetFactory(com.tencent.mm.plugin.appbrand.page.ud udVar) {
        if (udVar == null) {
            throw new java.lang.NullPointerException("Should not be null");
        }
        this.f86718x = udVar;
    }

    public final void setDelegate(com.tencent.mm.plugin.appbrand.page.r4 r4Var) {
        if (this.f86706i != null) {
            throw new java.lang.IllegalAccessError("Duplicated call!!!");
        }
        com.tencent.mm.plugin.appbrand.page.s4 s4Var = this.f86707m;
        if (s4Var != null) {
            com.tencent.mm.plugin.appbrand.pip.b0 b0Var = (com.tencent.mm.plugin.appbrand.pip.b0) s4Var;
            if (r4Var == null) {
                r4Var = new com.tencent.mm.plugin.appbrand.pip.z(b0Var);
            }
            r4Var = new com.tencent.mm.plugin.appbrand.pip.a0(b0Var, r4Var);
        }
        this.f86706i = r4Var;
    }

    public void setDelegateWrapperFactory(com.tencent.mm.plugin.appbrand.page.s4 s4Var) {
        this.f86707m = s4Var;
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = this.f86706i;
        if (r4Var != null) {
            com.tencent.mm.plugin.appbrand.pip.b0 b0Var = (com.tencent.mm.plugin.appbrand.pip.b0) s4Var;
            b0Var.getClass();
            this.f86706i = new com.tencent.mm.plugin.appbrand.pip.a0(b0Var, r4Var);
        }
    }

    public void setOnPageSwitchListener(com.tencent.mm.plugin.appbrand.page.w4 w4Var) {
        java.util.Objects.toString(w4Var);
        this.I = w4Var;
    }

    public void setOnReadyListener(com.tencent.mm.plugin.appbrand.page.x4 x4Var) {
        this.E = x4Var;
    }

    public void setPageDidPushInCallback(com.tencent.mm.plugin.appbrand.page.y4 y4Var) {
        this.A = y4Var;
    }

    public void setPageNavigationPushTimeout(long j17) {
        this.f86720z = java.lang.Math.max(0L, j17);
    }

    public void setPipPageLifeCycleListener(com.tencent.mm.plugin.appbrand.page.b5 b5Var) {
        this.F = b5Var;
    }

    public void setPipVideoRelatedPage(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        if (w2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "setPipVideoRelatedPage, page(%s)", w2Var.getCurrentUrl());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "setPipVideoRelatedPage, page is null");
        }
        this.f86717w = w2Var;
    }

    public void setSkylineRouter(com.tencent.mm.plugin.appbrand.page.jb jbVar) {
        this.f86716v = jbVar;
    }

    public boolean t() {
        return false;
    }

    public void u(java.lang.String str) {
        iz5.a.f(android.os.Looper.getMainLooper(), android.os.Looper.myLooper());
        z(str, com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH, null, null);
    }

    public boolean v(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        if (getRuntime().f74797f.size() >= 2) {
            return (wdVar == com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB) ? false : true;
        }
        return true;
    }

    public boolean w() {
        return false;
    }

    public void x(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateBackFromOtherPageContainer to %s", w2Var2.getCurrentUrl());
        E(w2Var, w2Var2);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long hash = java.util.Objects.hash(2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("backToPreviousNavStack", 1);
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK;
        w2Var2.t(hash, "onAppRoute", wdVar, null, null, hashMap);
        w2Var2.s(hash, wdVar);
        if (w2Var2.B()) {
            ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) this.f86716v).g(hash, w2Var2.getCurrentWindowId(), w2Var2.getCurrentComponentId(), false, false, null);
        }
    }

    public final void z(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, org.json.JSONObject jSONObject, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.page.y1 y1Var;
        com.tencent.mm.plugin.appbrand.page.y1 y1Var2;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        int optInt;
        com.tencent.mm.plugin.appbrand.page.w2 p17;
        if (this.f86702e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "navigateToImpl destroyed, url[%s], type[%s]", str, wdVar);
            return;
        }
        com.tencent.mm.plugin.appbrand.page.wd wdVar2 = com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH;
        if (wdVar == wdVar2 || wdVar == com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB) {
            getRuntime().T1();
        }
        long a17 = this.f86719y.a(wdVar, str2);
        boolean z17 = true;
        this.f86719y.b(a17, "overrideEntryPagePath", java.lang.Boolean.valueOf(this.f86702e.m0().K && android.text.TextUtils.isEmpty(nf.z.a(str)) && (wdVar == wdVar2 || wdVar == com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH || wdVar == com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH)), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateTo: %s, type[%s]", str, wdVar);
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? this.f86702e.m0().b() : str;
        if (b17.startsWith("?")) {
            b17 = this.f86702e.m0().b() + b17;
        }
        java.lang.String str3 = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateTo: %s fixed, type[%s]", str3, wdVar);
        q();
        if (jSONObject != null && (optInt = jSONObject.optInt(com.tencent.mm.plugin.appbrand.page.b7.f86431c, -1)) != -1 && (p17 = p(optInt)) != null) {
            com.tencent.mm.plugin.appbrand.page.v5 J2 = p17.J(optInt);
            synchronized (com.tencent.mm.plugin.appbrand.page.b7.class) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewCachePool", "add appbrandPageView:" + com.tencent.mm.plugin.appbrand.page.b7.f86429a);
                if (J2 != null) {
                    ((java.util.ArrayList) com.tencent.mm.plugin.appbrand.page.b7.f86430b).add(J2);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.page.wd wdVar3 = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
        if (wdVar == wdVar3) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = getCurrentPage();
            synchronized (this.f86709o) {
                com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.peekFirst();
                y1Var = ((w2Var2 instanceof com.tencent.mm.plugin.appbrand.page.y1) && w2Var2.x(str3)) ? (com.tencent.mm.plugin.appbrand.page.y1) w2Var2 : null;
            }
            if (y1Var != null) {
                y1Var.R(a17, str3, new com.tencent.mm.plugin.appbrand.page.s3(this, currentPage, new com.tencent.mm.plugin.appbrand.page.a5[1], a17), wdVar3);
            } else {
                synchronized (this.f86709o) {
                    if (this.f86710p.size() >= 2) {
                        java.util.ListIterator listIterator = this.f86710p.listIterator(1);
                        while (listIterator.hasNext()) {
                            com.tencent.mm.plugin.appbrand.page.w2 w2Var3 = (com.tencent.mm.plugin.appbrand.page.w2) listIterator.next();
                            if ((w2Var3 instanceof com.tencent.mm.plugin.appbrand.page.y1) && w2Var3.x(str3)) {
                                y1Var2 = (com.tencent.mm.plugin.appbrand.page.y1) w2Var3;
                                break;
                            }
                        }
                    }
                    y1Var2 = null;
                }
                if (y1Var2 != null) {
                    com.tencent.mm.plugin.appbrand.page.a5[] a5VarArr = new com.tencent.mm.plugin.appbrand.page.a5[1];
                    com.tencent.mm.plugin.appbrand.page.u3 u3Var = new com.tencent.mm.plugin.appbrand.page.u3(this, currentPage, a5VarArr);
                    com.tencent.mm.plugin.appbrand.page.wd wdVar4 = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
                    y1Var2.R(a17, str3, u3Var, wdVar4);
                    synchronized (this.f86709o) {
                        w2Var = (com.tencent.mm.plugin.appbrand.page.w2) this.f86710p.getFirst();
                    }
                    i(w2Var, y1Var2);
                    j0(a17, y1Var2, w2Var, wdVar4, a5VarArr[0], null);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.page.p4 p4Var = new com.tencent.mm.plugin.appbrand.page.p4(this, str3, wdVar, a17, jSONObject);
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = this.f86706i;
        if (r4Var != null ? r4Var.b(str3, wdVar, this, p4Var) : false) {
            return;
        }
        p4Var.a();
    }
}
