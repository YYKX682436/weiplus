package androidx.window.java.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;", "Landroidx/window/layout/WindowInfoTracker;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "consumer", "Lkotlinx/coroutines/flow/j;", "flow", "Ljz5/f0;", "addListener", "removeListener", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", "tracker", "Landroidx/window/layout/WindowInfoTracker;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Lkotlinx/coroutines/r2;", "consumerToJobMap", "Ljava/util/Map;", "<init>", "(Landroidx/window/layout/WindowInfoTracker;)V", "window-java_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class WindowInfoTrackerCallbackAdapter implements androidx.window.layout.WindowInfoTracker {
    private final java.util.Map<m3.a, kotlinx.coroutines.r2> consumerToJobMap;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final androidx.window.layout.WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(androidx.window.layout.WindowInfoTracker tracker) {
        kotlin.jvm.internal.o.g(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.consumerToJobMap = new java.util.LinkedHashMap();
    }

    private final <T> void addListener(java.util.concurrent.Executor executor, m3.a aVar, kotlinx.coroutines.flow.j jVar) {
        oz5.l g2Var;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                kotlinx.coroutines.p1 p1Var = executor instanceof kotlinx.coroutines.p1 ? (kotlinx.coroutines.p1) executor : null;
                if (p1Var == null || (g2Var = p1Var.f310564d) == null) {
                    g2Var = new kotlinx.coroutines.g2(executor);
                }
                this.consumerToJobMap.put(aVar, kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(g2Var), null, null, new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1(jVar, aVar, null), 3, null));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(m3.a aVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.r2 r2Var = this.consumerToJobMap.get(aVar);
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a consumer) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(executor, "executor");
        kotlin.jvm.internal.o.g(consumer, "consumer");
        addListener(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(m3.a consumer) {
        kotlin.jvm.internal.o.g(consumer, "consumer");
        removeListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public kotlinx.coroutines.flow.j windowLayoutInfo(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
