package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public class j extends ku5.f {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n f271211v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n nVar, java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        super(str, i17, i18, blockingQueue);
        this.f271211v = nVar;
    }

    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
        if (!(runnable instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l lVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l) runnable;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n nVar = this.f271211v;
        ((java.util.concurrent.ConcurrentHashMap) nVar.f271225b).remove(lVar.f271214d.a());
        ((java.util.concurrent.ConcurrentHashMap) nVar.f271224a).remove(lVar.f271214d.a());
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        if (!(runnable instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l lVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l) runnable;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n nVar = this.f271211v;
        if (((java.util.concurrent.ConcurrentHashMap) nVar.f271225b).containsKey(lVar.f271214d.a())) {
            lVar.cancel(false);
            return;
        }
        java.util.Map map = nVar.f271225b;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar = lVar.f271214d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(kVar.a(), lVar);
        ((java.util.concurrent.ConcurrentHashMap) nVar.f271224a).remove(kVar.a());
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return runnable instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m ? new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l(runnable, obj, ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m) runnable).f271221d) : super.newTaskFor(runnable, obj);
    }

    @Override // ku5.f
    public void q() {
        ((java.util.concurrent.ConcurrentHashMap) this.f271211v.f271225b).clear();
        super.q();
    }
}
