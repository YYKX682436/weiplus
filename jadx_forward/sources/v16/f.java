package v16;

/* loaded from: classes15.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f514134a = 0;

    static {
        n16.g.k("value");
    }

    public static final boolean a(o06.l2 l2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l2Var, "<this>");
        java.lang.Boolean d17 = o26.h.d(kz5.b0.c(l2Var), v16.a.f514128a, v16.c.f514130d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "ifAny(...)");
        return d17.booleanValue();
    }

    public static o06.d b(o06.d dVar, boolean z17, yz5.l predicate, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return (o06.d) o26.h.b(kz5.b0.c(dVar), new v16.b(z17), new v16.d(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), predicate));
    }

    public static final n16.c c(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        n16.e h17 = h(mVar);
        if (!h17.e()) {
            h17 = null;
        }
        if (h17 != null) {
            return h17.h();
        }
        return null;
    }

    public static final o06.g d(p06.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        o06.j i17 = cVar.mo9609xfb85f7b0().w0().i();
        if (i17 instanceof o06.g) {
            return (o06.g) i17;
        }
        return null;
    }

    public static final l06.o e(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        return j(mVar).h();
    }

    public static final n16.b f(o06.j jVar) {
        o06.m e17;
        n16.b f17;
        if (jVar == null || (e17 = jVar.e()) == null) {
            return null;
        }
        if (e17 instanceof o06.d1) {
            return new n16.b(((r06.z0) ((o06.d1) e17)).f450099h, jVar.mo132800xfb82e301());
        }
        if (!(e17 instanceof o06.k) || (f17 = f((o06.j) e17)) == null) {
            return null;
        }
        return f17.d(jVar.mo132800xfb82e301());
    }

    public static final n16.c g(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        n16.c h17 = r16.i.h(mVar);
        if (h17 == null) {
            h17 = r16.i.g(mVar.e()).b(mVar.mo132800xfb82e301()).h();
        }
        if (h17 != null) {
            return h17;
        }
        r16.i.a(4);
        throw null;
    }

    public static final n16.e h(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        n16.e g17 = r16.i.g(mVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getFqName(...)");
        return g17;
    }

    public static final g26.l i(o06.v0 v0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v0Var, "<this>");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(v0Var.I(g26.m.f349528a));
        return g26.k.f349527a;
    }

    public static final o06.v0 j(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        o06.v0 d17 = r16.i.d(mVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getContainingModule(...)");
        return d17;
    }

    public static final q26.n k(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        q26.n d17 = q26.y.d(mVar, v16.e.f514133d);
        return d17 instanceof q26.f ? ((q26.f) d17).a(1) : new q26.e(d17, 1);
    }

    public static final o06.d l(o06.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        if (!(dVar instanceof o06.n1)) {
            return dVar;
        }
        o06.o1 s07 = ((r06.d1) ((o06.n1) dVar)).s0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s07, "getCorrespondingProperty(...)");
        return s07;
    }
}
