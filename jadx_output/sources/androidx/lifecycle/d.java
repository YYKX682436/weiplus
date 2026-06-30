package androidx.lifecycle;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.lifecycle.d f11616c = new androidx.lifecycle.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f11617a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f11618b = new java.util.HashMap();

    public final androidx.lifecycle.b a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i17;
        androidx.lifecycle.b b17;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (superclass != null && (b17 = b(superclass)) != null) {
            hashMap.putAll(b17.f11603b);
        }
        for (java.lang.Class cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : b(cls2).f11603b.entrySet()) {
                c(hashMap, (androidx.lifecycle.c) entry.getKey(), (androidx.lifecycle.m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (java.lang.NoClassDefFoundError e17) {
                throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e17);
            }
        }
        boolean z17 = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) method.getAnnotation(androidx.lifecycle.l0.class);
            if (l0Var != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i17 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(androidx.lifecycle.y.class)) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i17 = 1;
                }
                androidx.lifecycle.m value = l0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(androidx.lifecycle.m.class)) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != androidx.lifecycle.m.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i17 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new androidx.lifecycle.c(i17, method), value, cls);
                z17 = true;
            }
        }
        androidx.lifecycle.b bVar = new androidx.lifecycle.b(hashMap);
        ((java.util.HashMap) this.f11617a).put(cls, bVar);
        ((java.util.HashMap) this.f11618b).put(cls, java.lang.Boolean.valueOf(z17));
        return bVar;
    }

    public androidx.lifecycle.b b(java.lang.Class cls) {
        androidx.lifecycle.b bVar = (androidx.lifecycle.b) ((java.util.HashMap) this.f11617a).get(cls);
        return bVar != null ? bVar : a(cls, null);
    }

    public final void c(java.util.Map map, androidx.lifecycle.c cVar, androidx.lifecycle.m mVar, java.lang.Class cls) {
        androidx.lifecycle.m mVar2 = (androidx.lifecycle.m) map.get(cVar);
        if (mVar2 == null || mVar == mVar2) {
            if (mVar2 == null) {
                map.put(cVar, mVar);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + cVar.f11613b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
    }
}
