package ah;

/* loaded from: classes7.dex */
public class a implements ah.c {
    @Override // ah.c
    public java.lang.String a(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        g8.g.f269409a.d("MagicBrush.Util", "hy: try find lib path " + libName + " with dummy imp", new java.lang.Object[0]);
        return "";
    }

    @Override // ah.c
    public void loadLibrary(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        g8.g.f269409a.d("MagicBrush.Util", "System.loadLibrary " + libName + " null", new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(libName);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/magicbrush/utils/Util", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/magicbrush/utils/Util", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
