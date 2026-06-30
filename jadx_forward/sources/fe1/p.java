package fe1;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.p f343022d = new fe1.p();

    public p() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successData, "successData");
        try {
            return kz5.c1.i(new jz5.l("cardNo", new org.json.JSONObject(successData).optString("cardNo", "")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.JsApiIssue", "parse issueCard result error: " + e17.getMessage());
            return null;
        }
    }
}
