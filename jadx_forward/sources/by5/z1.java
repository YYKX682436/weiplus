package by5;

/* loaded from: classes13.dex */
public class z1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("inspector", uri.getBooleanQueryParameter("enable_remote_debug", false));
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        by5.d4.e().edit().putBoolean("bEnableRemoteDebug", booleanQueryParameter).commit();
        return !com.p314xaae8f345.p3210x3857dc.a3.s(booleanQueryParameter) ? qx5.a.a() : qx5.a.b();
    }
}
