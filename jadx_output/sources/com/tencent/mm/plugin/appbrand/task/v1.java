package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes5.dex */
public final class v1 extends com.tencent.mm.sdk.event.n {
    public v1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FontSizeChangedEvent event = (com.tencent.mm.autogen.events.FontSizeChangedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.StaticOnFontSizeChangedEventListener", "FontSizeChangedEvent received, killAllApps");
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().r();
        return false;
    }
}
