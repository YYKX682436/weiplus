package r06;

/* loaded from: classes15.dex */
public abstract class v extends p06.b implements o06.m {

    /* renamed from: e, reason: collision with root package name */
    public final n16.g f450076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p06.k kVar, n16.g gVar) {
        super(kVar);
        if (kVar == null) {
            G(0);
            throw null;
        }
        if (gVar == null) {
            G(1);
            throw null;
        }
        this.f450076e = gVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 2 || i17 == 3 || i17 == 5 || i17 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 2 || i17 == 3 || i17 == 5 || i17 == 6) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i17 == 2) {
            objArr[1] = "getName";
        } else if (i17 == 3) {
            objArr[1] = "getOriginal";
        } else if (i17 == 5 || i17 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i17 != 2 && i17 != 3) {
            if (i17 == 4) {
                objArr[2] = "toString";
            } else if (i17 != 5 && i17 != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 2 && i17 != 3 && i17 != 5 && i17 != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static java.lang.String P(o06.m mVar) {
        if (mVar == null) {
            G(4);
            throw null;
        }
        try {
            java.lang.String str = q16.s.f441315c.p(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(mVar)) + "]";
            if (str != null) {
                return str;
            }
            G(5);
            throw null;
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = mVar.getClass().getSimpleName() + " " + mVar.mo132800xfb82e301();
            if (str2 != null) {
                return str2;
            }
            G(6);
            throw null;
        }
    }

    public o06.m a() {
        return this;
    }

    @Override // o06.x0
    /* renamed from: getName */
    public n16.g mo132800xfb82e301() {
        n16.g gVar = this.f450076e;
        if (gVar != null) {
            return gVar;
        }
        G(2);
        throw null;
    }

    /* renamed from: toString */
    public java.lang.String mo9603x9616526c() {
        return P(this);
    }
}
