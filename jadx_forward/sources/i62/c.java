package i62;

/* loaded from: classes13.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn5.l f370474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yn5.l lVar) {
        super(0);
        this.f370474d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean m40539x7a994349 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        yn5.l result = this.f370474d;
        if (m40539x7a994349) {
            result.m177422x9616526c();
            result.c();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        i62.o oVar = i62.o.f370496a;
        if (oVar.c(e42.d0.clicfg_inflate_xml_sample_and)) {
            long j17 = result.f545569b;
            int a17 = oVar.a();
            yn5.f fVar = (yn5.f) ((jz5.n) result.f545571d).mo141623x754a37bb();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7156x633fd19f c7156x633fd19f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7156x633fd19f();
            c7156x633fd19f.f144618d = c7156x633fd19f.b("ActName", result.f545568a, true);
            c7156x633fd19f.f144619e = j17;
            c7156x633fd19f.f144620f = a17;
            c7156x633fd19f.f144621g = fVar.f545554a;
            c7156x633fd19f.f144622h = fVar.f545555b;
            c7156x633fd19f.f144623i = fVar.f545556c;
            c7156x633fd19f.f144624j = fVar.f545557d;
            c7156x633fd19f.f144625k = fVar.f545558e;
            c7156x633fd19f.f144626l = fVar.f545559f;
            float f17 = 100;
            c7156x633fd19f.f144627m = fVar.f545560g * f17;
            c7156x633fd19f.f144628n = fVar.f545561h * f17;
            c7156x633fd19f.k();
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                java.lang.String n17 = c7156x633fd19f.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false);
            }
        }
        return jz5.f0.f384359a;
    }
}
