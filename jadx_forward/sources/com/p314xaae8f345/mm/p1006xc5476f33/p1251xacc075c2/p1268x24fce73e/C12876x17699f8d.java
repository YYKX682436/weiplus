package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1268x24fce73e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/backup/wifidirect/WifiDirectReceiver;", "Landroid/content/BroadcastReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.wifidirect.WifiDirectReceiver */
/* loaded from: classes4.dex */
public final class C12876x17699f8d extends android.content.BroadcastReceiver {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WifiDirectReceiver", "p2p action: " + action);
        if (action != null) {
            switch (action.hashCode()) {
                case -1772632330:
                    str = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
                    action.equals(str);
                    return;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED") && (wifiP2pDevice = (android.net.wifi.p2p.WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice")) != null) {
                        java.lang.String deviceName = wifiP2pDevice.deviceName;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deviceName, "deviceName");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WifiDirectReceiver", "p2p deivceName:%s, deviceAddress:%s, isGroupOwner:%b, status:%d ", wifiP2pDevice.deviceName, wifiP2pDevice.deviceAddress, java.lang.Boolean.valueOf(wifiP2pDevice.isGroupOwner()), java.lang.Integer.valueOf(wifiP2pDevice.status));
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WifiDirectReceiver", "p2p state: %s, enable:%b", objArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
