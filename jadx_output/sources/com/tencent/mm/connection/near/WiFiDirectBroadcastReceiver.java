package com.tencent.mm.connection.near;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/connection/near/WiFiDirectBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "connection-near_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class WiFiDirectBroadcastReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final kp.i1 f64792a;

    public WiFiDirectBroadcastReceiver(kp.i1 service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f64792a = service;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            kp.i1 i1Var = this.f64792a;
            jz5.f0 f0Var = null;
            switch (hashCode) {
                case -1772632330:
                    if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE")) {
                        com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "========== connection changed ==========");
                        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            if (networkInfo.isConnected()) {
                                android.net.wifi.p2p.WifiP2pManager wifiP2pManager = i1Var.f310764e;
                                if (wifiP2pManager == null) {
                                    com.tencent.mars.xlog.Log.e("WiFiDirectService", "WiFiP2pManager is null, cannot request connection info");
                                } else {
                                    android.net.wifi.p2p.WifiP2pManager.Channel channel = i1Var.f310765f;
                                    if (channel != null) {
                                        wifiP2pManager.requestConnectionInfo(channel, new kp.b1(i1Var));
                                    }
                                }
                            } else {
                                i1Var.getClass();
                                com.tencent.mars.xlog.Log.i("WiFiDirectService", "connection terminated (broadcast received)");
                                ((kotlinx.coroutines.flow.h3) i1Var.f310767h).k(null);
                                ((kotlinx.coroutines.flow.h3) i1Var.f310768i).k(java.lang.Boolean.FALSE);
                            }
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "empty network info");
                            return;
                        }
                        return;
                    }
                    return;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED")) {
                        android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice = (android.net.wifi.p2p.WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("device info change: ");
                        sb6.append(wifiP2pDevice != null ? wifiP2pDevice.deviceName : null);
                        com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", sb6.toString());
                        return;
                    }
                    return;
                case -343630553:
                    if (action.equals("android.net.wifi.STATE_CHANGE")) {
                        android.net.NetworkInfo networkInfo2 = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
                        com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "network state changed: " + networkInfo2);
                        if ((networkInfo2 != null ? networkInfo2.getDetailedState() : null) == android.net.NetworkInfo.DetailedState.CONNECTED) {
                            i1Var.getClass();
                            com.tencent.mars.xlog.Log.i("WiFiDirectService", "onConnectToWifi");
                            yz5.l lVar = i1Var.f310770n;
                            if (lVar != null) {
                                lVar.invoke(java.lang.Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 233521600:
                    if (action.equals("android.net.wifi.supplicant.STATE_CHANGE")) {
                        int intExtra = intent.getIntExtra("supplicantError", -1);
                        com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "suplicant state changed: " + intExtra);
                        if (intExtra == 1) {
                            i1Var.getClass();
                            com.tencent.mars.xlog.Log.e("WiFiDirectService", "onConnectToWifiFailed");
                            yz5.l lVar2 = i1Var.f310770n;
                            if (lVar2 != null) {
                                lVar2.invoke(java.lang.Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1695662461:
                    if (action.equals("android.net.wifi.p2p.STATE_CHANGED")) {
                        int intExtra2 = intent.getIntExtra("wifi_p2p_state", -1);
                        if (intExtra2 == 1) {
                            com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "WiFi Direct disabled");
                            return;
                        } else {
                            if (intExtra2 != 2) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("WiFiDirectBroadcastReceiver", "WiFi Direct enabled");
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
