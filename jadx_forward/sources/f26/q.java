package f26;

/* loaded from: classes16.dex */
public class q extends f26.b {

    /* renamed from: c, reason: collision with root package name */
    public final o06.g f340741c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f340742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f340743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o06.g gVar, java.util.List list, java.util.Collection collection, e26.c0 c0Var) {
        super(c0Var);
        if (gVar == null) {
            k(0);
            throw null;
        }
        if (list == null) {
            k(1);
            throw null;
        }
        if (collection == null) {
            k(2);
            throw null;
        }
        if (c0Var == null) {
            k(3);
            throw null;
        }
        this.f340741c = gVar;
        this.f340742d = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.f340743e = java.util.Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void k(int i17) {
        java.lang.String str = (i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i17 == 4) {
            objArr[1] = "getParameters";
        } else if (i17 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i17 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i17 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // f26.l
    public java.util.Collection c() {
        java.util.Collection collection = this.f340743e;
        if (collection != null) {
            return collection;
        }
        k(6);
        throw null;
    }

    @Override // f26.l
    public o06.c2 e() {
        return o06.b2.f423461a;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        java.util.List list = this.f340742d;
        if (list != null) {
            return list;
        }
        k(4);
        throw null;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    @Override // f26.b
    /* renamed from: l */
    public o06.g i() {
        o06.g gVar = this.f340741c;
        if (gVar != null) {
            return gVar;
        }
        k(5);
        throw null;
    }

    /* renamed from: toString */
    public java.lang.String m128973x9616526c() {
        java.lang.String str = r16.i.g(this.f340741c).f415698a;
        if (str != null) {
            return str;
        }
        n16.e.a(4);
        throw null;
    }
}
