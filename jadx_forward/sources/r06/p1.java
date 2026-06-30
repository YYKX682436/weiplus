package r06;

/* loaded from: classes16.dex */
public class p1 extends r06.q {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f450035q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f450036r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(o06.m mVar, p06.k kVar, boolean z17, f26.d3 d3Var, n16.g gVar, int i17, o06.x1 x1Var, yz5.l lVar, o06.c2 c2Var, e26.c0 c0Var) {
        super(c0Var, mVar, kVar, gVar, d3Var, z17, i17, x1Var, c2Var);
        if (mVar == null) {
            G(19);
            throw null;
        }
        if (kVar == null) {
            G(20);
            throw null;
        }
        if (d3Var == null) {
            G(21);
            throw null;
        }
        if (gVar == null) {
            G(22);
            throw null;
        }
        if (x1Var == null) {
            G(23);
            throw null;
        }
        if (c2Var == null) {
            G(24);
            throw null;
        }
        if (c0Var == null) {
            G(25);
            throw null;
        }
        this.f450035q = new java.util.ArrayList(1);
        this.f450036r = false;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 5 || i17 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 5 || i17 == 28) ? 2 : 3];
        switch (i17) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i17 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i17 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i17) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 5 && i17 != 28) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static r06.p1 w0(o06.m mVar, p06.k kVar, boolean z17, f26.d3 d3Var, n16.g gVar, int i17, o06.x1 x1Var, e26.c0 c0Var) {
        if (mVar == null) {
            G(6);
            throw null;
        }
        if (kVar == null) {
            G(7);
            throw null;
        }
        if (d3Var == null) {
            G(8);
            throw null;
        }
        if (gVar == null) {
            G(9);
            throw null;
        }
        if (x1Var == null) {
            G(10);
            throw null;
        }
        if (c0Var == null) {
            G(11);
            throw null;
        }
        o06.b2 b2Var = o06.b2.f423461a;
        if (mVar == null) {
            G(12);
            throw null;
        }
        if (kVar == null) {
            G(13);
            throw null;
        }
        if (d3Var == null) {
            G(14);
            throw null;
        }
        if (gVar == null) {
            G(15);
            throw null;
        }
        if (x1Var == null) {
            G(16);
            throw null;
        }
        if (c0Var != null) {
            return new r06.p1(mVar, kVar, z17, d3Var, gVar, i17, x1Var, null, b2Var, c0Var);
        }
        G(18);
        throw null;
    }

    public static o06.e2 x0(o06.m mVar, p06.k kVar, boolean z17, f26.d3 d3Var, n16.g gVar, int i17, e26.c0 c0Var) {
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (d3Var == null) {
            G(2);
            throw null;
        }
        if (gVar == null) {
            G(3);
            throw null;
        }
        if (c0Var == null) {
            G(4);
            throw null;
        }
        r06.p1 w07 = w0(mVar, kVar, z17, d3Var, gVar, i17, o06.x1.f423537a, c0Var);
        f26.z0 n17 = v16.f.e(mVar).n();
        if (n17 == null) {
            G(26);
            throw null;
        }
        w07.v0();
        if (!f26.s0.a(n17)) {
            ((java.util.ArrayList) w07.f450035q).add(n17);
        }
        w07.v0();
        w07.f450036r = true;
        return w07;
    }

    @Override // r06.q
    public java.util.List u0() {
        if (!this.f450036r) {
            throw new java.lang.IllegalStateException("Type parameter descriptor is not initialized: " + y0());
        }
        java.util.List list = this.f450035q;
        if (list != null) {
            return list;
        }
        G(28);
        throw null;
    }

    public final void v0() {
        if (this.f450036r) {
            throw new java.lang.IllegalStateException("Type parameter descriptor is already initialized: " + y0());
        }
    }

    public final java.lang.String y0() {
        return mo132800xfb82e301() + " declared in " + r16.i.g(e());
    }
}
