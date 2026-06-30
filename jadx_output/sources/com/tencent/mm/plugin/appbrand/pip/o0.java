package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public final class o0 {
    public com.tencent.mm.plugin.appbrand.pip.t0 A;
    public com.tencent.mm.plugin.appbrand.pip.s0 B;
    public com.tencent.mm.plugin.appbrand.pip.k C;
    public volatile boolean D;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f87519b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f87520c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.i3 f87521d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.pip.n0 f87522e;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.media.r1 f87542y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.x7 f87543z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87518a = "MicroMsg.AppBrand.AppBrandPipManager#" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView f87523f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f87524g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f87525h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f87526i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f87527j = null;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.pip.i f87528k = null;

    /* renamed from: l, reason: collision with root package name */
    public pd1.l f87529l = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f87530m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.w2 f87531n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f87532o = true;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.pip.c f87533p = null;

    /* renamed from: q, reason: collision with root package name */
    public pd1.m f87534q = null;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f87535r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f87536s = false;

    /* renamed from: t, reason: collision with root package name */
    public volatile java.lang.Integer f87537t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f87538u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f87539v = false;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.z3 f87540w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.z3 f87541x = null;

    public o0(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.pip.n0 n0Var) {
        this.f87542y = null;
        com.tencent.mm.plugin.appbrand.pip.d0 d0Var = new com.tencent.mm.plugin.appbrand.pip.d0(this);
        this.f87542y = new com.tencent.mm.plugin.appbrand.pip.c0(this);
        this.f87543z = new com.tencent.mm.plugin.appbrand.jsapi.media.x7(d0Var, this.f87542y);
        this.A = null;
        this.B = null;
        this.C = null;
        this.f87519b = context;
        this.f87520c = appBrandRuntime;
        this.f87521d = appBrandRuntime.x0();
        this.f87522e = n0Var;
        this.D = !appBrandRuntime.V;
    }

    public static boolean b(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        java.util.Set set;
        java.lang.Integer num = o0Var.f87537t;
        if (num != null) {
            return (((java.util.concurrent.ConcurrentHashMap) o0Var.f87526i).isEmpty() || (set = (java.util.Set) ((java.util.concurrent.ConcurrentHashMap) o0Var.f87526i).get(num)) == null || set.isEmpty()) ? false : true;
        }
        com.tencent.mars.xlog.Log.w(o0Var.f87518a, "isVideoInPipVideoTargetPageViewPlaying, pipVideoTargetPageViewId is null");
        return false;
    }

    public static void c(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        if (o0Var.m(false)) {
            o0Var.a("exitPip");
            com.tencent.mars.xlog.Log.i(o0Var.f87518a, "exitPip, clearPipVideoRelated");
            o0Var.e(true, true);
        }
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = o0Var.f87523f;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.setVisibility(4);
        }
    }

    public static java.lang.String k(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        if (w2Var == null) {
            return "null";
        }
        return w2Var.getClass().getSimpleName() + "@" + w2Var.hashCode() + "(" + w2Var.getCurrentUrl() + ")";
    }

    public final void a(java.lang.String str) {
        this.f87543z.a();
    }

    public final void d(int i17, java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f87526i;
        java.util.Set set = (java.util.Set) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (set == null) {
            set = new java.util.HashSet();
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Integer.valueOf(i17), set);
        }
        com.tencent.mars.xlog.Log.i(this.f87518a, str2 + ", mPageView2VideosMap add " + str + " for " + i17);
        set.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.appbrand.page.w2, com.tencent.mm.plugin.appbrand.pip.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void e(boolean z17, boolean z18) {
        ?? r27;
        int i17;
        pd1.o oVar;
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        pd1.o oVar2;
        com.tencent.mm.plugin.appbrand.pip.c cVar2;
        pd1.e eVar;
        java.lang.String str = this.f87518a;
        com.tencent.mars.xlog.Log.i(str, "clearPipVideoRelated, mayPause: " + z17 + ", mayDestroyPage: " + z18);
        if (this.f87530m != null && (cVar2 = this.f87533p) != null && this.f87531n != null && (eVar = cVar2.f87434f) != null) {
            eVar.a(cVar2.f87429a).x(this.f87531n);
        }
        java.lang.String str2 = this.f87530m;
        this.f87530m = null;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87531n;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87521d;
        if (w2Var != null) {
            int hashCode = w2Var.getCurrentPageView().hashCode();
            d(hashCode, str2, "clearPipVideoRelated");
            if (z18) {
                com.tencent.mm.plugin.appbrand.page.w2 currentPage = i3Var.getCurrentPage();
                if (currentPage == null) {
                    com.tencent.mars.xlog.Log.w(str, "clearPipVideoRelated, curPage is null");
                } else {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long hash = java.util.Objects.hash(8, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.DISMISS_PIP;
                    i17 = hashCode;
                    currentPage.t(hash, "onAppRoute", wdVar, null, null, null);
                    currentPage.s(hash, wdVar);
                    this.f87531n.U = false;
                    if (z17 && (cVar = this.f87533p) != null && (oVar2 = cVar.f87436h) != null) {
                        oVar2.pause();
                    }
                    if (z18 || this.f87532o) {
                        r27 = 0;
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "clearPipVideoRelated, performDestroy and performCleanup");
                        this.f87531n.F();
                        com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = this.f87531n;
                        w2Var2.k();
                        r27 = 0;
                        w2Var2.G = null;
                        com.tencent.mm.plugin.appbrand.pip.c cVar3 = this.f87533p;
                        if (cVar3 != null && (oVar = cVar3.f87436h) != null) {
                            oVar.h(null);
                        }
                        l(i17, str2, "clearPipVideoRelated");
                    }
                }
            }
            i17 = hashCode;
            this.f87531n.U = false;
            if (z17) {
                oVar2.pause();
            }
            if (z18) {
            }
            r27 = 0;
        } else {
            r27 = 0;
        }
        this.f87531n = r27;
        i3Var.setPipVideoRelatedPage(r27);
        this.f87532o = true;
        this.f87533p = r27;
    }

    public final void f() {
        com.tencent.mm.plugin.appbrand.pip.t0 t0Var;
        if (this.f87523f == null || (t0Var = this.A) == null) {
            return;
        }
        if (this.B == null) {
            java.lang.String appId = this.f87520c.f74803n;
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView pipContainerView = this.f87523f;
            ((com.tencent.mm.plugin.appbrand.pip.u0) t0Var).getClass();
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(pipContainerView, "pipContainerView");
            this.B = new com.tencent.mm.plugin.appbrand.pip.x0(appId, pipContainerView);
        }
        com.tencent.mm.plugin.appbrand.pip.s0 s0Var = this.B;
        com.tencent.mm.plugin.appbrand.pip.i0 i0Var = new com.tencent.mm.plugin.appbrand.pip.i0(this);
        com.tencent.mm.plugin.appbrand.pip.x0 x0Var = (com.tencent.mm.plugin.appbrand.pip.x0) s0Var;
        x0Var.getClass();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(x0Var.f87552a), com.tencent.mm.plugin.appbrand.pip.z0.class, new com.tencent.mm.plugin.appbrand.pip.v0(x0Var, i0Var));
    }

    public com.tencent.mm.plugin.appbrand.pip.l g(int i17) {
        com.tencent.mm.plugin.appbrand.pip.k kVar;
        com.tencent.mars.xlog.Log.i(this.f87518a, "exitPip, viewId: " + i17);
        if (this.f87535r) {
            com.tencent.mars.xlog.Log.w(this.f87518a, "exitPip when mPipClickProcessing, return");
            return com.tencent.mm.plugin.appbrand.pip.l.f87504e;
        }
        java.lang.String str = this.f87530m;
        if (str == null || !str.contains(java.lang.String.valueOf(i17))) {
            return com.tencent.mm.plugin.appbrand.pip.l.f87505f;
        }
        com.tencent.mm.plugin.appbrand.pip.c cVar = this.f87533p;
        if (cVar != null && (kVar = this.C) != null) {
            ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).b(cVar.f87437i, com.tencent.mm.plugin.appbrand.pip.n.EXIT_PIP_CALLED);
        }
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f87523f;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.post(new com.tencent.mm.plugin.appbrand.pip.g0(this));
        }
        return com.tencent.mm.plugin.appbrand.pip.l.f87503d;
    }

    public final com.tencent.mm.plugin.appbrand.pip.d h(int i17) {
        com.tencent.mm.plugin.appbrand.pip.d dVar = (com.tencent.mm.plugin.appbrand.pip.d) ((java.util.concurrent.ConcurrentHashMap) this.f87525h).get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            return dVar;
        }
        com.tencent.mars.xlog.Log.w(this.f87518a, "getPageScopedPipInfo, null == pageScopedPipInfo");
        return null;
    }

    public com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView i() {
        if (this.f87523f == null) {
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = new com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView(this.f87519b, null);
            this.f87523f = appBrandPipContainerView;
            appBrandPipContainerView.setVisibility(4);
            this.f87523f.setOnCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.pip.e0(this));
            this.f87523f.setOnClickListener(new com.tencent.mm.plugin.appbrand.pip.f0(this));
            com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView2 = this.f87523f;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$a) this.f87522e).f74823a;
            appBrandRuntime.getClass();
            com.tencent.mm.plugin.appbrand.ef.PipContainer.a(appBrandRuntime, appBrandPipContainerView2);
            android.view.ViewGroup.LayoutParams layoutParams = this.f87523f.getLayoutParams();
            layoutParams.width = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.K;
            layoutParams.height = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.L;
            this.f87523f.setLayoutParams(layoutParams);
            f();
        }
        return this.f87523f;
    }

    public final com.tencent.mm.plugin.appbrand.pip.c j(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.pip.d dVar = (com.tencent.mm.plugin.appbrand.pip.d) ((java.util.concurrent.ConcurrentHashMap) this.f87525h).get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            return (com.tencent.mm.plugin.appbrand.pip.c) ((java.util.concurrent.ConcurrentHashMap) dVar.f87447i).get(str);
        }
        com.tencent.mars.xlog.Log.w(this.f87518a, "getPipVideoSession, null == pageScopedPipInfo");
        return null;
    }

    public final void l(int i17, java.lang.String str, java.lang.String str2) {
        java.util.Set set = (java.util.Set) ((java.util.concurrent.ConcurrentHashMap) this.f87526i).get(java.lang.Integer.valueOf(i17));
        if (set != null) {
            com.tencent.mars.xlog.Log.i(this.f87518a, str2 + ", mPageView2VideosMap remove " + str + " for " + i17);
            set.remove(str);
        }
    }

    public final boolean m(boolean z17) {
        if (this.f87523f == null || this.f87529l == null || this.f87527j == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.z3 z3Var = this.f87541x;
        if (z3Var != null) {
            z3Var.f90639g.set(0);
            z3Var.run();
            this.f87541x = null;
        }
        com.tencent.mm.plugin.appbrand.pip.j0 j0Var = new com.tencent.mm.plugin.appbrand.pip.j0(this);
        com.tencent.mars.xlog.Log.i(this.f87518a, "transferFrom");
        if (!z17) {
            this.f87529l.d(this.f87527j, null);
            j0Var.run();
            return true;
        }
        pd1.l lVar = this.f87529l;
        android.view.View view = this.f87527j;
        com.tencent.mm.plugin.appbrand.utils.z3 z3Var2 = new com.tencent.mm.plugin.appbrand.utils.z3(j0Var, 0, null);
        this.f87540w = z3Var2;
        lVar.d(view, z3Var2);
        return true;
    }
}
