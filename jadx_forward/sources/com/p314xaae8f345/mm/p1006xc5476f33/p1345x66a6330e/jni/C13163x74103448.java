package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.BinderProxyTransactNativeHook */
/* loaded from: classes7.dex */
public class C13163x74103448 {

    /* renamed from: BAD_BINDER_TIME_OUT */
    private static long f35431x749ad157 = 1000;

    /* renamed from: IDKEY_BAD_BINDER_MONITOR */
    private static final int f35432x1f9ad01a = 1435;

    /* renamed from: ID_CLIENT_1S_KEY */
    private static final int f35433x40c08192 = 1;

    /* renamed from: ID_KV_BAD_BINDER_MONITOR */
    private static final int f35434x36bda26f = 20494;

    /* renamed from: ID_SERVER_1S_KEY */
    private static final int f35435x61d5ef1a = 2;
    private static final java.lang.String TAG = "MicroMsg.BadBinder";

    /* renamed from: mBadBinderCheckHandlerThread */
    private static android.os.HandlerThread f35436x2eb5918e;
    private static android.os.Handler mH;

    /* renamed from: _hellAccFlag_ */
    private byte f35437x7f11beae;

    /* renamed from: calculateOffset */
    public static native void m54606xb4c6af99();

    /* renamed from: execTransactBegin */
    public static java.lang.Object m54607xa3e710ce(java.lang.Class cls, int i17) {
        ux1.a aVar = new ux1.a(cls, i17);
        mH.postDelayed(aVar, f35431x749ad157);
        return aVar;
    }

    /* renamed from: execTransactEnd */
    public static void m54608x49f5e640(java.lang.Object obj) {
        ux1.a aVar = (ux1.a) obj;
        mH.removeCallbacks(aVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - aVar.f513374e;
        if (currentTimeMillis > f35431x749ad157) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1435L, 2L, 1L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Class cls = aVar.f513373d;
            sb6.append(cls.getName());
            sb6.append("#");
            sb6.append(cls.getGenericSuperclass());
            sb6.append("#");
            sb6.append(aVar.f513375f);
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, aVar.hashCode() + "#exec_cost#" + currentTimeMillis + "#" + sb7);
            g0Var.d(f35434x36bda26f, sb7, java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: hook */
    public static native void m54609x30f523(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    /* renamed from: init */
    public static void m54610x316510() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("BadBinder");
        f35436x2eb5918e = handlerThread;
        handlerThread.start();
        mH = new android.os.Handler(f35436x2eb5918e.getLooper());
    }

    /* renamed from: onTransactNativeBegin */
    public static java.lang.Object m54611xf5b4b329() {
        ux1.b bVar = new ux1.b();
        mH.postDelayed(bVar, f35431x749ad157);
        return bVar;
    }

    /* renamed from: onTransactNativeEnd */
    public static void m54612x37ee635b(java.lang.Object obj) {
        ux1.b bVar = (ux1.b) obj;
        mH.removeCallbacks(bVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - bVar.f513376d;
        if (currentTimeMillis > f35431x749ad157) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1435L, 1L, 1L);
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String str = "";
            if (stackTrace != null) {
                for (int i17 = 0; i17 < stackTrace.length; i17++) {
                    str = android.text.TextUtils.isEmpty(str) ? stackTrace[i17].toString() : str + "\n" + stackTrace[i17].toString();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, bVar.hashCode() + "#send_cost#" + currentTimeMillis + "#" + str);
        }
    }
}
