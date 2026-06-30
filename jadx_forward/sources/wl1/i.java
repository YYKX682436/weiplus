package wl1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final wl1.a f528577a;

    public i(wl1.a invoker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
        this.f528577a = invoker;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invokeHandler */
    public final java.lang.String m174128x304a33b2(java.lang.String str, java.lang.String str2, int i17) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "log")) {
            return this.f528577a.a(str, str2, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RichTextWebViewBridge", "log data:" + str2);
        return "";
    }
}
