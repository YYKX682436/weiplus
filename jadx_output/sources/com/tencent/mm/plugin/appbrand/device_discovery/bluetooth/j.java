package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams;", "kotlin.jvm.PlatformType", "deleteInfoParams", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "ipcCallback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class j<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j f77899d = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams appBrandMonitoredBluetoothDeviceService$DeleteInfoParams = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams) obj;
        java.lang.String str = appBrandMonitoredBluetoothDeviceService$DeleteInfoParams != null ? appBrandMonitoredBluetoothDeviceService$DeleteInfoParams.f77856d : null;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, passedAppId is empty");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        java.lang.String str2 = appBrandMonitoredBluetoothDeviceService$DeleteInfoParams.f77857e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.d(str, str2)));
        } else {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, passedWechatToken is empty");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        }
    }
}
