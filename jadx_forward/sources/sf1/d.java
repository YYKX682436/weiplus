package sf1;

/* loaded from: classes13.dex */
public class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.wifi.WifiConfiguration f488492a;

    public d(sf1.e eVar, android.net.wifi.WifiConfiguration wifiConfiguration) {
        this.f488492a = wifiConfiguration;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (method.getName().compareTo("onSuccess") == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiConnector", "connectWifi use ActionListener success");
            return null;
        }
        if (method.getName().compareTo("onFailure") == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WiFiConnector", "connectWifi use ActionListener fail, fallback to enableNetwork");
            try {
                sf1.s.f488552a.enableNetwork(this.f488492a.networkId, true);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WifiManagerInternalWrapper", th6, "enableNetwork", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
