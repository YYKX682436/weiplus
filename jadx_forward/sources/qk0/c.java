package qk0;

/* loaded from: classes7.dex */
public abstract class c {
    public static boolean a(java.lang.Class cls) {
        if (cls == null) {
            rk0.c.d("IPC.ReflectUtil", "check failed: class is null", new java.lang.Object[0]);
            return false;
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            return true;
        }
        if (cls.isLocalClass()) {
            rk0.c.d("IPC.ReflectUtil", "check failed: isLocalClass = true", new java.lang.Object[0]);
            return false;
        }
        if (cls.isMemberClass()) {
            rk0.c.d("IPC.ReflectUtil", "check failed: isMemberClass = true", new java.lang.Object[0]);
            return false;
        }
        for (java.lang.reflect.Constructor<?> constructor : cls.getDeclaredConstructors()) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes == null || parameterTypes.length == 0) {
                return true;
            }
        }
        rk0.c.d("IPC.ReflectUtil", "check failed: no non-params constructor.  class:%s, stack:%s", cls.getName(), new qk0.b());
        return false;
    }

    public static java.lang.Object b(java.lang.Class cls) {
        if (cls == null) {
            rk0.c.b("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new java.lang.Object[0]);
            return null;
        }
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e17) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e17);
            return null;
        } catch (java.lang.InstantiationException e18) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e18);
            return null;
        } catch (java.lang.NoSuchMethodException e19) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e19);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e27) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e27);
            return null;
        }
    }

    public static java.lang.Object c(java.lang.Class cls, java.lang.Class cls2) {
        if (cls == null) {
            rk0.c.b("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new java.lang.Object[0]);
            return null;
        }
        if (cls2 == null) {
            rk0.c.b("IPC.ReflectUtil", "newInstance failed, parent class is null.", new java.lang.Object[0]);
            return null;
        }
        try {
            if (!cls2.isAssignableFrom(cls)) {
                rk0.c.b("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls2, cls);
                return null;
            }
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e17) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e17);
            return null;
        } catch (java.lang.InstantiationException e18) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e18);
            return null;
        } catch (java.lang.NoSuchMethodException e19) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e19);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e27) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e27);
            return null;
        }
    }

    public static java.lang.Object d(java.lang.String str, java.lang.Class cls) {
        if (str == null || str.length() == 0) {
            rk0.c.b("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new java.lang.Object[0]);
            return null;
        }
        if (cls == null) {
            rk0.c.b("IPC.ReflectUtil", "newInstance failed, parent class is null.", new java.lang.Object[0]);
            return null;
        }
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(str);
            if (!cls.isAssignableFrom(cls2)) {
                rk0.c.b("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls, cls2);
                return null;
            }
            java.lang.reflect.Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e17) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e17);
            return null;
        } catch (java.lang.IllegalAccessException e18) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e18);
            return null;
        } catch (java.lang.InstantiationException e19) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e19);
            return null;
        } catch (java.lang.NoSuchMethodException e27) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e27);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e28) {
            rk0.c.b("IPC.ReflectUtil", "reflect error : %s", e28);
            return null;
        }
    }
}
