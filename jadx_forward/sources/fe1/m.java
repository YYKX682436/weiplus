package fe1;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str) {
        super(1);
        this.f343016d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successData, "successData");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(successData);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("cards");
            }
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.JsApiGetCardList", "getCardList, issuerID=" + this.f343016d + ", result=" + optJSONArray.length());
            return kz5.c1.i(new jz5.l("cards", optJSONArray));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.JsApiGetCardList", "parse getCardList result error: " + e17.getMessage());
            return null;
        }
    }
}
