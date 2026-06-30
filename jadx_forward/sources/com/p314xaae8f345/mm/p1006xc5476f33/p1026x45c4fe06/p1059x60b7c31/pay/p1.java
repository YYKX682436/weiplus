package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class p1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34640x366c91de = 691;

    /* renamed from: NAME */
    public static final java.lang.String f34641x24728b = "requestJointPayment";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f162547c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) ffVar.f162546b;
        int i17 = ffVar.f162549e;
        if (jSONObject == null) {
            d0Var.a(i17, o("fail:invalid data"));
            return;
        }
        try {
            jSONObject.put("key_joint_pay", true);
            D(ffVar, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestJointPayment", e17.getMessage());
            d0Var.a(i17, o("fail"));
        }
    }
}
