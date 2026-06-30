package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1", "Landroid/content/BroadcastReceiver;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 extends android.content.BroadcastReceiver {
    public final void a() {
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        java.lang.Boolean bool = null;
        java.lang.Integer valueOf = d17 != null ? java.lang.Integer.valueOf(d17.getState()) : null;
        if (valueOf == null) {
            t91.a.f416567a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state is null");
        } else if (12 == valueOf.intValue()) {
            bool = java.lang.Boolean.TRUE;
        } else if (10 == valueOf.intValue()) {
            bool = java.lang.Boolean.FALSE;
        } else {
            t91.a.f416567a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state: " + valueOf);
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c1 c1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77964c;
            if (c1Var != null) {
                c1Var.onBluetoothStateChange(booleanValue);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a();
    }
}
