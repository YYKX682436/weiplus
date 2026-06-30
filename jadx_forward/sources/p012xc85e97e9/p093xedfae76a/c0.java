package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f93147a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f93148b = new java.util.HashMap();

    public static p012xc85e97e9.p093xedfae76a.j a(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(constructor.newInstance(obj));
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException(e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            throw new java.lang.RuntimeException(e19);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(java.lang.Class cls) {
        java.lang.reflect.Constructor constructor;
        boolean z17;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap = (java.util.HashMap) f93147a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i17 = 1;
        if (cls.getCanonicalName() != null) {
            try {
                java.lang.Package r47 = cls.getPackage();
                java.lang.String canonicalName = cls.getCanonicalName();
                java.lang.String name = r47 != null ? r47.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                java.lang.String b17 = b(canonicalName);
                if (!name.isEmpty()) {
                    b17 = name + "." + b17;
                }
                constructor = java.lang.Class.forName(b17).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                constructor = null;
            } catch (java.lang.NoSuchMethodException e17) {
                throw new java.lang.RuntimeException(e17);
            }
            java.util.Map map = f93148b;
            if (constructor != null) {
                ((java.util.HashMap) map).put(cls, java.util.Collections.singletonList(constructor));
            } else {
                p012xc85e97e9.p093xedfae76a.d dVar = p012xc85e97e9.p093xedfae76a.d.f93149c;
                java.util.HashMap hashMap2 = (java.util.HashMap) dVar.f93151b;
                java.lang.Boolean bool = (java.lang.Boolean) hashMap2.get(cls);
                if (bool != null) {
                    z17 = bool.booleanValue();
                } else {
                    try {
                        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                hashMap2.put(cls, java.lang.Boolean.FALSE);
                                z17 = false;
                                break;
                            }
                            if (((p012xc85e97e9.p093xedfae76a.l0) declaredMethods[i18].getAnnotation(p012xc85e97e9.p093xedfae76a.l0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                z17 = true;
                                break;
                            }
                            i18++;
                        }
                    } catch (java.lang.NoClassDefFoundError e18) {
                        throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e18);
                    }
                }
                if (!z17) {
                    java.lang.Class superclass = cls.getSuperclass();
                    if (superclass != null && p012xc85e97e9.p093xedfae76a.x.class.isAssignableFrom(superclass)) {
                        arrayList = c(superclass) != 1 ? new java.util.ArrayList((java.util.Collection) ((java.util.HashMap) map).get(superclass)) : null;
                    }
                    java.lang.Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length2) {
                            java.lang.Class<?> cls2 = interfaces[i19];
                            if (cls2 != null && p012xc85e97e9.p093xedfae76a.x.class.isAssignableFrom(cls2)) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.addAll((java.util.Collection) ((java.util.HashMap) map).get(cls2));
                            }
                            i19++;
                        } else if (arrayList != null) {
                            ((java.util.HashMap) map).put(cls, arrayList);
                        }
                    }
                }
            }
            i17 = 2;
        }
        hashMap.put(cls, java.lang.Integer.valueOf(i17));
        return i17;
    }
}
