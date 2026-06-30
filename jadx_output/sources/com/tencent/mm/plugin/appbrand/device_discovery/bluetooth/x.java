package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class x<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.x f77973a = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.x();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        boolean z17 = false;
        if (str == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, passedAppId is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        u81.h hVar = b17 != null ? b17.N : null;
        if (hVar == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, runningStateController is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        if (u81.b.BACKGROUND == hVar.b() && !hVar.d()) {
            z17 = true;
        }
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, isInBackgroundTemporary: " + z17);
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}
