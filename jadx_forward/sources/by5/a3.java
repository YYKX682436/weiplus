package by5;

/* loaded from: classes13.dex */
public class a3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("set_dark_mode");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set dark mode error, config:" + queryParameter);
            return qx5.a.a();
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 mo161097x86b9ebe3 = lVar != null ? lVar.mo161097x86b9ebe3() : null;
        boolean z17 = false;
        if (mo161097x86b9ebe3 == null) {
            by5.c4.g("XWebCommandHandler", "setDarkMode, no webview");
        } else {
            by5.c4.f("XWebCommandHandler", "setDarkMode, config:" + queryParameter);
            if (android.text.TextUtils.equals(queryParameter, "1")) {
                mo161097x86b9ebe3.mo120153xd15cf999().B(2);
                mo161097x86b9ebe3.mo120153xd15cf999().A(2);
            } else if (android.text.TextUtils.equals(queryParameter, "2")) {
                mo161097x86b9ebe3.mo120153xd15cf999().B(2);
                mo161097x86b9ebe3.mo120153xd15cf999().A(1);
            } else if (android.text.TextUtils.equals(queryParameter, "3")) {
                mo161097x86b9ebe3.mo120153xd15cf999().B(0);
            } else if (!android.text.TextUtils.equals(queryParameter, "4")) {
                by5.c4.g("XWebCommandHandler", "setDarkMode, config error:" + queryParameter);
            }
            z17 = true;
        }
        return !z17 ? qx5.a.a() : qx5.a.b();
    }
}
