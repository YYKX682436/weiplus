package ib1;

/* loaded from: classes7.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    private static final int f69875x366c91de = 189;

    /* renamed from: NAME */
    private static final java.lang.String f69876x24728b = "onBluetoothAdapterStateChange";

    public static void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, boolean z17, boolean z18) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
            return;
        }
        ib1.b0 b0Var = new ib1.b0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.remove("available");
            jSONObject.put("available", z17);
            jSONObject.remove("discovering");
            jSONObject.put("discovering", z18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
        }
        int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
        b0Var.p(lVar);
        b0Var.f163909h = mo50260x9f1221c2;
        b0Var.f163907f = jSONObject.toString();
        b0Var.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChange %s", jSONObject.toString());
    }
}
