package com.tencent.matrix.hook.art;

/* loaded from: classes12.dex */
public final class RuntimeVerifyMute {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.matrix.hook.art.RuntimeVerifyMute f52637c = new com.tencent.matrix.hook.art.RuntimeVerifyMute();

    /* renamed from: a, reason: collision with root package name */
    public xh.d f52638a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52639b = false;

    private static native boolean nativeInstall();

    public boolean a() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            if (!this.f52639b) {
                try {
                    xh.d dVar = this.f52638a;
                    if (dVar != null) {
                        dVar.loadLibrary("matrix-hookcommon");
                        this.f52638a.loadLibrary("matrix-artmisc");
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add("matrix-hookcommon");
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                        yj0.a.f(obj, "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add("matrix-artmisc");
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        java.lang.System.loadLibrary((java.lang.String) arrayList2.get(0));
                        yj0.a.f(obj2, "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    }
                    this.f52639b = true;
                } catch (java.lang.Throwable th6) {
                    oj.j.d("Matrix.RuntimeVerifyMute", th6, "Fail to load native library.", new java.lang.Object[0]);
                    this.f52639b = false;
                }
                z17 = this.f52639b;
            }
        }
        if (z17) {
            return nativeInstall();
        }
        return false;
    }
}
