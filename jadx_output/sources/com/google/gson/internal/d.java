package com.google.gson.internal;

/* loaded from: classes15.dex */
public final class d implements java.lang.reflect.WildcardType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f44808d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f44809e;

    public d(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
        com.google.gson.internal.a.a(typeArr2.length <= 1);
        com.google.gson.internal.a.a(typeArr.length == 1);
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            com.google.gson.internal.e.b(typeArr[0]);
            this.f44809e = null;
            this.f44808d = com.google.gson.internal.e.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        com.google.gson.internal.e.b(typeArr2[0]);
        com.google.gson.internal.a.a(typeArr[0] == java.lang.Object.class);
        this.f44809e = com.google.gson.internal.e.a(typeArr2[0]);
        this.f44808d = java.lang.Object.class;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.WildcardType) && com.google.gson.internal.e.c(this, (java.lang.reflect.WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.f44809e;
        return type != null ? new java.lang.reflect.Type[]{type} : com.google.gson.internal.e.f44810a;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        return new java.lang.reflect.Type[]{this.f44808d};
    }

    public int hashCode() {
        java.lang.reflect.Type type = this.f44809e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f44808d.hashCode() + 31);
    }

    public java.lang.String toString() {
        java.lang.reflect.Type type = this.f44809e;
        if (type != null) {
            return "? super " + com.google.gson.internal.e.h(type);
        }
        java.lang.reflect.Type type2 = this.f44808d;
        if (type2 == java.lang.Object.class) {
            return "?";
        }
        return "? extends " + com.google.gson.internal.e.h(type2);
    }
}
