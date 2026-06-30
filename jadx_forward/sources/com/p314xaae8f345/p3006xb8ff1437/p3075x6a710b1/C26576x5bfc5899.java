package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPPrimaryReflectUtil */
/* loaded from: classes13.dex */
public class C26576x5bfc5899 {
    public static final java.lang.String TAG = "TPPrimaryReflectUtil";

    /* renamed from: sForNameMethod */
    private static java.lang.reflect.Method f55340x91826742;

    /* renamed from: sGetDeclaredMethod */
    private static java.lang.reflect.Method f55341xaa5327e;

    /* renamed from: sGetFieldMethod */
    private static java.lang.reflect.Method f55342x6050898;

    static {
        try {
            f55340x91826742 = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            f55341xaa5327e = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
            f55342x6050898 = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6.getMessage());
        }
    }

    /* renamed from: canReflection */
    private static boolean m104359x46a1c41b() {
        return (f55340x91826742 == null || f55341xaa5327e == null || f55342x6050898 == null) ? false : true;
    }

    /* renamed from: getMethod */
    private static java.lang.reflect.Method m104360x24dcf3d7(java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr) {
        java.lang.reflect.Method method = null;
        if (!m104359x46a1c41b()) {
            return null;
        }
        try {
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) f55341xaa5327e.invoke((java.lang.Class) f55340x91826742.invoke(null, str), str2, clsArr);
            try {
                method2.setAccessible(true);
                return method2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                method = method2;
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th.getMessage());
                return method;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: invokeMethod */
    public static java.lang.Object m104361xd8c5c779(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method m104360x24dcf3d7 = m104360x24dcf3d7(str, str2, clsArr);
            if (m104360x24dcf3d7 != null) {
                return m104360x24dcf3d7.invoke(obj, objArr);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6.getMessage());
            return null;
        }
    }
}
