package r06;

/* loaded from: classes16.dex */
public class j1 extends r06.j0 implements o06.v1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(o06.m mVar, o06.v1 v1Var, p06.k kVar, n16.g gVar, o06.c cVar, o06.x1 x1Var) {
        super(mVar, v1Var, kVar, gVar, cVar, x1Var);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (gVar == null) {
            G(2);
            throw null;
        }
        if (cVar == null) {
            G(3);
            throw null;
        }
        if (x1Var != null) {
        } else {
            G(4);
            throw null;
        }
    }

    public static r06.j1 E0(o06.m mVar, p06.k kVar, n16.g gVar, o06.c cVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(5);
            throw null;
        }
        if (kVar == null) {
            G(6);
            throw null;
        }
        if (gVar == null) {
            G(7);
            throw null;
        }
        if (cVar == null) {
            G(8);
            throw null;
        }
        if (x1Var != null) {
            return new r06.j1(mVar, null, kVar, gVar, cVar, x1Var);
        }
        G(9);
        throw null;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 13 || i17 == 18 || i17 == 23 || i17 == 24 || i17 == 29 || i17 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 13 || i17 == 18 || i17 == 23 || i17 == 24 || i17 == 29 || i17 == 30) ? 2 : 3];
        switch (i17) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i17 == 13 || i17 == 18 || i17 == 23) {
            objArr[1] = "initialize";
        } else if (i17 == 24) {
            objArr[1] = "getOriginal";
        } else if (i17 == 29) {
            objArr[1] = "copy";
        } else if (i17 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i17) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 13 && i17 != 18 && i17 != 23 && i17 != 24 && i17 != 29 && i17 != 30) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.d
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public o06.v1 H(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        o06.v1 v1Var = (o06.v1) s0(mVar, t0Var, g0Var, cVar, z17);
        if (v1Var != null) {
            return v1Var;
        }
        G(29);
        throw null;
    }

    @Override // r06.w
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public o06.v1 a() {
        o06.v1 v1Var = (o06.v1) super.a();
        if (v1Var != null) {
            return v1Var;
        }
        G(24);
        throw null;
    }

    @Override // r06.j0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public r06.j1 x0(o06.r1 r1Var, o06.r1 r1Var2, java.util.List list, java.util.List list2, java.util.List list3, f26.o0 o0Var, o06.t0 t0Var, o06.g0 g0Var) {
        if (list == null) {
            G(14);
            throw null;
        }
        if (list2 == null) {
            G(15);
            throw null;
        }
        if (list3 == null) {
            G(16);
            throw null;
        }
        if (g0Var == null) {
            G(17);
            throw null;
        }
        r06.j1 H0 = H0(r1Var, r1Var2, list, list2, list3, o0Var, t0Var, g0Var, null);
        if (H0 != null) {
            return H0;
        }
        G(18);
        throw null;
    }

    public r06.j1 H0(o06.r1 r1Var, o06.r1 r1Var2, java.util.List list, java.util.List list2, java.util.List list3, f26.o0 o0Var, o06.t0 t0Var, o06.g0 g0Var, java.util.Map map) {
        if (list == null) {
            G(19);
            throw null;
        }
        if (list2 == null) {
            G(20);
            throw null;
        }
        if (list3 == null) {
            G(21);
            throw null;
        }
        if (g0Var == null) {
            G(22);
            throw null;
        }
        super.x0(r1Var, r1Var2, list, list2, list3, o0Var, t0Var, g0Var);
        if (map != null && !map.isEmpty()) {
            this.f449990J = new java.util.LinkedHashMap(map);
        }
        return this;
    }

    @Override // r06.j0, o06.n0
    public o06.m0 O() {
        return super.O();
    }

    @Override // r06.j0
    public r06.j0 u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(25);
            throw null;
        }
        if (cVar == null) {
            G(26);
            throw null;
        }
        if (kVar == null) {
            G(27);
            throw null;
        }
        if (x1Var == null) {
            G(28);
            throw null;
        }
        o06.v1 v1Var = (o06.v1) n0Var;
        if (gVar == null) {
            gVar = mo132800xfb82e301();
        }
        return new r06.j1(mVar, v1Var, kVar, gVar, cVar, x1Var);
    }
}
