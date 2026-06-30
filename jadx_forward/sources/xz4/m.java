package xz4;

/* loaded from: classes7.dex */
public class m extends ku5.f {
    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
        xz4.j jVar;
        xz4.c cVar;
        if ((runnable instanceof xz4.j) && (cVar = (jVar = (xz4.j) runnable).f539809d) != null && cVar.f539786d != null) {
            xz4.d a17 = xz4.d.a();
            java.lang.String str = jVar.f539809d.f539786d.f539810a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f539800a;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "remove download task");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "afterExecute");
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return runnable instanceof xz4.c ? new xz4.j(runnable, obj, (xz4.c) runnable) : super.newTaskFor(runnable, obj);
    }

    @Override // ku5.f
    public void q() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xz4.d.a().f539800a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        super.q();
    }
}
