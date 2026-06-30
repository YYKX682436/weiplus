package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 f161648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(c11510xdd90c2f2);
        this.f161648d = w0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.k
    public void b(java.lang.String deviceId, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161648d.f161657e, "onConnectStateChange, deviceId: " + deviceId + ", connected: " + z17);
        boolean isEmpty = this.f161648d.f161668s.isEmpty();
        if (!z17) {
            this.f161648d.f161668s.remove(deviceId);
            if (this.f161648d.f161668s.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161648d.f161657e, "onConnectStateChange, all device disconnect");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var = this.f161648d;
                if (w0Var.f161656d.V) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "onConnectStateChange, do real disable");
                    this.f161648d.b();
                    return;
                }
                java.util.concurrent.Future future = w0Var.f161669t;
                if (future != null) {
                    future.cancel(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var2 = this.f161648d;
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.t0(this.f161648d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0.f161653u;
                long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().V * 1000;
                ku5.t0 t0Var2 = (ku5.t0) u0Var;
                t0Var2.getClass();
                w0Var2.f161669t = t0Var2.t(t0Var, j17, null);
                return;
            }
            return;
        }
        this.f161648d.f161668s.add(deviceId);
        if (isEmpty && this.f161648d.f161666q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161648d.f161657e, "onConnectStateChange, origin not connected and enable() called");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var3 = this.f161648d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "doRealEnable");
            if (!w0Var3.f161666q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w0Var3.f161657e, "doRealEnable, must call enable() first");
                return;
            }
            boolean z18 = !((u81.a) w0Var3.f161656d.b(u81.a.class)).f506933f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "doRealEnable, isBanned: " + z18);
            if (z18) {
                return;
            }
            if (w0Var3.f161667r) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "doRealEnable, already enabled");
                return;
            }
            w0Var3.f161667r = true;
            java.lang.String str = w0Var3.f161657e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requireHostKeepMeAlive");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = w0Var3.f161656d.C0();
            if (C0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "requireHostKeepMeAlive, service is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.a(C0, 1, 32, false);
            }
            if (w0Var3.f161661i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "registerAuthStateListenerIfNeed, create and add");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r0(w0Var3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.a(w0Var3.f161656d.f156336n, r0Var);
                w0Var3.f161661i = r0Var;
            }
            if (w0Var3.f161662m == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "registerLifeCycleListenerIfNeed, create and add");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.v0(w0Var3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(w0Var3.f161656d.f156336n, v0Var);
                w0Var3.f161662m = v0Var;
            }
            if (w0Var3.f161663n == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "registerBackgroundRunningOpListenerIfNeed, create and add");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s0(w0Var3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.m0 m0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0.f161653u;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0.f161654v).mo141623x754a37bb();
                if (v0Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var2;
                    synchronized (kVar.f158510e) {
                        kVar.f158510e.add(s0Var);
                    }
                }
                w0Var3.f161663n = s0Var;
            }
            if (w0Var3.f161664o == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var3.f161657e, "createFloatBallHelperIfNeed, create");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime = w0Var3.f161656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
                if (runtime instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) runtime;
                    iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n(o6Var.r0(), o6Var), runtime);
                    iVar.b(33, qp1.n.a(o6Var.f156336n, o6Var.f156338p.f158814g));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f159633w, "updateBallInfoWithInitConfig, initConfig: " + u07);
                    if (u07 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = iVar.f174665d;
                        c12886x91aa2b6d.f174590r = u07.f158813f;
                        c12886x91aa2b6d.f174596x = u07.f158812e;
                        int i17 = iVar.f159632v.f156338p.f158814g;
                        c12886x91aa2b6d.f174598z = i17 != 1 ? i17 != 2 ? null : iVar.f159632v.f156328d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8) : iVar.f159632v.f156328d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
                        iVar.f174665d.n("appId", iVar.f159632v.u0().f158811d);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = iVar.f159632v;
                        if (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
                            iVar.f174665d.n(dm.i4.f66875xa013b0d5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u0().f128811x);
                        }
                        iVar.f174665d.m("versionType", iVar.f159632v.u0().f158814g);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u.g(iVar, u07);
                        c12886x91aa2b6d.M.f174619f = 20;
                        iVar.g();
                    }
                    runtime.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.e(runtime, iVar));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "create, runtime is not AppBrandRuntimeWC");
                    iVar = null;
                }
                w0Var3.f161664o = iVar;
            }
            w0Var3.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = w0Var3.f161656d;
            if ((c11510xdd90c2f22 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f22).Z1()) {
                u81.h hVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) w0Var3.f161656d).N;
                hVar.getClass();
                hVar.f506965a.s(u81.u.ON_START_BACKGROUND_BLUETOOTH, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.d
    /* renamed from: onBluetoothStateChange */
    public void mo50721xc065fc92(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var = this.f161648d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "onBluetoothStateChange, isOn: " + z17);
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "onBluetoothStateChange, do disable");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s.n8(w0Var, false, 1, null);
    }
}
