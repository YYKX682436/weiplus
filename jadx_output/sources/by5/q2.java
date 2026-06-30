package by5;

/* loaded from: classes13.dex */
public class q2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        try {
            return !by5.b4.a(context, context.getExternalCacheDir(), lVar != null) ? qx5.a.a() : qx5.a.b();
        } catch (java.lang.Throwable th6) {
            by5.c4.g("XWebCommandHandler", "handleCommand, loadCachePackage error:" + th6.getMessage());
            return qx5.a.a();
        }
    }
}
