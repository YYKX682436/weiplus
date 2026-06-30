package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class n0 {
    public n0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274512g;
        if (t0Var != null) {
            return t0Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
        if (wifiManager.getWifiState() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "not wifi currently, return empty wifi info");
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(null);
        }
        i0Var.b();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return i0Var.a(context, wifiManager);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConnectivityCompat", "acquireWiFiInfo29(): access_fine_location perm not granted.");
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(null);
        }
        if (i17 >= 27) {
            return i0Var.a(context, wifiManager);
        }
        android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo", "()Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        return wifiInfo != null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(wifiInfo) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(null);
    }
}
