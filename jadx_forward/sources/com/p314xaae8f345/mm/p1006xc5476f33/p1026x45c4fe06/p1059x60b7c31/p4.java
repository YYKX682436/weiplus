package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class p4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q4 f164021f;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q4 q4Var) {
        this.f164019d = lVar;
        this.f164020e = i17;
        this.f164021f = q4Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q4 q4Var = this.f164021f;
        int i17 = this.f164020e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164019d;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，data == null");
            lVar.a(i17, q4Var.o("fail data == null "));
        } else {
            try {
                jSONObject = new org.json.JSONObject(bundle.getString("resJo", ""));
            } catch (java.lang.Throwable unused) {
                jSONObject = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，result ：%s", jSONObject);
            lVar.a(i17, q4Var.s("ok", jSONObject));
        }
    }
}
