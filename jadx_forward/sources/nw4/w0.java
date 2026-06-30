package nw4;

/* loaded from: classes.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422531e;

    public w0(nw4.n nVar, java.lang.String str) {
        this.f422531e = nVar;
        this.f422530d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422531e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422530d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, ex = %s", e17.getMessage());
        }
    }
}
