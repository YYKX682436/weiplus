package i85;

/* loaded from: classes7.dex */
public final class h extends i85.c {
    @Override // i85.p
    public java.lang.String a() {
        return "package";
    }

    @Override // i85.p
    public java.lang.String c() {
        return "android.content.pm.IPackageManager";
    }

    @Override // i85.c, i85.p
    public void d(java.lang.Object serviceBinderProxy) {
        java.lang.Class<?> cls;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceBinderProxy, "serviceBinderProxy");
        android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
        if (packageManager != null) {
            try {
                java.lang.reflect.Field declaredField = packageManager.getClass().getDeclaredField("mPM");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPackageManagerProcessor", "applicationPkgManager-mPM = " + declaredField);
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.set(packageManager, serviceBinderProxy);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPackageManagerProcessor", java.lang.String.valueOf(th6.getMessage()));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    java.lang.reflect.Field[] declaredFields = packageManager.getClass().getDeclaredFields();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
                    e(packageManager, declaredFields, serviceBinderProxy);
                }
            }
        }
        try {
            cls = java.lang.Class.forName("android.app.ActivityThread");
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                java.lang.reflect.Field declaredField2 = cls.getDeclaredField("sPackageManager");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPackageManagerProcessor", "activityThread-sPackageManager = " + declaredField2);
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                    declaredField2.set(cls, serviceBinderProxy);
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPackageManagerProcessor", java.lang.String.valueOf(th7.getMessage()));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
                    method.setAccessible(true);
                    java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
                    if (invoke == null) {
                        java.lang.reflect.Field field = context.getClass().getField("mLoadedApk");
                        field.setAccessible(true);
                        java.lang.Object obj = field.get(context);
                        java.lang.reflect.Field declaredField3 = obj.getClass().getDeclaredField("mActivityThread");
                        declaredField3.setAccessible(true);
                        invoke = declaredField3.get(obj);
                    }
                    java.lang.reflect.Field[] declaredFields2 = cls.getDeclaredFields();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields2, "getDeclaredFields(...)");
                    e(invoke, declaredFields2, serviceBinderProxy);
                }
            }
        }
    }

    public final void e(java.lang.Object obj, java.lang.reflect.Field[] fieldArr, java.lang.Object obj2) {
        java.util.ArrayList arrayList;
        java.lang.Class<?>[] interfaces;
        java.lang.reflect.Field field = null;
        if (!(!(fieldArr.length == 0))) {
            fieldArr = null;
        }
        if (fieldArr != null) {
            int length = fieldArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.reflect.Field field2 = fieldArr[i17];
                java.lang.Object obj3 = obj != null ? field2.get(obj) : null;
                if (obj3 == null || (interfaces = obj3.getClass().getInterfaces()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(interfaces.length);
                    for (java.lang.Class<?> cls : interfaces) {
                        arrayList.add(cls.getSimpleName());
                    }
                }
                if (!(arrayList == null || arrayList.isEmpty()) && arrayList.contains("IPackageManager")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPackageManagerProcessor", "found IPackageManager in " + obj);
                    field = field2;
                    break;
                }
                i17++;
            }
        }
        if (obj == null || field == null) {
            return;
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }
}
