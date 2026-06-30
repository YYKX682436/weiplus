package fy4;

/* loaded from: classes.dex */
public final class b implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final fy4.b f348787a = new fy4.b();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionHelper", "insertLineBreak result: " + str);
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "null")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewInputConnectionHelper", "insertLineBreak returned null, function may not exist or page not ready");
        }
    }
}
