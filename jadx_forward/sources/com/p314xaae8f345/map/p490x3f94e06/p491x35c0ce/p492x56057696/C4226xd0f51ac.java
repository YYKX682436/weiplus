package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p492x56057696;

/* renamed from: com.tencent.map.geolocation.sapp.databus.DataBusNativeInterface */
/* loaded from: classes13.dex */
public class C4226xd0f51ac {
    private static final java.lang.String TAG = "DataBusNInt";

    /* renamed from: isInited */
    private static boolean f16272xe1995f79;

    /* renamed from: mProxyClass */
    private static java.lang.Class f16273x6bb83bf7;

    /* renamed from: doInit */
    private static void m34981xb0e3a83b(android.content.Context context) {
        dalvik.system.DexClassLoader a17 = c.t.m.p134x35c0ce.c.f.a(context).a();
        if (a17 == null) {
            c.t.m.p134x35c0ce.c.i.a("LMI,DataBus 41");
            c.t.m.p134x35c0ce.c.e.b().a("LMI", "DataBus 41");
        } else {
            f16273x6bb83bf7 = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.DataBusProxy");
            c.t.m.p134x35c0ce.c.i.a("LMI,DataBus 0");
            c.t.m.p134x35c0ce.c.e.b().a("LMI", "DataBus 0");
            f16272xe1995f79 = true;
        }
    }

    /* renamed from: getCommValueByJni */
    public static java.lang.String m34982x4d35d9ff(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Class cls;
        if (f16272xe1995f79 && (cls = f16273x6bb83bf7) != null) {
            try {
                return (java.lang.String) cls.getDeclaredMethod("getCommValueByJni", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(null, java.lang.Integer.valueOf(i17), str, str2);
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: init */
    public static void m34983x316510(android.content.Context context) {
        try {
            m34981xb0e3a83b(context);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: logCallbackFromJni */
    public static void m34984x315227b2(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Class cls;
        if (!f16272xe1995f79 || (cls = f16273x6bb83bf7) == null) {
            return;
        }
        try {
            cls.getDeclaredMethod("logCallbackFromJni", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(null, java.lang.Integer.valueOf(i17), str, str2);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: notifyListenersByJni */
    public static void m34985x6bde6078(int i17, byte[] bArr) {
        java.lang.Class cls;
        if (!f16272xe1995f79 || (cls = f16273x6bb83bf7) == null) {
            return;
        }
        try {
            cls.getDeclaredMethod("notifyListenersByJni", java.lang.Integer.TYPE, byte[].class).invoke(null, java.lang.Integer.valueOf(i17), bArr);
        } catch (java.lang.Exception unused) {
        }
    }
}
