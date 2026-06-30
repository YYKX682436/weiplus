package nw4;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422344e;

    public c2(nw4.n nVar, java.lang.String str) {
        this.f422344e = nVar;
        this.f422343d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422344e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422343d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e17.getMessage());
        }
    }
}
