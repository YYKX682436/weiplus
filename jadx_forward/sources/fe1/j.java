package fe1;

/* loaded from: classes.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.j f343010d = new fe1.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cardInfo");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            return kz5.c1.i(new jz5.l("cardInfo", jSONObject));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCardInfo", "parse getCardInfo result error: " + e17.getMessage());
            return null;
        }
    }
}
