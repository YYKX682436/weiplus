package lu4;

/* loaded from: classes7.dex */
public final class g extends lu4.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String tagName) {
        super("console", new lu4.f());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        this.f402967d = tagName;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: error */
    public final void m146348x5c4d208(java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402964c, "JsError[" + this.f402967d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: info */
    public final void m146349x3164ae(java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "JsInfo[" + this.f402967d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() < 1) {
            kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: warn */
    public final void m146350x379286(java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f402964c, "JsInfo[" + this.f402967d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }
}
