package av4;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f14279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f14279d = mMWebView;
        this.f14280e = str;
        this.f14281f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            this.f14279d.evaluateJavascript(this.f14280e, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", e17, "notifyWebView fail, event=" + this.f14281f, new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
