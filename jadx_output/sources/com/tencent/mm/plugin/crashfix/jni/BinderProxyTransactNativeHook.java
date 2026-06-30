package com.tencent.mm.plugin.crashfix.jni;

/* loaded from: classes7.dex */
public class BinderProxyTransactNativeHook {
    private static long BAD_BINDER_TIME_OUT = 1000;
    private static final int IDKEY_BAD_BINDER_MONITOR = 1435;
    private static final int ID_CLIENT_1S_KEY = 1;
    private static final int ID_KV_BAD_BINDER_MONITOR = 20494;
    private static final int ID_SERVER_1S_KEY = 2;
    private static final java.lang.String TAG = "MicroMsg.BadBinder";
    private static android.os.HandlerThread mBadBinderCheckHandlerThread;
    private static android.os.Handler mH;
    private byte _hellAccFlag_;

    public static native void calculateOffset();

    public static java.lang.Object execTransactBegin(java.lang.Class cls, int i17) {
        ux1.a aVar = new ux1.a(cls, i17);
        mH.postDelayed(aVar, BAD_BINDER_TIME_OUT);
        return aVar;
    }

    public static void execTransactEnd(java.lang.Object obj) {
        ux1.a aVar = (ux1.a) obj;
        mH.removeCallbacks(aVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - aVar.f431841e;
        if (currentTimeMillis > BAD_BINDER_TIME_OUT) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1435L, 2L, 1L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Class cls = aVar.f431840d;
            sb6.append(cls.getName());
            sb6.append("#");
            sb6.append(cls.getGenericSuperclass());
            sb6.append("#");
            sb6.append(aVar.f431842f);
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.e(TAG, aVar.hashCode() + "#exec_cost#" + currentTimeMillis + "#" + sb7);
            g0Var.d(ID_KV_BAD_BINDER_MONITOR, sb7, java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    public static native void hook(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    public static void init() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("BadBinder");
        mBadBinderCheckHandlerThread = handlerThread;
        handlerThread.start();
        mH = new android.os.Handler(mBadBinderCheckHandlerThread.getLooper());
    }

    public static java.lang.Object onTransactNativeBegin() {
        ux1.b bVar = new ux1.b();
        mH.postDelayed(bVar, BAD_BINDER_TIME_OUT);
        return bVar;
    }

    public static void onTransactNativeEnd(java.lang.Object obj) {
        ux1.b bVar = (ux1.b) obj;
        mH.removeCallbacks(bVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - bVar.f431843d;
        if (currentTimeMillis > BAD_BINDER_TIME_OUT) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1435L, 1L, 1L);
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String str = "";
            if (stackTrace != null) {
                for (int i17 = 0; i17 < stackTrace.length; i17++) {
                    str = android.text.TextUtils.isEmpty(str) ? stackTrace[i17].toString() : str + "\n" + stackTrace[i17].toString();
                }
            }
            com.tencent.mars.xlog.Log.e(TAG, bVar.hashCode() + "#send_cost#" + currentTimeMillis + "#" + str);
        }
    }
}
