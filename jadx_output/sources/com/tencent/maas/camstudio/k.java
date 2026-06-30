package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class k extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.j f47963a;

    public k(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, com.tencent.maas.camstudio.j jVar, boolean z17) {
        super(mJCDNBridgeService, z17);
        this.f47963a = jVar;
    }

    @Override // com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnBeginDownloadArg onBeginDownloadArg = (com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnBeginDownloadArg) obj;
        com.tencent.maas.camstudio.j jVar = this.f47963a;
        if (jVar == null || onBeginDownloadArg == null) {
            return;
        }
        jVar.b(onBeginDownloadArg.request);
    }
}
