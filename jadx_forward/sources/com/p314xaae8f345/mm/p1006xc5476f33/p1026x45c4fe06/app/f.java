package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public abstract class f {
    public static void a(android.app.Application application) {
        java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        if (invoke == null) {
            java.lang.reflect.Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            java.lang.Object obj = field.get(application);
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            invoke = declaredField.get(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e.f156591a = invoke;
        java.lang.reflect.Field declaredField2 = invoke.getClass().getDeclaredField("mH");
        declaredField2.setAccessible(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e.f156592b = (android.os.Handler) declaredField2.get(invoke);
    }
}
