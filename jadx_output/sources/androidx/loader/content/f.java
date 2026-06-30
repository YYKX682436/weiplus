package androidx.loader.content;

/* loaded from: classes7.dex */
public final class f implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f11676d = new java.util.concurrent.atomic.AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "ModernAsyncTask #" + this.f11676d.getAndIncrement());
    }
}
