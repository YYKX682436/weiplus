package com.tencent.matrix.trace.tracer;

/* loaded from: classes12.dex */
public class StackTracer extends kj.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f53020i = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(2);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53021e;

    /* renamed from: f, reason: collision with root package name */
    public final long f53022f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53023g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f53024h;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("matrix-stack-tracer");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/StackTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/StackTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StackTracer(ej.c cVar) {
        this(1048576, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
        cVar.getClass();
        boolean z17 = this.f53021e;
        this.f53021e = false;
    }

    private native boolean nativeDump(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeInit(java.lang.Thread thread, long j17, int i17, int i18);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onProcessBackground();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onProcessForeground();

    private void onStop() {
        oj.j.c("StackTracer", "StackTracer has exited.", new java.lang.Object[0]);
    }

    @Override // kj.g0, ei.a
    public void a(boolean z17) {
        if (z17) {
            onProcessForeground();
        } else {
            onProcessBackground();
        }
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        if (this.f53021e) {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                ((kj.b0) this.f53024h).run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(this.f53024h);
            }
            com.tencent.matrix.lifecycle.owners.f0.f52742x.a(this);
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        stop();
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.HashSet hashSet = com.tencent.matrix.lifecycle.owners.f0.f52738t;
        synchronized (hashSet) {
            hashSet.remove(this);
        }
    }

    public boolean k(java.lang.String str) {
        return nativeDump(str);
    }

    public native void stop();

    public StackTracer(int i17, long j17) {
        this.f53024h = new kj.b0(this);
        java.lang.String property = java.lang.System.getProperty("java.vm.version");
        this.f53021e = android.os.Build.VERSION.SDK_INT <= 33 && (property != null && property.startsWith("2"));
        long j18 = f53020i;
        if (j17 < j18) {
            oj.j.f("StackTracer", "IntervalUs(%d) should not less than %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            this.f53022f = j18;
        } else {
            this.f53022f = j17;
        }
        this.f53023g = i17;
    }
}
