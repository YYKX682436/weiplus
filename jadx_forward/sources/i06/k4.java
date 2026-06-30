package i06;

/* loaded from: classes15.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final i06.k4 f368219a = new i06.k4();

    /* renamed from: b, reason: collision with root package name */
    public static final n16.b f368220b = n16.b.l(new n16.c("java.lang.Void"));

    public final i06.s a(o06.n0 n0Var) {
        java.lang.String a17 = x06.a1.a(n0Var);
        if (a17 == null) {
            if (n0Var instanceof o06.p1) {
                java.lang.String h17 = v16.f.l(n0Var).mo132800xfb82e301().h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
                a17 = x06.o0.a(h17);
            } else if (n0Var instanceof o06.q1) {
                java.lang.String h18 = v16.f.l(n0Var).mo132800xfb82e301().h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "asString(...)");
                a17 = x06.o0.b(h18);
            } else {
                a17 = n0Var.mo132800xfb82e301().h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "asString(...)");
            }
        }
        return new i06.s(new m16.e(a17, g16.w0.a(n0Var, false, false, 1, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i06.y b(o06.o1 possiblyOverriddenProperty) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        o06.o1 a17 = ((o06.o1) r16.i.v(possiblyOverriddenProperty)).a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getOriginal(...)");
        if (a17 instanceof d26.n0) {
            d26.n0 n0Var = (d26.n0) a17;
            i16.u0 u0Var = n0Var.H;
            p16.u propertySignature = l16.r.f396628d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(propertySignature, "propertySignature");
            l16.j jVar = (l16.j) k16.i.a(u0Var, propertySignature);
            if (jVar != null) {
                return new i06.w(a17, u0Var, jVar, n0Var.I, n0Var.f307566J);
            }
        } else if (a17 instanceof z06.i) {
            o06.x1 mo9602x2fa78b11 = ((z06.i) a17).mo9602x2fa78b11();
            d16.a aVar = mo9602x2fa78b11 instanceof d16.a ? (d16.a) mo9602x2fa78b11 : null;
            u06.b0 b0Var = aVar != null ? ((t06.l) aVar).f496077b : null;
            if (b0Var instanceof u06.d0) {
                return new i06.u(((u06.d0) b0Var).f505028a);
            }
            if (!(b0Var instanceof u06.g0)) {
                throw new i06.a4("Incorrect resolution sequence for Java field " + a17 + " (source = " + b0Var + ')');
            }
            java.lang.reflect.Method method = ((u06.g0) b0Var).f505035a;
            o06.q1 b17 = a17.b();
            o06.x1 mo9602x2fa78b112 = b17 != null ? ((r06.w) b17).mo9602x2fa78b11() : null;
            d16.a aVar2 = mo9602x2fa78b112 instanceof d16.a ? (d16.a) mo9602x2fa78b112 : null;
            u06.b0 b0Var2 = aVar2 != null ? ((t06.l) aVar2).f496077b : null;
            u06.g0 g0Var = b0Var2 instanceof u06.g0 ? (u06.g0) b0Var2 : null;
            return new i06.v(method, g0Var != null ? g0Var.f505035a : null);
        }
        o06.p1 c17 = a17.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        i06.s a18 = a(c17);
        o06.q1 b18 = a17.b();
        return new i06.x(a18, b18 != null ? a(b18) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i06.t c(o06.n0 possiblySubstitutedFunction) {
        java.lang.reflect.Method method;
        m16.e a17;
        m16.e c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        o06.n0 a18 = ((o06.n0) r16.i.v(possiblySubstitutedFunction)).a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getOriginal(...)");
        if (!(a18 instanceof d26.b)) {
            if (a18 instanceof z06.h) {
                o06.x1 mo9602x2fa78b11 = ((z06.h) a18).mo9602x2fa78b11();
                d16.a aVar = mo9602x2fa78b11 instanceof d16.a ? (d16.a) mo9602x2fa78b11 : null;
                u06.b0 b0Var = aVar != null ? ((t06.l) aVar).f496077b : null;
                u06.g0 g0Var = b0Var instanceof u06.g0 ? (u06.g0) b0Var : null;
                if (g0Var != null && (method = g0Var.f505035a) != null) {
                    return new i06.q(method);
                }
                throw new i06.a4("Incorrect resolution sequence for Java method " + a18);
            }
            if (!(a18 instanceof z06.b)) {
                r06.v vVar = (r06.v) a18;
                if ((vVar.mo132800xfb82e301().m148891xb2c87fbf(l06.x.f396481c) && r16.h.k(a18)) == false) {
                    if ((vVar.mo132800xfb82e301().m148891xb2c87fbf(l06.x.f396479a) && r16.h.k(a18)) == false && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.mo132800xfb82e301(), n06.a.f415469e) || !a18.W().isEmpty())) {
                        r2 = false;
                    }
                }
                if (r2) {
                    return a(a18);
                }
                throw new i06.a4("Unknown origin of " + a18 + " (" + a18.getClass() + ')');
            }
            o06.x1 mo9602x2fa78b112 = ((z06.b) a18).mo9602x2fa78b11();
            d16.a aVar2 = mo9602x2fa78b112 instanceof d16.a ? (d16.a) mo9602x2fa78b112 : null;
            java.lang.Object obj = aVar2 != null ? ((t06.l) aVar2).f496077b : null;
            if (obj instanceof u06.a0) {
                return new i06.p(((u06.a0) obj).f505020a);
            }
            if (obj instanceof u06.x) {
                u06.x xVar = (u06.x) obj;
                if (xVar.h()) {
                    return new i06.n(xVar.f505066a);
                }
            }
            throw new i06.a4("Incorrect resolution sequence for Java constructor " + a18 + " (" + obj + ')');
        }
        d26.b bVar = (d26.b) a18;
        p16.h0 E = bVar.E();
        if ((E instanceof i16.j0) && (c17 = m16.j.f404432a.c((i16.j0) E, bVar.X(), bVar.t())) != null) {
            return new i06.s(c17);
        }
        if (!(E instanceof i16.r) || (a17 = m16.j.f404432a.a((i16.r) E, bVar.X(), bVar.t())) == null) {
            return a(a18);
        }
        o06.m e17 = possiblySubstitutedFunction.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
        if (r16.m.b(e17)) {
            return new i06.s(a17);
        }
        o06.m e18 = possiblySubstitutedFunction.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "getContainingDeclaration(...)");
        if (!r16.m.c(e18)) {
            return new i06.r(a17);
        }
        o06.l lVar = (o06.l) possiblySubstitutedFunction;
        boolean mo150370xcaae5578 = lVar.mo150370xcaae5578();
        java.lang.String name = a17.f404423a;
        java.lang.String str = a17.f404424b;
        if (mo150370xcaae5578) {
            if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "constructor-impl") && r26.i0.o(str, ")V", false, 2, null))) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + a17).toString());
            }
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "constructor-impl")) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + a17).toString());
            }
            o06.g D = lVar.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "getConstructedClass(...)");
            n16.b f17 = v16.f.f(D);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            java.lang.String c18 = f17.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "asString(...)");
            java.lang.String b17 = m16.b.b(c18);
            if (r26.i0.o(str, ")V", false, 2, null)) {
                java.lang.String desc = r26.n0.Z(str, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a) + b17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                a17 = new m16.e(name, desc);
            } else if (!r26.i0.n(str, b17, false)) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + a17).toString());
            }
        }
        return new i06.s(a17);
    }
}
