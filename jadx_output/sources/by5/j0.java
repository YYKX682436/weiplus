package by5;

/* loaded from: classes9.dex */
public abstract class j0 {
    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        return b(obj, str, null, new java.lang.Object[0]);
    }

    public static java.lang.Object b(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            java.lang.reflect.Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            if (objArr.length == 0) {
                objArr = null;
            }
            return method.invoke(obj, objArr);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("ReflectionUtils", "invokeInstance, error", th6);
            return null;
        }
    }

    public static java.lang.Object c(java.lang.String str, java.lang.String str2) {
        try {
            return java.lang.Class.forName(str).getMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("ReflectionUtils", "invokeStatic, error", th6);
            return null;
        }
    }
}
