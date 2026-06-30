package sx5;

/* loaded from: classes13.dex */
public class p implements android.webkit.ValueCallback {
    public p(sx5.a1 a1Var) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        by5.c4.b("XWebNativeInterface", "xwebToJS, videoSeek, result:" + ((java.lang.String) obj));
    }
}
