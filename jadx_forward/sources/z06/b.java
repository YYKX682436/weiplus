package z06;

/* loaded from: classes16.dex */
public class b extends r06.r implements z06.a {
    public java.lang.Boolean L;
    public java.lang.Boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o06.g gVar, z06.b bVar, p06.k kVar, boolean z17, o06.c cVar, o06.x1 x1Var) {
        super(gVar, bVar, kVar, z17, cVar, x1Var);
        if (gVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (cVar == null) {
            G(2);
            throw null;
        }
        if (x1Var == null) {
            G(3);
            throw null;
        }
        this.L = null;
        this.M = null;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 11 || i17 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 11 || i17 == 18) ? 2 : 3];
        switch (i17) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i17 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i17 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 11 && i17 != 18) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static z06.b J0(o06.g gVar, p06.k kVar, boolean z17, o06.x1 x1Var) {
        if (gVar == null) {
            G(4);
            throw null;
        }
        if (kVar == null) {
            G(5);
            throw null;
        }
        if (x1Var != null) {
            return new z06.b(gVar, null, kVar, z17, o06.c.DECLARATION, x1Var);
        }
        G(6);
        throw null;
    }

    @Override // r06.j0
    public void A0(boolean z17) {
        this.L = java.lang.Boolean.valueOf(z17);
    }

    @Override // r06.j0
    public void B0(boolean z17) {
        this.M = java.lang.Boolean.valueOf(z17);
    }

    @Override // r06.r, r06.j0
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public z06.b u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(7);
            throw null;
        }
        if (cVar == null) {
            G(8);
            throw null;
        }
        if (kVar == null) {
            G(9);
            throw null;
        }
        if (x1Var == null) {
            G(10);
            throw null;
        }
        if (cVar == o06.c.DECLARATION || cVar == o06.c.SYNTHESIZED) {
            z06.b bVar = new z06.b((o06.g) mVar, (z06.b) n0Var, kVar, this.K, cVar, x1Var);
            bVar.A0(this.L.booleanValue());
            bVar.B0(i0());
            return bVar;
        }
        throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + cVar);
    }

    @Override // z06.a
    public z06.a L(f26.o0 o0Var, java.util.List list, f26.o0 o0Var2, jz5.l lVar) {
        o06.r1 r1Var = null;
        if (list == null) {
            G(16);
            throw null;
        }
        if (o0Var2 == null) {
            G(17);
            throw null;
        }
        z06.b u07 = u0(e(), null, j(), null, mo9601xa083c1ee(), mo9602x2fa78b11());
        if (o0Var != null) {
            int i17 = p06.k.Z0;
            r1Var = r16.h.h(u07, o0Var, p06.i.f432298a);
        }
        u07.x0(r1Var, this.f449996p, kz5.p0.f395529d, mo132803xb121b9ba(), z06.k.a(list, W(), u07), o0Var2, f(), mo9617x61f71b08());
        if (lVar != null) {
            u07.z0((o06.a) lVar.f384366d, lVar.f384367e);
        }
        return u07;
    }

    @Override // r06.j0, o06.b
    public boolean i0() {
        return this.M.booleanValue();
    }
}
