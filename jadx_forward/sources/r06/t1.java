package r06;

/* loaded from: classes16.dex */
public abstract class t1 extends r06.w implements o06.m2 {

    /* renamed from: h, reason: collision with root package name */
    public f26.o0 f450067h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(o06.m mVar, p06.k kVar, n16.g gVar, f26.o0 o0Var, o06.x1 x1Var) {
        super(mVar, kVar, gVar, x1Var);
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
        if (x1Var == null) {
            G(3);
            throw null;
        }
        this.f450067h = o0Var;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i18 = 2;
                break;
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i17) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // o06.b
    public java.util.List W() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(6);
        throw null;
    }

    public o06.r1 Z() {
        return null;
    }

    public o06.r1 c0() {
        return null;
    }

    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        f26.o0 mo132802xfb85f7b0 = mo132802xfb85f7b0();
        if (mo132802xfb85f7b0 != null) {
            return mo132802xfb85f7b0;
        }
        G(10);
        throw null;
    }

    @Override // o06.k2
    /* renamed from: getType */
    public f26.o0 mo132802xfb85f7b0() {
        f26.o0 o0Var = this.f450067h;
        if (o0Var != null) {
            return o0Var;
        }
        G(4);
        throw null;
    }

    /* renamed from: getTypeParameters */
    public java.util.List mo132803xb121b9ba() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(8);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return false;
    }
}
