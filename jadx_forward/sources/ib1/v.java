package ib1;

/* loaded from: classes7.dex */
public class v implements ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371622a;

    public v(ib1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f371622a = lVar;
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371622a;
        synchronized (ib1.z.class) {
            if (lVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent dispatch fail, service is null");
                return;
            }
            ib1.z zVar = new ib1.z();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.remove("deviceId");
                jSONObject.put("deviceId", str);
                jSONObject.remove("connected");
                jSONObject.put("connected", z17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
            }
            int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
            zVar.p(lVar);
            zVar.f163909h = mo50260x9f1221c2;
            zVar.f163907f = jSONObject.toString();
            zVar.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent %s", jSONObject.toString());
        }
    }
}
