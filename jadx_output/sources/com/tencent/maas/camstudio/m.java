package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class m extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.j f47966a;

    public m(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, com.tencent.maas.camstudio.j jVar, boolean z17) {
        super(mJCDNBridgeService, z17);
        this.f47966a = jVar;
    }

    @Override // com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnCancelArg onCancelArg = (com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg.OnCancelArg) obj;
        com.tencent.maas.camstudio.j jVar = this.f47966a;
        if (jVar == null || onCancelArg == null) {
            return;
        }
        jVar.d(onCancelArg.taskKey);
    }
}
