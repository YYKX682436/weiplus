package nw4;

/* loaded from: classes.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422507e;

    public t1(nw4.n nVar, java.lang.String str) {
        this.f422507e = nVar;
        this.f422506d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422507e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422506d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
