package u06;

/* loaded from: classes16.dex */
public final class g0 extends u06.f0 implements e16.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f505035a;

    public g0(java.lang.reflect.Method member) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        this.f505035a = member;
    }

    @Override // u06.f0
    public java.lang.reflect.Member c() {
        return this.f505035a;
    }

    public e16.u g() {
        java.lang.reflect.Type genericReturnType = this.f505035a.getGenericReturnType();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genericReturnType, "getGenericReturnType(...)");
        boolean z17 = genericReturnType instanceof java.lang.Class;
        if (z17) {
            java.lang.Class cls = (java.lang.Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new u06.i0(cls);
            }
        }
        return ((genericReturnType instanceof java.lang.reflect.GenericArrayType) || (z17 && ((java.lang.Class) genericReturnType).isArray())) ? new u06.o(genericReturnType) : genericReturnType instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) genericReturnType) : new u06.z(genericReturnType);
    }

    @Override // e16.w
    /* renamed from: getTypeParameters */
    public java.util.List mo126782xb121b9ba() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = this.f505035a.getTypeParameters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new u06.l0(typeVariable));
        }
        return arrayList;
    }

    public java.util.List h() {
        java.lang.reflect.Method method = this.f505035a;
        java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genericParameterTypes, "getGenericParameterTypes(...)");
        java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parameterAnnotations, "getParameterAnnotations(...)");
        return e(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
