package db5;

/* loaded from: classes14.dex */
public abstract class f {
    public static void a(android.content.Context context, android.content.Intent intent) {
        if (intent == null || context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        if (intent.getBooleanExtra("animation_pop_in", false)) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        if (intent.getBooleanExtra("animation_push_up_in", false)) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(android.app.Activity activity) {
        try {
            java.lang.reflect.Method declaredMethod = android.app.Activity.class.getDeclaredMethod("convertFromTranslucent", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new java.lang.Object[0]);
            if (activity instanceof db5.c) {
                ((db5.c) activity).q4();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ActivityUtil", th6, "call convertActivityFromTranslucent Fail: %s", th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(android.app.Activity activity, db5.d dVar) {
        java.lang.Object obj;
        if (fp.h.a(16)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        try {
            java.lang.Class<?> cls = null;
            for (java.lang.Class<?> cls2 : android.app.Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener") && !cls2.getSimpleName().equals("SemTranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            if (dVar != null) {
                db5.e eVar = new db5.e(null);
                eVar.f309855a = new java.lang.ref.WeakReference(dVar);
                obj = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, eVar);
            } else {
                obj = null;
            }
            if (fp.h.a(21)) {
                java.lang.reflect.Method declaredMethod = android.app.Activity.class.getDeclaredMethod("convertToTranslucent", cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity, obj);
            } else {
                java.lang.reflect.Method declaredMethod2 = android.app.Activity.class.getDeclaredMethod("convertToTranslucent", cls, android.app.ActivityOptions.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, obj, null);
            }
            if (activity instanceof db5.c) {
                ((db5.c) activity).k2();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ActivityUtil", th6, "call convertActivityToTranslucent Fail: %s", th6.getMessage());
        }
    }

    public static al5.q d(java.lang.Class cls) {
        int e17 = e(cls);
        if ((32768 & e17) != 0) {
            return al5.q.f87525h;
        }
        if ((e17 & 512) != 0) {
            return al5.q.f87521d;
        }
        if ((e17 & 1024) != 0) {
            return al5.q.f87522e;
        }
        if ((e17 & 8192) != 0) {
            return al5.q.f87524g;
        }
        if ((e17 & 2048) != 0) {
            return al5.q.f87523f;
        }
        return null;
    }

    public static int e(java.lang.Class cls) {
        db5.a aVar = (db5.a) cls.getAnnotation(db5.a.class);
        if (aVar != null) {
            return aVar.m123858x6ac9171();
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null) {
            return e(superclass);
        }
        return 0;
    }

    public static al5.q f(java.lang.Class cls) {
        int e17 = e(cls);
        return (32768 & e17) != 0 ? al5.q.f87525h : (e17 & 512) != 0 ? al5.q.f87521d : (e17 & 1024) != 0 ? al5.q.f87522e : (e17 & 8192) != 0 ? al5.q.f87524g : (e17 & 2048) != 0 ? al5.q.f87523f : al5.q.f87523f;
    }

    public static boolean g() {
        return fp.h.c(19);
    }

    public static void h(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    public static void i(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    public static void j(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }

    public static void k(android.content.Context context) {
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }
}
