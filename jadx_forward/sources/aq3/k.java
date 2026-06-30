package aq3;

/* loaded from: classes12.dex */
public final class k implements ku5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq3.l f94714a;

    public k(aq3.l lVar) {
        this.f94714a = lVar;
    }

    @Override // ku5.n
    public void a(java.lang.Thread thread, java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Profiler", "[onInterrupt] name=" + name + " id=" + j17);
    }

    @Override // ku5.n
    public void b(java.lang.Thread thread, java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Profiler", "[onThreadExit] name=" + name + " id=" + j17);
        this.f94714a.f94716e.decrementAndGet();
    }

    @Override // ku5.n
    public void c(java.lang.Thread thread, java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Profiler", "[onThreadStart] name=" + name + " id=" + j17);
        this.f94714a.f94716e.incrementAndGet();
    }
}
