package com.tencent.mm.plugin.crashfix.jni;

/* loaded from: classes7.dex */
public class JNIEnvNewWeakGlobalRefHook {
    private byte _hellAccFlag_;

    public static native void calculateOffset();

    public static native void hook(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    public static void init() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
