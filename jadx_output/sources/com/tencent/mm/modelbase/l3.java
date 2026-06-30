package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public abstract class l3 {
    public static com.tencent.mm.modelbase.f a(com.tencent.mm.modelbase.i iVar) {
        if (iVar == null) {
            throw new java.lang.IllegalArgumentException("Cant use NULL cgi instance");
        }
        com.tencent.mm.modelbase.f3 f3Var = com.tencent.mm.modelbase.z2.f70847b;
        com.tencent.mm.modelbase.r1 r1Var = f3Var == null ? null : ((gm0.n) f3Var).f273260a.f273288b;
        if (r1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            throw new java.lang.IllegalAccessError("Cant call this function in main thread");
        }
        if (r1Var.f70765e.a().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        iVar.l().h(new com.tencent.mm.modelbase.j3(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            return (com.tencent.mm.modelbase.f) atomicReference.get();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SynchronousCgiCall", e17, "semaphore await exp ", new java.lang.Object[0]);
            return null;
        }
    }

    public static com.tencent.mm.modelbase.f b(com.tencent.mm.modelbase.o oVar, long j17) {
        if (oVar == null) {
            throw new java.lang.IllegalArgumentException("Cant use NULL rr");
        }
        com.tencent.mm.modelbase.f3 f3Var = com.tencent.mm.modelbase.z2.f70847b;
        com.tencent.mm.modelbase.r1 r1Var = f3Var == null ? null : ((gm0.n) f3Var).f273260a.f273288b;
        if (r1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            throw new java.lang.IllegalAccessError("Cant call this function in main thread");
        }
        if (r1Var.f70765e.a().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.tencent.mm.modelbase.z2.d(oVar, new com.tencent.mm.modelbase.h3(atomicReference, countDownLatch), false);
        new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelbase.i3(atomicReference, countDownLatch), false).c(j17, j17);
        try {
            countDownLatch.await();
            return (com.tencent.mm.modelbase.f) atomicReference.get();
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SynchronousCgiCall", e17, "latch await exp ", new java.lang.Object[0]);
            return null;
        }
    }
}
