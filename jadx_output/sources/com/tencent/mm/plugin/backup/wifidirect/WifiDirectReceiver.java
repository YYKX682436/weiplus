package com.tencent.mm.plugin.backup.wifidirect;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/wifidirect/WifiDirectReceiver;", "Landroid/content/BroadcastReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WifiDirectReceiver extends android.content.BroadcastReceiver {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        com.tencent.mars.xlog.Log.i("MicroMsg.WifiDirectReceiver", "p2p action: " + action);
        if (action != null) {
            switch (action.hashCode()) {
                case -1772632330:
                    str = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
                    action.equals(str);
                    return;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED") && (wifiP2pDevice = (android.net.wifi.p2p.WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice")) != null) {
                        java.lang.String deviceName = wifiP2pDevice.deviceName;
                        kotlin.jvm.internal.o.f(deviceName, "deviceName");
                        com.tencent.mars.xlog.Log.i("MicroMsg.WifiDirectReceiver", "p2p deivceName:%s, deviceAddress:%s, isGroupOwner:%b, status:%d ", wifiP2pDevice.deviceName, wifiP2pDevice.deviceAddress, java.lang.Boolean.valueOf(wifiP2pDevice.isGroupOwner()), java.lang.Integer.valueOf(wifiP2pDevice.status));
                        return;
                    }
                    return;
                case -1394739139:
                    str = "android.net.wifi.p2p.PEERS_CHANGED";
                    action.equals(str);
                    return;
                case 1695662461:
                    if (action.equals("android.net.wifi.p2p.STATE_CHANGED")) {
                        int intExtra = intent.getIntExtra("wifi_p2p_state", -1);
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = java.lang.Integer.valueOf(intExtra);
                        objArr[1] = java.lang.Boolean.valueOf(intExtra == 2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WifiDirectReceiver", "p2p state: %s, enable:%b", objArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
