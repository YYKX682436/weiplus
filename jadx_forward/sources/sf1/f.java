package sf1;

/* loaded from: classes13.dex */
public abstract class f {
    public static boolean a(int i17) {
        boolean z17;
        boolean z18;
        try {
            z17 = sf1.s.f488552a.removeNetwork(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "removeNetwork", new java.lang.Object[0]);
            z17 = false;
        }
        if (!z17) {
            try {
                z18 = sf1.s.f488552a.disableNetwork(i17);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th7, "disableNetwork", new java.lang.Object[0]);
                z18 = false;
            }
            if (!z18) {
                return false;
            }
        }
        sf1.s.c();
        return true;
    }

    public static java.util.List b() {
        try {
            return (java.util.List) yj0.a.j(sf1.s.f488552a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getConfiguredNetworks", "()Ljava/util/List;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "getConfiguredNetworks", new java.lang.Object[0]);
            return null;
        }
    }
}
