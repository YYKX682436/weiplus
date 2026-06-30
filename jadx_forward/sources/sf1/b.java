package sf1;

/* loaded from: classes13.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f488490a;

    public b(sf1.e eVar) {
        this.f488490a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiConnector", "startMonitorWiFiEvent, action: " + action);
        boolean equals = io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be.equals(action);
        sf1.e eVar = this.f488490a;
        if (equals || "android.net.wifi.STATE_CHANGE".equals(action)) {
            android.net.NetworkInfo activeNetworkInfo = eVar.f488500h.getActiveNetworkInfo();
            android.net.wifi.WifiInfo a17 = sf1.s.a();
            if (activeNetworkInfo != null && a17 != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.getDetailedState() == android.net.NetworkInfo.DetailedState.CONNECTED && a17.getNetworkId() == eVar.f488497e.networkId) {
                eVar.b(true, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.wifi_event", "CONNECTIVITY_ACTION CONNECTED.");
                return;
            }
            return;
        }
        if ("android.net.wifi.supplicant.STATE_CHANGE".equals(action)) {
            int i17 = -1;
            try {
                i17 = intent.getIntExtra("supplicantError", -1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WiFiConnector", e17.getMessage());
            }
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WiFiConnector", "ERROR_AUTHENTICATING");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.wifi_event", "ERROR_AUTHENTICATING FAIL.");
                eVar.b(false, eVar.f488503k ? "wifi config may be expired" : "password error");
            }
        }
    }
}
