package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f126354a;

    /* renamed from: b, reason: collision with root package name */
    public final hb.b f126355b = hb.b.f361541a;

    public r(java.util.Map map) {
        this.f126354a = map;
    }

    public com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 a(ib.a aVar) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.k kVar;
        java.lang.reflect.Type type = aVar.f371555b;
        java.util.Map map = this.f126354a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(type));
        java.lang.Class cls = aVar.f371554a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(cls));
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 d0Var = null;
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f126355b.a(declaredConstructor);
            }
            kVar = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.k(this, declaredConstructor);
        } catch (java.lang.NoSuchMethodException unused) {
            kVar = null;
        }
        if (kVar != null) {
            return kVar;
        }
        if (java.util.Collection.class.isAssignableFrom(cls)) {
            d0Var = java.util.SortedSet.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.l(this) : java.util.EnumSet.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.m(this, type) : java.util.Set.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.n(this) : java.util.Queue.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.o(this) : new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p(this);
        } else if (java.util.Map.class.isAssignableFrom(cls)) {
            d0Var = java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.q(this) : java.util.concurrent.ConcurrentMap.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.f(this) : java.util.SortedMap.class.isAssignableFrom(cls) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.g(this) : (!(type instanceof java.lang.reflect.ParameterizedType) || java.lang.String.class.isAssignableFrom(new ib.a(((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0]).f371554a)) ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.i(this) : new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.h(this);
        }
        return d0Var != null ? d0Var : new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.j(this, cls, type);
    }

    /* renamed from: toString */
    public java.lang.String m20499x9616526c() {
        return this.f126354a.toString();
    }
}
