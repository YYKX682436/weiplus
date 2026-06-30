package xc5;

/* loaded from: classes12.dex */
public final class a1 implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f534907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f534908b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f534909c;

    /* renamed from: d, reason: collision with root package name */
    public final gg3.c f534910d;

    /* renamed from: e, reason: collision with root package name */
    public final sf3.g f534911e;

    /* renamed from: f, reason: collision with root package name */
    public final float f534912f;

    /* renamed from: g, reason: collision with root package name */
    public final float f534913g;

    /* renamed from: h, reason: collision with root package name */
    public float f534914h;

    /* renamed from: i, reason: collision with root package name */
    public float f534915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f534916j;

    public a1(xc5.k1 k1Var, mf3.k mediaInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String imageMediaId, java.lang.String videoMediaId, gg3.c forceVideoLoadParam, sf3.g forceImageLoadParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageMediaId, "imageMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMediaId, "videoMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceVideoLoadParam, "forceVideoLoadParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceImageLoadParam, "forceImageLoadParam");
        this.f534916j = k1Var;
        this.f534907a = mediaInfo;
        this.f534908b = imageMediaId;
        this.f534909c = videoMediaId;
        this.f534910d = forceVideoLoadParam;
        this.f534911e = forceImageLoadParam;
        j15.d dVar = new j15.d();
        java.lang.String j17 = msgInfo.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        long r17 = dVar.o().r();
        r17 = r17 < 0 ? 0L : r17;
        j15.c t17 = dVar.o().t();
        long o17 = t17 != null ? t17.o() : 0L;
        o17 = o17 < 0 ? 0L : o17;
        long j18 = r17 + o17;
        if (j18 <= 0) {
            this.f534912f = 0.5f;
            this.f534913g = 0.5f;
        } else {
            float f17 = (float) r17;
            float f18 = (float) j18;
            this.f534912f = f17 / f18;
            this.f534913g = ((float) o17) / f18;
        }
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        java.lang.String str;
        if (n1Var == null || (str = n1Var.f152637b) == null) {
            return;
        }
        dn.g gVar = n1Var.f152640e;
        float f17 = gVar != null ? (float) gVar.f69496x83ec3dd : 0.0f;
        float f18 = gVar != null ? (float) gVar.f69500x8ab84c59 : -1.0f;
        if (f18 <= 0.0f) {
            return;
        }
        float f19 = f17 / f18;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f534908b)) {
            this.f534914h = f19;
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f534909c)) {
            return;
        } else {
            this.f534915i = f19;
        }
        float f27 = (this.f534914h * this.f534912f) + (this.f534915i * this.f534913g);
        this.f534907a.mo2110x5db1b11();
        xc5.k1 k1Var = this.f534916j;
        mf3.k kVar = this.f534907a;
        vf3.e eVar = vf3.e.f517913g;
        k1Var.Y6(kVar, eVar, new vf3.f(eVar, null, 0, f27, 6, null), this.f534910d, this.f534911e);
    }
}
