package iv0;

/* loaded from: classes5.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv0.a f376612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iv0.c f376613f;

    public p(iv0.w wVar, mv0.a aVar, iv0.c cVar) {
        this.f376611d = wVar;
        this.f376612e = aVar;
        this.f376613f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iv0.w wVar = this.f376611d;
        gx0.w8 m76 = wVar.m7();
        mv0.a aVar = this.f376612e;
        java.lang.Float a17 = by0.b.a(aVar.f413060a.f413063a);
        m76.q7(a17 != null ? a17.floatValue() : 0.5625f, this.f376613f.mo47066x10b53b15());
        gx0.kh p76 = wVar.p7();
        p76.getClass();
        mv0.b aspectRatioType = aVar.f413060a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aspectRatioType, "aspectRatioType");
        ex0.a0 a0Var = p76.f358175r;
        if (a0Var != null) {
            a0Var.f338636m = aspectRatioType;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 a18 = com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73.a(aspectRatioType.f413063a);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = p76.o7();
        if (o76 != null) {
            o76.C(a18);
        }
        iv0.w.l7(wVar).post(new iv0.o(wVar));
    }
}
