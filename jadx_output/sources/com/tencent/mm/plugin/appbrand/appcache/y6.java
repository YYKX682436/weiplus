package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class y6 extends com.tencent.mm.sdk.event.n {
    public y6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent event = (com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (gm0.j1.a()) {
            com.tencent.mars.cdn.CdnManager.WebPageProfile webPageProfile = null;
            am.b30 b30Var = event.f55000g;
            if (com.tencent.mm.plugin.appbrand.appcache.b5.b(b30Var != null ? b30Var.f6215b : null)) {
                int i17 = b30Var.f6214a;
                if (i17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(368, 74);
                } else if (i17 == 2) {
                    com.tencent.mm.pluginsdk.res.downloader.model.v vVar = b30Var.f6216c;
                    if (vVar == null || vVar.f189729g != 2) {
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.A(368, 77);
                        com.tencent.mm.pluginsdk.res.downloader.model.v vVar2 = b30Var.f6216c;
                        if (vVar2 != null && (bundle = vVar2.f189732j) != null) {
                            webPageProfile = (com.tencent.mars.cdn.CdnManager.WebPageProfile) bundle.getParcelable("RESPONSE_KEY_CRONET_PERFORMANCE");
                        }
                        if (webPageProfile != null && webPageProfile.socketReused) {
                            g0Var.A(368, 78);
                        }
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.A(368, 75);
                        com.tencent.mm.pluginsdk.res.downloader.model.v vVar3 = b30Var.f6216c;
                        if (vVar3 != null && (bundle2 = vVar3.f189732j) != null) {
                            webPageProfile = (com.tencent.mars.cdn.CdnManager.WebPageProfile) bundle2.getParcelable("RESPONSE_KEY_CRONET_PERFORMANCE");
                        }
                        if (webPageProfile != null && webPageProfile.socketReused) {
                            g0Var2.A(368, 76);
                        }
                    }
                }
            }
        }
        return false;
    }
}
