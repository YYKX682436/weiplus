package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.art;

/* renamed from: com.tencent.matrix.hook.art.RuntimeVerifyMute */
/* loaded from: classes12.dex */
public final class C4649xf4b2680a {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.art.C4649xf4b2680a f134170c = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.art.C4649xf4b2680a();

    /* renamed from: a, reason: collision with root package name */
    public xh.d f134171a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f134172b = false;

    /* renamed from: nativeInstall */
    private static native boolean m40874x3ba57584();

    public boolean a() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            if (!this.f134172b) {
                try {
                    xh.d dVar = this.f134171a;
                    if (dVar != null) {
                        dVar.mo77743xeb57c8f5("matrix-hookcommon");
                        this.f134171a.mo77743xeb57c8f5("matrix-artmisc");
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
                    this.f134172b = true;
                } catch (java.lang.Throwable th6) {
                    oj.j.d("Matrix.RuntimeVerifyMute", th6, "Fail to load native library.", new java.lang.Object[0]);
                    this.f134172b = false;
                }
                z17 = this.f134172b;
            }
        }
        if (z17) {
            return m40874x3ba57584();
        }
        return false;
    }
}
