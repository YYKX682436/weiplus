package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public abstract class f implements com.tencent.luggage.sdk.jsapi.component.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.y f47406d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.j0 f47407e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.e1 f47408f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f47409g = new android.util.SparseIntArray();

    public f(com.tencent.luggage.sdk.jsapi.component.service.y env, com.tencent.mm.plugin.appbrand.jsruntime.j0 contextManager) {
        this.f47406d = env;
        this.f47407e = contextManager;
        jz5.g gVar = com.tencent.luggage.sdk.jsapi.component.service.h1.f47438a;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(contextManager, "contextManager");
        this.f47408f = ((java.lang.Boolean) ((jz5.n) com.tencent.luggage.sdk.jsapi.component.service.h1.f47438a).getValue()).booleanValue() ? new com.tencent.luggage.sdk.jsapi.component.service.k1(env, contextManager) : new com.tencent.luggage.sdk.jsapi.component.service.f1(contextManager);
    }

    public void A(java.lang.String str) {
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.r a() {
        com.tencent.mm.plugin.appbrand.jsruntime.r t07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).t0();
        i(t07);
        l(t07, null);
        return t07;
    }

    @android.webkit.JavascriptInterface
    public final int alloc() {
        int allocEmpty = allocEmpty();
        if (allocEmpty <= 0) {
            return allocEmpty;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.r x07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(allocEmpty);
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc get NULL LibReader, id[%d], appId[%s]", java.lang.Integer.valueOf(allocEmpty), yVar.getAppId());
            return 0;
        }
        java.lang.String g17 = g();
        x(allocEmpty, g17);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(g17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                android.util.Pair j17 = j(x07, g(), x17);
                arrayList2.add((java.lang.Boolean) j17.first);
                arrayList3.add((cl.k1) j17.second);
                w(allocEmpty, arrayList, currentTimeMillis, arrayList2, arrayList3);
                return x07.o();
            } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused) {
                A(g());
                w(allocEmpty, arrayList, currentTimeMillis, arrayList2, arrayList3);
                return 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e17, "alloc::injectSdkScript::" + g(), new java.lang.Object[0]);
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.lang.Throwable th6) {
            w(allocEmpty, arrayList, currentTimeMillis, arrayList2, arrayList3);
            throw th6;
        }
    }

    @android.webkit.JavascriptInterface
    public final int allocEmpty() {
        boolean z17 = false;
        try {
            p();
            com.tencent.mm.plugin.appbrand.jsruntime.r a17 = a();
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", yVar.getAppId());
                o(false);
                return -2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", java.lang.Integer.valueOf(a17.o()));
            a17.setJsExceptionHandler(new com.tencent.luggage.sdk.jsapi.component.service.g(this, a17));
            this.f47408f.a(a17);
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) a17).evaluateJavascript(java.lang.String.format(java.util.Locale.US, "var __wxConfig = %s;", yVar.A0().toString()), null);
            try {
                int o17 = a17.o();
                o(true);
                return o17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = true;
                o(z17);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @android.webkit.JavascriptInterface
    public int allocFromSnapshot(final java.lang.String str, int i17) {
        boolean z17 = false;
        try {
            r(str, i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "allocFromSnapshot, contextName: %s, snapshotContextIndex: %d", str, java.lang.Integer.valueOf(i17));
            final com.tencent.mm.plugin.appbrand.jsruntime.r b17 = b(str, i17);
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", yVar.getAppId());
                q(str, i17, false);
                return -2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", java.lang.Integer.valueOf(b17.o()));
            b17.setJsExceptionHandler(new com.tencent.mm.plugin.appbrand.jsruntime.s() { // from class: com.tencent.luggage.sdk.jsapi.component.service.f$$a
                @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
                public final void a(java.lang.String str2, java.lang.String str3) {
                    com.tencent.luggage.sdk.jsapi.component.service.f fVar = com.tencent.luggage.sdk.jsapi.component.service.f.this;
                    fVar.getClass();
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: on exception! message: %s, stacktrace %s", str2, str3);
                    com.tencent.mm.plugin.appbrand.jsapi.lf.a(b17, "onError", java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str2), com.tencent.mm.plugin.appbrand.utils.w2.a(str3)), 0);
                    java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f354931a.f354932a).get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
                    if (list != null && list.size() > 0) {
                        android.support.v4.media.f.a(list.get(0));
                        throw null;
                    }
                    fVar.v(str, str2, str3);
                }
            });
            this.f47408f.a(b17);
            t(str, i17);
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) b17).evaluateJavascript(java.lang.String.format(java.util.Locale.US, ";globalThis.__wxConfig=%s;WeixinSnapshot.snapshotContextReady();", yVar.A0()), null);
            s(str, i17);
            try {
                int o17 = b17.o();
                q(str, i17, true);
                return o17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = true;
                q(str, i17, z17);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.r b(java.lang.String str, int i17) {
        java.lang.Object m17 = m(i17);
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).f83970h;
        int incrementAndGet = pVar.f84025b.incrementAndGet();
        cl.a aVar = (cl.a) ((com.tencent.mm.plugin.appbrand.jsruntime.d) pVar.f84024a).f83983a.f83968f;
        cl.q0 q0Var = new cl.q0(aVar, aVar.b(), new cl.g(aVar, incrementAndGet, i17));
        com.tencent.mm.plugin.appbrand.jsruntime.q qVar = new com.tencent.mm.plugin.appbrand.jsruntime.q(q0Var, incrementAndGet);
        if (q0Var.f() == null) {
            qVar = null;
        } else {
            synchronized (pVar.f84026c) {
                pVar.f84026c.put(incrementAndGet, qVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContextFromSnapshot id:%d, index: %d", java.lang.Integer.valueOf(incrementAndGet), java.lang.Integer.valueOf(i17));
        }
        if (qVar == null) {
            return null;
        }
        i(qVar);
        n(i17, m17);
        l(qVar, str);
        return qVar;
    }

    public void c(java.lang.String str, boolean z17, com.tencent.luggage.sdk.jsapi.component.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17, long j18) {
    }

    @android.webkit.JavascriptInterface
    public final int create(java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s)", yVar.getAppId(), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), nil appScriptPath", yVar.getAppId());
            return -1;
        }
        int alloc = alloc();
        if (alloc <= 0) {
            return alloc;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.r x07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(alloc);
        sj1.l.e(yVar.getAppId(), "public:inject", "代码注入-" + str);
        int evaluateScriptFile = evaluateScriptFile(alloc, str);
        sj1.l.g(yVar.getAppId());
        if (evaluateScriptFile != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), appScriptPath(%s), eval ret = %d", yVar.getAppId(), str, java.lang.Integer.valueOf(evaluateScriptFile));
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s), success with contextId(%d)", yVar.getAppId(), str, java.lang.Integer.valueOf(x07.o()));
        return x07.o();
    }

    public void d(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "beforeEvaluateScriptFile appId:%s, contextId:%d", yVar.getAppId(), java.lang.Integer.valueOf(rVar.o()));
    }

    @android.webkit.JavascriptInterface
    public final void destroy(int i17) {
        com.tencent.mm.plugin.appbrand.jsruntime.n nVar;
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).f83970h;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyJsContext id:%d", java.lang.Integer.valueOf(i17));
        synchronized (pVar.f84026c) {
            nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) pVar.f84026c.get(i17);
            pVar.f84026c.delete(i17);
        }
        if (nVar != null) {
            nVar.destroy();
        }
    }

    public int e() {
        return 1;
    }

    @android.webkit.JavascriptInterface
    public final int evaluateScriptFile(int i17, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d) appScriptPath(%s)", yVar.getAppId(), java.lang.Integer.valueOf(i17), str);
        iz5.a.g(null, i17 > 1);
        com.tencent.mm.plugin.appbrand.jsruntime.r x07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(i17);
        if (x07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), get null context", yVar.getAppId(), java.lang.Integer.valueOf(i17), str);
            return -1;
        }
        if (x07.l()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) scriptPath(%s), but want to inject main-context", yVar.getAppId(), str);
            return -1;
        }
        android.util.SparseIntArray sparseIntArray = this.f47409g;
        if (sparseIntArray.get(i17, 0) <= 0) {
            d(yVar, x07);
            sparseIntArray.put(i17, 1);
        }
        if (yVar.getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class) != null) {
            try {
                return k(x07, str) > 0 ? 1 : 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e17, "evaluateScriptFile::injectWxaScript::" + str, new java.lang.Object[0]);
                throw e17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, appID(%s) contextId(%s) scriptPath(%s)", yVar.getAppId(), java.lang.Integer.valueOf(i17), str);
        try {
            try {
                h(x07, str, f(yVar, str));
                return 1;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e18, "evaluateScriptFile::injectAppScript::" + str, new java.lang.Object[0]);
                throw e18;
            }
        } catch (com.tencent.mm.plugin.appbrand.appcache.t6 e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, with appID(%s) contextId(%d), appScriptPath(%s), %s", yVar.getAppId(), java.lang.Integer.valueOf(i17), str, e19.getMessage());
            return 0;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e27, "getSubContextAppScript", new java.lang.Object[0]);
            throw e27;
        }
    }

    public java.lang.String f(com.tencent.luggage.sdk.jsapi.component.service.y yVar, java.lang.String str) {
        java.lang.String p17 = com.tencent.mm.plugin.appbrand.appcache.la.p(yVar.t3(), str);
        if (android.text.TextUtils.isEmpty(p17)) {
            throw new com.tencent.mm.plugin.appbrand.appcache.t6(str);
        }
        return p17;
    }

    public abstract java.lang.String g();

    public final void h(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        ik1.b0 b0Var = new ik1.b0();
        sj1.l.e(this.f47406d.getComponentId() + "", "public:inject", "代码注入-" + str);
        ze.n t37 = this.f47406d.t3();
        java.lang.String str4 = str.replace('/', '_') + "_" + this.f47406d.getAppId();
        java.lang.String str5 = this.f47406d.t3().E0().f305852r.f75372md5;
        com.tencent.mm.plugin.appbrand.utils.i3 i3Var = com.tencent.mm.plugin.appbrand.utils.i3.USR;
        com.tencent.luggage.sdk.jsapi.component.service.j jVar = new com.tencent.luggage.sdk.jsapi.component.service.j(this, b0Var, pBool);
        if (t37 == null || t37.C0() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsValidationInjectorWC", "hy: runtime or service is null!");
        } else {
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.nf.a(t37, str, com.tencent.mm.plugin.appbrand.utils.e3.g(t37.C0(), i3Var));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mm.plugin.appbrand.utils.d3.b(rVar, null, a17, null);
            }
            com.tencent.mm.plugin.appbrand.utils.e3.h(t37.C0(), rVar, str, str4, str5, 0, str2, i3Var, jVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectAppScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b)", this.f47406d.getAppId(), java.lang.Integer.valueOf(rVar.o()), str, java.lang.Boolean.valueOf(pBool.value));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f47406d.getComponentId() + "");
        com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
        nVar.f47352i = str;
        nVar.f47353j = str3;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        nVar.f47354k = str3.length();
        z(nVar, pBool.value, currentTimeMillis, currentTimeMillis2, b0Var.f291824a);
    }

    public void i(com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        if (cl.q0.f42722l != null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) rVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        if (wVar == null || ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0().f42732j) {
            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) rVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
            com.tencent.luggage.sdk.jsapi.component.service.e O = yVar instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? yVar.A1().O() : null;
            if (l0Var == null || O == null) {
                return;
            }
            long L = l0Var.L();
            long G = l0Var.G();
            long z17 = l0Var.z();
            if (L == 0 || G == 0 || z17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectConsoleOnContextCreate: invalid ptrs [isolate=%d, ctx=%d, loop=%d], V8Context unavailable, skip", java.lang.Long.valueOf(L), java.lang.Long.valueOf(G), java.lang.Long.valueOf(z17));
            } else {
                O.f47398a.notifyBindConsoleTo(L, G, z17);
            }
        }
    }

    public final android.util.Pair j(final com.tencent.mm.plugin.appbrand.jsruntime.r rVar, final java.lang.String str, final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        com.tencent.mm.pointers.PLong pLong;
        ik1.b0 b0Var;
        com.tencent.mm.pointers.PBool pBool;
        java.lang.String str2;
        java.lang.String str3;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sj1.l.e(this.f47406d.getComponentId() + "", "public:inject", "代码注入-" + str);
        final com.tencent.mm.pointers.PBool pBool2 = new com.tencent.mm.pointers.PBool();
        final ik1.b0 b0Var2 = new ik1.b0();
        final com.tencent.mm.pointers.PLong pLong2 = new com.tencent.mm.pointers.PLong();
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.f$$b
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String str4 = str;
                com.tencent.mm.plugin.appbrand.jsruntime.r rVar2 = rVar;
                com.tencent.luggage.sdk.jsapi.component.service.f fVar = com.tencent.luggage.sdk.jsapi.component.service.f.this;
                fVar.getClass();
                java.lang.String d17 = ik1.f.d(iCommLibReader.a(str4));
                if (android.text.TextUtils.isEmpty(d17)) {
                    throw new com.tencent.mm.plugin.appbrand.appcache.t6(str4);
                }
                pLong2.value = d17.length();
                com.tencent.mm.plugin.appbrand.utils.e3.h(fVar.f47406d, rVar2, str4, str4, org.chromium.base.BaseSwitches.V + fVar.f47406d.x().getF90658d().pkgVersion(), fVar.e(), d17, com.tencent.mm.plugin.appbrand.utils.i3.LIB, new com.tencent.luggage.sdk.jsapi.component.service.l(fVar, b0Var2, pBool2));
                return null;
            }
        };
        android.content.res.AssetFileDescriptor G0 = y() ? iCommLibReader.G0(str) : null;
        if (G0 == null) {
            callable.call();
            pLong = pLong2;
            b0Var = b0Var2;
            pBool = pBool2;
            str2 = "";
            str3 = str;
        } else {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            pLong2.value = G0.getLength();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s", java.lang.Integer.valueOf(rVar.o()), str);
            pLong = pLong2;
            b0Var = b0Var2;
            pBool = pBool2;
            str2 = "";
            str3 = str;
            com.tencent.mm.plugin.appbrand.utils.e3.j(this.f47406d, rVar, str, str, org.chromium.base.BaseSwitches.V + this.f47406d.x().getF90658d().pkgVersion(), e(), G0, com.tencent.mm.plugin.appbrand.utils.i3.LIB, new com.tencent.luggage.sdk.jsapi.component.service.m(this, b0Var2, pBool2, rVar, str, pString));
            if (!pBool.value && "Abort for empty source".equals(pString.value)) {
                callable.call();
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f47406d.getComponentId() + str2);
        com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
        nVar.f47352i = str3;
        nVar.f47353j = null;
        nVar.f47354k = pLong.value;
        z(nVar, pBool.value, currentTimeMillis, currentTimeMillis2, b0Var.f291824a);
        return new android.util.Pair(java.lang.Boolean.valueOf(pBool.value), (cl.k1) b0Var.f291824a);
    }

    public int k(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sj1.l.e(this.f47406d.getComponentId() + "", "public:inject", "代码注入-" + str);
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(this.f47406d.t3(), false);
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript pkgListReader is null, err, appId(%s) scriptPath(%s)", this.f47406d.getAppId(), str);
            return 0;
        }
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = o17.openReadPartialInfo(str);
        if (openReadPartialInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript, scriptFileInfo is null, appId(%s) scriptPath(%s)", this.f47406d.getAppId(), str);
            return 0;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.utils.e3.b(this.f47406d, rVar, str, new java.lang.String[]{str}, new com.tencent.luggage.sdk.jsapi.component.service.k(this, pBool, b0Var, pInt));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b), entry(%s)", this.f47406d.getAppId(), java.lang.Integer.valueOf(rVar.o()), str, java.lang.Boolean.valueOf(pBool.value), java.lang.String.format(java.util.Locale.ENGLISH, "FileEntry{providerId:%s, appVersion:%d, appVersionStr:%s, fileName:%s, fileOffset:%d, fileLength:%d}", openReadPartialInfo.f76040a, java.lang.Integer.valueOf(openReadPartialInfo.f76041b), openReadPartialInfo.f76042c, openReadPartialInfo.f76045f, java.lang.Integer.valueOf(openReadPartialInfo.f76046g), java.lang.Integer.valueOf(openReadPartialInfo.f76047h)));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f47406d.getComponentId() + "");
        com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
        nVar.f47352i = str;
        nVar.f47353j = null;
        nVar.f47354k = pInt.value;
        nVar.f76040a = openReadPartialInfo.f76040a;
        nVar.f76041b = openReadPartialInfo.f76041b;
        z(nVar, pBool.value, currentTimeMillis, currentTimeMillis2, b0Var.f291824a);
        return pInt.value;
    }

    public final void l(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str) {
        if (rVar == null) {
            return;
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 A1 = this.f47406d.A1();
        if (A1.Y()) {
            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) rVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
            if (l0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextV8 is null");
                return;
            }
            com.tencent.luggage.sdk.jsapi.component.service.e O = A1.O();
            if (O == null) {
                return;
            }
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = O.f47398a;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "SubContext-" + rVar.o();
            }
            java.lang.String str2 = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextName: %s", str2);
            appBrandCommonBindingJni.notifyContextCreated(l0Var.L(), l0Var.G(), str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadJsFilesWithOptions(int r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.jsapi.component.service.f.loadJsFilesWithOptions(int, java.lang.String, java.lang.String):void");
    }

    @android.webkit.JavascriptInterface
    public void loadLibFiles(int i17, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        java.lang.StringBuilder sb6;
        org.json.JSONArray jSONArray;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17;
        com.tencent.luggage.sdk.jsapi.component.service.f fVar;
        int i18;
        java.util.ArrayList arrayList5;
        long j17;
        java.util.ArrayList arrayList6;
        java.util.ArrayList arrayList7;
        org.json.JSONArray jSONArray2;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        try {
            x(i17, str);
            sj1.l.e(yVar.getComponentId() + "", "public:inject", "代码注入-" + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles appId:%s, contextId:%d, paths:%s", yVar.getAppId(), java.lang.Integer.valueOf(i17), str);
            iz5.a.g(null, i17 >= 1);
            com.tencent.mm.plugin.appbrand.jsruntime.r x07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(i17);
            try {
                if (x07 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL context by id[%d], appId[%s]", java.lang.Integer.valueOf(i17), yVar.getAppId());
                    sb6 = new java.lang.StringBuilder();
                } else {
                    try {
                        jSONArray = new org.json.JSONArray(str);
                        x17 = yVar.x();
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles parse paths failed, id[%d] appId[%s] e=%s", java.lang.Integer.valueOf(i17), yVar.getAppId(), e17);
                        sb6 = new java.lang.StringBuilder();
                        sb6.append(yVar.getComponentId());
                    }
                    if (x17 != null) {
                        int length = jSONArray.length();
                        arrayList = new java.util.ArrayList(length);
                        try {
                            arrayList2 = new java.util.ArrayList(length);
                            try {
                                arrayList4 = new java.util.ArrayList(length);
                                int i19 = 0;
                                while (i19 < length) {
                                    try {
                                        arrayList2.add(z18);
                                        arrayList4.add(z18);
                                        java.lang.String optString = jSONArray.optString(i19);
                                        arrayList.add(optString);
                                        if (android.text.TextUtils.isEmpty(optString)) {
                                            jSONArray2 = jSONArray;
                                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY name by index[%d] id[%d] appId[%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), yVar.getAppId());
                                        } else {
                                            jSONArray2 = jSONArray;
                                            try {
                                                try {
                                                    java.util.Objects.requireNonNull(optString);
                                                    android.util.Pair j18 = j(x07, optString, x17);
                                                    arrayList2.set(i19, (java.lang.Boolean) j18.first);
                                                    arrayList4.set(i19, (cl.k1) j18.second);
                                                } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY script by name[%s] index[%d] id[%d] appId[%s]", optString, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), yVar.getAppId());
                                                }
                                            } catch (java.lang.Exception e18) {
                                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e18, "loadLibFiles::injectSdkScript::" + optString, new java.lang.Object[0]);
                                                throw new java.lang.RuntimeException(e18);
                                            }
                                        }
                                        i19++;
                                        jSONArray = jSONArray2;
                                        z18 = false;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        arrayList3 = arrayList;
                                        sj1.l.g(yVar.getComponentId() + "");
                                        w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                                        throw th;
                                    }
                                }
                                sj1.l.g(yVar.getComponentId() + "");
                                fVar = this;
                                i18 = i17;
                                arrayList5 = arrayList;
                                j17 = currentTimeMillis;
                                arrayList6 = arrayList2;
                                arrayList7 = arrayList4;
                                fVar.w(i18, arrayList5, j17, arrayList6, arrayList7);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                arrayList3 = arrayList;
                                arrayList4 = null;
                                sj1.l.g(yVar.getComponentId() + "");
                                w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                                throw th;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            arrayList2 = null;
                            arrayList3 = arrayList;
                            arrayList4 = null;
                            sj1.l.g(yVar.getComponentId() + "");
                            w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                            throw th;
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL LibReader, id[%d], appId[%s]", java.lang.Integer.valueOf(i17), yVar.getAppId());
                    sb6 = new java.lang.StringBuilder();
                }
                sb6.append(yVar.getComponentId());
                sb6.append("");
                sj1.l.g(sb6.toString());
                arrayList5 = null;
                fVar = this;
                i18 = i17;
                j17 = currentTimeMillis;
                arrayList6 = null;
                arrayList7 = null;
                fVar.w(i18, arrayList5, j17, arrayList6, arrayList7);
            } catch (java.lang.Throwable th9) {
                th = th9;
                arrayList3 = null;
                arrayList4 = null;
                arrayList2 = null;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            arrayList = null;
        }
    }

    public java.lang.Object m(int i17) {
        return null;
    }

    public void n(int i17, java.lang.Object obj) {
    }

    public void o(boolean z17) {
    }

    public void p() {
    }

    public void q(java.lang.String str, int i17, boolean z17) {
    }

    public void r(java.lang.String str, int i17) {
    }

    public void s(java.lang.String str, int i17) {
    }

    public void t(java.lang.String str, int i17) {
    }

    public void u() {
        this.f47408f.b();
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
    }

    public void x(int i17, java.lang.String str) {
    }

    public boolean y() {
        return true;
    }

    public void z(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }
}
