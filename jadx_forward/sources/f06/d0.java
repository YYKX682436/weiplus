package f06;

/* loaded from: classes15.dex */
public final class d0 implements java.lang.reflect.ParameterizedType, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f339978d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f339979e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Type[] f339980f;

    public d0(java.lang.Class rawType, java.lang.reflect.Type type, java.util.List typeArguments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawType, "rawType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeArguments, "typeArguments");
        this.f339978d = rawType;
        this.f339979e = type;
        this.f339980f = (java.lang.reflect.Type[]) typeArguments.toArray(new java.lang.reflect.Type[0]);
    }

    /* renamed from: equals */
    public boolean m128645xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339978d, parameterizedType.getRawType()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339979e, parameterizedType.getOwnerType())) {
                if (java.util.Arrays.equals(this.f339980f, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return this.f339980f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.f339979e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.f339978d;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Class cls = this.f339978d;
        java.lang.reflect.Type type = this.f339979e;
        if (type != null) {
            sb6.append(f06.h0.a(type));
            sb6.append("$");
            sb6.append(cls.getSimpleName());
        } else {
            sb6.append(f06.h0.a(cls));
        }
        java.lang.reflect.Type[] typeArr = this.f339980f;
        if (!(typeArr.length == 0)) {
            kz5.z.Z(typeArr, sb6, null, "<", ">", 0, null, f06.c0.f339977d, 50, null);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* renamed from: hashCode */
    public int m128646x8cdac1b() {
        int hashCode = this.f339978d.hashCode();
        java.lang.reflect.Type type = this.f339979e;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(this.f339980f);
    }

    /* renamed from: toString */
    public java.lang.String m128647x9616526c() {
        return getTypeName();
    }
}
