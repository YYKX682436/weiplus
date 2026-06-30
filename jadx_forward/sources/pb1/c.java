package pb1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb1.i f434665d;

    public c(pb1.i iVar) {
        this.f434665d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        if (this.f434665d.f434677e.get()) {
            synchronized (this.f434665d) {
                arrayList = new java.util.ArrayList(this.f434665d.f434680h);
                ((java.util.ArrayList) this.f434665d.f434680h).clear();
            }
            ob1.l lVar = this.f434665d.f434687o;
            if (lVar != null && arrayList.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = ((ib1.i0) lVar).f371601a;
                if (lVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                } else {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            jSONArray.put(((ob1.f) it.next()).a());
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e17);
                        }
                    }
                    ib1.j0 j0Var = new ib1.j0();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.remove("devices");
                        jSONObject.put("devices", jSONArray);
                    } catch (org.json.JSONException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e18);
                    }
                    int mo50260x9f1221c2 = lVar2.mo50260x9f1221c2();
                    j0Var.p(lVar2);
                    j0Var.f163909h = mo50260x9f1221c2;
                    j0Var.f163907f = jSONObject.toString();
                    j0Var.m();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothDeviceFoundEvent %s", jSONObject.toString());
                }
            }
            pb1.i iVar = this.f434665d;
            iVar.f434679g.postDelayed(iVar.f434681i, kb1.b.a().f387750a);
        }
    }
}
