package qf1;

/* loaded from: classes13.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76481x366c91de = 314;

    /* renamed from: NAME */
    public static final java.lang.String f76482x24728b = "startWifi";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f443811g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
        android.content.Context a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(lVar.mo50352x76847179());
        rf1.l.b(a17);
        if (!f443811g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "enable");
            if (rf1.d.f476152a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "enable, already enabled");
            } else {
                android.content.Context a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(a17);
                rf1.d.f476152a = true;
                if (rf1.d.f476153b == null) {
                    rf1.b bVar = new rf1.b();
                    rf1.d.f476153b = bVar;
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
                    intentFilter.setPriority(Integer.MAX_VALUE);
                    a18.registerReceiver(bVar, intentFilter);
                    android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a18.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, connectivityManager is null");
                    } else {
                        try {
                            connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().removeCapability(14).build(), bVar.f476150a);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ConnectWifiEvents", e17, "registerNetworkCallback failure", new java.lang.Object[0]);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is not null");
                }
            }
            rf1.d.a(new qf1.k(this, lVar));
            f443811g = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), new qf1.l(this, a17, lVar));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 0);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
    }
}
