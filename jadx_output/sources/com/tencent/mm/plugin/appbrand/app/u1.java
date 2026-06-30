package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public final class u1 extends com.tencent.mm.sdk.event.n {
    public u1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExptChangeEvent event = (com.tencent.mm.autogen.events.ExptChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.appbrand.app.g2.f75089d.Ri();
        return false;
    }
}
