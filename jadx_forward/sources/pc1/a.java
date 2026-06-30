package pc1;

/* loaded from: classes7.dex */
public class a extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "state:%d", java.lang.Integer.valueOf(state));
            boolean z18 = state == 12;
            boolean z19 = pc1.e.f434883c;
            if ((z19 && !z18) || (!z19 && z18)) {
                for (pc1.d dVar : ((java.util.concurrent.ConcurrentHashMap) pc1.e.f434881a).values()) {
                    synchronized (dVar) {
                        z17 = dVar.f434877e;
                    }
                    if (z17 && !z18) {
                        dVar.a();
                    }
                    pc1.c cVar = dVar.f434876d;
                    if (cVar != null) {
                        pc1.h hVar = (pc1.h) cVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onBluetoothStateChange:%b", java.lang.Boolean.valueOf(z18));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("available", z18);
                            jSONObject.put("discovering", false);
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", e17);
                        }
                        jSONObject.toString();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = hVar.f434892c;
                        int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
                        pc1.j jVar = hVar.f434891b;
                        jVar.p(lVar);
                        jVar.f163909h = mo50260x9f1221c2;
                        jVar.f163907f = jSONObject.toString();
                        jVar.m();
                    }
                }
            }
            pc1.e.f434883c = z18;
        }
    }
}
