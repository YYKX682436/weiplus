package r16;

/* loaded from: classes16.dex */
public abstract class h {
    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 12 || i17 == 23 || i17 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 12 || i17 == 23 || i17 == 25) ? 2 : 3];
        switch (i17) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i17 == 12) {
            objArr[1] = "createSetter";
        } else if (i17 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i17 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i17) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 12 && i17 != 23 && i17 != 25) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static o06.r1 b(o06.b bVar, f26.o0 o0Var, n16.g gVar, p06.k kVar, int i17) {
        if (bVar == null) {
            a(32);
            throw null;
        }
        if (kVar == null) {
            a(33);
            throw null;
        }
        if (o0Var == null) {
            return null;
        }
        z16.c cVar = new z16.c(bVar, o0Var, gVar, null);
        r26.t tVar = n16.h.f415704a;
        return new r06.i1(bVar, cVar, kVar, n16.g.k(n16.h.f415705b + '_' + i17));
    }

    public static r06.g1 c(o06.o1 o1Var, p06.k kVar) {
        if (o1Var == null) {
            a(13);
            throw null;
        }
        if (kVar == null) {
            a(14);
            throw null;
        }
        if (o1Var == null) {
            a(15);
            throw null;
        }
        if (kVar != null) {
            return i(o1Var, kVar, true, false, false, o1Var.mo9602x2fa78b11());
        }
        a(16);
        throw null;
    }

    public static r06.h1 d(o06.o1 o1Var, p06.k kVar, p06.k kVar2) {
        if (o1Var == null) {
            a(0);
            throw null;
        }
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (kVar2 == null) {
            a(2);
            throw null;
        }
        o06.x1 mo9602x2fa78b11 = o1Var.mo9602x2fa78b11();
        if (kVar == null) {
            a(4);
            throw null;
        }
        if (kVar2 == null) {
            a(5);
            throw null;
        }
        if (mo9602x2fa78b11 != null) {
            return j(o1Var, kVar, kVar2, true, false, false, o1Var.mo9617x61f71b08(), mo9602x2fa78b11);
        }
        a(6);
        throw null;
    }

    public static o06.o1 e(o06.g gVar) {
        if (gVar == null) {
            a(26);
            throw null;
        }
        o06.v0 d17 = r16.i.d(gVar);
        o06.u0 u0Var = r16.f0.f450190a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "<this>");
        o06.g a17 = o06.l0.a(d17, n16.j.f415733u);
        if (a17 == null) {
            return null;
        }
        int i17 = p06.k.Z0;
        p06.k kVar = p06.i.f432298a;
        o06.t0 t0Var = o06.t0.f423518e;
        o06.g0 g0Var = o06.f0.f423478e;
        n16.g gVar2 = l06.x.f396480b;
        o06.c cVar = o06.c.SYNTHESIZED;
        r06.f1 v07 = r06.f1.v0(gVar, kVar, t0Var, g0Var, false, gVar2, cVar, gVar.mo9602x2fa78b11(), false, false, false, false, false, false);
        r06.g1 g1Var = new r06.g1(v07, kVar, t0Var, g0Var, false, false, false, cVar, null, gVar.mo9602x2fa78b11());
        v07.y0(g1Var, null, null, null);
        f26.r1.f340747e.getClass();
        f26.r1 attributes = f26.r1.f340748f;
        f26.c2 constructor = a17.g();
        java.util.List arguments = java.util.Collections.singletonList(new f26.n2(gVar.k()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributes, "attributes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        v07.A0(f26.r0.d(attributes, constructor, arguments, false, null), java.util.Collections.emptyList(), null, null, java.util.Collections.emptyList());
        g1Var.w0(v07.mo132801x3df4e080());
        return v07;
    }

    public static o06.v1 f(o06.g gVar) {
        if (gVar == null) {
            a(24);
            throw null;
        }
        int i17 = p06.k.Z0;
        p06.k kVar = p06.i.f432298a;
        r06.j1 E0 = r06.j1.E0(gVar, kVar, l06.x.f396481c, o06.c.SYNTHESIZED, gVar.mo9602x2fa78b11());
        r06.j1 x07 = E0.x0(null, null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.singletonList(new r06.s1(E0, null, 0, kVar, n16.g.k("value"), v16.f.e(gVar).v(), false, false, false, null, gVar.mo9602x2fa78b11())), gVar.k(), o06.t0.f423518e, o06.f0.f423478e);
        if (x07 != null) {
            return x07;
        }
        a(25);
        throw null;
    }

    public static o06.v1 g(o06.g gVar) {
        if (gVar == null) {
            a(22);
            throw null;
        }
        int i17 = p06.k.Z0;
        r06.j1 x07 = r06.j1.E0(gVar, p06.i.f432298a, l06.x.f396479a, o06.c.SYNTHESIZED, gVar.mo9602x2fa78b11()).x0(null, null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), v16.f.e(gVar).h(f26.d3.f340676f, gVar.k()), o06.t0.f423518e, o06.f0.f423478e);
        if (x07 != null) {
            return x07;
        }
        a(23);
        throw null;
    }

    public static o06.r1 h(o06.b bVar, f26.o0 o0Var, p06.k kVar) {
        if (bVar == null) {
            a(30);
            throw null;
        }
        if (kVar == null) {
            a(31);
            throw null;
        }
        if (o0Var == null) {
            return null;
        }
        return new r06.i1(bVar, new z16.d(bVar, o0Var, null), kVar);
    }

    public static r06.g1 i(o06.o1 o1Var, p06.k kVar, boolean z17, boolean z18, boolean z19, o06.x1 x1Var) {
        if (o1Var == null) {
            a(17);
            throw null;
        }
        if (kVar == null) {
            a(18);
            throw null;
        }
        if (x1Var != null) {
            return new r06.g1(o1Var, kVar, o1Var.f(), o1Var.mo9617x61f71b08(), z17, z18, z19, o06.c.DECLARATION, null, x1Var);
        }
        a(19);
        throw null;
    }

    public static r06.h1 j(o06.o1 o1Var, p06.k kVar, p06.k kVar2, boolean z17, boolean z18, boolean z19, o06.g0 g0Var, o06.x1 x1Var) {
        if (o1Var == null) {
            a(7);
            throw null;
        }
        if (kVar == null) {
            a(8);
            throw null;
        }
        if (kVar2 == null) {
            a(9);
            throw null;
        }
        if (g0Var == null) {
            a(10);
            throw null;
        }
        if (x1Var == null) {
            a(11);
            throw null;
        }
        r06.h1 h1Var = new r06.h1(o1Var, kVar, o1Var.f(), g0Var, z17, z18, z19, o06.c.DECLARATION, null, x1Var);
        h1Var.f449960s = r06.h1.v0(h1Var, o1Var.mo132802xfb85f7b0(), kVar2);
        return h1Var;
    }

    public static boolean k(o06.n0 n0Var) {
        if (n0Var == null) {
            a(29);
            throw null;
        }
        if (n0Var.j() == o06.c.SYNTHESIZED) {
            o06.m e17 = n0Var.e();
            int i17 = r16.i.f450191a;
            if (r16.i.o(e17, o06.h.f423495f)) {
                return true;
            }
        }
        return false;
    }
}
