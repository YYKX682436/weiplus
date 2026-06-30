package iz3;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f377619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(iz3.s sVar) {
        super(2);
        this.f377619d = sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String ocrResult = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrResult, "ocrResult");
        iz3.s sVar = this.f377619d;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageSceneUploader", "onLocalOcrSuccess session: " + longValue + ", localOcrResult: " + ocrResult);
        ry3.q qVar = new ry3.q();
        qVar.f483076a = longValue;
        qVar.f483077b = true;
        qVar.f483078c = 0;
        qVar.f483079d = 0;
        qVar.f483080e = "";
        jz5.g gVar = kz3.d.f395405a;
        java.lang.String reqKey = "local_" + java.lang.System.currentTimeMillis();
        qVar.f483082g = reqKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reqKey, "reqKey");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("content", ocrResult);
        jSONObject.put("req_key", reqKey);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        qVar.f483085j = jSONObject2;
        qVar.f483086k = ocrResult.length() == 0;
        qVar.f483087l = 1;
        sVar.c(longValue, qVar, new iz3.o(qVar));
        return jz5.f0.f384359a;
    }
}
