package by5;

/* loaded from: classes13.dex */
public class u2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("delete_origin");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return qx5.a.a();
        }
        com.p314xaae8f345.p3210x3857dc.a1.c().b(queryParameter);
        return qx5.a.b();
    }
}
