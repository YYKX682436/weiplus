package c8;

/* loaded from: classes12.dex */
public final class i implements c8.e {
    public void a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/getkeepsafe/relinker/SystemLibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/getkeepsafe/relinker/SystemLibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public java.lang.String b(java.lang.String str) {
        return (str.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH) && str.endsWith(".so")) ? str : java.lang.System.mapLibraryName(str);
    }
}
