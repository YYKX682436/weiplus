package com.google.gson.internal;

/* loaded from: classes16.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f44821a;

    /* renamed from: b, reason: collision with root package name */
    public final hb.b f44822b = hb.b.f280008a;

    public r(java.util.Map map) {
        this.f44821a = map;
    }

    public com.google.gson.internal.d0 a(ib.a aVar) {
        com.google.gson.internal.k kVar;
        java.lang.reflect.Type type = aVar.f290022b;
        java.util.Map map = this.f44821a;
        android.support.v4.media.f.a(map.get(type));
        java.lang.Class cls = aVar.f290021a;
        android.support.v4.media.f.a(map.get(cls));
        com.google.gson.internal.d0 d0Var = null;
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f44822b.a(declaredConstructor);
            }
            kVar = new com.google.gson.internal.k(this, declaredConstructor);
        } catch (java.lang.NoSuchMethodException unused) {
            kVar = null;
        }
        if (kVar != null) {
            return kVar;
        }
        if (java.util.Collection.class.isAssignableFrom(cls)) {
            d0Var = java.util.SortedSet.class.isAssignableFrom(cls) ? new com.google.gson.internal.l(this) : java.util.EnumSet.class.isAssignableFrom(cls) ? new com.google.gson.internal.m(this, type) : java.util.Set.class.isAssignableFrom(cls) ? new com.google.gson.internal.n(this) : java.util.Queue.class.isAssignableFrom(cls) ? new com.google.gson.internal.o(this) : new com.google.gson.internal.p(this);
        } else if (java.util.Map.class.isAssignableFrom(cls)) {
            d0Var = java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new com.google.gson.internal.q(this) : java.util.concurrent.ConcurrentMap.class.isAssignableFrom(cls) ? new com.google.gson.internal.f(this) : java.util.SortedMap.class.isAssignableFrom(cls) ? new com.google.gson.internal.g(this) : (!(type instanceof java.lang.reflect.ParameterizedType) || java.lang.String.class.isAssignableFrom(new ib.a(((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0]).f290021a)) ? new com.google.gson.internal.i(this) : new com.google.gson.internal.h(this);
        }
        return d0Var != null ? d0Var : new com.google.gson.internal.j(this, cls, type);
    }

    public java.lang.String toString() {
        return this.f44821a.toString();
    }
}
