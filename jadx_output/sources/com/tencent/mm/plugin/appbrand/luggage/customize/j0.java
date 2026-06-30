package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes.dex */
final class j0 implements com.tencent.mm.ipcinvoker.k0 {
    private j0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaMapViewFactoryWC", "ipc IsOverseaUserTask");
            boolean equalsIgnoreCase = "CN".equalsIgnoreCase((java.lang.String) gm0.j1.u().c().l(274436, null));
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaMapViewFactoryWC", "chinaReg:%b", java.lang.Boolean.valueOf(equalsIgnoreCase));
            if (equalsIgnoreCase) {
                z17 = false;
            }
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaMapViewFactoryWC", e17, "ipc IsOverseaUserTask task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
    }
}
