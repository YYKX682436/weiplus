package nw4;

/* loaded from: classes.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422416f;

    public m1(nw4.n nVar, java.lang.String str, java.lang.String str2) {
        this.f422416f = nVar;
        this.f422414d = str;
        this.f422415e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422416f.f422420a.mo14660x738236e6("javascript:typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge._handleMessageFromWeixin(" + this.f422414d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f422415e, e17.getMessage());
        }
    }
}
