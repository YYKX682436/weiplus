package ny5;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ny5.d f423011a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f423012b;

    static {
        ny5.d dVar = new ny5.d();
        f423011a = dVar;
        dVar.a();
    }

    public final boolean a() {
        if (!f423012b) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("singreverb");
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singreverb/SingReverbContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tme/karaoke/lib_singreverb/SingReverbContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                f423012b = true;
            } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError unused) {
            }
        }
        return f423012b;
    }
}
