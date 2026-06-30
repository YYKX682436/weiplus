package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public abstract class d {
    public static final void a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.autogen.events.SchedulerTriggerEvent schedulerTriggerEvent = new com.tencent.mm.autogen.events.SchedulerTriggerEvent();
        schedulerTriggerEvent.f54741g.f6607a = str;
        schedulerTriggerEvent.c("MicroMsg.BgScheduler");
    }
}
