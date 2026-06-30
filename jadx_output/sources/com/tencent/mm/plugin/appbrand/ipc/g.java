package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public enum g implements com.tencent.mm.ipcinvoker.t0 {
    INSTANCE;

    @Override // com.tencent.mm.ipcinvoker.t0
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMainProcessService", "onDisconnect: [%s] disconnected, reconnect immediately", com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.plugin.appbrand.ipc.f.a();
    }
}
