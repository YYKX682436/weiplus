package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes.dex */
final class e0 implements com.tencent.mm.ipcinvoker.k0 {
    private e0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        if (gm0.j1.a()) {
            return new com.tencent.mm.ipcinvoker.type.IPCString(gm0.j1.u().h());
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.DefaultKeyStepLogger", "IPCGetAccPath not accHasReady");
        return new com.tencent.mm.ipcinvoker.type.IPCString(null);
    }
}
