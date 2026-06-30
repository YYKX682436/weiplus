package r91;

/* loaded from: classes.dex */
public class j implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ENABLE_APPBRAND_DEBUGGER");
            boolean z17 = M.getBoolean("KEY_FORCE_API_PERMISSION_PASS_FOR_TEST", false);
            boolean z18 = (bundle == null || !bundle.containsKey("enable")) ? !z17 : bundle.getBoolean("enable");
            M.putBoolean("KEY_FORCE_API_PERMISSION_PASS_FOR_TEST", z18);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, true);
            bundle2.putBoolean("jsapi_permission_bypass", z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToggleJsApiPermCmd", "toggleJsApiPermission: %b -> %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ToggleJsApiPermCmd", th6, "toggleJsApiPermission failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        return bundle2;
    }
}
