package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.m0 f161653u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.m0(null);

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f161654v = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l0.f161618d);

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f161655w = "WCBluetoothBackgroundSupportClientFactory";

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f161656d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161657e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f161658f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.k f161659g;

    /* renamed from: h, reason: collision with root package name */
    public volatile u81.f f161660h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o f161661i;

    /* renamed from: m, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f161662m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 f161663n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i f161664o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f161665p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f161666q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f161667r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f161668s;

    /* renamed from: t, reason: collision with root package name */
    public volatile java.util.concurrent.Future f161669t;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f161656d = runtime;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AppBrand.WCBluetoothBackgroundSupports#");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b;
        sb6.append(hVar.d(runtime));
        this.f161657e = sb6.toString();
        this.f161658f = "WCBluetoothBackgroundSupportClient#" + hVar.d(runtime);
        this.f161665p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f161668s = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.c(runtime);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var = c17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0) c17 : null;
        if (w0Var != null) {
            return w0Var.f161664o;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public void Fd(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "disable, closeConnection: " + z17);
        if (!this.f161666q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "disable, not enabled");
            return;
        }
        this.f161666q = false;
        d(false);
        if (z17) {
            java.util.Set<java.lang.String> connectedDevices = this.f161668s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(connectedDevices, "connectedDevices");
            java.lang.String str = this.f161656d.f156336n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "closeAllConnection, appId: " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(str);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f161657e, "closeAllConnection, bleWorker is null");
            } else {
                for (java.lang.String str2 : connectedDevices) {
                    b17.h(str2, new mb1.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.n0(this, str2));
                }
            }
        }
        u81.f fVar = this.f161660h;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "unregisterAppRunningStateChangeListenerIfNeed, disable");
            u81.h hVar = this.f161656d.N;
            if (hVar != null) {
                hVar.c(fVar);
            }
            this.f161660h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.k kVar = this.f161659g;
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "unregisterBluetoothStateChangeListenerIfNeed, disable");
            this.f161668s.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f161614b, "disable");
            if (kVar.f161615c) {
                kVar.f161615c = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(kVar.f161613a.f156336n);
                if (b18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f161614b, "disable, bleWorker is null");
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) b18.f161593h).remove(kVar);
                    ((java.util.concurrent.CopyOnWriteArrayList) b18.f161592g).remove(kVar);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f161614b, "disable, already disabled");
            }
            this.f161659g = null;
        }
        b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public boolean H6() {
        return this.f161667r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public java.lang.String N6() {
        return this.f161658f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "addListener, listener: " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h) listener).f159629a);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f161665p).add(listener);
    }

    public final void a() {
        boolean z17 = this.f161667r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "dispatchStateChange, isEnabled: " + z17);
        java.util.Iterator it = this.f161665p.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i iVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r) it.next())).f159630b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f159633w, "onStateChange, isEnabled: " + z17);
            java.lang.String str = iVar.f159633w;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBackgroundSupportStateChange, isEnabled: " + z17);
            if (!z17) {
                iVar.d();
            } else if (!iVar.u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBackgroundSupportStateChange, add ball");
                iVar.a0(true);
                iVar.W(true ^ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.e(iVar.f159632v));
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = iVar.f174665d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f447288a;
                iVar.b0(i17 | 4096);
                iVar.j();
            }
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "doRealDisable");
        if (!this.f161667r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "doRealDisable, already disabled");
            return;
        }
        this.f161667r = false;
        java.lang.String str = this.f161657e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "releaseHostKeepMeAlive");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f161656d.C0();
        if (C0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "releaseHostKeepMeAlive, service is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.a(C0, 2, 32, false);
        }
        u81.h hVar = this.f161656d.N;
        hVar.getClass();
        hVar.f506965a.s(u81.u.ON_STOP_BACKGROUND_BLUETOOTH, null);
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i iVar = this.f161664o;
        if (iVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "destroyFloatBallHelperIfNeed, destroy");
            iVar.o0();
            this.f161664o = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 t0Var = this.f161663n;
        if (t0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "unregisterBackgroundRunningOpListenerIfNeed, remove");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) ((jz5.n) f161654v).mo141623x754a37bb();
            if (v0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var;
                synchronized (kVar.f158510e) {
                    kVar.f158510e.remove(t0Var);
                }
            }
            this.f161663n = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 v0Var2 = this.f161662m;
        if (v0Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "unregisterLifeCycleListenerIfNeed, remove");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f161656d.f156336n, v0Var2);
            this.f161662m = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o oVar = this.f161661i;
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "unregisterAuthStateListenerIfNeed, remove");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.b(this.f161656d.f156336n, oVar);
            this.f161661i = null;
        }
    }

    public final void d(boolean z17) {
        java.lang.String str = this.f161656d.f156336n;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record, appId is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.C12038x21fb83f1.class.getClassLoader());
        bundle.putBoolean("enable", z17);
        bundle.putParcelable("app", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.C12038x21fb83f1(str, this.f161656d.f156338p.f158814g));
        uk0.a.c(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.p0.f161625d, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public void j8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "removeListener, listener: " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h) listener).f159629a);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f161665p).remove(listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public void v4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "checkCanIEnable");
        if (this.f161666q) {
            return;
        }
        java.lang.String str = this.f161656d.f156336n;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, appId is null");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.C12038x21fb83f1.class.getClassLoader());
            bundle.putParcelable("app", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.C12038x21fb83f1(str, this.f161656d.f156338p.f158814g));
            bundle.putInt("maxCount", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().W);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) uk0.a.d(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o0.f161624a);
            r1 = c10750x9556b48c != null ? c10750x9556b48c.f149933d : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, canIEnableBackgroundSupport: " + r1);
            r1 ^= true;
        }
        if (r1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "checkCanIEnable, reach max count");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.j(jc1.c.Q, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "enable");
        if (this.f161666q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "enable, already enabled");
            java.util.concurrent.Future future = this.f161669t;
            if (future != null) {
                future.cancel(false);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.e(this.f161656d)) {
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f161656d.f156328d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "enable, in background, float window permission is not allowed");
                throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.j(jc1.f.f380447c, null, 2, null);
            }
        }
        this.f161666q = true;
        d(true);
        if (this.f161659g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "registerBluetoothStateChangeListenerIfNeed, create and enable");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.u0(this, this.f161656d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f161614b, "enable");
            if (u0Var.f161615c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f161614b, "enable, already enabled");
            } else {
                u0Var.f161615c = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(u0Var.f161613a.f156336n);
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f161614b, "enable, bleWorker is null");
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) b17.f161592g).add(u0Var);
                    kb1.c i17 = b17.i();
                    java.util.List a17 = i17 != null ? i17.f387755a.a() : null;
                    if (a17 != null) {
                        java.util.Iterator it = a17.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = ((ob1.f) it.next()).f425541b;
                            if (str == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(u0Var.f161614b, "enable, deviceId is null");
                            } else {
                                u0Var.b(str, true);
                            }
                        }
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) b17.f161593h).add(u0Var);
                }
            }
            this.f161659g = u0Var;
        }
        if (this.f161660h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161657e, "registerAppRunningStateChangeListenerIfNeed, create and enable");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.q0(this);
            u81.h hVar = this.f161656d.N;
            if (hVar != null) {
                hVar.a(q0Var);
            }
            this.f161660h = q0Var;
        }
    }
}
