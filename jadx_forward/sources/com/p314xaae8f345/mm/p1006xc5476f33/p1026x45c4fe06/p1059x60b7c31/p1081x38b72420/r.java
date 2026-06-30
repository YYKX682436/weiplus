package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes.dex */
public final class r implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f162138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.s f162141d;

    public r(java.util.HashMap hashMap, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.s sVar) {
        this.f162138a = hashMap;
        this.f162139b = e9Var;
        this.f162140c = i17;
        this.f162141d = sVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        int i18 = i17 == -1 ? 0 : -1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.HashMap hashMap = this.f162138a;
        hashMap.put("errCode", valueOf);
        hashMap.put("action", java.lang.Integer.valueOf(i18));
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f416647a.d(jSONObject, "datalist", ha5Var.f457514d, false);
        } catch (java.lang.Exception unused2) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMultiChooseWeChatChatroom", "contactListJson: " + jSONObject);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("datalist");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        hashMap.put("datalist", optJSONArray);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.s sVar = this.f162141d;
        int i19 = this.f162140c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162139b;
        if (i18 == 0) {
            e9Var.a(i19, sVar.p("ok", hashMap));
        } else {
            e9Var.a(i19, sVar.p("fail", hashMap));
        }
    }
}
