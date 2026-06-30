package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class v<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v f77969d = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, passedAppId is null");
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n1 n1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77939e;
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(3));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        u81.h hVar = b17 != null ? b17.N : null;
        if (hVar == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, runningStateController is null");
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n1 n1Var2 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77939e;
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(3));
            return;
        }
        int ordinal = hVar.b().ordinal();
        if (ordinal == 0) {
            o1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77940f;
        } else if (ordinal == 1) {
            o1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77941g;
        } else if (ordinal == 2) {
            o1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77942h;
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            o1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77943i;
        }
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, runningState: " + o1Var);
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(o1Var.f77945d));
    }
}
