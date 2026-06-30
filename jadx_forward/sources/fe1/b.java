package fe1;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.b f342994d = new fe1.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            java.lang.String optString = jSONObject.optString("brandName", "");
            java.lang.String optString2 = jSONObject.optString("walletVersionCode", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() > 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                ie1.a.f372509a = optString;
                ie1.a.f372510b = optString2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.DeviceInfo", "update, brandName=" + optString + ", walletVersionCode=" + optString2);
            }
            return kz5.c1.i(new jz5.l("brandName", optString), new jz5.l("walletVersionCode", optString2));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.JsApiCheckSupport", "parse checkSupport result error: " + e17.getMessage());
            return null;
        }
    }
}
