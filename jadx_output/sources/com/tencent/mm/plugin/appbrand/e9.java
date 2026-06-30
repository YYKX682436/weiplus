package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e9 extends com.tencent.mm.plugin.appbrand.y {
    public volatile com.tencent.mm.plugin.appbrand.AppBrandRuntime D;
    public volatile com.tencent.mm.plugin.appbrand.x9 F;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.k9 f77998J;
    public u91.d K;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f77999y = false;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f78000z = false;
    public volatile boolean A = false;
    public final boolean[] B = {false};
    public xi1.g C = new xi1.h();
    public final java.lang.Object E = new byte[0];
    public final com.tencent.mm.plugin.appbrand.nc[] G = {new com.tencent.mm.plugin.appbrand.nc()};
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final bm5.x0 I = new bm5.x0(new com.tencent.mm.plugin.appbrand.e9$$b());

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public org.json.JSONObject A0() {
        return super.A0();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public final boolean G0() {
        return this.A;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public final boolean H0() {
        return t3() == null && !this.f77999y;
    }

    @Override // com.tencent.mm.plugin.appbrand.y
    public void N0(xi1.g gVar) {
        this.C = gVar;
    }

    public final void O0() {
        java.util.LinkedList linkedList;
        synchronized (this.G) {
            linkedList = this.G[0] != null ? new java.util.LinkedList(this.G[0]) : null;
            this.G[0] = null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.jsapi.n1 n1Var = (com.tencent.mm.plugin.appbrand.jsapi.n1) it.next();
                java.lang.String str = n1Var.f82359a;
                java.lang.String str2 = n1Var.f82360b;
                int i17 = n1Var.f82361c;
                int i18 = n1Var.f82362d;
                if (s(str)) {
                    com.tencent.mm.plugin.appbrand.jsapi.jf.a(getJsRuntime(), str, str2, i17, i18);
                }
            }
        }
    }

    public com.tencent.mm.plugin.appbrand.page.n2 P0() {
        return new com.tencent.mm.plugin.appbrand.page.n2();
    }

    public com.tencent.mm.plugin.appbrand.x9 Q0() {
        return new com.tencent.mm.plugin.appbrand.x9(this);
    }

    public void R0() {
        if (this.K != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "[DirectGame] destroyServiceDirectGameComponentView " + this.K.hashCode());
            this.K.b0();
            this.K = null;
        }
    }

    public void S0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (u46.l.e(str)) {
            return;
        }
        if (f1(str)) {
            if (s(str)) {
                com.tencent.mm.plugin.appbrand.jsapi.jf.a(getJsRuntime(), str, str2, i17, i18);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.nc[] ncVarArr = this.G;
        if (ncVarArr[0] != null) {
            synchronized (ncVarArr) {
                com.tencent.mm.plugin.appbrand.nc ncVar = this.G[0];
                if (ncVar != null) {
                    ncVar.add(new com.tencent.mm.plugin.appbrand.jsapi.n1(str, str2, i17, i18));
                    return;
                }
            }
        }
        if (s(str)) {
            com.tencent.mm.plugin.appbrand.jsapi.jf.a(getJsRuntime(), str, str2, i17, i18);
        }
    }

    public java.lang.String T0() {
        return java.lang.String.format(java.util.Locale.US, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", com.tencent.mm.plugin.appbrand.jsapi.jf.c("onWxConfigReady", "", 0, 0));
    }

    public org.json.JSONObject U0() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        y0(jSONObject2);
        k91.z0 E0 = this.D.E0();
        k91.r m07 = this.D.m0();
        if (E0 == null || m07 == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject3 = (!m07.f305737d || (jSONObject = m07.E) == null || jSONObject.length() == 0) ? m07.D : m07.E;
        java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                jSONObject2.putOpt(next, jSONObject3.opt(next));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandService", e17.getMessage());
            }
        }
        K0(jSONObject2, "env", new org.json.JSONObject());
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        K0(jSONObject4, "zIndex", 1000);
        K0(jSONObject4, "viewId", 1);
        K0(jSONObject2, "menuButtonInfo", jSONObject4);
        try {
            K0(jSONObject2, "networkType", be1.z.E(com.tencent.mm.sdk.platformtools.x2.f193071a).f19540d);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandService", "generateWxConfig(%s) set networkType get exception:%s", getAppId(), e18);
        }
        return jSONObject2;
    }

    public com.tencent.mm.plugin.appbrand.page.v5 V0() {
        return W0(com.tencent.mm.plugin.appbrand.page.v5.class);
    }

    public <T extends com.tencent.mm.plugin.appbrand.page.v5> T W0(java.lang.Class<T> cls) {
        if (this.D == null || this.D.x0() == null) {
            return null;
        }
        if (this.D.x0() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandService", "getCurrentPageView NULL PageContainer, appId=%s", getAppId());
            if (this.D.Q1()) {
                return null;
            }
            throw new java.lang.IllegalStateException("getCurrentPageView NULL PageContainer");
        }
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = this.D.x0().getCurrentPage();
        if (currentPage == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandService", "getCurrentPageView NULL Page, appId=%s", getAppId());
            return null;
        }
        T t17 = (T) currentPage.getCurrentPageView();
        if (cls.isInstance(t17)) {
            return t17;
        }
        return null;
    }

    public java.lang.String X0() {
        return "";
    }

    public u91.d Y0() {
        u91.d dVar = this.K;
        if (dVar != null) {
            return dVar;
        }
        this.K = new u91.d(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "[DirectGame] getOrCreateServiceDirectGameComponentView " + this.K.hashCode());
        return this.K;
    }

    public final android.app.Activity Z0() {
        com.tencent.mm.plugin.appbrand.page.v5 V0 = V0();
        android.content.Context context = V0 == null ? getContext() : V0.getContext();
        if (android.app.Activity.class.isInstance(context)) {
            return (android.app.Activity) context;
        }
        return null;
    }

    public java.lang.String a1(java.lang.String str) {
        return "";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public java.lang.String b0() {
        return "AppBrandService";
    }

    public java.lang.String b1() {
        return "";
    }

    public final com.tencent.mm.plugin.appbrand.x9 c1() {
        com.tencent.mm.plugin.appbrand.x9 x9Var;
        if (!h1()) {
            return null;
        }
        synchronized (this.E) {
            x9Var = this.F;
        }
        return x9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public final void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (isRunning()) {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = this.D.x0();
            x07.getClass();
            x07.c0(new com.tencent.mm.plugin.appbrand.page.w3(x07, str, str2, iArr));
        }
    }

    public void d1() {
        org.json.JSONObject U0 = U0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "injectConfig(%s): %s", getAppId(), U0.toString());
        java.lang.String str = this.D.m0().f305736J;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "injectConfig start, hash=%d", java.lang.Integer.valueOf(getComponentId()));
        if (getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.b0.class) != null) {
            java.lang.String jSONObject = U0.toString();
            com.tencent.mm.plugin.appbrand.jsruntime.b0 b0Var = (com.tencent.mm.plugin.appbrand.jsruntime.b0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.b0.class);
            com.tencent.mm.plugin.appbrand.f9 f9Var = new com.tencent.mm.plugin.appbrand.f9(this, jSONObject);
            com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) b0Var;
            ((cl.a) nVar.c0()).h(new com.tencent.mm.plugin.appbrand.jsruntime.m(nVar, f9Var, "__native_custom_event__wxConfig_inject", jSONObject, 0, ""), false);
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String jSONObject2 = U0.toString();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);var __wxIndexPage = \"%s\";", jSONObject2, str);
        if (getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class) != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.l0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)).Q(null, null, null, 0, format, new com.tencent.mm.plugin.appbrand.g9(this, jSONObject2));
        } else {
            getJsRuntime().evaluateJavascript(format, new com.tencent.mm.plugin.appbrand.h9(this, currentTimeMillis, jSONObject2));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public final void e(java.lang.String str, java.lang.String str2, int i17) {
        S0(str, str2, i17, 0);
    }

    public final void e1() {
        if (h1()) {
            synchronized (this.E) {
                if (this.F == null) {
                    this.F = Q0();
                }
                synchronized (this.H) {
                    java.util.LinkedList linkedList = new java.util.LinkedList(this.H);
                    this.H.clear();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.appbrand.a8) ((com.tencent.mm.plugin.appbrand.l9) it.next())).a(this.F);
                    }
                }
            }
        }
    }

    public boolean f1(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.k0> g0() {
        return null;
    }

    public boolean g1() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public final int getComponentId() {
        return super.getComponentId();
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: getRuntime */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime t3() {
        return this.D;
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public xi1.g getWindowAndroid() {
        return this.C;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void h() {
        this.f78000z = false;
        this.f77999y = true;
        synchronized (this.B) {
            this.B[0] = false;
        }
        this.D = null;
        super.h();
        synchronized (this.E) {
            if (this.F != null) {
                com.tencent.mm.plugin.appbrand.x9 x9Var = this.F;
                x9Var.f92390j.set(true);
                x9Var.f92383c.f();
                x9Var.f92381a = null;
                x9Var.f92387g.clear();
                this.F = null;
            }
        }
    }

    public boolean h1() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsruntime.t i0() {
        return new com.tencent.mm.plugin.appbrand.jsruntime.g(null, null);
    }

    public void i1() {
        d1();
        O0();
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return this.f78000z && !this.f77999y && super.isRunning();
    }

    public void j1() {
    }

    public void k1() {
        if (isRunning()) {
            new com.tencent.mm.plugin.appbrand.page.m2().x(this.D);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandService", "onRuntimePause but not running appId %s", getAppId());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public final void l0() {
        super.l0();
        e1();
        q1();
        this.f78000z = true;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.D.E;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f81580m;
        concurrentLinkedDeque2.clear();
        concurrentLinkedDeque2.addAll(concurrentLinkedDeque);
        i1();
    }

    public void l1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.D = appBrandRuntime;
        N0(appBrandRuntime.getWindowAndroid());
        if (h1()) {
            e1();
            if (!g1()) {
                com.tencent.mm.plugin.appbrand.x9 c17 = c1();
                java.util.Objects.requireNonNull(c17);
                c17.f92389i.set(true);
                java.lang.String appId = c17.f92381a.getAppId();
                c17.f92385e = appId;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWorkerContainer", "onRuntimeReady %s", appId);
                c17.f92383c.h();
                c17.h();
            }
        }
        com.tencent.mm.plugin.appbrand.o9 o9Var = com.tencent.mm.plugin.appbrand.n9.f86057a;
        o9Var.getClass();
        int componentId = getComponentId();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify service:%d", java.lang.Integer.valueOf(componentId));
        synchronized (o9Var) {
            java.util.List list = (java.util.List) o9Var.f86241a.get(componentId);
            if (list == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify listenerList empty");
                o9Var.f86242b.put(componentId, 1);
            } else {
                if (list.size() <= 0) {
                    return;
                }
                android.support.v4.media.f.a(list.get(0));
                throw null;
            }
        }
    }

    public void m1(boolean z17, boolean z18) {
        if (!isRunning()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandService", "onRuntimeResume but not running, appId %s, willRelaunch %b", getAppId(), java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.n2 P0 = P0();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.D;
        P0.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject c17 = appBrandRuntime.u0().c();
        if (c17 != null) {
            hashMap.put("referrerInfo", c17);
        }
        hashMap.put("relaunch", java.lang.Boolean.valueOf(z17));
        hashMap.put("reLaunch", java.lang.Boolean.valueOf(z17));
        if (z18) {
            hashMap.put("useNewNavStack", java.lang.Boolean.TRUE);
        }
        java.util.LinkedList linkedList = appBrandRuntime.f74797f;
        java.lang.String t07 = (!z18 || linkedList.isEmpty()) ? z17 ? appBrandRuntime.t0() : appBrandRuntime.x0().getCurrentUrl() : ((com.tencent.mm.plugin.appbrand.z5) linkedList.get(linkedList.size() - 1)).f92447d;
        hashMap.put("rawPath", t07);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, nf.z.a(t07));
        hashMap.put("query", nf.z.c(t07));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s, relaunch: %s, url: %s", hashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), hashMap.get("query"), hashMap.get("relaunch"), t07);
        nf.f.c(hashMap);
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        P0.y(appBrandRuntime, z17, jSONObject);
        P0.f82374f = jSONObject.toString();
        P0.u(appBrandRuntime.C0());
        P0.m();
        P0.x(appBrandRuntime, jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    public final void n1() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String appId = getAppId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (appId == null) {
            appId = "";
        }
        objArr[0] = appId;
        objArr[1] = java.lang.Integer.valueOf(getComponentId());
        objArr[2] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "pauseJsThreads appId:%s, serviceId:%d, stack:%s", objArr);
        com.tencent.mm.sdk.platformtools.n3 n3Var = (com.tencent.mm.sdk.platformtools.n3) this.I.d();
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.plugin.appbrand.jsruntime.k0 k0Var = getJsRuntime() != null ? (com.tencent.mm.plugin.appbrand.jsruntime.k0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.k0.class) : null;
        if (k0Var != null) {
            k0Var.pause();
        }
        com.tencent.mm.plugin.appbrand.x9 c17 = c1();
        if (c17 != null) {
            java.util.Iterator it = c17.f92383c.f42686b.values().iterator();
            while (it.hasNext()) {
                cl.a aVar = (cl.a) ((cl.q0) it.next()).f42724b;
                aVar.f42569b.pause();
                cl.a.f42567z.b(aVar);
            }
        }
    }

    public final void o1() {
        n0();
        e1();
        D0(A0());
        this.A = true;
        j1();
        if (getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.g0.class) == null) {
            return;
        }
        android.support.v4.media.f.a(getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.g0.class));
        throw null;
    }

    public void p1(java.lang.String str, long j17, long j18, java.lang.Object obj) {
    }

    public final void q1() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String appId = getAppId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (appId == null) {
            appId = "";
        }
        objArr[0] = appId;
        objArr[1] = java.lang.Integer.valueOf(getComponentId());
        objArr[2] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "resumeJsThreads appId:%s, serviceId:%d, stack:%s", objArr);
        com.tencent.mm.sdk.platformtools.n3 n3Var = (com.tencent.mm.sdk.platformtools.n3) this.I.d();
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.plugin.appbrand.jsruntime.k0 k0Var = getJsRuntime() != null ? (com.tencent.mm.plugin.appbrand.jsruntime.k0) getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.k0.class) : null;
        if (k0Var != null) {
            k0Var.resume();
        }
        com.tencent.mm.plugin.appbrand.x9 c17 = c1();
        if (c17 != null) {
            java.util.Iterator it = c17.f92383c.f42686b.values().iterator();
            while (it.hasNext()) {
                cl.a aVar = (cl.a) ((cl.q0) it.next()).f42724b;
                aVar.f42569b.resume();
                cl.a.f42567z.a(aVar);
            }
        }
    }

    public final void r1(long j17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.String appId = getAppId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (appId == null) {
            appId = "";
        }
        objArr[0] = appId;
        objArr[1] = java.lang.Integer.valueOf(getComponentId());
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandService", "schedulePauseJsThreads appId:%s, serviceId:%d, delayMillis:%d, stack:%s", objArr);
        if (j17 <= 0) {
            n1();
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = (com.tencent.mm.sdk.platformtools.n3) this.I.b();
        n3Var.removeCallbacksAndMessages(null);
        n3Var.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.e9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.e9.this.n1();
            }
        }, j17);
    }

    public void s1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.D = appBrandRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsapi.g0 t0(java.lang.Class cls) {
        boolean z17;
        synchronized (this.B) {
            z17 = this.B[0];
        }
        if (z17) {
            return super.t0(cls);
        }
        return null;
    }

    public void t1(com.tencent.mm.plugin.appbrand.l9 l9Var) {
        if (l9Var == null) {
            return;
        }
        synchronized (this.E) {
            if (this.F != null) {
                ((com.tencent.mm.plugin.appbrand.a8) l9Var).a(this.F);
            } else {
                synchronized (this.H) {
                    this.H.add(l9Var);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public void y0(org.json.JSONObject jSONObject) {
        super.y0(jSONObject);
        if (getJsRuntime() != null) {
            K0(jSONObject, "nativeBufferEnabled", java.lang.Boolean.valueOf(getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class) != null));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public void z0(org.json.JSONObject jSONObject) {
        new com.tencent.mm.plugin.appbrand.jsapi.ag().a(jSONObject);
    }
}
