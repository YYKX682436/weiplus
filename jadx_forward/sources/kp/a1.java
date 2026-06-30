package kp;

/* loaded from: classes13.dex */
public final class a1 implements android.net.wifi.p2p.WifiP2pManager.GroupInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392248a;

    public a1(kp.i1 i1Var) {
        this.f392248a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "Group info is null");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new kp.z0(this.f392248a, wifiP2pGroup, null), 3, null);
        }
    }
}
