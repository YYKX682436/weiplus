package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34306x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34307x24728b = "shareFinderEndorsementToFriend";

    static {
        ot0.r.f430288a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.l0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar.mo50352x76847179() instanceof android.app.Activity) || jSONObject == null) {
            lVar.a(i17, "fail");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        java.lang.String optString2 = jSONObject.optString("desc", "");
        java.lang.String optString3 = jSONObject.optString("relativePath", "");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        jSONObject.optString("sceneNote", "");
        java.lang.String optString4 = jSONObject.optString("appid", "");
        ot0.q qVar = new ot0.q();
        zy2.z4 z4Var = new zy2.z4();
        z4Var.f559167b = optString;
        z4Var.f559168c = optString2;
        z4Var.f559169d = optString3;
        z4Var.f559171f = optString4;
        z4Var.f559170e = optInt;
        qVar.f430199i = 81;
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        qVar.f430187f = optString;
        qVar.S1 = optString2;
        qVar.f(z4Var);
        java.lang.String u17 = ot0.q.u(qVar, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", "msgContent %s", u17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(lVar.mo50352x76847179(), "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        intent.putExtra("Retr_Msg_Type", 19);
        intent.putExtra("Retr_Msg_content", u17);
        intent.putExtra("Multi_Retr", false);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        nf.g.a(lVar.mo50352x76847179()).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.m0(this, lVar, i17));
    }
}
