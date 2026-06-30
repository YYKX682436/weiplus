package oy5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final oy5.f f431626a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f431627b;

    static {
        oy5.f fVar = new oy5.f();
        f431626a = fVar;
        fVar.a();
    }

    public final boolean a() {
        if (!f431627b) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("singscore");
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singscore/SingScoreContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tme/karaoke/lib_singscore/SingScoreContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                f431627b = true;
            } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError unused) {
            }
        }
        return f431627b;
    }
}
