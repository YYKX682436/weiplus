package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class b7 extends com.tencent.mm.sdk.event.n {
    public b7() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WxaPkgPreConnectCDNEvent event = (com.tencent.mm.autogen.events.WxaPkgPreConnectCDNEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Integer num = event.f55002g != null ? 0 : null;
        if (num != null && num.intValue() == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(368, 71);
        } else if (num != null && num.intValue() == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(368, 73);
        }
        return false;
    }
}
