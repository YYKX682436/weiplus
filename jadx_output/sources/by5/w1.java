package by5;

/* loaded from: classes13.dex */
public class w1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("multi_profile_mode");
        by5.z e17 = by5.a0.e(queryParameter);
        if (!e17.f36615a) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set multi profile mode error, config:" + queryParameter);
            return qx5.a.a();
        }
        int b17 = e17.b();
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (b17 == 0 || b17 == 1) {
            by5.d4.e().edit().putInt("multiProfileMode", b17).commit();
        }
        return qx5.a.b();
    }
}
