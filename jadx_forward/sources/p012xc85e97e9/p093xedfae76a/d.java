package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.d f93149c = new p012xc85e97e9.p093xedfae76a.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f93150a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f93151b = new java.util.HashMap();

    public final p012xc85e97e9.p093xedfae76a.b a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i17;
        p012xc85e97e9.p093xedfae76a.b b17;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (superclass != null && (b17 = b(superclass)) != null) {
            hashMap.putAll(b17.f93136b);
        }
        for (java.lang.Class cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : b(cls2).f93136b.entrySet()) {
                c(hashMap, (p012xc85e97e9.p093xedfae76a.c) entry.getKey(), (p012xc85e97e9.p093xedfae76a.m) entry.getValue(), cls);
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
            p012xc85e97e9.p093xedfae76a.l0 l0Var = (p012xc85e97e9.p093xedfae76a.l0) method.getAnnotation(p012xc85e97e9.p093xedfae76a.l0.class);
            if (l0Var != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i17 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(p012xc85e97e9.p093xedfae76a.y.class)) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i17 = 1;
                }
                p012xc85e97e9.p093xedfae76a.m m7813x6ac9171 = l0Var.m7813x6ac9171();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(p012xc85e97e9.p093xedfae76a.m.class)) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (m7813x6ac9171 != p012xc85e97e9.p093xedfae76a.m.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i17 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new p012xc85e97e9.p093xedfae76a.c(i17, method), m7813x6ac9171, cls);
                z17 = true;
            }
        }
        p012xc85e97e9.p093xedfae76a.b bVar = new p012xc85e97e9.p093xedfae76a.b(hashMap);
        ((java.util.HashMap) this.f93150a).put(cls, bVar);
        ((java.util.HashMap) this.f93151b).put(cls, java.lang.Boolean.valueOf(z17));
        return bVar;
    }

    public p012xc85e97e9.p093xedfae76a.b b(java.lang.Class cls) {
        p012xc85e97e9.p093xedfae76a.b bVar = (p012xc85e97e9.p093xedfae76a.b) ((java.util.HashMap) this.f93150a).get(cls);
        return bVar != null ? bVar : a(cls, null);
    }

    public final void c(java.util.Map map, p012xc85e97e9.p093xedfae76a.c cVar, p012xc85e97e9.p093xedfae76a.m mVar, java.lang.Class cls) {
        p012xc85e97e9.p093xedfae76a.m mVar2 = (p012xc85e97e9.p093xedfae76a.m) map.get(cVar);
        if (mVar2 == null || mVar == mVar2) {
            if (mVar2 == null) {
                map.put(cVar, mVar);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + cVar.f93146b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
    }
}
