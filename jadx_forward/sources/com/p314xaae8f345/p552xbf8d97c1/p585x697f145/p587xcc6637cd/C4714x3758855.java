package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd;

/* renamed from: com.tencent.matrix.trace.tracer.StackTracer */
/* loaded from: classes12.dex */
public class C4714x3758855 extends kj.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f134553i = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(2);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134554e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134555f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134556g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f134557h;

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
    public C4714x3758855(ej.c cVar) {
        this(1048576, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
        cVar.getClass();
        boolean z17 = this.f134554e;
        this.f134554e = false;
    }

    /* renamed from: nativeDump */
    private native boolean m41291xb8ff1aab(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeInit */
    public native boolean m41292xb90145c7(java.lang.Thread thread, long j17, int i17, int i18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProcessBackground */
    public native void m41293x33271cde();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProcessForeground */
    public native void m41294xf8d730f3();

    /* renamed from: onStop */
    private void m41295xc39f8281() {
        oj.j.c("StackTracer", "StackTracer has exited.", new java.lang.Object[0]);
    }

    @Override // kj.g0, ei.a
    public void a(boolean z17) {
        if (z17) {
            m41294xf8d730f3();
        } else {
            m41293x33271cde();
        }
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        if (this.f134554e) {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                ((kj.b0) this.f134557h).run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(this.f134557h);
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.a(this);
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        m41296x360802();
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.HashSet hashSet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134271t;
        synchronized (hashSet) {
            hashSet.remove(this);
        }
    }

    public boolean k(java.lang.String str) {
        return m41291xb8ff1aab(str);
    }

    /* renamed from: stop */
    public native void m41296x360802();

    public C4714x3758855(int i17, long j17) {
        this.f134557h = new kj.b0(this);
        java.lang.String property = java.lang.System.getProperty("java.vm.version");
        this.f134554e = android.os.Build.VERSION.SDK_INT <= 33 && (property != null && property.startsWith("2"));
        long j18 = f134553i;
        if (j17 < j18) {
            oj.j.f("StackTracer", "IntervalUs(%d) should not less than %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            this.f134555f = j18;
        } else {
            this.f134555f = j17;
        }
        this.f134556g = i17;
    }
}
