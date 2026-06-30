package ut5;

/* loaded from: classes13.dex */
public class b extends java.lang.ClassLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f512722a = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.ApkClassLoader");

    public b(java.lang.ClassLoader classLoader) {
        super(classLoader);
    }

    public static ut5.b a(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, java.lang.String[] strArr, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        java.lang.String sb6;
        java.lang.Object obj;
        java.lang.Object[] objArr = new java.lang.Object[3];
        int i17 = 0;
        objArr[0] = c25507x83693462.f46642x1b64b1fd;
        objArr[1] = c25507x83693462.f46641x58b6bfa;
        java.lang.reflect.Field field = null;
        if (strArr == null) {
            sb6 = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
            for (int i18 = 0; i18 < strArr.length; i18++) {
                if (i18 != 0) {
                    sb7.append(", ");
                }
                sb7.append("\"");
                sb7.append(strArr[i18]);
                sb7.append("\"");
            }
            sb7.append("]");
            sb6 = sb7.toString();
        }
        objArr[2] = sb6;
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f512722a;
        interfaceC25508x87fce1b0.mo46957x3164ae("ApkClassLoader create for path:%s, fd:%s, whiteList:%s", objArr);
        java.lang.ClassLoader classLoader = ut5.b.class.getClassLoader();
        java.lang.ClassLoader classLoader2 = classLoader;
        while (classLoader2 != null) {
            java.lang.ClassLoader parent = classLoader2.getParent();
            if (parent == null ? false : parent.getClass().getName().equals("java.lang.BootClassLoader")) {
                break;
            }
            classLoader2 = classLoader2.getParent();
        }
        if (classLoader2 == null) {
            classLoader2 = classLoader;
        }
        interfaceC25508x87fce1b0.mo46953x3164ae("hostClassLoader:" + classLoader + ", appPathClassLoader:" + classLoader2);
        if (parcelFileDescriptor != null) {
            dalvik.system.InMemoryDexClassLoader inMemoryDexClassLoader = new dalvik.system.InMemoryDexClassLoader(ut5.d.c(parcelFileDescriptor), classLoader2.getParent());
            java.lang.ClassLoader classLoader3 = ut5.d.class.getClassLoader();
            java.lang.ClassLoader parent2 = classLoader3.getParent();
            java.lang.reflect.Field[] declaredFields = java.lang.ClassLoader.class.getDeclaredFields();
            int length = declaredFields.length;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.reflect.Field field2 = declaredFields[i17];
                try {
                    boolean isAccessible = field2.isAccessible();
                    field2.setAccessible(true);
                    obj = field2.get(classLoader3);
                    field2.setAccessible(isAccessible);
                } catch (java.lang.IllegalAccessException unused) {
                }
                if (obj == parent2) {
                    field = field2;
                    break;
                }
                i17++;
            }
            if (field == null) {
                throw new java.lang.RuntimeException("在ClassLoader.class中没找到类型为ClassLoader的parent域");
            }
            field.setAccessible(true);
            field.set(classLoader2, inMemoryDexClassLoader);
        }
        java.lang.ClassLoader parent3 = classLoader2.getParent();
        interfaceC25508x87fce1b0.mo46953x3164ae("grandClassLoader:" + parent3);
        return new ut5.b(ut5.d.a(c25507x83693462, new ut5.a(classLoader, strArr, parent3)));
    }
}
