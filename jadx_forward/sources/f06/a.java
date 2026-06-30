package f06;

/* loaded from: classes15.dex */
public final class a implements java.lang.reflect.GenericArrayType, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f339967d;

    public a(java.lang.reflect.Type elementType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementType, "elementType");
        this.f339967d = elementType;
    }

    /* renamed from: equals */
    public boolean m128623xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.GenericArrayType) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339967d, ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.f339967d;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return f06.h0.a(this.f339967d) + "[]";
    }

    /* renamed from: hashCode */
    public int m128624x8cdac1b() {
        return this.f339967d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128625x9616526c() {
        return getTypeName();
    }
}
