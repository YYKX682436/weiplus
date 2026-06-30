package com.p314xaae8f345.mm.p936x333261;

/* renamed from: com.tencent.mm.mmfg.MMFG */
/* loaded from: classes4.dex */
public class C11099x242a61 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("opencv_world");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("XNet");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("MMFG");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("MMFGJNI");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/mm/mmfg/MMFG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nGetImageHash */
    public static native java.lang.String m47822x512849e1(java.nio.Buffer buffer, int i17, int i18);

    /* renamed from: nGetImagePDQHash */
    public static native java.lang.String m47823xd3367df8(java.nio.Buffer buffer, int i17, int i18);

    /* renamed from: nInit */
    public static native long m47824x630f29e(java.lang.String str, java.lang.String str2);

    /* renamed from: nProcess */
    public static native float[] m47825xf386fe21(long j17, java.nio.Buffer buffer, int i17, int i18);

    /* renamed from: nRelease */
    public static native void m47826x46fb07b9(long j17);
}
