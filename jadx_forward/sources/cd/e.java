package cd;

/* loaded from: classes9.dex */
public final class e implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f122035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.a f122036b;

    public e(org.json.JSONObject jSONObject, cd.a aVar) {
        this.f122035a = jSONObject;
        this.f122036b = aVar;
    }

    @Override // lz2.a
    /* renamed from: onAuthCancel */
    public void mo11325x21a77981() {
        cd.b bVar = cd.b.f122031g;
        org.json.JSONObject jSONObject = this.f122035a;
        jSONObject.put("operationStatus", bVar);
        this.f122036b.mo14625xc397f4dd(jSONObject);
    }

    @Override // lz2.a
    /* renamed from: onAuthFail */
    public void mo11326xfa7237e5(int i17) {
        cd.b bVar = cd.b.f122029e;
        org.json.JSONObject jSONObject = this.f122035a;
        jSONObject.put("operationStatus", bVar);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("errCode", i17);
        jSONObject.put("authInfo", jSONObject2);
        this.f122036b.mo14625xc397f4dd(jSONObject);
    }

    @Override // lz2.a
    /* renamed from: onAuthSuccess */
    public void mo11327x833155dc(int i17, int i18) {
        cd.b bVar = cd.b.f122028d;
        org.json.JSONObject jSONObject = this.f122035a;
        jSONObject.put("operationStatus", bVar);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.f66865x76d1ec5a, i17);
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
        this.f122036b.mo14625xc397f4dd(jSONObject);
    }
}
