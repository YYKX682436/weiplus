package nw4;

/* loaded from: classes.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422340e;

    public c0(nw4.n nVar, java.lang.String str) {
        this.f422340e = nVar;
        this.f422339d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422340e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422339d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onLocalImageUploadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
