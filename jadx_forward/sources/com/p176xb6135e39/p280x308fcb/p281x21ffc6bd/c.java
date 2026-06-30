package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes15.dex */
public final class c implements java.lang.reflect.ParameterizedType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f126330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f126331e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Type[] f126332f;

    public c(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        if (type2 instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type2;
            boolean z17 = true;
            boolean z18 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z18) {
                z17 = false;
            }
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.a.a(z17);
        }
        this.f126330d = type == null ? null : com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(type);
        this.f126331e = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(type2);
        java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
        this.f126332f = typeArr2;
        int length = typeArr2.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f126332f[i17].getClass();
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.b(this.f126332f[i17]);
            java.lang.reflect.Type[] typeArr3 = this.f126332f;
            typeArr3[i17] = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(typeArr3[i17]);
        }
    }

    /* renamed from: equals */
    public boolean m20491xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.ParameterizedType) && com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.c(this, (java.lang.reflect.ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return (java.lang.reflect.Type[]) this.f126332f.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.f126330d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.f126331e;
    }

    /* renamed from: hashCode */
    public int m20492x8cdac1b() {
        int hashCode = java.util.Arrays.hashCode(this.f126332f) ^ this.f126331e.hashCode();
        java.lang.reflect.Type type = this.f126330d;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m20493x9616526c() {
        java.lang.reflect.Type[] typeArr = this.f126332f;
        int length = typeArr.length;
        java.lang.reflect.Type type = this.f126331e;
        if (length == 0) {
            return com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(type);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((length + 1) * 30);
        sb6.append(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(type));
        sb6.append("<");
        sb6.append(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(typeArr[0]));
        for (int i17 = 1; i17 < length; i17++) {
            sb6.append(", ");
            sb6.append(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(typeArr[i17]));
        }
        sb6.append(">");
        return sb6.toString();
    }
}
