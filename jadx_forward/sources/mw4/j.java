package mw4;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f413304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f413305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.r rVar, yz5.q qVar) {
        super(3);
        this.f413304d = rVar;
        this.f413305e = qVar;
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
        return (com.p314xaae8f345.p3210x3857dc.y0) this.f413304d.C(this.f413305e, webview, request, lowercaseHeaders);
    }
}
