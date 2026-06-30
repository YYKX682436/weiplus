package aw1;

/* loaded from: classes7.dex */
public final class g0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f14521d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f14522e;

    public g0(java.lang.String prefix) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        this.f14521d = prefix;
        this.f14522e = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        return new java.lang.Thread(r17, this.f14521d + '-' + this.f14522e.incrementAndGet());
    }
}
