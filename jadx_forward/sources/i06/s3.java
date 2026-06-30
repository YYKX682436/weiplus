package i06;

/* loaded from: classes15.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.w3 f368281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f368282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.g f368283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(i06.w3 w3Var, int i17, jz5.g gVar) {
        super(0);
        this.f368281d = w3Var;
        this.f368282e = i17;
        this.f368283f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i06.w3 w3Var = this.f368281d;
        java.lang.reflect.Type j17 = w3Var.j();
        if (j17 instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) j17;
            java.lang.Class componentType = cls.isArray() ? cls.getComponentType() : java.lang.Object.class;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(componentType);
            return componentType;
        }
        boolean z17 = j17 instanceof java.lang.reflect.GenericArrayType;
        int i17 = this.f368282e;
        if (z17) {
            if (i17 == 0) {
                java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) j17).getGenericComponentType();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(genericComponentType);
                return genericComponentType;
            }
            throw new i06.a4("Array type has been queried for a non-0th argument: " + w3Var);
        }
        if (!(j17 instanceof java.lang.reflect.ParameterizedType)) {
            throw new i06.a4("Non-generic type has been queried for arguments: " + w3Var);
        }
        java.lang.reflect.Type type = (java.lang.reflect.Type) ((java.util.List) this.f368283f.mo141623x754a37bb()).get(i17);
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerBounds, "getLowerBounds(...)");
            java.lang.reflect.Type type2 = (java.lang.reflect.Type) kz5.z.O(lowerBounds);
            if (type2 == null) {
                java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperBounds, "getUpperBounds(...)");
                type = (java.lang.reflect.Type) kz5.z.L(upperBounds);
            } else {
                type = type2;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(type);
        return type;
    }
}
