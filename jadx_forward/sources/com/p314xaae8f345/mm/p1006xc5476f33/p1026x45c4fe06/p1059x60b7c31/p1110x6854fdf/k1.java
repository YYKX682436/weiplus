package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34813x366c91de = 202;

    /* renamed from: NAME */
    public static final java.lang.String f34814x24728b = "showShareMenuWithShareTicket";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowShareMenuWithShareTicket", "invoke");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            e9Var.a(i17, o("ok"));
            return;
        }
        V0.n1(3, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = V0.H1(3);
        if (H1 == null) {
            e9Var.a(i17, o("fail:menu item do not exist"));
            return;
        }
        H1.f167529d.i("enable_share_with_share_ticket", java.lang.Boolean.TRUE);
        e9Var.a(i17, o("ok"));
    }
}
