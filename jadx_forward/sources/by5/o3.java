package by5;

/* loaded from: classes13.dex */
public class o3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        android.content.SharedPreferences.Editor edit;
        int f17;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("disable_file_reader_cache", false);
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 != null && (edit = e17.edit()) != null) {
            edit.putBoolean("fr_disable_cache", booleanQueryParameter);
            edit.commit();
            if (booleanQueryParameter) {
                java.util.Iterator it = ((java.util.ArrayList) cy5.m.b()).iterator();
                while (it.hasNext()) {
                    cy5.h hVar = (cy5.h) it.next();
                    if ((hVar instanceof cy5.y) && (f17 = hVar.f(true)) >= 0) {
                        java.lang.String n17 = hVar.n(f17);
                        if (!n17.isEmpty()) {
                            by5.u.h(n17);
                        }
                    }
                }
            }
        }
        return qx5.a.b();
    }
}
