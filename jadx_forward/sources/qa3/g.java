package qa3;

/* loaded from: classes15.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa3.f f442579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, qa3.f fVar) {
        super(1);
        this.f442578d = str;
        this.f442579e = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (url.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(this.f442578d, true, 2, 0L, null, this.f442579e);
        } else {
            oq1.q qVar = new oq1.q();
            qVar.f428879a = this.f442578d;
            qVar.f428882d = url;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "debug", null, null, this.f442579e);
        }
        return jz5.f0.f384359a;
    }
}
