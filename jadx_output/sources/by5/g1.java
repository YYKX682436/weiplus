package by5;

/* loaded from: classes13.dex */
public class g1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_gray_value");
        if (uri.toString().contains("set_grayvalue")) {
            queryParameter = uri.getQueryParameter("set_grayvalue");
        }
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return qx5.a.a();
        }
        try {
            by5.a4.e(java.lang.Integer.parseInt(queryParameter));
            return qx5.a.b();
        } catch (java.lang.Exception e17) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set gray value error:" + e17.getMessage());
            return qx5.a.a();
        }
    }
}
