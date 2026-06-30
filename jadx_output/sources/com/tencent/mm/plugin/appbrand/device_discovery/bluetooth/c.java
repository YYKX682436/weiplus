package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class c implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    private c() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean isEmpty;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b;
        synchronized (aVar) {
            isEmpty = ((android.util.ArraySet) aVar.f77864b).isEmpty();
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(isEmpty));
    }
}
