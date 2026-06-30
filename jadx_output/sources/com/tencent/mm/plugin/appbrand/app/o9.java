package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class o9 extends com.tencent.mm.sdk.event.n {
    public o9() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.o6> linkedList;
        com.tencent.mm.plugin.appbrand.app.CollectRuntimeInfoEvent event = (com.tencent.mm.plugin.appbrand.app.CollectRuntimeInfoEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84209b;
        synchronized (linkedHashMap) {
            linkedList = new java.util.LinkedList(linkedHashMap.values());
        }
        for (com.tencent.mm.plugin.appbrand.o6 o6Var : linkedList) {
            if (!(o6Var instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t)) {
                o6Var.u3();
            }
        }
        return false;
    }
}
