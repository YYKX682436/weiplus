package kp;

/* loaded from: classes13.dex */
public final class p0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f392345b;

    public p0(kp.i1 i1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f392344a = i1Var;
        this.f392345b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "Failed to create group: " + i17);
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR;
        if (i17 == 1) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT;
        } else {
            kp.i1 i1Var = this.f392344a;
            if (!i1Var.cj()) {
                xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_NOT_ENABLED;
            } else if (i1Var.bj()) {
                xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_AP_ENABLED;
            }
        }
        bw5.xf0 xf0Var2 = xf0Var;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f392345b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.b(false, xf0Var2, "createGroup: Failed to create group: " + i17, null, null, 24, null)));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "Create group success");
        this.f392344a.f392304o = true;
        this.f392345b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.b(true, null, null, null, null, 30, null)));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("group_created", true);
    }
}
