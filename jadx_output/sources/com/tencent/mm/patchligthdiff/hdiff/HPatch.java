package com.tencent.mm.patchligthdiff.hdiff;

/* loaded from: classes.dex */
public class HPatch {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("hpatchz");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/patchligthdiff/hdiff/HPatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/patchligthdiff/hdiff/HPatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int patch(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17);
}
