package rf1;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f476162a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f476163b;

    /* renamed from: c, reason: collision with root package name */
    public static rf1.h f476164c;

    /* renamed from: d, reason: collision with root package name */
    public static rf1.f f476165d;

    /* renamed from: e, reason: collision with root package name */
    public static android.content.Context f476166e;

    /* renamed from: f, reason: collision with root package name */
    public static android.content.BroadcastReceiver f476167f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile rf1.g f476168g;

    public static rf1.i a(boolean z17) {
        java.util.List<android.net.wifi.ScanResult> list;
        java.lang.String str;
        int i17;
        rf1.i iVar = new rf1.i();
        java.lang.String str2 = null;
        f476164c = null;
        if (f476162a && sf1.s.b()) {
            if (z17) {
                sf1.s.d();
            }
            try {
                list = (java.util.List) yj0.a.j(sf1.s.f488552a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getScanResults", "()Ljava/util/List;", "android/net/wifi/WifiManager", "getScanResults", "()Ljava/util/List;");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "getScanResults", new java.lang.Object[0]);
                list = null;
            }
            iVar.f476161b = new java.util.ArrayList();
            iVar.f476160a = "ok";
            if (list != null) {
                list.size();
                android.net.wifi.WifiInfo a17 = sf1.s.a();
                if (a17 == null || android.text.TextUtils.isEmpty(a17.getSSID())) {
                    str = null;
                } else {
                    str2 = sf1.t.b(a17.getSSID());
                    str = a17.getBSSID();
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                }
                for (android.net.wifi.ScanResult scanResult : list) {
                    if (scanResult != null) {
                        java.lang.String str3 = scanResult.capabilities;
                        char c17 = str3 == null ? (char) 65535 : str3.contains("WEP") ? (char) 1 : scanResult.capabilities.contains("PSK") ? (char) 2 : scanResult.capabilities.contains("EAP") ? (char) 3 : (char) 0;
                        rf1.h hVar = new rf1.h();
                        hVar.f476155a = sf1.t.b(scanResult.SSID);
                        java.lang.String str4 = scanResult.BSSID;
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        hVar.f476156b = str4;
                        int i18 = scanResult.level;
                        if (i18 <= -100) {
                            i17 = 0;
                        } else {
                            i17 = 99;
                            if (i18 < -55) {
                                i17 = (int) (((i18 + 100) * 99) / 45.0f);
                            }
                        }
                        hVar.f476157c = java.lang.Integer.valueOf(i17);
                        hVar.f476158d = java.lang.Boolean.valueOf(c17 == 2);
                        hVar.f476159e = java.lang.Integer.valueOf(scanResult.frequency);
                        if (str2 != null && str != null && hVar.f476155a.compareTo(str2) == 0 && hVar.f476156b.compareTo(str) == 0) {
                            f476164c = hVar;
                        }
                        if (c17 == 0 || c17 == 2) {
                            ((java.util.ArrayList) iVar.f476161b).add(hVar);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "[getWifiList] mCurrentWiFi: " + f476164c);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
            }
        } else if (f476162a) {
            iVar.f476160a = "wifi is disable";
        } else {
            iVar.f476160a = "sdk not init";
        }
        return iVar;
    }

    public static void b(android.content.Context context) {
        if (f476162a || context == null) {
            return;
        }
        f476166e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "initSdk, register WifiScanResultBroadcastReceiver");
        if (f476167f == null) {
            f476167f = new rf1.k(null);
        }
        f476166e.registerReceiver(f476167f, new android.content.IntentFilter("android.net.wifi.SCAN_RESULTS"));
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) f476166e.getSystemService("wifi");
        if (wifiManager != null) {
            sf1.s.f488552a = wifiManager;
            f476162a = true;
        }
    }
}
