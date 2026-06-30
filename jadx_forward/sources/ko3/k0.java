package ko3;

/* loaded from: classes13.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.LruCache f391513a = new android.util.LruCache(50);

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.LruCache f391514b = new android.util.LruCache(50);

    static {
        new android.util.LruCache(50);
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            return d(obj.getClass(), str, clsArr).invoke(obj, objArr);
        } catch (java.lang.Throwable th6) {
            throw new ko3.j0(th6);
        }
    }

    public static java.lang.Object b(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            return d(cls, str, clsArr).invoke(null, objArr);
        } catch (java.lang.Throwable th6) {
            throw new ko3.j0(th6);
        }
    }

    public static java.lang.reflect.Field c(java.lang.Class cls, java.lang.String str) {
        android.util.LruCache lruCache = f391513a;
        android.util.LruCache lruCache2 = (android.util.LruCache) lruCache.get(cls.getName());
        if (lruCache2 == null) {
            lruCache2 = new android.util.LruCache(30);
            lruCache.put(cls.getName(), lruCache2);
        }
        java.lang.reflect.Field field = (java.lang.reflect.Field) lruCache2.get(str);
        if (field != null) {
            return field;
        }
        while (true) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                lruCache2.put(str, declaredField);
                return declaredField;
            } catch (java.lang.Throwable th6) {
                if (cls.getSuperclass() == null || cls == java.lang.Object.class) {
                    throw th6;
                }
                cls = cls.getSuperclass();
            }
        }
        throw th6;
    }

    public static java.lang.reflect.Method d(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        android.util.LruCache lruCache = f391514b;
        android.util.LruCache lruCache2 = (android.util.LruCache) lruCache.get(cls.getName());
        if (lruCache2 == null) {
            lruCache2 = new android.util.LruCache(30);
            lruCache.put(cls.getName(), lruCache2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("#");
        sb6.append(clsArr != null ? java.util.Arrays.toString(clsArr) : "[]");
        java.lang.String sb7 = sb6.toString();
        java.lang.reflect.Method method = (java.lang.reflect.Method) lruCache2.get(sb7);
        if (method != null) {
            return method;
        }
        while (true) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                lruCache2.put(sb7, declaredMethod);
                return declaredMethod;
            } catch (java.lang.Throwable th6) {
                if (cls.getSuperclass() == null || cls == java.lang.Object.class) {
                    throw th6;
                }
                cls = cls.getSuperclass();
            }
        }
        throw th6;
    }

    public static java.lang.Object e(java.lang.Object obj, java.lang.String str) {
        try {
            return c(obj.getClass(), str).get(obj);
        } catch (java.lang.Throwable th6) {
            throw new ko3.j0(th6);
        }
    }

    public static void f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        try {
            c(obj.getClass(), str).set(obj, obj2);
        } catch (java.lang.Throwable th6) {
            throw new ko3.j0(th6);
        }
    }
}
