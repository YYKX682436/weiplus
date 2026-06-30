package zx4;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final zx4.k f558695a;

    /* renamed from: b, reason: collision with root package name */
    public final zx4.k f558696b;

    public l(zx4.e listener) {
        zx4.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        zx4.k kVar2 = null;
        try {
            zx4.j jVar = zx4.k.f558688e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append(android.os.Environment.DIRECTORY_PICTURES);
            sb6.append(str);
            sb6.append("Screenshots");
            sb6.append(str);
            kVar = jVar.a(sb6.toString(), listener);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebView.WebViewScreenshotObserverCompact", e17, "<init>, create observer1 fail", new java.lang.Object[0]);
            kVar = null;
        }
        this.f558695a = kVar;
        try {
            zx4.j jVar2 = zx4.k.f558688e;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = java.io.File.separator;
            sb7.append(str2);
            sb7.append(android.os.Environment.DIRECTORY_DCIM);
            sb7.append(str2);
            sb7.append("Screenshots");
            sb7.append(str2);
            kVar2 = jVar2.a(sb7.toString(), listener);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebView.WebViewScreenshotObserverCompact", e18, "<init>, create observer2 fail", new java.lang.Object[0]);
        }
        this.f558696b = kVar2;
    }
}
