package r06;

/* loaded from: classes16.dex */
public abstract class g extends r06.v implements o06.r1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p06.k kVar) {
        super(kVar, n16.i.f415709d);
        if (kVar != null) {
        } else {
            G(0);
            throw null;
        }
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
            case 11:
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
            case 11:
                i18 = 2;
                break;
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 2:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i17) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i17) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
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
        G(7);
        throw null;
    }

    @Override // o06.b
    public o06.r1 Z() {
        return null;
    }

    @Override // r06.v, o06.m
    public o06.b a() {
        return this;
    }

    @Override // o06.b
    public o06.r1 c0() {
        return null;
    }

    @Override // o06.b
    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        return mo132802xfb85f7b0();
    }

    @Override // o06.p
    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        return o06.x1.f423537a;
    }

    @Override // o06.k2
    /* renamed from: getType */
    public f26.o0 mo132802xfb85f7b0() {
        f26.o0 mo150381xfb85f7b0 = mo150378x754a37bb().mo150381xfb85f7b0();
        if (mo150381xfb85f7b0 != null) {
            return mo150381xfb85f7b0;
        }
        G(6);
        throw null;
    }

    @Override // o06.b
    /* renamed from: getTypeParameters */
    public java.util.List mo132803xb121b9ba() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(5);
        throw null;
    }

    @Override // o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 g0Var = o06.f0.f423479f;
        if (g0Var != null) {
            return g0Var;
        }
        G(9);
        throw null;
    }

    @Override // o06.b
    public java.util.Collection i() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        G(8);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return false;
    }

    @Override // o06.a2
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public o06.r1 d(f26.v2 v2Var) {
        if (v2Var == null) {
            G(3);
            throw null;
        }
        if (v2Var.h()) {
            return this;
        }
        f26.o0 k17 = e() instanceof o06.g ? v2Var.k(mo132802xfb85f7b0(), f26.d3.f340678h) : v2Var.k(mo132802xfb85f7b0(), f26.d3.f340676f);
        if (k17 == null) {
            return null;
        }
        return k17 == mo132802xfb85f7b0() ? this : new r06.i1(e(), new z16.i(k17), mo9601xa083c1ee());
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.g(this, obj);
    }

    @Override // r06.v, o06.m
    public o06.m a() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p06.k kVar, n16.g gVar) {
        super(kVar, gVar);
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (gVar != null) {
        } else {
            G(2);
            throw null;
        }
    }
}
