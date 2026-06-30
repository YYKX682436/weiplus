package r91;

/* loaded from: classes7.dex */
public class c implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        if (str == null || str.isEmpty()) {
            return r91.g.a("appId is required");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi().d(str);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, true);
            bundle2.putBoolean("deleted", d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearLaunchPermCmd", "clearLaunchPermission(%s) deleted=%b", str, java.lang.Boolean.valueOf(d17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ClearLaunchPermCmd", th6, "clearLaunchPermission failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        return bundle2;
    }
}
