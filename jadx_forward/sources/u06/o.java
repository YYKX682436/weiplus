package u06;

/* loaded from: classes16.dex */
public final class o extends u06.k0 implements e16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f505055a;

    /* renamed from: b, reason: collision with root package name */
    public final u06.k0 f505056b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Collection f505057c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(java.lang.reflect.Type reflectType) {
        u06.k0 i0Var;
        u06.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reflectType, "reflectType");
        this.f505055a = reflectType;
        if (!(reflectType instanceof java.lang.reflect.GenericArrayType)) {
            if (reflectType instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) reflectType;
                if (cls.isArray()) {
                    java.lang.Class<?> componentType = cls.getComponentType();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(componentType, "getComponentType(...)");
                    i0Var = componentType.isPrimitive() ? new u06.i0(componentType) : ((componentType instanceof java.lang.reflect.GenericArrayType) || componentType.isArray()) ? new u06.o(componentType) : componentType instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) componentType) : new u06.z(componentType);
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) reflectType).getGenericComponentType();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genericComponentType, "getGenericComponentType(...)");
        boolean z17 = genericComponentType instanceof java.lang.Class;
        if (z17) {
            java.lang.Class cls2 = (java.lang.Class) genericComponentType;
            if (cls2.isPrimitive()) {
                k0Var = new u06.i0(cls2);
                this.f505056b = k0Var;
                this.f505057c = kz5.p0.f395529d;
            }
        }
        i0Var = ((genericComponentType instanceof java.lang.reflect.GenericArrayType) || (z17 && ((java.lang.Class) genericComponentType).isArray())) ? new u06.o(genericComponentType) : genericComponentType instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) genericComponentType) : new u06.z(genericComponentType);
        k0Var = i0Var;
        this.f505056b = k0Var;
        this.f505057c = kz5.p0.f395529d;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f505055a;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        return this.f505057c;
    }
}
