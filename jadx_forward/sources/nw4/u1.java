package nw4;

/* loaded from: classes.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422515f;

    public u1(nw4.n nVar, java.lang.String str, java.lang.String str2) {
        this.f422515f = nVar;
        this.f422513d = str;
        this.f422514e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422515f.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422513d + ")", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "%s fail, ex = %s", this.f422514e, e17.getMessage());
        }
    }
}
