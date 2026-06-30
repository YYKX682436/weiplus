package sf1;

/* loaded from: classes13.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f488534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f488535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf1.g f488536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488537g;

    public n(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.a aVar, sf1.g gVar, java.lang.String str) {
        this.f488534d = c0Var;
        this.f488535e = aVar;
        this.f488536f = gVar;
        this.f488537g = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        super.g();
        if (this.f488534d.f391645d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f488537g, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, onActivityResult not call");
        this.f488535e.mo152xb9724478();
        sf1.g.c(this.f488536f, null, 1, null);
    }
}
