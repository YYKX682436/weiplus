package rf1;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rf1.e f476154a = new rf1.e();

    public final rf1.h a(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "get, preventScanWifi: true, acceptIncompleteWiFiItem: " + z17);
        android.net.wifi.WifiInfo a17 = sf1.s.a();
        android.net.wifi.WifiConfiguration wifiConfiguration = null;
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "getIncompleteWiFiItem, wifiInfo.ssid: " + a17.getSSID() + ", wifiInfo.bssid: " + a17.getBSSID());
        rf1.h hVar = new rf1.h();
        hVar.f476155a = sf1.t.b(a17.getSSID());
        java.lang.String bssid = a17.getBSSID();
        hVar.f476156b = bssid;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bssid, a17.getBSSID())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, connectionInfo got");
            int rssi = a17.getRssi();
            if (rssi <= -100) {
                i17 = 0;
            } else {
                i17 = 99;
                if (rssi < -55) {
                    i17 = (int) (((rssi - (-100)) * 99) / 45.0f);
                }
            }
            hVar.f476157c = java.lang.Integer.valueOf(i17);
            hVar.f476159e = java.lang.Integer.valueOf(a17.getFrequency());
        }
        java.lang.String str = hVar.f476156b;
        java.util.List b17 = sf1.f.b();
        if (b17 != null) {
            java.util.Iterator it = b17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.net.wifi.WifiConfiguration wifiConfiguration2 = (android.net.wifi.WifiConfiguration) it.next();
                if (java.util.Objects.equals(wifiConfiguration2.BSSID, str)) {
                    wifiConfiguration = wifiConfiguration2;
                    break;
                }
            }
        }
        if (wifiConfiguration != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, wifiConfig not null");
            hVar.f476158d = java.lang.Boolean.valueOf(2 == sf1.t.a(wifiConfiguration));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, signalStrength: " + hVar.f476157c + ", frequency: " + hVar.f476159e + ", security: " + hVar.f476158d);
        return hVar;
    }
}
