package ds1;

/* loaded from: classes7.dex */
public final class a extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ds1.b context) {
        super("WxGameJsCoreNative", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: error */
    public final void m125980x5c4d208(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f402963b)).getClass();
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] js console error: %s", str);
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f402963b)).getClass();
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postMessage */
    public final void m125981x58d00b47(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f402963b)).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] postMessage ignore msg: %s", str);
    }
}
