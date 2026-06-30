package cd;

/* loaded from: classes9.dex */
public final class f implements nz2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f40504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.a f40505b;

    public f(org.json.JSONObject jSONObject, cd.a aVar) {
        this.f40504a = jSONObject;
        this.f40505b = aVar;
    }

    @Override // nz2.d
    public void onFail(nz2.e eVar) {
        kotlin.jvm.internal.o.d(eVar);
        nz2.c cVar = eVar.f341551c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cd.b bVar = cd.b.f40496e;
        org.json.JSONObject jSONObject2 = this.f40504a;
        jSONObject2.put("operationStatus", bVar);
        jSONObject.put("errCode", cVar.f341543a);
        jSONObject.put("errMsg", (java.lang.Object) null);
        jSONObject2.put("authInfo", jSONObject);
        this.f40505b.onCall(jSONObject2);
    }

    @Override // nz2.d
    public void onRetry(nz2.e eVar) {
        kotlin.jvm.internal.o.d(eVar);
        nz2.c cVar = eVar.f341551c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cd.b bVar = cd.b.f40497f;
        org.json.JSONObject jSONObject2 = this.f40504a;
        jSONObject2.put("operationStatus", bVar);
        jSONObject.put("errCode", cVar.f341543a);
        jSONObject.put("errMsg", (java.lang.Object) null);
        jSONObject2.put("authInfo", jSONObject);
        this.f40505b.onCall(jSONObject2);
    }

    @Override // nz2.d
    public void onSuccess(nz2.e eVar) {
        org.json.JSONObject jSONObject = this.f40504a;
        kotlin.jvm.internal.o.d(eVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppBiometricService", "LiteApp FingerPrint success!, encrypted_pay_info: %s, retry count: %d", eVar.f341551c.f341545c, java.lang.Integer.valueOf(eVar.f341550b));
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("json", eVar.f341551c.f341547e);
            jSONObject2.put("signature", eVar.f341551c.f341548f);
            jSONObject2.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            jSONObject.put("operationStatus", cd.b.f40495d);
            jSONObject.put("authInfo", jSONObject2);
            jSONObject.put("encrypted_pay_info", eVar.f341551c.f341545c);
            jSONObject.put("encrypted_rsa_sign", eVar.f341551c.f341546d);
            jSONObject.put("fp_identify_num", eVar.f341550b);
            jSONObject.put("use_touch", true);
            this.f40505b.onCall(jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXPLiteAppBiometricService", e17, "json exception while construct json for soter_req. message: %s", e17.getMessage());
        }
    }
}
