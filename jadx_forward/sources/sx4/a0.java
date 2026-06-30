package sx4;

/* loaded from: classes.dex */
public class a0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("report_data");
        java.lang.String string2 = bundle.getString("page_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return;
        }
        try {
            sx4.b0.b(string2, sx4.b0.a(new org.json.JSONObject(string)));
        } catch (org.json.JSONException unused) {
        }
    }
}
