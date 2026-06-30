package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareReflectUtil */
/* loaded from: classes13.dex */
public class C26639xfeb4df20 {
    /* renamed from: expandFieldArray */
    public static void m104699x5d4b2fb9(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.reflect.Field m104703x183d66c1 = m104703x183d66c1(obj, str);
        java.lang.Object[] objArr2 = (java.lang.Object[]) m104703x183d66c1.get(obj);
        java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        java.lang.System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        java.lang.System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        m104703x183d66c1.set(obj, objArr3);
    }

    /* renamed from: findConstructor */
    public static java.lang.reflect.Constructor<?> m104701xf3d1ec81(java.lang.Object obj, java.lang.Class<?>... clsArr) {
        return m104700xf3d1ec81(obj.getClass(), clsArr);
    }

    /* renamed from: findField */
    public static java.lang.reflect.Field m104703x183d66c1(java.lang.Object obj, java.lang.String str) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: findMethod */
    public static java.lang.reflect.Method m104705xfb2fc3fa(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: getActivityThread */
    public static java.lang.Object m104706x60a4f2ef(android.content.Context context, java.lang.Class<?> cls) {
        if (cls == null) {
            try {
                cls = java.lang.Class.forName("android.app.ActivityThread");
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
        java.lang.reflect.Method method = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        java.lang.reflect.Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        java.lang.Object obj = field.get(context);
        java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: getValueOfStaticIntField */
    public static int m104707xd270966b(java.lang.Class<?> cls, java.lang.String str, int i17) {
        try {
            return m104702x183d66c1(cls, str).getInt(null);
        } catch (java.lang.Throwable unused) {
            return i17;
        }
    }

    /* renamed from: reduceFieldArray */
    public static void m104708x72843785(java.lang.Object obj, java.lang.String str, int i17) {
        if (i17 <= 0) {
            return;
        }
        java.lang.reflect.Field m104703x183d66c1 = m104703x183d66c1(obj, str);
        java.lang.Object[] objArr = (java.lang.Object[]) m104703x183d66c1.get(obj);
        int length = objArr.length - i17;
        if (length <= 0) {
            return;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), length);
        java.lang.System.arraycopy(objArr, i17, objArr2, 0, length);
        m104703x183d66c1.set(obj, objArr2);
    }

    /* renamed from: findConstructor */
    public static java.lang.reflect.Constructor<?> m104700xf3d1ec81(java.lang.Class<?> cls, java.lang.Class<?>... clsArr) {
        for (java.lang.Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                java.lang.reflect.Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new java.lang.NoSuchMethodException("Constructor with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + cls);
    }

    /* renamed from: findField */
    public static java.lang.reflect.Field m104702x183d66c1(java.lang.Class<?> cls, java.lang.String str) {
        for (java.lang.Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    /* renamed from: findMethod */
    public static java.lang.reflect.Method m104704xfb2fc3fa(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        while (cls != null) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + cls);
    }
}
