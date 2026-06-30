package av4;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f95882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e) {
        super(0);
        this.f95880d = str;
        this.f95881e = str2;
        this.f95882f = abstractC19224x1fe3df6e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f95881e;
        java.lang.String str2 = this.f95880d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "onSearchWebQueryReady " + str2 + ' ' + str);
            this.f95882f.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ')', av4.w0.f95879a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "onSendEventToJSBridge fail, event=%s, ex=%s", str2, e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
