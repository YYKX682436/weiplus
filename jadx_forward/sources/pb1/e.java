package pb1;

/* loaded from: classes7.dex */
public class e extends pb1.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb1.i f434667a;

    public e(pb1.i iVar) {
        this.f434667a = iVar;
    }

    @Override // pb1.x
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c c12040xecd7293c) {
        if (c12040xecd7293c == null || c12040xecd7293c.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f434667a.f434673a, "[onScanResult]result is null, err", new java.lang.Object[0]);
            return;
        }
        if (!this.f434667a.f434678f.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f434667a.f434673a, "[onScanResult]not init, err", new java.lang.Object[0]);
            return;
        }
        synchronized (this.f434667a) {
            pb1.i iVar = this.f434667a;
            if (iVar.f434676d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(iVar.f434673a, "[onScanResult]may be close, err", new java.lang.Object[0]);
                return;
            }
            iVar.f434686n.a(i17, c12040xecd7293c);
            java.lang.String address = c12040xecd7293c.a().getAddress();
            boolean z17 = !((java.util.HashMap) this.f434667a.f434676d).containsKey(address) || kb1.b.a().f387751b;
            ob1.f fVar = new ob1.f(c12040xecd7293c);
            ((java.util.HashMap) this.f434667a.f434676d).put(address, fVar);
            if (z17) {
                if (kb1.b.a().f387750a > 0) {
                    synchronized (this.f434667a) {
                        java.util.List list = this.f434667a.f434680h;
                        if (list != null) {
                            ((java.util.ArrayList) list).add(fVar);
                        }
                    }
                    return;
                }
                ob1.l lVar = this.f434667a.f434687o;
                if (lVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = ((ib1.i0) lVar).f371601a;
                    if (lVar2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                        return;
                    }
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    try {
                        jSONArray.put(fVar.a());
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e17);
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
                    if (pb1.b.f434661d) {
                        jSONObject.toString();
                    }
                }
            }
        }
    }
}
