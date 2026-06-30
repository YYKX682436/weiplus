package by5;

/* loaded from: classes13.dex */
public class p2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_apk_version");
        if (uri.toString().contains("set_apkver")) {
            queryParameter = uri.getQueryParameter("set_apkver");
        }
        try {
            int parseInt = java.lang.Integer.parseInt(queryParameter);
            java.lang.String str = "1.0." + queryParameter;
            java.lang.String b17 = by5.a.b();
            zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
            by5.u3.e(parseInt, str, b17);
            by5.c4.f("XWebCommandHandler", "handleCommand, setApkVersion, version:" + parseInt);
            return qx5.a.b();
        } catch (java.lang.Throwable th6) {
            by5.c4.g("XWebCommandHandler", "handleCommand, setApkVersion error:" + th6.getMessage());
            return qx5.a.a();
        }
    }
}
