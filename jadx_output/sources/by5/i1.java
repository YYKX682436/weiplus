package by5;

/* loaded from: classes13.dex */
public class i1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_plugin_config_url");
        if (by5.e4.f(queryParameter) || com.tencent.xweb.t0.f220594a.a()) {
            by5.e4.h(queryParameter);
            return qx5.a.b();
        }
        by5.c4.g("XWebCommandHandler", "handleCommand, set plugin config url error, config url:" + queryParameter);
        return qx5.a.a();
    }
}
