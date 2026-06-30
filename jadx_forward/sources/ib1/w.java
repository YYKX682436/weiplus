package ib1;

/* loaded from: classes7.dex */
public class w implements ob1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371623a;

    public w(ib1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f371623a = lVar;
    }

    @Override // ob1.j
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371623a;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent dispatch fail, service is null");
            return;
        }
        ib1.y yVar = new ib1.y();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.remove("value");
            jSONObject.put("value", str4);
            jSONObject.remove("deviceId");
            jSONObject.put("deviceId", str);
            jSONObject.remove("serviceId");
            jSONObject.put("serviceId", str2);
            jSONObject.remove("characteristicId");
            jSONObject.put("characteristicId", str3);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
        }
        int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
        yVar.p(lVar);
        yVar.f163909h = mo50260x9f1221c2;
        yVar.f163907f = jSONObject.toString();
        yVar.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent %s", jSONObject.toString());
    }
}
