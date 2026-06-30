package com.p314xaae8f345.mm.p630x58d9bd6.mix.jni;

/* renamed from: com.tencent.mm.audio.mix.jni.SilkResampleJni */
/* loaded from: classes13.dex */
public class C5142xf133bb13 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechataudiosilk");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: clearResample */
    public static native int m43241xbee24f0a(java.lang.String str);

    /* renamed from: clearResampleAll */
    public static native int m43242x61ccde37();

    /* renamed from: initResample */
    public static native int m43243x72008acd(java.lang.String str, int i17, int i18);

    /* renamed from: resamplePcm */
    public static native int m43244xf12825fd(java.lang.String str, int i17, int i18, short[] sArr, int i19, short[] sArr2);
}
