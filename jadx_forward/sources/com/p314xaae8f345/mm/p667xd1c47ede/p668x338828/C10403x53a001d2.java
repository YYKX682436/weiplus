package com.p314xaae8f345.mm.p667xd1c47ede.p668x338828;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/connection/near/WiFiDirectBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "connection-near_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.connection.near.WiFiDirectBroadcastReceiver */
/* loaded from: classes13.dex */
public final class C10403x53a001d2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final kp.i1 f146325a;

    public C10403x53a001d2(kp.i1 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f146325a = service;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            kp.i1 i1Var = this.f146325a;
            jz5.f0 f0Var = null;
            switch (hashCode) {
                case -1772632330:
                    if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "========== connection changed ==========");
                        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            if (networkInfo.isConnected()) {
                                android.net.wifi.p2p.WifiP2pManager wifiP2pManager = i1Var.f392297e;
                                if (wifiP2pManager == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "WiFiP2pManager is null, cannot request connection info");
                                } else {
                                    android.net.wifi.p2p.WifiP2pManager.Channel channel = i1Var.f392298f;
                                    if (channel != null) {
                                        wifiP2pManager.requestConnectionInfo(channel, new kp.b1(i1Var));
                                    }
                                }
                            } else {
                                i1Var.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "connection terminated (broadcast received)");
                                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) i1Var.f392300h).k(null);
                                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) i1Var.f392301i).k(java.lang.Boolean.FALSE);
                            }
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "empty network info");
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", sb6.toString());
                        return;
                    }
                    return;
                case -343630553:
                    if (action.equals("android.net.wifi.STATE_CHANGE")) {
                        android.net.NetworkInfo networkInfo2 = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "network state changed: " + networkInfo2);
                        if ((networkInfo2 != null ? networkInfo2.getDetailedState() : null) == android.net.NetworkInfo.DetailedState.CONNECTED) {
                            i1Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "onConnectToWifi");
                            yz5.l lVar = i1Var.f392303n;
                            if (lVar != null) {
                                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "suplicant state changed: " + intExtra);
                        if (intExtra == 1) {
                            i1Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "onConnectToWifiFailed");
                            yz5.l lVar2 = i1Var.f392303n;
                            if (lVar2 != null) {
                                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "WiFi Direct disabled");
                            return;
                        } else {
                            if (intExtra2 != 2) {
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectBroadcastReceiver", "WiFi Direct enabled");
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
