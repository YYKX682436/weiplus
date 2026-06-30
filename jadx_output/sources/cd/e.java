package cd;

/* loaded from: classes9.dex */
public final class e implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f40502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.a f40503b;

    public e(org.json.JSONObject jSONObject, cd.a aVar) {
        this.f40502a = jSONObject;
        this.f40503b = aVar;
    }

    @Override // lz2.a
    public void onAuthCancel() {
        cd.b bVar = cd.b.f40498g;
        org.json.JSONObject jSONObject = this.f40502a;
        jSONObject.put("operationStatus", bVar);
        this.f40503b.onCall(jSONObject);
    }

    @Override // lz2.a
    public void onAuthFail(int i17) {
        cd.b bVar = cd.b.f40496e;
        org.json.JSONObject jSONObject = this.f40502a;
        jSONObject.put("operationStatus", bVar);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("errCode", i17);
        jSONObject.put("authInfo", jSONObject2);
        this.f40503b.onCall(jSONObject);
    }

    @Override // lz2.a
    public void onAuthSuccess(int i17, int i18) {
        cd.b bVar = cd.b.f40495d;
        org.json.JSONObject jSONObject = this.f40502a;
        jSONObject.put("operationStatus", bVar);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.COL_ID, i17);
        jSONObject2.put("verifyCount", i18);
        jSONObject.put("authInfo", jSONObject2);
        java.lang.String Uh = ((pz2.a) gm0.j1.s(pz2.a.class)).Uh();
        if (Uh == null) {
            Uh = "";
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("use_touch", true);
        jSONObject3.put("encrypted_pay_info", "");
        jSONObject3.put("encrypted_rsa_sign", "");
        jSONObject3.put("soter_req", Uh);
        jSONObject.put("authenTouchPayInfo", jSONObject3);
        this.f40503b.onCall(jSONObject);
    }
}
