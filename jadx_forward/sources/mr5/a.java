package mr5;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f412442a = 0;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("httpdns");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/msdk/dns/base/jni/JniWrapper", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/msdk/dns/base/jni/JniWrapper", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
            or5.b.e("Load dns so failed", new java.lang.Object[0]);
        }
    }
}
