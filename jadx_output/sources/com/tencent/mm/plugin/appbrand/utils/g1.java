package com.tencent.mm.plugin.appbrand.utils;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/utils/g1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class g1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        if (((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).Ai()) {
            return new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492319g14));
        }
        ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
        if (!vq4.p0.d()) {
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (!vq4.p0.c() && !iq.b.H()) {
                if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
                    java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Bi()).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp appBrandBackgroundRunningApp = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next();
                        if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(appBrandBackgroundRunningApp.f76923f, 4)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipHelper", "isAnyAppInVOIP, already exist wxa using VOIP");
                        } else if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(appBrandBackgroundRunningApp.f76923f, 16)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipHelper", "isAnyAppInVOIP, already exist wxa using VOIP 1v1");
                        }
                        z17 = true;
                    }
                }
                z17 = false;
                return z17 ? new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g17)) : new com.tencent.mm.ipcinvoker.type.IPCString("");
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g18));
    }
}
