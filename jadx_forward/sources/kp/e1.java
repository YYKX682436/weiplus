package kp;

/* loaded from: classes13.dex */
public final class e1 implements android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f392265b;

    public e1(kp.i1 i1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f392264a = i1Var;
        this.f392265b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
    public final void onDeviceInfoAvailable(android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice) {
        java.lang.String str;
        java.lang.String str2 = null;
        if (wifiP2pDevice != null && (str = wifiP2pDevice.deviceName) != null && (!r26.n0.N(str))) {
            str2 = str;
        }
        if (str2 != null) {
            this.f392264a.f392305p = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "fetch local p2p deviceName=".concat(str2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WiFiDirectService", "fetch local p2p deviceName empty");
        }
        if (((p3325xe03a0797.p3326xc267989b.r) this.f392265b).n()) {
            this.f392265b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str2));
        }
    }
}
