package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/x;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        d85.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "handleMsg params: " + jSONObject);
        jz5.f0 f0Var2 = null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("capability", -1)) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("authScene", -1)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            str2 = "android.permission.ACCESS_FINE_LOCATION";
        } else if (valueOf != null && valueOf.intValue() == 6) {
            str2 = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            if (valueOf == null || valueOf.intValue() != 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "capability error: " + valueOf);
                this.f224975e.b("capability error");
                return;
            }
            str2 = "android.permission.CAMERA";
        }
        java.lang.String str3 = str2;
        if (valueOf2 != null && valueOf2.intValue() == 10) {
            f0Var = d85.f0.f308700r;
        } else {
            if (valueOf2 == null || valueOf2.intValue() != 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "authScene error: " + valueOf2);
                this.f224975e.b("authScene error");
                return;
            }
            f0Var = d85.f0.f308701s;
        }
        android.content.Context c17 = c();
        android.app.Activity activity = c17 instanceof android.app.Activity ? (android.app.Activity) c17 : null;
        if (activity != null) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).uj(activity, f0Var.f308709d, str3, f0Var.f308710e, new cv4.w(activity, str3, this));
            f0Var2 = jz5.f0.f384359a;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "context as? Activity = null");
            this.f224975e.b("env error");
        }
    }
}
