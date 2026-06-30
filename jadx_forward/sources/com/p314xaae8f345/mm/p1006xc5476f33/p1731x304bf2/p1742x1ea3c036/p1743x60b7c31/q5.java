package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class q5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "switchToGameTab";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSwitchToGameTab", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSwitchToGameTab", "data is null");
            bVar.c("null_data", null);
            return;
        }
        sd.d dVar = bVar.f488129a;
        android.content.Context context = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) dVar).f488143d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) dVar).V1;
        java.lang.String optString = jSONObject.optString("tabKey");
        if (lVar == null) {
            if (!android.text.TextUtils.equals(optString, "chat")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSwitchToGameTab", "is not tab page");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_msg_center_tab_type", jSONObject.optInt("chatVcSelectTab"));
            j45.l.j(context, "game", ".ui.chat_tab.ChatRoomTabUI", intent, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("chatVcSelectTab", jSONObject.optInt("chatVcSelectTab"));
        bundle.putString("game_msg_ui_from_msgid", jSONObject.optString("interactMsgid"));
        if (jSONObject.optInt("chatVcSelectTab") != 0) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.p5.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o5(this, optString, lVar, bVar));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            lVar.d0(optString);
        }
        bVar.a();
    }
}
