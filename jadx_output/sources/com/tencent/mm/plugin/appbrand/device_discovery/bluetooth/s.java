package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77955d;

    public s(yz5.l lVar) {
        this.f77955d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.Object createFailure;
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        yz5.l lVar = this.f77955d;
        if (iPCBoolean == null) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "setInfoAsync, data is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j1(null, 1, null)))));
            return;
        }
        if (iPCBoolean.f68400d) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            createFailure = jz5.f0.f302826a;
        } else {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            createFailure = kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j1(null, 1, null));
        }
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(createFailure)));
    }
}
