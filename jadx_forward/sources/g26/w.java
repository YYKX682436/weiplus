package g26;

/* loaded from: classes16.dex */
public final class w implements g26.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g26.w f349551a = new g26.w();

    @Override // i26.o
    public boolean A(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        return g26.b.L(this, g0(iVar)) != g26.b.L(this, l0(iVar));
    }

    @Override // i26.o
    public boolean B(i26.i iVar) {
        return g26.b.H(this, iVar);
    }

    @Override // i26.o
    public boolean C(i26.m mVar) {
        return g26.b.D(this, mVar);
    }

    @Override // i26.o
    public boolean D(i26.m mVar) {
        return g26.b.G(this, mVar);
    }

    @Override // i26.o
    public boolean E(i26.m mVar) {
        return g26.b.M(this, mVar);
    }

    @Override // i26.o
    public boolean F(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        return (iVar instanceof i26.j) && g26.b.L(this, (i26.j) iVar);
    }

    @Override // i26.o
    public boolean G(i26.m mVar) {
        return g26.b.F(this, mVar);
    }

    @Override // i26.o
    public boolean H(i26.d receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        return receiver instanceof s16.a;
    }

    @Override // i26.o
    public i26.r I(i26.n nVar) {
        return g26.b.z(this, nVar);
    }

    @Override // i26.o
    public boolean J(i26.n nVar, i26.m mVar) {
        return g26.b.B(this, nVar, mVar);
    }

    @Override // i26.o
    public i26.l K(i26.c cVar) {
        return g26.b.a0(this, cVar);
    }

    @Override // i26.o
    public boolean L(i26.m mVar, i26.m mVar2) {
        return g26.b.a(this, mVar, mVar2);
    }

    @Override // i26.o
    public i26.j M(i26.g gVar) {
        return g26.b.U(this, gVar);
    }

    @Override // i26.o
    public boolean N(i26.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        return g26.b.E(this, g26.b.e0(this, jVar));
    }

    @Override // g26.d
    public i26.i O(i26.j jVar, i26.j jVar2) {
        return g26.b.l(this, jVar, jVar2);
    }

    @Override // i26.o
    public boolean P(i26.d dVar) {
        return g26.b.P(this, dVar);
    }

    @Override // i26.o
    public i26.n Q(i26.m mVar, int i17) {
        return g26.b.p(this, mVar, i17);
    }

    @Override // i26.o
    public i26.g R(i26.i iVar) {
        return g26.b.g(this, iVar);
    }

    @Override // i26.o
    public i26.m S(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        if (h17 == null) {
            h17 = g0(iVar);
        }
        return g26.b.e0(this, h17);
    }

    @Override // i26.o
    public int T(i26.m mVar) {
        return g26.b.Y(this, mVar);
    }

    @Override // i26.o
    public boolean U(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 != null ? g26.b.e(this, h17) : null) != null;
    }

    @Override // i26.o
    public java.util.Collection V(i26.m mVar) {
        return g26.b.c0(this, mVar);
    }

    @Override // i26.o
    public i26.b W(i26.d dVar) {
        return g26.b.k(this, dVar);
    }

    @Override // i26.o
    public i26.l X(i26.i iVar, int i17) {
        return g26.b.m(this, iVar, i17);
    }

    @Override // i26.o
    public boolean Y(i26.m mVar) {
        return g26.b.K(this, mVar);
    }

    @Override // f26.w2
    public i26.i Z(i26.i iVar) {
        i26.j h07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 == null || (h07 = g26.b.h0(this, h17, true)) == null) ? iVar : h07;
    }

    @Override // i26.o
    public boolean a(i26.j jVar) {
        return g26.b.O(this, jVar);
    }

    @Override // i26.o
    public java.util.List a0(i26.j jVar, i26.m constructor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        return null;
    }

    @Override // i26.o
    public i26.j b(i26.e eVar) {
        return g26.b.X(this, eVar);
    }

    @Override // i26.o
    public int b0(i26.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        if (kVar instanceof i26.j) {
            return g26.b.b(this, (i26.i) kVar);
        }
        if (kVar instanceof i26.a) {
            return ((i26.a) kVar).size();
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(kVar.getClass())).toString());
    }

    @Override // i26.o
    public f26.a2 c(i26.j jVar) {
        return g26.b.b0(this, jVar);
    }

    @Override // i26.o
    public i26.j c0(i26.j jVar, boolean z17) {
        return g26.b.h0(this, jVar, z17);
    }

    @Override // i26.o
    public i26.j d(i26.g gVar) {
        return g26.b.f0(this, gVar);
    }

    @Override // i26.o
    public boolean d0(i26.m mVar) {
        return g26.b.J(this, mVar);
    }

    @Override // i26.o
    public i26.l e(i26.i iVar) {
        return g26.b.i(this, iVar);
    }

    @Override // i26.o
    public boolean e0(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 != null ? g26.b.d(this, h17) : null) != null;
    }

    @Override // i26.o
    public i26.i f(i26.l lVar) {
        return g26.b.u(this, lVar);
    }

    @Override // i26.o
    public i26.n f0(i26.m mVar) {
        return g26.b.v(this, mVar);
    }

    @Override // i26.o
    public boolean g(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 == null) {
            return false;
        }
        g26.b.f(this, g17);
        return false;
    }

    @Override // i26.o
    public i26.j g0(i26.i iVar) {
        i26.j U;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 != null && (U = g26.b.U(this, g17)) != null) {
            return U;
        }
        i26.j h17 = g26.b.h(this, iVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        return h17;
    }

    @Override // i26.o
    public boolean h(i26.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        return g26.b.J(this, g26.b.e0(this, jVar));
    }

    @Override // f26.w2
    public boolean h0(i26.m mVar) {
        return g26.b.I(this, mVar);
    }

    @Override // f26.w2
    public i26.i i(i26.i iVar) {
        return g26.b.w(this, iVar);
    }

    @Override // i26.o
    public i26.d i0(i26.j jVar) {
        return g26.b.d(this, jVar);
    }

    @Override // i26.o
    public i26.i j(i26.d dVar) {
        return g26.b.V(this, dVar);
    }

    @Override // i26.o
    public boolean j0(i26.m mVar) {
        return g26.b.E(this, mVar);
    }

    @Override // i26.o
    public i26.l k(i26.j jVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < g26.b.b(this, jVar)) {
            z17 = true;
        }
        if (z17) {
            return g26.b.m(this, jVar, i17);
        }
        return null;
    }

    @Override // i26.o
    public boolean k0(i26.j jVar) {
        g26.b.S(this, jVar);
        return false;
    }

    @Override // i26.o
    public i26.c l(i26.d dVar) {
        return g26.b.d0(this, dVar);
    }

    @Override // i26.o
    public i26.j l0(i26.i iVar) {
        i26.j f07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 != null && (f07 = g26.b.f0(this, g17)) != null) {
            return f07;
        }
        i26.j h17 = g26.b.h(this, iVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        return h17;
    }

    @Override // i26.o
    public i26.l m(i26.k kVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        if (kVar instanceof i26.j) {
            return g26.b.m(this, (i26.i) kVar, i17);
        }
        if (kVar instanceof i26.a) {
            E e17 = ((i26.a) kVar).get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "get(...)");
            return (i26.l) e17;
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(kVar.getClass())).toString());
    }

    @Override // i26.o
    public i26.j m0(i26.i iVar) {
        return g26.b.h(this, iVar);
    }

    @Override // i26.o
    public i26.r n(i26.l lVar) {
        return g26.b.y(this, lVar);
    }

    @Override // i26.o
    public boolean n0(i26.i iVar) {
        return g26.b.N(this, iVar);
    }

    @Override // i26.o
    public i26.m o(i26.j jVar) {
        return g26.b.e0(this, jVar);
    }

    @Override // i26.o
    public i26.i o0(i26.i iVar, boolean z17) {
        return g26.b.g0(this, iVar, z17);
    }

    @Override // i26.o
    public boolean p(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        return g26.b.M(this, S(iVar)) && !g26.b.N(this, iVar);
    }

    @Override // f26.w2
    public i26.i p0(i26.n nVar) {
        return g26.b.t(this, nVar);
    }

    @Override // i26.o
    public i26.i q(i26.i iVar) {
        return g26.b.W(this, iVar);
    }

    @Override // i26.o
    public boolean q0(i26.l lVar) {
        return g26.b.Q(this, lVar);
    }

    @Override // i26.o
    public i26.e r(i26.j jVar) {
        return g26.b.e(this, jVar);
    }

    @Override // i26.o
    public boolean r0(i26.j jVar) {
        return g26.b.L(this, jVar);
    }

    @Override // i26.o
    public java.util.Collection s(i26.j jVar) {
        return g26.b.Z(this, jVar);
    }

    @Override // i26.o
    public boolean s0(i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        return receiver instanceof f26.w0;
    }

    @Override // i26.o
    public boolean t(i26.j jVar) {
        g26.b.R(this, jVar);
        return false;
    }

    public boolean t0(i26.i iVar, n16.c cVar) {
        return g26.b.A(this, iVar, cVar);
    }

    @Override // i26.o
    public i26.i u(java.util.List types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        return g26.e.a(types);
    }

    @Override // i26.o
    public int v(i26.i iVar) {
        return g26.b.b(this, iVar);
    }

    @Override // i26.o
    public i26.k w(i26.j jVar) {
        return g26.b.c(this, jVar);
    }

    @Override // i26.q
    public boolean x(i26.j jVar, i26.j jVar2) {
        return g26.b.C(this, jVar, jVar2);
    }

    @Override // i26.o
    public i26.j y(i26.j jVar) {
        i26.j X;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        i26.e e17 = g26.b.e(this, jVar);
        return (e17 == null || (X = g26.b.X(this, e17)) == null) ? jVar : X;
    }

    @Override // i26.o
    public i26.j z(i26.j jVar, i26.b bVar) {
        return g26.b.j(this, jVar, bVar);
    }
}
