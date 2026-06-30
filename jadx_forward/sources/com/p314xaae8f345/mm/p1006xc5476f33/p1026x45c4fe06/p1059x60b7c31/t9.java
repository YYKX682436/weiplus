package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class t9 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f165000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u9 f165001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165002g;

    public t9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u9 u9Var, java.lang.String str) {
        this.f164999d = c0Var;
        this.f165000e = i17;
        this.f165001f = u9Var;
        this.f165002g = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        int i17 = this.f165000e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u9 u9Var = this.f165001f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164999d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenOfficialAccountChat", "openOfficialAccountChat fail, is not contact");
            u9Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u9Var.u(str2, jSONObject));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c0Var.getF229340d(), "getContext(...)");
        android.content.Context f229340d = c0Var.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
        java.lang.String username = this.f165002g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "$username");
        u9Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KOpenArticleSceneFromScene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de);
        intent.putExtra("specific_chat_from_scene", 17);
        intent.putExtra("Chat_User", username);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("finish_direct", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, f229340d);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u9Var.u(str2, jSONObject2));
    }
}
