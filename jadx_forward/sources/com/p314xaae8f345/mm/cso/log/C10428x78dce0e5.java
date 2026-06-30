package com.p314xaae8f345.mm.cso.log;

/* renamed from: com.tencent.mm.cso.log.CsoLog */
/* loaded from: classes.dex */
public class C10428x78dce0e5 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("cso.log");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/cso/log/CsoLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/cso/log/CsoLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: getLogEnginePointer */
    public static native long m43626x5620902d();

    /* renamed from: startXLogEngine */
    public static native boolean m43627xc7433b10(java.lang.String str);
}
