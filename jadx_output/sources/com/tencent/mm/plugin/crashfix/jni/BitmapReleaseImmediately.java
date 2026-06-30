package com.tencent.mm.plugin.crashfix.jni;

/* loaded from: classes7.dex */
public class BitmapReleaseImmediately {
    private static final int MAX_FIND_CNT = 1000;
    private static final java.lang.String TAG = "BitmapReleaseImmediately";
    private static java.lang.reflect.Field bitmapmNativePtr;
    private static java.lang.reflect.Method cleanerClean;
    private static java.lang.reflect.Field cleanerFirst;
    private static java.lang.reflect.Field cleanerNext;
    private static java.lang.reflect.Field cleanerPrev;
    private static java.lang.reflect.Method getNativeInstanceMethod;
    private static boolean isHookSucc;
    private static java.util.Map<java.lang.Long, java.lang.ref.WeakReference<android.graphics.Bitmap>> map;
    private static java.lang.reflect.Method referenceGetReferent;
    private byte _hellAccFlag_;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        getNativeInstanceMethod = null;
        map = new java.util.concurrent.ConcurrentHashMap();
        isHookSucc = false;
    }

    public static void fastRelease(long j17) {
        java.lang.ref.WeakReference<android.graphics.Bitmap> remove;
        android.graphics.Bitmap bitmap;
        if (!isHookSucc || (remove = map.remove(java.lang.Long.valueOf(j17))) == null || (bitmap = remove.get()) == null) {
            return;
        }
        try {
            java.lang.Object obj = cleanerFirst.get(null);
            java.lang.Object obj2 = obj;
            int i17 = 0;
            while (true) {
                java.lang.Object invoke = referenceGetReferent.invoke(obj2, new java.lang.Object[0]);
                if (!(invoke instanceof android.graphics.Bitmap) || invoke != bitmap) {
                    obj2 = cleanerNext.get(obj2);
                    if (obj2 == obj) {
                        break;
                    }
                    i17++;
                    if (i17 >= 1000) {
                        java.lang.Object[] objArr = new java.lang.Object[0];
                        if (ux1.d.f431844a != null) {
                            com.tencent.mars.xlog.Log.e(TAG, "what???", objArr);
                        }
                    }
                } else {
                    ux1.d.a(TAG, "find it %d! clean!", java.lang.Integer.valueOf(invoke.hashCode()));
                    cleanerClean.invoke(obj2, new java.lang.Object[0]);
                    bitmapmNativePtr.setLong(bitmap, 0L);
                    break;
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static native void hook(int i17, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4);

    public static native void hook11(int i17, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, long j17);

    private static boolean init() {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.recycle();
        try {
            java.lang.reflect.Field reflectField = reflectField(android.graphics.Bitmap.class, "mNativePtr");
            bitmapmNativePtr = reflectField;
            reflectField.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Cleaner");
            java.lang.reflect.Field reflectField2 = reflectField(cls, "first");
            cleanerFirst = reflectField2;
            reflectField2.setAccessible(true);
            java.lang.reflect.Field reflectField3 = reflectField(cls, "next");
            cleanerNext = reflectField3;
            reflectField3.setAccessible(true);
            java.lang.reflect.Field reflectField4 = reflectField(cls, "prev");
            cleanerPrev = reflectField4;
            reflectField4.setAccessible(true);
            java.lang.reflect.Method reflectMethod = reflectMethod(cls, "clean", new java.lang.Class[0]);
            cleanerClean = reflectMethod;
            reflectMethod.setAccessible(true);
            java.lang.reflect.Method reflectMethod2 = reflectMethod(java.lang.ref.Reference.class, "getReferent", new java.lang.Class[0]);
            referenceGetReferent = reflectMethod2;
            reflectMethod2.setAccessible(true);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void recordBitmapPtr(java.lang.Object obj) {
        if (isHookSucc) {
            try {
                if (getNativeInstanceMethod == null) {
                    getNativeInstanceMethod = reflectMethod(android.graphics.Bitmap.class, "getNativeInstance", new java.lang.Class[0]);
                }
                if (obj instanceof android.graphics.Bitmap) {
                    long longValue = ((java.lang.Long) getNativeInstanceMethod.invoke(obj, new java.lang.Object[0])).longValue();
                    if (longValue != 0) {
                        map.put(java.lang.Long.valueOf(longValue), new java.lang.ref.WeakReference<>((android.graphics.Bitmap) obj));
                    }
                }
            } catch (java.lang.Exception e17) {
                if (ux1.d.f431844a != null) {
                    com.tencent.mars.xlog.Log.e(TAG, e17.getStackTrace().toString());
                }
            }
        }
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Field) declaredMethod.invoke(cls, str);
    }

    private static java.lang.reflect.Method reflectMethod(java.lang.Class cls, java.lang.Object... objArr) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Method) declaredMethod.invoke(cls, objArr);
    }

    public static void work() {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        try {
            if (!init()) {
                isHookSucc = false;
                return;
            }
            java.lang.Class cls = java.lang.Long.TYPE;
            java.lang.reflect.Method reflectMethod = reflectMethod(android.graphics.Bitmap.class, "nativeRecycle", new java.lang.Class[]{cls});
            java.lang.reflect.Method reflectMethod2 = reflectMethod(android.graphics.Bitmap.class, "nativeHasAlpha", new java.lang.Class[]{cls});
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 < 26 || i17 >= 29) {
                method = null;
            } else {
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                method = reflectMethod(android.graphics.Bitmap.class, "nativeCreate", new java.lang.Class[]{int[].class, cls2, cls2, cls2, cls2, cls2, java.lang.Boolean.TYPE, float[].class, android.graphics.ColorSpace.Rgb.TransferParameters.class});
            }
            if (i17 < 29 || i17 > 30) {
                method2 = method;
            } else {
                java.lang.Class cls3 = java.lang.Integer.TYPE;
                method2 = reflectMethod(android.graphics.Bitmap.class, "nativeCreate", new java.lang.Class[]{int[].class, cls3, cls3, cls3, cls3, cls3, java.lang.Boolean.TYPE, cls});
            }
            if (i17 >= 30) {
                ux1.d.a(TAG, ">= 30", new java.lang.Object[0]);
                java.lang.reflect.Field reflectField = reflectField(java.lang.reflect.Executable.class, "artMethod");
                reflectField.setAccessible(true);
                hook11(i17, method2, reflectMethod, reflectMethod2, ((java.lang.Long) reflectField.get(reflectMethod(com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately.class, "hook11", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class, cls}))).longValue());
            } else {
                ux1.d.a(TAG, "< 30", new java.lang.Object[0]);
                hook(i17, method2, reflectMethod, reflectMethod2, reflectMethod(com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately.class, "hook", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class}));
            }
            isHookSucc = true;
            ux1.d.a(TAG, "succ", new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            if (ux1.d.f431844a != null) {
                com.tencent.mars.xlog.Log.e(TAG, e17.getStackTrace().toString());
            }
            isHookSucc = false;
        }
    }
}
