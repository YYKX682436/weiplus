package by5;

/* loaded from: classes13.dex */
public class a2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("enable_show_version", false);
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        by5.d4.e().edit().putBoolean("bShowVersion", booleanQueryParameter).commit();
        if (lVar != null) {
            lVar.c();
        }
        return qx5.a.b();
    }
}
