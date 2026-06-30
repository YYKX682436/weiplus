package h53;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f360594a;

    public m(java.lang.String str) {
        this.f360594a = str;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postMessage */
    public void m132901x58d00b47(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            h53.r rVar = new h53.r(this.f360594a, new org.json.JSONObject(str).optJSONObject("params"));
            if (h53.j.d() != null) {
                h53.j.d().c(rVar);
            }
        } catch (org.json.JSONException unused) {
        }
    }
}
