package g26;

/* loaded from: classes16.dex */
public abstract class b {
    public static boolean A(g26.d dVar, i26.i receiver, n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        if (receiver instanceof f26.o0) {
            return ((f26.o0) receiver).mo9601xa083c1ee().I(fqName);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean B(g26.d dVar, i26.n receiver, i26.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (!(receiver instanceof o06.e2)) {
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
        }
        if (mVar == null ? true : mVar instanceof f26.c2) {
            return j26.c.h((o06.e2) receiver, (f26.c2) mVar, null, 4, null);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean C(g26.d dVar, i26.j a17, i26.j b17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        if (!(a17 instanceof f26.z0)) {
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a17 + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(a17.getClass())).toString());
        }
        if (b17 instanceof f26.z0) {
            return ((f26.z0) a17).u0() == ((f26.z0) b17).u0();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b17 + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b17.getClass())).toString());
    }

    public static boolean D(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return l06.o.K((f26.c2) receiver, l06.w.f396451b);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean E(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return ((f26.c2) receiver).i() instanceof o06.g;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean F(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
            if (gVar == null) {
                return false;
            }
            return (!(gVar.f() == o06.t0.f423518e && gVar.j() != o06.h.f423495f) || gVar.j() == o06.h.f423496g || gVar.j() == o06.h.f423497h) ? false : true;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean G(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return ((f26.c2) receiver).j();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean H(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return f26.s0.a((f26.o0) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean I(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
            return (gVar != null ? gVar.d0() : null) instanceof o06.o0;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean J(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return receiver instanceof t16.s;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean K(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return receiver instanceof f26.n0;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean L(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            return ((f26.z0) receiver).x0();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean M(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return l06.o.K((f26.c2) receiver, l06.w.f396453c);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean N(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return f26.z2.f((f26.o0) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean O(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return l06.o.H((f26.o0) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean P(g26.d dVar, i26.d receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof g26.n) {
            return ((g26.n) receiver).f349534m;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean Q(g26.d dVar, i26.l receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.l2) {
            return ((f26.l2) receiver).b();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean R(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            f26.o0 o0Var = (f26.o0) receiver;
            if (!(o0Var instanceof f26.v)) {
                return false;
            }
            return false;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean S(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            f26.o0 o0Var = (f26.o0) receiver;
            if (!(o0Var instanceof f26.v)) {
                return false;
            }
            return false;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean T(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            return i17 != null && l06.o.L(i17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.j U(g26.d dVar, i26.g receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.e0) {
            return ((f26.e0) receiver).f340686e;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i V(g26.d dVar, i26.d receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof g26.n) {
            return ((g26.n) receiver).f349531g;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i W(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c3) {
            return f26.d1.a((f26.c3) receiver, false);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.j X(g26.d dVar, i26.e receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.v) {
            return ((f26.v) receiver).f340761e;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static int Y(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            return ((f26.c2) receiver).mo9613x99879e0().size();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static java.util.Collection Z(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        i26.m o17 = dVar.o(receiver);
        if (o17 instanceof t16.s) {
            return ((t16.s) o17).f496157c;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static boolean a(g26.d dVar, i26.m c17, i26.m c27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c27, "c2");
        if (!(c17 instanceof f26.c2)) {
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(c17.getClass())).toString());
        }
        if (c27 instanceof f26.c2) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, c27);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c27 + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(c27.getClass())).toString());
    }

    public static i26.l a0(g26.d dVar, i26.c receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof g26.s) {
            return ((g26.s) receiver).f349540a;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static int b(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return ((f26.o0) receiver).u0().size();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f26.a2 b0(g26.d dVar, i26.j type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type instanceof f26.z0) {
            return new g26.c(dVar, f26.v2.e(f26.f2.f340694b.a((f26.o0) type)));
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(type.getClass())).toString());
    }

    public static i26.k c(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            return (i26.k) receiver;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static java.util.Collection c0(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            java.util.Collection a17 = ((f26.c2) receiver).a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
            return a17;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.d d(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            if (receiver instanceof f26.c1) {
                return dVar.i0(((f26.c1) receiver).f340671e);
            }
            if (receiver instanceof g26.n) {
                return (g26.n) receiver;
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.c d0(g26.d dVar, i26.d receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof g26.n) {
            return ((g26.n) receiver).f349530f;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.e e(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            if (receiver instanceof f26.v) {
                return (f26.v) receiver;
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.m e0(g26.d dVar, i26.j receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            return ((f26.z0) receiver).w0();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.f f(g26.d dVar, i26.g receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.e0) {
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.j f0(g26.d dVar, i26.g receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.e0) {
            return ((f26.e0) receiver).f340687f;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.g g(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            f26.c3 z07 = ((f26.o0) receiver).z0();
            if (z07 instanceof f26.e0) {
                return (f26.e0) z07;
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i g0(g26.d dVar, i26.i receiver, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof i26.j) {
            return dVar.c0((i26.j) receiver, z17);
        }
        if (!(receiver instanceof i26.g)) {
            throw new java.lang.IllegalStateException("sealed".toString());
        }
        i26.g gVar = (i26.g) receiver;
        return dVar.O(dVar.c0(dVar.M(gVar), z17), dVar.c0(dVar.d(gVar), z17));
    }

    public static i26.j h(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            f26.c3 z07 = ((f26.o0) receiver).z0();
            if (z07 instanceof f26.z0) {
                return (f26.z0) z07;
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.j h0(g26.d dVar, i26.j receiver, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.z0) {
            return ((f26.z0) receiver).A0(z17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.l i(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return j26.c.a((f26.o0) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i26.j j(g26.d r21, i26.j r22, i26.b r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g26.b.j(g26.d, i26.j, i26.b):i26.j");
    }

    public static i26.b k(g26.d dVar, i26.d receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof g26.n) {
            return ((g26.n) receiver).f349529e;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i l(g26.d dVar, i26.j lowerBound, i26.j upperBound) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowerBound, "lowerBound");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upperBound, "upperBound");
        if (!(lowerBound instanceof f26.z0)) {
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(dVar.getClass())).toString());
        }
        if (upperBound instanceof f26.z0) {
            return f26.r0.a((f26.z0) lowerBound, (f26.z0) upperBound);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(dVar.getClass())).toString());
    }

    public static i26.l m(g26.d dVar, i26.i receiver, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return (i26.l) ((f26.o0) receiver).u0().get(i17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static java.util.List n(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return ((f26.o0) receiver).u0();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static n16.e o(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return v16.f.h((o06.g) i17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.n p(g26.d dVar, i26.m receiver, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            java.lang.Object obj = ((f26.c2) receiver).mo9613x99879e0().get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            return (i26.n) obj;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static java.util.List q(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            java.util.List mo9613x99879e0 = ((f26.c2) receiver).mo9613x99879e0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
            return mo9613x99879e0;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static l06.r r(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return l06.o.s((o06.g) i17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static l06.r s(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return l06.o.u((o06.g) i17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i t(g26.d dVar, i26.n receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof o06.e2) {
            return j26.c.f((o06.e2) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i u(g26.d dVar, i26.l receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.l2) {
            return ((f26.l2) receiver).mo128949xfb85f7b0().z0();
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.n v(g26.d dVar, i26.m receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.c2) {
            o06.j i17 = ((f26.c2) receiver).i();
            if (i17 instanceof o06.e2) {
                return (o06.e2) i17;
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.i w(g26.d dVar, i26.i receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.o0) {
            return r16.m.h((f26.o0) receiver);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static java.util.List x(g26.d dVar, i26.n receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof o06.e2) {
            java.util.List mo150356xa5be00c1 = ((o06.e2) receiver).mo150356xa5be00c1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c1, "getUpperBounds(...)");
            return mo150356xa5be00c1;
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.r y(g26.d dVar, i26.l receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof f26.l2) {
            f26.d3 c17 = ((f26.l2) receiver).c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getProjectionKind(...)");
            return i26.p.a(c17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }

    public static i26.r z(g26.d dVar, i26.n receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        if (receiver instanceof o06.e2) {
            f26.d3 q17 = ((o06.e2) receiver).q();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "getVariance(...)");
            return i26.p.a(q17);
        }
        throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(receiver.getClass())).toString());
    }
}
