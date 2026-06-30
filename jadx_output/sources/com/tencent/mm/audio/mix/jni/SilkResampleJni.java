package com.tencent.mm.audio.mix.jni;

/* loaded from: classes13.dex */
public class SilkResampleJni {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechataudiosilk");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int clearResample(java.lang.String str);

    public static native int clearResampleAll();

    public static native int initResample(java.lang.String str, int i17, int i18);

    public static native int resamplePcm(java.lang.String str, int i17, int i18, short[] sArr, int i19, short[] sArr2);
}
