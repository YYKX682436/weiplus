package qx4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f448949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448951f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e, java.lang.String str, qx4.d0 d0Var) {
        this.f448949d = abstractC19224x1fe3df6e;
        this.f448950e = str;
        this.f448951f = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = this.f448949d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "startCheck , Runnable = " + abstractC19224x1fe3df6e.m81403xce19f7b8());
            abstractC19224x1fe3df6e.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f448950e + ')', null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f448951f.f448933i, e17.getMessage());
        }
    }
}
