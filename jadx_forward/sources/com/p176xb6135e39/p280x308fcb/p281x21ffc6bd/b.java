package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes15.dex */
public final class b implements java.lang.reflect.GenericArrayType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f126234d;

    public b(java.lang.reflect.Type type) {
        this.f126234d = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(type);
    }

    /* renamed from: equals */
    public boolean m20476xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.GenericArrayType) && com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.c(this, (java.lang.reflect.GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.f126234d;
    }

    /* renamed from: hashCode */
    public int m20477x8cdac1b() {
        return this.f126234d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m20478x9616526c() {
        return com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(this.f126234d) + "[]";
    }
}
