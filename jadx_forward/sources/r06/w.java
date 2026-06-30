package r06;

/* loaded from: classes16.dex */
public abstract class w extends r06.v implements o06.n {

    /* renamed from: f, reason: collision with root package name */
    public final o06.m f450078f;

    /* renamed from: g, reason: collision with root package name */
    public final o06.x1 f450079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o06.m mVar, p06.k kVar, n16.g gVar, o06.x1 x1Var) {
        super(kVar, gVar);
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
        this.f450078f = mVar;
        this.f450079g = x1Var;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 4 || i17 == 5 || i17 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 4 || i17 == 5 || i17 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i17 == 4) {
            objArr[1] = "getOriginal";
        } else if (i17 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i17 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i17 != 4 && i17 != 5 && i17 != 6) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 4 && i17 != 5 && i17 != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public o06.m e() {
        o06.m mVar = this.f450078f;
        if (mVar != null) {
            return mVar;
        }
        G(5);
        throw null;
    }

    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        o06.x1 x1Var = this.f450079g;
        if (x1Var != null) {
            return x1Var;
        }
        G(6);
        throw null;
    }

    @Override // r06.v, o06.m
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public o06.p a() {
        return this;
    }
}
