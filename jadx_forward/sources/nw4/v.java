package nw4;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422517e;

    public v(nw4.n nVar, java.lang.String str) {
        this.f422517e = nVar;
        this.f422516d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422517e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422516d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange, %s", e17.getMessage());
        }
    }
}
