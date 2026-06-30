package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook */
/* loaded from: classes7.dex */
public class C13166x581afc23 {

    /* renamed from: _hellAccFlag_ */
    private byte f35448x7f11beae;

    /* renamed from: calculateOffset */
    public static native void m54624xb4c6af99();

    /* renamed from: hook */
    public static native void m54625x30f523(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    /* renamed from: init */
    public static void m54626x316510() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("systemcrashprotect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
