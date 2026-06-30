package fl4;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f345480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 f345481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f345484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f345485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bw5.jq0 jq0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        super(1);
        this.f345480d = jq0Var;
        this.f345481e = serviceC18717xf3b2cd83;
        this.f345482f = str;
        this.f345483g = i17;
        this.f345484h = h0Var;
        this.f345485i = h0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345480d, this.f345481e.f256234x)) {
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMediaBrowserService", "fetch bitmap fail:" + this.f345482f);
            } else {
                d75.b.g(new fl4.m(this.f345481e, this.f345482f, bitmap, this.f345480d, this.f345483g, this.f345484h, this.f345485i));
            }
        }
        return jz5.f0.f384359a;
    }
}
