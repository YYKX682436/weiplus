package z43;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/p0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context c17 = c();
        if (jSONObject == null || c17 == null) {
            this.f224976f.a("invalid_params");
            return;
        }
        java.lang.String optString = jSONObject.optString("toolViewType");
        java.lang.String optString2 = jSONObject.optString("gamecenter_identifier");
        java.lang.String optString3 = jSONObject.optString("configdict");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            this.f224976f.a("invalid_params");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
            this.f224976f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
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
            j45.l.j(c17, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, null);
            m33.y0 y0Var = m33.x0.f404877a;
            y0Var.f404878a.put(optString2, new z43.o0(optString2));
        } catch (org.json.JSONException unused) {
            this.f224976f.a("configdict is not json obj");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 0;
    }
}
