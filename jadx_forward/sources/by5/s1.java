package by5;

/* loaded from: classes13.dex */
public class s1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_tools_config");
        if (uri.toString().contains("set_web_config")) {
            queryParameter = uri.getQueryParameter("set_web_config");
        }
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            com.p314xaae8f345.p3210x3857dc.t0.f302127a.k("tools", com.p314xaae8f345.p3210x3857dc.f1.m120252xdce0328(queryParameter));
            return qx5.a.b();
        }
        by5.c4.g("XWebCommandHandler", "handleCommand, set tools config error, config:" + queryParameter);
        return qx5.a.a();
    }
}
