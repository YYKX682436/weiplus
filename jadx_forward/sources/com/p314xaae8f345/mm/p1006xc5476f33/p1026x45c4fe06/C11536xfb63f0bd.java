package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingWatchDog$watch$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Lu81/g;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1 */
/* loaded from: classes7.dex */
public final class C11536xfb63f0bd extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7> implements u81.g {

    /* renamed from: d, reason: collision with root package name */
    public long f156393d;

    /* renamed from: e, reason: collision with root package name */
    public u81.b f156394e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l6 f156395f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11537x8e1f2dda f156396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f156397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1] */
    public C11536xfb63f0bd(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.app.a0 a0Var) {
        super(a0Var);
        this.f156397h = o6Var;
        this.f156394e = u81.b.FOREGROUND;
        this.f156395f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l6(o6Var, this);
        final com.p314xaae8f345.mm.app.a0 a0Var2 = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f156396g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c>(a0Var2) { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1
            {
                this.f39173x3fe91575 = 104537351;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c c11535xa1a2514c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c event = c11535xa1a2514c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                u81.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this.N;
                u81.b b17 = hVar != null ? hVar.b() : null;
                int i17 = b17 == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k6.f165599a[b17.ordinal()];
                if (i17 != 1) {
                    if (i17 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this.N.f506965a.s(u81.u.CHECK_PROCESS_IMPORTANCE, null);
                    }
                } else if (this.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MainProcessTriggerCheckEvent), runtime(" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this.f156336n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f156393d + ')');
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this.l0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1761, 4);
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                if (o6Var2.J0()) {
                    return false;
                }
                nf.b bVar = o6Var2.X;
                if (bVar.f418109c <= 0 || bVar.f418110d < 0) {
                    return false;
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (java.lang.System.currentTimeMillis() - bVar.f418109c < bVar.f418110d) {
                    return false;
                }
                bVar.f418107a.mo50300x3fa464aa(bVar.f418108b);
                bVar.f418108b.run();
                return false;
            }
        };
        o6Var.N.a(this);
        this.f39173x3fe91575 = 708811463;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(SUSPEND) runtime(" + this.f156397h.f156336n + ')');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f156393d = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1761, 10);
            } else if (ordinal != 3) {
                this.f156393d = 0L;
            } else {
                mo48814x2efc64();
            }
        } else if (u81.b.SUSPEND == this.f156394e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND, runtime(" + this.f156397h.f156336n + ')');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1761, 11);
            if (c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND and exceeded timeout limit, runtime(" + this.f156397h.f156336n + ')');
                g0Var.A(1761, 12);
            }
        }
        this.f156394e = state;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: alive */
    public void mo48813x58998cd() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l6 l6Var = this.f156395f;
        l6Var.getClass();
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                application.registerComponentCallbacks(l6Var);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        }
        mo48813x58998cd();
    }

    public final boolean c() {
        if (!this.f156397h.P1()) {
            return false;
        }
        long j17 = r0.E0().f387384q * 1000;
        long j18 = this.f156393d;
        if (j18 > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (j18 < java.lang.System.currentTimeMillis() && java.lang.System.currentTimeMillis() - this.f156393d > j17) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 event = c5697xfda8a2d7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f156397h.N.b() != u81.b.SUSPEND || !c()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MMTrimMemoryEvent), runtime(" + this.f156397h.f156336n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f156393d + ')');
        this.f156397h.l0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1761, 2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: dead */
    public void mo48814x2efc64() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l6 l6Var = this.f156395f;
        l6Var.getClass();
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                application.unregisterComponentCallbacks(l6Var);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        }
        mo48814x2efc64();
        super.mo48814x2efc64();
    }
}
