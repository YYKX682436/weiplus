package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class t9 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.u9 f83468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83469g;

    public t9(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.u9 u9Var, java.lang.String str) {
        this.f83466d = c0Var;
        this.f83467e = i17;
        this.f83468f = u9Var;
        this.f83469g = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        int i17 = this.f83467e;
        com.tencent.mm.plugin.appbrand.jsapi.u9 u9Var = this.f83468f;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83466d;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenOfficialAccountChat", "openOfficialAccountChat fail, is not contact");
            u9Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u9Var.u(str2, jSONObject));
            return;
        }
        kotlin.jvm.internal.o.f(c0Var.getF147807d(), "getContext(...)");
        android.content.Context f147807d = c0Var.getF147807d();
        kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
        java.lang.String username = this.f83469g;
        kotlin.jvm.internal.o.f(username, "$username");
        u9Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KOpenArticleSceneFromScene", com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX);
        intent.putExtra("specific_chat_from_scene", 17);
        intent.putExtra("Chat_User", username);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("finish_direct", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, f147807d);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u9Var.u(str2, jSONObject2));
    }
}
