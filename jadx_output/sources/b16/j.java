package b16;

/* loaded from: classes16.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.k f17193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b16.k kVar) {
        super(0);
        this.f17193d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b16.k kVar = this.f17193d;
        n16.c a17 = kVar.a();
        e16.a aVar = kVar.f17199b;
        if (a17 == null) {
            return h26.m.c(h26.l.K, aVar.toString());
        }
        n06.e eVar = n06.e.f333968a;
        a16.l lVar = kVar.f17198a;
        o06.g b17 = n06.e.b(eVar, a17, lVar.f649a.f629o.h(), null, 4, null);
        if (b17 == null) {
            u06.x xVar = new u06.x(xz5.a.b(xz5.a.a(((u06.j) aVar).f423510a)));
            a16.d dVar = lVar.f649a;
            a16.p pVar = (a16.p) dVar.f625k;
            pVar.getClass();
            w16.c cVar = pVar.f660a;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("resolver");
                throw null;
            }
            b17 = cVar.a(xVar);
            if (b17 == null) {
                b17 = o06.l0.c(dVar.f629o, n16.b.l(a17), dVar.f618d.c().f17494l);
            }
        }
        return b17.k();
    }
}
