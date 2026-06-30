package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class g0 {
    public static final boolean a() {
        android.content.Context context = null;
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]);
            method.setAccessible(true);
            context = (android.content.Context) method.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
        if (context == null) {
            return false;
        }
        return com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a().a(context, false);
    }

    public static java.lang.String b(android.content.Context context) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0 a17 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a();
        return a17.a(context.getApplicationContext(), a17.f297122b);
    }

    public static java.lang.String a(android.content.Context context) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0 a17 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f0.a();
        return a17.a(context.getApplicationContext(), a17.f297123c);
    }
}
