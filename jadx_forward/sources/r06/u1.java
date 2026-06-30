package r06;

/* loaded from: classes16.dex */
public abstract class u1 extends r06.t1 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f450073i;

    /* renamed from: m, reason: collision with root package name */
    public e26.y f450074m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f450075n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(o06.m mVar, p06.k kVar, n16.g gVar, f26.o0 o0Var, boolean z17, o06.x1 x1Var) {
        super(mVar, kVar, gVar, o0Var, x1Var);
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
        this.f450073i = z17;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "annotations";
        } else if (i17 == 2) {
            objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
        } else if (i17 == 3) {
            objArr[0] = ya.b.f77502x92235c1b;
        } else if (i17 == 4 || i17 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i17 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i17 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o06.m2
    public t16.g n0() {
        e26.y yVar = this.f450074m;
        if (yVar != null) {
            return (t16.g) yVar.mo152xb9724478();
        }
        return null;
    }

    public void s0(e26.y yVar, yz5.a aVar) {
        if (aVar == null) {
            G(5);
            throw null;
        }
        this.f450075n = aVar;
        if (yVar == null) {
            yVar = (e26.y) aVar.mo152xb9724478();
        }
        this.f450074m = yVar;
    }

    @Override // o06.m2
    public boolean v() {
        return this.f450073i;
    }
}
