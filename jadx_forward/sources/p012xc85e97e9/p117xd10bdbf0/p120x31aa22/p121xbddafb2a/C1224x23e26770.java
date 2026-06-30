package p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;", "Landroidx/window/layout/WindowInfoTracker;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "consumer", "Lkotlinx/coroutines/flow/j;", "flow", "Ljz5/f0;", "addListener", "removeListener", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", "tracker", "Landroidx/window/layout/WindowInfoTracker;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Lkotlinx/coroutines/r2;", "consumerToJobMap", "Ljava/util/Map;", "<init>", "(Landroidx/window/layout/WindowInfoTracker;)V", "window-java_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter */
/* loaded from: classes14.dex */
public final class C1224x23e26770 implements p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a {
    private final java.util.Map<m3.a, p3325xe03a0797.p3326xc267989b.r2> consumerToJobMap;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a tracker;

    public C1224x23e26770(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a tracker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.consumerToJobMap = new java.util.LinkedHashMap();
    }

    /* renamed from: addListener */
    private final <T> void m8514x162a7075(java.util.concurrent.Executor executor, m3.a aVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar) {
        oz5.l g2Var;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                p3325xe03a0797.p3326xc267989b.p1 p1Var = executor instanceof p3325xe03a0797.p3326xc267989b.p1 ? (p3325xe03a0797.p3326xc267989b.p1) executor : null;
                if (p1Var == null || (g2Var = p1Var.f392097d) == null) {
                    g2Var = new p3325xe03a0797.p3326xc267989b.g2(executor);
                }
                this.consumerToJobMap.put(aVar, p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(g2Var), null, null, new p012xc85e97e9.p117xd10bdbf0.p120x31aa22.p121xbddafb2a.C1226x9cfd029b(jVar, aVar, null), 3, null));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: removeListener */
    private final void m8515xf1335d58(m3.a aVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.consumerToJobMap.get(aVar);
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: addWindowLayoutInfoListener */
    public final void m8516xd55f659d(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        m8514x162a7075(executor, consumer, this.tracker.mo8518x5c7bb08(activity));
    }

    /* renamed from: removeWindowLayoutInfoListener */
    public final void m8517xbfb02c80(m3.a consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        m8515xf1335d58(consumer);
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a
    /* renamed from: windowLayoutInfo */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j mo8518x5c7bb08(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return this.tracker.mo8518x5c7bb08(activity);
    }
}
