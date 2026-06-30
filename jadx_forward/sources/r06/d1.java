package r06;

/* loaded from: classes16.dex */
public abstract class d1 extends r06.w implements o06.n1 {

    /* renamed from: h, reason: collision with root package name */
    public boolean f449915h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f449916i;

    /* renamed from: m, reason: collision with root package name */
    public final o06.t0 f449917m;

    /* renamed from: n, reason: collision with root package name */
    public final o06.o1 f449918n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f449919o;

    /* renamed from: p, reason: collision with root package name */
    public final o06.c f449920p;

    /* renamed from: q, reason: collision with root package name */
    public o06.g0 f449921q;

    /* renamed from: r, reason: collision with root package name */
    public o06.n0 f449922r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(o06.t0 t0Var, o06.g0 g0Var, o06.o1 o1Var, p06.k kVar, n16.g gVar, boolean z17, boolean z18, boolean z19, o06.c cVar, o06.x1 x1Var) {
        super(o1Var.e(), kVar, gVar, x1Var);
        if (t0Var == null) {
            G(0);
            throw null;
        }
        if (g0Var == null) {
            G(1);
            throw null;
        }
        if (o1Var == null) {
            G(2);
            throw null;
        }
        if (kVar == null) {
            G(3);
            throw null;
        }
        if (gVar == null) {
            G(4);
            throw null;
        }
        if (x1Var == null) {
            G(5);
            throw null;
        }
        this.f449922r = null;
        this.f449917m = t0Var;
        this.f449921q = g0Var;
        this.f449918n = o1Var;
        this.f449915h = z17;
        this.f449916i = z18;
        this.f449919o = z19;
        this.f449920p = cVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i18 = 2;
                break;
            case 7:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 5:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i17) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(format);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // o06.b
    public java.lang.Object B(o06.a aVar) {
        return null;
    }

    @Override // o06.d
    public o06.d H(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // o06.d
    public void M(java.util.Collection collection) {
        if (collection != null) {
            return;
        }
        G(16);
        throw null;
    }

    @Override // o06.n0
    public boolean N() {
        return false;
    }

    @Override // o06.b
    public o06.r1 Z() {
        return s0().Z();
    }

    @Override // o06.b
    public o06.r1 c0() {
        return s0().c0();
    }

    @Override // o06.n0, o06.a2
    public o06.n0 d(f26.v2 v2Var) {
        if (v2Var != null) {
            return this;
        }
        G(7);
        throw null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.r0
    public o06.t0 f() {
        o06.t0 t0Var = this.f449917m;
        if (t0Var != null) {
            return t0Var;
        }
        G(10);
        throw null;
    }

    @Override // o06.b
    /* renamed from: getTypeParameters */
    public java.util.List mo132803xb121b9ba() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(9);
        throw null;
    }

    @Override // o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 g0Var = this.f449921q;
        if (g0Var != null) {
            return g0Var;
        }
        G(11);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return false;
    }

    @Override // o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return this.f449916i;
    }

    @Override // o06.n0
    /* renamed from: isInfix */
    public boolean mo150371x7ae3ddc6() {
        return false;
    }

    @Override // o06.n0
    /* renamed from: isInline */
    public boolean mo123389xe19a9463() {
        return this.f449919o;
    }

    @Override // o06.n0
    /* renamed from: isOperator */
    public boolean mo150372xb2e1cfee() {
        return false;
    }

    @Override // o06.n0
    /* renamed from: isSuspend */
    public boolean mo123390x6f0de7b2() {
        return false;
    }

    @Override // o06.d
    public o06.c j() {
        o06.c cVar = this.f449920p;
        if (cVar != null) {
            return cVar;
        }
        G(6);
        throw null;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.n0
    public o06.n0 o0() {
        return this.f449922r;
    }

    @Override // o06.b
    public java.util.List p0() {
        java.util.List p07 = s0().p0();
        if (p07 != null) {
            return p07;
        }
        G(14);
        throw null;
    }

    @Override // o06.n0
    public boolean r() {
        return false;
    }

    @Override // o06.n0
    public boolean r0() {
        return false;
    }

    public o06.o1 s0() {
        o06.o1 o1Var = this.f449918n;
        if (o1Var != null) {
            return o1Var;
        }
        G(13);
        throw null;
    }

    public java.util.Collection u0(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (o06.o1 o1Var : s0().i()) {
            o06.p c17 = z17 ? o1Var.c() : o1Var.b();
            if (c17 != null) {
                arrayList.add(c17);
            }
        }
        return arrayList;
    }

    @Override // o06.a2
    public /* bridge */ /* synthetic */ o06.n d(f26.v2 v2Var) {
        d(v2Var);
        return this;
    }
}
