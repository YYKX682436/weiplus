package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class AppBrandRuntime implements com.tencent.mm.plugin.appbrand.utils.n2, uh1.u {
    public com.tencent.mm.plugin.appbrand.pip.o0 B1;
    public com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView C1;
    public u91.b D;
    public com.tencent.mm.plugin.appbrand.page.z D1;
    public com.tencent.mm.plugin.appbrand.wd E1;
    public int J1;
    public com.tencent.mm.plugin.appbrand.utils.r0 M;
    public java.util.concurrent.ExecutorService M1;
    public volatile u81.h N;
    public volatile androidx.lifecycle.y P;
    public volatile com.tencent.mm.sdk.coroutines.LifecycleScope Q;
    public ph1.h R;
    public volatile boolean S;
    public volatile boolean T;
    public volatile boolean U;
    public com.tencent.mm.plugin.appbrand.widget.k0 U1;
    public final nf.b X;
    public java.lang.Runnable Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f74795d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.hc f74796e;

    /* renamed from: g, reason: collision with root package name */
    public xi1.g f74798g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ff f74799h;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.tc f74801l1;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.gf f74802m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.String f74803n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f74804o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f74805p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f74806p0;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.e9 f74808q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.page.i3 f74809r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.q f74810s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.vc f74811t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f74812u;

    /* renamed from: v, reason: collision with root package name */
    public fl1.c0 f74813v;

    /* renamed from: w, reason: collision with root package name */
    public fl1.c0 f74814w;

    /* renamed from: x, reason: collision with root package name */
    public fl1.c0 f74815x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f74816x0;

    /* renamed from: y, reason: collision with root package name */
    public i81.q f74818y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f74819y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f74820y1;

    /* renamed from: z, reason: collision with root package name */
    public mi1.v f74821z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f74797f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.Printer f74800i = new com.tencent.mm.plugin.appbrand.AppBrandRuntime$$h();
    public volatile boolean A = false;
    public final com.tencent.mm.plugin.appbrand.appstorage.u1[] B = {null};
    public final java.util.concurrent.atomic.AtomicBoolean C = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.ConcurrentLinkedDeque E = new com.tencent.mm.plugin.appbrand.m2(this);
    public final com.tencent.mm.plugin.appbrand.qd F = new com.tencent.mm.plugin.appbrand.qd();
    public final java.util.concurrent.ConcurrentSkipListSet G = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.appbrand.u2(this));
    public final com.tencent.mm.plugin.appbrand.ge H = new com.tencent.mm.plugin.appbrand.ge();
    public final java.util.concurrent.ConcurrentSkipListSet I = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.appbrand.v2(this));

    /* renamed from: J, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f74794J = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.appbrand.w2(this));
    public final java.util.LinkedHashSet K = new java.util.LinkedHashSet();
    public final com.tencent.mm.plugin.appbrand.ha L = new com.tencent.mm.plugin.appbrand.ha();
    public boolean V = false;
    public final java.util.concurrent.atomic.AtomicBoolean W = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p1, reason: collision with root package name */
    public boolean f74807p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f74817x1 = true;

    /* renamed from: z1, reason: collision with root package name */
    public long f74822z1 = 0;
    public long A1 = 0;
    public org.json.JSONArray F1 = null;
    public org.json.JSONArray G1 = null;
    public org.json.JSONArray H1 = null;
    public boolean I1 = false;
    public java.util.LinkedList K1 = new java.util.LinkedList();
    public java.util.concurrent.ConcurrentLinkedQueue L1 = null;
    public final com.tencent.mm.ipcinvoker.t0 N1 = new com.tencent.mm.plugin.appbrand.l2(this);
    public final com.tencent.mm.ipcinvoker.u0 O1 = new com.tencent.mm.plugin.appbrand.n2(this);
    public final com.tencent.mm.sdk.platformtools.b4 P1 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.o2(this), false);
    public final java.util.Deque Q1 = new java.util.concurrent.LinkedBlockingDeque();
    public final u65.a R1 = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$i
        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this;
                java.util.Deque deque = appBrandRuntime.Q1;
                if (deque.isEmpty()) {
                    return;
                } else {
                    appBrandRuntime.m((java.lang.Runnable) ((java.util.concurrent.LinkedBlockingDeque) deque).removeFirst());
                }
            }
        }
    });
    public final android.util.SparseArray S1 = new android.util.SparseArray();
    public com.tencent.mm.plugin.appbrand.utils.o4 T1 = null;

    public AppBrandRuntime(android.content.Context context) {
        this.f74795d = context;
        com.tencent.mm.plugin.appbrand.ff ffVar = new com.tencent.mm.plugin.appbrand.ff();
        this.f74799h = ffVar;
        this.f74802m = new com.tencent.mm.plugin.appbrand.gf();
        this.X = new nf.b(ffVar, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$j
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime.this.j1();
            }
        });
        com.tencent.mm.plugin.appbrand.widget.q a07 = a0(context);
        this.f74810s = a07;
        a07.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f74820y1 = false;
    }

    private void G0(androidx.lifecycle.m mVar) {
        if (androidx.lifecycle.m.ON_DESTROY != mVar || this.P.mo133getLifecycle().b().a(androidx.lifecycle.n.CREATED)) {
            ((androidx.lifecycle.b0) this.P.mo133getLifecycle()).f(mVar);
        }
    }

    public static void M(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.appbrand.page.w2 currentPage;
        if (appBrandRuntime.f74809r == null || (currentPage = appBrandRuntime.f74809r.getCurrentPage()) == null) {
            return;
        }
        al1.l s17 = currentPage.getCurrentPageView().s1();
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = appBrandRuntime.B1;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = o0Var != null ? o0Var.f87523f : null;
        if (appBrandPipContainerView == null || s17 == null) {
            return;
        }
        appBrandPipContainerView.n(s17.getHeight(), configuration);
    }

    public int A0(java.lang.String str) {
        return -1;
    }

    public void A1(com.tencent.mm.plugin.appbrand.hc hcVar, com.tencent.mm.plugin.appbrand.PopPageStackType popPageStackType) {
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime B0() {
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        if (hcVar == null) {
            return null;
        }
        return hcVar.i(this);
    }

    public void B1(com.tencent.mm.plugin.appbrand.oc ocVar) {
        m(new com.tencent.mm.plugin.appbrand.s2(this, ocVar));
    }

    public com.tencent.mm.plugin.appbrand.e9 C0() {
        return this.f74808q;
    }

    public void C1(boolean z17, int i17, boolean z18) {
    }

    public com.tencent.mm.plugin.appbrand.ui.vc D0() {
        return this.f74811t;
    }

    public void D1(int i17) {
    }

    public k91.z0 E0() {
        return (k91.z0) b(k91.z0.class);
    }

    public void E1(boolean z17, int i17) {
    }

    public int F0() {
        return this.f74805p.f77281g;
    }

    public void F1(boolean z17, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.y8 y8Var) {
    }

    public void G1() {
        o(new com.tencent.mm.plugin.appbrand.q2(this));
    }

    public void H0() {
        if (L0()) {
            com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f74811t;
            if (vcVar != null) {
                com.tencent.mm.plugin.appbrand.ui.u5.b(vcVar);
            }
            this.f74811t = null;
            return;
        }
        if (this.f74811t == null) {
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        sj1.l.i(this.f74805p.f77278d, "public:prepare", "Loading页隐藏");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f74803n;
        com.tencent.mm.plugin.appbrand.ui.vc vcVar2 = this.f74811t;
        objArr[1] = vcVar2 != null ? vcVar2.getClass().getName() : null;
        objArr[2] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "hideSplash[AppBrandSplashAd], appId:%s, splash:%s, stack:%s", objArr);
        com.tencent.mm.plugin.appbrand.a2 a2Var = new com.tencent.mm.plugin.appbrand.a2(this);
        if (this.f74811t instanceof com.tencent.mm.plugin.appbrand.ui.zc) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "[weishi] hideSplash, hideLoadingSplashFromRuntime, appId:%s", this.f74803n);
            ((com.tencent.mm.plugin.appbrand.ui.zc) this.f74811t).g(a2Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "hideSplash, animateHide, appId:%s", this.f74803n);
            this.f74811t.n(a2Var);
        }
    }

    public void H1() {
    }

    public final void I0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "null current config, ignored");
            return;
        }
        K("init start", new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile| init start config:%s", appBrandInitConfig);
        this.f74805p = appBrandInitConfig;
        if (!this.f74797f.isEmpty()) {
            com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.getLast();
            z5Var.getClass();
            z5Var.f92446c = appBrandInitConfig;
        }
        this.f74803n = appBrandInitConfig.f77278d;
        if (this.A) {
            sj1.l.d(this.f74803n, true);
        }
        this.N = new u81.h(this);
        this.N.f425432a.n();
        this.N.a(new u81.f() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$b
            @Override // u81.f
            public final void D(java.lang.String str, u81.b bVar) {
                java.lang.String str2;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this;
                appBrandRuntime.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    str2 = "active";
                } else if (ordinal == 1) {
                    str2 = "background";
                } else if (ordinal != 2) {
                    return;
                } else {
                    str2 = "suspend";
                }
                hashMap.put("status", str2);
                com.tencent.mm.plugin.appbrand.page.o2 o2Var = new com.tencent.mm.plugin.appbrand.page.o2();
                o2Var.t(hashMap);
                o2Var.u(appBrandRuntime.C0());
                o2Var.m();
            }
        });
        this.P = new com.tencent.mm.plugin.appbrand.x2(this);
        this.Q = new com.tencent.mm.sdk.coroutines.LifecycleScope("Wxa#" + this.f74803n, this.P, 4);
        ((java.util.concurrent.LinkedBlockingDeque) this.Q1).clear();
        this.R1.f425030a.set(2);
        this.T = false;
        this.W.set(false);
        this.S = false;
        this.Z = false;
        this.f74806p0 = false;
        e1();
        K("init end", new java.lang.Object[0]);
    }

    public void I1(java.lang.Runnable runnable) {
        if (this.S || L0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntime", "runOnRuntimeInitialized runtime[%s] finishing, stack %s", this.f74803n, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else if (J0()) {
            m(runnable);
        } else {
            this.Q1.offerLast(runnable);
        }
    }

    public final boolean J0() {
        return this.R1.f425030a.get() == 0;
    }

    public boolean J1() {
        return false;
    }

    public final void K(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = this.f74805p;
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.ENGLISH, str, objArr);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = appBrandInitConfig == null ? "" : appBrandInitConfig.f77279e;
        objArr2[2] = appBrandInitConfig != null ? appBrandInitConfig.f77278d : "";
        objArr2[3] = java.lang.Integer.valueOf(appBrandInitConfig == null ? -1 : appBrandInitConfig.f77281g);
        objArr2[4] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|%d|%s|%s|%d| %s", objArr2);
    }

    public final void K0(boolean z17) {
        if (z17) {
            K("installFileSystem(forceCreate=true)-createFileSystem", new java.lang.Object[0]);
            synchronized (this.B) {
                this.B[0] = W();
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1[] u1VarArr = this.B;
        if (u1VarArr[0] == null) {
            synchronized (u1VarArr) {
                if (this.B[0] == null) {
                    K("installFileSystem(forceCreate=false)-createFileSystem", new java.lang.Object[0]);
                    this.B[0] = W();
                }
            }
        }
    }

    public final lm0.a K1(java.lang.Class cls) {
        com.tencent.mm.plugin.appbrand.ha haVar = this.L;
        lm0.a b17 = haVar.b(cls);
        if (b17 != null) {
            return (lm0.a) cls.cast(b17);
        }
        lm0.a p17 = p1(cls);
        if (p17 != null) {
            haVar.a(cls, new lm0.f((lm0.a) cls.cast(p17)));
        } else if (cls == com.tencent.mm.plugin.appbrand.widget.h0.class) {
            return (lm0.a) cls.cast(com.tencent.mm.plugin.appbrand.widget.h0.f91141v0);
        }
        return (lm0.a) cls.cast(p17);
    }

    public final boolean L0() {
        return this.W.get();
    }

    public final void L1(k91.r rVar) {
        java.util.Map map;
        java.lang.String str = this.f74803n;
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "setConfigEntryPath before %s", b3Var);
        if (b3Var != null) {
            str = ((nd1.l2) b3Var).a(str);
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str + "_entryPagePath");
        java.lang.String u17 = M != null ? M.u("keyEntryPagePath", "") : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "setConfigEntryPath configEntryPath : %s ", u17);
        if (!android.text.TextUtils.isEmpty(u17)) {
            rVar.getClass();
            boolean z17 = false;
            if (!android.text.TextUtils.isEmpty(u17)) {
                synchronized (rVar.f305741h) {
                    java.lang.String i17 = !((java.util.HashMap) rVar.f305742i).containsKey(u17) ? com.tencent.mm.plugin.appbrand.appstorage.l1.i(u17) : u17;
                    if (((java.util.HashMap) rVar.f305742i).containsKey(i17) || (rVar.f305737d && (map = rVar.f305743m) != null && map.containsKey(i17))) {
                        z17 = true;
                    }
                }
            }
            if (z17) {
                rVar.f305736J = u17;
                rVar.K = true;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntime", "setConfigEntryPath urlInPages is false");
            }
        }
        ((com.tencent.mm.plugin.appbrand.m2) this.E).add(rVar);
    }

    public boolean M0() {
        return false;
    }

    public final void M1(boolean z17) {
        if (V1()) {
            return;
        }
        this.f74807p1 = z17;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = x0() == null ? null : x0().getCurrentPage();
        if (currentPage != null) {
            currentPage.L();
        }
    }

    public void N(com.tencent.mm.plugin.appbrand.hc hcVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
    }

    public boolean N0() {
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class);
        return (q2Var == null || !q2Var.g4() || q2Var.W1() == com.tencent.mm.plugin.appbrand.wxassistant.b3.f92138g) ? false : true;
    }

    public final void N1(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var, boolean z17) {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.E;
        if (z17) {
            java.lang.Class<?> cls = g0Var.getClass();
            iz5.a.e(cls, com.tencent.mm.plugin.appbrand.jsapi.g0.class);
            java.util.Iterator descendingIterator = concurrentLinkedDeque.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                } else if (cls.isInstance((com.tencent.mm.plugin.appbrand.jsapi.g0) descendingIterator.next())) {
                    descendingIterator.remove();
                    break;
                }
            }
        }
        concurrentLinkedDeque.add(g0Var);
    }

    public boolean O0(com.tencent.mm.plugin.appbrand.hc hcVar) {
        return true;
    }

    public void O1(com.tencent.mm.plugin.appbrand.hc hcVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "setRuntimeContainer " + hcVar + " ,mAppBrandRuntimeStacks: " + this.f74797f.size());
        com.tencent.mm.plugin.appbrand.hc hcVar2 = this.f74796e;
        if (hcVar2 != null && hcVar2 != hcVar) {
            hcVar2.k(this);
        }
        this.f74797f.clear();
        this.f74796e = hcVar;
        if (hcVar != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = u0();
            this.f74797f.addLast(new com.tencent.mm.plugin.appbrand.z5(hcVar, this.f74809r, u07, u07 != null ? u07.f77283i : null));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "resetAppBrandRuntimePageStack  " + this.f74797f.peekLast());
        }
        com.tencent.mm.plugin.appbrand.hc hcVar3 = this.f74796e;
        if (hcVar3 != null) {
            this.F.b(hcVar3);
        } else {
            this.F.a();
        }
    }

    public void P(int i17, int i18, com.tencent.mm.plugin.appbrand.oc ocVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "addKeyEventObserver");
        m(new com.tencent.mm.plugin.appbrand.r2(this, ocVar, i18, i17));
    }

    public boolean P0() {
        return false;
    }

    public boolean P1() {
        if (this.N == null) {
            return false;
        }
        u81.f0 f0Var = this.N.f425432a;
        k75.j jVar = f0Var.f304847e;
        return jVar == null ? false : ((java.lang.Boolean) new u81.r(f0Var, 1000L, java.lang.Boolean.FALSE).a(new com.tencent.mm.sdk.platformtools.n3(jVar.getLooper()))).booleanValue();
    }

    public final void Q(com.tencent.mm.plugin.appbrand.td page) {
        if (this.E1 == null) {
            this.E1 = new com.tencent.mm.plugin.appbrand.t2(this, this, new com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o(this), new com.tencent.mm.plugin.appbrand.AppBrandRuntime$$p(this));
        }
        com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
        wdVar.getClass();
        kotlin.jvm.internal.o.g(page, "page");
        com.tencent.mm.plugin.appbrand.td tdVar = wdVar.f90960d;
        if (!(tdVar != null && tdVar.compareTo(page) == 0)) {
            com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "attachEmbeddingPage for host:" + wdVar.f90957a + ", embeddingPage:" + page);
            wdVar.f90960d = page;
            if (page.D0()) {
                page.mo133getLifecycle().a((androidx.lifecycle.v) ((jz5.n) wdVar.f90961e).getValue());
            }
            page.Cg(wdVar);
        }
        this.E1.getClass();
    }

    public boolean Q0() {
        return false;
    }

    public boolean Q1() {
        return true;
    }

    public final boolean R() {
        if (!this.f74817x1) {
            return false;
        }
        android.app.Activity r07 = r0();
        return ((r07 != null && r07.isFinishing()) || this.f74809r == null || this.f74809r.getCurrentPage() == null || this.f74809r.getCurrentPage().R) ? false : true;
    }

    public boolean R0() {
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        return hcVar != null && hcVar.n(this);
    }

    public boolean R1(java.lang.Runnable runnable) {
        return false;
    }

    public void S() {
        T(null, null);
    }

    public boolean S0(java.lang.String str) {
        if (this.F1 == null) {
            return false;
        }
        for (int i17 = 0; i17 < this.F1.length(); i17++) {
            if (this.F1.optString(i17).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void S1() {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f74811t;
        if (vcVar != null) {
            com.tencent.mm.plugin.appbrand.ui.u5.b(vcVar);
            this.f74811t = null;
        }
        sj1.l.i(this.f74805p.f77278d, "public:prepare", "Loading页展示");
        com.tencent.mm.plugin.appbrand.ui.vc X = X();
        if (X == null) {
            return;
        }
        X.j(u0().f77280f, u0().f77279e);
        android.view.View view = X.getView();
        com.tencent.mm.plugin.appbrand.a3 a3Var = new com.tencent.mm.plugin.appbrand.a3(this, view, X);
        this.f74812u = true;
        this.f74811t = X;
        com.tencent.mm.plugin.appbrand.ef.LoadingSplash.a(this, view);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f74803n;
        com.tencent.mm.plugin.appbrand.ui.vc vcVar2 = this.f74811t;
        objArr[1] = vcVar2 == null ? "null" : vcVar2.getClass().getSimpleName();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "showSplash[AppBrandSplashAd], appId:%s, splash:%s", objArr);
        this.f74810s.setOnHierarchyChangeListener(new com.tencent.mm.plugin.appbrand.d3(this, view, a3Var));
    }

    public final void T(java.lang.Object obj, java.lang.Runnable runnable) {
        m(new com.tencent.mm.plugin.appbrand.k2(this, runnable, obj));
    }

    public boolean T0() {
        return false;
    }

    public void T1() {
    }

    public final void U() {
        if (this.D == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntime", "[DirectGame] closeDirectGameCoverViewContainer, coverViewContainer is null, appId:%s", this.f74803n);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "[DirectGame] closeDirectGameCoverViewContainer, appId:%s", this.f74803n);
        u91.b bVar = this.D;
        bVar.getClass();
        bVar.f425817d.m(new u91.a(bVar));
        this.D = null;
        if (this.f74808q != null) {
            this.f74808q.R0();
        }
    }

    public final boolean U0() {
        return this.f74797f.size() > 1 && this.f74809r.getPageCount() == 0;
    }

    public void U1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig) {
        this.f74805p = initConfig;
        if (this.f74797f.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.getLast();
        z5Var.getClass();
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        z5Var.f92446c = initConfig;
    }

    public mi1.v V() {
        return new mi1.v(this);
    }

    public boolean V0(java.lang.String str) {
        if (this.G1 == null) {
            return false;
        }
        for (int i17 = 0; i17 < this.G1.length(); i17++) {
            if (this.G1.optString(i17).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean V1() {
        return true;
    }

    public com.tencent.mm.plugin.appbrand.appstorage.u1 W() {
        return new com.tencent.mm.plugin.appbrand.appstorage.g2(new java.util.LinkedList());
    }

    public boolean W0() {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f74811t;
        boolean d17 = vcVar instanceof com.tencent.mm.plugin.appbrand.ui.wc ? ((com.tencent.mm.plugin.appbrand.ui.wc) vcVar).d() : false;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(d17);
        objArr[1] = this.f74803n;
        com.tencent.mm.plugin.appbrand.ui.vc vcVar2 = this.f74811t;
        objArr[2] = vcVar2 == null ? "null" : vcVar2.getClass().getSimpleName();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "isShowingSplashAd[AppBrandSplashAd]:%s, appId:%s, splash:%s", objArr);
        return d17;
    }

    public com.tencent.mm.plugin.appbrand.ui.vc X() {
        return null;
    }

    public final void X0() {
        synchronized (this) {
            if (this.U) {
                throw new java.lang.RuntimeException("Already invoked launch()");
            }
            this.U = true;
            this.V = true;
            this.f74812u = false;
            this.f74794J.clear();
            this.R = null;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f74822z1 = elapsedRealtime;
        try {
            K("launch start", new java.lang.Object[0]);
            this.f74805p.f77291t = false;
            h1();
            if (!L0() && !this.S) {
                cf.i.b("AppBrandRuntimeProfile| onCreatePrivate" + this.f74803n, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$l
                    @Override // java.lang.Runnable
                    public final void run() {
                        final com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this;
                        appBrandRuntime.K("appOnCreate", new java.lang.Object[0]);
                        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
                        com.tencent.mm.ipcinvoker.d0.b(str, appBrandRuntime.N1);
                        com.tencent.mm.ipcinvoker.d0.c(str, appBrandRuntime.O1);
                        appBrandRuntime.x1(gb1.k.class, new com.tencent.mm.plugin.appbrand.ia());
                        appBrandRuntime.x1(com.tencent.mm.plugin.appbrand.networking.d0.class, new com.tencent.mm.plugin.appbrand.networking.f0(appBrandRuntime));
                        appBrandRuntime.x1(o91.e.class, new com.tencent.mm.plugin.appbrand.luggage.customize.d0(appBrandRuntime));
                        appBrandRuntime.x1(o91.d.class, new com.tencent.mm.plugin.appbrand.luggage.customize.c0(appBrandRuntime));
                        cf.i.b("AppBrandRuntimeProfile|onCreate", new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$d
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.appbrand.AppBrandRuntime.this.b1();
                            }
                        });
                        jh1.a.a(appBrandRuntime.f74803n);
                        appBrandRuntime.N.f425432a.s(u81.u.TO_FOREGROUND, "onRuntimeCreate");
                        com.tencent.mm.plugin.appbrand.x0.g(appBrandRuntime.f74803n, com.tencent.mm.plugin.appbrand.w0.HIDE);
                        java.lang.String str2 = appBrandRuntime.f74803n;
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str2);
                            while (c17.hasNext()) {
                                ((com.tencent.mm.plugin.appbrand.v0) c17.next()).b();
                            }
                        }
                        com.tencent.mm.plugin.appbrand.x0.f(appBrandRuntime.f74803n, com.tencent.mm.plugin.appbrand.u0.ON_CREATE);
                        ((androidx.lifecycle.b0) ((com.tencent.mm.plugin.appbrand.x2) appBrandRuntime.P).f92371d).i(androidx.lifecycle.n.RESUMED);
                        appBrandRuntime.G1();
                    }
                });
                this.J1 = sj1.l.f(this.f74803n, "public:prepare", "小程序启动资源准备");
                cf.i.b("AppBrandRuntimeProfile| prepare(AllDoneInitNotify)" + this.f74803n, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this;
                        appBrandRuntime.getClass();
                        com.tencent.mm.plugin.appbrand.i3 i3Var = new com.tencent.mm.plugin.appbrand.i3(appBrandRuntime, null);
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue(appBrandRuntime.K1);
                        appBrandRuntime.L1 = concurrentLinkedQueue;
                        appBrandRuntime.K1 = new java.util.LinkedList();
                        java.util.Iterator it = concurrentLinkedQueue.iterator();
                        java.util.concurrent.ExecutorService executorService = appBrandRuntime.M1;
                        if (executorService != null && !((ku5.f) executorService).isShutdown()) {
                            ((ku5.f) appBrandRuntime.M1).shutdownNow();
                        }
                        appBrandRuntime.M1 = ((ku5.t0) ku5.t0.f312615d).o(java.lang.String.format("appbrand_runtime_%s", java.lang.Integer.valueOf(appBrandRuntime.hashCode())), 6, 12, new java.util.concurrent.LinkedBlockingQueue());
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                        while (it.hasNext()) {
                            final com.tencent.mm.plugin.appbrand.g3 g3Var = (com.tencent.mm.plugin.appbrand.g3) it.next();
                            g3Var.f78186a = new com.tencent.mm.plugin.appbrand.y2(appBrandRuntime, concurrentLinkedQueue, g3Var, atomicBoolean, i3Var);
                            if (g3Var.e()) {
                                g3Var.b();
                                try {
                                    java.util.concurrent.ExecutorService executorService2 = appBrandRuntime.M1;
                                    java.util.Objects.requireNonNull(executorService2);
                                    ((ku5.f) executorService2).execute(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$e
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.tencent.mm.plugin.appbrand.g3 g3Var2 = com.tencent.mm.plugin.appbrand.g3.this;
                                            g3Var2.b();
                                            g3Var2.c();
                                        }
                                    });
                                } catch (java.util.concurrent.RejectedExecutionException unused) {
                                    appBrandRuntime.K("try prepare but ThreadPool shut down", new java.lang.Object[0]);
                                    return;
                                }
                            } else {
                                linkedList.add(g3Var);
                            }
                        }
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.appbrand.g3 g3Var2 = (com.tencent.mm.plugin.appbrand.g3) it6.next();
                            sj1.l.e(appBrandRuntime.f74805p.f77278d, "internal:prepare", g3Var2.b());
                            g3Var2.b();
                            g3Var2.c();
                            sj1.l.g(appBrandRuntime.f74805p.f77278d);
                        }
                    }
                });
                cf.i.b("AppBrandRuntimeProfile| showSplash " + this.f74803n, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime.this.S1();
                    }
                });
                this.P1.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile| finish() called during onLaunch, appId:%s", this.f74803n);
        } finally {
            K("launch end, cost:%dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public ph1.h Y() {
        return new ph1.f();
    }

    public void Y0(int i17) {
    }

    public com.tencent.mm.plugin.appbrand.page.i3 Z() {
        return new com.tencent.mm.plugin.appbrand.page.i3(this.f74795d, this);
    }

    public void Z0() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f74803n;
        objArr[1] = java.lang.Boolean.valueOf(this.T);
        objArr[2] = java.lang.Boolean.valueOf(this.f74811t != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|onBackPressed, appId:%s, mInitReady:%b, mSplash?:%b", objArr);
        if (this.f74811t != null && !this.T) {
            com.tencent.mm.plugin.appbrand.x0.g(this.f74803n, com.tencent.mm.plugin.appbrand.w0.BACK);
            l0();
            return;
        }
        fl1.c0 c0Var = this.f74815x;
        if (c0Var == null || !c0Var.e()) {
            fl1.c0 c0Var2 = this.f74814w;
            if (c0Var2 == null || !c0Var2.e()) {
                fl1.c0 c0Var3 = this.f74813v;
                if ((c0Var3 == null || !c0Var3.e()) && this.f74809r != null) {
                    this.f74809r.A();
                }
            }
        }
    }

    public com.tencent.mm.plugin.appbrand.widget.q a0(android.content.Context context) {
        if (com.tencent.mm.plugin.appbrand.utils.m3.b(context)) {
            return new com.tencent.mm.plugin.appbrand.widget.c(context);
        }
        com.tencent.mm.plugin.appbrand.widget.q qVar = (com.tencent.mm.plugin.appbrand.widget.q) com.tencent.mm.plugin.appbrand.widget.q.f91848m.pollFirst();
        return qVar != null ? qVar : new com.tencent.mm.plugin.appbrand.widget.q(context);
    }

    public void a1(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var;
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.appbrand.b2(this, configuration));
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.B1;
        if (o0Var != null) {
            com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onConfigurationChanged: newConfig: " + configuration);
            com.tencent.mm.plugin.appbrand.pip.i iVar = o0Var.f87528k;
            if (iVar != null) {
                com.tencent.mars.xlog.Log.i(iVar.f87471a, "onConfigurationChanged");
                if (iVar.f87478h) {
                    iVar.f87475e.d(iVar.f87472b, new com.tencent.mm.plugin.appbrand.pip.e(iVar));
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 a17 = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.a(this.f74803n, true);
        java.util.Objects.requireNonNull(a17);
        int i17 = configuration.orientation;
        if (i17 == 2) {
            com.tencent.mm.plugin.appbrand.utils.f4 f4Var2 = a17.f82987e;
            f4Var = com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_LANDSCAPE;
            if (f4Var2 != f4Var) {
                f4Var = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
            }
        } else {
            f4Var = i17 == 1 ? com.tencent.mm.plugin.appbrand.utils.f4.PORTRAIT : com.tencent.mm.plugin.appbrand.utils.f4.NONE;
        }
        a17.f82988f = f4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationConfigListenerHelper", "onConfigurationChanged mAppId:%s, mEnable:%b, mOrientation:%s, mConfiguration:%s", a17.f82984b, java.lang.Boolean.valueOf(a17.f82983a), a17.f82987e, a17.f82988f);
        if (a17.f82983a) {
            a17.d(a17.f82988f);
        }
    }

    @Override // uh1.u
    public com.tencent.mm.plugin.appbrand.jsapi.g0 b(java.lang.Class cls) {
        return p0(cls, !this.I1);
    }

    public com.tencent.mm.plugin.appbrand.e9 b0() {
        return new com.tencent.mm.plugin.appbrand.e9();
    }

    public void b1() {
    }

    public boolean c0(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        synchronized (this.K) {
            this.K.remove(h0Var);
        }
        return true;
    }

    public void c1() {
        com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = this.C1;
        if (appBrandGlobalNativeWidgetContainerView != null) {
            pf1.q.f353787h.a(appBrandGlobalNativeWidgetContainerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d0() {
        androidx.lifecycle.o mo133getLifecycle;
        mf1.i iVar;
        boolean andSet = this.W.getAndSet(true);
        K("dispatchDestroy, destroyed?[%b] initialized?[%b] initReady?[%b]", java.lang.Boolean.valueOf(andSet), java.lang.Boolean.valueOf(J0()), java.lang.Boolean.valueOf(this.T));
        if (andSet) {
            return;
        }
        synchronized (this) {
            this.U = false;
        }
        if (this.V) {
            g0(true);
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.L1;
        this.L1 = null;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "cancelAllPrepareProcesses empty list appId[%s]", this.f74803n);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "cancelAllPrepareProcesses size[%d] appId[%s]", java.lang.Integer.valueOf(concurrentLinkedQueue.size()), this.f74803n);
            while (!concurrentLinkedQueue.isEmpty()) {
                com.tencent.mm.plugin.appbrand.g3 g3Var = (com.tencent.mm.plugin.appbrand.g3) concurrentLinkedQueue.poll();
                if (g3Var != null) {
                    g3Var.a();
                }
            }
        }
        c1();
        this.f74802m.a();
        this.f74799h.removeCallbacksAndMessages(null);
        u81.h hVar = this.N;
        u81.f0 f0Var = hVar.f425432a;
        if (f0Var.f425426x.get()) {
            f0Var.f425427y.set(true);
            k75.j jVar = f0Var.f304847e;
            if (jVar == null ? false : jVar.hasMessages(-2)) {
                com.tencent.mars.xlog.Log.e(f0Var.f425423u, "stop() called, but still isInConstruction");
                f0Var.j();
            } else {
                k75.j jVar2 = f0Var.f304847e;
                if (jVar2 != null) {
                    if (jVar2.f304831b) {
                        jVar2.f304841l.f("quitNow:");
                    }
                    jVar2.sendMessageAtFrontOfQueue(jVar2.obtainMessage(-1, k75.j.f304829q));
                }
            }
            f0Var.v(f0Var.z(f0Var.F), u81.b.DESTROYED);
        } else {
            com.tencent.mars.xlog.Log.printErrStackTrace(f0Var.f425423u, new java.lang.Throwable(), "Illegal internal state, stop() called before start()", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.media.music.d dVar = com.tencent.mm.plugin.appbrand.media.music.d.f85757c;
        java.lang.String str = hVar.f425433b.f74803n;
        com.tencent.mm.plugin.appbrand.media.music.b bVar = hVar.f425435d;
        dVar.getClass();
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.HashMap hashMap = dVar.f85758a;
            if (bVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.remove(str, bVar);
            }
        }
        synchronized (hVar.f425434c) {
            hVar.f425434c.clear();
        }
        java.lang.String str2 = this.f74803n;
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.x0.f92366a;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str2);
            while (c17.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.v0) c17.next()).c();
            }
        }
        com.tencent.mm.plugin.appbrand.x0.f(this.f74803n, com.tencent.mm.plugin.appbrand.u0.ON_DESTROY);
        G0(androidx.lifecycle.m.ON_DESTROY);
        if (this.f74808q != null) {
            this.f74808q.h();
            this.f74808q = null;
        }
        this.f74797f.forEach(new com.tencent.mm.plugin.appbrand.AppBrandRuntime$$k());
        this.f74797f.clear();
        if (this.f74809r != null) {
            this.f74809r.h();
            this.f74809r = null;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1[] u1VarArr = this.B;
        if (u1VarArr[0] != null) {
            synchronized (u1VarArr) {
                com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.B[0];
                if (u1Var != null) {
                    try {
                        u1Var.release();
                        this.B[0] = null;
                    } catch (java.lang.Throwable th6) {
                        this.B[0] = null;
                        throw th6;
                    }
                }
            }
        }
        jh1.a.b(this.f74803n);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        com.tencent.mm.ipcinvoker.d0.j(str3, this.N1);
        com.tencent.mm.ipcinvoker.d0.k(str3, this.O1);
        nf.o.a(r0());
        this.f74801l1 = null;
        this.R = null;
        this.F1 = null;
        this.G1 = null;
        this.H1 = null;
        uh1.z zVar = (uh1.z) uh1.s.f427900a.f427903a;
        zVar.getClass();
        uh1.w wVar = (uh1.w) zVar.f427946b.remove(uh1.a0.a(this));
        if (wVar != null) {
            wVar.release();
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
        uh1.i iVar2 = uh1.h.f427795a;
        java.lang.String str4 = this.f74803n;
        java.util.HashMap hashMap2 = iVar2.f427799a;
        if (hashMap2.containsKey(str4)) {
            ((uh1.f) hashMap2.remove(str4)).release();
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = uh1.h0.f427796b;
        uh1.h0 h0Var = uh1.g0.f427794a;
        java.lang.String str5 = this.f74803n;
        java.util.HashMap hashMap3 = h0Var.f427797a;
        if (hashMap3.containsKey(str5)) {
            ((uh1.e0) hashMap3.remove(str5)).release();
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = uh1.t0.f427904b;
        uh1.t0 t0Var = uh1.s0.f427901a;
        java.lang.String str6 = this.f74803n;
        java.util.HashMap hashMap4 = t0Var.f427905a;
        if (hashMap4.containsKey(str6) && (iVar = (mf1.i) hashMap4.remove(str6)) != null) {
            iVar.release();
        }
        java.lang.String str7 = this.f74803n;
        if (!android.text.TextUtils.isEmpty(str7)) {
            com.tencent.mm.plugin.appbrand.x0.f92369d.g(str7);
            com.tencent.mm.plugin.appbrand.x0.f92370e.g(str7);
        }
        this.f74810s.setOnHierarchyChangeListener(null);
        this.f74810s.removeAllViewsInLayout();
        fl1.c0 c0Var = this.f74814w;
        if (c0Var != null) {
            c0Var.f();
            this.f74814w = null;
        }
        fl1.c0 c0Var2 = this.f74813v;
        if (c0Var2 != null) {
            c0Var2.f();
            this.f74813v = null;
        }
        fl1.c0 c0Var3 = this.f74815x;
        if (c0Var3 != null) {
            c0Var3.f();
            this.f74815x = null;
        }
        mi1.v vVar = this.f74821z;
        if (vVar != null) {
            mi1.m0 m0Var = vVar.f326706e;
            m0Var.f326618d.clear();
            m0Var.f326620f.clear();
            m0Var.f326619e.clear();
            m0Var.f326621g = null;
            kotlinx.coroutines.r2 r2Var = m0Var.f326622h;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            mi1.i iVar3 = vVar.f326704c;
            if (iVar3 != null) {
                iVar3.removeAllViews();
            }
            mi1.u0 u0Var = vVar.f326710i;
            if (u0Var != null) {
                u0Var.q();
            }
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.B1;
        if (o0Var != null) {
            ((java.util.concurrent.ConcurrentHashMap) o0Var.f87525h).clear();
            ((java.util.concurrent.ConcurrentHashMap) o0Var.f87526i).clear();
            this.B1 = null;
        }
        i81.q qVar = this.f74818y;
        if (qVar != null) {
            qVar.removeAllViews();
            this.f74818y = null;
        }
        try {
            com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = this.C1;
            if (appBrandGlobalNativeWidgetContainerView != null) {
                appBrandGlobalNativeWidgetContainerView.removeAllViewsInLayout();
            }
            this.C1 = null;
            this.D1 = null;
            this.E.clear();
            synchronized (this.K) {
                this.K.clear();
            }
            com.tencent.mm.plugin.appbrand.appcache.la.m(this);
            com.tencent.mm.plugin.appbrand.ha haVar = this.L;
            haVar.getClass();
            java.util.Set set = haVar.f78272c;
            java.util.HashSet hashSet = new java.util.HashSet(set);
            set.clear();
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                haVar.c((java.lang.Class) it6.next());
            }
            this.Y = null;
            ((java.util.concurrent.LinkedBlockingDeque) this.Q1).clear();
            this.R1.f425030a.set(2);
            this.f74799h.removeCallbacksAndMessages(null);
            this.P1.d();
            this.S1.clear();
            this.f74812u = false;
            com.tencent.mm.plugin.appbrand.page.s5.a(this);
            com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.b(this.f74803n);
            this.G.clear();
            com.tencent.mm.plugin.appbrand.ge geVar = this.H;
            geVar.f78252a.clear();
            geVar.f78253b.set(false);
            this.I.clear();
            com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
            if (wdVar != null) {
                com.tencent.mm.plugin.appbrand.td tdVar = wdVar.f90960d;
                if (tdVar != null && (mo133getLifecycle = tdVar.mo133getLifecycle()) != null) {
                    mo133getLifecycle.c((androidx.lifecycle.v) ((jz5.n) wdVar.f90961e).getValue());
                }
                wdVar.f90960d = null;
                this.E1 = null;
            }
            this.f74796e = null;
            com.tencent.mm.plugin.appbrand.utils.r0 r0Var = this.M;
            if (r0Var != null) {
                ((java.util.concurrent.CopyOnWriteArraySet) r0Var.f90540a).clear();
                this.M = null;
            }
            nf.b bVar2 = this.X;
            bVar2.f336574a.removeCallbacks(bVar2.f336575b);
            java.util.concurrent.ExecutorService executorService = this.M1;
            if (executorService != null && !((ku5.f) executorService).isShutdown()) {
                ((ku5.f) this.M1).shutdownNow();
            }
            java.util.Iterator it7 = new java.util.LinkedList(this.f74794J).iterator();
            while (it7.hasNext()) {
                ((java.lang.Runnable) it7.next()).run();
            }
            this.f74794J.clear();
            com.tencent.mm.plugin.appbrand.widget.k0 k0Var = this.U1;
            if (k0Var != null) {
                com.tencent.mars.xlog.Log.i("Luggage.ActionSheetManager", "clearAll");
                k0Var.f91747a.clear();
                k0Var.f91748b.clear();
            }
            U();
            K("dispatchDestroy, completed", new java.lang.Object[0]);
        } catch (java.lang.Throwable th7) {
            this.C1 = null;
            this.D1 = null;
            throw th7;
        }
    }

    public void d1() {
        K("onDetachFromStack", new java.lang.Object[0]);
        this.f74804o = null;
        u81.h hVar = this.N;
        hVar.getClass();
        hVar.f425432a.s(u81.u.ON_DETACH_FROM_STACK, null);
        java.lang.String str = this.f74803n;
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.x0.f92366a;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str);
        while (c17.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.v0) c17.next()).d();
        }
    }

    public final void e0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (!J0()) {
            if (L0() || this.S) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "dispatchNewConfig FATAL!! appId[%s] config[%s]", this.f74803n, appBrandInitConfig);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "dispatchNewConfig appId[%s] config[%s] !mInitialized !mFinished !mFinishing, try reload", this.f74803n, appBrandInitConfig);
                z1(appBrandInitConfig, "dispatchNewConfigBeforeInitialized");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "dispatchNewConfig, appId[%s] config[%s]", this.f74803n, appBrandInitConfig);
        boolean z17 = false;
        if (appBrandInitConfig != null && appBrandInitConfig.f77281g != this.f74805p.f77281g) {
            z17 = true;
        }
        if (z17) {
            this.Z = true;
        }
        U1(appBrandInitConfig);
        if (this.Z || L0()) {
            return;
        }
        java.util.Iterator it = new java.util.LinkedList(this.I).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.xc) it.next()).f(this, u0());
        }
    }

    public void e1() {
    }

    public final void f0() {
        com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
        if (wdVar != null) {
            com.tencent.mm.plugin.appbrand.td tdVar = wdVar.f90960d;
            boolean z17 = tdVar != null && tdVar.D0();
            com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "dispatchPause for host:" + wdVar.f90957a + ", embeddingPage:" + wdVar.f90960d + ", disableVisibilityEvent:" + z17);
            if (!z17) {
                ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$p) wdVar.f90959c).f74837a.g0(false);
                return;
            }
            com.tencent.mm.plugin.appbrand.td tdVar2 = wdVar.f90960d;
            kotlin.jvm.internal.o.d(tdVar2);
            tdVar2.h2();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime.this.g0(false);
            }
        };
        this.Y = runnable;
        I1(runnable);
        if (!this.V) {
            this.Y = null;
            return;
        }
        nf.b bVar = this.X;
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
        bVar.getClass();
        iz5.a.g(null, millis >= 0);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.f336576c = java.lang.System.currentTimeMillis();
        bVar.f336577d = millis;
        bVar.f336574a.removeCallbacks(bVar.f336575b);
        bVar.f336574a.postDelayed(bVar.f336575b, millis);
    }

    public void f1() {
    }

    public void finalize() {
        super.finalize();
        this.f74799h.removeCallbacksAndMessages(null);
    }

    public final void g0(boolean z17) {
        boolean J0 = J0();
        boolean z18 = this.V;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "dispatchPauseImpl(%s), initialized:%b, resumed:%b, destroyed:%b, forDestroy:%b", this, java.lang.Boolean.valueOf(J0), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(L0()), java.lang.Boolean.valueOf(z17));
        if (J0) {
            if ((z17 || !L0()) && z18) {
                K("onPause", new java.lang.Object[0]);
                this.V = false;
                i1();
                u81.h hVar = this.N;
                hVar.getClass();
                hVar.f425432a.s(u81.u.TO_BACKGROUND, null);
                this.f74808q.k1();
                this.f74809r.B();
                java.lang.String str = this.f74803n;
                java.util.Iterator it = com.tencent.mm.plugin.appbrand.x0.f92366a;
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str);
                    while (c17.hasNext()) {
                        ((com.tencent.mm.plugin.appbrand.v0) c17.next()).e(com.tencent.mm.plugin.appbrand.x0.d(str));
                    }
                }
                com.tencent.mm.plugin.appbrand.x0.f(this.f74803n, com.tencent.mm.plugin.appbrand.u0.ON_PAUSE);
                G0(androidx.lifecycle.m.ON_PAUSE);
                G0(androidx.lifecycle.m.ON_STOP);
                this.M.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
                try {
                    com.tencent.mm.sdk.platformtools.a5.a(com.tencent.mm.sdk.platformtools.x2.f193071a, null);
                } catch (java.lang.SecurityException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", e17, "[NOT CRASH] pause set null callback", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.appbrand.jsapi.audio.f.a(this.f74808q);
            }
        }
    }

    public boolean g1() {
        return false;
    }

    @Override // uh1.u
    public java.lang.String getAppId() {
        return this.f74803n;
    }

    @Override // uh1.u
    public u81.b getAppState() {
        return this.N.b();
    }

    public fl1.g2 getAuthorizeDialogContainer() {
        if (this.f74815x == null) {
            fl1.c0 c0Var = new fl1.c0(this.f74795d, ((fl1.c0) getDialogContainer()).getShareContext());
            this.f74815x = c0Var;
            c0Var.setShouldBringSelfToFrontWhenDialogShown(false);
            com.tencent.mm.plugin.appbrand.ef.AuthorizeDialogContainer.a(this, this.f74815x);
        }
        return this.f74815x;
    }

    public fl1.g2 getDialogContainer() {
        if (this.f74813v == null) {
            fl1.c0 c0Var = new fl1.c0(this.f74795d, null);
            this.f74813v = c0Var;
            c0Var.setShouldBringSelfToFrontWhenDialogShown(false);
            com.tencent.mm.plugin.appbrand.ef.LegacyDialogContainer.a(this, this.f74813v);
        }
        return this.f74813v;
    }

    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        if (this.B[0] == null) {
            if (L0() || this.S) {
                return null;
            }
            synchronized (this.B) {
                if (this.B[0] == null) {
                    K("getFileSystem-installFileSystem(forceCreate=true)", new java.lang.Object[0]);
                    K0(true);
                }
            }
        }
        return this.B[0];
    }

    public xi1.g getWindowAndroid() {
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        if (hcVar != null) {
            return hcVar.getWindowAndroid();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f74803n;
        xi1.g gVar = this.f74798g;
        objArr[1] = gVar == null ? null : gVar.getClass().getName();
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "getWindowAndroid getRuntimeContainer is NULL appId[%s], return default %s", objArr);
        xi1.g gVar2 = this.f74798g;
        if (gVar2 != null) {
            return gVar2;
        }
        xi1.h hVar = new xi1.h();
        this.f74798g = hVar;
        return hVar;
    }

    public final void h0() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var;
        iz5.a.d(null, this.N);
        this.N.f425432a.s(u81.u.ON_RESET_TO_TOP_OF_STACK, null);
        xi1.g windowAndroid = getWindowAndroid();
        if (windowAndroid != null) {
            if (windowAndroid instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                r0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.r0) windowAndroid;
            } else if (windowAndroid instanceof xi1.q) {
                xi1.g gVar = ((xi1.q) windowAndroid).f454713d;
                if (gVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                    r0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.r0) gVar;
                }
            }
            if (r0Var == null && this.V && r0Var.D()) {
                K("dispatchResetToTopOfStack runtime isResumed but activity already paused and stopped?:%b, dispatchPause manually", java.lang.Boolean.valueOf(r0Var.E()));
                if (com.tencent.mm.plugin.appbrand.x0.d(this.f74803n) == com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM) {
                    com.tencent.mm.plugin.appbrand.x0.g(this.f74803n, com.tencent.mm.plugin.appbrand.w0.HIDE);
                }
                f0();
                if (r0Var.E()) {
                    this.N.f425432a.s(u81.u.ON_CONTAINER_ACTIVITY_STOPPED, null);
                    return;
                }
                return;
            }
            return;
        }
        r0Var = null;
        if (r0Var == null) {
        }
    }

    public void h1() {
    }

    public final void i0() {
        com.tencent.mm.plugin.appbrand.wd wdVar = this.E1;
        if (wdVar == null) {
            j0();
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = wdVar.f90957a;
        boolean z17 = appBrandRuntime.f74806p0;
        com.tencent.mm.plugin.appbrand.wc wcVar = wdVar.f90958b;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "dispatchResume for host:" + appBrandRuntime + ", willRelaunch");
            wdVar.a(wdVar.f90960d);
            ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o) wcVar).f74836a.j0();
            return;
        }
        com.tencent.mm.plugin.appbrand.td tdVar = wdVar.f90960d;
        boolean z18 = tdVar != null && tdVar.S1();
        com.tencent.mm.plugin.appbrand.td tdVar2 = wdVar.f90960d;
        boolean z19 = tdVar2 != null && tdVar2.D0();
        com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "dispatchResume for host:" + appBrandRuntime + ", embeddingPage:" + wdVar.f90960d + ", sticky:" + z18 + ", disableVisibilityEvent:" + z19);
        if (z18) {
            com.tencent.mm.plugin.appbrand.td tdVar3 = wdVar.f90960d;
            kotlin.jvm.internal.o.d(tdVar3);
            tdVar3.bringToFront();
        }
        if (!z19) {
            ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o) wcVar).f74836a.j0();
            return;
        }
        com.tencent.mm.plugin.appbrand.td tdVar4 = wdVar.f90960d;
        kotlin.jvm.internal.o.d(tdVar4);
        tdVar4.Yh();
    }

    public void i1() {
    }

    public final void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        if (L0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntime", "scheduleToUiThreadDelayed() but finished, stackTrace = %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e() && 0 == j17) {
            runnable.run();
        } else {
            this.f74799h.postDelayed(runnable, j17);
        }
    }

    public final void j0() {
        boolean z17;
        nf.b bVar = this.X;
        bVar.f336574a.removeCallbacks(bVar.f336575b);
        if (this.Y != null) {
            try {
                java.util.Iterator it = ((java.util.concurrent.LinkedBlockingDeque) this.Q1).iterator();
                while (it.hasNext()) {
                    if (it.next() == this.Y) {
                        it.remove();
                        this.Y = null;
                        z17 = true;
                        break;
                    }
                }
            } finally {
                this.Y = null;
            }
        }
        z17 = false;
        boolean J0 = J0();
        boolean z18 = this.V;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "dispatchResumeImpl(%s), initialized:%b, resumed:%b, pendingPauseRemoved:%b", this, java.lang.Boolean.valueOf(J0), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        if (!J0 || z18) {
            return;
        }
        K("onResume", new java.lang.Object[0]);
        if (L0() || this.Z) {
            if (this.Z && g1()) {
                return;
            }
            this.V = true;
            z1(null, "");
            return;
        }
        this.V = true;
        com.tencent.mm.plugin.appbrand.x0.g(this.f74803n, com.tencent.mm.plugin.appbrand.w0.HIDE);
        java.lang.String str = this.f74803n;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str);
            while (c17.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.v0) c17.next()).g();
            }
        }
        com.tencent.mm.plugin.appbrand.x0.f(this.f74803n, com.tencent.mm.plugin.appbrand.u0.ON_RESUME);
        G0(androidx.lifecycle.m.ON_START);
        G0(androidx.lifecycle.m.ON_RESUME);
        boolean z19 = this.f74806p0;
        if (!this.f74819y0) {
            this.f74809r.D();
        }
        this.N.f425432a.s(u81.u.TO_FOREGROUND, "onRuntimeResume");
        this.f74808q.m1(z19, this.f74819y0);
        r1();
        if (z19) {
            y1();
        } else if (this.f74819y0) {
            H1();
        } else {
            s1();
        }
        com.tencent.mm.plugin.appbrand.utils.r0 r0Var = this.M;
        r0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
        try {
            com.tencent.mm.sdk.platformtools.a5.a(com.tencent.mm.sdk.platformtools.x2.f193071a, r0Var.f90541b);
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", e17, "[NOT CRASH] resume set callback", new java.lang.Object[0]);
        }
        G1();
        this.Z = false;
        this.f74806p0 = false;
        this.f74816x0 = false;
        this.f74819y0 = false;
        com.tencent.mm.plugin.appbrand.jsapi.audio.f.b(this.f74808q);
    }

    public void j1() {
        K("StayPausedAndWaitForInitializationTimeout", new java.lang.Object[0]);
        l0();
    }

    public com.tencent.mm.plugin.appbrand.jsapi.h0 k(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        synchronized (this.K) {
            java.util.Iterator it = this.K.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var = (com.tencent.mm.plugin.appbrand.jsapi.h0) it.next();
                if (cls.isInstance(h0Var)) {
                    return h0Var;
                }
            }
            return null;
        }
    }

    public void k0(java.lang.Object obj) {
    }

    public void k1() {
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f74802m.keep(aVar);
    }

    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        synchronized (this.K) {
            this.K.add(h0Var);
        }
        return true;
    }

    public void l0() {
        if (L0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntime", "finish but destroyed, appId[%s]", this.f74803n);
        } else {
            this.S = true;
            m(new com.tencent.mm.plugin.appbrand.j2(this));
        }
    }

    public void l1(com.tencent.mm.plugin.appbrand.e9 e9Var) {
    }

    public final void m(java.lang.Runnable runnable) {
        j(runnable, 0L);
    }

    public k91.r m0() {
        return (k91.r) p0(k91.r.class, false);
    }

    public void m1() {
        this.f74808q.getF147808e().evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.log('xxx ntrans ntrans_init_service start'); }\n", null);
        this.f74808q.getF147808e().evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.serviceId = ntrans.id; }\n", null);
    }

    public final java.lang.String n0() {
        return u0() == null ? "" : u0().f77279e;
    }

    public void n1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, java.lang.Object obj) {
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.n2
    public void n2(im5.a aVar) {
        this.f74802m.n2(aVar);
    }

    public final void o(java.lang.Runnable runnable) {
        if (runnable == null || L0()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.j3 a17 = com.tencent.mm.plugin.appbrand.utils.j3.a(this.f74802m, runnable);
        keep(a17);
        ((ku5.t0) ku5.t0.f312615d).k(a17, 0L);
    }

    public com.tencent.mm.plugin.appbrand.jsapi.g0 o1(java.lang.Class cls) {
        return null;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.g0 p0(java.lang.Class cls, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.E;
        java.util.Iterator descendingIterator = concurrentLinkedDeque.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                g0Var = null;
                break;
            }
            g0Var = (com.tencent.mm.plugin.appbrand.jsapi.g0) descendingIterator.next();
            if (cls.isInstance(g0Var)) {
                break;
            }
        }
        if (g0Var == null && (g0Var = o1(cls)) != null) {
            concurrentLinkedDeque.add(g0Var);
        }
        if (g0Var != null || !z17) {
            return g0Var;
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var2 = (com.tencent.mm.plugin.appbrand.jsapi.g0) new d56.b(cls, cls).c().f226632b;
            if (g0Var2 != null) {
                try {
                    concurrentLinkedDeque.add(g0Var2);
                } catch (java.lang.Exception unused) {
                    g0Var = g0Var2;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "Make sure %s has default constructor", cls.getName());
                    return g0Var;
                }
            }
            return g0Var2;
        } catch (java.lang.Exception unused2) {
        }
    }

    public lm0.a p1(java.lang.Class cls) {
        return null;
    }

    public void q1() {
        this.H.b();
    }

    public final android.app.Activity r0() {
        return q75.a.a(this.f74795d);
    }

    public void r1() {
    }

    public com.tencent.mm.plugin.appbrand.page.ud s0() {
        return null;
    }

    public void s1() {
    }

    public java.lang.String t0() {
        return this.f74805p == null ? "" : com.tencent.mm.sdk.platformtools.t8.K0(this.f74805p.f77283i) ? m0() == null ? "" : m0().b() : this.f74805p.f77283i;
    }

    public void t1() {
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "[AppBrandRuntime::%s::%s::%d::@%d]", this.f74803n, n0(), java.lang.Integer.valueOf(this.f74805p.f77281g), java.lang.Integer.valueOf(hashCode()));
    }

    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u0() {
        return this.f74805p;
    }

    public void u1() {
    }

    public boolean v0() {
        return false;
    }

    public java.util.Iterator v1() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f74797f;
        for (int size = linkedList2.size() - 1; size >= 0; size--) {
            com.tencent.mm.plugin.appbrand.page.i3 i3Var = ((com.tencent.mm.plugin.appbrand.z5) linkedList2.get(size)).f92445b;
            if (i3Var != null) {
                linkedList.add(i3Var);
            }
        }
        return new com.tencent.mm.plugin.appbrand.z2(this, linkedList);
    }

    public com.tencent.mm.plugin.appbrand.widget.k0 w0() {
        if (this.U1 == null) {
            this.U1 = new com.tencent.mm.plugin.appbrand.widget.k0();
        }
        return this.U1;
    }

    public final void w1(com.tencent.mm.plugin.appbrand.g3 g3Var) {
        this.K1.add(g3Var);
    }

    public com.tencent.mm.plugin.appbrand.page.i3 x0() {
        return this.f74809r;
    }

    public final void x1(java.lang.Class cls, lm0.a aVar) {
        com.tencent.mm.plugin.appbrand.ha haVar = this.L;
        haVar.getClass();
        haVar.a(cls, new lm0.f(aVar));
    }

    public final int y0() {
        java.util.LinkedList linkedList = this.f74797f;
        int i17 = 0;
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            com.tencent.mm.plugin.appbrand.page.i3 i3Var = ((com.tencent.mm.plugin.appbrand.z5) linkedList.get(size)).f92445b;
            if (i3Var != null) {
                i17 += i3Var.getPageCount();
            }
        }
        return i17;
    }

    public void y1() {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f74809r;
        java.lang.String t07 = t0();
        i3Var.getClass();
        i3Var.c0(new com.tencent.mm.plugin.appbrand.page.l4(i3Var, t07, true, null));
    }

    public com.tencent.mm.plugin.appbrand.pip.o0 z0() {
        if (x0() == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.B1;
        if (o0Var != null) {
            return o0Var;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = new com.tencent.mm.plugin.appbrand.pip.o0(this.f74795d, this, new com.tencent.mm.plugin.appbrand.AppBrandRuntime$$a(this));
        this.B1 = o0Var2;
        return o0Var2;
    }

    public void z1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig, java.lang.String str) {
        if (!this.V && (initConfig == null || !initConfig.f77291t)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "reload but !isResumed, destroy and update config, appId:%s, reason:%s", this.f74803n, str);
            d0();
            if (initConfig != null) {
                this.f74805p = initConfig;
                if (this.f74797f.isEmpty()) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f74797f.getLast();
                z5Var.getClass();
                kotlin.jvm.internal.o.g(initConfig, "initConfig");
                z5Var.f92446c = initConfig;
                return;
            }
            return;
        }
        this.f74816x0 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "reload --START-- appId:%s, reason:%s stacktrace=%s", this.f74803n, str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        T1();
        f0();
        d0();
        O1(hcVar);
        if (initConfig == null) {
            initConfig = u0();
        }
        I0(initConfig);
        if (hcVar != null) {
            hcVar.l(this);
        }
        X0();
        this.f74816x0 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "reload --END-- appId:%s", this.f74803n);
    }
}
