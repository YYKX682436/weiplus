package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class j5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showInputToolView";
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
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        android.content.Context mo64555x76847179 = ((sd.a) bVar.f488129a).mo64555x76847179();
        if (jSONObject == null || mo64555x76847179 == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("toolViewType");
        java.lang.String optString2 = jSONObject.optString("gamecenter_identifier");
        java.lang.String optString3 = jSONObject.optString("configdict");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            bVar.c("invalid_params", null);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
            bVar.a();
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a();
            c15697x4d5ad03a.f36437x6e4dc626 = jSONObject2.optString("textPlaceHolder", "");
            c15697x4d5ad03a.f36425x68c82b9f = jSONObject2.optString("emoticonBoardViewType", "");
            c15697x4d5ad03a.f36424xe8ce0946 = jSONObject2.optString("contentText", "");
            c15697x4d5ad03a.f36436xf8e2c4c8 = jSONObject2.optBoolean("stickBtmIfNonEmpty", false);
            c15697x4d5ad03a.f36426xa930abf7 = jSONObject2.optBoolean("forceClearContent", false);
            c15697x4d5ad03a.f36428x374037b = jSONObject2.optBoolean("hideImgBtn", false);
            c15697x4d5ad03a.f36427x386556ee = jSONObject2.optInt("forceUserInterfaceStyle", 0);
            c15697x4d5ad03a.f36435xa67e49cb = jSONObject2.optBoolean("showEmojiQuickInputView", false);
            c15697x4d5ad03a.f36423xc2614a97 = jSONObject2.optBoolean("canShowAtSomeoneView", false);
            c15697x4d5ad03a.f36433x67bb6697 = jSONObject2.optString("quickEmojiList", "");
            c15697x4d5ad03a.f36431x15842983 = jSONObject2.optInt("maxInputCharsCo", 1000);
            c15697x4d5ad03a.f36422x2a24077d = jSONObject2.optBoolean("canSendWithoutText", false);
            c15697x4d5ad03a.f36429x9f88aca9 = jSONObject2.optString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, "");
            c15697x4d5ad03a.f36430x51eb225e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
            c15697x4d5ad03a.f36419x7b1d2081 = jSONObject2.optString("contentId", "");
            c15697x4d5ad03a.f36420xdbe631fc = jSONObject2.optString("context", "");
            c15697x4d5ad03a.f36421xd58ef748 = jSONObject2.optInt("limit", 50);
            c15697x4d5ad03a.f36432xdedc8898 = jSONObject2.optInt("maxInputCharsCount", 1000);
            c15697x4d5ad03a.f36434x38797ee9 = jSONObject2.optString("returnKeyType", "send");
            c15697x4d5ad03a.f36429x9f88aca9 = optString2;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_center_input_config", c15697x4d5ad03a);
            intent.putExtra("game_center_input_view_type", optString);
            j45.l.j(mo64555x76847179, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, null);
            m33.y0 y0Var = m33.x0.f404877a;
            y0Var.f404878a.put(optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.i5(this, bVar, optString2));
        } catch (org.json.JSONException unused) {
            bVar.c("configdict is not json obj", null);
        }
    }
}
