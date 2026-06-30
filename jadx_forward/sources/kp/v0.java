package kp;

/* loaded from: classes7.dex */
public final class v0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {
    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "removeGroupAsync onFailure: " + i17);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "removeGroupAsync onSuccess");
    }
}
