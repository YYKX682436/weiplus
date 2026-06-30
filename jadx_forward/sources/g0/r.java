package g0;

/* loaded from: classes14.dex */
public final class r extends g0.b implements t1.d, g0.e {

    /* renamed from: g, reason: collision with root package name */
    public g0.m f348905g;

    /* renamed from: h, reason: collision with root package name */
    public jz5.l f348906h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f348907i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g0.e defaultParent) {
        super(defaultParent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultParent, "defaultParent");
    }

    public static final java.lang.Object b(g0.r rVar, jz5.l lVar, s1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rVar.f348907i = lVar;
        d1.g localRect = (d1.g) lVar.f384366d;
        g0.m mVar = rVar.f348905g;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("responder");
            throw null;
        }
        b0.h hVar = (b0.h) mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localRect, "localRect");
        p2.q qVar = hVar.f97841m;
        if (qVar == null) {
            throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new g0.q(rVar, hVar.a(localRect, qVar.f432929a), zVar, localRect, null), interfaceC29045xdcb5ca57);
        return f17 == pz5.a.f440719d ? f17 : jz5.f0.f384359a;
    }

    @Override // g0.e
    public java.lang.Object a(d1.g gVar, s1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new g0.o(this, zVar, gVar, null), interfaceC29045xdcb5ca57);
        return f17 == pz5.a.f440719d ? f17 : jz5.f0.f384359a;
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return g0.d.f348874a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }
}
