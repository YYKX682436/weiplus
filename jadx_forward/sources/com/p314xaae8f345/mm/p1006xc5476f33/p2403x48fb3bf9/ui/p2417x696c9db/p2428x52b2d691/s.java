package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f268037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268039c;

    public s(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f268037a = hashMap;
        this.f268038b = kVar;
        this.f268039c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        int i18 = i17 == -1 ? 0 : -1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.HashMap hashMap = this.f268037a;
        hashMap.put("errCode", valueOf);
        hashMap.put("action", java.lang.Integer.valueOf(i18));
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        org.json.JSONObject mo12245xcc313de3 = ha5Var.mo12245xcc313de3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseChatRoomMember", "contactListJson: " + mo12245xcc313de3);
        org.json.JSONArray optJSONArray = mo12245xcc313de3.optJSONArray("dataList");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        hashMap.put("dataList", optJSONArray);
        nw4.k kVar = this.f268038b;
        nw4.y2 y2Var = this.f268039c;
        if (i18 == 0) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
    }
}
