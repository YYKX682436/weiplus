package com.tencent.map.geolocation.sapp.databus;

/* loaded from: classes13.dex */
public class DataBusNativeInterface {
    private static final java.lang.String TAG = "DataBusNInt";
    private static boolean isInited;
    private static java.lang.Class mProxyClass;

    private static void doInit(android.content.Context context) {
        dalvik.system.DexClassLoader a17 = c.t.m.sapp.c.f.a(context).a();
        if (a17 == null) {
            c.t.m.sapp.c.i.a("LMI,DataBus 41");
            c.t.m.sapp.c.e.b().a("LMI", "DataBus 41");
        } else {
            mProxyClass = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.DataBusProxy");
            c.t.m.sapp.c.i.a("LMI,DataBus 0");
            c.t.m.sapp.c.e.b().a("LMI", "DataBus 0");
            isInited = true;
        }
    }

    public static java.lang.String getCommValueByJni(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Class cls;
        if (isInited && (cls = mProxyClass) != null) {
            try {
                return (java.lang.String) cls.getDeclaredMethod("getCommValueByJni", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(null, java.lang.Integer.valueOf(i17), str, str2);
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    public static void init(android.content.Context context) {
        try {
            doInit(context);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void logCallbackFromJni(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Class cls;
        if (!isInited || (cls = mProxyClass) == null) {
            return;
        }
        try {
            cls.getDeclaredMethod("logCallbackFromJni", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(null, java.lang.Integer.valueOf(i17), str, str2);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void notifyListenersByJni(int i17, byte[] bArr) {
        java.lang.Class cls;
        if (!isInited || (cls = mProxyClass) == null) {
            return;
        }
        try {
            cls.getDeclaredMethod("notifyListenersByJni", java.lang.Integer.TYPE, byte[].class).invoke(null, java.lang.Integer.valueOf(i17), bArr);
        } catch (java.lang.Exception unused) {
        }
    }
}
