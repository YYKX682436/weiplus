package by5;

/* loaded from: classes13.dex */
public class b2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("enable_test_base_config", false);
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (booleanQueryParameter) {
            by5.e4.g("https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_test.xml");
            android.content.SharedPreferences.Editor edit = by5.d4.g("UPDATEINFOTAG").edit();
            edit.putLong("nLastFetchConfigTime", 0L);
            edit.commit();
            zx5.o.b0().a();
            zx5.p.Z().a();
        } else {
            by5.e4.g("");
            android.content.SharedPreferences.Editor edit2 = by5.d4.g("UPDATEINFOTAG").edit();
            edit2.putLong("nLastFetchConfigTime", 0L);
            edit2.commit();
            zx5.o.b0().a();
            zx5.p.Z().a();
        }
        return qx5.a.b();
    }
}
