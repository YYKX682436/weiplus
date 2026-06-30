package r06;

/* loaded from: classes16.dex */
public class h1 extends r06.d1 implements o06.q1 {

    /* renamed from: s */
    public o06.l2 f449960s;

    /* renamed from: t */
    public final o06.q1 f449961t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(o06.o1 o1Var, p06.k kVar, o06.t0 t0Var, o06.g0 g0Var, boolean z17, boolean z18, boolean z19, o06.c cVar, o06.q1 q1Var, o06.x1 x1Var) {
        super(t0Var, g0Var, o1Var, kVar, n16.g.m("<set-" + o1Var.mo132800xfb82e301() + ">"), z17, z18, z19, cVar, x1Var);
        r06.h1 h1Var;
        r06.h1 h1Var2;
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
        if (q1Var != 0) {
            h1Var2 = this;
            h1Var = q1Var;
        } else {
            h1Var = this;
            h1Var2 = h1Var;
        }
        h1Var2.f449961t = h1Var;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 10:
            case 11:
            case 12:
            case 13:
                i18 = 2;
                break;
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i17) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i17) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    public static r06.s1 v0(o06.q1 q1Var, f26.o0 o0Var, p06.k kVar) {
        if (q1Var == null) {
            G(7);
            throw null;
        }
        if (o0Var == null) {
            G(8);
            throw null;
        }
        if (kVar != null) {
            return new r06.s1(q1Var, null, 0, kVar, n16.i.f415712g, o0Var, false, false, false, null, o06.x1.f423537a);
        }
        G(9);
        throw null;
    }

    @Override // o06.b
    public java.util.List W() {
        o06.l2 l2Var = this.f449960s;
        if (l2Var == null) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List singletonList = java.util.Collections.singletonList(l2Var);
        if (singletonList != null) {
            return singletonList;
        }
        G(11);
        throw null;
    }

    @Override // o06.b
    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        f26.z0 x17 = v16.f.e(this).x();
        if (x17 != null) {
            return x17;
        }
        G(12);
        throw null;
    }

    @Override // o06.d, o06.b
    public java.util.Collection i() {
        java.util.Collection u07 = u0(false);
        if (u07 != null) {
            return u07;
        }
        G(10);
        throw null;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.e(this, obj);
    }

    @Override // r06.w
    /* renamed from: w0 */
    public o06.q1 a() {
        o06.q1 q1Var = this.f449961t;
        if (q1Var != null) {
            return q1Var;
        }
        G(13);
        throw null;
    }
}
