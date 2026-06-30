package b16;

/* loaded from: classes16.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.k f98726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b16.k kVar) {
        super(0);
        this.f98726d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b16.k kVar = this.f98726d;
        n16.c a17 = kVar.a();
        e16.a aVar = kVar.f98732b;
        if (a17 == null) {
            return h26.m.c(h26.l.K, aVar.toString());
        }
        n06.e eVar = n06.e.f415501a;
        a16.l lVar = kVar.f98731a;
        o06.g b17 = n06.e.b(eVar, a17, lVar.f82182a.f82162o.h(), null, 4, null);
        if (b17 == null) {
            u06.x xVar = new u06.x(xz5.a.b(xz5.a.a(((u06.j) aVar).f505043a)));
            a16.d dVar = lVar.f82182a;
            a16.p pVar = (a16.p) dVar.f82158k;
            pVar.getClass();
            w16.c cVar = pVar.f82193a;
            if (cVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resolver");
                throw null;
            }
            b17 = cVar.a(xVar);
            if (b17 == null) {
                b17 = o06.l0.c(dVar.f82162o, n16.b.l(a17), dVar.f82151d.c().f99027l);
            }
        }
        return b17.k();
    }
}
