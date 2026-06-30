package gl5;

/* loaded from: classes5.dex */
public abstract class i {
    public static boolean a(java.lang.String str, android.os.Bundle bundle, fl5.e eVar) {
        android.net.Uri uri;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "com.sogou.inputmethod.exp.commit") || bundle == null || (uri = (android.net.Uri) bundle.getParcelable("EXP_PATH_URI")) == null || eVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h1) eVar).f271872a.f271488a3.a().f542241c.a(sb5.w1.class));
        lkVar.getClass();
        com.p314xaae8f345.mm.vfs.z7 z7Var = new com.p314xaae8f345.mm.vfs.z7(uri);
        java.lang.String str2 = z7Var.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, l17, z7Var.f294813g, z7Var.f294814h);
            }
        }
        return lkVar.p0(z7Var.m82499x9616526c()).f281394a;
    }
}
