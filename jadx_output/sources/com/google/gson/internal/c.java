package com.google.gson.internal;

/* loaded from: classes15.dex */
public final class c implements java.lang.reflect.ParameterizedType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f44797d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f44798e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Type[] f44799f;

    public c(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        if (type2 instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type2;
            boolean z17 = true;
            boolean z18 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z18) {
                z17 = false;
            }
            com.google.gson.internal.a.a(z17);
        }
        this.f44797d = type == null ? null : com.google.gson.internal.e.a(type);
        this.f44798e = com.google.gson.internal.e.a(type2);
        java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
        this.f44799f = typeArr2;
        int length = typeArr2.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f44799f[i17].getClass();
            com.google.gson.internal.e.b(this.f44799f[i17]);
            java.lang.reflect.Type[] typeArr3 = this.f44799f;
            typeArr3[i17] = com.google.gson.internal.e.a(typeArr3[i17]);
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.ParameterizedType) && com.google.gson.internal.e.c(this, (java.lang.reflect.ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return (java.lang.reflect.Type[]) this.f44799f.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.f44797d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.f44798e;
    }

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.f44799f) ^ this.f44798e.hashCode();
        java.lang.reflect.Type type = this.f44797d;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.reflect.Type[] typeArr = this.f44799f;
        int length = typeArr.length;
        java.lang.reflect.Type type = this.f44798e;
        if (length == 0) {
            return com.google.gson.internal.e.h(type);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((length + 1) * 30);
        sb6.append(com.google.gson.internal.e.h(type));
        sb6.append("<");
        sb6.append(com.google.gson.internal.e.h(typeArr[0]));
        for (int i17 = 1; i17 < length; i17++) {
            sb6.append(", ");
            sb6.append(com.google.gson.internal.e.h(typeArr[i17]));
        }
        sb6.append(">");
        return sb6.toString();
    }
}
