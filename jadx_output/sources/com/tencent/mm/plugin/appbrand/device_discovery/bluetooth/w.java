package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar) {
        super(1);
        this.f77970d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var;
        com.tencent.mm.ipcinvoker.type.IPCInteger flattenValHolder = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        kotlin.jvm.internal.o.g(flattenValHolder, "flattenValHolder");
        int i17 = flattenValHolder.f68404d;
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, flattenVal: " + i17);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77939e.getClass();
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1[] values = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                o1Var = null;
                break;
            }
            o1Var = values[i18];
            if (i17 == o1Var.f77945d) {
                break;
            }
            i18++;
        }
        if (o1Var == null) {
            o1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77943i;
        }
        this.f77970d.invoke(o1Var);
        return jz5.f0.f302826a;
    }
}
