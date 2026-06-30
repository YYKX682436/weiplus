package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingWatchDog$watch$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Lu81/g;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandRuntimeSuspendingWatchDog$watch$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent> implements u81.g {

    /* renamed from: d, reason: collision with root package name */
    public long f74860d;

    /* renamed from: e, reason: collision with root package name */
    public u81.b f74861e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.l6 f74862f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1 f74863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f74864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1] */
    public AppBrandRuntimeSuspendingWatchDog$watch$1(final com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.f74864h = o6Var;
        this.f74861e = u81.b.FOREGROUND;
        this.f74862f = new com.tencent.mm.plugin.appbrand.l6(o6Var, this);
        final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
        this.f74863g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent>(a0Var2) { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1$mmCheckEventListener$1
            {
                this.__eventId = 104537351;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent appBrandRuntimeSuspendingMainProcessTriggerCheckEvent) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent event = appBrandRuntimeSuspendingMainProcessTriggerCheckEvent;
                kotlin.jvm.internal.o.g(event, "event");
                u81.h hVar = com.tencent.mm.plugin.appbrand.o6.this.N;
                u81.b b17 = hVar != null ? hVar.b() : null;
                int i17 = b17 == null ? -1 : com.tencent.mm.plugin.appbrand.k6.f84066a[b17.ordinal()];
                if (i17 != 1) {
                    if (i17 == 2) {
                        com.tencent.mm.plugin.appbrand.o6.this.N.f425432a.s(u81.u.CHECK_PROCESS_IMPORTANCE, null);
                    }
                } else if (this.c()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MainProcessTriggerCheckEvent), runtime(" + com.tencent.mm.plugin.appbrand.o6.this.f74803n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f74860d + ')');
                    com.tencent.mm.plugin.appbrand.o6.this.l0();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 4);
                    return false;
                }
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = com.tencent.mm.plugin.appbrand.o6.this;
                if (o6Var2.J0()) {
                    return false;
                }
                nf.b bVar = o6Var2.X;
                if (bVar.f336576c <= 0 || bVar.f336577d < 0) {
                    return false;
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (java.lang.System.currentTimeMillis() - bVar.f336576c < bVar.f336577d) {
                    return false;
                }
                bVar.f336574a.removeCallbacks(bVar.f336575b);
                bVar.f336575b.run();
                return false;
            }
        };
        o6Var.N.a(this);
        this.__eventId = 708811463;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(SUSPEND) runtime(" + this.f74864h.f74803n + ')');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f74860d = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 10);
            } else if (ordinal != 3) {
                this.f74860d = 0L;
            } else {
                dead();
            }
        } else if (u81.b.SUSPEND == this.f74861e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND, runtime(" + this.f74864h.f74803n + ')');
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1761, 11);
            if (c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateChanged(FOREGROUND), lastState is SUSPEND and exceeded timeout limit, runtime(" + this.f74864h.f74803n + ')');
                g0Var.A(1761, 12);
            }
        }
        this.f74861e = state;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public void alive() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.appbrand.l6 l6Var = this.f74862f;
        l6Var.getClass();
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                application.registerComponentCallbacks(l6Var);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            kotlin.Result.m520boximpl(m521constructorimpl);
        }
        alive();
    }

    public final boolean c() {
        if (!this.f74864h.P1()) {
            return false;
        }
        long j17 = r0.E0().f305851q * 1000;
        long j18 = this.f74860d;
        if (j18 > 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (j18 < java.lang.System.currentTimeMillis() && java.lang.System.currentTimeMillis() - this.f74860d > j17) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
        com.tencent.mm.autogen.events.MMTrimMemoryEvent event = mMTrimMemoryEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f74864h.N.b() != u81.b.SUSPEND || !c()) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "callback(MMTrimMemoryEvent), runtime(" + this.f74864h.f74803n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f74860d + ')');
        this.f74864h.l0();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 2);
        return false;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public void dead() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.appbrand.l6 l6Var = this.f74862f;
        l6Var.getClass();
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                application.unregisterComponentCallbacks(l6Var);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            kotlin.Result.m520boximpl(m521constructorimpl);
        }
        dead();
        super.dead();
    }
}
