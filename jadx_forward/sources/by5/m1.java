package by5;

/* loaded from: classes13.dex */
public class m1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("enable_check_storage", false);
        com.p314xaae8f345.p3210x3857dc.t0.f302127a.g(booleanQueryParameter);
        if (booleanQueryParameter) {
            by5.c1.b(context);
        }
        return qx5.a.b();
    }
}
