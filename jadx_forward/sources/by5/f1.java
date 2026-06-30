package by5;

/* loaded from: classes13.dex */
public class f1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        return !qx5.u.b(context, uri.getQueryParameter("check_plugin_update"), "1", lVar != null) ? qx5.a.a() : qx5.a.b();
    }
}
