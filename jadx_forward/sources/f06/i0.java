package f06;

/* loaded from: classes15.dex */
public final class i0 implements java.lang.reflect.WildcardType, java.lang.reflect.Type {

    /* renamed from: f, reason: collision with root package name */
    public static final f06.i0 f339984f = new f06.i0(null, null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f339985d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f339986e;

    public i0(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.f339985d = type;
        this.f339986e = type2;
    }

    /* renamed from: equals */
    public boolean m128658xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
            if (java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.f339986e;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        java.lang.reflect.Type type = this.f339986e;
        if (type != null) {
            return "? super " + f06.h0.a(type);
        }
        java.lang.reflect.Type type2 = this.f339985d;
        if (type2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(type2, java.lang.Object.class)) {
            return "?";
        }
        return "? extends " + f06.h0.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[1];
        java.lang.reflect.Type type = this.f339985d;
        if (type == null) {
            type = java.lang.Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    /* renamed from: hashCode */
    public int m128659x8cdac1b() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    /* renamed from: toString */
    public java.lang.String m128660x9616526c() {
        return getTypeName();
    }
}
