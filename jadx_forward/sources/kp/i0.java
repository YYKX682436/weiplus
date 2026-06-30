package kp;

/* loaded from: classes13.dex */
public final class i0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f392294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392295c;

    public i0(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar, kp.i1 i1Var) {
        this.f392293a = str;
        this.f392294b = qVar;
        this.f392295c = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "connection fail: " + i17);
        kp.i1 i1Var = this.f392295c;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) i1Var.f392301i).k(java.lang.Boolean.FALSE);
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR;
        if (i17 == 1) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT;
        } else if (!i1Var.cj()) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_NOT_ENABLED;
        } else if (i1Var.bj()) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_AP_ENABLED;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f392294b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(false, xf0Var, "connectToGroup: connection fail: " + i17)));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "connection request sent to " + this.f392293a + "，waiting for response...");
        this.f392294b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(true, null, null, 6, null)));
    }
}
