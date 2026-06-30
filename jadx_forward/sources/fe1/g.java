package fe1;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.g f343005d = new fe1.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            return optJSONObject != null ? kz5.c1.i(new jz5.l("cplc", optJSONObject.optString("cplc", "")), new jz5.l("seid", optJSONObject.optString("seid", "")), new jz5.l("walletVersionCode", optJSONObject.optString("walletVersionCode", ""))) : kz5.c1.i(new jz5.l("cplc", jSONObject.optString("cplc", "")), new jz5.l("seid", jSONObject.optString("seid", "")), new jz5.l("walletVersionCode", jSONObject.optString("walletVersionCode", "")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCPLC", "parse getCPLC result error: " + e17.getMessage());
            return null;
        }
    }
}
