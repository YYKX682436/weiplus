package v61;

/* loaded from: classes13.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f515002a;

    /* renamed from: b, reason: collision with root package name */
    public final v61.p0 f515003b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f515004c;

    public q0(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar, v61.p0 p0Var) {
        this.f515002a = lVar;
        this.f515003b = p0Var;
    }

    public static void a(v61.q0 q0Var, int i17, java.lang.String str) {
        q0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.arg1 = i17;
        obtain.obj = str;
        q0Var.f515004c.mo50308x2936bf5f(obtain);
    }

    public static android.os.Bundle b(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(next);
            java.lang.Double valueOf = java.lang.Double.valueOf(jSONObject.optDouble(next));
            java.lang.String optString = jSONObject.optString(next);
            int i17 = 0;
            if (optJSONArray != null && optJSONArray.length() <= 0) {
                bundle.putStringArray(next, new java.lang.String[0]);
            } else if (optJSONArray != null && !java.lang.Double.isNaN(optJSONArray.optDouble(0))) {
                double[] dArr = new double[optJSONArray.length()];
                while (i17 < optJSONArray.length()) {
                    dArr[i17] = optJSONArray.optDouble(i17);
                    i17++;
                }
                bundle.putDoubleArray(next, dArr);
            } else if (optJSONArray != null && optJSONArray.optString(0) != null) {
                java.lang.String[] strArr = new java.lang.String[optJSONArray.length()];
                while (i17 < optJSONArray.length()) {
                    strArr[i17] = optJSONArray.optString(i17);
                    i17++;
                }
                bundle.putStringArray(next, strArr);
            } else if (!valueOf.isNaN()) {
                bundle.putDouble(next, valueOf.doubleValue());
            } else if (optString != null) {
                bundle.putString(next, optString);
            } else {
                java.lang.System.err.println("unable to transform json to bundle " + next);
            }
        }
        return bundle;
    }

    public void c() {
        this.f515004c = new v61.n0(this);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("client_id", "290293790992170");
        bundle.putString("client_secret", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8f));
        bundle.putString("grant_type", "fb_exchange_token");
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f515002a;
        bundle.putString("fb_exchange_token", lVar.f290746a);
        s75.d.b(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.b(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.d(lVar), "oauth/access_token", bundle, "GET", new v61.o0(this), null), "AsyncFacebookRunner_request");
    }
}
