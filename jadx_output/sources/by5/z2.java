package by5;

/* loaded from: classes13.dex */
public class z2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        if (lVar == null || lVar.getWebView() == null) {
            return qx5.a.a();
        }
        lVar.getWebView().loadUrl("chrome://inducebrowsercrashforrealz/");
        return qx5.a.b();
    }
}
