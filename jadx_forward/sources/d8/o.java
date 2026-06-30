package d8;

/* loaded from: classes7.dex */
public enum o {
    INSTANCE;


    /* renamed from: g, reason: collision with root package name */
    public static final int f308445g = java.lang.Runtime.getRuntime().availableProcessors() + 1;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f308447d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f308448e;

    o() {
        this.f308447d = null;
        this.f308448e = null;
        int max = java.lang.Math.max(f308445g, 5);
        int max2 = java.lang.Math.max(max / 2, 4);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.f308447d = new java.util.concurrent.ThreadPoolExecutor(1, max2, 500L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(), new d8.m(this));
        this.f308448e = new java.util.concurrent.ThreadPoolExecutor(max - 1, max, 500L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(), new d8.n(this));
    }
}
