package p5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final p5.f f433504c = new p5.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f433505a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f433506b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    public f() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(java.util.Locale.US).contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) {
            p5.c cVar = p5.c.f433499b;
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = new java.util.concurrent.ThreadPoolExecutor(p5.c.f433500c, p5.c.f433501d, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = threadPoolExecutor2;
        } else {
            threadPoolExecutor = java.util.concurrent.Executors.newCachedThreadPool();
        }
        this.f433505a = threadPoolExecutor;
        java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.f433506b = new p5.e(null);
    }
}
