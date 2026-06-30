package com.tencent.mm.feature.performance.scheduler;

@j95.b
/* loaded from: classes9.dex */
public final class c extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.feature.performance.scheduler.c f67677d;

    public static final void wi(com.tencent.mm.feature.performance.scheduler.c cVar) {
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "check for state changed");
        for (com.tencent.mm.feature.performance.scheduler.i0 i0Var : ((java.util.LinkedHashMap) com.tencent.mm.feature.performance.scheduler.m.f67703a).values()) {
            com.tencent.mm.feature.performance.scheduler.z zVar = i0Var.f67693b;
            if (zVar != null) {
                jz5.g b17 = jz5.h.b(new com.tencent.mm.feature.performance.scheduler.b(zVar));
                com.tencent.mm.feature.performance.scheduler.u uVar = zVar.f67728c;
                kotlin.jvm.internal.o.d(uVar);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                jz5.g gVar = com.tencent.mm.feature.performance.scheduler.u.f67714c;
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.feature.performance.scheduler.u.f67714c).getValue();
                java.lang.String str = uVar.f67716b;
                long q17 = currentTimeMillis - o4Var.q(str, 0L);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                boolean z17 = q17 >= java.util.concurrent.TimeUnit.HOURS.toMillis(uVar.f67715a);
                com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "check " + str + " is expired: " + z17);
                if (z17 && ((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue()) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.feature.performance.scheduler.h0 h0Var = new com.tencent.mm.feature.performance.scheduler.h0(i0Var);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    i0Var.f67698g = t0Var.k(h0Var, 0L);
                } else if (!((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue() && i0Var.f67694c) {
                    wu5.c cVar2 = i0Var.f67698g;
                    if (cVar2 != null) {
                        cVar2.cancel(true);
                    }
                    i0Var.f67698g = null;
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.feature.performance.scheduler.g0(i0Var, false));
                }
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!ih.a.h("clicfg_mm_bg_task_scheduler_enable", z65.c.a())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "BgScheduler disabled");
            return;
        }
        try {
            com.tencent.mm.vfs.a3.f212781a.b(-1L, com.tencent.wcdb.core.Database.DictDefaultMatchValue, false);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BgScheduler", e17, e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "onCreate");
        f67677d = this;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!ih.a.h("clicfg_mm_bg_task_scheduler_enable", z65.c.a())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "BgScheduler disabled");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "BgScheduler init");
        if (!com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.x2.p()) {
            java.util.Map map = com.tencent.mm.feature.performance.scheduler.m.f67703a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "forceCancelTask");
            for (com.tencent.mm.feature.performance.scheduler.i0 i0Var : ((java.util.LinkedHashMap) com.tencent.mm.feature.performance.scheduler.m.f67703a).values()) {
                wu5.c cVar = i0Var.f67698g;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                i0Var.f67698g = null;
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.feature.performance.scheduler.g0(i0Var, true));
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.feature.performance.scheduler.a aVar = new com.tencent.mm.feature.performance.scheduler.a(this);
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(aVar, millis, null);
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SchedulerTriggerEvent>(a0Var) { // from class: com.tencent.mm.feature.performance.scheduler.BgSchedulerFeatureService$initRunOnPush$2
                {
                    this.__eventId = 1335927789;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.SchedulerTriggerEvent schedulerTriggerEvent) {
                    com.tencent.mm.autogen.events.SchedulerTriggerEvent event = schedulerTriggerEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "check when device state changed, source = " + event.f54741g.f6607a);
                    com.tencent.mm.feature.performance.scheduler.c.wi(com.tencent.mm.feature.performance.scheduler.c.this);
                    return false;
                }
            }.alive();
        }
    }
}
