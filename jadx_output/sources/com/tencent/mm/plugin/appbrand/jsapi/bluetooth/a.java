package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public class a extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            boolean z17 = defaultAdapter.getState() == 12;
            boolean z18 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.f80048c;
            if ((z18 && !z17) || (!z18 && z17)) {
                java.util.Iterator it = ((java.util.HashMap) com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.f80046a).values().iterator();
                while (it.hasNext()) {
                    java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e) it.next()).f80059g).iterator();
                    while (it6.hasNext()) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d) it6.next()).onBluetoothStateChange(z17);
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.f80048c = z17;
        }
    }
}
