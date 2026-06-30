package by5;

/* loaded from: classes13.dex */
public class y1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("enable_new_debug_page", false);
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        by5.d4.e().edit().putBoolean("enableNewDebugPage", booleanQueryParameter).commit();
        return qx5.a.b();
    }
}
