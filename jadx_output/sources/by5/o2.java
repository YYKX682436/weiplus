package by5;

/* loaded from: classes13.dex */
public class o2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        try {
            by5.c4.f("XWebCommandHandler", "handleCommand, revertToApkVer, version:" + zx5.g.a(context, java.lang.Integer.parseInt(uri.getQueryParameter("revert_to_apk"))));
            return qx5.a.b();
        } catch (java.lang.Throwable th6) {
            by5.c4.g("XWebCommandHandler", "handleCommand, revertToApkVer error:" + th6.getMessage());
            return qx5.a.a();
        }
    }
}
