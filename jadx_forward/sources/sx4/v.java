package sx4;

/* loaded from: classes8.dex */
public class v {

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f495198e;

    /* renamed from: a, reason: collision with root package name */
    public long f495194a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f495195b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f495196c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f495197d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final sx4.u f495199f = new sx4.u(this);

    public static void a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : keySet) {
                jSONObject.put(str, bundle.get(str));
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
            am.le leVar = c5571xfff98751.f135891g;
            leVar.f88776a = 4;
            leVar.f88777b = jSONObject.toString();
            c5571xfff98751.e();
        } catch (org.json.JSONException unused) {
        }
    }

    public void b(android.os.Bundle bundle) {
    }
}
