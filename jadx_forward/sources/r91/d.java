package r91;

/* loaded from: classes7.dex */
public class d implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return r91.g.a("must run in main process");
        }
        if (str == null || str.isEmpty()) {
            return r91.g.a("pluginAppId is required");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().c(str);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, true);
            bundle2.putBoolean("pkg_deleted", c17 > 0);
            bundle2.putString("pluginAppId", str);
            bundle2.putInt("deleted_count", c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearPluginPkgCmd", "clearPluginPkg(%s) deleted=%d", str, java.lang.Integer.valueOf(c17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ClearPluginPkgCmd", th6, "clearPluginPkg failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        return bundle2;
    }
}
