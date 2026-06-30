package r06;

/* loaded from: classes16.dex */
public class e0 extends r06.s {

    /* renamed from: n, reason: collision with root package name */
    public final f26.c2 f449927n;

    /* renamed from: o, reason: collision with root package name */
    public final y16.s f449928o;

    /* renamed from: p, reason: collision with root package name */
    public final e26.x f449929p;

    /* renamed from: q, reason: collision with root package name */
    public final p06.k f449930q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e26.c0 c0Var, o06.g gVar, f26.o0 o0Var, n16.g gVar2, e26.x xVar, p06.k kVar, o06.x1 x1Var) {
        super(c0Var, gVar, gVar2, x1Var, false);
        if (c0Var == null) {
            j0(6);
            throw null;
        }
        if (gVar == null) {
            j0(7);
            throw null;
        }
        if (o0Var == null) {
            j0(8);
            throw null;
        }
        if (gVar2 == null) {
            j0(9);
            throw null;
        }
        if (xVar == null) {
            j0(10);
            throw null;
        }
        if (kVar == null) {
            j0(11);
            throw null;
        }
        if (x1Var == null) {
            j0(12);
            throw null;
        }
        this.f449930q = kVar;
        this.f449927n = new f26.q(this, java.util.Collections.emptyList(), java.util.Collections.singleton(o0Var), c0Var);
        this.f449928o = new r06.d0(this, c0Var);
        this.f449929p = xVar;
    }

    public static /* synthetic */ void j0(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i18 = 2;
                break;
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i17) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i17) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    public static r06.e0 u0(e26.c0 c0Var, o06.g gVar, n16.g gVar2, e26.x xVar, p06.k kVar, o06.x1 x1Var) {
        if (c0Var == null) {
            j0(0);
            throw null;
        }
        if (gVar == null) {
            j0(1);
            throw null;
        }
        if (gVar2 == null) {
            j0(2);
            throw null;
        }
        if (xVar == null) {
            j0(3);
            throw null;
        }
        if (kVar == null) {
            j0(4);
            throw null;
        }
        if (x1Var != null) {
            return new r06.e0(c0Var, gVar, gVar.k(), gVar2, xVar, kVar, x1Var);
        }
        j0(5);
        throw null;
    }

    @Override // r06.s0
    public y16.s P(g26.l lVar) {
        if (lVar == null) {
            j0(13);
            throw null;
        }
        y16.s sVar = this.f449928o;
        if (sVar != null) {
            return sVar;
        }
        j0(14);
        throw null;
    }

    @Override // o06.g
    public java.util.Collection S() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(16);
        throw null;
    }

    @Override // o06.g
    public java.util.Collection T() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(23);
        throw null;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return o06.t0.f423518e;
    }

    @Override // o06.j
    public f26.c2 g() {
        f26.c2 c2Var = this.f449927n;
        if (c2Var != null) {
            return c2Var;
        }
        j0(17);
        throw null;
    }

    @Override // o06.g
    public boolean g0() {
        return false;
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        p06.k kVar = this.f449930q;
        if (kVar != null) {
            return kVar;
        }
        j0(21);
        throw null;
    }

    @Override // o06.g, o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 g0Var = o06.f0.f423478e;
        if (g0Var != null) {
            return g0Var;
        }
        j0(20);
        throw null;
    }

    @Override // o06.g
    public boolean h0() {
        return false;
    }

    @Override // o06.g
    /* renamed from: isInline */
    public boolean mo9618xe19a9463() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        return o06.h.f423496g;
    }

    @Override // o06.g
    public boolean k0() {
        return false;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(22);
        throw null;
    }

    @Override // o06.g
    public y16.s m0() {
        return y16.r.f540506b;
    }

    @Override // o06.k
    public boolean p() {
        return false;
    }

    @Override // o06.g
    public o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m161252x9616526c() {
        return "enum entry " + mo132800xfb82e301();
    }
}
