package com.tencent.mm.plugin.ai.data.business.trigger;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.plugin.ai.data.business.trigger.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f74669a = new com.tencent.mm.plugin.ai.data.business.trigger.FinderTrigger$1(this, com.tencent.mm.app.a0.f53288d);

    public static void c(com.tencent.mm.plugin.ai.data.business.trigger.g gVar, java.lang.String str) {
        java.lang.String[] split;
        gVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (split = str.split(",")) != null && split.length >= 5 && "All".equals(split[1])) {
            long V = com.tencent.mm.sdk.platformtools.t8.V(split[3], 0L) / 1000;
            long V2 = com.tencent.mm.sdk.platformtools.t8.V(split[4], 0L) / 1000;
            c81.b wi6 = c81.b.wi();
            wi6.requireAccountInitialized();
            wi6.f39656d.c("last_enter_finder_time", V);
            c81.b wi7 = c81.b.wi();
            wi7.requireAccountInitialized();
            wi7.f39656d.c("last_exit_finder_time", V2);
        }
    }

    @Override // com.tencent.mm.plugin.ai.data.business.trigger.h
    public void a() {
        this.f74669a.alive();
    }

    @Override // com.tencent.mm.plugin.ai.data.business.trigger.h
    public void b() {
        this.f74669a.dead();
    }
}
