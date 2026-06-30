package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class rk {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Object f291286a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f291287b;

    public static int a(int i17) {
        if ((!com.p314xaae8f345.mm.ui.bk.g0() && !com.p314xaae8f345.mm.ui.bk.f0()) || f291287b == null) {
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            return ((android.os.Bundle) f291287b.invoke(f291286a, "com.tencent.mm", "getTaskPosition", jSONObject.toString(), null)).getInt("int");
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | org.json.JSONException unused) {
            return -1;
        }
    }

    public static boolean b(android.content.Context context) {
        if (!com.p314xaae8f345.mm.ui.bk.g0() && !com.p314xaae8f345.mm.ui.bk.f0()) {
            return false;
        }
        try {
            f291286a = (android.view.WindowManager) context.getSystemService("window");
            java.lang.reflect.Method method = android.view.WindowManager.class.getMethod("invokeSync", java.lang.String.class, java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
            f291287b = method;
            if (method != null) {
                return ((android.os.Bundle) method.invoke(f291286a, "com.tencent.mm", "isMultiLandsEnable", null, null)).getBoolean(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03);
            }
            return false;
        } catch (java.lang.Exception e17) {
            e17.toString();
            try {
                f291286a = java.lang.Class.forName("android.view.IWindowManager$Stub").getMethod("asInterface", android.os.IBinder.class).invoke(null, java.lang.Class.forName("android.os.ServiceManager").getMethod("getService", java.lang.String.class).invoke(null, "window"));
                java.lang.reflect.Method method2 = java.lang.Class.forName("android.view.IWindowManager$Stub$Proxy").getMethod("invokeSync", java.lang.String.class, java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
                f291287b = method2;
                if (method2 != null) {
                    return ((android.os.Bundle) method2.invoke(f291286a, "com.tencent.mm", "isMultiLandsEnable", null, null)).getBoolean(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03);
                }
                return false;
            } catch (java.lang.Exception e18) {
                e18.toString();
                return false;
            }
        }
    }

    public static void c(int i17, int i18) {
        java.lang.reflect.Method method;
        if ((!com.p314xaae8f345.mm.ui.bk.g0() && !com.p314xaae8f345.mm.ui.bk.f0()) || (method = f291287b) == null || method == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            e17.getMessage();
        }
        try {
            f291287b.invoke(f291286a, "com.tencent.mm", "setTaskPosition", jSONObject.toString(), null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }
}
