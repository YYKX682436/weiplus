package com.tencent.mm.booter.notification;

/* loaded from: classes8.dex */
public final class r extends com.tencent.mm.sdk.event.n {
    public r() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = (com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a() || gm0.j1.s(c25.e.class) == null) {
            return false;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizServiceMuteWhitelist");
        if (d17 == null) {
            d17 = "";
        }
        bn0.g gVar = bn0.g.f22779a;
        if (d17.equals(gVar.b("MXM_DynaCfg_BizServiceMuteWhitelist", ""))) {
            return false;
        }
        gVar.h("MXM_DynaCfg_BizServiceMuteWhitelist", d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushDynamicConfigUpdated", "update_MXM_DynaCfg_BizServiceMuteWhitelist");
        return false;
    }
}
