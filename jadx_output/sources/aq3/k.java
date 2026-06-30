package aq3;

/* loaded from: classes12.dex */
public final class k implements ku5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq3.l f13181a;

    public k(aq3.l lVar) {
        this.f13181a = lVar;
    }

    @Override // ku5.n
    public void a(java.lang.Thread thread, java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("ThreadPool.Profiler", "[onInterrupt] name=" + name + " id=" + j17);
    }

    @Override // ku5.n
    public void b(java.lang.Thread thread, java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("ThreadPool.Profiler", "[onThreadExit] name=" + name + " id=" + j17);
        this.f13181a.f13183e.decrementAndGet();
    }

    @Override // ku5.n
    public void c(java.lang.Thread thread, java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("ThreadPool.Profiler", "[onThreadStart] name=" + name + " id=" + j17);
        this.f13181a.f13183e.incrementAndGet();
    }
}
