package com.tencent.mm.plugin.appbrand.keepalive;

@mk0.a
/* loaded from: classes13.dex */
final class i implements com.tencent.mm.ipcinvoker.j {
    private i() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.keepalive.d dVar;
        boolean z17;
        com.tencent.mm.plugin.appbrand.keepalive.e eVar = com.tencent.mm.plugin.appbrand.keepalive.e.f84088b;
        java.lang.String iPCString = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).toString();
        eVar.getClass();
        if (!android.text.TextUtils.isEmpty(iPCString)) {
            synchronized (eVar.f84089a) {
                dVar = (com.tencent.mm.plugin.appbrand.keepalive.d) eVar.f84089a.get(iPCString);
            }
            if (dVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandKeepAliveMMSavior", "unbindKeepAliveService not had connector of %s", iPCString);
            } else {
                synchronized (dVar) {
                    z17 = true;
                    dVar.f84085a--;
                    dVar.f84085a = java.lang.Math.max(0, dVar.f84085a);
                    if (dVar.f84085a != 0) {
                        z17 = false;
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService, processName:%s", dVar.f84086b);
                    try {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(dVar.f84087c);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService exp:%s", e17);
                    }
                }
            }
        }
        try {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        } catch (java.lang.SecurityException unused) {
        }
    }
}
