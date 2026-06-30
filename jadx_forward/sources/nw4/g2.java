package nw4;

/* loaded from: classes.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422377e;

    public g2(nw4.n nVar, java.lang.String str) {
        this.f422377e = nVar;
        this.f422376d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f422377e.f422420a;
            if (c22633x83752a59 != null) {
                c22633x83752a59.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422376d + ")", null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "eval onMiniProgramData, ex = %s", e17);
        }
    }
}
