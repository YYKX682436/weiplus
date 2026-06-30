package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class l extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.j f47964a;

    public l(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, com.tencent.maas.camstudio.j jVar, boolean z17) {
        super(mJCDNBridgeService, z17);
        this.f47964a = jVar;
    }

    @Override // com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnBeginUploadArg onBeginUploadArg = (com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnBeginUploadArg) obj;
        com.tencent.maas.camstudio.j jVar = this.f47964a;
        if (jVar == null || onBeginUploadArg == null) {
            return;
        }
        jVar.c(onBeginUploadArg.request);
    }
}
