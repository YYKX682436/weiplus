package r06;

/* loaded from: classes16.dex */
public class g1 extends r06.d1 implements o06.p1 {

    /* renamed from: s, reason: collision with root package name */
    public f26.o0 f449956s;

    /* renamed from: t, reason: collision with root package name */
    public final o06.p1 f449957t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(o06.o1 o1Var, p06.k kVar, o06.t0 t0Var, o06.g0 g0Var, boolean z17, boolean z18, boolean z19, o06.c cVar, o06.p1 p1Var, o06.x1 x1Var) {
        super(t0Var, g0Var, o1Var, kVar, n16.g.m("<get-" + o1Var.mo132800xfb82e301() + ">"), z17, z18, z19, cVar, x1Var);
        r06.g1 g1Var;
        r06.g1 g1Var2;
        if (o1Var == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (t0Var == null) {
            G(2);
            throw null;
        }
        if (g0Var == null) {
            G(3);
            throw null;
        }
        if (cVar == null) {
            G(4);
            throw null;
        }
        if (x1Var == null) {
            G(5);
            throw null;
        }
        if (p1Var != 0) {
            g1Var2 = this;
            g1Var = p1Var;
        } else {
            g1Var = this;
            g1Var2 = g1Var;
        }
        g1Var2.f449957t = g1Var;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 6 || i17 == 7 || i17 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 6 || i17 == 7 || i17 == 8) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i17 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i17 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i17 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i17 != 6 && i17 != 7 && i17 != 8) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 6 && i17 != 7 && i17 != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.b
    public java.util.List W() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(7);
        throw null;
    }

    @Override // o06.b
    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        return this.f449956s;
    }

    @Override // o06.d, o06.b
    public java.util.Collection i() {
        return u0(true);
    }

    @Override // r06.w
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public o06.p1 a() {
        o06.p1 p1Var = this.f449957t;
        if (p1Var != null) {
            return p1Var;
        }
        G(8);
        throw null;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.i(this, obj);
    }

    public void w0(f26.o0 o0Var) {
        if (o0Var == null) {
            o0Var = s0().mo132802xfb85f7b0();
        }
        this.f449956s = o0Var;
    }
}
