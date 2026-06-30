package yw4;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw4.q f548508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548509e;

    public n(yw4.q qVar, java.lang.String str) {
        this.f548508d = qVar;
        this.f548509e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f548508d.f548513c.mo14660x738236e6("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + this.f548509e + ')', new yw4.m());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsApiHandler", e17, "doCallback exception", new java.lang.Object[0]);
        }
    }
}
