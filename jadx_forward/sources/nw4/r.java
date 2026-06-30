package nw4;

/* loaded from: classes.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422485e;

    public r(nw4.n nVar, java.lang.String str) {
        this.f422485e = nVar;
        this.f422484d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422485e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422484d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "onExdeviceStateChange, %s", e17.getMessage());
        }
    }
}
