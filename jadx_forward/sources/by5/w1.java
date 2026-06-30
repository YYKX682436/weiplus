package by5;

/* loaded from: classes13.dex */
public class w1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("multi_profile_mode");
        by5.z e17 = by5.a0.e(queryParameter);
        if (!e17.f118148a) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set multi profile mode error, config:" + queryParameter);
            return qx5.a.a();
        }
        int b17 = e17.b();
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (b17 == 0 || b17 == 1) {
            by5.d4.e().edit().putInt("multiProfileMode", b17).commit();
        }
        return qx5.a.b();
    }
}
