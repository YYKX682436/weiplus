package u06;

/* loaded from: classes16.dex */
public final class n0 extends u06.k0 implements e16.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.WildcardType f505053a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f505054b;

    public n0(java.lang.reflect.WildcardType reflectType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reflectType, "reflectType");
        this.f505053a = reflectType;
        this.f505054b = kz5.p0.f395529d;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f505053a;
    }

    public e16.u d() {
        e16.u oVar;
        java.lang.reflect.WildcardType wildcardType = this.f505053a;
        java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new java.lang.UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                java.lang.reflect.Type type = (java.lang.reflect.Type) kz5.z.l0(upperBounds);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(type, java.lang.Object.class)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(type);
                    boolean z17 = type instanceof java.lang.Class;
                    if (z17) {
                        java.lang.Class cls = (java.lang.Class) type;
                        if (cls.isPrimitive()) {
                            return new u06.i0(cls);
                        }
                    }
                    oVar = ((type instanceof java.lang.reflect.GenericArrayType) || (z17 && ((java.lang.Class) type).isArray())) ? new u06.o(type) : type instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) type) : new u06.z(type);
                }
            }
            return null;
        }
        java.lang.Object l07 = kz5.z.l0(lowerBounds);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l07, "single(...)");
        java.lang.reflect.Type type2 = (java.lang.reflect.Type) l07;
        boolean z18 = type2 instanceof java.lang.Class;
        if (z18) {
            java.lang.Class cls2 = (java.lang.Class) type2;
            if (cls2.isPrimitive()) {
                return new u06.i0(cls2);
            }
        }
        oVar = ((type2 instanceof java.lang.reflect.GenericArrayType) || (z18 && ((java.lang.Class) type2).isArray())) ? new u06.o(type2) : type2 instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) type2) : new u06.z(type2);
        return oVar;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        return this.f505054b;
    }
}
