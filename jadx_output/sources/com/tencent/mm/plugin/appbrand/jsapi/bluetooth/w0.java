package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class w0 implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m0 f80120u = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m0(null);

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f80121v = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l0.f80085d);

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f80122w = "WCBluetoothBackgroundSupportClientFactory";

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f80123d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80124e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f80125f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k f80126g;

    /* renamed from: h, reason: collision with root package name */
    public volatile u81.f f80127h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o f80128i;

    /* renamed from: m, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.v0 f80129m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.backgroundrunning.t0 f80130n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.floatball.i f80131o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f80132p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f80133q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f80134r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f80135s;

    /* renamed from: t, reason: collision with root package name */
    public volatile java.util.concurrent.Future f80136t;

    public w0(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f80123d = runtime;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AppBrand.WCBluetoothBackgroundSupports#");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h hVar = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b;
        sb6.append(hVar.d(runtime));
        this.f80124e = sb6.toString();
        this.f80125f = "WCBluetoothBackgroundSupportClient#" + hVar.d(runtime);
        this.f80132p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f80135s = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    public static final com.tencent.mm.plugin.appbrand.floatball.i c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.c(runtime);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = c17 instanceof com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 ? (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0) c17 : null;
        if (w0Var != null) {
            return w0Var.f80131o;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void Fd(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f80124e, "disable, closeConnection: " + z17);
        if (!this.f80133q) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "disable, not enabled");
            return;
        }
        this.f80133q = false;
        d(false);
        if (z17) {
            java.util.Set<java.lang.String> connectedDevices = this.f80135s;
            kotlin.jvm.internal.o.f(connectedDevices, "connectedDevices");
            java.lang.String str = this.f80123d.f74803n;
            com.tencent.mars.xlog.Log.i(this.f80124e, "closeAllConnection, appId: " + str);
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(str);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.w(this.f80124e, "closeAllConnection, bleWorker is null");
            } else {
                for (java.lang.String str2 : connectedDevices) {
                    b17.h(str2, new mb1.a(), new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n0(this, str2));
                }
            }
        }
        u81.f fVar = this.f80127h;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "unregisterAppRunningStateChangeListenerIfNeed, disable");
            u81.h hVar = this.f80123d.N;
            if (hVar != null) {
                hVar.c(fVar);
            }
            this.f80127h = null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k kVar = this.f80126g;
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "unregisterBluetoothStateChangeListenerIfNeed, disable");
            this.f80135s.clear();
            com.tencent.mars.xlog.Log.i(kVar.f80081b, "disable");
            if (kVar.f80082c) {
                kVar.f80082c = false;
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b18 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(kVar.f80080a.f74803n);
                if (b18 == null) {
                    com.tencent.mars.xlog.Log.i(kVar.f80081b, "disable, bleWorker is null");
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) b18.f80060h).remove(kVar);
                    ((java.util.concurrent.CopyOnWriteArrayList) b18.f80059g).remove(kVar);
                }
            } else {
                com.tencent.mars.xlog.Log.i(kVar.f80081b, "disable, already disabled");
            }
            this.f80126g = null;
        }
        b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public boolean H6() {
        return this.f80134r;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public java.lang.String N6() {
        return this.f80125f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void S6(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(this.f80124e, "addListener, listener: " + ((com.tencent.mm.plugin.appbrand.floatball.h) listener).f78096a);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f80132p).add(listener);
    }

    public final void a() {
        boolean z17 = this.f80134r;
        com.tencent.mars.xlog.Log.i(this.f80124e, "dispatchStateChange, isEnabled: " + z17);
        java.util.Iterator it = this.f80132p.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.floatball.i iVar = ((com.tencent.mm.plugin.appbrand.floatball.h) ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r) it.next())).f78097b;
            com.tencent.mars.xlog.Log.i(iVar.f78100w, "onStateChange, isEnabled: " + z17);
            java.lang.String str = iVar.f78100w;
            com.tencent.mars.xlog.Log.i(str, "onBackgroundSupportStateChange, isEnabled: " + z17);
            if (!z17) {
                iVar.d();
            } else if (!iVar.u()) {
                com.tencent.mars.xlog.Log.i(str, "onBackgroundSupportStateChange, add ball");
                iVar.a0(true);
                iVar.W(true ^ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.e(iVar.f78099v));
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = iVar.f93132d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f365755a;
                iVar.b0(i17 | 4096);
                iVar.j();
            }
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(this.f80124e, "doRealDisable");
        if (!this.f80134r) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "doRealDisable, already disabled");
            return;
        }
        this.f80134r = false;
        java.lang.String str = this.f80124e;
        com.tencent.mars.xlog.Log.i(str, "releaseHostKeepMeAlive");
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f80123d.C0();
        if (C0 == null) {
            com.tencent.mars.xlog.Log.w(str, "releaseHostKeepMeAlive, service is null");
        } else {
            com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(C0, 2, 32, false);
        }
        u81.h hVar = this.f80123d.N;
        hVar.getClass();
        hVar.f425432a.s(u81.u.ON_STOP_BACKGROUND_BLUETOOTH, null);
        a();
        com.tencent.mm.plugin.appbrand.floatball.i iVar = this.f80131o;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "destroyFloatBallHelperIfNeed, destroy");
            iVar.o0();
            this.f80131o = null;
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.t0 t0Var = this.f80130n;
        if (t0Var != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "unregisterBackgroundRunningOpListenerIfNeed, remove");
            com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) ((jz5.n) f80121v).getValue();
            if (v0Var != null) {
                com.tencent.mm.plugin.appbrand.backgroundrunning.k kVar = (com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var;
                synchronized (kVar.f76977e) {
                    kVar.f76977e.remove(t0Var);
                }
            }
            this.f80130n = null;
        }
        com.tencent.mm.plugin.appbrand.v0 v0Var2 = this.f80129m;
        if (v0Var2 != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "unregisterLifeCycleListenerIfNeed, remove");
            com.tencent.mm.plugin.appbrand.x0.e(this.f80123d.f74803n, v0Var2);
            this.f80129m = null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o oVar = this.f80128i;
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "unregisterAuthStateListenerIfNeed, remove");
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.b(this.f80123d.f74803n, oVar);
            this.f80128i = null;
        }
    }

    public final void d(boolean z17) {
        java.lang.String str = this.f80123d.f74803n;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record, appId is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp.class.getClassLoader());
        bundle.putBoolean("enable", z17);
        bundle.putParcelable("app", new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp(str, this.f80123d.f74805p.f77281g));
        uk0.a.c(bundle, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p0.f80092d, null, 4, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void j8(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(this.f80124e, "removeListener, listener: " + ((com.tencent.mm.plugin.appbrand.floatball.h) listener).f78096a);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f80132p).remove(listener);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void v4() {
        com.tencent.mars.xlog.Log.i(this.f80124e, "checkCanIEnable");
        if (this.f80133q) {
            return;
        }
        java.lang.String str = this.f80123d.f74803n;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, appId is null");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.setClassLoader(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp.class.getClassLoader());
            bundle.putParcelable("app", new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp(str, this.f80123d.f74805p.f77281g));
            bundle.putInt("maxCount", com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().W);
            com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) uk0.a.d(bundle, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o0.f80091a);
            r1 = iPCBoolean != null ? iPCBoolean.f68400d : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, canIEnableBackgroundSupport: " + r1);
            r1 ^= true;
        }
        if (r1) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "checkCanIEnable, reach max count");
            throw new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j(jc1.c.Q, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void y() {
        com.tencent.mars.xlog.Log.i(this.f80124e, "enable");
        if (this.f80133q) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "enable, already enabled");
            java.util.concurrent.Future future = this.f80136t;
            if (future != null) {
                future.cancel(false);
                return;
            }
            return;
        }
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.e(this.f80123d)) {
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f80123d.f74795d)) {
                com.tencent.mars.xlog.Log.i(this.f80124e, "enable, in background, float window permission is not allowed");
                throw new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j(jc1.f.f298914c, null, 2, null);
            }
        }
        this.f80133q = true;
        d(true);
        if (this.f80126g == null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "registerBluetoothStateChangeListenerIfNeed, create and enable");
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.u0 u0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.u0(this, this.f80123d);
            com.tencent.mars.xlog.Log.i(u0Var.f80081b, "enable");
            if (u0Var.f80082c) {
                com.tencent.mars.xlog.Log.i(u0Var.f80081b, "enable, already enabled");
            } else {
                u0Var.f80082c = true;
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(u0Var.f80080a.f74803n);
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.i(u0Var.f80081b, "enable, bleWorker is null");
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) b17.f80059g).add(u0Var);
                    kb1.c i17 = b17.i();
                    java.util.List a17 = i17 != null ? i17.f306222a.a() : null;
                    if (a17 != null) {
                        java.util.Iterator it = a17.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = ((ob1.f) it.next()).f344008b;
                            if (str == null) {
                                com.tencent.mars.xlog.Log.w(u0Var.f80081b, "enable, deviceId is null");
                            } else {
                                u0Var.b(str, true);
                            }
                        }
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) b17.f80060h).add(u0Var);
                }
            }
            this.f80126g = u0Var;
        }
        if (this.f80127h == null) {
            com.tencent.mars.xlog.Log.i(this.f80124e, "registerAppRunningStateChangeListenerIfNeed, create and enable");
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q0 q0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q0(this);
            u81.h hVar = this.f80123d.N;
            if (hVar != null) {
                hVar.a(q0Var);
            }
            this.f80127h = q0Var;
        }
    }
}
