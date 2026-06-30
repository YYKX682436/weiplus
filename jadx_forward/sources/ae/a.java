package ae;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 implements ae.q {
    public qe.m0 A;
    public qe.f0 B;
    public qe.d1 C;
    public qe.m D;
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public yd.u G;
    public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback H;
    public int I;
    public qe.f V;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f84864u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84865v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 f84866w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n1 f84867x;

    /* renamed from: y, reason: collision with root package name */
    public ud.b f84868y;

    /* renamed from: z, reason: collision with root package name */
    public qe.s0 f84869z;

    public a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        super(yVar);
        this.f84864u = false;
        this.f84865v = false;
        this.f84866w = null;
        this.f84868y = null;
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = null;
        this.H = null;
        this.I = 0;
        G(ae.q.class, this);
        M0();
    }

    public ud.b A0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        return new ae.f(this, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50352x76847179(), tVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0
    public void B(java.lang.String str) {
        r45.n47 n47Var = new r45.n47();
        n47Var.f462611e = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).V0().mo50260x9f1221c2();
        n47Var.f462610d = str;
        this.f84866w.a0(n47Var, "domEvent");
    }

    public final void B0() {
        java.lang.String str;
        if (this.f84865v) {
            return;
        }
        this.f84865v = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "Inject WAGame to MainContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), null, E0(), new ae.j(this));
        ae.l C0 = C0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) F(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(778L, 13L, 1L, false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean H0 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).H0();
        java.lang.String str2 = C0.f84890b;
        int length = str2 == null ? 0 : str2.length();
        ze.n t37 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).t3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.LIB;
        if (t37 == null || !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).t3().s2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            java.lang.String str3 = C0.f84889a;
            java.lang.String str4 = C0.f84891c;
            java.lang.String str5 = C0.f84892d;
            int H02 = H0();
            java.lang.String str6 = C0.f84890b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.h(e9Var, mo50357xcd94f799, str3, str4, str5, H02, str6, i3Var, new ae.c(this, C0.f84889a, str6, currentTimeMillis, length, H0));
            return;
        }
        java.lang.String M = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).x().M("WAServiceRemoteDebug.js");
        if (android.text.TextUtils.isEmpty(M)) {
            str = "";
        } else {
            str = M + ";";
        }
        C0.f84890b = str + ";(function(global) { var protectedConsole = global.console; Object.defineProperty(global, 'console', { get() { return protectedConsole; }, set() { } }); })(this);" + C0.f84890b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f7992 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
        java.lang.String str7 = C0.f84889a;
        java.lang.String str8 = C0.f84890b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.i(e9Var2, mo50357xcd94f7992, str7, str8, i3Var, new ae.c(this, str7, str8, currentTimeMillis, length, H0));
    }

    public ae.l C0() {
        ae.l lVar = new ae.l();
        lVar.f84889a = "WAGame.js";
        lVar.f84890b = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).x().M("WAGame.js");
        lVar.f84891c = "WAGame.js";
        lVar.f84892d = org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V + ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).x().i();
        return lVar;
    }

    public java.lang.String D0() {
        return null;
    }

    public java.lang.String E0() {
        return ik1.f.e("wxa_library/android.js") + ik1.f.e("wxa_library/shared_buffer.js") + ik1.f.e("wxa_library/lazy_load.js") + ik1.f.e("wxa_library/puppet_wrapper.js") + ik1.f.e("wxa_library/NativeGlobal-WAGame.js");
    }

    /* renamed from: F0, reason: collision with other method in class */
    public boolean mo180100F0() {
        return false;
    }

    public ae.v G0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        return new ae.v(yVar, j0Var);
    }

    public int H0() {
        return 0;
    }

    public boolean I0() {
        return true;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void J() {
        super.J();
        if (S() != null && S().s2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.f(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
        java.util.Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it.next();
            ae.p pVar = (ae.p) concurrentHashMap.get(num);
            if (pVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t V = V(num.intValue());
                ud.b bVar = pVar.f84897a;
                if (bVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "destroy worker's magicbrush");
                    bVar.b();
                }
                qe.s0 s0Var = pVar.f84898b;
                if (s0Var != null) {
                    s0Var.b(V);
                }
                qe.m0 m0Var = pVar.f84899c;
                if (m0Var != null) {
                    m0Var.b(V);
                }
                qe.f0 f0Var = pVar.f84900d;
                if (f0Var != null) {
                    f0Var.b(V);
                }
                qe.d1 d1Var = pVar.f84901e;
                if (d1Var != null) {
                    d1Var.b(V);
                }
                qe.m mVar = pVar.f84902f;
                if (mVar != null) {
                    mVar.b(V);
                }
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = pVar.f84903g;
                if (c3932x19b83abd != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "destroy worker's wxaudio");
                    c3932x19b83abd.m32191x2b6bd5ea(V);
                }
            }
        }
        ud.b bVar2 = this.f84868y;
        if (bVar2 != null) {
            bVar2.b();
        }
        qe.s0 s0Var2 = this.f84869z;
        if (s0Var2 != null) {
            s0Var2.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        qe.m0 m0Var2 = this.A;
        if (m0Var2 != null) {
            m0Var2.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        qe.f0 f0Var2 = this.B;
        if (f0Var2 != null) {
            f0Var2.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        qe.d1 d1Var2 = this.C;
        if (d1Var2 != null) {
            d1Var2.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        qe.m mVar2 = this.D;
        if (mVar2 != null) {
            mVar2.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        qe.f fVar = this.V;
        if (fVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h07 = jsRuntime.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getAddon(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) h07).d0(new qe.b(fVar));
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd2 = this.E;
        if (c3932x19b83abd2 != null) {
            c3932x19b83abd2.m32191x2b6bd5ea(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback = this.H;
        if (cronetTaskNetworkStateCallback != null) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37948x9abc0c0e(cronetTaskNetworkStateCallback);
        }
        if (S() == null || !S().b2()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) F();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r> w07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0.class))).w0(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) w07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s, contexts.size:%d", N(), java.lang.Integer.valueOf(linkedList.size()));
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(linkedList.size());
        for (final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar : w07) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).mo14660x738236e6("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new android.webkit.ValueCallback() { // from class: ae.a$$a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y.this, rVar, (java.lang.String) obj);
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await failed:%s", N(), e17);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await end", N());
        }
    }

    public void J0(boolean z17, java.lang.String str, cl.k1 k1Var) {
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "createJsRuntime");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t y07 = y0(D0(), null);
        ae.v G0 = G0((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0) y07.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0.class));
        y07.mo14673x29497b66(new ae.b(this));
        G0.getClass();
        y07.mo14658x74041feb(G0, "WeixinJSContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(y07, null, "(function(global) {\n    let loadJsFilesWithOptions = global.WeixinJSContext.loadJsFilesWithOptions\n    global.WeixinJSContext.loadJsFiles = function(contextId, paths, options) {\n        if (!options) {\n            options = '{}'\n        } else if (typeof options !== 'string') {\n            options = JSON.stringify(options)\n        }\n        loadJsFilesWithOptions(contextId, paths, options)\n    }\n})(this);", new ae.t(G0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(y07, null, java.lang.String.format(";(function(){let interface = %s;let alloc = interface.alloc;let allocNativeGlobal = interface.allocNativeGlobal;interface.alloc = function(injectNativeGlobal) {if(injectNativeGlobal){return allocNativeGlobal();}else{return alloc();}}})();", "WeixinJSContext"), new ae.u(G0));
        G0.u();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "[damonlei] createJsRuntime cost [%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return y07;
    }

    public void K0(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0
    public java.lang.String L() {
        org.json.JSONObject U0 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).U0();
        return java.lang.String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", U0.toString(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).t3().m0().f387269J);
    }

    public void L0(int i17) {
    }

    public void M0() {
        new wd.k().b();
    }

    public final void N0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            if (mo50357xcd94f799 == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
                return;
            }
            f0Var.C(-8);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AppBrandGameServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    public boolean O0() {
        return true;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void W() {
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).t3() == null || !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).t3().s2()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ae.k(this));
        com.p159x477cd522.p160x333422.V8.m16095xe4a31946(java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
        if (wVar != null) {
            cl.q0 n07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f124257b).h(new cl.z0(n07, "xdebug", true), false);
        }
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).G0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.e(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).b1());
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean c0() {
        return true;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public boolean d0(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad;
        if (i17 == 0) {
            c4209xd2d3ddad = w();
        } else {
            ae.p pVar = (ae.p) this.F.get(java.lang.Integer.valueOf(i17));
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "lazyInitModule invalid workerId %d", java.lang.Integer.valueOf(i17));
                return false;
            }
            c4209xd2d3ddad = pVar.f84897a.f508102c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        }
        if ("Image".equals(str) || "OffscreenCanvas".equals(str) || "MediaToolKit".equals(str) || "Profiler".equals(str)) {
            return true;
        }
        boolean equals = "Box2D".equals(str);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.s1 s1Var = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.f129073a;
        if (equals) {
            if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FLAVOR_RED", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274657t.a("FEATURE_ID")) || s1Var.b("libmmbox2d_v8_13_2", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "ilinkres_ae0cf48a"))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmbox2d.so download fail");
                return false;
            }
            int i18 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
            c4209xd2d3ddad.t("mmbox2d");
            return true;
        }
        if (!"Phys3D".equals(str)) {
            return super.d0(i17, str, jSONObject);
        }
        if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FLAVOR_RED", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274657t.a("FEATURE_ID")) || s1Var.b("libmmphysx_v8_13_2", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "ilinkres_ae0cf48a"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmphysx.so download fail");
            return false;
        }
        int i19 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
        c4209xd2d3ddad.t("mmphysx");
        return true;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void g0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.init");
        this.f84864u = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl mServiceReady = [%b], isRunning[%b]", java.lang.Boolean.valueOf(this.f84864u), java.lang.Boolean.valueOf(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50262x39e05d35()));
        if (this.f84864u && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50262x39e05d35()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl start");
                if (!this.f84865v) {
                    ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799().mo14660x738236e6(ik1.f.e("wxa_library/android.js"), null);
                }
                ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).d1();
                B0();
                ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).m(new ae.i(this));
            } catch (java.lang.NullPointerException e17) {
                if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50262x39e05d35()) {
                    throw e17;
                }
            }
        }
    }

    @Override // ae.r
    public int h() {
        return this.I;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void i0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "start preload");
        z0();
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).m0();
        B0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppService preloaded.");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void j0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        super.j0();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            if (mo50357xcd94f799 == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
                return;
            }
            f0Var.C(10);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AppBrandGameServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void k0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "onRuntimeResume");
        super.k0();
        N0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f84866w;
        if (g1Var != null) {
            g1Var.f159289m.bringToFront();
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void l0(int i17, long j17, long j18, long j19) {
        super.l0(i17, j17, j18, j19);
        if (this.F.containsKey(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.RuntimeException("workerId already exists");
        }
        ae.p pVar = new ae.p(this, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t V = V(i17);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd(true);
        c3932x19b83abd.m32190x259eeb6c(V, F());
        c3932x19b83abd.m32192x778e78c3(V, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        c3932x19b83abd.m32193x47569943(F());
        qe.s0 s0Var = new qe.s0();
        s0Var.a(V, F());
        qe.m0 m0Var = new qe.m0();
        m0Var.a(V, F());
        qe.f0 f0Var = new qe.f0();
        f0Var.a(V, F(), 1004);
        if (I0()) {
            qe.m mVar = new qe.m();
            mVar.c(V);
            pVar.f84902f = mVar;
        } else {
            qe.d1 d1Var = new qe.d1();
            d1Var.a(V, F(), 1);
            pVar.f84901e = d1Var;
        }
        pVar.f84903g = c3932x19b83abd;
        pVar.f84898b = s0Var;
        pVar.f84899c = m0Var;
        pVar.f84900d = f0Var;
        final ud.b A0 = A0(false, V);
        A0.a();
        int i18 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = A0.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        c4209xd2d3ddad.f();
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = A0.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad2);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad3 = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad3);
        c4209xd2d3ddad2.f130112c = c4209xd2d3ddad3;
        ae.m mVar2 = new ae.m(this, null);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad4 = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad4);
        c4209xd2d3ddad4.f130122m.c(new yz5.l() { // from class: ae.a$$b
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad5 = ud.b.this.f508102c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad5);
                c4209xd2d3ddad5.f130122m.a((yg.y) obj);
                return jz5.f0.f384359a;
            }
        });
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad5 = A0.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad5);
        c4209xd2d3ddad5.f130121l.a(mVar2);
        pVar.f84897a = A0;
        this.F.put(java.lang.Integer.valueOf(i17), pVar);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "onWorkerDestroyed %d", java.lang.Integer.valueOf(i17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
        ae.p pVar = (ae.p) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            throw new java.lang.RuntimeException("workerId not exists");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t V = V(i17);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = pVar.f84903g;
        if (c3932x19b83abd != null) {
            c3932x19b83abd.m32191x2b6bd5ea(V);
        }
        ud.b bVar = pVar.f84897a;
        if (bVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "onWorkerDestroyed magicbrush %d", java.lang.Integer.valueOf(i17));
            bVar.b();
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        super.m0(i17);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void n0() {
        super.n0();
        ud.b bVar = this.f84868y;
        if (bVar != null) {
            bVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrush", "awaitDestroyDone");
            if (!bVar.f508104e.a(5000L)) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f84866w;
        if (g1Var != null) {
            g1Var.mo14659x5cd39ffa();
        }
        yd.u uVar = this.G;
        if (uVar != null) {
            uVar.f542501d = 2;
            uVar.f542504g.f362190a.clear();
            uVar.f542503f = null;
            if (uVar.f542500c != null) {
                uVar.f542500c.f542472a.mo158326x5cd39ffa();
                uVar.f542500c = null;
            }
            yd.n nVar = uVar.f542499b;
            if (nVar != null) {
                nVar.f542491m.d();
                nVar.f542490i = null;
                ((java.util.ArrayList) nVar.f542488g).clear();
                uVar.f542499b = null;
            }
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void o0() {
        super.o0();
        qe.s0 s0Var = new qe.s0();
        this.f84869z = s0Var;
        s0Var.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), F());
        qe.m0 m0Var = new qe.m0();
        this.A = m0Var;
        m0Var.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), F());
        qe.f0 f0Var = new qe.f0();
        this.B = f0Var;
        f0Var.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), F(), 1004);
        if (I0()) {
            qe.m mVar = new qe.m();
            this.D = mVar;
            mVar.c(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        } else {
            qe.d1 d1Var = new qe.d1();
            this.C = d1Var;
            d1Var.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), F(), 1);
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd(true);
        this.E = c3932x19b83abd;
        c3932x19b83abd.m32190x259eeb6c(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), F());
        if (mo180100F0()) {
            qe.f fVar = new qe.f();
            this.V = fVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) jsRuntime.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)).k0(new qe.e(jsRuntime, fVar));
        }
        if (S() == null || !S().s2()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "add MPRemoteDebugJSContextInterface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n1 n1Var = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n1((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F());
        this.f84867x = n1Var;
        mo50357xcd94f799.mo14658x74041feb(n1Var, "DebuggerConnection");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f84866w;
        if (g1Var != null) {
            this.f84867x.f129034a = g1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        if (u46.a.a(new int[]{0, 1}, ((android.view.WindowManager) b3.l.m9714xac92a5d0(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) r0.mo48803xee5260a9()).f169178d, android.view.WindowManager.class)).getDefaultDisplay().getRotation()) == (xi1.o.d(r0.m0().f387281r.f387083a) == xi1.o.PORTRAIT)) goto L18;
     */
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.a.p0(org.json.JSONObject):void");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0
    public void q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        super.q0(runtime);
        z0();
        ud.b bVar = this.f84868y;
        if (bVar != null) {
            bVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            bVar.c(runtime);
            int i17 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
        }
        qe.d1 d1Var = this.C;
        if (d1Var != null) {
            d1Var.c(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        }
        qe.m mVar = this.D;
        if (mVar != null) {
            mVar.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        }
        qe.f0 f0Var = this.B;
        if (f0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l F = F();
            f0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep");
            if (mo50357xcd94f799 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsruntime is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
                if (f0Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsThreadHandler is null");
                } else {
                    f0Var2.mo51545x3498a0(new qe.c0(f0Var, F));
                }
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = this.E;
        if (c3932x19b83abd != null) {
            c3932x19b83abd.m32192x778e78c3(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        }
        qe.f fVar = this.V;
        if (fVar != null) {
            fVar.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F());
        }
        N0();
        runtime.x1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd.class, new ge.a(runtime));
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = w();
        w17.f130123n.m34844x631e2776(new ae.d(this));
        this.E.m32193x47569943(F());
        this.H = new ae.e(this);
        fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37940xb2713b6b(this.H);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37955xf6319bac(j62.e.g().i("clicfg_android_cronet_weak_net_notify_interval", 5000, true, true));
    }

    @Override // ae.r
    public void s(int i17) {
        this.I = i17;
    }

    @Override // ae.r
    public com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w() {
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        return c4209xd2d3ddad;
    }

    public void x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b bVar) {
    }

    @Override // ph1.s
    public final boolean y(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: do nothing in game service when called from modularizing helper");
        return false;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t y0(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0 = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0(str, bArr);
        c5138xafbea1a0.f135482g = true;
        c5138xafbea1a0.f135481f = "1";
        c5138xafbea1a0.f135484i = true;
        c5138xafbea1a0.f135489n = new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) F());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f(c5138xafbea1a0);
    }

    public final void z0() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f84868y != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "setup magicbrush. loaded?[%b]", objArr);
        if (this.f84868y != null) {
            return;
        }
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).n0();
        ud.b A0 = A0(O0(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) F()).mo50357xcd94f799());
        this.f84868y = A0;
        A0.a();
        ae.m mVar = new ae.m(this, null);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        c4209xd2d3ddad.f130122m.a(mVar);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad2);
        c4209xd2d3ddad2.f130121l.a(mVar);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad3 = this.f84868y.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad3);
        c4209xd2d3ddad3.f130123n.m34843x162a7075(new ae.g(this));
        ae.h hVar = new ae.h(this);
        ah.d.f86246b = hVar;
        g8.c.f350941a = new ah.b(hVar);
    }

    public yd.u F0() {
        if (this.G == null) {
            synchronized (this) {
                if (this.G == null) {
                    this.G = new yd.u();
                }
            }
        }
        return this.G;
    }
}
