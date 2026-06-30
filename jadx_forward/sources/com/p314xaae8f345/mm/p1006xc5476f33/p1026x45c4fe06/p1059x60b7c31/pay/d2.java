package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34610x366c91de = 1252;

    /* renamed from: NAME */
    public static final java.lang.String f34611x24728b = "requestScanPOSPay";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f162547c;
        this.f162871e = false;
        if (jSONObject != null) {
            try {
                jSONObject.put("pay_scene", 84);
            } catch (org.json.JSONException e17) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiRequestScanPOSPay", e17, "", new java.lang.Object[0]);
            }
        }
        D(ffVar, 84);
    }
}
