package com.tencent.matrix.hook.memory;

/* loaded from: classes12.dex */
public final class GCSemiSpaceTrimmer {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer f52656h = new com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f52657i = java.util.regex.Pattern.compile("[^0-9]");

    /* renamed from: j, reason: collision with root package name */
    public static final long f52658j = java.util.concurrent.TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a, reason: collision with root package name */
    public xh.d f52659a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f52660b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public long f52661c = f52658j;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f52662d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f52663e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52664f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f52665g = new ai.a(this);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeInstall();

    private native boolean nativeIsCompatible();

    public final boolean b() {
        synchronized (this) {
            if (this.f52664f) {
                return true;
            }
            try {
                xh.d dVar = this.f52659a;
                if (dVar != null) {
                    dVar.loadLibrary("matrix-hookcommon");
                    this.f52659a.loadLibrary("matrix-memoryhook");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add("matrix-hookcommon");
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add("matrix-memoryhook");
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
                    yj0.a.f(obj2, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
                this.f52664f = true;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.GCSemiSpaceTrimmer", th6, "Fail to load native library.", new java.lang.Object[0]);
                this.f52664f = false;
            }
            return this.f52664f;
        }
    }

    public boolean c(float f17, long j17, android.os.Looper looper) {
        synchronized (this) {
            if (!b()) {
                oj.j.b("Matrix.GCSemiSpaceTrimmer", "Fail to load native library.", new java.lang.Object[0]);
                return false;
            }
            this.f52660b = f17;
            if (j17 > 0) {
                this.f52661c = j17;
            } else {
                if (j17 != 0) {
                    oj.j.b("Matrix.GCSemiSpaceTrimmer", "vmsizeSampleInterval cannot less than zero. (value: " + j17 + ")", new java.lang.Object[0]);
                    return false;
                }
                this.f52661c = f52658j;
            }
            if (looper != null) {
                this.f52663e = new android.os.Handler(looper);
            } else {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("Matrix.GCSST");
                this.f52662d = handlerThread;
                handlerThread.start();
                this.f52663e = new android.os.Handler(this.f52662d.getLooper());
            }
            this.f52663e.postDelayed(this.f52665g, this.f52661c);
            oj.j.c("Matrix.GCSemiSpaceTrimmer", "Installed, critcal_vmsize_ratio: %s, vmsize_sample_interval: %s", java.lang.Float.valueOf(f17), java.lang.Long.valueOf(j17));
            return true;
        }
    }

    public boolean d() {
        synchronized (this) {
            if (!b()) {
                return false;
            }
            return nativeIsCompatible();
        }
    }
}
