package a8;

/* loaded from: classes.dex */
public class c implements a8.b {
    @Override // a8.b
    public boolean a(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/facebook/soloader/nativeloader/SystemDelegate", "loadLibrary", "(Ljava/lang/String;I)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/facebook/soloader/nativeloader/SystemDelegate", "loadLibrary", "(Ljava/lang/String;I)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        return true;
    }
}
