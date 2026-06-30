package by5;

/* loaded from: classes13.dex */
public class d2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("save_page", uri.getBooleanQueryParameter("enable_show_save_page", false));
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        by5.d4.e().edit().putBoolean("bShowSavePage", booleanQueryParameter).commit();
        if (lVar != null) {
            lVar.a();
        }
        return qx5.a.b();
    }
}
