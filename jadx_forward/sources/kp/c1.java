package kp;

/* loaded from: classes13.dex */
public final class c1 implements android.net.wifi.p2p.WifiP2pManager.GroupInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392253a;

    public c1(kp.i1 i1Var) {
        this.f392253a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
        kp.i1 i1Var = this.f392253a;
        if (wifiP2pGroup == null || !wifiP2pGroup.isGroupOwner()) {
            yz5.l lVar = i1Var.f392302m;
            if (lVar != null) {
                lVar.mo146xb9724478(new gz.b(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR, "createGroup: Group info is null", null, null, 24, null));
            }
            i1Var.f392302m = null;
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "group frequency: " + wifiP2pGroup.getFrequency());
        }
        java.lang.String networkName = wifiP2pGroup.getNetworkName();
        java.lang.String passphrase = wifiP2pGroup.getPassphrase();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "GO Group Name: " + networkName + ", Passphrase: " + passphrase);
        boolean isEmpty = wifiP2pGroup.getClientList().isEmpty();
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "createGroup success");
            yz5.l lVar2 = i1Var.f392302m;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(new gz.b(true, xf0Var, null, networkName, passphrase, 4, null));
            }
            i1Var.f392302m = null;
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Client connected：");
        java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> clientList = wifiP2pGroup.getClientList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clientList, "getClientList(...)");
        java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> collection = clientList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice : collection) {
            arrayList.add("{" + wifiP2pDevice.deviceName + ' ' + wifiP2pDevice.deviceAddress + '}');
        }
        sb6.append(kz5.n0.S0(arrayList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", sb6.toString());
        yz5.l lVar3 = i1Var.f392302m;
        if (lVar3 != null) {
            lVar3.mo146xb9724478(new gz.b(true, xf0Var, null, networkName, passphrase, 4, null));
        }
        i1Var.f392302m = null;
    }
}
