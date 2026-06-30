package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01;

/* renamed from: com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer */
/* loaded from: classes12.dex */
public final class C4654xdeca3e1c {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4654xdeca3e1c f134189h = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4654xdeca3e1c();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f134190i = java.util.regex.Pattern.compile("[^0-9]");

    /* renamed from: j, reason: collision with root package name */
    public static final long f134191j = java.util.concurrent.TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a, reason: collision with root package name */
    public xh.d f134192a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f134193b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public long f134194c = f134191j;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f134195d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f134196e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134197f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f134198g = new ai.a(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeInstall */
    public native boolean m40926x3ba57584();

    /* renamed from: nativeIsCompatible */
    private native boolean m40927xa70d1155();

    public final boolean b() {
        synchronized (this) {
            if (this.f134197f) {
                return true;
            }
            try {
                xh.d dVar = this.f134192a;
                if (dVar != null) {
                    dVar.mo77743xeb57c8f5("matrix-hookcommon");
                    this.f134192a.mo77743xeb57c8f5("matrix-memoryhook");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add("matrix-hookcommon");
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add("matrix-memoryhook");
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
                    yj0.a.f(obj2, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
                this.f134197f = true;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.GCSemiSpaceTrimmer", th6, "Fail to load native library.", new java.lang.Object[0]);
                this.f134197f = false;
            }
            return this.f134197f;
        }
    }

    public boolean c(float f17, long j17, android.os.Looper looper) {
        synchronized (this) {
            if (!b()) {
                oj.j.b("Matrix.GCSemiSpaceTrimmer", "Fail to load native library.", new java.lang.Object[0]);
                return false;
            }
            this.f134193b = f17;
            if (j17 > 0) {
                this.f134194c = j17;
            } else {
                if (j17 != 0) {
                    oj.j.b("Matrix.GCSemiSpaceTrimmer", "vmsizeSampleInterval cannot less than zero. (value: " + j17 + ")", new java.lang.Object[0]);
                    return false;
                }
                this.f134194c = f134191j;
            }
            if (looper != null) {
                this.f134196e = new android.os.Handler(looper);
            } else {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("Matrix.GCSST");
                this.f134195d = handlerThread;
                handlerThread.start();
                this.f134196e = new android.os.Handler(this.f134195d.getLooper());
            }
            this.f134196e.postDelayed(this.f134198g, this.f134194c);
            oj.j.c("Matrix.GCSemiSpaceTrimmer", "Installed, critcal_vmsize_ratio: %s, vmsize_sample_interval: %s", java.lang.Float.valueOf(f17), java.lang.Long.valueOf(j17));
            return true;
        }
    }

    public boolean d() {
        synchronized (this) {
            if (!b()) {
                return false;
            }
            return m40927xa70d1155();
        }
    }
}
