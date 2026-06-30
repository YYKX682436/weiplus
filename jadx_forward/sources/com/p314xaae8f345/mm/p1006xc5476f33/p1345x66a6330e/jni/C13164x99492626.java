package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately */
/* loaded from: classes7.dex */
public class C13164x99492626 {

    /* renamed from: MAX_FIND_CNT */
    private static final int f35438x2361d25e = 1000;
    private static final java.lang.String TAG = "BitmapReleaseImmediately";

    /* renamed from: bitmapmNativePtr */
    private static java.lang.reflect.Field f35439x681b2bd9;

    /* renamed from: cleanerClean */
    private static java.lang.reflect.Method f35440xa117f333;

    /* renamed from: cleanerFirst */
    private static java.lang.reflect.Field f35441xa1410f9a;

    /* renamed from: cleanerNext */
    private static java.lang.reflect.Field f35442xec7108c9;

    /* renamed from: cleanerPrev */
    private static java.lang.reflect.Field f35443xec722009;

    /* renamed from: getNativeInstanceMethod */
    private static java.lang.reflect.Method f35444x61c23243;

    /* renamed from: isHookSucc */
    private static boolean f35445xb77ad14f;
    private static java.util.Map<java.lang.Long, java.lang.ref.WeakReference<android.graphics.Bitmap>> map;

    /* renamed from: referenceGetReferent */
    private static java.lang.reflect.Method f35446x5d350596;

    /* renamed from: _hellAccFlag_ */
    private byte f35447x7f11beae;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        f35444x61c23243 = null;
        map = new java.util.concurrent.ConcurrentHashMap();
        f35445xb77ad14f = false;
    }

    /* renamed from: fastRelease */
    public static void m54614x33f3080b(long j17) {
        java.lang.ref.WeakReference<android.graphics.Bitmap> remove;
        android.graphics.Bitmap bitmap;
        if (!f35445xb77ad14f || (remove = map.remove(java.lang.Long.valueOf(j17))) == null || (bitmap = remove.get()) == null) {
            return;
        }
        try {
            java.lang.Object obj = f35441xa1410f9a.get(null);
            java.lang.Object obj2 = obj;
            int i17 = 0;
            while (true) {
                java.lang.Object invoke = f35446x5d350596.invoke(obj2, new java.lang.Object[0]);
                if (!(invoke instanceof android.graphics.Bitmap) || invoke != bitmap) {
                    obj2 = f35442xec7108c9.get(obj2);
                    if (obj2 == obj) {
                        break;
                    }
                    i17++;
                    if (i17 >= 1000) {
                        java.lang.Object[] objArr = new java.lang.Object[0];
                        if (ux1.d.f513377a != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "what???", objArr);
                        }
                    }
                } else {
                    ux1.d.a(TAG, "find it %d! clean!", java.lang.Integer.valueOf(invoke.hashCode()));
                    f35440xa117f333.invoke(obj2, new java.lang.Object[0]);
                    f35439x681b2bd9.setLong(bitmap, 0L);
                    break;
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: hook */
    public static native void m54615x30f523(int i17, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4);

    /* renamed from: hook11 */
    public static native void m54616xb7c83e83(int i17, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, long j17);

    /* renamed from: init */
    private static boolean m54617x316510() {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/crashfix/jni/BitmapReleaseImmediately", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.recycle();
        try {
            java.lang.reflect.Field m54619x4855883d = m54619x4855883d(android.graphics.Bitmap.class, "mNativePtr");
            f35439x681b2bd9 = m54619x4855883d;
            m54619x4855883d.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Cleaner");
            java.lang.reflect.Field m54619x4855883d2 = m54619x4855883d(cls, "first");
            f35441xa1410f9a = m54619x4855883d2;
            m54619x4855883d2.setAccessible(true);
            java.lang.reflect.Field m54619x4855883d3 = m54619x4855883d(cls, "next");
            f35442xec7108c9 = m54619x4855883d3;
            m54619x4855883d3.setAccessible(true);
            java.lang.reflect.Field m54619x4855883d4 = m54619x4855883d(cls, "prev");
            f35443xec722009 = m54619x4855883d4;
            m54619x4855883d4.setAccessible(true);
            java.lang.reflect.Method m54620xce1bd1fe = m54620xce1bd1fe(cls, "clean", new java.lang.Class[0]);
            f35440xa117f333 = m54620xce1bd1fe;
            m54620xce1bd1fe.setAccessible(true);
            java.lang.reflect.Method m54620xce1bd1fe2 = m54620xce1bd1fe(java.lang.ref.Reference.class, "getReferent", new java.lang.Class[0]);
            f35446x5d350596 = m54620xce1bd1fe2;
            m54620xce1bd1fe2.setAccessible(true);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: recordBitmapPtr */
    public static void m54618xfa4e05ee(java.lang.Object obj) {
        if (f35445xb77ad14f) {
            try {
                if (f35444x61c23243 == null) {
                    f35444x61c23243 = m54620xce1bd1fe(android.graphics.Bitmap.class, "getNativeInstance", new java.lang.Class[0]);
                }
                if (obj instanceof android.graphics.Bitmap) {
                    long longValue = ((java.lang.Long) f35444x61c23243.invoke(obj, new java.lang.Object[0])).longValue();
                    if (longValue != 0) {
                        map.put(java.lang.Long.valueOf(longValue), new java.lang.ref.WeakReference<>((android.graphics.Bitmap) obj));
                    }
                }
            } catch (java.lang.Exception e17) {
                if (ux1.d.f513377a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getStackTrace().toString());
                }
            }
        }
    }

    /* renamed from: reflectField */
    private static java.lang.reflect.Field m54619x4855883d(java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Field) declaredMethod.invoke(cls, str);
    }

    /* renamed from: reflectMethod */
    private static java.lang.reflect.Method m54620xce1bd1fe(java.lang.Class cls, java.lang.Object... objArr) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Method) declaredMethod.invoke(cls, objArr);
    }

    /* renamed from: work */
    public static void m54621x37c711() {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        try {
            if (!m54617x316510()) {
                f35445xb77ad14f = false;
                return;
            }
            java.lang.Class cls = java.lang.Long.TYPE;
            java.lang.reflect.Method m54620xce1bd1fe = m54620xce1bd1fe(android.graphics.Bitmap.class, "nativeRecycle", new java.lang.Class[]{cls});
            java.lang.reflect.Method m54620xce1bd1fe2 = m54620xce1bd1fe(android.graphics.Bitmap.class, "nativeHasAlpha", new java.lang.Class[]{cls});
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 < 26 || i17 >= 29) {
                method = null;
            } else {
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                method = m54620xce1bd1fe(android.graphics.Bitmap.class, "nativeCreate", new java.lang.Class[]{int[].class, cls2, cls2, cls2, cls2, cls2, java.lang.Boolean.TYPE, float[].class, android.graphics.ColorSpace.Rgb.TransferParameters.class});
            }
            if (i17 < 29 || i17 > 30) {
                method2 = method;
            } else {
                java.lang.Class cls3 = java.lang.Integer.TYPE;
                method2 = m54620xce1bd1fe(android.graphics.Bitmap.class, "nativeCreate", new java.lang.Class[]{int[].class, cls3, cls3, cls3, cls3, cls3, java.lang.Boolean.TYPE, cls});
            }
            if (i17 >= 30) {
                ux1.d.a(TAG, ">= 30", new java.lang.Object[0]);
                java.lang.reflect.Field m54619x4855883d = m54619x4855883d(java.lang.reflect.Executable.class, "artMethod");
                m54619x4855883d.setAccessible(true);
                m54616xb7c83e83(i17, method2, m54620xce1bd1fe, m54620xce1bd1fe2, ((java.lang.Long) m54619x4855883d.get(m54620xce1bd1fe(com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13164x99492626.class, "hook11", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class, cls}))).longValue());
            } else {
                ux1.d.a(TAG, "< 30", new java.lang.Object[0]);
                m54615x30f523(i17, method2, m54620xce1bd1fe, m54620xce1bd1fe2, m54620xce1bd1fe(com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13164x99492626.class, "hook", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class}));
            }
            f35445xb77ad14f = true;
            ux1.d.a(TAG, "succ", new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            if (ux1.d.f513377a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getStackTrace().toString());
            }
            f35445xb77ad14f = false;
        }
    }
}
