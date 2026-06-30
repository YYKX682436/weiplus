package a5;

/* loaded from: classes12.dex */
public class b implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f1364d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1365e;

    public b(a5.d dVar, boolean z17) {
        this.f1365e = z17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, (this.f1365e ? "WM.task-" : "androidx.work-") + this.f1364d.incrementAndGet());
    }
}
