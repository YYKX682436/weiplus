package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
class m implements com.tencent.mm.ipcinvoker.k0 {
    private m() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17 = 0;
        if (!i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(0);
        }
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Bi()).iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76923f, 2)) {
                i17++;
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
    }
}
