package cd;

/* loaded from: classes9.dex */
public final class f implements nz2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f122037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.a f122038b;

    public f(org.json.JSONObject jSONObject, cd.a aVar) {
        this.f122037a = jSONObject;
        this.f122038b = aVar;
    }

    @Override // nz2.d
    /* renamed from: onFail */
    public void mo14631xc399519d(nz2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        nz2.c cVar = eVar.f423084c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cd.b bVar = cd.b.f122029e;
        org.json.JSONObject jSONObject2 = this.f122037a;
        jSONObject2.put("operationStatus", bVar);
        jSONObject.put("errCode", cVar.f423076a);
        jSONObject.put("errMsg", (java.lang.Object) null);
        jSONObject2.put("authInfo", jSONObject);
        this.f122038b.mo14625xc397f4dd(jSONObject2);
    }

    @Override // nz2.d
    /* renamed from: onRetry */
    public void mo14632xb03bf809(nz2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        nz2.c cVar = eVar.f423084c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cd.b bVar = cd.b.f122030f;
        org.json.JSONObject jSONObject2 = this.f122037a;
        jSONObject2.put("operationStatus", bVar);
        jSONObject.put("errCode", cVar.f423076a);
        jSONObject.put("errMsg", (java.lang.Object) null);
        jSONObject2.put("authInfo", jSONObject);
        this.f122038b.mo14625xc397f4dd(jSONObject2);
    }

    @Override // nz2.d
    /* renamed from: onSuccess */
    public void mo14633xe05b4124(nz2.e eVar) {
        org.json.JSONObject jSONObject = this.f122037a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppBiometricService", "LiteApp FingerPrint success!, encrypted_pay_info: %s, retry count: %d", eVar.f423084c.f423078c, java.lang.Integer.valueOf(eVar.f423083b));
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("json", eVar.f423084c.f423080e);
            jSONObject2.put("signature", eVar.f423084c.f423081f);
            jSONObject2.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            jSONObject.put("operationStatus", cd.b.f122028d);
            jSONObject.put("authInfo", jSONObject2);
            jSONObject.put("encrypted_pay_info", eVar.f423084c.f423078c);
            jSONObject.put("encrypted_rsa_sign", eVar.f423084c.f423079d);
            jSONObject.put("fp_identify_num", eVar.f423083b);
            jSONObject.put("use_touch", true);
            this.f122038b.mo14625xc397f4dd(jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXPLiteAppBiometricService", e17, "json exception while construct json for soter_req. message: %s", e17.getMessage());
        }
    }
}
