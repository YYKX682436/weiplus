package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class m implements com.tencent.mm.plugin.appbrand.jsapi.l {

    /* renamed from: f, reason: collision with root package name */
    public qu5.a f81576f;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.k f81578h;

    /* renamed from: q, reason: collision with root package name */
    public boolean f81584q;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.t[] f81574d = {null};

    /* renamed from: g, reason: collision with root package name */
    public final bm5.o f81577g = new bm5.o();

    /* renamed from: i, reason: collision with root package name */
    public final bm5.x0 f81579i = new bm5.x0(new com.tencent.mm.plugin.appbrand.jsapi.m$$c());

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f81580m = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.Cif f81583p = new com.tencent.mm.plugin.appbrand.jsapi.Cif();

    /* renamed from: r, reason: collision with root package name */
    public final android.util.SparseArray f81585r = new android.util.SparseArray(5);

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.i f81586s = new com.tencent.mm.plugin.appbrand.jsapi.r(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f81587t = false;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f81588u = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashSet f81581n = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.i0 f81575e = f0();

    /* renamed from: o, reason: collision with root package name */
    public final lm0.e f81582o = new lm0.e();

    public m() {
        com.tencent.mm.plugin.appbrand.jsapi.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.n(this);
        pd.c cVar = pd.e.f353437a;
        if (cVar != null) {
            cVar.a(nVar);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f81584q = false;
    }

    public static org.json.JSONObject c0(com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.lang.String str) {
        mVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return new org.json.JSONObject();
        }
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", e17.getMessage());
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        d0(i17, str, null);
    }

    public final boolean a0() {
        return this.f81584q;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        T t17;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f81580m;
        java.util.Iterator descendingIterator = concurrentLinkedDeque.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                t17 = null;
                break;
            }
            t17 = (T) descendingIterator.next();
            if (cls.isInstance(t17)) {
                break;
            }
        }
        if (t17 == null && (t17 = (T) t0(cls)) != null) {
            concurrentLinkedDeque.add(t17);
        }
        if (t17 != null) {
            return t17;
        }
        try {
            T t18 = (T) new d56.b(cls, cls).c().f226632b;
            if (t18 != null) {
                try {
                    r(t18);
                } catch (java.lang.Exception unused) {
                    t17 = t18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "Make sure %s has default constructor", cls.getName());
                    return t17;
                }
            }
            return t18;
        } catch (java.lang.Exception unused2) {
        }
    }

    public java.lang.String b0() {
        return "";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (c0Var == null) {
            c0Var = getJsRuntime();
        }
        com.tencent.mm.plugin.appbrand.jsapi.i iVar = this.f81586s;
        if (iVar != null) {
            return iVar.c(str, c0Var);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        e(str, str2, getComponentId());
    }

    public void d0(int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var2;
        if (c0Var == null) {
            synchronized (this.f81585r) {
                int indexOfKey = this.f81585r.indexOfKey(i17);
                if (indexOfKey >= 0) {
                    c0Var2 = (com.tencent.mm.plugin.appbrand.jsruntime.c0) this.f81585r.valueAt(indexOfKey);
                    this.f81585r.removeAt(indexOfKey);
                } else {
                    c0Var2 = null;
                }
            }
            c0Var = c0Var2 != null ? c0Var2 : getJsRuntime();
        }
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "callback but get NULL JsRuntime, callbackId:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!c(null, c0Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "callback but destroyed, callbackId %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "{}";
        }
        if (this.f81588u.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mm.plugin.appbrand.jsapi.k kVar = this.f81578h;
            if (kVar == null) {
                return;
            }
            kVar.d(i17, str);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.b0 b0Var = c0Var instanceof com.tencent.mm.plugin.appbrand.jsruntime.t ? (com.tencent.mm.plugin.appbrand.jsruntime.b0) ((com.tencent.mm.plugin.appbrand.jsruntime.t) c0Var).h0(com.tencent.mm.plugin.appbrand.jsruntime.b0.class) : null;
        if (b0Var != null) {
            com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) b0Var;
            ((cl.a) nVar.c0()).h(new com.tencent.mm.plugin.appbrand.jsruntime.l(nVar, i17, str, com.tencent.mm.plugin.appbrand.jsapi.jf.b(null)), false);
        } else {
            c0Var.evaluateJavascript(java.lang.String.format(java.util.Locale.US, "typeof %s !== 'undefined' && %s.invokeCallbackHandler(%d, %s, %s)", "WeixinJSCoreAndroid", "WeixinJSCoreAndroid", java.lang.Integer.valueOf(i17), str, com.tencent.mm.plugin.appbrand.jsapi.jf.b(null)), null);
        }
        com.tencent.mm.plugin.appbrand.jsapi.k kVar2 = this.f81578h;
        if (kVar2 == null) {
            return;
        }
        kVar2.d(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        if (s(str)) {
            com.tencent.mm.plugin.appbrand.jsapi.jf.a(getJsRuntime(), str, str2, i17, 0);
        }
    }

    public void e0(java.util.Map map) {
        map.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        java.util.Map map = (java.util.Map) this.f81577g.a();
        if (map != null) {
            return (com.tencent.mm.plugin.appbrand.jsapi.k0) map.get(str);
        }
        if (a0() && isRunning()) {
            throw null;
        }
        return null;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.i0 f0() {
        return new com.tencent.mm.plugin.appbrand.jsapi.i0(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final void g(java.lang.String str, java.lang.String str2) {
        e(str, str2, 0);
    }

    public abstract java.util.Map g0();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public abstract /* synthetic */ java.lang.String getAppId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public abstract /* synthetic */ u81.b getAppState();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final qu5.a getAsyncHandler() {
        return j0();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        return hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public abstract /* synthetic */ android.content.Context getContext();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "getDialogContainer return dummy impl");
        return fl1.g2.I0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "getFileSystem return dummy impl");
        return (com.tencent.mm.plugin.appbrand.appstorage.u1) this.f81579i.b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return this.f81578h;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return this.f81583p;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        com.tencent.mm.plugin.appbrand.jsruntime.t tVar;
        com.tencent.mm.plugin.appbrand.jsruntime.t[] tVarArr = this.f81574d;
        com.tencent.mm.plugin.appbrand.jsruntime.t tVar2 = tVarArr[0];
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (tVarArr) {
            tVar = this.f81574d[0];
        }
        return tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    public void h() {
        com.tencent.mm.plugin.appbrand.jsruntime.t tVar;
        qu5.a aVar = this.f81576f;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f81576f.getLooper().quit();
        }
        try {
            com.tencent.mm.plugin.appbrand.jsapi.i0 i0Var = this.f81575e;
            if (i0Var != null) {
                i0Var.f81295a = null;
            }
            this.f81575e = null;
            bm5.o oVar = this.f81577g;
            com.tencent.mm.plugin.appbrand.jsapi.m$$a m__a = new com.tencent.mm.plugin.appbrand.jsapi.m$$a(this);
            oVar.f22710c.set(true);
            final bm5.t tVar2 = (bm5.t) oVar.f22709b;
            java.lang.Object andUpdate = tVar2.f22734b.getAndUpdate(new java.util.function.UnaryOperator() { // from class: bm5.t$$a
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    bm5.t.this.f22733a.set(false);
                    return null;
                }
            });
            if (andUpdate != null) {
                e0((java.util.Map) andUpdate);
            } else {
                oVar.f22711d = m__a;
            }
            this.f81578h = com.tencent.mm.plugin.appbrand.jsapi.ef.f80811a;
            this.f81586s = com.tencent.mm.plugin.appbrand.jsapi.m1.f81593a;
            synchronized (this.f81574d) {
                com.tencent.mm.plugin.appbrand.jsruntime.t[] tVarArr = this.f81574d;
                tVar = tVarArr[0];
                tVarArr[0] = null;
            }
            if (tVar != null) {
                tVar.destroy();
            }
        } catch (java.lang.Throwable th6) {
            this.f81575e = null;
            throw th6;
        }
    }

    public boolean h0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        d(n5Var.k(), n5Var.o(), iArr);
    }

    public abstract com.tencent.mm.plugin.appbrand.jsruntime.t i0();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public abstract /* synthetic */ boolean isRunning();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
    }

    public final qu5.a j0() {
        if (this.f81576f == null) {
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("AppBrandAsyncJSThread", 5);
            a17.start();
            this.f81576f = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        }
        return this.f81576f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        synchronized (this.f81581n) {
            java.util.Iterator it = this.f81581n.iterator();
            while (it.hasNext()) {
                T t17 = (T) it.next();
                if (cls.isInstance(t17)) {
                    return t17;
                }
            }
            return null;
        }
    }

    public java.lang.String[] k0() {
        java.util.ArrayList arrayList = new java.util.ArrayList(500);
        java.util.Map map = (java.util.Map) this.f81577g.a();
        if (map == null) {
            if (a0() && isRunning()) {
                throw null;
            }
            return new java.lang.String[0];
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if ((entry.getValue() instanceof com.tencent.mm.plugin.appbrand.jsapi.f) && !((com.tencent.mm.plugin.appbrand.jsapi.f) entry.getValue()).z()) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        synchronized (this.f81581n) {
            this.f81581n.add(h0Var);
        }
        return true;
    }

    public void l0() {
        n0();
        m0();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
    }

    public final void m0() {
        final com.tencent.mm.plugin.appbrand.jsapi.m$$b m__b = new com.tencent.mm.plugin.appbrand.jsapi.m$$b(this);
        if (h0()) {
            final bm5.o oVar = this.f81577g;
            if (((bm5.t) oVar.f22709b).f22733a.get()) {
                return;
            }
            java.util.concurrent.Future[] futureArr = oVar.f22708a;
            if (futureArr[0] == null) {
                synchronized (futureArr) {
                    java.util.concurrent.Future[] futureArr2 = oVar.f22708a;
                    if (futureArr2[0] == null) {
                        futureArr2[0] = ((ku5.t0) ku5.t0.f312615d).c(new java.util.concurrent.Callable() { // from class: bm5.o$$a
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                                bm5.o oVar2 = bm5.o.this;
                                bm5.q qVar = m__b;
                                oVar2.getClass();
                                try {
                                    if (oVar2.f22710c.get()) {
                                        return null;
                                    }
                                    com.tencent.mm.plugin.appbrand.jsapi.m mVar = ((com.tencent.mm.plugin.appbrand.jsapi.m$$b) qVar).f81590a;
                                    mVar.getClass();
                                    try {
                                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(mVar.g0());
                                    } catch (java.lang.NullPointerException unused) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "!! get NULL jsApiPool when createJsApiPool() called, make sure your logic !!");
                                        concurrentHashMap = null;
                                    }
                                    if (!oVar2.f22710c.get()) {
                                        bm5.t tVar = (bm5.t) oVar2.f22709b;
                                        tVar.f22734b.getAndUpdate(new bm5.t$$b(tVar, concurrentHashMap));
                                        return concurrentHashMap;
                                    }
                                    if (concurrentHashMap == null || oVar2.f22711d == null) {
                                        return null;
                                    }
                                    ((com.tencent.mm.plugin.appbrand.jsapi.m$$a) oVar2.f22711d).f81589a.e0(concurrentHashMap);
                                    return null;
                                } catch (java.lang.Exception e17) {
                                    if ((e17 instanceof java.util.concurrent.CancellationException) || (e17 instanceof java.lang.InterruptedException)) {
                                        return null;
                                    }
                                    throw e17;
                                }
                            }
                        });
                    }
                }
                return;
            }
            return;
        }
        bm5.o oVar2 = this.f81577g;
        if (((bm5.t) oVar2.f22709b).f22733a.get()) {
            return;
        }
        java.util.concurrent.Future[] futureArr3 = oVar2.f22708a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
        if (futureArr3[0] != null) {
            synchronized (futureArr3) {
                java.util.concurrent.Future future = oVar2.f22708a[0];
                if (future != null) {
                    future.cancel(true);
                    oVar2.f22708a[0] = null;
                }
            }
        }
        bm5.s sVar = oVar2.f22709b;
        try {
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(g0());
        } catch (java.lang.NullPointerException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "!! get NULL jsApiPool when createJsApiPool() called, make sure your logic !!");
        }
        bm5.t tVar = (bm5.t) sVar;
        tVar.f22734b.getAndUpdate(new bm5.t$$b(tVar, concurrentHashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    public final void n0() {
        synchronized (this.f81574d) {
            com.tencent.mm.plugin.appbrand.jsruntime.t[] tVarArr = this.f81574d;
            if (tVarArr[0] == null) {
                tVarArr[0] = i0();
                this.f81574d[0].addJavascriptInterface(this.f81575e, "WeixinJSCore");
                if (!android.text.TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
                    this.f81574d[0].evaluateJavascript("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", null);
                }
                v0();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    public final java.lang.String o0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, android.os.Looper looper) {
        if (!c(k0Var.k(), c0Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invoke log[%s] api[%s], callbackId[%d], component not running", b0(), k0Var.k(), java.lang.Integer.valueOf(i17));
            return s0(k0Var.k(), "fail:interrupted");
        }
        com.tencent.mm.plugin.appbrand.jsapi.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.q(this, str, k0Var, str2, i17, c0Var, looper);
        com.tencent.mm.plugin.appbrand.jsapi.k kVar = this.f81578h;
        if (!(kVar != null && kVar.c(k0Var, str, str2, i17, qVar))) {
            qVar.a();
        }
        return !android.text.TextUtils.isEmpty(qVar.f83499a) ? qVar.f83499a : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public final void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        n5Var.p(this).m();
    }

    public final java.lang.String p0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        return q0(str, str2, str3, i17, false, null, -1);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        nd.b bVar = (nd.b) this.f81582o.b(cls);
        if (bVar != null || (bVar = nd.f.a(cls)) == null || cls.isAssignableFrom(bVar.getClass())) {
            return (T) bVar;
        }
        return null;
    }

    /* JADX WARN: Finally extract failed */
    public java.lang.String q0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, int i18) {
        java.lang.reflect.Field field;
        java.lang.String str4 = "";
        com.tencent.mm.plugin.appbrand.jsapi.k0 f17 = f(str);
        if (f17 == null) {
            a(i17, s0(str, "fail:not supported"));
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invokeHandler, api: %s not support", str);
            return "fail:not supported";
        }
        java.lang.System.currentTimeMillis();
        boolean z18 = f17 instanceof com.tencent.mm.plugin.appbrand.jsapi.f;
        b0();
        com.tencent.mm.plugin.appbrand.jsruntime.c0 jsRuntime = c0Var == null ? getJsRuntime() : c0Var;
        if (z18) {
            if (c0Var != null) {
                synchronized (this.f81585r) {
                    this.f81585r.put(i17, c0Var);
                }
            }
            if (!((com.tencent.mm.plugin.appbrand.jsapi.f) f17).z()) {
                if (z17) {
                    boolean z19 = true;
                    if (!this.f81587t) {
                        try {
                            try {
                                try {
                                    field = (java.lang.reflect.Field) d56.b.a(android.os.Looper.class.getField("sThreadLocal"));
                                } catch (java.lang.NoSuchFieldException e17) {
                                    java.lang.Class cls = android.os.Looper.class;
                                    do {
                                        try {
                                            field = (java.lang.reflect.Field) d56.b.a(cls.getDeclaredField("sThreadLocal"));
                                        } catch (java.lang.NoSuchFieldException unused) {
                                            cls = cls.getSuperclass();
                                            if (cls == null) {
                                                throw new d56.c(e17);
                                            }
                                        }
                                    } while (cls == null);
                                    throw new d56.c(e17);
                                }
                                field.getType();
                                java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) field.get(android.os.Looper.class);
                                if (threadLocal.get() == null) {
                                    threadLocal.set(getAsyncHandler().getLooper());
                                }
                                this.f81587t = true;
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                            } catch (java.lang.Exception e18) {
                                throw new d56.c(e18);
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "hookLooper, t=%s", th6);
                                if (this.f81587t) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                                }
                                z19 = false;
                            } catch (java.lang.Throwable th7) {
                                if (this.f81587t) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                                }
                                throw th7;
                            }
                        }
                    }
                    if (z19) {
                        this.f81583p.b(str, i18);
                        o0(f17, str2, str3, i17, jsRuntime, j0().getLooper());
                    }
                }
                com.tencent.mm.plugin.appbrand.jsapi.Cif cif = this.f81583p;
                synchronized (cif) {
                    if (!cif.f81317b) {
                        cif.f81318c.put(i17, java.lang.System.currentTimeMillis());
                    }
                }
                j0().post(new com.tencent.mm.plugin.appbrand.jsapi.o(this, i17, str, f17, str2, str3, i17, jsRuntime));
            } else {
                if (z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "hy: should be called in js thread but called in async thread");
                    return "";
                }
                o0(f17, str2, str3, i17, jsRuntime, null);
                str4 = "";
            }
        } else {
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "hy: is sync but called in async thread");
                return "";
            }
            str4 = o0(f17, str2, str3, i17, jsRuntime, null);
        }
        b0();
        java.lang.System.currentTimeMillis();
        return str4;
    }

    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
        this.f81580m.add(g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String r0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        try {
            if (k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.a1) {
                return k0Var.m() ? ((com.tencent.mm.plugin.appbrand.jsapi.a1) k0Var).A(this, jSONObject, c0Var) : ((com.tencent.mm.plugin.appbrand.jsapi.a1) k0Var).z(this, jSONObject);
            }
            if (!(k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.f)) {
                return "";
            }
            java.lang.String u07 = u0(k0Var, jSONObject);
            if (u07 == null) {
                if (k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.g) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.g) k0Var).h(new com.tencent.mm.plugin.appbrand.jsapi.ff(c0Var, this, jSONObject, jSONObject2, i17));
                } else if (k0Var.m()) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.f) k0Var).B(this, jSONObject, i17, c0Var);
                } else {
                    ((com.tencent.mm.plugin.appbrand.jsapi.f) k0Var).A(this, jSONObject, i17);
                }
            }
            return u07;
        } catch (java.lang.ClassCastException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandComponentImpl", e17, e17.getMessage(), new java.lang.Object[0]);
            return k0Var.o("fail:internal error invalid js component");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invokeTheJsApi with name[%s], get exception %s", k0Var, th6);
            throw th6;
        }
    }

    public final boolean s(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.i iVar = this.f81586s;
        if (iVar != null) {
            return iVar.c(str, getJsRuntime());
        }
        return true;
    }

    public java.lang.String s0(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str + ":" + str2);
        return new org.json.JSONObject(hashMap).toString();
    }

    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
        this.f81586s = iVar;
    }

    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
        this.f81578h = kVar;
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.g0 t0(java.lang.Class cls) {
        return null;
    }

    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
        this.f81580m.addAll(collection);
    }

    public final java.lang.String u0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, org.json.JSONObject jSONObject) {
        if (com.tencent.mm.plugin.appbrand.utils.v3.c(getJsRuntime(), k0Var, jSONObject, (com.tencent.mm.plugin.appbrand.utils.t3) b(com.tencent.mm.plugin.appbrand.utils.t3.class)) == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
            return k0Var.o("fail:convert native buffer parameter fail. native buffer exceed size limit.");
        }
        return null;
    }

    public void v0() {
    }

    public final <T extends nd.b> void w0(java.lang.Class<T> cls, T t17) {
        lm0.e eVar = this.f81582o;
        eVar.getClass();
        eVar.a(cls, new lm0.f(t17));
    }

    public final void x0(java.lang.Class<? extends lm0.a> cls) {
        this.f81582o.c(cls);
    }
}
