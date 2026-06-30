package ik1;

/* loaded from: classes2.dex */
public abstract class e0 {
    public static java.lang.Object a(java.lang.Class cls, java.lang.String str, java.lang.Object obj, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("instance cannot be null");
        }
        java.lang.Class<?> cls2 = obj.getClass();
        java.lang.reflect.Method method = null;
        while (cls2 != null) {
            try {
                try {
                    method = cls2.getDeclaredMethod(str, clsArr);
                } catch (java.lang.Exception unused) {
                    if (cls == cls2) {
                        try {
                            method = cls2.getDeclaredMethod(str, clsArr);
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            } finally {
                cls2.getSuperclass();
            }
        }
        if (method == null) {
            return null;
        }
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReflectUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
