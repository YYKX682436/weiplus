package ra3;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f475025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ra3.g0 f475026e;

    public e0(ra3.g0 g0Var, boolean z17, android.net.Uri uri) {
        this.f475026e = g0Var;
        this.f475025d = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.net.Uri uri = this.f475025d;
        uri.toString();
        try {
            if (uri.toString().matches(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri.toString().contains(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) {
                ra3.g0 g0Var = this.f475026e;
                ra3.g0.a(g0Var, g0Var.f475037e, uri);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppUtils", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
