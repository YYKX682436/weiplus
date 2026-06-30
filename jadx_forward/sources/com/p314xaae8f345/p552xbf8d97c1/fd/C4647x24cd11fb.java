package com.p314xaae8f345.p552xbf8d97c1.fd;

/* renamed from: com.tencent.matrix.fd.FDDumpBridge */
/* loaded from: classes12.dex */
public class C4647x24cd11fb {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f134164a;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("matrix-fd");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f134164a = true;
        } catch (java.lang.Throwable th6) {
            oj.j.d("FDDumpBridge", th6, "", new java.lang.Object[0]);
            f134164a = false;
        }
    }

    /* renamed from: getFDLimit */
    public static native int m40864xc9f2bd87();

    /* renamed from: getFdPathNameNative */
    public static native java.lang.String m40865xd0b3945b(java.lang.String str);

    /* renamed from: getInodesFreeCount */
    public static native long m40866x102958c5();

    /* renamed from: getInodesTotalCount */
    public static native long m40867x1a595da9();

    /* renamed from: testOverflow */
    public static native void m40868x4a25aab4();
}
