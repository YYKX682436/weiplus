package by5;

/* loaded from: classes13.dex */
public class r1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_mm_config");
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            com.p314xaae8f345.p3210x3857dc.t0.f302127a.k("mm", com.p314xaae8f345.p3210x3857dc.f1.m120252xdce0328(queryParameter));
            return new qx5.a(true, true);
        }
        by5.c4.g("XWebCommandHandler", "handleCommand, set mm config error, config:" + queryParameter);
        return qx5.a.a();
    }
}
