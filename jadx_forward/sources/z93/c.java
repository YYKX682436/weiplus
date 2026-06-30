package z93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz93/c;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenW1wPersonalMsgChatListPage", "openW1wPersonalMsgChatListPage called");
        if (!((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).hj(jSONObject)) {
            this.f224976f.a("json data invalid!");
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("commonReport") : null;
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "null") : null;
        java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("sceneNote", "null") : null;
        java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "null") : null;
        java.lang.String optString4 = optJSONObject != null ? optJSONObject.optString("extInfo") : null;
        ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f347359m = (jSONObject != null ? jSONObject.optInt("msgSettingsFlag", 0) : 0) == 1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_w1w_refer_scene", optString);
        intent.putExtra("key_w1w_refer_scene_note", optString2);
        intent.putExtra("key_w1w_refer_session_id", optString3);
        intent.putExtra("key_w1w_refer_ext_info", optString4);
        if (jSONObject == null || (str2 = jSONObject.toString()) == null) {
            str2 = "";
        }
        intent.putExtra("key_w1w_self_contact_data", str2);
        java.lang.String Di = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.K4(Di)) {
            intent.putExtra("KEY_CONV_TYPE", 1);
            j45.l.j(c(), "w1wpersonalmsg", ".ui.W1wPersonalMsgConvListUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = this.f224976f;
            if (oVar != null) {
                oVar.d(true);
                return;
            }
            return;
        }
        if (!(Di.endsWith("@zhugeprivate"))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar2 = this.f224976f;
            if (oVar2 != null) {
                oVar2.a("username is invalid!");
                return;
            }
            return;
        }
        intent.putExtra("KEY_CONV_TYPE", 3);
        j45.l.j(c(), "w1wpersonalmsg", ".ui.W1wPersonalMsgPrivateConvListUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar3 = this.f224976f;
        if (oVar3 != null) {
            oVar3.d(true);
        }
    }
}
