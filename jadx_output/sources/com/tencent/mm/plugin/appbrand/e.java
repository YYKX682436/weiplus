package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.luggage.sdk.processes.r rVar;
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = (com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = event.f53999g.f7589a;
        boolean z17 = (i17 & 1) != 0;
        boolean z18 = (i17 & 8) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBeforeAggressiveCleanCacheEventListener", "received clean event, flag is " + event.f53999g.f7589a + ", is system " + z17 + ", is appbrand: " + z18);
        if (z17 || z18) {
            if (i95.n0.h(com.tencent.mm.plugin.appbrand.fc.class)) {
                ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).waitFor();
            }
            synchronized (com.tencent.luggage.sdk.processes.r.f47681e) {
                rVar = com.tencent.luggage.sdk.processes.r.f47682f;
                if (rVar == null) {
                    kotlin.jvm.internal.o.o("INSTANCE_");
                    throw null;
                }
            }
            rVar.q(com.tencent.luggage.sdk.processes.c.f47634h);
        }
        return false;
    }
}
