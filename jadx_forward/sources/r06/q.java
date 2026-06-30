package r06;

/* loaded from: classes16.dex */
public abstract class q extends r06.w implements o06.e2 {

    /* renamed from: h, reason: collision with root package name */
    public final f26.d3 f450037h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f450038i;

    /* renamed from: m, reason: collision with root package name */
    public final int f450039m;

    /* renamed from: n, reason: collision with root package name */
    public final e26.x f450040n;

    /* renamed from: o, reason: collision with root package name */
    public final e26.x f450041o;

    /* renamed from: p, reason: collision with root package name */
    public final e26.c0 f450042p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e26.c0 c0Var, o06.m mVar, p06.k kVar, n16.g gVar, f26.d3 d3Var, boolean z17, int i17, o06.x1 x1Var, o06.c2 c2Var) {
        super(mVar, kVar, gVar, x1Var);
        if (c0Var == null) {
            G(0);
            throw null;
        }
        if (mVar == null) {
            G(1);
            throw null;
        }
        if (kVar == null) {
            G(2);
            throw null;
        }
        if (gVar == null) {
            G(3);
            throw null;
        }
        if (d3Var == null) {
            G(4);
            throw null;
        }
        if (x1Var == null) {
            G(5);
            throw null;
        }
        if (c2Var == null) {
            G(6);
            throw null;
        }
        this.f450037h = d3Var;
        this.f450038i = z17;
        this.f450039m = i17;
        r06.m mVar2 = new r06.m(this, c0Var, c2Var);
        e26.u uVar = (e26.u) c0Var;
        this.f450040n = uVar.b(mVar2);
        this.f450041o = uVar.b(new r06.o(this, gVar));
        this.f450042p = uVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i18 = 2;
                break;
            case 12:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i17) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i17) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new java.lang.IllegalStateException(format);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // r06.w, r06.v, o06.m
    public o06.j a() {
        return this;
    }

    @Override // o06.e2
    public e26.c0 a0() {
        e26.c0 c0Var = this.f450042p;
        if (c0Var != null) {
            return c0Var;
        }
        G(14);
        throw null;
    }

    @Override // o06.e2, o06.j
    public final f26.c2 g() {
        f26.c2 c2Var = (f26.c2) ((e26.o) this.f450040n).mo152xb9724478();
        if (c2Var != null) {
            return c2Var;
        }
        G(9);
        throw null;
    }

    @Override // o06.e2
    /* renamed from: getIndex */
    public int mo150355x7498cf1c() {
        return this.f450039m;
    }

    @Override // o06.e2
    /* renamed from: getUpperBounds */
    public java.util.List mo150356xa5be00c1() {
        java.util.List a17 = ((r06.p) g()).a();
        if (a17 != null) {
            return a17;
        }
        G(8);
        throw null;
    }

    @Override // r06.w
    /* renamed from: j0 */
    public o06.p a() {
        return this;
    }

    @Override // o06.j
    public f26.z0 k() {
        f26.z0 z0Var = (f26.z0) ((e26.o) this.f450041o).mo152xb9724478();
        if (z0Var != null) {
            return z0Var;
        }
        G(10);
        throw null;
    }

    @Override // o06.e2
    public boolean o() {
        return this.f450038i;
    }

    @Override // o06.e2
    public f26.d3 q() {
        f26.d3 d3Var = this.f450037h;
        if (d3Var != null) {
            return d3Var;
        }
        G(7);
        throw null;
    }

    public java.util.List s0(java.util.List list) {
        if (list == null) {
            G(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        G(13);
        throw null;
    }

    public abstract java.util.List u0();

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.h(this, obj);
    }

    @Override // o06.e2
    public boolean y() {
        return false;
    }

    @Override // r06.w, r06.v, o06.m
    public o06.m a() {
        return this;
    }

    @Override // r06.w, r06.v, o06.m
    public o06.e2 a() {
        return this;
    }
}
