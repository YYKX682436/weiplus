package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1", "Landroid/content/BroadcastReceiver;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 */
/* loaded from: classes7.dex */
public final class C11857xff31332d extends android.content.BroadcastReceiver {
    public final void a() {
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        java.lang.Boolean bool = null;
        java.lang.Integer valueOf = d17 != null ? java.lang.Integer.valueOf(d17.getState()) : null;
        if (valueOf == null) {
            t91.a.f498100a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state is null");
        } else if (12 == valueOf.intValue()) {
            bool = java.lang.Boolean.TRUE;
        } else if (10 == valueOf.intValue()) {
            bool = java.lang.Boolean.FALSE;
        } else {
            t91.a.f498100a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state: " + valueOf);
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159497c;
            if (c1Var != null) {
                c1Var.mo50221xc065fc92(booleanValue);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a();
    }
}
