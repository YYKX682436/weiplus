package by5;

/* loaded from: classes13.dex */
public class p3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        android.content.SharedPreferences.Editor edit;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("disable_file_reader_crash_detect", false);
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 != null && (edit = e17.edit()) != null) {
            edit.putBoolean("fr_disable_crash_detect", booleanQueryParameter);
            edit.commit();
        }
        return qx5.a.b();
    }
}
