package k91;

/* loaded from: classes7.dex */
public class x4 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f387354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f387355b;

    public x4(k91.y4 y4Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.lang.Runnable runnable) {
        this.f387354a = concurrentLinkedQueue;
        this.f387355b = runnable;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        this.f387354a.addAll((java.util.List) obj);
        this.f387355b.run();
    }
}
