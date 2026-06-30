package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class d1 extends com.tencent.mm.sdk.event.n {
    public d1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.XWebViewInitCompleteEvent event = (com.tencent.mm.autogen.events.XWebViewInitCompleteEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!com.tencent.xweb.WebView.y0()) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.AppBrandPersistentRuntimeConfig").putBoolean("KEY_XWEB_INSTALLED", com.tencent.xweb.a3.k(2003));
        return false;
    }
}
