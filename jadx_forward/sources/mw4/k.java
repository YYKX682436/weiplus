package mw4;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw4.n f413306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mw4.n nVar) {
        super(3);
        this.f413306d = nVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj2;
        java.util.Map lowercaseHeaders = (java.util.Map) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        java.util.Iterator it = ((java.util.ArrayList) this.f413306d.f413314a).iterator();
        com.p314xaae8f345.p3210x3857dc.y0 y0Var = null;
        while (it.hasNext() && (y0Var = (com.p314xaae8f345.p3210x3857dc.y0) ((yz5.q) it.next()).mo147xb9724478(webview, request, lowercaseHeaders)) == null) {
        }
        return y0Var;
    }
}
