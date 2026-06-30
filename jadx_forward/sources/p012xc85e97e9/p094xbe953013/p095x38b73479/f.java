package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes7.dex */
public final class f implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f93209d = new java.util.concurrent.atomic.AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "ModernAsyncTask #" + this.f93209d.getAndIncrement());
    }
}
