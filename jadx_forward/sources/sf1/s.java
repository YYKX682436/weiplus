package sf1;

/* loaded from: classes13.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static android.net.wifi.WifiManager f488552a;

    public static android.net.wifi.WifiInfo a() {
        try {
            return (android.net.wifi.WifiInfo) yj0.a.j(f488552a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "getConnectionInfo", new java.lang.Object[0]);
            return null;
        }
    }

    public static boolean b() {
        try {
            return f488552a.isWifiEnabled();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "isWifiEnabled", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c() {
        try {
            return f488552a.saveConfiguration();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "saveConfiguration", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean d() {
        try {
            return ((java.lang.Boolean) yj0.a.j(f488552a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "startScan", "()Z", "android/net/wifi/WifiManager", "startScan", "()Z")).booleanValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "startScan", new java.lang.Object[0]);
            return false;
        }
    }
}
