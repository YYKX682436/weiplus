package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPThreadAnnotations */
/* loaded from: classes13.dex */
public class C26580xafd4c79e {

    /* renamed from: mRegisterMethods */
    private static java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod> f55363xffeeb762 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.thumbplayer.utils.TPThreadAnnotations$RegisterMethod */
    /* loaded from: classes6.dex */
    public static class RegisterMethod {

        /* renamed from: className */
        java.lang.String f55364xff691c23;

        /* renamed from: methodMap */
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> f55365xcd0fa4bb;

        private RegisterMethod() {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.utils.TPThreadAnnotations$ThreadSwitch */
    /* loaded from: classes6.dex */
    public @interface ThreadSwitch {
        /* renamed from: checkObj */
        boolean m104402x5b9ad2cf() default false;

        /* renamed from: needWait */
        boolean m104403x339a532b() default false;

        /* renamed from: removeRepeat */
        boolean m104404xca989f3f() default false;
    }

    /* renamed from: checkObj */
    public static boolean m104390x5b9ad2cf(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch threadSwitch;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 == null || (method = m104395x7570e4a2.get(java.lang.Integer.valueOf(i17))) == null || (threadSwitch = (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch) method.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.m104402x5b9ad2cf();
    }

    /* renamed from: getApi */
    public static java.lang.String m104391xb5882ae4(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        return (m104395x7570e4a2 == null || (method = m104395x7570e4a2.get(java.lang.Integer.valueOf(i17))) == null) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : method.getName();
    }

    /* renamed from: getMethod */
    public static java.lang.reflect.Method m104392x24dcf3d7(java.lang.Class<?> cls, java.lang.String str, java.lang.Object[] objArr) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 == null) {
            return null;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.reflect.Method>> it = m104395x7570e4a2.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.reflect.Method value = it.next().getValue();
            if (value != null && str.equals(value.getName()) && m104396x7d73421(value, objArr)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: getMethodByMsgId */
    public static java.lang.reflect.Method m104393x5da0ea8e(java.lang.Class<?> cls, int i17) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 == null) {
            return null;
        }
        return m104395x7570e4a2.get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getMethodMsgId */
    public static int m104394xa197bee5(java.lang.Class<?> cls, java.lang.String str, java.lang.Object[] objArr) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 == null) {
            return -1;
        }
        for (java.util.Map.Entry<java.lang.Integer, java.lang.reflect.Method> entry : m104395x7570e4a2.entrySet()) {
            java.lang.reflect.Method value = entry.getValue();
            if (value != null && str.equals(value.getName()) && m104396x7d73421(value, objArr)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    /* renamed from: getRegisterMethodMap */
    private static java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2(java.lang.Class<?> cls) {
        java.lang.String str;
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod> it = f55363xffeeb762.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod next = it.next();
            if (next != null && (str = next.f55364xff691c23) != null && str.equals(cls.getName())) {
                return next.f55365xcd0fa4bb;
            }
        }
        return null;
    }

    /* renamed from: isMatchParams */
    private static boolean m104396x7d73421(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        if (objArr == null || objArr.length == 0) {
            return parameterTypes.length == 0;
        }
        if (parameterTypes.length != objArr.length) {
            return false;
        }
        for (int i17 = 0; i17 < parameterTypes.length; i17++) {
            java.lang.Class<?> cls = parameterTypes[i17];
            java.lang.Object obj = objArr[i17];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(obj.getClass()) && !m104399x60d9d617(cls, objArr[i17])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isNeedWait */
    public static boolean m104397x451fa75(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 != null && (method = m104395x7570e4a2.get(java.lang.Integer.valueOf(i17))) != null) {
            java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                return true;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch threadSwitch = (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch) method.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch.class);
            if (threadSwitch != null) {
                return threadSwitch.m104403x339a532b();
            }
        }
        return false;
    }

    /* renamed from: isRegistered */
    private static boolean m104398x11f61b4c(java.lang.Class<?> cls) {
        java.lang.String str;
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod> it = f55363xffeeb762.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod next = it.next();
            if (next != null && (str = next.f55364xff691c23) != null && str.equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSamePrimitive */
    private static boolean m104399x60d9d617(java.lang.Class<?> cls, java.lang.Object obj) {
        if (!cls.isPrimitive()) {
            return false;
        }
        try {
            return obj.getClass().getField("TYPE").get(null).equals(cls);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: register */
    public static synchronized boolean m104400xd6dc2ea3(java.lang.Class<?> cls, int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.class) {
            if (m104398x11f61b4c(cls)) {
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                for (java.lang.reflect.Method method : cls.getMethods()) {
                    if (((com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch) method.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch.class)) != null) {
                        hashMap.put(java.lang.Integer.valueOf(i17), method);
                        i17++;
                    }
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod registerMethod = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.RegisterMethod();
                registerMethod.f55364xff691c23 = cls.getName();
                registerMethod.f55365xcd0fa4bb = hashMap;
                f55363xffeeb762.add(registerMethod);
                return true;
            } catch (java.lang.Exception unused) {
                hashMap.clear();
                return false;
            }
        }
    }

    /* renamed from: removeRepeat */
    public static boolean m104401xca989f3f(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch threadSwitch;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> m104395x7570e4a2 = m104395x7570e4a2(cls);
        if (m104395x7570e4a2 == null || (method = m104395x7570e4a2.get(java.lang.Integer.valueOf(i17))) == null || (threadSwitch = (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch) method.getAnnotation(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.m104404xca989f3f();
    }
}
