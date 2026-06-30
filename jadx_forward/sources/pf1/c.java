package pf1;

/* loaded from: classes7.dex */
public interface c extends gb1.l {
    @Override // gb1.l
    default void d(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            data.put("webviewId", hashCode());
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: getAndroidView */
    android.view.View mo158317x11b85c7e();

    /* renamed from: getWebView */
    pf1.d mo158318x86b9ebe3();
}
