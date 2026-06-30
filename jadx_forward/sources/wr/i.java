package wr;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.c f530279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f530280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wr.k f530282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wr.c cVar, wr.j jVar, java.lang.String str, wr.k kVar) {
        super(2);
        this.f530279d = cVar;
        this.f530280e = jVar;
        this.f530281f = str;
        this.f530282g = kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String identifier = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifier, "identifier");
        wr.j jVar = this.f530280e;
        wr.c cVar = this.f530279d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "remote thumb img downloaded. md5:" + cVar.f530266a);
            jVar.getClass();
            pm0.v.X(new wr.e(jVar, this.f530281f));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageMgr", "failed to load thumb img. fallback to local gen. md5:" + cVar.f530266a + ", url:" + this.f530282g.f530286a);
            jVar.c(cVar.f530267b);
        }
        return jz5.f0.f384359a;
    }
}
