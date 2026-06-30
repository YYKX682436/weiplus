package nw4;

/* loaded from: classes.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422535e;

    public x(nw4.n nVar, java.lang.String str) {
        this.f422535e = nVar;
        this.f422534d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422535e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422534d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e17.getMessage());
        }
    }
}
