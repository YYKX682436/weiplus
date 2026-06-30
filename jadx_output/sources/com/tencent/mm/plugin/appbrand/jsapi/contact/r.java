package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes.dex */
public final class r implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f80605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.s f80608d;

    public r(java.util.HashMap hashMap, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.contact.s sVar) {
        this.f80605a = hashMap;
        this.f80606b = e9Var;
        this.f80607c = i17;
        this.f80608d = sVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        int i18 = i17 == -1 ? 0 : -1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.HashMap hashMap = this.f80605a;
        hashMap.put("errCode", valueOf);
        hashMap.put("action", java.lang.Integer.valueOf(i18));
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "datalist", ha5Var.f375981d, false);
        } catch (java.lang.Exception unused2) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMultiChooseWeChatChatroom", "contactListJson: " + jSONObject);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("datalist");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        hashMap.put("datalist", optJSONArray);
        com.tencent.mm.plugin.appbrand.jsapi.contact.s sVar = this.f80608d;
        int i19 = this.f80607c;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80606b;
        if (i18 == 0) {
            e9Var.a(i19, sVar.p("ok", hashMap));
        } else {
            e9Var.a(i19, sVar.p("fail", hashMap));
        }
    }
}
