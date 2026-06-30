package com.tencent.matrix.fd;

/* loaded from: classes12.dex */
public class FDDumpBridge {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f52631a;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("matrix-fd");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f52631a = true;
        } catch (java.lang.Throwable th6) {
            oj.j.d("FDDumpBridge", th6, "", new java.lang.Object[0]);
            f52631a = false;
        }
    }

    public static native int getFDLimit();

    public static native java.lang.String getFdPathNameNative(java.lang.String str);

    public static native long getInodesFreeCount();

    public static native long getInodesTotalCount();

    public static native void testOverflow();
}
