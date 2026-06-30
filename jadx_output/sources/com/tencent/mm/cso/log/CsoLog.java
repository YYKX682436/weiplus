package com.tencent.mm.cso.log;

/* loaded from: classes.dex */
public class CsoLog {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("cso.log");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/cso/log/CsoLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/cso/log/CsoLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native long getLogEnginePointer();

    public static native boolean startXLogEngine(java.lang.String str);
}
